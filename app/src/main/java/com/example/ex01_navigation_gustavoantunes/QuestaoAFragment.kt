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
import com.example.ex01_navigation_gustavoantunes.databinding.FragmentQuestaoABinding

class QuestaoAFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val binding : FragmentQuestaoABinding = DataBindingUtil.inflate(inflater,  R.layout.fragment_questao_a, container, false)

        val callback = requireActivity().onBackPressedDispatcher.addCallback(this){
            Toast.makeText(context, "Não é possível retornar à tela anterior", Toast.LENGTH_SHORT).show()
        }

        binding.buttonQuestao1.setOnClickListener(){ view : View ->

            var opcaoSelecionada = binding.radioGroupQuestao1.checkedRadioButtonId

            if(opcaoSelecionada != -1){

                if(opcaoSelecionada == R.id.radioButtonQuestao1A) {
                    view.findNavController().navigate(QuestaoAFragmentDirections.actionQuestaoAFragmentToQuestaoBFragment(0))
                } else if(opcaoSelecionada == R.id.radioButtonQuestao1B){
                    view.findNavController().navigate(QuestaoAFragmentDirections.actionQuestaoAFragmentToQuestaoBFragment(0))
                } else if(opcaoSelecionada == R.id.radioButtonQuestao1C) {
                    view.findNavController().navigate(QuestaoAFragmentDirections.actionQuestaoAFragmentToQuestaoBFragment(1))
                } else if(opcaoSelecionada == R.id.radioButtonQuestao1D) {
                    view.findNavController().navigate(QuestaoAFragmentDirections.actionQuestaoAFragmentToQuestaoBFragment(0))
                }
            } else {
                Toast.makeText(context, "É necessário selecionar uma opção!", Toast.LENGTH_SHORT).show()
            }
        }

        return binding.root
    }
}