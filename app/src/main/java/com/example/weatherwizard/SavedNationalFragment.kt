package com.example.weatherwizard

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.weatherwizard.Recylcer.WeatherScrollAdapter
import com.example.weatherwizard.Recylcer.WeatherScrollItem
import com.example.weatherwizard.databinding.FragmentSavedNationalBinding

/**
 * A simple [Fragment] subclass.
 * Use the [SavedNationalFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class SavedNationalFragment : Fragment() {
    private lateinit var binding : FragmentSavedNationalBinding

    //TODO: move to viewmodel
    val listofMaps = mutableListOf<WeatherScrollItem>()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentSavedNationalBinding.inflate(inflater, container, false)

        //obtaining the data from the xml file
        val titles = resources.getStringArray(R.array.Titles)
        val links = resources.getStringArray(R.array.links)
        val descriptions = resources.getStringArray(R.array.Descriptions)


        //create the itemscrolllist

        for(i in 0..titles.size - 1)
        {
            listofMaps.add(WeatherScrollItem(links[i], titles[i], descriptions[i]))
        }
        val recyclerView = binding.savedNationalRecycler
        val adapter = WeatherScrollAdapter(listofMaps, this@SavedNationalFragment)//pass it a ref to listofmaps and the fragment
        recyclerView.adapter = adapter
        recyclerView.layoutManager = LinearLayoutManager(context)

        //TODO: add a callback for the viewmodel to reset or whatever the data in the adapter when the livedata changes


        return binding.root
    }
}