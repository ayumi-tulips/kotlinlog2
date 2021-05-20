package jp.techacademy.ayumi.a0520

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.d("kotlintest","ログへの出力テスト")
        val human = Human("鈴木",20,"サッカー")
        val human2=Human("佐々木",20,"テニス")

        human.say()
        human2.say()
        human.think()
        human2.think()



    }
}

abstract class Animal {
    //プロパティ
    var name: String
    var age: Int

    //因数つきコンストラクタ
    constructor(name: String,age:Int){
        this.name = name
        this.age = age

    }
    abstract fun say()
}

