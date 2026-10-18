package io.github.kotlinmania.libc.unix
import io.github.kotlinmania.libc.unix.linuxlike.Tm

import io.github.kotlinmania.libc.*

public expect fun localtimeR(timeP: Long?, result: Tm?): Tm?
