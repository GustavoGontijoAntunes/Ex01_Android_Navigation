package com.example.ex01_navigation_gustavoantunes

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import com.example.ex01_navigation_gustavoantunes.databinding.FragmentReprovadoBinding

class ReprovadoFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val binding : FragmentReprovadoBinding = DataBindingUtil.inflate(inflater,  R.layout.fragment_reprovado, container, false)

        val args = QuestaoCFragmentArgs.fromBundle(requireArguments())

        binding.textViewReprovado.text = "Tente novamente! Você acertou ${args.num} das 3 perguntas."

        binding.buttonReprovado.setOnClickListener(){ view : View ->

            view.findNavController().navigate(ReprovadoFragmentDirections.actionReprovadoFragmentToStartFragment())
        }

        return binding.root
    }
}