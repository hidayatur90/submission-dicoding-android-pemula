package com.example.beautyofbondowoso

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.beautyofbondowoso.DestinationData.listData

class MainActivity : AppCompatActivity(){

    private lateinit var rvDestination: RecyclerView
    private var list: ArrayList<Destination> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rvDestination = findViewById(R.id.rv_destination)
        rvDestination.setHasFixedSize(true)

        list.addAll(listData)
        title = "Beauty of Bondowoso"
        showRecyclerCardView()

    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.profile, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        setMode(item.itemId)
        return super.onOptionsItemSelected(item)
    }

    private fun setMode(selectedMode: Int) {
        when (selectedMode) {
            R.id.btn_profile ->{
                val moveIntent = Intent(this@MainActivity, AboutMe::class.java)
                startActivity(moveIntent)
            }
        }
    }

    private fun showRecyclerCardView(){
        rvDestination.layoutManager = LinearLayoutManager(this)
        val destinationAdapter = DestinationAdapter(list)
        rvDestination.adapter = destinationAdapter
    }
}
