package com.david.scannernfc

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform