package com.watermelonkode.simpletemplate

class JvmPlatform(override val name: String) : Platform

actual fun getPlatform(): Platform {
     return JvmPlatform("Desktop (JVM) ${System.getProperty("os.name")} ${System.getProperty("os.version")}")
}