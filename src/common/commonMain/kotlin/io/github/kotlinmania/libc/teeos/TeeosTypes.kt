package io.github.kotlinmania.libc.teeos

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CLong
import io.github.kotlinmania.libc.COpaquePointer
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.CUlong

public fun interface FnCallback {
    public operator fun invoke(arg0: COpaquePointer?)
}

public fun interface FnCallback1 {
    public operator fun invoke(arg0: COpaquePointer?): COpaquePointer?
}

public fun interface FnCallback2 {
    public operator fun invoke(x: COpaquePointer?, y: COpaquePointer?): CInt
}

public typealias CBool = Int

public typealias IntmaxT = Long

public typealias UintmaxT = ULong

public typealias SizeT = ULong

public typealias PtrdiffT = Long

public typealias IntptrT = Long

public typealias UintptrT = ULong

public typealias SsizeT = Long

public typealias PidT = CInt

public typealias WcharT = UInt

// long double in C means A float point value, which has 128bit length.
// but some bit maybe not used, so the real length of long double could be 80(x86) or 128(power pc/IEEE)
// this is different from f128(not stable and not included default) in Rust, so we use u128 for FFI(Rust to C).
// this is unstable and will cause to memfault/data abort.
public typealias CLongdouble = ClongDouble

public typealias PthreadT = CUlong

public typealias PthreadKeyT = CUint

public typealias PthreadSpinlockT = CInt

public typealias OffT = Long

public typealias TimeT = CLong

public typealias ClockT = CLong

public typealias ClockidT = CInt

public typealias SusecondsT = CLong

public fun interface OnceFn {
    public operator fun invoke()
}

public typealias PthreadOnceT = CInt

public typealias VaList = COpaquePointer?

public typealias WintT = CUint

public typealias WctypeT = CUlong

public fun interface Cmpfunc {
    public operator fun invoke(x: COpaquePointer?, y: COpaquePointer?): CInt
}
