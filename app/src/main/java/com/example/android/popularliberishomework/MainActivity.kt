package com.example.android.popularliberishomework

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.android.popularliberishomework.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity(), MainView {

    private var binding: ActivityMainBinding? = null
    val presenter = MainPresenter(this)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding?.root)

        val listener = View.OnClickListener {
            presenter.counterClick(it.id)
        }

        binding?.btnCounter1?.setOnClickListener(listener)
        binding?.btnCounter2?.setOnClickListener(listener)
        binding?.btnCounter3?.setOnClickListener(listener)
    }

    //TODO Подсказка к ПЗ: поделить на 3 отдельные функции и избавиться от index
    //PP Hint: Divide into 3 separate functions and get rid of the index
    override fun setButtonText(index: Int, text: String) {
        when(index){
            0 -> binding?.btnCounter1?.text = text
            1 -> binding?.btnCounter2?.text = text
            2 -> binding?.btnCounter3?.text = text
        }
    }
}