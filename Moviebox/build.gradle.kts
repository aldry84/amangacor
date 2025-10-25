plugins {
    id("com.lagradost.cloudstream3.gradle")
    kotlin("android")
}

version = 4

cloudstream {
    language = "en"
    authors = listOf("Hexated")
    status = 1
    tvTypes = listOf(
        "TvSeries",
        "Movie",
        "Anime",
        "AsianDrama",
    )
    iconUrl = "https://moviebox.ph/favicon.ico"
    description = "Moviebox source for Cloudstream 4 with TV, Movie, Anime, and Drama support."
}

repositories {
    google()
    mavenCentral()
    maven("https://jitpack.io")
}

kotlin {
    jvmToolchain(17)
}
