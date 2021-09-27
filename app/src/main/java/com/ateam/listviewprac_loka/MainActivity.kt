package com.ateam.listviewprac_loka

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.ateam.listviewprac_loka.adapters.StudentAdapter
import com.ateam.listviewprac_loka.datas.Student
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    val mStudentList = ArrayList<Student>()

    lateinit var mAdapter : StudentAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mStudentList.add(Student("제스", 1988))
        mStudentList.add(Student("이상민", 1968))
        mStudentList.add(Student("박철수", 1960))
        mStudentList.add(Student("정재만", 1968))
        mStudentList.add(Student("이민규", 1966))
        mStudentList.add(Student("장소영", 1983))
        mStudentList.add(Student("오만수", 1998))

        mAdapter = StudentAdapter(this,R.layout.student_list_item, mStudentList)

        studentListView.adapter = mAdapter

    }
}