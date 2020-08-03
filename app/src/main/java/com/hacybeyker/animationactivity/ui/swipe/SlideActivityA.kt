package com.hacybeyker.animationactivity.ui.swipe

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.hacybeyker.animationactivity.R
import com.hacybeyker.animationactivity.databinding.ActivitySlideABinding
import com.hacybeyker.animationactivity.ui.DATA

class SlideActivityA : AppCompatActivity() {

    private lateinit var binding: ActivitySlideABinding

    companion object {
        fun start(activity: Activity) {
            val intent = Intent(activity, SlideActivityA::class.java)
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
        binding = DataBindingUtil.setContentView(this, R.layout.activity_slide_a)
    }

    private fun getIntentData() {

    }

    private fun setUpView() {
        title = getString(R.string.swipe_a)
        binding.swipeButtonA.setOnClickListener { SlideActivityB.start(this, DATA) }
    }
}