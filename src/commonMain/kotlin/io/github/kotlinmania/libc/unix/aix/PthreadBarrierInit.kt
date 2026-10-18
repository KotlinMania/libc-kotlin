package io.github.kotlinmania.libc.unix.aix

import io.github.kotlinmania.libc.*

public expect fun pthreadBarrierInit(barrier: PthreadBarrierT?, attr: io.github.kotlinmania.libc.COpaquePointer?, count: UInt): Int
