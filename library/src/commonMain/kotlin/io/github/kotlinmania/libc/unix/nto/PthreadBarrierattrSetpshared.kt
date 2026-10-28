package io.github.kotlinmania.libc.unix.nto

import io.github.kotlinmania.libc.*

public expect fun pthreadBarrierattrSetpshared(attr: io.github.kotlinmania.libc.unix.nto.SyncAttr?, pshared: Int): Int
