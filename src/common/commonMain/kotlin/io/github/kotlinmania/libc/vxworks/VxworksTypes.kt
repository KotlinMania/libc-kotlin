package io.github.kotlinmania.libc.vxworks

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CLong
import io.github.kotlinmania.libc.CLonglong
import io.github.kotlinmania.libc.CUchar
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.CUlong
import io.github.kotlinmania.libc.CUlonglong
import io.github.kotlinmania.libc.CUshort

// Dummy functions, these don't really exist in VxWorks.
// wait.h macros
public sealed class DIR {
}

public typealias IntmaxT = Long

public typealias UintmaxT = ULong

public typealias UintptrT = ULong

public typealias IntptrT = Long

public typealias PtrdiffT = Long

public typealias SizeT = UintptrT

public typealias SsizeT = IntptrT

public typealias SpeedT = CUint

public typealias TcflagT = CUint

public typealias ClockT = CLong

public typealias CcT = CUchar

public typealias PidT = CInt

public typealias InAddrT = UInt

public typealias SighandlerT = SizeT

public typealias CpusetT = UInt

public typealias BlkcntT = CLong

public typealias BlksizeT = CLong

public typealias InoT = CUlong

public typealias RlimT = CUlong

public typealias SusecondsT = CLong

public typealias TimeT = CLonglong

public typealias ErrnoT = CInt

public typealias UsecondsT = CUlong

public typealias SocklenT = CUint

public typealias PthreadT = CUlong

public typealias ClockidT = CInt

// defined for the structs
public typealias DevT = CUlong

public typealias ModeT = CInt

public typealias NlinkT = CUlong

public typealias UidT = CUshort

public typealias GidT = CUshort

public typealias SigsetT = CUlonglong

public typealias KeyT = CLong

public typealias NfdsT = CUint

public typealias Stat64 = Stat

public typealias PthreadKeyT = CUlong

// From bOffT.h
public typealias OffT = CLonglong

public typealias Off64T = OffT

// From bBool.h
public typealias Bool = CInt

// From vxWind.h ..
public typealias VxObjHandle = CInt

public typealias VxTaskId = VxObjHandle

public typealias VxMsgQId = VxObjHandle

public typealias VxSemIdKernel = VxObjHandle

public typealias VxRtpId = VxObjHandle

public typealias VxSdId = VxObjHandle

public typealias VxCondvarId = VxObjHandle

public typealias VxSemId = VxSemaphore?

public typealias ObjHandle = VxObjHandle

public typealias TaskId = ObjHandle

public typealias MsgQId = ObjHandle

public typealias SemIdKernel = ObjHandle

public typealias RtpId = ObjHandle

public typealias SdId = ObjHandle

public typealias CondvarId = ObjHandle

public typealias Status = ObjHandle

// From vxTypes.h
public typealias VxUsrArgT = Long

public typealias VxExitCodeT = Long

public typealias VxTicksT = CUint

public typealias VxTicks64T = CUlonglong

public typealias SaFamilyT = CUchar

// mqueue.h
public typealias MqdT = CInt

public sealed class VxSemaphore {
}

public sealed class Nfsstat(public val value: Int) {
    public data object NfserrRemote : Nfsstat(71)
    public data object NfserrWflush : Nfsstat(99)
    public data object NfserrBadhandle : Nfsstat(10001)
    public data object NfserrNotSync : Nfsstat(10002)
    public data object NfserrBadCookie : Nfsstat(10003)
    public data object NfserrToosmall : Nfsstat(10005)
    public data object NfserrBadtype : Nfsstat(10007)
    public data object NfserrJukebox : Nfsstat(10008)
}

public sealed class FILE {
}

public sealed class FposT {
}
