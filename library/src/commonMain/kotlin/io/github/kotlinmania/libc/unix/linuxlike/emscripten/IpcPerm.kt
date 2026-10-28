package io.github.kotlinmania.libc.unix.linuxlike.emscripten

import io.github.kotlinmania.libc.*

public data class IpcPerm(
    val ipcPermKey: Int,
    val uid: UInt,
    val gid: UInt,
    val cuid: UInt,
    val cgid: UInt,
    val mode: UInt,
    val seq: Int,
)
