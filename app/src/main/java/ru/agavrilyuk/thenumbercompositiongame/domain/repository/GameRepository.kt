package ru.agavrilyuk.thenumbercompositiongame.domain.repository

import ru.agavrilyuk.thenumbercompositiongame.domain.entity.GameSettings
import ru.agavrilyuk.thenumbercompositiongame.domain.entity.Level
import ru.agavrilyuk.thenumbercompositiongame.domain.entity.Question

interface GameRepository {
    fun generateQuestion(
        maxSumValue: Int,
        countOfOptions: Int
    ): Question

    fun getGameSettings(level: Level): GameSettings
}