package com.estrabela_appdev

import android.app.Application
import com.facebook.react.ReactApplication
import com.facebook.react.ReactNativeHost
import com.facebook.react.ReactPackage

class MainApplication : Application(), ReactApplication {

  override val reactNativeHost: ReactNativeHost by lazy {
    object : ReactNativeHost(this) {
      override fun getPackages(): List<ReactPackage> = emptyList()

      override fun getJSMainModuleName(): String = "index"

      override fun getUseDeveloperSupport(): Boolean = BuildConfig.DEBUG
    }
  }

  override fun onCreate() {
    super.onCreate()
  }
}
