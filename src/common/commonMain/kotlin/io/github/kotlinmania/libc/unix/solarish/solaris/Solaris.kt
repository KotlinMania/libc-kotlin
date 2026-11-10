// port-lint: source unix/solarish/solaris.rs
@file:OptIn(ExperimentalUnsignedTypes::class)
package io.github.kotlinmania.libc.unix.solarish.solaris

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CChar
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.COpaquePointer
import io.github.kotlinmania.libc.CShort
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.CUlong
import io.github.kotlinmania.libc.CUlonglong
import io.github.kotlinmania.libc.CUshort
import io.github.kotlinmania.libc.unix.PidT
import io.github.kotlinmania.libc.unix.SizeT
import io.github.kotlinmania.libc.unix.Timeval
import io.github.kotlinmania.libc.unix.UintptrT
import io.github.kotlinmania.libc.unix.solarish.AioResultT
import io.github.kotlinmania.libc.unix.solarish.ExitStatus
import io.github.kotlinmania.libc.unix.solarish.IpcPerm
import io.github.kotlinmania.libc.unix.solarish.NET_MAC_AWARE
import io.github.kotlinmania.libc.unix.solarish.NET_MAC_AWARE_INHERIT
import io.github.kotlinmania.libc.unix.solarish.OffT
import io.github.kotlinmania.libc.unix.solarish.PRIV_AWARE_RESET
import io.github.kotlinmania.libc.unix.solarish.PRIV_DEBUG
import io.github.kotlinmania.libc.unix.solarish.PRIV_PFEXEC
import io.github.kotlinmania.libc.unix.solarish.PRIV_XPOLICY
import io.github.kotlinmania.libc.unix.solarish.PthreadT
import io.github.kotlinmania.libc.unix.solarish.ShmattT
import io.github.kotlinmania.libc.unix.solarish.Sigevent
import io.github.kotlinmania.libc.unix.solarish.Termios
import io.github.kotlinmania.libc.unix.solarish.TimeT

public fun interface DoorCreateServerProcedureCallback {
    public operator fun invoke(cookie: COpaquePointer?, argp: COpaquePointer?, argSize: SizeT, dp: COpaquePointer?, nDesc: CUint)
}

public typealias DoorAttrT = CUint

public typealias DoorIdT = CUlonglong

public typealias LgrpAffinityT = CUint

public enum class LgrpRsrcT(public val value: UInt) {
    LGRP_RSRC_CPU(0u),
    LGRP_RSRC_MEM(1u),
    LGRP_RSRC_TYPES(2u),
}

public data class Aiocb(
    public var aioFildes: CInt = 0,
    public var aioBuf: COpaquePointer? = null,
    public var aioNbytes: SizeT = 0uL,
    public var aioOffset: OffT = 0L,
    public var aioReqprio: CInt = 0,
    public var aioSigevent: Sigevent = Sigevent(),
    public var aioLioOpcode: CInt = 0,
    public var aioResultp: AioResultT = AioResultT(),
    public var aioState: CChar = 0u,
    public var aioReturned: CChar = 0u,
    public var aioPad1: UByteArray = UByteArray(2),
    public var aioFlags: CInt = 0,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Aiocb) return false
        if (this.aioFildes != other.aioFildes) return false
        if (this.aioBuf != other.aioBuf) return false
        if (this.aioNbytes != other.aioNbytes) return false
        if (this.aioOffset != other.aioOffset) return false
        if (this.aioReqprio != other.aioReqprio) return false
        if (this.aioSigevent != other.aioSigevent) return false
        if (this.aioLioOpcode != other.aioLioOpcode) return false
        if (this.aioResultp != other.aioResultp) return false
        if (this.aioState != other.aioState) return false
        if (this.aioReturned != other.aioReturned) return false
        if (!this.aioPad1.contentEquals(other.aioPad1)) return false
        if (this.aioFlags != other.aioFlags) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.aioFildes.hashCode()
        result = 31 * result + this.aioBuf.hashCode()
        result = 31 * result + this.aioNbytes.hashCode()
        result = 31 * result + this.aioOffset.hashCode()
        result = 31 * result + this.aioReqprio.hashCode()
        result = 31 * result + this.aioSigevent.hashCode()
        result = 31 * result + this.aioLioOpcode.hashCode()
        result = 31 * result + this.aioResultp.hashCode()
        result = 31 * result + this.aioState.hashCode()
        result = 31 * result + this.aioReturned.hashCode()
        result = 31 * result + this.aioPad1.contentHashCode()
        result = 31 * result + this.aioFlags.hashCode()
        return result
    }
}

