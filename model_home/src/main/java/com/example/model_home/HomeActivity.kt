package com.example.model_home

import com.example.model_commen.BaseActivity
import kotlinx.android.synthetic.main.activity_home.*

class HomeActivity : BaseActivity() {

    override fun getContentView(): Int {
        return R.layout.activity_home
    }

    override fun initData() {
        main_text_click.setOnClickListener {

        }
    }

    override fun initView() {
    }
}