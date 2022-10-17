package id.bakode.kmm.data.source.remote

import id.bakode.kmm.data.models.RocketLaunch
import io.ktor.client.call.*
import io.ktor.client.request.*

class RocketLaunchDataSource {
    companion object {
        const val API_URL = "https://api.spacexdata.com/v4";
    }

    suspend fun getRocketList(): List<RocketLaunch> {
        return HttpClient()
            .get("$API_URL/launches")
            .body()
    }
}