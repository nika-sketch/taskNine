package ge.nlatsabidze.tasknine

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.fragment.app.setFragmentResult
import androidx.navigation.fragment.findNavController
import ge.nlatsabidze.tasknine.databinding.FragmentRegisterBinding

class RegisterFragment : Fragment() {


    private lateinit var binding: FragmentRegisterBinding

    override fun onCreateView(

        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?

    ): View? {

        binding = FragmentRegisterBinding.inflate(inflater,container,false)
        setFunction()
        return binding.root
    }

    private fun setFunction() {

        binding.btnNext.setOnClickListener {
            val email = binding.emailField.text
            val password = binding.passwordField.text
            setFragmentResult("email", bundleOf("email" to email))
            setFragmentResult("password", bundleOf("password" to password))
            findNavController().navigate(R.id.action_registerFragment_to_secondRegisterFragment)
        }
    }

}