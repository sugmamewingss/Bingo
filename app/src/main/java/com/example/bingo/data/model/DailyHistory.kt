package com.example.bingo.data.model

data class DailyHistory(
    val date: String,
    val missionsCompleted: Int,
    val quizzesCompleted: Int = 0,
    val modulesCompleted: Int = 0,
    val xpGained: Int,
    val coinsGained: Int
)
