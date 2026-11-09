package io.github.kotlinmania.libc.unix.linuxlike.linux

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CLonglong
import io.github.kotlinmania.libc.CShort
import io.github.kotlinmania.libc.CUchar
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.CUlong
import io.github.kotlinmania.libc.CUshort

public typealias DevT = ULong

public typealias SocklenT = UInt

public typealias ModeT = UInt

public typealias Ino64T = ULong

public typealias Off64T = Long

public typealias Blkcnt64T = Long

public typealias Rlim64T = ULong

public typealias MqdT = CInt

public typealias NfdsT = CUlong

public typealias NlItem = CInt

public typealias IdtypeT = CUint

public typealias LoffT = CLonglong

public typealias PthreadKeyT = CUint

public typealias PthreadOnceT = CInt

public typealias PthreadSpinlockT = CInt

public typealias KernelFsidT = CAnonymousKernelFsidT

public typealias KernelClockidT = CInt

public typealias U8 = CUchar

public typealias U16 = CUshort

public typealias S16 = CShort

public typealias U32 = CUint

public typealias S32 = CInt

// linux/sctp.h
public typealias SctpAssocT = S32

public typealias EventfdT = ULong

// linux/cnProc.h
// These functions are not available on OpenHarmony
// LFS64 extensions
//
// * musl has 64-bit versions only so aliases the LFS64 symbols to the standard ones
public sealed class TpacketVersions {
    public data object TpacketV1 : TpacketVersions()
    public data object TpacketV2 : TpacketVersions()
    public data object TpacketV3 : TpacketVersions()
}

public typealias PidType = CEnumRepr

public typealias ProcCnMcastOp = CEnumRepr

public typealias ProcCnEvent = CEnumRepr
