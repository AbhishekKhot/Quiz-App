package com.example.quizapp

import android.content.Intent
import android.graphics.Color
import android.graphics.Typeface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.core.content.ContextCompat
import kotlinx.android.synthetic.main.activity_quiz_question.*

class QuestionActivity : AppCompatActivity(), View.OnClickListener {

    private var mCurrentPosition:Int = 1
    private var mQuestionsList: ArrayList<QuestionData>? = null
    private var mSelectddOptionPosition: Int = 0
    private var mCorrectAnswer:Int = 0
    private var mUserName: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quiz_question)

        window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_FULLSCREEN

        mUserName = intent.getStringExtra(QuestionsList.USER_NAME)

        mQuestionsList = QuestionsList.getQuestions()
        setQuestion()

        TextViewOptionOne.setOnClickListener(this)
        TextViewOptionTwo.setOnClickListener(this)
        TextViewOptionThree.setOnClickListener(this)
        TextViewOptionFour.setOnClickListener(this)
        ButtonSubmit.setOnClickListener(this)

    }

    private fun setQuestion() {

        val question = mQuestionsList!![mCurrentPosition-1]

        ProgressBar.progress = mCurrentPosition
        TextViewProgressBar.text = "$mCurrentPosition" + "/" + ProgressBar.max

        defaultOptionsView()

        if(mCurrentPosition == mQuestionsList!!.size){
            ButtonSubmit.text = "FINISH"
        }else{
            ButtonSubmit.text = "SUBMIT"
        }

        TextViewQuestion.text = question!!.question
        ImageViewAnimal.setImageResource(question.image)
        TextViewOptionOne.text = question.optionOne
        TextViewOptionTwo.text = question.optionTwo
        TextViewOptionThree.text = question.optionThree
        TextViewOptionFour.text = question.optionFour
    }

    private fun defaultOptionsView(){
        val options = ArrayList<TextView>()
        options.add(0,TextViewOptionOne)
        options.add(1,TextViewOptionTwo)
        options.add(2,TextViewOptionThree)
        options.add(3,TextViewOptionFour)

        for (option in options){
            option.setTextColor(Color.parseColor("#7A8089"))
            option.typeface = Typeface.DEFAULT
            option.background = ContextCompat.getDrawable(this,R.drawable.option_background)
        }
    }

    override fun onClick(view: View?) {
        when(view?.id){
            R.id.TextViewOptionOne ->{ selectedOptionView(TextViewOptionOne,1) }
            R.id.TextViewOptionTwo ->{ selectedOptionView(TextViewOptionTwo,2) }
            R.id.TextViewOptionThree ->{ selectedOptionView(TextViewOptionThree,3) }
            R.id.TextViewOptionFour ->{ selectedOptionView(TextViewOptionFour,4) }
            R.id.ButtonSubmit ->{
                if(mSelectddOptionPosition == 0){
                    mCurrentPosition++
                    when{
                        mCurrentPosition <= mQuestionsList!!.size ->{
                            setQuestion()
                        }else ->{
                           val intent = Intent(this,ResultActivity::class.java)
                            intent.putExtra(QuestionsList.USER_NAME,mUserName)
                            intent.putExtra(QuestionsList.CORRECT_ANSWERS, mCorrectAnswer)
                            intent.putExtra(QuestionsList.TOTAL_QUESTIONS, mQuestionsList!!.size)
                            startActivity(intent)
                            finish()
                        }
                    }
                }
                else{
                   val question = mQuestionsList?.get(mCurrentPosition -1)
                   if(question!!.correctAnswer != mSelectddOptionPosition){
                       answerView(mSelectddOptionPosition,R.drawable.wrong_option_background)
                   }else{
                       mCorrectAnswer++
                   }
                    answerView(question.correctAnswer,R.drawable.correct_option_background)

                    if(mCurrentPosition==mQuestionsList?.size){
                        ButtonSubmit.text = "FINISH"
                    }
                    else{
                        ButtonSubmit.text = "NEXT QUESTION"
                    }
                    mSelectddOptionPosition = 0
                }
            }
        }
    }

    private fun answerView(answer: Int, drawbleView: Int){
        when(answer){
            1->{TextViewOptionOne.background = ContextCompat.getDrawable(this,drawbleView)}
            2->{TextViewOptionTwo.background = ContextCompat.getDrawable(this,drawbleView)}
            3->{TextViewOptionThree.background = ContextCompat.getDrawable(this,drawbleView)}
            4->{TextViewOptionFour.background = ContextCompat.getDrawable(this,drawbleView)}
        }
    }
    private fun selectedOptionView(tv:TextView, selectedOptionNum:Int){
        defaultOptionsView()
        mSelectddOptionPosition = selectedOptionNum

        tv.setTextColor(Color.parseColor("#000000"))
        tv.setTypeface(tv.typeface,Typeface.BOLD_ITALIC)
        tv.background = ContextCompat.getDrawable(this,R.drawable.selected_option_background)
    }
}