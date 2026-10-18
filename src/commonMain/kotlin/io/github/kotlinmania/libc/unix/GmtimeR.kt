package io.github.kotlinmania.libc.unix
import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.unix.linuxlike.Tm

public expect fun gmtimeR(timeP: Long?, result: Tm?): Tm?
