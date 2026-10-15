package io.github.kotlinmania.libc.unix.cygwin

import io.github.kotlinmania.libc.*

public expect fun pthreadBarrierattrSetpshared(attr: ULong?, shared: Int): Int
