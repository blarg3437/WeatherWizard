package com.example.weatherwizard

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import androidx.navigation.fragment.findNavController
import com.example.weatherwizard.databinding.FragmentSavedScreenBinding
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayout.OnTabSelectedListener

/**
 * A simple [Fragment] subclass.
 * Use the [SavedScreenFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class SavedScreenFragment : Fragment() {
    private lateinit var binding : FragmentSavedScreenBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentSavedScreenBinding.inflate(inflater, container, false)

        binding.savedTabs.addOnTabSelectedListener(object:OnTabSelectedListener {
            override fun onTabSelected(tab: TabLayout.Tab?) {
                when(tab?.position) {
                    0 -> binding.savedFragmentContainer.findNavController().navigate(R.id.savedNationalFragment)
                    1 -> binding.savedFragmentContainer.findNavController().navigate(R.id.savedLocalFragment)
                    2 -> binding.savedFragmentContainer.findNavController().navigate(R.id.savedCustomFragment)
                }
            }

            override fun onTabUnselected(tab: TabLayout.Tab?) {

            }

            override fun onTabReselected(tab: TabLayout.Tab?) {

            }

        })
        return binding.root
    }

}