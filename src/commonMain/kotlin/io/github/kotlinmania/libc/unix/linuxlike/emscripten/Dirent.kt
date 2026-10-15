// port-lint: source unix/linux_like/emscripten/mod.rs
package io.github.kotlinmania.libc.unix.linuxlike.emscripten

import io.github.kotlinmania.libc.*

public data class Dirent(
    val dIno: ULong,
    val dOff: Long,
    val dReclen: UShort,
    val dType: UByte,
    val dName: ByteArray,
)
