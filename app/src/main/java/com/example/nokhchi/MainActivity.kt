package com.example.nokhchi
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val bottomNavigationView = findViewById<BottomNavigationView>(R.id.bottomNav)
        val firstfragment = ShopFragment()
        val secondFragment = ProfileFragment()
        showFragment(firstfragment)

        bottomNavigationView.setOnNavigationItemSelectedListener {
            when(it.itemId){
             R.id.atShop -> showFragment(firstfragment)
                R.id.atAccount -> showFragment(secondFragment)
            }
            true
        }
    }

    private fun showFragment(fragment: Fragment){
        supportFragmentManager.beginTransaction().apply {
            replace(R.id.flFragment, fragment)
            commit()
        }
    }
}