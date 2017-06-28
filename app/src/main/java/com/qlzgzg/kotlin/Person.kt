package com.qlzgzg.kotlin


/**
 * Created by xiejingbao on 2017/6/23.
 */
 class Person :BaseEntity{
    var name:String?=null
    var age:Int?
    constructor(name:String,age :Int){
        this.age = age
        this.name = name
    }


}