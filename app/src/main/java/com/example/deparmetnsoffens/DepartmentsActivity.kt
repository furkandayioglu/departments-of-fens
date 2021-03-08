package com.example.deparmetnsoffens

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView
import android.widget.Toast
import androidx.fragment.app.FragmentActivity

class DepartmentsActivity : FragmentActivity() {
    private lateinit var listview : ListView
    var list = mutableListOf<ListModel>()




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_departments)
        listview = findViewById(R.id.listview)
        list_init()
        listview.adapter = DepartmentListAdapter(this,R.layout.department_column,list)



        listview.setOnItemClickListener{parent, view, position, id ->

            if (position==0){
                Toast.makeText(this@DepartmentsActivity, "Civil Engineering",   Toast.LENGTH_SHORT).show()
            }
            if (position==1){
                Toast.makeText(this@DepartmentsActivity, "Computer Engineering",   Toast.LENGTH_SHORT).show()
            }
            if (position==2){
                Toast.makeText(this@DepartmentsActivity, "Electric-Electronic Engineering", Toast.LENGTH_SHORT).show()
            }
            if (position==3){
                Toast.makeText(this@DepartmentsActivity, "Energy Systems Engineering",  Toast.LENGTH_SHORT).show()
            }
            if (position==4){
                Toast.makeText(this@DepartmentsActivity, "Industrial Engineering",  Toast.LENGTH_SHORT).show()
            }
            if(position==5){
                Toast.makeText(this@DepartmentsActivity, "Mechatronics Engineering",  Toast.LENGTH_SHORT).show()
            }
            if(position==6){
                Toast.makeText(this@DepartmentsActivity, "Molecular Biology Engineering",  Toast.LENGTH_SHORT).show()
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
}
