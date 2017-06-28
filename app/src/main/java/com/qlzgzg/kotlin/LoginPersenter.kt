package com.qlzgzg.kotlin

import android.content.Context

/**
 * Created by xiejingbao on 2017/6/28.
 */
class LoginPersenter(context: Context, t: LoginView) : BasePresenter<LoginView>(context, t){

    fun login(passWd:String,name:String){
        t.showProgress("请等待...")
        print("name is $name passwd is $passWd")
        t.hideProgress()
    }
}