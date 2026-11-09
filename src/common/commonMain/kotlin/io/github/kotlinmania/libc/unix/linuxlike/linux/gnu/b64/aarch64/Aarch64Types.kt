package io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.b64.aarch64

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CLonglong
import io.github.kotlinmania.libc.COpaquePointer
import io.github.kotlinmania.libc.CUlonglong

public fun interface FnCallback {
    public operator fun invoke()
}

public typealias WcharT = UInt

public typealias NlinkT = UInt

public typealias BlksizeT = Int

public typealias SusecondsT = Long

public typealias U64 = CUlonglong

public typealias S64 = CLonglong
