package com.example.deparmetnsoffens

import android.util.Log
import android.view.View
import androidx.lifecycle.ViewModel

class DepartmentsViewModel : ViewModel() {

    var info_str =0
    var logo_id = 0
    var background_id = 0
    var position =-1
    var title = 0
    var listviewStatus = View.VISIBLE

    fun listViewClick(position: Int){
        this.position = position

        Log.d("DVM list","Position : "+this.position)

        if(this.position == 0) {
            logo_id = R.mipmap.civil
            title = R.string.civil_engineering
            background_id = R.mipmap.cvl_eng
            info_str =  R.string.civil_engineering_info
        }
        if(this.position == 1) {
            logo_id = R.mipmap.computer
            title = R.string.computer_engineering
            background_id = R.mipmap.computer_eng
            info_str =  R.string.computer_engineering_info
        }
        if(this.position == 2) {
            logo_id = R.mipmap.electronics
            title = R.string.electronic_engineering
            background_id = R.mipmap.elect_eng
            info_str =  R.string.electronic_engineering_info
        }
        if(this.position == 3) {
            logo_id = R.mipmap.energy
            title = R.string.energy_engineering
            background_id = R.mipmap.energy_eng
            info_str =  R.string.energy_engineering_info
        }
        if(this.position == 4) {
            logo_id = R.mipmap.industrial
            title = R.string.industrial_engineering
            background_id = R.mipmap.ind_eng
            info_str =  R.string.industrial_engineering_info
        }
        if(this.position == 5) {
            logo_id = R.mipmap.mechatronics
            title = R.string.mechatronics_engineering
            background_id = R.mipmap.mech_eng
            info_str =  R.string.mechatronics_engineering_info
        }
        if(this.position == 6) {
            logo_id = R.mipmap.molecular
            title = R.string.molecular_engineering
            background_id = R.mipmap.mole_eng
            info_str =  R.string.molecular_engineering_info
        }
    }


    fun nextButtonClick(){
        if(this.position<6)
            ++this.position
        else
            this.position=6

        Log.d("DVM next","Position : "+this.position)

        if(this.position == 0) {
            logo_id = R.mipmap.civil
            title = R.string.civil_engineering
            background_id = R.mipmap.cvl_eng
            info_str =  R.string.civil_engineering_info
        }
        if(this.position == 1) {
            logo_id = R.mipmap.computer
            title = R.string.computer_engineering
            background_id = R.mipmap.computer_eng
            info_str =  R.string.computer_engineering_info
        }
        if(this.position == 2) {
            logo_id = R.mipmap.electronics
            title = R.string.electronic_engineering
            background_id = R.mipmap.elect_eng
            info_str =  R.string.electronic_engineering_info
        }
        if(this.position == 3) {
            logo_id = R.mipmap.energy
            title = R.string.energy_engineering
            background_id = R.mipmap.energy_eng
            info_str =  R.string.energy_engineering_info
        }
        if(this.position == 4) {
            logo_id = R.mipmap.industrial
            title = R.string.industrial_engineering
            background_id = R.mipmap.ind_eng
            info_str =  R.string.industrial_engineering_info
        }
        if(this.position == 5) {
            logo_id = R.mipmap.mechatronics
            title = R.string.mechatronics_engineering
            background_id = R.mipmap.mech_eng
            info_str =  R.string.mechatronics_engineering_info
        }
        if(this.position == 6) {
            logo_id = R.mipmap.molecular
            title = R.string.molecular_engineering
            background_id = R.mipmap.mole_eng
            info_str =  R.string.molecular_engineering_info
        }
    }


    fun prevButtonClick(){
        if(this.position > 0)
            --this.position
        else
            this.position=0

        Log.d("DVM prev","Position : "+this.position)

        if(this.position == 0) {
            logo_id = R.mipmap.civil
            title = R.string.civil_engineering
            background_id = R.mipmap.cvl_eng
            info_str =  R.string.civil_engineering_info
        }
        if(this.position == 1) {
            logo_id = R.mipmap.computer
            title = R.string.computer_engineering
            background_id = R.mipmap.computer_eng
            info_str =  R.string.computer_engineering_info
        }
        if(this.position == 2) {
            logo_id = R.mipmap.electronics
            title = R.string.electronic_engineering
            background_id = R.mipmap.elect_eng
            info_str =  R.string.electronic_engineering_info
        }
        if(this.position == 3) {
            logo_id = R.mipmap.energy
            title = R.string.energy_engineering
            background_id = R.mipmap.energy_eng
            info_str =  R.string.energy_engineering_info
        }
        if(this.position == 4) {
            logo_id = R.mipmap.industrial
            title = R.string.industrial_engineering
            background_id = R.mipmap.ind_eng
            info_str =  R.string.industrial_engineering_info
        }
        if(this.position == 5) {
            logo_id = R.mipmap.mechatronics
            title = R.string.mechatronics_engineering
            background_id = R.mipmap.mech_eng
            info_str =  R.string.mechatronics_engineering_info
        }
        if(this.position == 6) {
            logo_id = R.mipmap.molecular
            title = R.string.molecular_engineering
            background_id = R.mipmap.mole_eng
            info_str =  R.string.molecular_engineering_info
        }
    }

    override fun onCleared() {
        super.onCleared()
    }
    override fun toString(): String {

       var str = "logo : "+logo_id+" background : "+background_id+" title: "+title+" info : "+info_str

        return str
    }
}