package com.sammy.ums.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.sammy.ums.R
import com.sammy.ums.ServiceData
import com.sammy.ums.adapters.TarifAdapter
import com.sammy.ums.databinding.FragmentFullInfoBinding
import com.sammy.ums.models.Service

class FullInfoFragment : Fragment() {

    private lateinit var binding: FragmentFullInfoBinding
    private lateinit var tarifAdapter: TarifAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentFullInfoBinding.inflate(layoutInflater)

        val service : Service = arguments?.getSerializable("keyService") as Service
        binding.apply {
            nameText.text = service.name
            codeText.text = service.code
            infoText.text = service.info
            backButton.setOnClickListener {
                findNavController().popBackStack()
            }
        }

        return binding.root
    }

}