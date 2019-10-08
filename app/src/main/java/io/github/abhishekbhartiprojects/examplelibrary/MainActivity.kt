package io.github.abhishekbhartiprojects.examplelibrary

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import io.github.abhishekbhartiprojects.example2lib.Example2Lib
import io.github.abhishekbhartiprojects.examplelib.Example1Lib
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        tvText1.text = Example1Lib().TAG
        tvText2.text = Example2Lib().TAG
    }
}
