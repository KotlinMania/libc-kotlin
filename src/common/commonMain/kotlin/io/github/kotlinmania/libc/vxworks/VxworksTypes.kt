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
public class DIR(public val handle: Long = -1L) {
    public val ptr: Long get() = handle
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

public class VxSemaphore(public val handle: Long = -1L) {
    public val ptr: Long get() = handle
}

public enum class Nfsstat(public val value: UInt) {
    NFSERR_REMOTE(71u),
    NFSERR_WFLUSH(99u),
    NFSERR_BADHANDLE(10001u),
    NFSERR_NOT_SYNC(10002u),
    NFSERR_BAD_COOKIE(10003u),
    NFSERR_TOOSMALL(10005u),
    NFSERR_BADTYPE(10007u),
    NFSERR_JUKEBOX(10008u),
}

public class FILE(public val handle: Long = -1L) {
    public val ptr: Long get() = handle
}

public class FposT(public val handle: Long = -1L) {
    public val ptr: Long get() = handle
}
