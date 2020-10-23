package com.GadsMobileEdu22.Schoolbox365.ui.auth.login

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.GadsMobileEdu22.Schoolbox365.R
import com.GadsMobileEdu22.Schoolbox365.databinding.LoginFragmentBinding

class LoginFragment : Fragment() {


    private lateinit var viewModel: LoginViewModel
    private lateinit var binding: LoginFragmentBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        binding = LoginFragmentBinding.inflate(inflater)
        viewModel = ViewModelProvider(this).get(LoginViewModel::class.java)
        return binding.root
    }

}