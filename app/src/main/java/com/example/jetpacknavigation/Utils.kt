package com.example.jetpacknavigation

import androidx.navigation.NavOptions

object Utils {
    fun navOptions():NavOptions{
        return NavOptions.Builder()
            .setEnterAnim(R.anim.slide_out_right)
            .setEnterAnim(R.anim.slide_out_left)
            .build()
    }
}