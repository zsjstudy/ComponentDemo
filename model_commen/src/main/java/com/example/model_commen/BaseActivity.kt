package com.example.model_commen

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

/**
 *  @作者 : zsj
 *  @创建日期 : 2022/4/20 20:57
 *  @文件作用 :
 */
abstract class BaseActivity:AppCompatActivity() {

    protected abstract fun getContentView():Int
    protected abstract fun initView()
    protected abstract fun initData()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(getContentView())
        initView()
        initData()
    }
}