package com.doruk.kmptemplate

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform