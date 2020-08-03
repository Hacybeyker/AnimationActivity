package com.hacybeyker.animationactivity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.hacybeyker.animationactivity.databinding.ActivityMainBinding
import com.hacybeyker.animationactivity.ui.animation.AnimationActivityA
import com.hacybeyker.animationactivity.ui.library.LibraryActivityA
import com.hacybeyker.animationactivity.ui.normal.NormalActivityA
import com.hacybeyker.animationactivity.ui.swipe.SlideActivityA

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setUpBinding()
        getIntentData()
        setUpView()
    }

    private fun setUpBinding() {
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    private fun getIntentData() {

    }

    private fun setUpView() {
        binding.mainButtonNormal.setOnClickListener { NormalActivityA.start(this) }
        binding.mainButtonAnimation.setOnClickListener { AnimationActivityA.start(this) }
        binding.mainButtonLibrary.setOnClickListener { LibraryActivityA.start(this) }
        binding.mainButtonSwipe.setOnClickListener { SlideActivityA.start(this)}
    }
}

//
//https://www.youtube.com/watch?v=0s6x3Sn4eYo&list=PLrnPJCHvNZuARS1W7qMt-zxBNqWYZpOg6&index=3
//https://www.youtube.com/watch?v=C8MrscyUXz8
//https://www.youtube.com/watch?v=Ci5146VOyg4