package com.example.happieryou

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.happieryou.databinding.LoginBinding
import androidx.navigation.fragment.findNavController

class LoginFragment :Fragment() {
    private var _binding: LoginBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = LoginBinding.inflate(inflater, container, false)
        return binding.root

    }

 override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
     super.onViewCreated(view, savedInstanceState)

     binding.button3.setOnClickListener {
         findNavController().navigate(R.id.action_login_to_homepage)
     }
 }
////
////        binding.button3.setOnClickListener {
////            findNavController().navigate(R.id.action_FirstFragment_to_ThirdFragment)
////        }
////
////        binding.button4.setOnClickListener {
////            findNavController().navigate(R.id.action_FirstFragment_to_FourthFragment)
////        }
//    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}