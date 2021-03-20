package com.example.deparmetnsoffens

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.ListView
import androidx.fragment.app.Fragment
import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.ViewModelProvider

class DepartmentsActivity : AppCompatActivity(),LifecycleOwner {



    private lateinit var listview : ListView
    var list = mutableListOf<ListModel>()
    lateinit var viewModel : DepartmentsViewModel



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_departments)
        listview = findViewById(R.id.lv_departments)
        list_init()


        listview.adapter = DepartmentListAdapter(this,R.layout.department_column,list)
        viewModel = ViewModelProvider(this).get(DepartmentsViewModel::class.java)


        listview.setOnItemClickListener{parent, view, position, id ->

            if (position==0){
                changeFragment(position,DepartmentInfoFragment())
            }
            if (position==1){
                changeFragment(position,DepartmentInfoFragment())
            }
            if (position==2){
                changeFragment(position,DepartmentInfoFragment())
            }
            if (position==3){
                changeFragment(position,DepartmentInfoFragment())
            }
            if (position==4){
                changeFragment(position,DepartmentInfoFragment())
            }
            if(position==5){
                changeFragment(position,DepartmentInfoFragment())
            }
            if(position==6){
                changeFragment(position,DepartmentInfoFragment())
            }
        }
    }

    private fun list_init(){
        list.add(ListModel("Civil Engineering",R.mipmap.civil))
        list.add(ListModel("Computer Engineering",R.mipmap.computer))
        list.add(ListModel("Electric-Electronics Engineering",R.mipmap.electronics))
        list.add(ListModel("Energy Systems Engineering",R.mipmap.energy))
        list.add(ListModel("Industrial Engineering",R.mipmap.industrial))
        list.add(ListModel("Mechatronics Engineering",R.mipmap.mechatronics))
        list.add(ListModel("Molecular Biology Engineering",R.mipmap.molecular))
    }



    fun changeFragment(position:Int,fragment: Fragment) {
        listview.visibility= View.INVISIBLE
        viewModel.listViewClick(0)
        val fragmentTransaction = supportFragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.fL_department, fragment)
        fragmentTransaction.commit()

    }
}
