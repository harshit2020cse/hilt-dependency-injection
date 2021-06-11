package com.harshitkumar.hiltdependencyinjection.app

import android.app.Application
import dagger.hilt.android.HiltAndroidApp

@HiltAndroidApp
class BaseApplication:Application() {

    /** Result Data Variable */
    private var resultData: String? = ""

    /**
     * @param result Store Result
     * */
    fun setUserName(result: String?) {
        resultData = result ?: ""
    }

    /**
     * @return resultData
     * */
    fun getResultData() = resultData

}