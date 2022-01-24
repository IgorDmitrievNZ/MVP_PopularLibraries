package com.example.android.popularliberishomework


class MainPresenter(private val view: MainView) {
    private val model = CountersModel()

    enum class Buttons {
        BUTTON1,
        BUTTON2,
        BUTTON3,
    }

    fun counterClick(id: Buttons) {
        when (id) {
            Buttons.BUTTON1 -> {
                val nextValue = model.next(0)
                view.setButton1Text(nextValue.toString())
            }
            Buttons.BUTTON2 -> {
                val nextValue = model.next(1)
                view.setButton2Text(nextValue.toString())
            }
            Buttons.BUTTON3 -> {
                val nextValue = model.next(2)
                view.setButton3Text(nextValue.toString())
            }
        }
    }
}

