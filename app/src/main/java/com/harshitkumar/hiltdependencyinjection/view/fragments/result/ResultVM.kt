package com.harshitkumar.hiltdependencyinjection.view.fragments.result

import androidx.databinding.ObservableField
import androidx.lifecycle.ViewModel
import com.harshitkumar.hiltdependencyinjection.app.BaseApplication
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class ResultVM @Inject constructor(
    val app: BaseApplication
):ViewModel() {

    /* UI Fields */
    val resultField = ObservableField("")

    /* Getting Result from BaseApplication class*/
    fun getResult(){
        resultField.set(app.getResultData())
    }
}