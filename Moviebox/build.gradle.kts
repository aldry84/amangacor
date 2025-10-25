plugins {
    id("com.lagradost.cloudstream3.gradle") version "1.0.0"
    kotlin("android") version "1.9.23"
}

version = 4 // Gunakan integer untuk versi plugin

cloudstream {
    // Bahasa utama
    language = "en"

    // Nama penulis
    authors = listOf("Hexated")

    /**
     * Status:
     * 0 = Down
     * 1 = Ok
     * 2 = Slow
     * 3 = Beta only
     */
    status = 1

    // Jenis konten yang didukung
    tvTypes = listOf(
        "TvSeries",
        "Movie",
        "Anime",
        "AsianDrama",
    )

    // Ikon
    iconUrl = "https://moviebox.ph/favicon.ico"

    // Deskripsi opsional
    description = "Moviebox source for Cloudstream 4 with TV, Movie, Anime, and Drama support."
}

repositories {
    google()
    mavenCentral()
    maven("https://jitpack.io")
}

dependencies {
    // Cloudstream core SDK (pastikan versi sesuai template SDK kamu)
    implementation("com.github.recloudstream:cloudstream:4.0.0")
}

kotlin {
    jvmToolchain(17)
}
