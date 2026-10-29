package io.github.kotlinmania.libc.unix.linuxlike.linux
import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.unix.linuxlike.Sockaddr

public data class IwThrspy(
    val addr: Sockaddr,
    val qual: IwQuality,
    val low: IwQuality,
    val high: IwQuality,
)
