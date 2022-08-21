package io.github.droidkaigi.confsched2022.data.sessions

import io.github.droidkaigi.confsched2022.model.DroidKaigiSchedule
import io.github.droidkaigi.confsched2022.model.SessionsRepository
import io.github.droidkaigi.confsched2022.model.Timetable
import io.github.droidkaigi.confsched2022.model.TimetableItemId
import io.github.droidkaigi.confsched2022.model.fake
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flowOf

class FakeSessionsRepository : SessionsRepository {
    override fun droidKaigiScheduleFlow(): Flow<DroidKaigiSchedule> {
        return flowOf(
            DroidKaigiSchedule.of(Timetable.fake())
        )
    }

    override suspend fun refresh() {
    }

    override suspend fun setFavorite(sessionId: TimetableItemId, favorite: Boolean) {
    }
}
