package io.github.kotlinmania.libc.unix.bsd

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.COpaquePointer
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.unix.DIR
import io.github.kotlinmania.libc.unix.UintptrT

public fun interface FnCallback {
    public operator fun invoke(epath: COpaquePointer?, errno: CInt): CInt
}

public fun interface FnCallback1 {
    public operator fun invoke()
}

public fun interface FnCallback2 {
    public operator fun invoke(arg0: COpaquePointer?): COpaquePointer?
}

public typealias OffT = Long

public typealias UsecondsT = UInt

public typealias BlkcntT = Long

public typealias SocklenT = UInt

public typealias SaFamilyT = UByte

public typealias PthreadT = UintptrT

public typealias NfdsT = CUint

public typealias RegoffT = OffT
