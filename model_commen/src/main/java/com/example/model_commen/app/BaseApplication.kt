package com.example.model_commen.app

import android.app.Application
import com.alibaba.android.arouter.BuildConfig
import com.alibaba.android.arouter.launcher.ARouter

/**
 *  @作者 : zsj
 *  @创建日期 : 2022/4/21 18:48
 *  @文件作用 :
 */
abstract class BaseApplication : Application() {

    abstract fun initApplication()

    override fun onCreate() {
        super.onCreate()

        // 这两行必须写在init之前，否则这些配置在init过程中将无效
        if (BuildConfig.DEBUG) {
            // 打印日志
            ARouter.openLog()
            // 开启调试模式(如果在InstantRun模式下运行，必须开启调试模式！线上版本需要关闭,否则有安全风险)
            ARouter.openDebug()
        }
        // 尽可能早，推荐在Application中初始化
        ARouter.init(this)

        initApplication()
    }
}