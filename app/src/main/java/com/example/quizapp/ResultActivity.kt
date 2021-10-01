package com.example.quizapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_result.*

class ResultActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_FULLSCREEN

        val username = intent.getStringExtra(QuestionsList.USER_NAME)
        TextViewUserName.text = username

        val totalquestions = intent.getIntExtra(QuestionsList.TOTAL_QUESTIONS,0)
        val correctanswers = intent.getIntExtra(QuestionsList.CORRECT_ANSWERS,0)
        TextViewScore.text = "Your Score is $correctanswers out of $totalquestions"

        ButtonFinish.setOnClickListener {
            startActivity(Intent(this,HomeActivity::class.java))
            finish()
        }
    }
}