package app.peter.mots.data.source.model.seoul.cultural

import com.google.gson.annotations.SerializedName

data class CulturalEventInfoResponse(
    @SerializedName("culturalEventInfo") val info: CulturalEventInfo
)