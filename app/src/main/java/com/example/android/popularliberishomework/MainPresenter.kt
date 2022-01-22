package com.example.android.popularliberishomework


class MainPresenter(val view: MainView) {
    val model = CountersModel()

    // TODO HOME WORK1 Архитектурная ошибка. В качестве практического задания -- исправить
    //Architectural mistake. As a practical task, required to fix it

    fun counterClick(id: Int){
        when(id){
            R.id.btn_counter1 -> {
                val nextValue = model.next(0)
                view.setButtonText(0, nextValue.toString())
            }
            R.id.btn_counter2 -> {
                val nextValue = model.next(1)
                view.setButtonText(1, nextValue.toString())
            }
            R.id.btn_counter3 -> {
                val nextValue = model.next(2)
                view.setButtonText(2, nextValue.toString())
            }
        }
    }
}

