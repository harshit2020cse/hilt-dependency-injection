package com.harshitkumar.hiltdependencyinjection.view.fragments.login

import androidx.databinding.ObservableField
import androidx.lifecycle.ViewModel
import com.harshitkumar.hiltdependencyinjection.app.BaseApplication
import com.harshitkumar.hiltdependencyinjection.provider.ResourceProvider
import dagger.hilt.android.lifecycle.HiltViewModel
import java.util.*
import javax.inject.Inject

@HiltViewModel
class LoginVM @Inject constructor(
    val app: BaseApplication
) : ViewModel() {

    /* For Capitalize First Letter */
    fun String.capitalizeFirstLetter() = split(" ").joinToString(" ") { it ->
        it.replaceFirstChar {
            if (it.isLowerCase()) it.titlecase(
                Locale.getDefault()
            ) else it.toString()
        }
    }

    /* UI Fields */
    val firstField = ObservableField("")
    val secondField = ObservableField("")

    /* Perform Action */
//    fun performAction(){
//        when {
//            firstField.get()?.trim().isNullOrEmpty() -> {
//                Toast.makeText(app.applicationContext, "Enter value in First Field", Toast.LENGTH_SHORT)
//                    .show()
//            }
//            secondField.get()?.trim().isNullOrEmpty() -> {
//                Toast.makeText(app.applicationContext, "Enter value in First Field", Toast.LENGTH_SHORT)
//                    .show()
//            }
//            else -> {
//                doAdd()
//            }
//        }
//    }

    /* Perform Addition */
    fun doAdd() {
        val sum = firstField.get()?.capitalizeFirstLetter() + " " + secondField.get()?.capitalizeFirstLetter()
        app.setUserName(sum)
    }
}