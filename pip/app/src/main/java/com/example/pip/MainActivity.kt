package com.example.pip

import android.app.PictureInPictureParams
import android.content.res.Configuration
import android.media.MediaPlayer
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Rational
import androidx.databinding.DataBindingUtil
import com.example.pip.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding:ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main)

        val Preview = CameraService(this,binding.textureView)
        Preview.onResume()

        binding.btn.setOnClickListener {
            minimize()
        }
    }

//    override fun onRequestPermissionsResult(
//        requestCode: Int,
//        permissions: Array<out String>,
//        grantResults: IntArray
//    ) {
//        super.onRequestPermissionsResult(requestCode, permissions, grantResults)
//
//        if(requestCode == REQUEST_CAMERA){
//
//        }
//    }

    fun minimize(){
        if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.O){
            val aspectRatio = Rational(binding.textureView.width,binding.textureView.height)
            val build = PictureInPictureParams.Builder()
                .setAspectRatio(aspectRatio).build()
            enterPictureInPictureMode(build)
        }
    }

    override fun onPictureInPictureModeChanged(isInPictureInPictureMode: Boolean, newConfig: Configuration?) {
        super.onPictureInPictureModeChanged(isInPictureInPictureMode, newConfig)

        if(isInPictureInPictureMode){

        }else{

        }
    }

}