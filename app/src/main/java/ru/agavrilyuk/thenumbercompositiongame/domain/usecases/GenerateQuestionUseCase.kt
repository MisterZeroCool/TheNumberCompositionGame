package ru.agavrilyuk.thenumbercompositiongame.domain.usecases

import ru.agavrilyuk.thenumbercompositiongame.domain.entity.Question
import ru.agavrilyuk.thenumbercompositiongame.domain.repository.GameRepository

class GenerateQuestionUseCase(
    private val repository: GameRepository
) {
    operator fun invoke(maxSumValue: Int): Question{
        return repository.generateQuestion(maxSumValue, COUNT_OF_OPTIONS)
    }

    private companion object{
        private const val  COUNT_OF_OPTIONS = 6
    }
}