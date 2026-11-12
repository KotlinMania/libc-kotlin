// port-lint: source unix/solarish/solaris.rs
@file:OptIn(ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.unix.solarish.solaris

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CChar
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CShort
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.CUlong
import io.github.kotlinmania.libc.CUlonglong
import io.github.kotlinmania.libc.CUshort
import io.github.kotlinmania.libc.unix.PidT
import io.github.kotlinmania.libc.unix.SizeT
import io.github.kotlinmania.libc.unix.Timeval
import io.github.kotlinmania.libc.unix.UintptrT
import io.github.kotlinmania.libc.unix.Winsize
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
import io.github.kotlinmania.libc.unix.solarish.PthreadAttrT
import io.github.kotlinmania.libc.unix.solarish.PthreadT
import io.github.kotlinmania.libc.unix.solarish.ShmattT
import io.github.kotlinmania.libc.unix.solarish.Sigevent
import io.github.kotlinmania.libc.unix.solarish.Termios
import io.github.kotlinmania.libc.unix.solarish.TimeT
import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
import io.github.kotlinmania.rustlang.core.mem.TypeLayout
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr

public fun interface DoorCreateServerProcedureCallback {
    public operator fun invoke(cookie: MutPtr<CVoid>, argp: MutPtr<CChar>, argSize: SizeT, dp: MutPtr<DoorDescT>, nDesc: CUint)
}

public typealias DoorAttrT = CUint

public typealias DoorIdT = CUlonglong

public typealias LgrpAffinityT = CUint

public enum class LgrpRsrcT(
    public val value: UInt,
) {
    LGRP_RSRC_CPU(0u),
    LGRP_RSRC_MEM(1u),
    LGRP_RSRC_TYPES(2u),
}

public class Aiocb internal constructor(
    public var aioFildes: CInt,
    aioBufCtorArg: MutPtr<CVoid>,
    public var aioNbytes: SizeT,
    public var aioOffset: OffT,
    public var aioReqprio: CInt,
    public var aioSigevent: Sigevent,
    public var aioLioOpcode: CInt,
    public var aioResultp: AioResultT,
    public var aioState: CChar,
    public var aioReturned: CChar,
    public var aioPad1: UByteArray,
    public var aioFlags: CInt,
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
        aioState = 0u,
        aioReturned = 0u,
        aioPad1 = UByteArray(2),
        aioFlags = 0,
    )

    public operator fun component1(): CInt = this.aioFildes

    public operator fun component2(): MutPtr<CVoid> = this.aioBuf

    public operator fun component3(): SizeT = this.aioNbytes

    public operator fun component4(): OffT = this.aioOffset

    public operator fun component5(): CInt = this.aioReqprio

    public operator fun component6(): Sigevent = this.aioSigevent

    public operator fun component7(): CInt = this.aioLioOpcode

    public operator fun component8(): AioResultT = this.aioResultp

    public operator fun component9(): CChar = this.aioState

    public operator fun component10(): CChar = this.aioReturned

    public operator fun component11(): UByteArray = this.aioPad1

    public operator fun component12(): CInt = this.aioFlags

    public fun copy(aioFildes: CInt = this.aioFildes, aioBuf: MutPtr<CVoid> = this.aioBuf, aioNbytes: SizeT = this.aioNbytes, aioOffset: OffT = this.aioOffset, aioReqprio: CInt = this.aioReqprio, aioSigevent: Sigevent = this.aioSigevent, aioLioOpcode: CInt = this.aioLioOpcode, aioResultp: AioResultT = this.aioResultp, aioState: CChar = this.aioState, aioReturned: CChar = this.aioReturned, aioPad1: UByteArray = this.aioPad1, aioFlags: CInt = this.aioFlags): Aiocb = Aiocb(aioFildes = aioFildes, aioBufCtorArg = aioBuf, aioNbytes = aioNbytes, aioOffset = aioOffset, aioReqprio = aioReqprio, aioSigevent = aioSigevent, aioLioOpcode = aioLioOpcode, aioResultp = aioResultp, aioState = aioState, aioReturned = aioReturned, aioPad1 = aioPad1, aioFlags = aioFlags)

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
            aioState: CChar = 0u,
            aioReturned: CChar = 0u,
            aioPad1: UByteArray = UByteArray(2),
            aioFlags: CInt = 0,
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
                aioReturned = aioReturned,
                aioPad1 = aioPad1,
                aioFlags = aioFlags,
            )
    }
}

public class ShmidDs internal constructor(
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
    shmAmpCtorArg: MutPtr<CVoid>,
    public var shmGransize: ULong,
    public var shmAllocated: ULong,
    public var shmPad4: LongArray,
) {
    public var shmAmp: MutPtr<CVoid> = shmAmpCtorArg
        internal set

    public constructor() : this(
        shmPerm = IpcPerm(),
        shmSegsz = 0uL,
        shmFlags = 0uL,
        shmLkcnt = 0u,
        shmLpid = 0,
        shmCpid = 0,
        shmNattch = 0uL,
        shmCnattch = 0uL,
        shmAtime = 0L,
        shmDtime = 0L,
        shmCtime = 0L,
        shmAmpCtorArg = MutPtr(0L),
        shmGransize = 0uL,
        shmAllocated = 0uL,
        shmPad4 = LongArray(1),
    )

    public operator fun component1(): IpcPerm = this.shmPerm

    public operator fun component2(): SizeT = this.shmSegsz

    public operator fun component3(): UintptrT = this.shmFlags

    public operator fun component4(): CUshort = this.shmLkcnt

    public operator fun component5(): PidT = this.shmLpid

    public operator fun component6(): PidT = this.shmCpid

    public operator fun component7(): ShmattT = this.shmNattch

    public operator fun component8(): CUlong = this.shmCnattch

    public operator fun component9(): TimeT = this.shmAtime

    public operator fun component10(): TimeT = this.shmDtime

    public operator fun component11(): TimeT = this.shmCtime

    public operator fun component12(): MutPtr<CVoid> = this.shmAmp

    public operator fun component13(): ULong = this.shmGransize

    public operator fun component14(): ULong = this.shmAllocated

    public operator fun component15(): LongArray = this.shmPad4

    public fun copy(shmPerm: IpcPerm = this.shmPerm, shmSegsz: SizeT = this.shmSegsz, shmFlags: UintptrT = this.shmFlags, shmLkcnt: CUshort = this.shmLkcnt, shmLpid: PidT = this.shmLpid, shmCpid: PidT = this.shmCpid, shmNattch: ShmattT = this.shmNattch, shmCnattch: CUlong = this.shmCnattch, shmAtime: TimeT = this.shmAtime, shmDtime: TimeT = this.shmDtime, shmCtime: TimeT = this.shmCtime, shmAmp: MutPtr<CVoid> = this.shmAmp, shmGransize: ULong = this.shmGransize, shmAllocated: ULong = this.shmAllocated, shmPad4: LongArray = this.shmPad4): ShmidDs = ShmidDs(shmPerm = shmPerm, shmSegsz = shmSegsz, shmFlags = shmFlags, shmLkcnt = shmLkcnt, shmLpid = shmLpid, shmCpid = shmCpid, shmNattch = shmNattch, shmCnattch = shmCnattch, shmAtime = shmAtime, shmDtime = shmDtime, shmCtime = shmCtime, shmAmpCtorArg = shmAmp, shmGransize = shmGransize, shmAllocated = shmAllocated, shmPad4 = shmPad4)

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

    public companion object {
        public operator fun invoke(
            shmPerm: IpcPerm = IpcPerm(),
            shmSegsz: SizeT = 0uL,
            shmFlags: UintptrT = 0uL,
            shmLkcnt: CUshort = 0u,
            shmLpid: PidT = 0,
            shmCpid: PidT = 0,
            shmNattch: ShmattT = 0uL,
            shmCnattch: CUlong = 0uL,
            shmAtime: TimeT = 0L,
            shmDtime: TimeT = 0L,
            shmCtime: TimeT = 0L,
            shmAmp: MutPtr<CVoid> = MutPtr(0L),
            shmGransize: ULong = 0uL,
            shmAllocated: ULong = 0uL,
            shmPad4: LongArray = LongArray(1),
        ): ShmidDs =
            ShmidDs(
                shmPerm = shmPerm,
                shmSegsz = shmSegsz,
                shmFlags = shmFlags,
                shmLkcnt = shmLkcnt,
                shmLpid = shmLpid,
                shmCpid = shmCpid,
                shmNattch = shmNattch,
                shmCnattch = shmCnattch,
                shmAtime = shmAtime,
                shmDtime = shmDtime,
                shmCtime = shmCtime,
                shmAmpCtorArg = shmAmp,
                shmGransize = shmGransize,
                shmAllocated = shmAllocated,
                shmPad4 = shmPad4,
            )
    }
}

public class XrsT internal constructor(
    public var xrsId: CUlong,
    xrsPtrCtorArg: MutPtr<CChar>,
) {
    public var xrsPtr: MutPtr<CChar> = xrsPtrCtorArg
        internal set

    public constructor() : this(
        xrsId = 0uL,
        xrsPtrCtorArg = MutPtr(0L),
    )

    public operator fun component1(): CUlong = this.xrsId

    public operator fun component2(): MutPtr<CChar> = this.xrsPtr

    public fun copy(xrsId: CUlong = this.xrsId, xrsPtr: MutPtr<CChar> = this.xrsPtr): XrsT = XrsT(xrsId = xrsId, xrsPtrCtorArg = xrsPtr)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is XrsT) return false
        if (this.xrsId != other.xrsId) return false
        if (this.xrsPtr != other.xrsPtr) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.xrsId.hashCode()
        result = 31 * result + this.xrsPtr.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<XrsT> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<XrsT> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): XrsT =
                    XrsT(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CChar>(64)
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: XrsT) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr, value.xrsId)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CChar>(64)
                    ).writeNative(addr + 8L, value.xrsPtr)
                }
            }

        public operator fun invoke(
            xrsId: CUlong = 0uL,
            xrsPtr: MutPtr<CChar> = MutPtr(0L),
        ): XrsT =
            XrsT(
                xrsId = xrsId,
                xrsPtrCtorArg = xrsPtr,
            )
    }
}

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

public data class DoorDescTDDataDDesc(
    public var dDescriptor: CInt = 0,
    public var dId: DoorIdT = 0uL,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<DoorDescTDDataDDesc> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<DoorDescTDDataDDesc> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 12L
                override fun readNative(addr: Long): DoorDescTDDataDDesc =
                    DoorDescTDDataDDesc(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: DoorDescTDDataDDesc) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.dDescriptor)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 4L, value.dId)
                }
            }
    }
}

public data class DoorDescTDData(
    public var dDesc: DoorDescTDDataDDesc = DoorDescTDDataDDesc(),
    public var dResv: IntArray = IntArray(5),
) {
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

public data class DoorDescT(
    public var dAttributes: DoorAttrT = 0u,
    public var dData: DoorDescTDData = DoorDescTDData(),
)

public class DoorArgT internal constructor(
    dataPtrCtorArg: ConstPtr<CChar>,
    public var dataSize: SizeT,
    descPtrCtorArg: ConstPtr<DoorDescT>,
    public var decNum: CUint,
    rbufCtorArg: ConstPtr<CChar>,
    public var rsize: SizeT,
) {
    public var dataPtr: ConstPtr<CChar> = dataPtrCtorArg
        internal set

    public var descPtr: ConstPtr<DoorDescT> = descPtrCtorArg
        internal set

    public var rbuf: ConstPtr<CChar> = rbufCtorArg
        internal set

    public constructor() : this(
        dataPtrCtorArg = ConstPtr(0L),
        dataSize = 0uL,
        descPtrCtorArg = ConstPtr(0L),
        decNum = 0u,
        rbufCtorArg = ConstPtr(0L),
        rsize = 0uL,
    )

    public operator fun component1(): ConstPtr<CChar> = this.dataPtr

    public operator fun component2(): SizeT = this.dataSize

    public operator fun component3(): ConstPtr<DoorDescT> = this.descPtr

    public operator fun component4(): CUint = this.decNum

    public operator fun component5(): ConstPtr<CChar> = this.rbuf

    public operator fun component6(): SizeT = this.rsize

    public fun copy(dataPtr: ConstPtr<CChar> = this.dataPtr, dataSize: SizeT = this.dataSize, descPtr: ConstPtr<DoorDescT> = this.descPtr, decNum: CUint = this.decNum, rbuf: ConstPtr<CChar> = this.rbuf, rsize: SizeT = this.rsize): DoorArgT = DoorArgT(dataPtrCtorArg = dataPtr, dataSize = dataSize, descPtrCtorArg = descPtr, decNum = decNum, rbufCtorArg = rbuf, rsize = rsize)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DoorArgT) return false
        if (this.dataPtr != other.dataPtr) return false
        if (this.dataSize != other.dataSize) return false
        if (this.descPtr != other.descPtr) return false
        if (this.decNum != other.decNum) return false
        if (this.rbuf != other.rbuf) return false
        if (this.rsize != other.rsize) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dataPtr.hashCode()
        result = 31 * result + this.dataSize.hashCode()
        result = 31 * result + this.descPtr.hashCode()
        result = 31 * result + this.decNum.hashCode()
        result = 31 * result + this.rbuf.hashCode()
        result = 31 * result + this.rsize.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<DoorArgT> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<DoorArgT> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 48L
                override fun readNative(addr: Long): DoorArgT =
                    DoorArgT(
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .constPtrLayout<CChar>(64)
                        ).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 8L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .constPtrLayout<DoorDescT>(64)
                        ).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 24L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .constPtrLayout<CChar>(64)
                        ).readNative(addr + 32L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 40L),
                    )
                override fun writeNative(addr: Long, value: DoorArgT) {
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .constPtrLayout<CChar>(64)
                    ).writeNative(addr, value.dataPtr)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 8L, value.dataSize)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .constPtrLayout<DoorDescT>(64)
                    ).writeNative(addr + 16L, value.descPtr)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 24L, value.decNum)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .constPtrLayout<CChar>(64)
                    ).writeNative(addr + 32L, value.rbuf)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 40L, value.rsize)
                }
            }

        public operator fun invoke(
            dataPtr: ConstPtr<CChar> = ConstPtr(0L),
            dataSize: SizeT = 0uL,
            descPtr: ConstPtr<DoorDescT> = ConstPtr(0L),
            decNum: CUint = 0u,
            rbuf: ConstPtr<CChar> = ConstPtr(0L),
            rsize: SizeT = 0uL,
        ): DoorArgT =
            DoorArgT(
                dataPtrCtorArg = dataPtr,
                dataSize = dataSize,
                descPtrCtorArg = descPtr,
                decNum = decNum,
                rbufCtorArg = rbuf,
                rsize = rsize,
            )
    }
}

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
public expect fun fexecve(fd: CInt, argv: ConstPtr<ConstPtr<CChar>>, envp: ConstPtr<ConstPtr<CChar>>): CInt

public expect fun mincore(addr: MutPtr<CVoid>, len: SizeT, vec: MutPtr<CChar>): CInt

public expect fun doorCall(d: CInt, params: MutPtr<DoorArgT>): CInt

public expect fun doorReturn(dataPtr: MutPtr<CChar>, dataSize: SizeT, descPtr: MutPtr<DoorDescT>, numDesc: CUint): CInt

public expect fun doorCreate(serverProcedure: DoorCreateServerProcedureCallback, cookie: MutPtr<CVoid>, attributes: DoorAttrT): CInt

public expect fun fattach(fildes: CInt, path: ConstPtr<CChar>): CInt

public expect fun pthreadGetattrNp(thread: PthreadT, attr: MutPtr<PthreadAttrT>): CInt

public expect fun euidaccess(path: ConstPtr<CChar>, amode: CInt): CInt

public expect fun openpty(amain: MutPtr<CInt>, asubord: MutPtr<CInt>, name: MutPtr<CChar>, termp: MutPtr<Termios>, winp: MutPtr<Winsize>): CInt

public expect fun forkpty(amain: MutPtr<CInt>, name: MutPtr<CChar>, termp: MutPtr<Termios>, winp: MutPtr<Winsize>): PidT
