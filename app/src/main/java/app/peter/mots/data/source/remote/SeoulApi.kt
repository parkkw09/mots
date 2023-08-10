package app.peter.mots.data.source.remote

import app.peter.mots.data.source.model.seoul.cultural.CulturalEventInfo
import io.ktor.client.HttpClient
import io.ktor.client.call.body
import io.ktor.client.request.get
import io.ktor.client.statement.bodyAsText

class SeoulApi(private val client: HttpClient,
               private val key: String) {

    private val baseUrl = "http://openapi.seoul.go.kr:8088"

    suspend fun getCulturalEvent(pageStart: Int = 1, pageEnd: Int = 5): CulturalEventInfo {
        return client
        .get("${baseUrl}/${key}/json/culturalEventInfo/${pageStart}/${pageEnd}")
        .body()
    }

    suspend fun getCulturalEventString(pageStart: Int = 1, pageEnd: Int = 5): String {
        val response = client.get("${baseUrl}/${key}/json/culturalEventInfo/${pageStart}/${pageEnd}")
        return response.bodyAsText()
    }
}