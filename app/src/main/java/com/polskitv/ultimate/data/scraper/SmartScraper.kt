package com.polskitv.ultimate.data.scraper
import org.jsoup.Jsoup
import kotlinx.coroutines.*
class SmartScraper {
    suspend fun search(q: String) = coroutineScope {
        async(Dispatchers.IO) {
            try { Jsoup.connect("https://cda.pl").get().select("a") }
            catch (e: Exception) { emptyList() }
        }
    }
}