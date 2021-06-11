package com.harshitkumar.hiltdependencyinjection.view.fragments.splash

import androidx.lifecycle.ViewModel
import com.harshitkumar.hiltdependencyinjection.app.BaseApplication
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class SplashVM @Inject constructor(
    val app: BaseApplication
):ViewModel() {

}