package io.github.kotlinmania.libc.new.qurt

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CChar
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CLong
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.CUlong
import io.github.kotlinmania.libc.CUlonglong
import io.github.kotlinmania.libc.CUshort
import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.MutPtr

// Basic C types for QuRT
public typealias IntptrT = Long

public typealias UintptrT = ULong

public typealias PtrdiffT = Long

public typealias SizeT = UintptrT

public typealias SsizeT = CInt

// Process and system types
public typealias PidT = CInt

public typealias UidT = CUint

public typealias GidT = CUint

// Time types
public typealias TimeT = CLong

public typealias SusecondsT = CLong

public typealias UsecondsT = CUlong

public typealias ClockidT = CInt

public typealias TimerT = MutPtr<CVoid>

// File system types
public typealias DevT = CUlonglong

public typealias InoT = CUlonglong

public typealias ModeT = CUint

public typealias NlinkT = CUint

public typealias OffT = CLong

public typealias BlkcntT = CLong

public typealias BlksizeT = CLong

// Thread types based on QuRT pthread implementation
public typealias PthreadT = CUint

public typealias PthreadKeyT = CInt

public typealias PthreadOnceT = CInt

public typealias PthreadMutexT = CUint

public typealias PthreadMutexattrT = CUint

public typealias PthreadCondT = CUint

public typealias PthreadCondattrT = CUint

public typealias PthreadAttrT = CUint

public typealias PthreadRwlockT = CUint

public typealias PthreadRwlockattrT = CUint

public typealias PthreadSpinlockT = CUint

public typealias PthreadBarrierT = CUint

public typealias PthreadBarrierattrT = CUint

// Network types
public typealias SocklenT = CUint

public typealias SaFamilyT = CUshort

public typealias InAddrT = CUint

public typealias InPortT = CUshort

// File descriptor types
public typealias FdSet = CUlong

// Standard C library types
// Division result types and structures
public class FILE(
    public val handle: Long = -1L,
) {
    public val ptr: Long get() = handle
}

public typealias FposT = CLong

public typealias ClockT = CLong

// POSIX semaphore types
public typealias SemT = CUint

// Message queue types
public typealias MqdT = CInt

// Additional file system types
public typealias NfdsT = CUlong

// Signal types
public typealias SigsetT = CUlong

// Variadic argument list type
public typealias VaList = MutPtr<CChar>

// Additional missing types
public typealias CSchar = Byte

// Wide character type (hexagon-specific)
public typealias WcharT = UInt

// Error type (compatible with std expectations)
public typealias ErrnoT = CInt

// Resource limit type (for compatibility, not fully supported on QuRT)
public typealias RlimT = CUlong

// Terminal types (for compatibility, not fully supported on QuRT)
public typealias SpeedT = CUint

public typealias TcflagT = CUint
