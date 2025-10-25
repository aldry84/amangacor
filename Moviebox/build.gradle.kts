plugins {
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

dependencies {
    implementation("com.github.recloudstream:cloudstream:4.0.0")
}

kotlin {
    jvmToolchain(17)
}
