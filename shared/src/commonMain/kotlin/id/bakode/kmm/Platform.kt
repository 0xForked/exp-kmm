package id.bakode.kmm

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform