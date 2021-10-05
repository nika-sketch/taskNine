package ge.nlatsabidze.tasknine

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.google.firebase.auth.FirebaseAuth
import ge.nlatsabidze.tasknine.databinding.FragmentLoginBinding

class LoginFragment : Fragment() {

    private lateinit var mAuth:FirebaseAuth
    private lateinit var binding: FragmentLoginBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentLoginBinding.inflate(inflater, container, false)
        binding.btnLogin.setOnClickListener {
            val email = binding.emailField.text
            val password = binding.passwordField.text

            mAuth.signInWithEmailAndPassword(email.toString().trim(), password.toString())
        }
        return binding.root
    }
}