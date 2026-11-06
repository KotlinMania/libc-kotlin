// port-lint: source unix/solarish/solaris.rs
package io.github.kotlinmania.libc.unix.solarish

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.AioResultT
import io.github.kotlinmania.libc.COpaquePointer
import io.github.kotlinmania.libc.ExitStatus
import io.github.kotlinmania.libc.IpcPerm
import io.github.kotlinmania.libc.NET_MAC_AWARE
import io.github.kotlinmania.libc.NET_MAC_AWARE_INHERIT
import io.github.kotlinmania.libc.OffT
import io.github.kotlinmania.libc.PRIV_AWARE_RESET
import io.github.kotlinmania.libc.PRIV_DEBUG
import io.github.kotlinmania.libc.PRIV_PFEXEC
import io.github.kotlinmania.libc.PRIV_XPOLICY
import io.github.kotlinmania.libc.PidT
import io.github.kotlinmania.libc.PthreadAttrT
import io.github.kotlinmania.libc.PthreadT
import io.github.kotlinmania.libc.ShmattT
import io.github.kotlinmania.libc.Sigevent
import io.github.kotlinmania.libc.Termios
import io.github.kotlinmania.libc.TimeT
import io.github.kotlinmania.libc.Timeval
import io.github.kotlinmania.libc.UintptrT
import io.github.kotlinmania.libc.Winsize

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

public open class DoorDescTDDataDDesc(public var dDescriptor: CInt, public var dId: io.github.kotlinmania.libc.DoorIdT)

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
public expect fun fexecve(fd: CInt, argv: COpaquePointer?, envp: COpaquePointer?): CInt

public expect fun mincore(addr: COpaquePointer?, len: SizeT, vec: COpaquePointer?): CInt

public expect fun doorCall(d: CInt, params: DoorArgT?): CInt

public expect fun doorReturn(dataPtr: COpaquePointer?, dataSize: SizeT, descPtr: DoorDescT?, numDesc: CUint): CInt

public expect fun doorCreate(serverProcedure: DoorCreateServerProcedureCallback, cookie: COpaquePointer?, attributes: DoorAttrT): CInt

public expect fun fattach(fildes: CInt, path: String?): CInt

public expect fun pthreadGetattrNp(thread: PthreadT, attr: PthreadAttrT?): CInt

public expect fun euidaccess(path: String?, amode: CInt): CInt

public expect fun openpty(amain: CInt?, asubord: CInt?, name: COpaquePointer?, termp: Termios?, winp: Winsize?): CInt

public expect fun forkpty(amain: CInt?, name: COpaquePointer?, termp: Termios?, winp: Winsize?): PidT
