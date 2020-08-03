package com.hacybeyker.animationactivity.ui.animation

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.hacybeyker.animationactivity.R
import com.hacybeyker.animationactivity.databinding.ActivityAnimationABinding
import com.hacybeyker.animationactivity.ui.DATA

class AnimationActivityA : AppCompatActivity() {

    lateinit var binding: ActivityAnimationABinding

    companion object {
        fun start(activity: Activity) {
            val intent = Intent(activity, AnimationActivityA::class.java)
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
        binding = DataBindingUtil.setContentView(this, R.layout.activity_animation_a)
    }

    private fun getIntentData() {

    }

    private fun setUpView() {
        title = getString(R.string.animation_a)
        binding.animationButtonA.setOnClickListener { AnimationActivityB.start(this, DATA) }
    }
}