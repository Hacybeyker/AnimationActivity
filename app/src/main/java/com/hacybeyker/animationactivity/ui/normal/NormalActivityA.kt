package com.hacybeyker.animationactivity.ui.normal

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.hacybeyker.animationactivity.R
import com.hacybeyker.animationactivity.databinding.ActivityNormalABinding
import com.hacybeyker.animationactivity.ui.DATA

class NormalActivityA : AppCompatActivity() {

    private lateinit var binding: ActivityNormalABinding

    companion object {
        fun start(activity: Activity) {
            val intent = Intent(activity, NormalActivityA::class.java)
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
        binding = ActivityNormalABinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    private fun getIntentData() {

    }

    private fun setUpView() {
        title = getString(R.string.normal_a)
        binding.normalButtonA.setOnClickListener { NormalActivityB.start(this, DATA) }
    }
}