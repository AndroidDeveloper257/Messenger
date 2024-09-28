package uz.mobiler.messenger

import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        val splashScreen = installSplashScreen()
        var keepSplashOn = true
        splashScreen.setKeepOnScreenCondition { keepSplashOn }
        Handler(Looper.getMainLooper()).postDelayed({
            keepSplashOn = false
            Log.d("TAG", "onCreate: splash off")
        }, 3000)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}