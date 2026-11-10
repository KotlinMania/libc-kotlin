package io.github.kotlinmania.libc.unix.cygwin

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CLong
import io.github.kotlinmania.libc.CLonglong
import io.github.kotlinmania.libc.COpaquePointer
import io.github.kotlinmania.libc.CUchar
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.CUlong
import io.github.kotlinmania.libc.CUshort
import io.github.kotlinmania.libc.unix.IntptrT

public typealias WcharT = CUshort

public typealias BlkcntT = Long

public typealias BlksizeT = Int

public typealias DevT = UInt

public typealias FsblkcntT = CUlong

public typealias FsfilcntT = CUlong

public typealias InoT = ULong

public typealias KeyT = CLonglong

public typealias SaFamilyT = UShort

public typealias SocklenT = CInt

public typealias OffT = CLong

public typealias IdT = UInt

public typealias ModeT = UInt

public typealias Off64T = CLonglong

public typealias LoffT = Off64T

public typealias IconvT = COpaquePointer?

public typealias ClockT = CUlong

public typealias TimeT = CLong

public typealias ClockidT = CUlong

public typealias TimerT = CUlong

public typealias NlItem = CInt

public typealias NlinkT = CUshort

public typealias SusecondsT = CLong

public typealias UsecondsT = CUlong

public class Timezone(public val handle: Long = -1L) {
    public val ptr: Long get() = handle
}

public typealias SigsetT = CUlong

public typealias FdMask = CUlong

public typealias PthreadT = COpaquePointer?

public typealias PthreadMutexT = COpaquePointer?

// Must be Int due to libstd/sysCommon/threadLocal.rs,
// should technically be *mut cVoid
public typealias PthreadKeyT = ULong

public typealias PthreadAttrT = COpaquePointer?

public typealias PthreadMutexattrT = COpaquePointer?

public typealias PthreadCondattrT = COpaquePointer?

public typealias PthreadCondT = COpaquePointer?

// The following ones should be *mut cVoid
public typealias PthreadBarrierattrT = ULong

public typealias PthreadBarrierT = ULong

public typealias PthreadSpinlockT = ULong

public typealias PthreadRwlockT = COpaquePointer?

public typealias PthreadRwlockattrT = COpaquePointer?

public typealias RegisterT = IntptrT

public typealias UChar = CUchar

public typealias UShort = CUshort

public typealias ULong = CUlong

public typealias UInt = CUint

public typealias CaddrT = COpaquePointer?

public typealias VmSizeT = CUlong

public typealias RlimT = CUlong

public typealias NfdsT = CUint

public typealias SemT = COpaquePointer?

public class Sem(public val handle: Long = -1L) {
    public val ptr: Long get() = handle
}

public typealias TcflagT = CUint

public typealias SpeedT = CUint

public typealias VmOffsetT = CUlong

public typealias PosixSpawnFileActionsT = COpaquePointer?

public typealias PosixSpawnattrT = COpaquePointer?
