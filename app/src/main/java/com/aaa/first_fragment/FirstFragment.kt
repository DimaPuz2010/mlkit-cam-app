package com.aaa.first_fragment

import android.Manifest
import android.content.Intent
import android.content.pm.PackageManager
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.activity.result.contract.ActivityResultContracts
import androidx.core.content.ContextCompat
import androidx.fragment.app.Fragment
import com.aaa.mlkit_cam_app.R
import com.aaa.scan_activity.ScanActivity

class FirstFragment : Fragment() {
    private val permitionLauncher = registerForActivityResult(
        ActivityResultContracts.RequestPermission(),
        { isGranted ->
            if (isGranted == true) {
                val intent = Intent(requireContext(), ScanActivity::class.java)
                startActivity(intent)
            }else
            {

            }
        }
    )

    private fun startScan()
    {
        val intent = Intent(requireContext(), ScanActivity::class.java)
        startActivity(intent)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.start_skan_fragment, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val button = view.findViewById<Button>(R.id.startButton)
        button.setOnClickListener() {
            val permission = ContextCompat.checkSelfPermission(
                requireContext(),
                Manifest.permission.CAMERA
            )
            if(permission == PackageManager.PERMISSION_GRANTED)
            {
                startScan()
            }else
            {
                permitionLauncher.launch(
                    Manifest.permission.CAMERA
                )
            }
        }
    }
}
