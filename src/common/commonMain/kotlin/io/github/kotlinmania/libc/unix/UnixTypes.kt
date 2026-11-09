package io.github.kotlinmania.libc.unix

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.COpaquePointer
import io.github.kotlinmania.libc.CUchar
import io.github.kotlinmania.libc.CUshort

public fun interface FnCallback {
    public operator fun invoke(arg0: COpaquePointer?, arg1: COpaquePointer?): CInt
}

public fun interface FnCallback1 {
    public operator fun invoke(arg0: COpaquePointer?)
}

public fun interface FnCallback2 {
    public operator fun invoke()
}

public typealias IntmaxT = Long

public typealias UintmaxT = ULong

public typealias SizeT = ULong

public typealias PtrdiffT = Long

public typealias IntptrT = Long

public typealias UintptrT = ULong

public typealias SsizeT = Long

public typealias PidT = Int

public typealias InAddrT = UInt

public typealias InPortT = UShort

public typealias SighandlerT = SizeT

public typealias CcT = CUchar

public typealias UidT = CUshort

public typealias GidT = CUshort

public class DIR(public val handle: Long = -1L) {
    public val ptr: Long get() = handle
}

public typealias LocaleT = COpaquePointer?

public class FposT(public val handle: Long = -1L) {
    public val ptr: Long get() = handle
}

public class FILE(public val handle: Long = -1L) {
    public val ptr: Long get() = handle
}