public data class ShmidDs(
    public var shmPerm: IpcPerm = IpcPerm(),
    public var shmSegsz: SizeT = 0uL,
    public var shmFlags: UintptrT = 0uL,
    public var shmLkcnt: CUshort = 0u,
    public var shmLpid: PidT = 0,
    public var shmCpid: PidT = 0,
    public var shmNattch: ShmattT = 0uL,
    public var shmCnattch: CUlong = 0uL,
    public var shmAtime: TimeT = 0L,
    public var shmDtime: TimeT = 0L,
    public var shmCtime: TimeT = 0L,
    public var shmAmp: COpaquePointer? = null,
    public var shmGransize: ULong = 0uL,
    public var shmAllocated: ULong = 0uL,
    public var shmPad4: LongArray = LongArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ShmidDs) return false
        if (this.shmPerm != other.shmPerm) return false
        if (this.shmSegsz != other.shmSegsz) return false
        if (this.shmFlags != other.shmFlags) return false
        if (this.shmLkcnt != other.shmLkcnt) return false
        if (this.shmLpid != other.shmLpid) return false
        if (this.shmCpid != other.shmCpid) return false
        if (this.shmNattch != other.shmNattch) return false
        if (this.shmCnattch != other.shmCnattch) return false
        if (this.shmAtime != other.shmAtime) return false
        if (this.shmDtime != other.shmDtime) return false
        if (this.shmCtime != other.shmCtime) return false
        if (this.shmAmp != other.shmAmp) return false
        if (this.shmGransize != other.shmGransize) return false
        if (this.shmAllocated != other.shmAllocated) return false
        if (!this.shmPad4.contentEquals(other.shmPad4)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.shmPerm.hashCode()
        result = 31 * result + this.shmSegsz.hashCode()
        result = 31 * result + this.shmFlags.hashCode()
        result = 31 * result + this.shmLkcnt.hashCode()
        result = 31 * result + this.shmLpid.hashCode()
        result = 31 * result + this.shmCpid.hashCode()
        result = 31 * result + this.shmNattch.hashCode()
        result = 31 * result + this.shmCnattch.hashCode()
        result = 31 * result + this.shmAtime.hashCode()
        result = 31 * result + this.shmDtime.hashCode()
        result = 31 * result + this.shmCtime.hashCode()
        result = 31 * result + this.shmAmp.hashCode()
        result = 31 * result + this.shmGransize.hashCode()
        result = 31 * result + this.shmAllocated.hashCode()
        result = 31 * result + this.shmPad4.contentHashCode()
        return result
    }
}

public data class XrsT(public var xrsId: CUlong = 0uL, public var xrsPtr: COpaquePointer? = null)

public data class Utmpx(
    public var utUser: UByteArray = UByteArray(UTMP_USER_LEN),
    public var utId: UByteArray = UByteArray(UTMP_ID_LEN),
    public var utLine: UByteArray = UByteArray(UTMP_LINE_LEN),
    public var utPid: PidT = 0,
    public var utType: CShort = 0,
    public var utExit: ExitStatus = ExitStatus(),
    public var utTv: Timeval = Timeval(),
    public var utSession: CInt = 0,
    public var pad: IntArray = IntArray(5),
    public var utSyslen: CShort = 0,
    public var utHost: UByteArray = UByteArray(257),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Utmpx) return false
        if (!this.utUser.contentEquals(other.utUser)) return false
        if (!this.utId.contentEquals(other.utId)) return false
        if (!this.utLine.contentEquals(other.utLine)) return false
        if (this.utPid != other.utPid) return false
        if (this.utType != other.utType) return false
        if (this.utExit != other.utExit) return false
        if (this.utTv != other.utTv) return false
        if (this.utSession != other.utSession) return false
        if (!this.pad.contentEquals(other.pad)) return false
        if (this.utSyslen != other.utSyslen) return false
        if (!this.utHost.contentEquals(other.utHost)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.utUser.contentHashCode()
        result = 31 * result + this.utId.contentHashCode()
        result = 31 * result + this.utLine.contentHashCode()
        result = 31 * result + this.utPid.hashCode()
        result = 31 * result + this.utType.hashCode()
        result = 31 * result + this.utExit.hashCode()
        result = 31 * result + this.utTv.hashCode()
        result = 31 * result + this.utSession.hashCode()
        result = 31 * result + this.pad.contentHashCode()
        result = 31 * result + this.utSyslen.hashCode()
        result = 31 * result + this.utHost.contentHashCode()
        return result
    }
}

public data class DoorDescTDDataDDesc(public var dDescriptor: CInt = 0, public var dId: DoorIdT = 0uL)

public data class DoorDescTDData(public var dDesc: DoorDescTDDataDDesc = DoorDescTDDataDDesc(), public var dResv: IntArray = IntArray(5)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DoorDescTDData) return false
        if (this.dDesc != other.dDesc) return false
        if (!this.dResv.contentEquals(other.dResv)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dDesc.hashCode()
        result = 31 * result + this.dResv.contentHashCode()
        return result
    }
}

public data class DoorDescT(public var dAttributes: DoorAttrT = 0u, public var dData: DoorDescTDData = DoorDescTDData())

public data class DoorArgT(
    public var dataPtr: COpaquePointer? = null,
    public var dataSize: SizeT = 0uL,
    public var descPtr: DoorDescT? = null,
    public var decNum: CUint = 0u,
    public var rbuf: COpaquePointer? = null,
    public var rsize: SizeT = 0uL,
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

public expect fun doorCall(d: CInt, params: COpaquePointer?): CInt

public expect fun doorReturn(dataPtr: COpaquePointer?, dataSize: SizeT, descPtr: COpaquePointer?, numDesc: CUint): CInt

public expect fun doorCreate(serverProcedure: DoorCreateServerProcedureCallback, cookie: COpaquePointer?, attributes: DoorAttrT): CInt

public expect fun fattach(fildes: CInt, path: String?): CInt

public expect fun pthreadGetattrNp(thread: PthreadT, attr: COpaquePointer?): CInt

public expect fun euidaccess(path: String?, amode: CInt): CInt

public expect fun openpty(amain: COpaquePointer?, asubord: COpaquePointer?, name: COpaquePointer?, termp: COpaquePointer?, winp: COpaquePointer?): CInt

public expect fun forkpty(amain: COpaquePointer?, name: COpaquePointer?, termp: COpaquePointer?, winp: COpaquePointer?): PidT
