package id.bakode.kmm

import id.bakode.kmm.data.models.RocketLaunch
import id.bakode.kmm.data.source.remote.RocketLaunchDataSource

class Greeting {
    private val platform: Platform = getPlatform()

    @Throws(Exception::class)
    suspend fun greeting(): String {
        val rocketDS = RocketLaunchDataSource()
        val getRocketList: List<RocketLaunch> = rocketDS.getRocketList()
        val lastSuccessLaunch = getRocketList.last { it.launchSuccess == true }

        return "Guess what it is! > ${platform.name.reversed()}!" +
                "\nThere are only ${daysUntilNewYear()} left until New Year! 🎅🏼 " +
                "\nThe last successful launch was ${lastSuccessLaunch.launchDateUTC} 🚀"
    }
}