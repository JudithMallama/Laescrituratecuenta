package com.mallama.laescrituratecuenta

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.view.MenuItem
import androidx.appcompat.app.ActionBar
import androidx.appcompat.app.ActionBarDrawerToggle
import com.mallama.laescrituratecuenta.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
   private lateinit var mainBinding: ActivityMainBinding
    private lateinit var toogle:ActionBarDrawerToggle

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
       mainBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(mainBinding.root)
        setContentView(R.layout.activity_main)

        toogle =ActionBarDrawerToggle(this,mainBinding.drawerLayout, R.string.open_drawer,R.string.close_drawer)
        mainBinding.drawerLayout.addDrawerListener(toogle)
        toogle.syncState()

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

  
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {

        if (toogle.onOptionsItemSelected(item))
            {
                return true
            }
        return super.onOptionsItemSelected(item)
    }
}