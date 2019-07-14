package com.stevandoh

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_a.*

class ActivityA : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_a)
        supportActionBar?.title = "ALC 4 Phase 1"

        btnToActivityB.setOnClickListener {
            startActivity(Intent(this, ActivityB::class.java))
        }

        btnToActivityC.setOnClickListener {
            startActivity(Intent(this, ActivityC::class.java))
        }
    }
}
