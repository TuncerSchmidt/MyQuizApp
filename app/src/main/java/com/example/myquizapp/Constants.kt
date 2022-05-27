package com.example.myquizapp

object Constants {

    const val USER_NAME: String = "user_name"
    const val TOTAL_QUESTIONS: String = "total_questions"
    const val CORRECT_ANSWERS: String = "correct_answers"

    fun getQuestions(): ArrayList<Question>{
        val questionList = ArrayList<Question>()

        val que1 = Question(
            1, "What country does this flag belong to?", R.drawable.ic_flag_of_argentina, "Argentina", "Australia",
            "Armenia", "Austria", 1
        )
        questionList.add(que1)
        val que2 = Question(
            1, "What country does this flag belong to?", R.drawable.ic_flag_of_argentina, "Argentina", "Australia",
            "Armenia", "Austria", 1
        )
        questionList.add(que2)
        val que3 = Question(
            1, "What country does this flag belong to?", R.drawable.ic_flag_of_argentina, "Argentina", "Australia",
            "Armenia", "Austria", 1
        )
        questionList.add(que3)
        val que4 = Question(
            1, "What country does this flag belong to?", R.drawable.ic_flag_of_argentina, "Argentina", "Australia",
            "Armenia", "Austria", 1
        )
        questionList.add(que4)
        val que5 = Question(
            1, "What country does this flag belong to?", R.drawable.ic_flag_of_argentina, "Argentina", "Australia",
            "Armenia", "Austria", 1
        )
        questionList.add(que5)

        val que6 = Question(
            1, "What country does this flag belong to?", R.drawable.ic_flag_of_argentina, "Argentina", "Australia",
            "Armenia", "Austria", 1
        )
        questionList.add(que6)
        return questionList
    }
}