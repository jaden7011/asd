package com.example.pip

import android.Manifest
import android.content.Context
import android.content.pm.PackageManager
import android.graphics.SurfaceTexture
import android.hardware.camera2.*
import android.os.Handler
import android.os.HandlerThread
import android.util.Log
import android.util.Size
import android.view.Surface
import android.view.TextureView
import androidx.core.content.ContextCompat

class CameraService(
    val context: Context,
    val textureView: TextureView
): Thread() {

    lateinit var mPreviewSize:Size
    lateinit var mCamerDevice:CameraDevice
    lateinit var mPreviewBuilder:CaptureRequest.Builder
    lateinit var mPreviewSession:CameraCaptureSession

    fun getBackFacingCameraID(cManager:CameraManager) : String?{
        try {
            for(id in cManager.cameraIdList) {
                val ch = cManager.getCameraCharacteristics(id)
                val cOrientation = ch[CameraCharacteristics.LENS_FACING]

                if(cOrientation == CameraCharacteristics.LENS_FACING_BACK)
                    return id
            }
        }catch (e:CameraAccessException){
            e.printStackTrace()
        }

        return null
    }

    fun openCamera(){
        val manager = context.getSystemService(Context.CAMERA_SERVICE) as CameraManager

        try {
            val id = getBackFacingCameraID(manager)
            val ch = manager.getCameraCharacteristics(id!!)
            val map = ch.get(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP)
            mPreviewSize = map!!.getOutputSizes<SurfaceTexture>(SurfaceTexture::class.java)[0]

            val permissionCamera = ContextCompat.checkSelfPermission(context,Manifest.permission.CAMERA)
            if(permissionCamera == PackageManager.PERMISSION_DENIED){

            }else{
                manager.openCamera(id,object : CameraDevice.StateCallback(){
                    override fun onOpened(camera: CameraDevice) {
                        mCamerDevice = camera
                        startPreview()
                    }

                    override fun onDisconnected(camera: CameraDevice) {
                        TODO("Not yet implemented")
                    }

                    override fun onError(camera: CameraDevice, error: Int) {
                        TODO("Not yet implemented")
                    }

                },null)
            }
        } catch (e:CameraAccessException){
            e.printStackTrace()
        }
    }

    fun startPreview(){
        if(mCamerDevice == null || !textureView.isAvailable || mPreviewSize == null) {
            Log.e("startPreview", "startPreview fail, return");
        }

        val texture = textureView.surfaceTexture

        if(null == texture) {
            Log.e("startPreview","texture is null, return");
            return;
        }

        texture.setDefaultBufferSize(mPreviewSize.width,mPreviewSize.height)
        val surface = Surface(texture)

        try {
            mPreviewBuilder = mCamerDevice.createCaptureRequest(CameraDevice.TEMPLATE_PREVIEW)
        }catch (e : CameraAccessException){e.printStackTrace()}
        mPreviewBuilder.addTarget(surface)

        try {
            mCamerDevice.createCaptureSession(listOf(surface),object : CameraCaptureSession.StateCallback(){
                override fun onConfigured(session: CameraCaptureSession) {
                    mPreviewSession=session
                    updatePreview()
                }
                override fun onConfigureFailed(session: CameraCaptureSession) {
                    TODO("Not yet implemented")
                }
            },null)
        }catch (e : CameraAccessException){e.printStackTrace()}

    }

    private fun updatePreview() {
        if(mCamerDevice == null)
            return

        mPreviewBuilder.set(CaptureRequest.CONTROL_MODE,CameraMetadata.CONTROL_MODE_AUTO)
        val thread = HandlerThread("CameraPreview")
        thread.start()
        val bHandler = Handler(thread.looper)

        try {
            mPreviewSession.setRepeatingRequest(mPreviewBuilder.build(),null,bHandler)
        }catch (e:CameraAccessException){e.printStackTrace()}
    }

    fun setSurfaceTextureListener(){
        textureView.surfaceTextureListener = object : TextureView.SurfaceTextureListener {
            override fun onSurfaceTextureSizeChanged(
                surface: SurfaceTexture,
                width: Int,
                height: Int
            ) {
                TODO("Not yet implemented")
            }

            override fun onSurfaceTextureUpdated(surface: SurfaceTexture) {
                TODO("Not yet implemented")
            }

            override fun onSurfaceTextureDestroyed(surface: SurfaceTexture): Boolean {
                return false
            }

            override fun onSurfaceTextureAvailable(
                surface: SurfaceTexture,
                width: Int,
                height: Int
            ) {
                openCamera()
            }

        }
    }

    fun onResume(){
        setSurfaceTextureListener()
    }

}