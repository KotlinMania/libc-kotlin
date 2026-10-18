package io.github.kotlinmania.libc.unix
import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.unix.linuxlike.Passwd

public expect fun getpwuid(uid: UInt): Passwd?
