package com.polskitv.ultimate
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.stremio.core.Core
import com.stremio.core.runtime.AndroidEnv
import com.stremio.core.storage.AndroidStorage

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        try { Core(AndroidStorage(this), AndroidEnv(this)) } catch (e: Exception) {}
        setContent { androidx.compose.material3.Text("NeoTV Ultimate Działa!") }
    }
}