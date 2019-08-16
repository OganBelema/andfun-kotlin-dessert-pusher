package com.example.android.dessertpusher

import android.app.Application
import timber.log.Timber

/**
 * Created by Belema Ogan on 2019-08-17.
 */
class MyApp: Application() {

    override fun onCreate() {
        super.onCreate()
        Timber.plant(Timber.DebugTree())
    }
}