@file:OptIn(ExperimentalUnsignedTypes::class)
package io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.b64.powerpc64

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CLong
import io.github.kotlinmania.libc.COpaquePointer
import io.github.kotlinmania.libc.CUlong

public fun interface FnCallback {
    public operator fun invoke()
}

public typealias WcharT = Int

public typealias NlinkT = ULong

public typealias BlksizeT = Long

public typealias SusecondsT = Long

public typealias U64 = CUlong

public typealias S64 = CLong

public typealias GregsetT = ULongArray

public typealias FpregsetT = ULongArray
