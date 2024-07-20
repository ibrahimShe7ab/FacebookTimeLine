package com.example.facebooktimeline

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView.Adapter
import androidx.recyclerview.widget.RecyclerView.ViewHolder

class facebookAdapter(val items:List<FacebookDataClass>):
    Adapter<facebookAdapter.facebookViewholder>() {
    class facebookViewholder(val itemView:View):ViewHolder(itemView){
        var profile_img:ImageView=itemView.findViewById(R.id.profile_image)
        var post_img:ImageView=itemView.findViewById(R.id.img_post)
        var share_img:ImageView=itemView.findViewById(R.id.profile_image2)
        var time:TextView=itemView.findViewById(R.id.time_ic)
        var post_text:TextView=itemView.findViewById(R.id.text_post)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): facebookViewholder {
       val view=LayoutInflater.from(parent.context).inflate(R.layout.post_item,parent,false)
        return facebookViewholder(view)
    }

    override fun getItemCount(): Int {
      return items.size
    }

    override fun onBindViewHolder(holder: facebookViewholder, position: Int) {
       val item: FacebookDataClass =items[position]
        holder.time.text= item.time.toString()
        holder.post_img.setImageResource(item.profile_img)
        holder.profile_img.setImageResource(item.profile_img)
        holder.share_img.setImageResource(item.profile_img)
        holder.post_text.text=item.post_text



    }


}