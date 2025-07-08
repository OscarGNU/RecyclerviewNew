package com.devspace.recyclerview

import android.os.Bundle
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val rvList = findViewById<RecyclerView>(R.id.rv_list)
        val ivList = findViewById<ImageView>(R.id.iv_list )
        val ivGrid = findViewById<ImageView>(R.id.iv_grid)
        val adapter = ContactListAdapter()



        rvList.adapter = adapter
        rvList.layoutManager = LinearLayoutManager (this)
        adapter.submitList(contacts)

        ivGrid.setOnClickListener{
            rvList.layoutManager = GridLayoutManager(this, 2)
        }

        ivList.setOnClickListener{
            rvList.layoutManager = LinearLayoutManager(this)
        }
        adapter.setOnClickListener { Contac -> }

    }
}

val contacts = listOf(
        Contac (
            name="Oscar",
            phone = "(+351)934084537",
            icon = R.drawable.sample1
        ),
    Contac(
        name = "Omar",
        phone = "(+58)04143582348",
        icon = R.drawable.sample2
    ),
    Contac(
        name = "Elisa",
        phone = "(+351)913910001",
        icon = R.drawable.sample3
    ),
    Contac(
        name = "Fabrizio",
        phone = "(+351)365254123",
        icon = R.drawable.sample4
    ),
    Contac(
        name = "Sabrina",
        phone = "(+351)145256321",
        icon = R.drawable.sample5
    ),

    Contac(
        name = "Omaira",
        phone ="(+58)789965478",
        icon = R.drawable.sample6
    ),
    Contac (
        name="Flor",
        phone = "(+351)934084537",
        icon = R.drawable.sample7
    ),
    Contac(
        name = "Florelis",
        phone = "(+58)04143582348",
        icon = R.drawable.sample8
    ),
    Contac(
        name = "Pacheco",
        phone = "(+351)913910001",
        icon = R.drawable.sample9
    ),
    Contac(
        name = "Scarleth",
        phone = "(+351)365254123",
        icon = R.drawable.sample10
    ),
    Contac(
        name = "Mingo",
        phone = "(+351)145256321",
        icon = R.drawable.sample11
    ),

    Contac(
        name = "Tiby",
        phone ="(+58)789965478",
        icon = R.drawable.sample12
    ),

    Contac(
        name = "Ingri",
        phone = "(+351)913910001",
        icon = R.drawable.sample13
    ),
    Contac(
        name = "Israel",
        phone = "(+351)365254123",
        icon = R.drawable.sample14
    ),
    Contac(
        name = "Jose",
        phone = "(+351)145256321",
        icon = R.drawable.sample15
    ),

    Contac(
        name = "Tia",
        phone ="(+58)789965478",
        icon = R.drawable.sample16
    ),
)