package com.example.jetpacknavigation

import android.os.Bundle
import android.view.View
import androidx.core.os.bundleOf
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.jetpacknavigation.databinding.FragmentHomeBinding
import me.ruyeo.jetpacknavigationb13.ui.utils.viewBinding

class HomeFragment : Fragment(R.layout.fragment_home) {

    private val binding by viewBinding { FragmentHomeBinding.bind(it) }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
var user = User("Sherzod",21)
        binding.clicMe.setOnClickListener {
            findNavController().navigate(R.id.action_homeFragment_to_secondFragment2,
                bundleOf("key" to "Sarvar","user" to user),Utils.navOptions())
        }
    }
}