package com.qlzgzg.kotlin

/**
 * Created by xiejingbao on 2017/6/26.
 */
 interface BaseView{

    fun showProgress(msg:String)
    fun showProgress()
    fun hideProgress()
    fun showError(msg:String)


}