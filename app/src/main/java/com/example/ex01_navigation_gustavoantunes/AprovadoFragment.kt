package com.example.ex01_navigation_gustavoantunes

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import com.example.ex01_navigation_gustavoantunes.databinding.FragmentAprovadoBinding

class AprovadoFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val binding : FragmentAprovadoBinding = DataBindingUtil.inflate(inflater,  R.layout.fragment_aprovado, container, false)

        val args = QuestaoCFragmentArgs.fromBundle(requireArguments())

        binding.textViewAprovado.text = "Parabéns! Você acertou ${args.num} das 3 perguntas."

        binding.buttonAprovado.setOnClickListener(){ view : View ->

            view.findNavController().navigate(AprovadoFragmentDirections.actionAprovadoFragmentToStartFragment())
        }

        return binding.root
    }
}