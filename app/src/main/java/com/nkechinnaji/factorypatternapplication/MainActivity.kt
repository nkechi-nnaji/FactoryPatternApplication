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
            getServerSolution("mail")
        }

        viewBinding.ftpBtn.setOnClickListener {
            getServerSolution("ftp")
        }

        viewBinding.appBtn.setOnClickListener {
            getServerSolution("app")
        }

        viewBinding.macBtn.setOnClickListener {
            getServerSolution("other")
        }
    }

    private fun getServerSolution(serverType : String) {
        val server: IServer = ServerFactory().getServer(serverType = serverType)
        Toast.makeText(this, "${server.resolve()}", Toast.LENGTH_LONG).show()
    }
}