package com.harshitkumar.hiltdependencyinjection.view.fragments.login

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import com.harshitkumar.hiltdependencyinjection.R
import com.harshitkumar.hiltdependencyinjection.databinding.FragmentLoginBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class LoginFragment : Fragment() {

    lateinit var binding: FragmentLoginBinding
    val viewModel: LoginVM by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = DataBindingUtil.inflate(
            inflater, R.layout.fragment_login, container, false
        )
        binding.viewModel = viewModel
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        /* Set Click Listeners*/
        setClickListener()

    }

    /**
     *  Set Click Listeners
     */
    private fun setClickListener() {

        /* Add Button Click */
        binding.addButton.setOnClickListener {
            when {
                viewModel.firstField.get()?.trim().isNullOrEmpty() -> {
                    Toast.makeText(requireContext(), resources.getString(R.string.enter_first_field_value), Toast.LENGTH_SHORT)
                        .show()
                }
                viewModel.secondField.get()?.trim().isNullOrEmpty() -> {
                    Toast.makeText(requireContext(), resources.getString(R.string.enter_second_field_value), Toast.LENGTH_SHORT)
                        .show()
                }
                else -> {
                    viewModel.doAdd()
                    findNavController().navigate(R.id.action_loginFragment_to_resultFragment)
                }
            }
        }
    }

}