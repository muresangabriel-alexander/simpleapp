package com.example.simpleapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    private lateinit var passiveAdapter: PassiveClickerAdapter
    var ClickCount: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val passiveList: MutableList<PassiveClickers> = mutableListOf(
            PassiveClickers(2, 3, 0,"+3/s"),
            PassiveClickers(10, 6, 0,"+6/s"),
            PassiveClickers(2, 10, 0,"+10/s")
            )

        passiveAdapter = PassiveClickerAdapter(passiveList)

    }
}