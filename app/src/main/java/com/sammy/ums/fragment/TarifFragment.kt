package com.sammy.ums.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.navigation.fragment.findNavController
import com.sammy.ums.R
import com.sammy.ums.ServiceData
import com.sammy.ums.adapters.TarifAdapter
import com.sammy.ums.databinding.FragmentTarifBinding
import com.sammy.ums.models.Service


class TarifFragment : Fragment(), TarifAdapter.RvClick {

    private lateinit var binding: FragmentTarifBinding
    private lateinit var tarifAdapter: TarifAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentTarifBinding.inflate(layoutInflater)
        tarifAdapter = TarifAdapter(this)

        when(arguments?.getInt("position", 0)){
            1 -> tarifAdapter.list.addAll(ServiceData.tariflarList)
            2 -> tarifAdapter.list.addAll(ServiceData.daqiqalarList)
            3 -> tarifAdapter.list.addAll(ServiceData.internetList)
            4 -> tarifAdapter.list.addAll(ServiceData.xizmatlarList)
            5 -> tarifAdapter.list.addAll(ServiceData.smsList)
        }

        binding.rv.adapter = tarifAdapter
        return binding.root


    }

    override fun onClick(service: Service) {
        findNavController().navigate(R.id.fullInfoFragment, bundleOf("keyService" to service))
    }

}