package com.example.weatherwizard.Recycler

//import android.util.Log
//import android.view.LayoutInflater
//import android.view.View
//import android.view.ViewGroup
//import android.widget.TextView
//import androidx.fragment.app.Fragment
//import androidx.recyclerview.widget.RecyclerView
//import com.bumptech.glide.Glide
//import com.bumptech.glide.request.RequestOptions
//import com.example.weatherwizard.R
//
///**
// * list should be passed in, and will be a reference the adapter can keep
// * and use
// */
//class WeatherScrollAdapter(list: List<WeatherScrollItem>, frag: Fragment):RecyclerView.Adapter<WeatherScrollAdapter.WeatherScrollHolder>() {
//
//    val listRef :List<WeatherScrollItem> = list
//    val frag: Fragment = frag//gets a reference to the fragment this adapter is used for
//
//
//
//    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): WeatherScrollHolder {
//
//        //inflate the view in here, and return a new scroll holder
//
//        val wv = LayoutInflater.from(parent.context)
//            .inflate(R.layout.mapselectcard,parent, false)
//        return WeatherScrollHolder(wv)
//    }
//
//    override fun getItemCount(): Int {
//
//        //have to figure out how to get the amount into this class
//        return listRef.size //temp
//    }
//
//    override fun onBindViewHolder(holder: WeatherScrollHolder, position: Int) {
//
//        //reusing views here, reconfigure all the changable assets(image, texts)
//
//        Glide.with(frag)
//            .load(listRef[position].url)
//            .apply(RequestOptions.overrideOf(300, 200))
//            .into(holder.view.findViewById(R.id.mapScrollImageView))
//
//        holder.view.findViewById<TextView>(R.id.mapName).setText(listRef.get(position).title)
//        Log.d("Recycler", "loaded " + listRef.get(position).title)
//
//    }
//
//    /**
//     * This defines the functionality of each item in the list
//     */
//    inner class WeatherScrollHolder(val view:View):RecyclerView.ViewHolder(view)
//    {
//
//    }
//}