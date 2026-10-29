package io.github.kotlinmania.libc.unix.bsd.freebsdlike.dragonfly
import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.unix.Timeval
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.SockaddrStorage

public data class Lastlogx(
    val llTv: Timeval,
    val llLine: ByteArray,
    val llHost: ByteArray,
    val llSs: SockaddrStorage,
)
