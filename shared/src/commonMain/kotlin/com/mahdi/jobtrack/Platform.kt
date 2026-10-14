package com.mahdi.jobtrack

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform