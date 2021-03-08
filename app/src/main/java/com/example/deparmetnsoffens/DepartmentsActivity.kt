package com.example.deparmetnsoffens

import android.content.Intent
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
                val intent = Intent(this, CivilActivity::class.java).apply {

                }
                startActivity(intent)
            }
            if (position==1){
                val intent = Intent(this, ComputerActivity::class.java).apply {

                }
                startActivity(intent)
            }
            if (position==2){
                val intent = Intent(this, ElectronicActivity::class.java).apply {

                }
                startActivity(intent)
            }
            if (position==3){
                val intent = Intent(this, EnergyActivity::class.java).apply {

                }
                startActivity(intent)
            }
            if (position==4){
                val intent = Intent(this, IndustrialActivity::class.java).apply {

                }
                startActivity(intent)
            }
            if(position==5){
                val intent = Intent(this, MechatronicActivity::class.java).apply {

                }
                startActivity(intent)
            }
            if(position==6){
                val intent = Intent(this, MolecularActivity::class.java).apply {

                }
                startActivity(intent)
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
