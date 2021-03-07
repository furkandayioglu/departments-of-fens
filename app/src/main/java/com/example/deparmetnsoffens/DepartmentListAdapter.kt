package com.example.deparmetnsoffens

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.ListAdapter
import android.widget.TextView

class DepartmentListAdapter(var mCtx:Context , var resource:Int,var items:List<ListModel>)
    :ArrayAdapter<ListModel>( mCtx , resource , items ){

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {

        val layoutInflater :LayoutInflater = LayoutInflater.from(mCtx)

        val view : View = layoutInflater.inflate(resource , null )
        val imageView :ImageView = view.findViewById(R.id.imageView2)
        var textView : TextView = view.findViewById(R.id.textView3)



        var department : ListModel = items[position]

        imageView.setImageDrawable(mCtx.resources.getDrawable(department.photo))
        textView.text = department.title



        return view!!
    }

}