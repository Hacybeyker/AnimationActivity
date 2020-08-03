package com.hacybeyker.animationactivity.ui.swipe

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.hacybeyker.animationactivity.R
import com.hacybeyker.animationactivity.databinding.ActivitySlideBBinding
import com.hacybeyker.animationactivity.ui.DEFAULT
import com.hacybeyker.animationactivity.ui.PARAMETER
import com.r0adkll.slidr.Slidr
import com.r0adkll.slidr.model.SlidrInterface

class SlideActivityB : AppCompatActivity() {

    private lateinit var binding: ActivitySlideBBinding
    private lateinit var parameter: String
    private lateinit var slide: SlidrInterface

    companion object {
        fun start(activity: Activity, parameter: String) {
            val intent = Intent(activity, SlideActivityB::class.java)
            intent.putExtra(PARAMETER, parameter)
            activity.startActivity(intent)
            activity.overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left)
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setUpBinding()
        getIntentData()
        setUpView()
    }

    private fun setUpBinding() {
        binding = DataBindingUtil.setContentView(this, R.layout.activity_slide_b)
    }

    private fun getIntentData() {
        val bundle = intent.extras
        bundle?.let {
            parameter = it.getString(PARAMETER, DEFAULT)
        }
    }

    private fun setUpView() {
        slide = Slidr.attach(this)
        slide.unlock()
        title = getString(R.string.swipe_b)
        binding.slideTextParameter.text = parameter
        binding.slideButtonB.setOnClickListener { finish() }
    }

    override fun finish() {
        super.finish()
        overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right)
    }
}