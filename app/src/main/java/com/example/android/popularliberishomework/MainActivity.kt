package com.example.android.popularliberishomework

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.example.android.popularliberishomework.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity(), MainView {

    private lateinit var binding: ActivityMainBinding
    private val presenter = MainPresenter(this)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val listener = View.OnClickListener {
            val current = when (it.id) {
                R.id.btn_counter1 -> MainPresenter.Buttons.BUTTON1
                R.id.btn_counter2 -> MainPresenter.Buttons.BUTTON2
                R.id.btn_counter3 -> MainPresenter.Buttons.BUTTON3
                else -> throw IllegalArgumentException("Something went wrong mate (")
            }
            presenter.counterClick(current)
        }

        binding.btnCounter1.setOnClickListener(listener)
        binding.btnCounter2.setOnClickListener(listener)
        binding.btnCounter3.setOnClickListener(listener)
    }

    override fun setButton1Text(text: String) {
        binding.btnCounter1.text = text
    }

    override fun setButton2Text(text: String) {
        binding.btnCounter2.text = text
    }

    override fun setButton3Text(text: String) {
        binding.btnCounter3.text = text
    }

}