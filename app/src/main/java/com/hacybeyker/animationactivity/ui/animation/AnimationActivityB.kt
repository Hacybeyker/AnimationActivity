package com.hacybeyker.animationactivity.ui.animation

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.hacybeyker.animationactivity.R
import com.hacybeyker.animationactivity.databinding.ActivityAnimationBBinding
import com.hacybeyker.animationactivity.ui.DEFAULT
import com.hacybeyker.animationactivity.ui.PARAMETER

class AnimationActivityB : AppCompatActivity() {

    private lateinit var binding: ActivityAnimationBBinding
    lateinit var parameter: String

    companion object {
        fun start(activity: Activity, parameter: String) {
            val intent = Intent(activity, AnimationActivityB::class.java)
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
        binding = DataBindingUtil.setContentView(this, R.layout.activity_animation_b)
    }

    private fun getIntentData() {
        val bundle = intent.extras
        bundle?.let {
            parameter = it.getString(PARAMETER, DEFAULT)
        }
    }

    private fun setUpView() {
        title = getString(R.string.animation_b)
        binding.animationTextParameter.text = parameter
        binding.animationButtonB.setOnClickListener { finish() }
    }

    override fun finish() {
        super.finish()
        overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right)
    }
}