package com.qlzgzg.kotlin

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import java.lang.Integer.parseInt

class KotlinMainActivity : AppCompatActivity(),LoginView {

    override fun showProgress(msg: String) {
        print(String)
    }

    override fun onSuccess() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun showProgress() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun hideProgress() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun showError(msg: String) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kotlin_main)
//        val person = Person("cornflower",3)
//        tv_person.text = person.name
//        var intent = Intent(this,MainActivity::class.java)
//        intent.putExtra("person",person)
//        startActivity(intent)
//        printProduct("5","6")
        val cat = Cat("cat",2)
        cat.age = 1
        println(cat.name+cat.age)
        var  loginP = LoginPersenter(this,this)
        loginP.login("cornflower","123456")

    }

    /**
     * 函数表达
     */

//    fun sum(a:Int,b:Int):Int{
//        return a+b
//    }
    fun sum(a:Int,b :Int) = a+b

    val a:Int = 1 //一次赋值，类似final
    var b:Int = 2 //声明变量 可变
    /**
     * 字符串模板
     */
    fun test(){
        var c = 1
        val d = "c is $c"
        c = 2
        val e = "${d.replace("is","was")},but now is$c"
    }
    /**
     * 条件表达式
     */
    fun maxOf(a:Int,b:Int) = if(a>b)a else b

    /**
     *
     */
    fun printProduct(arg1:String,arg2:String){
        var x = parseInt(arg1)
        var y = parseInt(arg2)
        if(x!=null&&y!=null){
            println(x*y)
        }else{
            println("either '$arg1' or '$arg2' is not a number")
        }
    }

    /**
     * for循环
     *
     */
    fun forList(){
        var items = listOf("android","ios","windows")
        for(index in items.indices){
            println("$index is ${items[index]}")
        }
    }

    /**
     * while
     */
   fun whileList(){
        var items = listOf("android","ios","windows")
        var index = 1
        while (index<items.size){
            println("$index")
            index++
        }
    }


    /**
     * when
     */
  fun describe(obj:Any):String =
            when(obj){
                1 -> "one"
                "android" -> "A"
                else -> "unkonwn"
            }

    /**
     * 使用 in 运算符来判断集合内是否包含某实例：
     */
    fun itemsContainsitem(){

        var items = listOf("S","T","W","Stt")
        for (item in items){
            println(item)
        }


        when{
            "S" in items -> print("S")
            "T" in items -> print("T")
        }

        items.filter { it.startsWith("S") }.sortedBy { it }.map { it.toUpperCase() }.forEach { print(it) }


    }


}
