package io.github.kotlinmania.libc.unix.newlib.vita

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CLong
import io.github.kotlinmania.libc.COpaquePointer
import io.github.kotlinmania.libc.CUlong

public fun interface FnCallback {
    public operator fun invoke(arg0: COpaquePointer?): COpaquePointer?
}

public typealias ClockT = CLong

public typealias WcharT = UInt

public typealias SigsetT = CUlong
