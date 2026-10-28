package io.github.kotlinmania.libc.unix.aix

import io.github.kotlinmania.libc.*

public expect fun pthreadBarrierattrSetpshared(attr: io.github.kotlinmania.libc.COpaquePointer?, pshared: Int): Int
