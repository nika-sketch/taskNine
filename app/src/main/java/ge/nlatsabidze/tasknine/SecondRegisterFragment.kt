package ge.nlatsabidze.tasknine

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import android.widget.Toast.LENGTH_SHORT
import androidx.fragment.app.setFragmentResultListener
import com.google.firebase.ktx.Firebase
import ge.nlatsabidze.tasknine.databinding.FragmentSecondRegisterBinding
import com.google.firebase.auth.FirebaseAuth

class SecondRegisterFragment : Fragment() {

    private lateinit var mAuth: FirebaseAuth

    private var email:String? = null
    private var password:String? = null
    private lateinit var binding:FragmentSecondRegisterBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentSecondRegisterBinding.inflate(inflater,container,false)

        setFragmentResultListener("email") { _, bundle ->
            email = bundle.getString("email")
        }

        setFragmentResultListener("password") { _, bundle ->
            password = bundle.getString("password")
        }

        mAuth = FirebaseAuth.getInstance()
        binding.btnSignUp.setOnClickListener {
            mAuth.createUserWithEmailAndPassword(email.toString().trim(), password.toString())
        }

        return binding.root
    }
}