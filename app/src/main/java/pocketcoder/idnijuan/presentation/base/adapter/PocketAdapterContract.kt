package pocketcoder.idnijuan.presentation.base.adapter

import android.view.View

/**
 * Created by jamesdeperio on 9/1/2017
 * library.jdp.jdppattern.adapter
 */

internal interface PocketAdapterContract {
    interface Adapter {
        fun viewTypeCondition(position: Int): Int
        val dataCount: Int
        fun addViewHolder(viewHolder: PocketViewHolder)
    }

    interface Holder {
        fun initContentView(): Int
         fun onBindEvent(view: View, position: Int)
        fun setView(view: View)
        fun onCreateView(view: View, position: Int)
    }
}
