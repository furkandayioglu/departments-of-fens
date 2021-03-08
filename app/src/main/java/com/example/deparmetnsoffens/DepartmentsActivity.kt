package com.example.deparmetnsoffens

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView
import androidx.fragment.app.Fragment

class DepartmentsActivity : AppCompatActivity() {
    private lateinit var listview : ListView
    var list = mutableListOf<ListModel>()




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_departments)
        listview = findViewById(R.id.lv_departments)
        list_init()
        listview.adapter = DepartmentListAdapter(this,R.layout.department_column,list)



        listview.setOnItemClickListener{parent, view, position, id ->

            if (position==0){

            }
            if (position==1){

            }
            if (position==2){

            }
            if (position==3){

            }
            if (position==4){

            }
            if(position==5){

            }
            if(position==6){

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



    fun changeFragment(fragment: Fragment) {
        val fragmentTransaction = supportFragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.fL_department, fragment)
        fragmentTransaction.commit()

    }
}
