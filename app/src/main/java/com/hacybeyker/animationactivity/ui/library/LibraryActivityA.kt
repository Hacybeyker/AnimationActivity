package com.hacybeyker.animationactivity.ui.library

import android.app.Activity
import android.content.Intent
import android.database.DatabaseUtils
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.hacybeyker.animationactivity.R
import com.hacybeyker.animationactivity.databinding.ActivityLibraryABinding
import com.hacybeyker.animationactivity.ui.DATA

class LibraryActivityA : AppCompatActivity() {

    lateinit var binding: ActivityLibraryABinding

    companion object {
        fun start(activity: Activity) {
            val intent = Intent(activity, LibraryActivityA::class.java)
            activity.startActivity(intent)
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setUpBinding()
        getIntentData()
        setUpView()
    }

    private fun setUpBinding() {
        binding = DataBindingUtil.setContentView(this, R.layout.activity_library_a)
    }

    private fun getIntentData() {

    }

    private fun setUpView() {
        title = getString(R.string.library_a)
        binding.libraryButtonA.setOnClickListener { LibraryActivityB.start(this, DATA) }
    }
}