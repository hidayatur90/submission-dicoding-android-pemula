package com.example.beautyofbondowoso

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class DetailsDestinationActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_details_destination)

        val actionbar = supportActionBar

        val tvName: TextView = findViewById(R.id.tv_destination_name)
        val imgPhoto: ImageView = findViewById(R.id.img_detail_photo)
        val tvLocation: TextView = findViewById(R.id.tv_location)
        val tvHtm: TextView = findViewById(R.id.tv_htm)
        val tvDetails: TextView = findViewById(R.id.tv_destination_detail)
        val btnMaps: Button = findViewById(R.id.btn_maps)
        btnMaps.setOnClickListener(this)

        val tName  = intent.getStringExtra(EXTRA_NAME)
        val tImg = intent.getIntExtra(EXTRA_PHOTO, 0)
        val tLocation = intent.getStringExtra(EXTRA_LOCATION)
        val tHtm = intent.getStringExtra(EXTRA_HTM)
        val tDetail = intent.getStringExtra(EXTRA_DETAIL)
        val tMaps = intent.getStringExtra(EXTRA_MAPS)

        tvName.text = tName
        Glide.with(this)
            .load(tImg)
            .apply(RequestOptions())
            .into(imgPhoto)
        tvLocation.text = tLocation
        tvHtm.text = tHtm
        tvDetails.text = tDetail
        val urlDestination = tMaps

        if (urlDestination != null) {
            EXTRA_MAPS = urlDestination
        }

        actionbar!!.title = tName
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
    }

    companion object {
        const val EXTRA_NAME = "extra_name"
        const val EXTRA_PHOTO = "extra_photo"
        const val EXTRA_LOCATION = "extra_location"
        const val EXTRA_HTM = "extra_htm"
        const val EXTRA_DETAIL = "extra_detail"
        var EXTRA_MAPS = "extra_maps"
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }

    override fun onClick(v: View?){
        when(v?.id) {
            R.id.btn_maps -> {
                val gmmIntentUri = Uri.parse(EXTRA_MAPS)
                val mapIntent = Intent(Intent.ACTION_VIEW, gmmIntentUri)
                mapIntent.setPackage("com.google.android.apps.maps")
                startActivity(mapIntent)
            }
        }
    }

}