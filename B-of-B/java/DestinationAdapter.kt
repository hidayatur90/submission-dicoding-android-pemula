package com.example.beautyofbondowoso

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class DestinationAdapter(private val listDestination : ArrayList<Destination>): RecyclerView.Adapter<DestinationAdapter.CardViewViewHolder>() {

    inner class CardViewViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView){
        var imgPhoto: ImageView = itemView.findViewById(R.id.img_item_photo)
        var tvName: TextView = itemView.findViewById(R.id.tv_item_name)
        var tvDetail: TextView = itemView.findViewById(R.id.tv_item_detail)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardViewViewHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.list_place, parent, false)
        return CardViewViewHolder(view)
    }

    override fun onBindViewHolder(holder: CardViewViewHolder, position: Int) {
        val destination = listDestination[position]
        Glide.with(holder.itemView.context)
            .load(destination.photo)
            .apply(RequestOptions().override(350, 550))
            .into(holder.imgPhoto)
        holder.tvName.text = destination.name
        holder.tvDetail.text = destination.description
        val mContext = holder.itemView.context

        holder.itemView.setOnClickListener {
            Toast.makeText(holder.itemView.context, "Beralih ke " + listDestination[holder.adapterPosition].name,
                Toast.LENGTH_SHORT).show()

            val moveDetail = Intent(mContext, DetailsDestinationActivity::class.java)
            moveDetail.putExtra(DetailsDestinationActivity.EXTRA_NAME, listDestination[holder.adapterPosition].name)
            moveDetail.putExtra(DetailsDestinationActivity.EXTRA_PHOTO, listDestination[holder.adapterPosition].photo)
            moveDetail.putExtra(DetailsDestinationActivity.EXTRA_LOCATION, listDestination[holder.adapterPosition].location)
            moveDetail.putExtra(DetailsDestinationActivity.EXTRA_HTM, listDestination[holder.adapterPosition].htm)
            moveDetail.putExtra(DetailsDestinationActivity.EXTRA_DETAIL, listDestination[holder.adapterPosition].description)
            moveDetail.putExtra(DetailsDestinationActivity.EXTRA_MAPS, listDestination[holder.adapterPosition].onMaps)
            mContext.startActivity(moveDetail)}
    }

    override fun getItemCount(): Int {
        return listDestination.size
    }
}