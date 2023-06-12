package com.droidbytes.pagecurleffectlikebook

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.droidbytes.pagecurleffectlikebook.databinding.ActivityBookBinding

class BookActivity : AppCompatActivity() {
    lateinit var binding: ActivityBookBinding
    lateinit var imageList : ArrayList<Int>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityBookBinding.inflate(layoutInflater)
        setContentView(binding.root)

        imageList=ArrayList()

        imageList.add(R.drawable.page1)
        imageList.add(R.drawable.page2)

        binding.pageCurlView.setCurlView(imageList)
        binding.pageCurlView.setCurlSpeed(600)

    }
}