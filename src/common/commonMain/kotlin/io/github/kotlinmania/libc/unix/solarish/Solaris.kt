// port-lint: source unix/solarish/solaris.rs
package io.github.kotlinmania.libc.unix.solarish

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CChar
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.COpaquePointer
import io.github.kotlinmania.libc.CShort
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.CUlong
import io.github.kotlinmania.libc.CUlonglong
import io.github.kotlinmania.libc.CUshort
import io.github.kotlinmania.libc.LibcDynamicFfi
import io.github.kotlinmania.libc.NET_MAC_AWARE
import io.github.kotlinmania.libc.NET_MAC_AWARE_INHERIT
import io.github.kotlinmania.libc.PRIV_AWARE_RESET
import io.github.kotlinmania.libc.PRIV_DEBUG
import io.github.kotlinmania.libc.PRIV_PFEXEC
import io.github.kotlinmania.libc.PRIV_XPOLICY
import io.github.kotlinmania.libc.unix.PidT
import io.github.kotlinmania.libc.unix.SizeT
import io.github.kotlinmania.libc.unix.Timeval
import io.github.kotlinmania.libc.unix.UintptrT
import io.github.kotlinmania.libc.unix.Winsize

public fun interface DoorCreateServerProcedureCallback {
    public operator fun invoke(cookie: COpaquePointer?, argp: COpaquePointer?, argSize: SizeT, dp: DoorDescT?, nDesc: CUint)
}

public typealias DoorAttrT = CUint

public typealias DoorIdT = CUlonglong

public typealias LgrpAffinityT = CUint

public sealed class LgrpRsrcT(public val value: UInt) {
    public data object LgrpRsrcCpu : LgrpRsrcT(0u)
    public data object LgrpRsrcMem : LgrpRsrcT(1u)
    public data object LgrpRsrcTypes : LgrpRsrcT(2u)
}

public open class Aiocb(
    public var aioFildes: CInt,
    public var aioBuf: COpaquePointer?,
    public var aioNbytes: SizeT,
    public var aioOffset: OffT,
    public var aioReqprio: CInt,
    public var aioSigevent: Sigevent,
    public var aioLioOpcode: CInt,
    public var aioResultp: AioResultT,
    public var aioState: CChar,
    public var aioReturned: CChar,
    public var aioPad1: List<CChar>,
    public var aioFlags: CInt,
)

public open class ShmidDs(
    public var shmPerm: IpcPerm,
    public var shmSegsz: SizeT,
    public var shmFlags: UintptrT,
    public var shmLkcnt: CUshort,
    public var shmLpid: PidT,
    public var shmCpid: PidT,
    public var shmNattch: ShmattT,
    public var shmCnattch: CUlong,
    public var shmAtime: TimeT,
    public var shmDtime: TimeT,
    public var shmCtime: TimeT,
    public var shmAmp: COpaquePointer?,
    public var shmGransize: ULong,
    public var shmAllocated: ULong,
    public var shmPad4: List<Long>,
)

public open class XrsT(public var xrsId: CUlong, public var xrsPtr: COpaquePointer?)

public open class Utmpx(
    public var utUser: List<CChar>,
    public var utId: List<CChar>,
    public var utLine: List<CChar>,
    public var utPid: PidT,
    public var utType: CShort,
    public var utExit: ExitStatus,
    public var utTv: Timeval,
    public var utSession: CInt,
    public var pad: List<CInt>,
    public var utSyslen: CShort,
    public var utHost: List<CChar>,
)

public open class DoorDescTDDataDDesc(public var dDescriptor: CInt, public var dId: DoorIdT)

public open class DoorDescTDData(public var dDesc: DoorDescTDDataDDesc? = null, public var dResv: List<CInt>? = null)

public open class DoorDescT(public var dAttributes: DoorAttrT, public var dData: DoorDescTDData)

public open class DoorArgT(
    public var dataPtr: COpaquePointer?,
    public var dataSize: SizeT,
    public var descPtr: DoorDescT?,
    public var decNum: CUint,
    public var rbuf: COpaquePointer?,
    public var rsize: SizeT,
)

// Note(solaris): O_DIRECT and SIGINFO are NOT available on Solaris.
// But in past they were defined here and thus other crates expected them.
// Latest version v0.29.0 of Nix crate still expects this. Since last
// version of Nix crate is almost one year ago let's define these two
// temporarily before new Nix version is released.
public val O_DIRECT: CInt = 0x2000000

public val SIGINFO: CInt = 41

public val UTMP_USER_LEN: Int = 32

public val UTMP_LINE_LEN: Int = 32

public val UTMP_ID_LEN: Int = 4

public val PORT_SOURCE_POSTWAIT: CInt = 8

public val PORT_SOURCE_SIGNAL: CInt = 9

public val AF_LOCAL: CInt = 1

// AF_UNIX
public val AF_FILE: CInt = 1

// AF_UNIX
public val TCP_KEEPIDLE: CInt = 0x1d

public val TCP_KEEPINTVL: CInt = 0x1e

public val TCP_KEEPCNT: CInt = 0x1f

public val F_DUPFD_CLOEXEC: CInt = 47

public val F_DUPFD_CLOFORK: CInt = 49

public val F_DUP2FD_CLOEXEC: CInt = 48

public val F_DUP2FD_CLOFORK: CInt = 50

public val PC_LAST: CInt = 102

