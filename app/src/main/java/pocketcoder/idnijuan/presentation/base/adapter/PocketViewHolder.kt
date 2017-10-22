package pocketcoder.idnijuan.presentation.base.adapter

import android.support.v7.widget.RecyclerView
import android.view.View
import butterknife.ButterKnife

/**
 * Created by jamesdeperio on 9/1/2017
 * library.jdp.jdppattern.adapter
 */

abstract class PocketViewHolder : PocketAdapterContract.Holder {
    lateinit var viewHolder: RecyclerView.ViewHolder
    private inner class Holder internal constructor(itemView: View) : RecyclerView.ViewHolder(itemView)

    override fun onCreateView(view: View, position: Int) {
        ButterKnife.bind(this, view)
        onBindEvent(view,position)
    }
    override fun setView(view: View) {
        viewHolder = Holder(view)
    }
}
