// port-lint: source unix/solarish/solaris.rs
package io.github.kotlinmania.libc.unix.solarish

import io.github.kotlinmania.libc.*
import kotlinx.cinterop.COpaquePointer

public typealias DoorAttrT = CUInt
public typealias DoorIdT = CULongLong
public typealias LgrpAffinityT = CUInt

public enum class LgrpRsrcT(public val value: UInt) {
    LGRP_RSRC_CPU(0u),
    LGRP_RSRC_MEM(1u),
    LGRP_RSRC_TYPES(2u),
    ;
}

public data class Aiocb(
    val aioFildes: CInt,
    val aioBuf: COpaquePointer?,
    val aioNbytes: ULong,
    val aioOffset: OffT,
    val aioReqprio: CInt,
    val aioSigevent: Sigevent,
    val aioLioOpcode: CInt,
    val aioResultp: AioResultT,
    val aioState: CChar,
    val aioReturned: CChar,
    val aioPad1: ByteArray,
    val aioFlags: CInt,
)

public data class ShmidDs(
    val shmPerm: IpcPerm,
    val shmSegsz: ULong,
    val shmFlags: UintptrT,
    val shmLkcnt: CUShort,
    val shmLpid: PidT,
    val shmCpid: PidT,
    val shmNattch: ShmattT,
    val shmCnattch: CULong,
    val shmAtime: TimeT,
    val shmDtime: TimeT,
    val shmCtime: TimeT,
    val shmAmp: COpaquePointer?,
    val shmGransize: ULong,
    val shmAllocated: ULong,
    val shmPad4: LongArray,
)

public data class XrsT(
    val xrsId: CULong,
    val xrsPtr: String?,
)

public data class Utmpx(
    val utUser: ByteArray,
    val utId: ByteArray,
    val utLine: ByteArray,
    val utPid: PidT,
    val utType: CShort,
    val utExit: ExitStatus,
    val utTv: Timeval,
    val utSession: CInt,
    val pad: IntArray,
    val utSyslen: CShort,
    val utHost: ByteArray,
)

public data class DoorDescTDDataDDesc(
    val dDescriptor: CInt,
    val dId: DoorIdT,
)

public data class DoorDescT(
    val dAttributes: DoorAttrT,
    val dData: DoorDescTDData,
)

public data class DoorArgT(
    val dataPtr: String?,
    val dataSize: ULong,
    val descPtr: DoorDescT?,
    val decNum: CUInt,
    val rbuf: String?,
    val rsize: ULong,
)

// C union; only one variant is valid at a time.
public data class DoorDescTDData(
    val dDesc: DoorDescTDDataDDesc? = null,
    val dResv: IntArray? = null,
)

public const val O_DIRECT: CInt = 0x2000000
public const val SIGINFO: CInt = 41
public const val _UTMP_USER_LEN: ULong = 32uL
public const val _UTMP_LINE_LEN: ULong = 32uL
public const val _UTMP_ID_LEN: ULong = 4uL
public const val PORT_SOURCE_POSTWAIT: CInt = 8
public const val PORT_SOURCE_SIGNAL: CInt = 9
public const val AF_LOCAL: CInt = 1
public const val AF_FILE: CInt = 1
public const val TCP_KEEPIDLE: CInt = 0x1d
public const val TCP_KEEPINTVL: CInt = 0x1e
public const val TCP_KEEPCNT: CInt = 0x1f
public const val F_DUPFD_CLOEXEC: CInt = 47
public const val F_DUPFD_CLOFORK: CInt = 49
public const val F_DUP2FD_CLOEXEC: CInt = 48
public const val F_DUP2FD_CLOFORK: CInt = 50
public const val _PC_LAST: CInt = 102
public const val PRIV_PROC_SENSITIVE: CUInt = 0x0008u
public const val PRIV_PFEXEC_AUTH: CUInt = 0x0200u
public const val PRIV_PROC_TPD: CUInt = 0x0400u
public const val PRIV_TPD_UNSAFE: CUInt = 0x0800u
public const val PRIV_PROC_TPD_RESET: CUInt = 0x1000u
public const val PRIV_TPD_KILLABLE: CUInt = 0x2000u
public const val POSIX_SPAWN_SETSID: CShort = 0x400
public val PRIV_USER: CUInt = PRIV_DEBUG or PRIV_PROC_SENSITIVE or NET_MAC_AWARE or NET_MAC_AWARE_INHERIT or PRIV_XPOLICY or PRIV_AWARE_RESET or PRIV_PFEXEC or PRIV_PFEXEC_AUTH or PRIV_PROC_TPD or PRIV_TPD_UNSAFE or PRIV_TPD_KILLABLE or PRIV_PROC_TPD_RESET

public expect fun fexecve(fd: CInt, argv: COpaquePointer?, envp: COpaquePointer?): CInt
public expect fun mincore(addr: COpaquePointer?, len: ULong, vec: String?): CInt
public expect fun doorCall(d: CInt, params: DoorArgT?): CInt
public expect fun doorReturn(dataPtr: String?, dataSize: ULong, descPtr: DoorDescT?, numDesc: CUInt): CInt
public expect fun doorCreate(serverProcedure: ((COpaquePointer?, String?, ULong, DoorDescT?, CUInt) -> Unit)?, cookie: COpaquePointer?, attributes: DoorAttrT): CInt
public expect fun fattach(fildes: CInt, path: String?): CInt
public expect fun pthreadGetattrNp(thread: PthreadT, attr: PthreadAttrT?): CInt
public expect fun euidaccess(path: String?, amode: CInt): CInt
public expect fun openpty(amain: CInt?, asubord: CInt?, name: String?, termp: Termios?, winp: Winsize?): CInt
public expect fun forkpty(amain: CInt?, name: String?, termp: Termios?, winp: Winsize?): PidT
