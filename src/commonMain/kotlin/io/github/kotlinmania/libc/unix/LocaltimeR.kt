package io.github.kotlinmania.libc.unix
import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.unix.linuxlike.Tm

public expect fun localtimeR(timeP: Long?, result: Tm?): Tm?
