plugins { id("com.android.application"); id("org.jetbrains.kotlin.android"); id("kotlin-kapt") }
android { namespace = "com.polskitv.ultimate"; compileSdk = 34 }
dependencies {
    implementation("androidx.tv:tv-foundation:1.0.0-alpha10")
    implementation("androidx.media3:media3-exoplayer:1.2.0")
    implementation("org.jsoup:jsoup:1.17.2")
    implementation(fileTree(mapOf("dir" to "libs", "include" to listOf("*.aar"))))
}