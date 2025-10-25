package com.hexated

import android.content.Context 
import com.lagradost.cloudstream3.plugins.CloudstreamPlugin 
import com.lagradost.cloudstream3.plugins.Plugin

@CloudstreamPlugin 
class MovieboxPlugin : Plugin() { 
  override fun load(context: Context) { 
    // Register the provider (MainAPI) to Cloudstream // This method ensures proper initialization during plugin load. 
    registerMainAPI(Moviebox()) 
  } 
}
