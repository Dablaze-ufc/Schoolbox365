package com.GadsMobileEdu22.Schoolbox365.ui.auth.signup

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.GadsMobileEdu22.Schoolbox365.R
import com.GadsMobileEdu22.Schoolbox365.databinding.SignUpFragmentBinding

class SignUpFragment : Fragment() {


    private lateinit var viewModel: SignUpViewModel
    private lateinit var binding: SignUpFragmentBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        binding = SignUpFragmentBinding.inflate(inflater)
        viewModel = ViewModelProvider(this).get(SignUpViewModel::class.java)
        return binding.root
    }



}