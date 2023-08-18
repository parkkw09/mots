package app.peter.mots.data.repositories

import app.peter.mots.data.source.model.seoul.cultural.CulturalEventInfo
import app.peter.mots.data.source.remote.SeoulApi
import app.peter.mots.data.tool.network.Network

class SeoulRepository(private val key: String) {

    private val api = SeoulApi(Network.getClient(), key)

    suspend fun getCulturalEvent(pageStart: Int = 1, pageEnd: Int = 5): CulturalEventInfo {
        return api.getCulturalEvent(pageStart, pageEnd).info
    }
}