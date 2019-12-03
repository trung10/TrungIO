package com.example.login.extensions

import android.content.Context
import com.example.login.helpers.isMarshmallowPlus
import com.github.ajalt.reprint.core.Reprint

fun Context.isFingerPrintSensorAvailable() = isMarshmallowPlus() && Reprint.isHardwarePresent()
