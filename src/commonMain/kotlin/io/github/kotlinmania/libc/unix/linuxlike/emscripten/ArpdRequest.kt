// port-lint: source unix/linux_like/emscripten/mod.rs
package io.github.kotlinmania.libc.unix.linuxlike.emscripten

import io.github.kotlinmania.libc.*

public data class ArpdRequest(
    val req: UShort,
    val ip: UInt,
    val dev: ULong,
    val stamp: ULong,
    val updated: ULong,
    val ha: UByteArray,
)
