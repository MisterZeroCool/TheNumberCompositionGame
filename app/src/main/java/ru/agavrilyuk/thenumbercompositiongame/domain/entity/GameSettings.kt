package ru.agavrilyuk.thenumbercompositiongame.domain.entity

data class GameSettings(
    val maxSumValue: Int,
    val minCountOfRightAnswers: Int,
    val minPercentOfRightAnswers: Int,
    val gameTimeINSeconds: Int,
)