package io.github.kotlinmania.libc.unix.newlib.espidf

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.COpaquePointer
import io.github.kotlinmania.libc.CUlong

public fun interface FnCallback {
    public operator fun invoke(arg0: COpaquePointer?): COpaquePointer?
}

public typealias ClockT = CUlong

public typealias WcharT = UInt