public val PRIV_PROC_SENSITIVE: CUint = 0x0008u

public val PRIV_PFEXEC_AUTH: CUint = 0x0200u

public val PRIV_PROC_TPD: CUint = 0x0400u

public val PRIV_TPD_UNSAFE: CUint = 0x0800u

public val PRIV_PROC_TPD_RESET: CUint = 0x1000u

public val PRIV_TPD_KILLABLE: CUint = 0x2000u

public val POSIX_SPAWN_SETSID: CShort = 0x400

public val PRIV_USER: CUint = PRIV_DEBUG or PRIV_PROC_SENSITIVE or NET_MAC_AWARE or NET_MAC_AWARE_INHERIT or PRIV_XPOLICY or PRIV_AWARE_RESET or PRIV_PFEXEC or PRIV_PFEXEC_AUTH or PRIV_PROC_TPD or PRIV_TPD_UNSAFE or PRIV_TPD_KILLABLE or PRIV_PROC_TPD_RESET

// DIFF(main): changed to `* const *` in e77f551de9
public fun fexecve(fd: CInt, argv: COpaquePointer?, envp: COpaquePointer?): CInt {
    return LibcDynamicFfi.invoke("fexecve", -1, longArrayOf(fd.toLong(), argv?.value ?: 0L, envp?.value ?: 0L)).toInt()
}

public fun mincore(addr: COpaquePointer?, len: SizeT, vec: COpaquePointer?): CInt {
    return LibcDynamicFfi.invoke("mincore", -1, longArrayOf(addr?.value ?: 0L, len.toLong(), vec?.value ?: 0L)).toInt()
}

public fun doorCall(d: CInt, params: DoorArgT?): CInt {
    return LibcDynamicFfi.invoke("door_call", -1, longArrayOf(d.toLong(), params?.value ?: 0L)).toInt()
}

public fun doorReturn(dataPtr: COpaquePointer?, dataSize: SizeT, descPtr: DoorDescT?, numDesc: CUint): CInt {
    return LibcDynamicFfi.invoke("door_return", -1, longArrayOf(dataPtr?.value ?: 0L, dataSize.toLong(), descPtr?.value ?: 0L, numDesc.toLong())).toInt()
}

public fun doorCreate(serverProcedure: DoorCreateServerProcedureCallback, cookie: COpaquePointer?, attributes: DoorAttrT): CInt {
    val __scratch_0 = LibcDynamicFfi.allocZeroed(4096)
    try {
        return LibcDynamicFfi.invoke("door_create", -1, longArrayOf(__scratch_0, cookie?.value ?: 0L, attributes.toLong())).toInt()
    } finally {
        if (__scratch_0 != 0L) LibcDynamicFfi.freeMem(__scratch_0)
    }
}

public fun fattach(fildes: CInt, path: String?): CInt {
    val __cstr_1 = if (path == null) 0L else LibcDynamicFfi.allocUtf8CString(path)
    try {
        return LibcDynamicFfi.invoke("fattach", -1, longArrayOf(fildes.toLong(), __cstr_1)).toInt()
    } finally {
        if (__cstr_1 != 0L) LibcDynamicFfi.freeMem(__cstr_1)
    }
}

public fun pthreadGetattrNp(thread: PthreadT, attr: PthreadAttrT?): CInt {
    val __slot_1 = if (attr == null) 0L else LibcDynamicFfi.allocScalarSlot(attr.toLong())
    try {
        return LibcDynamicFfi.invoke("pthread_getattr_np", -1, longArrayOf(thread.toLong(), __slot_1)).toInt()
    } finally {
        if (__slot_1 != 0L) LibcDynamicFfi.freeMem(__slot_1)
    }
}

public fun euidaccess(path: String?, amode: CInt): CInt {
    val __cstr_0 = if (path == null) 0L else LibcDynamicFfi.allocUtf8CString(path)
    try {
        return LibcDynamicFfi.invoke("euidaccess", -1, longArrayOf(__cstr_0, amode.toLong())).toInt()
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
    }
}

public fun openpty(amain: CInt?, asubord: CInt?, name: COpaquePointer?, termp: Termios?, winp: Winsize?): CInt {
    val __slot_0 = if (amain == null) 0L else LibcDynamicFfi.allocScalarSlot(amain.toLong())
    val __slot_1 = if (asubord == null) 0L else LibcDynamicFfi.allocScalarSlot(asubord.toLong())
    try {
        return LibcDynamicFfi.invoke("openpty", -1, longArrayOf(__slot_0, __slot_1, name?.value ?: 0L, termp?.value ?: 0L, winp?.value ?: 0L)).toInt()
    } finally {
        if (__slot_0 != 0L) LibcDynamicFfi.freeMem(__slot_0)
        if (__slot_1 != 0L) LibcDynamicFfi.freeMem(__slot_1)
    }
}

public fun forkpty(amain: CInt?, name: COpaquePointer?, termp: Termios?, winp: Winsize?): PidT {
    val __slot_0 = if (amain == null) 0L else LibcDynamicFfi.allocScalarSlot(amain.toLong())
    try {
        return LibcDynamicFfi.invoke("forkpty", -1, longArrayOf(__slot_0, name?.value ?: 0L, termp?.value ?: 0L, winp?.value ?: 0L)).toInt()
    } finally {
        if (__slot_0 != 0L) LibcDynamicFfi.freeMem(__slot_0)
    }
}
