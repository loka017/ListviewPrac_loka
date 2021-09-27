package com.ateam.listviewprac_loka.adapters

import android.content.Context
import android.widget.ArrayAdapter
import com.ateam.listviewprac_loka.datas.Student

class StudentAdapter(
    val mContext : Context,
    val resId : Int,
    val mList : ArrayList<Student> ) : ArrayAdapter<Student>(mContext, resId, mList) {
}