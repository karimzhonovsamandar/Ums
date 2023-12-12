package com.sammy.ums.fragment

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.navigation.fragment.findNavController
import com.sammy.ums.R
import com.sammy.ums.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {

    private lateinit var binding: FragmentHomeBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentHomeBinding.inflate(layoutInflater)

        binding.apply {
            tarifButton.setOnClickListener {
                findNavController().navigate(R.id.tarifFragment, bundleOf("position" to 1))
            }
            daqiqalarButton.setOnClickListener {
                findNavController().navigate(R.id.tarifFragment, bundleOf("position" to 2))
            }
            internetButton.setOnClickListener {
                findNavController().navigate(R.id.tarifFragment, bundleOf("position" to 3))
            }
            xizmatlarButton.setOnClickListener {
                findNavController().navigate(R.id.tarifFragment, bundleOf("position" to 4))
            }
            smsButton.setOnClickListener {
                findNavController().navigate(R.id.tarifFragment, bundleOf("position" to 5))
            }

            yangiliklarButton.setOnClickListener {

                val url = "https://mobi.uz/uz/";
                val intent = Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(intent)

            }

        }




        return binding.root
    }


}