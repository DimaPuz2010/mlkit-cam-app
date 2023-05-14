package com.aaa.scan_activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.camera.core.CameraSelector
import androidx.camera.core.ImageAnalysis
import androidx.camera.core.Preview
import androidx.camera.lifecycle.ProcessCameraProvider
import androidx.camera.view.PreviewView
import androidx.core.content.ContextCompat
import com.aaa.helpers.ImageAnalizer
import com.aaa.mlkit_cam_app.R
import com.google.common.util.concurrent.ListenableFuture

class ScanActivity : AppCompatActivity(){
    private var cameraProvider : ProcessCameraProvider? = null
    private lateinit var cameraFuture : ListenableFuture<ProcessCameraProvider>


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_camera)
        cameraFuture = ProcessCameraProvider.getInstance(this)
        cameraFuture.addListener({
            cameraProvider = cameraFuture.get()
            byPreview()
        }, ContextCompat.getMainExecutor(this))
    }

    private fun byPreview()
    {
        val preview = Preview.Builder().build()
        val surface = findViewById<PreviewView>(R.id.previewView)
        preview.setSurfaceProvider(surface.surfaceProvider)

        val cameraSelector = CameraSelector.Builder()
            .requireLensFacing(CameraSelector.LENS_FACING_BACK)
            .build()

        val analizer = ImageAnalysis.Builder()
            .setBackpressureStrategy(ImageAnalysis.STRATEGY_KEEP_ONLY_LATEST)
            .build()
        analizer.setAnalyzer(
            mainExecutor,
            ImageAnalizer()
        )
        cameraProvider?.bindToLifecycle(this, cameraSelector, preview, analizer)
    }
}