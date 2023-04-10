package com.example.dependency_injection

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    @Inject
    lateinit var main: Main

    @Inject
    lateinit var viewModel: MyViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        main.getName()
        viewModel.addUser(User(101, "Nitin"))
        viewModel.addUser(User(102, "dls"))
        viewModel.addUser(User(103, "ddfdf"))

        var data = viewModel.getUser(101)
        Toast.makeText(this, data.toString(), Toast.LENGTH_LONG).show()
    }
}