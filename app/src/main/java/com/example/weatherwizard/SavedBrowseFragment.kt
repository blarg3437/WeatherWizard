package com.example.weatherwizard
//
//import android.os.Bundle
//import androidx.fragment.app.Fragment
//import android.view.LayoutInflater
//import android.view.View
//import android.view.ViewGroup
//import androidx.recyclerview.widget.LinearLayoutManager
//import androidx.recyclerview.widget.RecyclerView
//import com.example.weatherwizard.Recycler.WeatherScrollAdapter
//import com.example.weatherwizard.Recycler.WeatherScrollItem
//
//class SavedBrowseFragment : Fragment() {
//
//    //TODO: move to viewmodel
//    val listofMaps = mutableListOf<WeatherScrollItem>()
//
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//
//        }
//
//
//    override fun onCreateView(
//        inflater: LayoutInflater, container: ViewGroup?,
//        savedInstanceState: Bundle?
//    ): View? {
//        // Inflate the layout for this fragment
//        val viewww = inflater.inflate(R.layout.fragment_saved_browse, container, false)
//        //should be 'safe?' to access?
//
//        //obtaining the data from the xml file
//        val titles = resources.getStringArray(R.array.Titles)
//        val links = resources.getStringArray(R.array.links)
//        val descriptions = resources.getStringArray(R.array.Descriptions)
//
//        //create the itemscrolllist
//
//        for(i in 0..titles.size - 1)
//        {
//            listofMaps.add(WeatherScrollItem(links[i], titles[i], descriptions[i]))
//        }
//        val recyclerView = viewww.findViewById<RecyclerView>(R.id.recyclerView)
//        val adapter = WeatherScrollAdapter(listofMaps, this@SavedBrowseFragment)//pass it a ref to listofmaps and the fragment
//        recyclerView.adapter = adapter
//        recyclerView.layoutManager = LinearLayoutManager(context)
//
//        //TODO: add a callback for the viewmodel to reset or whatever the data in the adapter when the livedata changes
//
//        return viewww
//    }
//
//    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
//        super.onViewCreated(view, savedInstanceState)
//
//
//    }
//
//
//}