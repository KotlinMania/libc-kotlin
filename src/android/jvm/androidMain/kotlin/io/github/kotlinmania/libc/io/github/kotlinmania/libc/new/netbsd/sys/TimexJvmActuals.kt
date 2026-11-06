package io.github.kotlinmania.libc.new.netbsd.sys

import io.github.kotlinmania.libc.COpaquePointer

internal object TimexRawLibc {
    external fun ntpGettime(buf: Long): Int
    external fun ntpAdjtime(buf: Long): Int
}

public actual fun ntpGettime(buf: Ntptimeval?): CInt =
    TimexRawLibc.ntpGettime(buf?.toLong() ?: 0L)

public actual fun ntpAdjtime(buf: Timex?): CInt =
    TimexRawLibc.ntpAdjtime(buf?.toLong() ?: 0L)
