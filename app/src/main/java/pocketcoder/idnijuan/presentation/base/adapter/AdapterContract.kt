package pocketcoder.idnijuan.presentation.base.adapter

import android.view.View


interface AdapterContract {
    fun isFooterSet(): Boolean
    fun bindSimpleItemLayout(holder: View, position: Int)
    fun bindHeaderLayout(holder: View, position: Int)
    fun bindFooterLayout(holder: View, position: Int)
    fun bindItemImageLayout(holder: View, position: Int)
    fun bindItemVideoLayout(holder: View, position: Int)
    fun ViewTypeCondition(position: Int): Int
    val dataCount: Int

}