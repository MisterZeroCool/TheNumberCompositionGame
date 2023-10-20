package ru.agavrilyuk.thenumbercompositiongame.domain.usecases

import ru.agavrilyuk.thenumbercompositiongame.domain.entity.GameSettings
import ru.agavrilyuk.thenumbercompositiongame.domain.entity.Level
import ru.agavrilyuk.thenumbercompositiongame.domain.repository.GameRepository

class GetGameSettingsUseCase(
    private val repository: GameRepository
) {

    operator fun invoke(level:Level): GameSettings{
        return repository.getGameSettings(level)
    }
}