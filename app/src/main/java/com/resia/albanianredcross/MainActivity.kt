package com.resia.albanianredcross


import android.os.Bundle
import android.view.Window
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.fragment.findNavController
import androidx.navigation.ui.setupWithNavController
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.resia.albanianredcross.R.id.bottom_navigation

@Suppress("DEPRECATION")
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportRequestWindowFeature(Window.FEATURE_NO_TITLE)
        supportActionBar?.hide()
        setContentView(R.layout.activity_main)

        window.statusBarColor = ContextCompat.getColor(this, R.color.purple_200)




        val navHost = supportFragmentManager.findFragmentById(R.id.nav_host_fragment) as NavHostFragment
        val navController = navHost.findNavController()

        //supportFragmentManager.beginTransaction().replace(R.id.FrameL, Home()).commit()
        val bottomNav : BottomNavigationView = findViewById(bottom_navigation)
        bottomNav.setupWithNavController(navController)

        //bottomNav.setOnNavigationItemSelectedListener(navListener)
    }

    /*val navListener = BottomNavigationView.OnNavigationItemSelectedListener {

        when(it.itemId) {
            R.id.home -> {
                currentFragment = Home()
            }
            R.id.learn -> {
                currentFragment = Learn()
            }
            R.id.emergency -> {
                currentFragment = Emergency()
            }
        }
        supportFragmentManager.beginTransaction().replace(R.id.FrameL, currentFragment).commit()
        true
    }*/
}


// donation
// activity
// volunteer
// program













