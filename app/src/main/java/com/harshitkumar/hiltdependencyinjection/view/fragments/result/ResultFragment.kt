package com.harshitkumar.hiltdependencyinjection.view.fragments.result

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.harshitkumar.hiltdependencyinjection.R
import com.harshitkumar.hiltdependencyinjection.databinding.FragmentResultBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class ResultFragment : Fragment() {

    lateinit var binding: FragmentResultBinding
    val viewModel: ResultVM by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = DataBindingUtil.inflate(
            inflater, R.layout.fragment_result, container, false
        )
        binding.viewModel = viewModel
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        viewModel.getResult()

        /* Set Click Listeners */
        setClickListener()

    }

    /**
     *  Set Click Listeners
     */
    private fun setClickListener() {

    }

}