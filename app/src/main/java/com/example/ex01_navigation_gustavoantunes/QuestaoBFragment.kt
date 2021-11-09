package com.example.ex01_navigation_gustavoantunes

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.activity.addCallback
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import com.example.ex01_navigation_gustavoantunes.databinding.FragmentQuestaoBBinding

class QuestaoBFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val binding : FragmentQuestaoBBinding = DataBindingUtil.inflate(inflater,  R.layout.fragment_questao_b, container, false)

        val callback = requireActivity().onBackPressedDispatcher.addCallback(this){
            Toast.makeText(context, "Não é possível retornar à tela anterior", Toast.LENGTH_SHORT).show()
        }

        val args = QuestaoBFragmentArgs.fromBundle(requireArguments())

        binding.buttonQuestao2.setOnClickListener(){ view : View ->

            var opcaoSelecionada = binding.radioGroupQuestao2.checkedRadioButtonId

            if(opcaoSelecionada != -1){

                if(opcaoSelecionada == R.id.radioButtonQuestao2A) {
                    view.findNavController().navigate(QuestaoBFragmentDirections.actionQuestaoBFragmentToQuestaoCFragment(0 + args.num))
                } else if(opcaoSelecionada == R.id.radioButtonQuestao2B){
                    view.findNavController().navigate(QuestaoBFragmentDirections.actionQuestaoBFragmentToQuestaoCFragment(0 + args.num))
                } else if(opcaoSelecionada == R.id.radioButtonQuestao2C) {
                    view.findNavController().navigate(QuestaoBFragmentDirections.actionQuestaoBFragmentToQuestaoCFragment(0 + args.num))
                } else if(opcaoSelecionada == R.id.radioButtonQuestao2D) {
                    view.findNavController().navigate(QuestaoBFragmentDirections.actionQuestaoBFragmentToQuestaoCFragment(1 + args.num))
                }
            } else {
                Toast.makeText(context, "É necessário selecionar uma opção!", Toast.LENGTH_SHORT).show()
            }
        }

        return binding.root
    }
}