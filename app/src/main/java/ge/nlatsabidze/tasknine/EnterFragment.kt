package ge.nlatsabidze.tasknine

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import ge.nlatsabidze.tasknine.databinding.FragmentEnterBinding

class EnterFragment : Fragment() {

    private lateinit var binding: FragmentEnterBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentEnterBinding.inflate(inflater,container,false)
        setFunction()
        return binding.root
    }

    private fun setFunction() {
        binding.btnRegister.setOnClickListener {
            findNavController().navigate(R.id.action_enterFragment_to_registerFragment)
        }

        binding.btnLogin.setOnClickListener {
            findNavController().navigate(R.id.action_enterFragment_to_loginFragment)
        }
    }
}