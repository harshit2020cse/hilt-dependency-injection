package com.harshitkumar.hiltdependencyinjection.view.fragments.hello

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.harshitkumar.hiltdependencyinjection.R
import com.harshitkumar.hiltdependencyinjection.databinding.FragmentHelloBinding
import com.harshitkumar.hiltdependencyinjection.databinding.FragmentLoginBinding
import com.harshitkumar.hiltdependencyinjection.databinding.FragmentResultBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class HelloFragment : Fragment() {

    lateinit var binding: FragmentHelloBinding
    val viewModel: HelloVM by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = DataBindingUtil.inflate(
            inflater, R.layout.fragment_hello, container, false
        )
        binding.viewModel = viewModel
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        /* Set Click Listeners */
        setClickListener()

    }

    /**
     *  Set Click Listeners
     */
    private fun setClickListener() {

    }

}