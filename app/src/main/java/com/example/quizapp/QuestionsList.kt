package com.example.quizapp

object QuestionsList{

    const val USER_NAME: String = "user_name"
    const val TOTAL_QUESTIONS: String = "total_question"
    const val CORRECT_ANSWERS: String = "correct_answers"

    fun getQuestions(): ArrayList<QuestionData>{
        val questionList = ArrayList<QuestionData>()

        val question1 = QuestionData(1, "what is the name of the animal given below?", R.drawable.cow,
            "Cow",
            "Monkey",
            "Lion",
            "Dog", 1)
        questionList.add(question1)

        val question2 = QuestionData(2, "what is the name of the animal given below?", R.drawable.horse,
            "Donkey",
            "Lion",
            "Horse",
            "Cat", 3)
        questionList.add(question2)

        val question3 = QuestionData(3, "what is the name of the animal given below?", R.drawable.dog,
            "Donkey",
            "Giraffe",
            "Cow",
            "Dog", 4)
        questionList.add(question3)

        val question4 = QuestionData(4, "what is the name of the animal given below?", R.drawable.elephant,
            "Elephant",
            "Duck",
            "Peacock",
            "Cock", 1)
        questionList.add(question4)

        val question5 = QuestionData(5, "what is the name of the animal given below?", R.drawable.cat,
            "Donkey",
            "Lion",
            "Cat",
            "wolf", 3)
        questionList.add(question5)

        val question6 = QuestionData(6, "what is the name of the animal given below?", R.drawable.fox,
            "Donkey",
            "Lion",
            "Fox",
            "Cat", 3)
        questionList.add(question6)

        val question7 = QuestionData(7, "what is the name of  the animal given below?", R.drawable.giraffe,
            "Giraffe",
            "Wolf",
            "Fox",
            "Cat", 1)
        questionList.add(question7)

        val question8 = QuestionData(8, "what is the name of the animal given below?", R.drawable.gorilla,
            "Hypepotamus",
            "Gorilla",
            "Horse",
            "Bullock", 2)
        questionList.add(question8)

        val question9 = QuestionData(9, "what is the name of  the animal given below?", R.drawable.sheep,
            "Wolf",
            "Sheep",
            "Leopard",
            "Fox", 2)
        questionList.add(question9)

        val question10 = QuestionData(10, "what is the name of  the animal given below?", R.drawable.lion,
            "Sparrow",
            "Lion",
            "Crow",
            "Swan", 2)
        questionList.add(question10)

        val question11 = QuestionData(11, "what is the name of  the animal given below?", R.drawable.leopard,
            "Leopard",
            "Lion",
            "Bat",
            "Cat", 1)
        questionList.add(question11)

        val question12 = QuestionData(12, "what is the name of  the animal given below?", R.drawable.snake,
            "Donkey",
            "Dolphin",
            "Wolf",
            "Snake", 4)
        questionList.add(question12)

        val question13 = QuestionData(13, "what is the name of  the animal given below?", R.drawable.swan,
            "Rabbit",
            "Swan",
            "Mouse",
            "Ship", 2)
        questionList.add(question13)

        val question14 = QuestionData(14, "what is the name of the animal given below?", R.drawable.tiger,
            "Dinosaurs",
            "Tiger",
            "Hypepomatus",
            "Cat", 2)
        questionList.add(question14)

        val question15 = QuestionData(15, "what is the name of the animal given below?", R.drawable.tortoise,
            "Dear",
            "Tortoise",
            "Tiger",
            "Donkey", 2)
        questionList.add(question15)

        val question16 = QuestionData(16, "what is the name of the animal given below?", R.drawable.wolf,
            "Wolf",
            "Ship",
            "Horse",
            "Camel", 1)
        questionList.add(question16)

        val question17 = QuestionData(17, "what is the name of the animal given below?", R.drawable.zebra,
            "Duck",
            "Zebra",
            "Swan",
            "Cat", 2)
        questionList.add(question17)

        val question18 = QuestionData(18, "what is the name of the animal given below?", R.drawable.monkey,
            "Lion",
            "Monkey",
            "Horse",
            "Cat", 2)
        questionList.add(question18)

        val question19 = QuestionData(19, "what is the name of the animal given below?", R.drawable.rhinoceros,
            "Tiger",
            "Lion",
            "Rhinoceros",
            "Fox", 3)
        questionList.add(question19)

        val question20 = QuestionData(20, "what is the name of the animal given below?", R.drawable.hyena,
            "Giraffe",
            "Lion",
            "Zebra",
            "Hyena", 4)
        questionList.add(question20)

        val question21 = QuestionData(21, "what is the name of the animal given below?", R.drawable.aardvark,
            "Giraffe",
            "Lion",
            "aardvark",
            "Hyena", 3)
        questionList.add(question21)

        val question22 = QuestionData(22, "what is the name of the animal given belowl?", R.drawable.africanbuffalo,
            "Giraffe",
            "africanbuffalo",
            "aardvark",
            "Hyena", 2)
        questionList.add(question22)

        val question23 = QuestionData(23, "what is the name of the animal given below?", R.drawable.wildebeest,
            "Giraffe",
            "wildebeest",
            "aardvark",
            "Hyena", 2)
        questionList.add(question23)


        return questionList
    }
}