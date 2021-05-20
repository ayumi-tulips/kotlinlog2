package jp.techacademy.ayumi.a0520

import android.util.Log

class Human: Animal,Thinkable {
    var hobby:String

    override fun say() {
        Log.d("kotlintest","私の名前は" + this.name +"です。")
        Log.d("kotlintest","私の年齢は" + this.age  + "です。")

    }

    constructor(name: String,age:Int,hobby:String) :super(name,age){
    this.hobby=hobby

    }

    override fun think() {
        Log.d("kotlintest", "私は"+this.hobby+"について考える" )
    }
}
