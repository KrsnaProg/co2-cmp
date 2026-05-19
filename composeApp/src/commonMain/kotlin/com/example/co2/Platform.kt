package com.example.co2

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform