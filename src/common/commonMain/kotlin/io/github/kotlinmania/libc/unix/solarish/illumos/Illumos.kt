// port-lint: source unix/solarish/illumos.rs
@file:OptIn(ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.unix.solarish.illumos

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CChar
import io.github.kotlinmania.libc.CDouble
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CShort
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.CUlong
import io.github.kotlinmania.libc.CUshort
import io.github.kotlinmania.libc.unix.Iovec
import io.github.kotlinmania.libc.unix.LocaleT
import io.github.kotlinmania.libc.unix.PidT
import io.github.kotlinmania.libc.unix.SizeT
import io.github.kotlinmania.libc.unix.SsizeT
import io.github.kotlinmania.libc.unix.Timeval
import io.github.kotlinmania.libc.unix.solarish.AioResultT
import io.github.kotlinmania.libc.unix.solarish.CaddrT
import io.github.kotlinmania.libc.unix.solarish.ExitStatus
import io.github.kotlinmania.libc.unix.solarish.IdT
import io.github.kotlinmania.libc.unix.solarish.IpcPerm
import io.github.kotlinmania.libc.unix.solarish.Itimerspec
import io.github.kotlinmania.libc.unix.solarish.NET_MAC_AWARE
import io.github.kotlinmania.libc.unix.solarish.NET_MAC_AWARE_INHERIT
import io.github.kotlinmania.libc.unix.solarish.OffT
import io.github.kotlinmania.libc.unix.solarish.PRIV_AWARE_RESET
import io.github.kotlinmania.libc.unix.solarish.PRIV_DEBUG
import io.github.kotlinmania.libc.unix.solarish.PRIV_PFEXEC
import io.github.kotlinmania.libc.unix.solarish.PRIV_XPOLICY
import io.github.kotlinmania.libc.unix.solarish.PosixSpawnFileActionsT
import io.github.kotlinmania.libc.unix.solarish.ProcessoridT
import io.github.kotlinmania.libc.unix.solarish.PsetidT
import io.github.kotlinmania.libc.unix.solarish.PthreadAttrT
import io.github.kotlinmania.libc.unix.solarish.PthreadT
import io.github.kotlinmania.libc.unix.solarish.ShmattT
import io.github.kotlinmania.libc.unix.solarish.Sigevent
import io.github.kotlinmania.libc.unix.solarish.SigsetT
import io.github.kotlinmania.libc.unix.solarish.SpeedT
import io.github.kotlinmania.libc.unix.solarish.TimeT
import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
import io.github.kotlinmania.rustlang.core.mem.TypeLayout
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr

public typealias LgrpRsrcT = CInt

public typealias LgrpAffinityT = CInt

public class Aiocb internal constructor(
    public var aioFildes: CInt,
    aioBufCtorArg: MutPtr<CVoid>,
    public var aioNbytes: SizeT,
    public var aioOffset: OffT,
    public var aioReqprio: CInt,
    public var aioSigevent: Sigevent,
    public var aioLioOpcode: CInt,
    public var aioResultp: AioResultT,
    public var aioState: CInt,
    public var aioPad: IntArray,
) {
    public var aioBuf: MutPtr<CVoid> = aioBufCtorArg
        internal set

    public constructor() : this(
        aioFildes = 0,
        aioBufCtorArg = MutPtr(0L),
        aioNbytes = 0uL,
        aioOffset = 0L,
        aioReqprio = 0,
        aioSigevent = Sigevent(),
        aioLioOpcode = 0,
        aioResultp = AioResultT(),
        aioState = 0,
        aioPad = IntArray(1),
    )

    public operator fun component1(): CInt = this.aioFildes

    public operator fun component2(): MutPtr<CVoid> = this.aioBuf

    public operator fun component3(): SizeT = this.aioNbytes

    public operator fun component4(): OffT = this.aioOffset

    public operator fun component5(): CInt = this.aioReqprio

    public operator fun component6(): Sigevent = this.aioSigevent

    public operator fun component7(): CInt = this.aioLioOpcode

    public operator fun component8(): AioResultT = this.aioResultp

    public operator fun component9(): CInt = this.aioState

    public operator fun component10(): IntArray = this.aioPad

    public fun copy(aioFildes: CInt = this.aioFildes, aioBuf: MutPtr<CVoid> = this.aioBuf, aioNbytes: SizeT = this.aioNbytes, aioOffset: OffT = this.aioOffset, aioReqprio: CInt = this.aioReqprio, aioSigevent: Sigevent = this.aioSigevent, aioLioOpcode: CInt = this.aioLioOpcode, aioResultp: AioResultT = this.aioResultp, aioState: CInt = this.aioState, aioPad: IntArray = this.aioPad): Aiocb = Aiocb(aioFildes = aioFildes, aioBufCtorArg = aioBuf, aioNbytes = aioNbytes, aioOffset = aioOffset, aioReqprio = aioReqprio, aioSigevent = aioSigevent, aioLioOpcode = aioLioOpcode, aioResultp = aioResultp, aioState = aioState, aioPad = aioPad)

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
        if (!this.aioPad.contentEquals(other.aioPad)) return false
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
        result = 31 * result + this.aioPad.contentHashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            aioFildes: CInt = 0,
            aioBuf: MutPtr<CVoid> = MutPtr(0L),
            aioNbytes: SizeT = 0uL,
            aioOffset: OffT = 0L,
            aioReqprio: CInt = 0,
            aioSigevent: Sigevent = Sigevent(),
            aioLioOpcode: CInt = 0,
            aioResultp: AioResultT = AioResultT(),
            aioState: CInt = 0,
            aioPad: IntArray = IntArray(1),
        ): Aiocb =
            Aiocb(
                aioFildes = aioFildes,
                aioBufCtorArg = aioBuf,
                aioNbytes = aioNbytes,
                aioOffset = aioOffset,
                aioReqprio = aioReqprio,
                aioSigevent = aioSigevent,
                aioLioOpcode = aioLioOpcode,
                aioResultp = aioResultp,
                aioState = aioState,
                aioPad = aioPad,
            )
    }
}

public class ShmidDs internal constructor(
    public var shmPerm: IpcPerm,
    public var shmSegsz: SizeT,
    shmAmpCtorArg: MutPtr<CVoid>,
    public var shmLkcnt: CUshort,
    public var shmLpid: PidT,
    public var shmCpid: PidT,
    public var shmNattch: ShmattT,
    public var shmCnattch: CUlong,
    public var shmAtime: TimeT,
    public var shmDtime: TimeT,
    public var shmCtime: TimeT,
    public var shmPad4: LongArray,
) {
    public var shmAmp: MutPtr<CVoid> = shmAmpCtorArg
        internal set

    public constructor() : this(
        shmPerm = IpcPerm(),
        shmSegsz = 0uL,
        shmAmpCtorArg = MutPtr(0L),
        shmLkcnt = 0u,
        shmLpid = 0,
        shmCpid = 0,
        shmNattch = 0uL,
        shmCnattch = 0uL,
        shmAtime = 0L,
        shmDtime = 0L,
        shmCtime = 0L,
        shmPad4 = LongArray(4),
    )

    public operator fun component1(): IpcPerm = this.shmPerm

    public operator fun component2(): SizeT = this.shmSegsz

    public operator fun component3(): MutPtr<CVoid> = this.shmAmp

    public operator fun component4(): CUshort = this.shmLkcnt

    public operator fun component5(): PidT = this.shmLpid

    public operator fun component6(): PidT = this.shmCpid

    public operator fun component7(): ShmattT = this.shmNattch

    public operator fun component8(): CUlong = this.shmCnattch

    public operator fun component9(): TimeT = this.shmAtime

    public operator fun component10(): TimeT = this.shmDtime

    public operator fun component11(): TimeT = this.shmCtime

    public operator fun component12(): LongArray = this.shmPad4

    public fun copy(shmPerm: IpcPerm = this.shmPerm, shmSegsz: SizeT = this.shmSegsz, shmAmp: MutPtr<CVoid> = this.shmAmp, shmLkcnt: CUshort = this.shmLkcnt, shmLpid: PidT = this.shmLpid, shmCpid: PidT = this.shmCpid, shmNattch: ShmattT = this.shmNattch, shmCnattch: CUlong = this.shmCnattch, shmAtime: TimeT = this.shmAtime, shmDtime: TimeT = this.shmDtime, shmCtime: TimeT = this.shmCtime, shmPad4: LongArray = this.shmPad4): ShmidDs = ShmidDs(shmPerm = shmPerm, shmSegsz = shmSegsz, shmAmpCtorArg = shmAmp, shmLkcnt = shmLkcnt, shmLpid = shmLpid, shmCpid = shmCpid, shmNattch = shmNattch, shmCnattch = shmCnattch, shmAtime = shmAtime, shmDtime = shmDtime, shmCtime = shmCtime, shmPad4 = shmPad4)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ShmidDs) return false
        if (this.shmPerm != other.shmPerm) return false
        if (this.shmSegsz != other.shmSegsz) return false
        if (this.shmAmp != other.shmAmp) return false
        if (this.shmLkcnt != other.shmLkcnt) return false
        if (this.shmLpid != other.shmLpid) return false
        if (this.shmCpid != other.shmCpid) return false
        if (this.shmNattch != other.shmNattch) return false
        if (this.shmCnattch != other.shmCnattch) return false
        if (this.shmAtime != other.shmAtime) return false
        if (this.shmDtime != other.shmDtime) return false
        if (this.shmCtime != other.shmCtime) return false
        if (!this.shmPad4.contentEquals(other.shmPad4)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.shmPerm.hashCode()
        result = 31 * result + this.shmSegsz.hashCode()
        result = 31 * result + this.shmAmp.hashCode()
        result = 31 * result + this.shmLkcnt.hashCode()
        result = 31 * result + this.shmLpid.hashCode()
        result = 31 * result + this.shmCpid.hashCode()
        result = 31 * result + this.shmNattch.hashCode()
        result = 31 * result + this.shmCnattch.hashCode()
        result = 31 * result + this.shmAtime.hashCode()
        result = 31 * result + this.shmDtime.hashCode()
        result = 31 * result + this.shmCtime.hashCode()
        result = 31 * result + this.shmPad4.contentHashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            shmPerm: IpcPerm = IpcPerm(),
            shmSegsz: SizeT = 0uL,
            shmAmp: MutPtr<CVoid> = MutPtr(0L),
            shmLkcnt: CUshort = 0u,
            shmLpid: PidT = 0,
            shmCpid: PidT = 0,
            shmNattch: ShmattT = 0uL,
            shmCnattch: CUlong = 0uL,
            shmAtime: TimeT = 0L,
            shmDtime: TimeT = 0L,
            shmCtime: TimeT = 0L,
            shmPad4: LongArray = LongArray(4),
        ): ShmidDs =
            ShmidDs(
                shmPerm = shmPerm,
                shmSegsz = shmSegsz,
                shmAmpCtorArg = shmAmp,
                shmLkcnt = shmLkcnt,
                shmLpid = shmLpid,
                shmCpid = shmCpid,
                shmNattch = shmNattch,
                shmCnattch = shmCnattch,
                shmAtime = shmAtime,
                shmDtime = shmDtime,
                shmCtime = shmCtime,
                shmPad4 = shmPad4,
            )
    }
}

public data class FilInfo(
    public var fiFlags: CInt = 0,
    public var fiPos: CInt = 0,
    public var fiName: UByteArray = UByteArray(FILNAME_MAX),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FilInfo) return false
        if (this.fiFlags != other.fiFlags) return false
        if (this.fiPos != other.fiPos) return false
        if (!this.fiName.contentEquals(other.fiName)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.fiFlags.hashCode()
        result = 31 * result + this.fiPos.hashCode()
        result = 31 * result + this.fiName.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<FilInfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<FilInfo> {
                override val sizeBytes: Long =
                    io.github.kotlinmania.rustlang.core.mem
                        .alignUpBytes(
                            (
                                io.github.kotlinmania.rustlang.core.mem
                                    .alignUpBytes(8L, 1L) + ((FILNAME_MAX).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8).strideBytes)
                            ),
                            maxOf(4L, 1L),
                        )
                override val alignBytes: Long = maxOf(4L, 1L)
                override fun readNative(addr: Long): FilInfo =
                    FilInfo(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 4L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (FILNAME_MAX).toInt())
                        ).readNative(
                            addr +
                                io.github.kotlinmania.rustlang.core.mem
                                    .alignUpBytes(8L, 1L),
                        ),
                    )
                override fun writeNative(addr: Long, value: FilInfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.fiFlags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 4L, value.fiPos)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (FILNAME_MAX).toInt())
                    ).writeNative(
                        addr +
                            io.github.kotlinmania.rustlang.core.mem
                                .alignUpBytes(8L, 1L),
                        value.fiName,
                    )
                }
            }
    }
}

public data class EpollEvent(
    public var events: UInt = 0u,
    public var u64: ULong = 0uL,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<EpollEvent> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<EpollEvent> {
                override val sizeBytes: Long = 16L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): EpollEvent =
                    EpollEvent(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: EpollEvent) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.events)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 8L, value.u64)
                }
            }
    }
}

public data class Utmpx(
    public var utUser: UByteArray = UByteArray(UTX_USERSIZE),
    public var utId: UByteArray = UByteArray(UTX_IDSIZE),
    public var utLine: UByteArray = UByteArray(UTX_LINESIZE),
    public var utPid: PidT = 0,
    public var utType: CShort = 0,
    public var utExit: ExitStatus = ExitStatus(),
    public var utTv: Timeval = Timeval(),
    public var utSession: CInt = 0,
    public var utPad: IntArray = IntArray(UTX_PADSIZE),
    public var utSyslen: CShort = 0,
    public var utHost: UByteArray = UByteArray(UTX_HOSTSIZE),
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
        if (!this.utPad.contentEquals(other.utPad)) return false
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
        result = 31 * result + this.utPad.contentHashCode()
        result = 31 * result + this.utSyslen.hashCode()
        result = 31 * result + this.utHost.contentHashCode()
        return result
    }
}

public val UTX_USERSIZE: Int = 32

public val UTX_LINESIZE: Int = 32

public val UTX_PADSIZE: Int = 5

public val UTX_IDSIZE: Int = 4

public val UTX_HOSTSIZE: Int = 257

public val AF_LOCAL: CInt = 1

// AF_UNIX
public val AF_FILE: CInt = 1

// AF_UNIX
public val EFD_SEMAPHORE: CInt = 0x1

public val EFD_NONBLOCK: CInt = 0x800

public val EFD_CLOEXEC: CInt = 0x80000

public val POLLRDHUP: CShort = 0x4000

public val TCP_KEEPIDLE: CInt = 34

public val TCP_KEEPCNT: CInt = 35

public val TCP_KEEPINTVL: CInt = 36

public val TCP_CONGESTION: CInt = 37

// These constants are correct for 64-bit programs or 32-bit programs that are
// not using large-file mode.  If Rust ever supports anything other than 64-bit
// compilation on illumos, this may require adjustment:
public val F_OFD_GETLK: CInt = 47

public val F_OFD_SETLK: CInt = 48

public val F_OFD_SETLKW: CInt = 49

public val F_FLOCK: CInt = 53

public val F_FLOCKW: CInt = 54

public val F_DUPFD_CLOEXEC: CInt = 37

public val F_DUPFD_CLOFORK: CInt = 58

public val F_DUP2FD_CLOEXEC: CInt = 36

public val F_DUP2FD_CLOFORK: CInt = 57

public val F_DUP3FD: CInt = 59

public val FD_CLOFORK: CInt = 2

public val FIL_ATTACH: CInt = 0x1

public val FIL_DETACH: CInt = 0x2

public val FIL_LIST: CInt = 0x3

public val FILNAME_MAX: CInt = 32

public val FILF_PROG: CInt = 0x1

public val FILF_AUTO: CInt = 0x2

public val FILF_BYPASS: CInt = 0x4

public val SOL_FILTER: CInt = 0xfffc

public val MADV_PURGE: CInt = 9

public val POSIX_FADV_NORMAL: CInt = 0

public val POSIX_FADV_RANDOM: CInt = 1

public val POSIX_FADV_SEQUENTIAL: CInt = 2

public val POSIX_FADV_WILLNEED: CInt = 3

public val POSIX_FADV_DONTNEED: CInt = 4

public val POSIX_FADV_NOREUSE: CInt = 5

public val POSIX_SPAWN_SETSID: CShort = 0x40

public val SIGINFO: CInt = 41

public val O_DIRECT: CInt = 0x2000000

public val O_CLOFORK: CInt = 0x4000000

public val MSG_CMSG_CLOEXEC: CInt = 0x1000

public val MSG_CMSG_CLOFORK: CInt = 0x2000

public val PBIND_HARD: ProcessoridT = -3

public val PBIND_SOFT: ProcessoridT = -4

public val PS_SYSTEM: CInt = 1

public val MAP_FILE: CInt = 0

public val MAP_32BIT: CInt = 0x80

public val AF_NCA: CInt = 28

public val PF_NCA: CInt = AF_NCA

public val LOCK_SH: CInt = 1

public val LOCK_EX: CInt = 2

public val LOCK_NB: CInt = 4

public val LOCK_UN: CInt = 8

public val PC_LAST: CInt = 101

public val CS_PATH: CInt = 65

public val VSTATUS: Int = 16

public val VERASE2: Int = 17

public val EPOLLIN: CInt = 0x1

public val EPOLLPRI: CInt = 0x2

public val EPOLLOUT: CInt = 0x4

public val EPOLLRDNORM: CInt = 0x40

public val EPOLLRDBAND: CInt = 0x80

public val EPOLLWRNORM: CInt = 0x100

public val EPOLLWRBAND: CInt = 0x200

public val EPOLLMSG: CInt = 0x400

public val EPOLLERR: CInt = 0x8

public val EPOLLHUP: CInt = 0x10

public val EPOLLET: CInt = 0x80000000.toInt()

public val EPOLLRDHUP: CInt = 0x2000

public val EPOLLONESHOT: CInt = 0x40000000

public val EPOLLWAKEUP: CInt = 0x20000000

public val EPOLLEXCLUSIVE: CInt = 0x10000000

public val EPOLL_CLOEXEC: CInt = 0x80000

public val EPOLL_CTL_ADD: CInt = 1

public val EPOLL_CTL_MOD: CInt = 3

public val EPOLL_CTL_DEL: CInt = 2

public val PRIV_USER: CUint = PRIV_DEBUG or NET_MAC_AWARE or NET_MAC_AWARE_INHERIT or PRIV_XPOLICY or PRIV_AWARE_RESET or PRIV_PFEXEC

public val LGRP_RSRC_COUNT: LgrpRsrcT = 2

public val LGRP_RSRC_CPU: LgrpRsrcT = 0

public val LGRP_RSRC_MEM: LgrpRsrcT = 1

public val P_DISABLED: CInt = 0x008

public val AT_SUN_HWCAP2: CUint = 2023u

public val AT_SUN_FPTYPE: CUint = 2027u

public val B1000000: SpeedT = 24u

public val B1152000: SpeedT = 25u

public val B1500000: SpeedT = 26u

public val B2000000: SpeedT = 27u

public val B2500000: SpeedT = 28u

public val B3000000: SpeedT = 29u

public val B3500000: SpeedT = 30u

public val B4000000: SpeedT = 31u

// sys/systeminfo.h
public val SI_ADDRESS_WIDTH: CInt = 520

// sys/timerfd.h
public val TFD_CLOEXEC: Int = 524288

public val TFD_NONBLOCK: Int = 2048

public val TFD_TIMER_ABSTIME: Int = 1 shl 0

public val TFD_TIMER_CANCEL_ON_SET: Int = 1 shl 1

public expect fun eventfd(initval: CUint, flags: CInt): CInt

public expect fun epollPwait(epfd: CInt, events: MutPtr<EpollEvent>, maxevents: CInt, timeout: CInt, sigmask: ConstPtr<SigsetT>): CInt

public expect fun epollCreate(size: CInt): CInt

public expect fun epollCreate1(flags: CInt): CInt

public expect fun epollWait(epfd: CInt, events: MutPtr<EpollEvent>, maxevents: CInt, timeout: CInt): CInt

public expect fun epollCtl(epfd: CInt, op: CInt, fd: CInt, event: MutPtr<EpollEvent>): CInt

public expect fun mincore(addr: CaddrT, len: SizeT, vec: MutPtr<CChar>): CInt

public expect fun psetBindLwp(pset: PsetidT, id: IdT, pid: PidT, opset: MutPtr<PsetidT>): CInt

public expect fun psetGetloadavg(pset: PsetidT, load: MutPtr<CDouble>, num: CInt): CInt

public expect fun pthreadAttrGetNp(thread: PthreadT, attr: MutPtr<PthreadAttrT>): CInt

public expect fun pthreadAttrGetstackaddr(attr: ConstPtr<PthreadAttrT>, stackaddr: MutPtr<MutPtr<CVoid>>): CInt

public expect fun pthreadAttrSetstack(attr: MutPtr<PthreadAttrT>, stackaddr: MutPtr<CVoid>, stacksize: SizeT): CInt

public expect fun pthreadAttrSetstackaddr(attr: MutPtr<PthreadAttrT>, stackaddr: MutPtr<CVoid>): CInt

public expect fun posixFadvise(fd: CInt, offset: OffT, len: OffT, advice: CInt): CInt

public expect fun preadv(fd: CInt, iov: ConstPtr<Iovec>, iovcnt: CInt, offset: OffT): SsizeT

public expect fun pwritev(fd: CInt, iov: ConstPtr<Iovec>, iovcnt: CInt, offset: OffT): SsizeT

public expect fun getpagesizes2(pagesize: MutPtr<SizeT>, nelem: CInt): CInt

public expect fun posixSpawnFileActionsAddfchdirNp(fileActions: MutPtr<PosixSpawnFileActionsT>, fd: CInt): CInt

public expect fun ptsnameR(fildes: CInt, name: MutPtr<CChar>, namelen: SizeT): CInt

public expect fun syncfs(fd: CInt): CInt

public expect fun strcasecmpL(s1: ConstPtr<CChar>, s2: ConstPtr<CChar>, loc: LocaleT): CInt

public expect fun strncasecmpL(s1: ConstPtr<CChar>, s2: ConstPtr<CChar>, n: SizeT, loc: LocaleT): CInt

public expect fun timerfdCreate(clockid: CInt, flags: CInt): CInt

public expect fun timerfdGettime(fd: CInt, currValue: MutPtr<Itimerspec>): CInt

public expect fun timerfdSettime(fd: CInt, flags: CInt, newValue: ConstPtr<Itimerspec>, oldValue: MutPtr<Itimerspec>): CInt
