package io.github.kotlinmania.libc.wasi

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CLong
import io.github.kotlinmania.libc.CLonglong
import io.github.kotlinmania.libc.COpaquePointer
import io.github.kotlinmania.libc.CUchar
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.CUlong

public fun interface FnCallback {
    public operator fun invoke()
}

public fun interface FnCallback1 {
    public operator fun invoke(arg0: COpaquePointer?): COpaquePointer?
}

public fun interface FnCallback2 {
    public operator fun invoke(arg0: COpaquePointer?)
}

public typealias IntmaxT = Long

public typealias UintmaxT = ULong

public typealias SizeT = ULong

public typealias SsizeT = Long

public typealias PtrdiffT = Long

public typealias IntptrT = Long

public typealias UintptrT = ULong

public typealias OffT = Long

public typealias PidT = Int

public typealias ClockT = CLonglong

public typealias TimeT = CLonglong

public typealias InoT = ULong

public typealias SigsetT = CUchar

public typealias SusecondsT = CLonglong

public typealias ModeT = UInt

public typealias DevT = ULong

public typealias UidT = UInt

public typealias GidT = UInt

public typealias NlinkT = ULong

public typealias BlksizeT = CLong

public typealias BlkcntT = Long

public typealias NfdsT = CUlong

public typealias WcharT = Int

public typealias NlItem = CInt

public typealias WasiRightsT = ULong

public typealias LocaleT = COpaquePointer?

public typealias PthreadT = COpaquePointer?

public typealias PthreadOnceT = CInt

public typealias PthreadKeyT = CUint

public typealias PthreadSpinlockT = CInt

public class FILE(public val handle: Long = -1L) {
    public val ptr: Long get() = handle
}

public class DIR(public val handle: Long = -1L) {
    public val ptr: Long get() = handle
}

public class LocaleStruct(public val handle: Long = -1L) {
    public val ptr: Long get() = handle
}
