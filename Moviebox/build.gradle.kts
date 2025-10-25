plugins {
    id("com.lagradost.cloudstream3.gradle") version "1.0.0"
    // Pastikan plugin ini sesuai dengan versi Cloudstream SDK kamu
}

version = 4 // Gunakan angka integer untuk versi

cloudstream {
    // Bahasa utama plugin
    language = "en"

    // Nama penulis atau pengembang
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

    // Ikon untuk plugin (bisa favicon atau logo)
    iconUrl = "https://moviebox.ph/favicon.ico"

    // Deskripsi opsional
    description = "Moviebox source for Cloudstream 4 with TV, Movie, Anime, and Drama support."
}
