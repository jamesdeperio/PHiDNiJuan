package pocketcoder.idnijuan.presentation.base.adapter

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup


abstract class PocketAdapter : RecyclerView.Adapter<RecyclerView.ViewHolder>(), PocketAdapterContract.Adapter {
    private lateinit var pocketViewHolderList: PocketViewHolder

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder? {
        pocketViewHolderList.setView(LayoutInflater.from(parent.context).inflate(pocketViewHolderList.initContentView(), parent, false))
        return pocketViewHolderList.viewHolder
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        pocketViewHolderList.onCreateView(holder.itemView,position)
    }
    override fun getItemCount(): Int = dataCount
    override fun getItemViewType(position: Int): Int = viewTypeCondition(position)
    override fun viewTypeCondition(position: Int): Int = 0

    override fun addViewHolder(viewHolder: PocketViewHolder) {
        pocketViewHolderList=viewHolder
    }

}

