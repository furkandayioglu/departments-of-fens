package com.example.deparmetnsoffens


import android.content.res.Resources
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.lifecycle.ViewModelProvider

/**
 * A simple [Fragment] subclass.
 */
class DepartmentInfoFragment : Fragment() {


    lateinit var  model : DepartmentsViewModel
    lateinit var button_prev: Button
    lateinit var button_next: Button
    lateinit var fLayout : ConstraintLayout
    lateinit var title : TextView
    lateinit var fInfo : TextView
    lateinit var fLogo : ImageView

    val TAG ="DiFragment"
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        var v : View = inflater.inflate(R.layout.fragment_department_info, container, false)
        model = ViewModelProvider(requireActivity()).get(DepartmentsViewModel::class.java)

        Log.d(TAG,activity.toString())
        Log.d(TAG,model.toString())

        initialize_ui(v)

        set_UI()


        button_prev.setOnClickListener{
            model.prevButtonClick(model.position)
            set_UI()
        }

        button_next.setOnClickListener{
            model.nextButtonClick(model.position)
            set_UI()
        }

        return v
    }


    fun initialize_ui(v : View){

        fLayout = v.findViewById(R.id.cl_fragment_layout)
        fLogo = v.findViewById(R.id.im_fragment_logo)
        title = v.findViewById(R.id.tv_fragment_title)
        fInfo = v.findViewById(R.id.tv_fragment_info)
        button_prev = v.findViewById(R.id.btn_fragment_prev)
        button_next = v.findViewById(R.id.btn_fragment_next)

    }

    fun set_UI(){

        model?.background_id?.let { fLayout.setBackgroundResource(it) }
        model?.logo_id?.let { fLogo.setImageResource(it) }
        title.text = model?.title?.let { resources.getString(it) }
        fInfo.text = model?.info_str?.let { resources.getString(it) }

        Log.d("DepartmentActivity",model.toString())
    }
}
