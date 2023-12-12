package com.sammy.ums.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.sammy.ums.databinding.ItemRvBinding
import com.sammy.ums.models.Service

class TarifAdapter(val click: RvClick, val list: ArrayList<Service> = ArrayList()) : RecyclerView.Adapter<TarifAdapter.Vh>() {

    inner class Vh(var itemRvBinding: ItemRvBinding) : RecyclerView.ViewHolder(itemRvBinding.root) {

        fun onBind(service: Service, position: Int) {
            itemRvBinding.tarifTextView.text = service.name
            itemRvBinding.codeTextView.text = service.code
            itemRvBinding.infoTextView.text = service.info

            itemRvBinding.root.setOnClickListener {
                click.onClick(service)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Vh {
        return Vh(ItemRvBinding.inflate(LayoutInflater.from(parent.context), parent, false))
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: Vh, position: Int) {
        holder.onBind(list[position], position)

    }

    interface RvClick{
        fun onClick(service: Service)
    }

}