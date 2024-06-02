package com.nkechinnaji.factorypatternapplication

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.nkechinnaji.factorypatternapplication.databinding.ActivityMainBinding
import com.nkechinnaji.factorypatternapplication.segments.IServer
import com.nkechinnaji.factorypatternapplication.segments.ServerFactory

class MainActivity : AppCompatActivity() {

    private lateinit var viewBinding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewBinding =  DataBindingUtil.setContentView(this, R.layout.activity_main)

        viewBinding.mailBtn.setOnClickListener {
            extracted("mail")
        }

        viewBinding.ftpBtn.setOnClickListener {
            extracted("ftp")
        }

        viewBinding.appBtn.setOnClickListener {
            extracted("app")
        }

        viewBinding.macBtn.setOnClickListener {
            extracted("other")
        }
    }

    private fun extracted(serverType : String) {
        val server: IServer = ServerFactory().getServer(serverType = serverType)
        Toast.makeText(this, "${server.resolve()}", Toast.LENGTH_LONG).show()
    }
}