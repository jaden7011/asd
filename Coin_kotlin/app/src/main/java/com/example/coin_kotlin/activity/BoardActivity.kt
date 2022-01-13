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
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.coin_kotlin.R
import com.example.coin_kotlin.databinding.ActivityBoardBinding
import com.example.coin_kotlin.viewmodel.LiveData_Posts

class BoardActivity : AppCompatActivity() {

    public lateinit var binding:ActivityBoardBinding
    private val coin_name:String by lazy {
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
        binding = DataBindingUtil.setContentView(this,R.layout.activity_board)
        toolbar = findViewById(R.id.toolbar_board)
        Toolbar()
        livedataPostinfo = ViewModelProvider(this,LiveData_Posts.Factory(this)).get(LiveData_Posts::class.java)
        livedataPostinfo.Get_Candle_Posts(coin_name)
        livedataPostinfo.posts.observe(this, Observer {
//            if(it.size == 1) { // 차트인 null값만 들어있는 경우
//                Log.e("adssad","asdazzzzzd")
//            }
            livedataPostinfo.adapter.PostDiffUtil(it)
        })

    }

    fun Toolbar(){
        setSupportActionBar(toolbar)
        val actionBar: ActionBar? = supportActionBar
        actionBar?.run {
            setDisplayShowCustomEnabled(true)
            setDisplayShowTitleEnabled(false)
            setDisplayHomeAsUpEnabled(false)
            setHomeButtonEnabled(false)
//            setLogo(R.drawable.btc_background)
        }

        toolbar.setTitle(coin_name)
        toolbar.titleMarginStart = 3
        toolbar.setTitleTextColor(Color.WHITE)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.toolbar_menu,menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId){
            R.id.toolbar_main_write_post_btn -> {
                val intent = Intent(this,WriteActivity::class.java)
                intent.putExtra("coin_name",coin_name)
                startActivity(intent)
            }

            R.id.toolbar_main_search -> {
//                if(myAccount != null)
//                    Activity(SearchActivity.class,myAccount.getLocation());
            }

            R.id.toolbar_main_reset -> {
                livedataPostinfo.Get_Candle_Posts(coin_name)
            }

            R.id.back_btn -> {
                onBackPressed()
            }
        }
        return super.onOptionsItemSelected(item)
    }

}