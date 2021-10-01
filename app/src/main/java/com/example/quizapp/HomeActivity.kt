 package com.example.quizapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_quiz.*

 class HomeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quiz)

        window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_FULLSCREEN

        StartButton.setOnClickListener {
            if(EditTextName.text.toString().isEmpty()){
                Toast.makeText(this,"Please enter your name",Toast.LENGTH_SHORT).show()
            }
            else{
                val intent = Intent(this,QuestionActivity::class.java)
                intent.putExtra(QuestionsList.USER_NAME,EditTextName.text.toString())
                startActivity(intent)
                finish()
            }
        }

    }
}