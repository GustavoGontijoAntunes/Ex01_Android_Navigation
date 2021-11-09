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
import com.example.ex01_navigation_gustavoantunes.databinding.FragmentQuestaoCBinding

class QuestaoCFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val binding : FragmentQuestaoCBinding = DataBindingUtil.inflate(inflater,  R.layout.fragment_questao_c, container, false)

        val callback = requireActivity().onBackPressedDispatcher.addCallback(this){
            Toast.makeText(context, "Não é possível retornar à tela anterior", Toast.LENGTH_SHORT).show()
        }

        val args = QuestaoCFragmentArgs.fromBundle(requireArguments())

        binding.buttonQuestao3.setOnClickListener(){ view : View ->

            var opcaoSelecionada = binding.radioGroupQuestao3.checkedRadioButtonId

            if(opcaoSelecionada != -1){

                if(opcaoSelecionada == R.id.radioButtonQuestao3A) {
                    if(args.num == 2){
                        view.findNavController().navigate(QuestaoCFragmentDirections.actionQuestaoCFragmentToAprovadoFragment(2))
                    } else {
                        view.findNavController().navigate(QuestaoCFragmentDirections.actionQuestaoCFragmentToReprovadoFragment(args.num))
                    }
                } else if(opcaoSelecionada == R.id.radioButtonQuestao3B){
                    if(args.num >= 1){
                        view.findNavController().navigate(QuestaoCFragmentDirections.actionQuestaoCFragmentToAprovadoFragment(args.num + 1))
                    } else {
                        view.findNavController().navigate(QuestaoCFragmentDirections.actionQuestaoCFragmentToReprovadoFragment(args.num))
                    }
                } else if(opcaoSelecionada == R.id.radioButtonQuestao3C) {
                    if(args.num == 2){
                        view.findNavController().navigate(QuestaoCFragmentDirections.actionQuestaoCFragmentToAprovadoFragment(2))
                    } else {
                        view.findNavController().navigate(QuestaoCFragmentDirections.actionQuestaoCFragmentToReprovadoFragment(args.num))
                    }
                } else if(opcaoSelecionada == R.id.radioButtonQuestao3D) {
                    if(args.num == 2){
                        view.findNavController().navigate(QuestaoCFragmentDirections.actionQuestaoCFragmentToAprovadoFragment(2))
                    } else {
                        view.findNavController().navigate(QuestaoCFragmentDirections.actionQuestaoCFragmentToReprovadoFragment(args.num))
                    }
                }
            } else {
                Toast.makeText(context, "É necessário selecionar uma opção!", Toast.LENGTH_SHORT).show()
            }
        }

        return binding.root
    }
}