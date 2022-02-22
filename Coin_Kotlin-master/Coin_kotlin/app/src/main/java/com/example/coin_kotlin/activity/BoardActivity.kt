package com.example.coin_kotlin.activity

import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import android.util.Log
import android.view.Menu
import android.view.MenuItem
import androidx.appcompat.app.ActionBar
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import androidx.core.content.ContextCompat
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.coin_kotlin.R
import com.example.coin_kotlin.databinding.ActivityBoardBinding
import com.example.coin_kotlin.info.User
import com.example.coin_kotlin.model.PreferenceManager
import com.example.coin_kotlin.model.Repository
import com.example.coin_kotlin.utility.Named.CHANGED
import com.example.coin_kotlin.utility.Named.DELETE
import com.example.coin_kotlin.utility.Named.FAVORIT_LIST
import com.example.coin_kotlin.viewmodel.LiveData_Posts
import com.google.firebase.auth.FirebaseAuth
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class BoardActivity : AppCompatActivity() {

    val auth = FirebaseAuth.getInstance().currentUser
    lateinit var binding: ActivityBoardBinding
    val coin_name: String by lazy {
        intent.extras?.getString("coin_name")!!
    }
    private lateinit var toolbar: Toolbar
    private lateinit var livedataPostinfo: LiveData_Posts

    override fun onRestart() {
        super.onRestart()
        livedataPostinfo.Get_Candle_Posts(coin_name)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_board)
        toolbar = findViewById(R.id.toolbar_board)
        Toolbar()
        livedataPostinfo =
            ViewModelProvider(this, LiveData_Posts.Factory(this))[LiveData_Posts::class.java]
        livedataPostinfo.Get_Candle_Posts(coin_name)
        livedataPostinfo.posts.observe(this, Observer {
            livedataPostinfo.adapter.PostDiffUtil(it)
        })
    }

    fun Toolbar() {
        setSupportActionBar(toolbar)
        val actionBar: ActionBar? = supportActionBar
        actionBar?.run {
            setDisplayShowCustomEnabled(true)
            setDisplayShowTitleEnabled(false)
            setDisplayHomeAsUpEnabled(false)
            setHomeButtonEnabled(false)
//            setLogo(bitmapDrawable)
        }

        toolbar.setTitle(coin_name)
        toolbar.titleMarginStart = 3
        toolbar.setTitleTextColor(Color.WHITE)
    }

    override fun onPrepareOptionsMenu(menu: Menu?): Boolean { //onCreateOptionsMenu 이후에 관심목록 확인 후 액션바의 별 모양 아이콘을 알맞게 바꿔줌
        val menuitem = menu?.findItem(R.id.toolbar_board_addfavorit)

        if (!PreferenceManager.getStringSet(this, FAVORIT_LIST)!!.contains(coin_name))
            menuitem?.icon = ContextCompat.getDrawable(this, android.R.drawable.star_big_off)
        else
            menuitem?.icon = ContextCompat.getDrawable(this, android.R.drawable.star_big_on)

        return super.onPrepareOptionsMenu(menu);
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.toolbar_menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.toolbar_board_write_post_btn -> {
                if(auth == null)
                    Toast("로그인이 필요합니다.")
                else{
                    val intent = Intent(this, WriteActivity::class.java)
                    intent.putExtra("coin_name", coin_name)
                    startActivity(intent)
                }
            }

            R.id.toolbar_board_addfavorit -> {
                if (!PreferenceManager.getStringSet(this, FAVORIT_LIST)!!.contains(coin_name)) {
                    item.icon = ContextCompat.getDrawable(this, android.R.drawable.star_big_on)
                    PreferenceManager.setStringSet(this, FAVORIT_LIST, coin_name)
                } else {
                    item.icon = ContextCompat.getDrawable(this, android.R.drawable.star_big_off)
                    PreferenceManager.removeSetElement(this, FAVORIT_LIST, coin_name)
                }
            }

            R.id.toolbar_board_search -> {
                startActivity(Intent(this,SearchActivity::class.java).run {
                    putExtra("coin_name",coin_name)
                })
            }

            R.id.toolbar_board_reset -> {
                livedataPostinfo.Get_Candle_Posts(coin_name)
                Toast("새로고침")
            }

            R.id.back_btn -> {
                onBackPressed()
            }
        }
        return super.onOptionsItemSelected(item)
    }

    fun Toast(str: String) {
        android.widget.Toast.makeText(this, str, android.widget.Toast.LENGTH_SHORT).show();
    }

}