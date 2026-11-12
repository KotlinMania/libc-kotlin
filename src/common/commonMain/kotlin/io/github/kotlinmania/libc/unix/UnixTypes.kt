package io.github.kotlinmania.libc.unix

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CUchar
import io.github.kotlinmania.libc.CUshort
import io.github.kotlinmania.rustlang.core.ptr.MutPtr

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

public class DIR(
    public val handle: Long = -1L,
) {
    public val ptr: Long get() = handle
}

public typealias LocaleT = MutPtr

public class FposT(
    public val handle: Long = -1L,
) {
    public val ptr: Long get() = handle
}

public class FILE(
    public val handle: Long = -1L,
) {
    public val ptr: Long get() = handle
}
