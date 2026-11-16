package io.github.kotlinmania.libc.windows

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt

public typealias IntmaxT = Long

public typealias UintmaxT = ULong

public typealias SizeT = ULong

public typealias PtrdiffT = Long

public typealias IntptrT = Long

public typealias UintptrT = ULong

public typealias SsizeT = Long

public typealias SighandlerT = ULong

public typealias WcharT = UShort

public typealias ClockT = Int

public typealias ErrnoT = CInt

// Special handling for all print and scan type functions because of https://github.com/rust-lang/libc/issues/2860
public typealias TimeT = Long

public typealias OffT = Int

public typealias DevT = UInt

public typealias InoT = UShort

public class Timezone(
    public val handle: Long = -1L,
) {
    public val ptr: Long get() = handle
}

public typealias Time64T = Long

public typealias Socket = UintptrT

public class FILE(
    public val handle: Long = -1L,
) {
    public val ptr: Long get() = handle
}

public class FposT(
    public val handle: Long = -1L,
) {
    public val ptr: Long get() = handle
}
