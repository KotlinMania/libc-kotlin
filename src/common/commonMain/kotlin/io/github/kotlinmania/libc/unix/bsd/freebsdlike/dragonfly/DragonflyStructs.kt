@file:OptIn(ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.unix.bsd.freebsdlike.dragonfly

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CLong
import io.github.kotlinmania.libc.CShort
import io.github.kotlinmania.libc.CUchar
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.CUlong
import io.github.kotlinmania.libc.CUshort
import io.github.kotlinmania.libc.unix.GidT
import io.github.kotlinmania.libc.unix.IntptrT
import io.github.kotlinmania.libc.unix.PidT
import io.github.kotlinmania.libc.unix.Rusage
import io.github.kotlinmania.libc.unix.Sigval
import io.github.kotlinmania.libc.unix.SizeT
import io.github.kotlinmania.libc.unix.Timeval
import io.github.kotlinmania.libc.unix.UidT
import io.github.kotlinmania.libc.unix.UintptrT
import io.github.kotlinmania.libc.unix.bsd.FsidT
import io.github.kotlinmania.libc.unix.bsd.OffT
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.IpcPerm
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.ModeT
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.Rtprio
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.SigsetT
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.SockaddrStorage
import io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
import io.github.kotlinmania.rustlang.core.mem.TypeLayout
import io.github.kotlinmania.rustlang.core.ptr.MutPtr

public fun interface UcontextTUcCofuncCallback {
    public operator fun invoke(uc: MutPtr, arg: MutPtr)
}

public class Kevent internal constructor(
    public var ident: UintptrT,
    public var filter: CShort,
    public var flags: CUshort,
    public var fflags: CUint,
    public var data: IntptrT,
    udataCtorArg: MutPtr,
) {
    public var udata: MutPtr = udataCtorArg
        internal set

    public constructor() : this(
        ident = 0uL,
        filter = 0,
        flags = 0u,
        fflags = 0u,
        data = 0L,
        udataCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UintptrT = this.ident

    public operator fun component2(): CShort = this.filter

    public operator fun component3(): CUshort = this.flags

    public operator fun component4(): CUint = this.fflags

    public operator fun component5(): IntptrT = this.data

    public operator fun component6(): MutPtr = this.udata

    public fun copy(ident: UintptrT = this.ident, filter: CShort = this.filter, flags: CUshort = this.flags, fflags: CUint = this.fflags, data: IntptrT = this.data, udata: MutPtr = this.udata): Kevent = Kevent(ident = ident, filter = filter, flags = flags, fflags = fflags, data = data, udataCtorArg = udata)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Kevent) return false
        if (this.ident != other.ident) return false
        if (this.filter != other.filter) return false
        if (this.flags != other.flags) return false
        if (this.fflags != other.fflags) return false
        if (this.data != other.data) return false
        if (this.udata != other.udata) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.ident.hashCode()
        result = 31 * result + this.filter.hashCode()
        result = 31 * result + this.flags.hashCode()
        result = 31 * result + this.fflags.hashCode()
        result = 31 * result + this.data.hashCode()
        result = 31 * result + this.udata.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Kevent> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Kevent> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 32L
                override fun readNative(addr: Long): Kevent =
                    Kevent(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 10L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 16L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 24L),
                    )
                override fun writeNative(addr: Long, value: Kevent) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr, value.ident)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).writeNative(addr + 8L, value.filter)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 10L, value.flags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.fflags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 16L, value.data)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 24L, value.udata)
                }
            }

        public operator fun invoke(
            ident: UintptrT = 0uL,
            filter: CShort = 0,
            flags: CUshort = 0u,
            fflags: CUint = 0u,
            data: IntptrT = 0L,
            udata: MutPtr = MutPtr(0L),
        ): Kevent =
            Kevent(
                ident = ident,
                filter = filter,
                flags = flags,
                fflags = fflags,
                data = data,
                udataCtorArg = udata,
            )
    }
}

public data class ExitStatus(
    public var eTermination: UShort = 0u,
    public var eExit: UShort = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ExitStatus> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ExitStatus> {
                override val alignBytes: Long = 2L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): ExitStatus =
                    ExitStatus(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 2L),
                    )
                override fun writeNative(addr: Long, value: ExitStatus) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.eTermination)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 2L, value.eExit)
                }
            }
    }
}

public class Aiocb internal constructor(
    public var aioFildes: CInt,
    public var aioOffset: OffT,
    aioBufCtorArg: MutPtr,
    public var aioNbytes: SizeT,
    public var aioSigevent: Sigevent,
    public var aioLioOpcode: CInt,
    public var aioReqprio: CInt,
    public var aioVal: CInt,
    public var aioErr: CInt,
) {
    public var aioBuf: MutPtr = aioBufCtorArg
        internal set

    public constructor() : this(
        aioFildes = 0,
        aioOffset = 0L,
        aioBufCtorArg = MutPtr(0L),
        aioNbytes = 0uL,
        aioSigevent = Sigevent(),
        aioLioOpcode = 0,
        aioReqprio = 0,
        aioVal = 0,
        aioErr = 0,
    )

    public operator fun component1(): CInt = this.aioFildes

    public operator fun component2(): OffT = this.aioOffset

    public operator fun component3(): MutPtr = this.aioBuf

    public operator fun component4(): SizeT = this.aioNbytes

    public operator fun component5(): Sigevent = this.aioSigevent

    public operator fun component6(): CInt = this.aioLioOpcode

    public operator fun component7(): CInt = this.aioReqprio

    public operator fun component8(): CInt = this.aioVal

    public operator fun component9(): CInt = this.aioErr

    public fun copy(aioFildes: CInt = this.aioFildes, aioOffset: OffT = this.aioOffset, aioBuf: MutPtr = this.aioBuf, aioNbytes: SizeT = this.aioNbytes, aioSigevent: Sigevent = this.aioSigevent, aioLioOpcode: CInt = this.aioLioOpcode, aioReqprio: CInt = this.aioReqprio, aioVal: CInt = this.aioVal, aioErr: CInt = this.aioErr): Aiocb = Aiocb(aioFildes = aioFildes, aioOffset = aioOffset, aioBufCtorArg = aioBuf, aioNbytes = aioNbytes, aioSigevent = aioSigevent, aioLioOpcode = aioLioOpcode, aioReqprio = aioReqprio, aioVal = aioVal, aioErr = aioErr)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Aiocb) return false
        if (this.aioFildes != other.aioFildes) return false
        if (this.aioOffset != other.aioOffset) return false
        if (this.aioBuf != other.aioBuf) return false
        if (this.aioNbytes != other.aioNbytes) return false
        if (this.aioSigevent != other.aioSigevent) return false
        if (this.aioLioOpcode != other.aioLioOpcode) return false
        if (this.aioReqprio != other.aioReqprio) return false
        if (this.aioVal != other.aioVal) return false
        if (this.aioErr != other.aioErr) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.aioFildes.hashCode()
        result = 31 * result + this.aioOffset.hashCode()
        result = 31 * result + this.aioBuf.hashCode()
        result = 31 * result + this.aioNbytes.hashCode()
        result = 31 * result + this.aioSigevent.hashCode()
        result = 31 * result + this.aioLioOpcode.hashCode()
        result = 31 * result + this.aioReqprio.hashCode()
        result = 31 * result + this.aioVal.hashCode()
        result = 31 * result + this.aioErr.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            aioFildes: CInt = 0,
            aioOffset: OffT = 0L,
            aioBuf: MutPtr = MutPtr(0L),
            aioNbytes: SizeT = 0uL,
            aioSigevent: Sigevent = Sigevent(),
            aioLioOpcode: CInt = 0,
            aioReqprio: CInt = 0,
            aioVal: CInt = 0,
            aioErr: CInt = 0,
        ): Aiocb =
            Aiocb(
                aioFildes = aioFildes,
                aioOffset = aioOffset,
                aioBufCtorArg = aioBuf,
                aioNbytes = aioNbytes,
                aioSigevent = aioSigevent,
                aioLioOpcode = aioLioOpcode,
                aioReqprio = aioReqprio,
                aioVal = aioVal,
                aioErr = aioErr,
            )
    }
}

public data class Uuid(
    public var timeLow: UInt = 0u,
    public var timeMid: UShort = 0u,
    public var timeHiAndVersion: UShort = 0u,
    public var clockSeqHiAndReserved: UByte = 0u,
    public var clockSeqLow: UByte = 0u,
    public var node: UByteArray = UByteArray(6),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Uuid) return false
        if (this.timeLow != other.timeLow) return false
        if (this.timeMid != other.timeMid) return false
        if (this.timeHiAndVersion != other.timeHiAndVersion) return false
        if (this.clockSeqHiAndReserved != other.clockSeqHiAndReserved) return false
        if (this.clockSeqLow != other.clockSeqLow) return false
        if (!this.node.contentEquals(other.node)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.timeLow.hashCode()
        result = 31 * result + this.timeMid.hashCode()
        result = 31 * result + this.timeHiAndVersion.hashCode()
        result = 31 * result + this.clockSeqHiAndReserved.hashCode()
        result = 31 * result + this.clockSeqLow.hashCode()
        result = 31 * result + this.node.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Uuid> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Uuid> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): Uuid =
                    Uuid(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 6L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 9L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (6).toInt())
                        ).readNative(addr + 10L).toUByteArray(),
                    )
                override fun writeNative(addr: Long, value: Uuid) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.timeLow)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 4L, value.timeMid)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 6L, value.timeHiAndVersion)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 8L, value.clockSeqHiAndReserved)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 9L, value.clockSeqLow)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (6).toInt())
                    ).writeNative(addr + 10L, value.node.toList())
                }
            }
    }
}

public data class MqAttr(
    public var mqFlags: CLong = 0L,
    public var mqMaxmsg: CLong = 0L,
    public var mqMsgsize: CLong = 0L,
    public var mqCurmsgs: CLong = 0L,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<MqAttr> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<MqAttr> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 32L
                override fun readNative(addr: Long): MqAttr =
                    MqAttr(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 24L),
                    )
                override fun writeNative(addr: Long, value: MqAttr) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr, value.mqFlags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 8L, value.mqMaxmsg)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 16L, value.mqMsgsize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 24L, value.mqCurmsgs)
                }
            }
    }
}

public class Statvfs(
    public var fBsize: CUlong = 0uL,
    public var fFrsize: CUlong = 0uL,
    public var fBlocks: FsblkcntT = 0uL,
    public var fBfree: FsblkcntT = 0uL,
    public var fBavail: FsblkcntT = 0uL,
    public var fFiles: FsfilcntT = 0uL,
    public var fFfree: FsfilcntT = 0uL,
    public var fFavail: FsfilcntT = 0uL,
    public var fFsid: CUlong = 0uL,
    public var fFlag: CUlong = 0uL,
    public var fNamemax: CUlong = 0uL,
    public var fOwner: UidT = 0u,
    public var fType: CUint = 0u,
    public var fSyncreads: ULong = 0uL,
    public var fSyncwrites: ULong = 0uL,
    public var fAsyncreads: ULong = 0uL,
    public var fAsyncwrites: ULong = 0uL,
    public var fFsidUuid: UuidT = Uuid(),
    public var fUidUuid: UuidT = Uuid(),
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Statvfs> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Statvfs> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 160L
                override fun readNative(addr: Long): Statvfs =
                    Statvfs(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 32L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 40L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 48L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 56L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 64L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 72L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 80L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 88L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 92L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 96L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 104L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 112L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 120L),
                        (Uuid.typeLayout()).readNative(addr + 128L),
                        (Uuid.typeLayout()).readNative(addr + 144L),
                    )
                override fun writeNative(addr: Long, value: Statvfs) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr, value.fBsize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 8L, value.fFrsize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 16L, value.fBlocks)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 24L, value.fBfree)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 32L, value.fBavail)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 40L, value.fFiles)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 48L, value.fFfree)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 56L, value.fFavail)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 64L, value.fFsid)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 72L, value.fFlag)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 80L, value.fNamemax)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 88L, value.fOwner)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 92L, value.fType)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 96L, value.fSyncreads)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 104L, value.fSyncwrites)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 112L, value.fAsyncreads)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 120L, value.fAsyncwrites)
                    (Uuid.typeLayout()).writeNative(addr + 128L, value.fFsidUuid)
                    (Uuid.typeLayout()).writeNative(addr + 144L, value.fUidUuid)
                }
            }
    }
}

public class Stat(
    public var stIno: InoT = 0uL,
    public var stNlink: NlinkT = 0u,
    public var stDev: DevT = 0u,
    public var stMode: ModeT = 0u,
    public var stPadding1: UShort = 0u,
    public var stUid: UidT = 0u,
    public var stGid: GidT = 0u,
    public var stRdev: DevT = 0u,
    public var stAtime: TimeT = 0L,
    public var stAtimeNsec: CLong = 0L,
    public var stMtime: TimeT = 0L,
    public var stMtimeNsec: CLong = 0L,
    public var stCtime: TimeT = 0L,
    public var stCtimeNsec: CLong = 0L,
    public var stSize: OffT = 0L,
    public var stBlocks: Long = 0L,
    public var oldStBlksize: UInt = 0u,
    public var stFlags: UInt = 0u,
    public var stGen: UInt = 0u,
    public var stLspare: Int = 0,
    public var stBlksize: Long = 0L,
    public var stQspare2: Long = 0L,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Stat> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Stat> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 128L
                override fun readNative(addr: Long): Stat =
                    Stat(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 18L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 20L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 22L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 32L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 40L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 48L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 56L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 64L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 72L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 80L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 88L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 96L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 100L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 104L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 108L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 112L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 120L),
                    )
                override fun writeNative(addr: Long, value: Stat) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr, value.stIno)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.stNlink)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.stDev)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 16L, value.stMode)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 18L, value.stPadding1)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 20L, value.stUid)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 22L, value.stGid)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 24L, value.stRdev)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 32L, value.stAtime)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 40L, value.stAtimeNsec)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 48L, value.stMtime)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 56L, value.stMtimeNsec)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 64L, value.stCtime)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 72L, value.stCtimeNsec)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 80L, value.stSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 88L, value.stBlocks)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 96L, value.oldStBlksize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 100L, value.stFlags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 104L, value.stGen)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 108L, value.stLspare)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 112L, value.stBlksize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 120L, value.stQspare2)
                }
            }
    }
}

public class IfData(
    public var ifiType: CUchar = 0u,
    public var ifiPhysical: CUchar = 0u,
    public var ifiAddrlen: CUchar = 0u,
    public var ifiHdrlen: CUchar = 0u,
    public var ifiRecvquota: CUchar = 0u,
    public var ifiXmitquota: CUchar = 0u,
    public var ifiMtu: CUlong = 0uL,
    public var ifiMetric: CUlong = 0uL,
    public var ifiLinkState: CUlong = 0uL,
    public var ifiBaudrate: ULong = 0uL,
    public var ifiIpackets: CUlong = 0uL,
    public var ifiIerrors: CUlong = 0uL,
    public var ifiOpackets: CUlong = 0uL,
    public var ifiOerrors: CUlong = 0uL,
    public var ifiCollisions: CUlong = 0uL,
    public var ifiIbytes: CUlong = 0uL,
    public var ifiObytes: CUlong = 0uL,
    public var ifiImcasts: CUlong = 0uL,
    public var ifiOmcasts: CUlong = 0uL,
    public var ifiIqdrops: CUlong = 0uL,
    public var ifiNoproto: CUlong = 0uL,
    public var ifiHwassist: CUlong = 0uL,
    public var ifiOqdrops: CUlong = 0uL,
    public var ifiLastchange: Timeval = Timeval(),
)

public data class IfMsghdr(
    public var ifmMsglen: CUshort = 0u,
    public var ifmVersion: CUchar = 0u,
    public var ifmType: CUchar = 0u,
    public var ifmAddrs: CInt = 0,
    public var ifmFlags: CInt = 0,
    public var ifmIndex: CUshort = 0u,
    public var ifmData: IfData = IfData(),
)

public data class SockaddrDl(
    public var sdlLen: CUchar = 0u,
    public var sdlFamily: CUchar = 0u,
    public var sdlIndex: CUshort = 0u,
    public var sdlType: CUchar = 0u,
    public var sdlNlen: CUchar = 0u,
    public var sdlAlen: CUchar = 0u,
    public var sdlSlen: CUchar = 0u,
    public var sdlData: UByteArray = UByteArray(12),
    public var sdlRcf: CUshort = 0u,
    public var sdlRoute: UShortArray = UShortArray(16),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SockaddrDl) return false
        if (this.sdlLen != other.sdlLen) return false
        if (this.sdlFamily != other.sdlFamily) return false
        if (this.sdlIndex != other.sdlIndex) return false
        if (this.sdlType != other.sdlType) return false
        if (this.sdlNlen != other.sdlNlen) return false
        if (this.sdlAlen != other.sdlAlen) return false
        if (this.sdlSlen != other.sdlSlen) return false
        if (!this.sdlData.contentEquals(other.sdlData)) return false
        if (this.sdlRcf != other.sdlRcf) return false
        if (!this.sdlRoute.contentEquals(other.sdlRoute)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.sdlLen.hashCode()
        result = 31 * result + this.sdlFamily.hashCode()
        result = 31 * result + this.sdlIndex.hashCode()
        result = 31 * result + this.sdlType.hashCode()
        result = 31 * result + this.sdlNlen.hashCode()
        result = 31 * result + this.sdlAlen.hashCode()
        result = 31 * result + this.sdlSlen.hashCode()
        result = 31 * result + this.sdlData.contentHashCode()
        result = 31 * result + this.sdlRcf.hashCode()
        result = 31 * result + this.sdlRoute.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SockaddrDl> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SockaddrDl> {
                override val alignBytes: Long = 2L
                override val sizeBytes: Long = 54L
                override fun readNative(addr: Long): SockaddrDl =
                    SockaddrDl(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 1L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 2L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 5L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 6L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 7L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (12).toInt())
                        ).readNative(addr + 8L).toUByteArray(),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 20L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (16).toInt())
                        ).readNative(addr + 22L).toUShortArray(),
                    )
                override fun writeNative(addr: Long, value: SockaddrDl) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr, value.sdlLen)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 1L, value.sdlFamily)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 2L, value.sdlIndex)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 4L, value.sdlType)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 5L, value.sdlNlen)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 6L, value.sdlAlen)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 7L, value.sdlSlen)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (12).toInt())
                    ).writeNative(addr + 8L, value.sdlData.toList())
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 20L, value.sdlRcf)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (16).toInt())
                    ).writeNative(addr + 22L, value.sdlRoute.toList())
                }
            }
    }
}

public class Xucred internal constructor(
    public var crVersion: CUint,
    public var crUid: UidT,
    public var crNgroups: CShort,
    public var crGroups: UShortArray,
    crUnused1CtorArg: MutPtr,
) {
    public var crUnused1: MutPtr = crUnused1CtorArg
        internal set

    public constructor() : this(
        crVersion = 0u,
        crUid = 0u,
        crNgroups = 0,
        crGroups = UShortArray(16),
        crUnused1CtorArg = MutPtr(0L),
    )

    public operator fun component1(): CUint = this.crVersion

    public operator fun component2(): UidT = this.crUid

    public operator fun component3(): CShort = this.crNgroups

    public operator fun component4(): UShortArray = this.crGroups

    public operator fun component5(): MutPtr = this.crUnused1

    public fun copy(crVersion: CUint = this.crVersion, crUid: UidT = this.crUid, crNgroups: CShort = this.crNgroups, crGroups: UShortArray = this.crGroups, crUnused1: MutPtr = this.crUnused1): Xucred = Xucred(crVersion = crVersion, crUid = crUid, crNgroups = crNgroups, crGroups = crGroups, crUnused1CtorArg = crUnused1)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Xucred) return false
        if (this.crVersion != other.crVersion) return false
        if (this.crUid != other.crUid) return false
        if (this.crNgroups != other.crNgroups) return false
        if (!this.crGroups.contentEquals(other.crGroups)) return false
        if (this.crUnused1 != other.crUnused1) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.crVersion.hashCode()
        result = 31 * result + this.crUid.hashCode()
        result = 31 * result + this.crNgroups.hashCode()
        result = 31 * result + this.crGroups.contentHashCode()
        result = 31 * result + this.crUnused1.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Xucred> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Xucred> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 48L
                override fun readNative(addr: Long): Xucred =
                    Xucred(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).readNative(addr + 6L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (16).toInt())
                        ).readNative(addr + 8L).toUShortArray(),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 40L),
                    )
                override fun writeNative(addr: Long, value: Xucred) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.crVersion)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 4L, value.crUid)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).writeNative(addr + 6L, value.crNgroups)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (16).toInt())
                    ).writeNative(addr + 8L, value.crGroups.toList())
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 40L, value.crUnused1)
                }
            }

        public operator fun invoke(
            crVersion: CUint = 0u,
            crUid: UidT = 0u,
            crNgroups: CShort = 0,
            crGroups: UShortArray = UShortArray(16),
            crUnused1: MutPtr = MutPtr(0L),
        ): Xucred =
            Xucred(
                crVersion = crVersion,
                crUid = crUid,
                crNgroups = crNgroups,
                crGroups = crGroups,
                crUnused1CtorArg = crUnused1,
            )
    }
}

public class StackT internal constructor(
    ssSpCtorArg: MutPtr,
    public var ssSize: SizeT,
    public var ssFlags: CInt,
) {
    public var ssSp: MutPtr = ssSpCtorArg
        internal set

    public constructor() : this(
        ssSpCtorArg = MutPtr(0L),
        ssSize = 0uL,
        ssFlags = 0,
    )

    public operator fun component1(): MutPtr = this.ssSp

    public operator fun component2(): SizeT = this.ssSize

    public operator fun component3(): CInt = this.ssFlags

    public fun copy(ssSp: MutPtr = this.ssSp, ssSize: SizeT = this.ssSize, ssFlags: CInt = this.ssFlags): StackT = StackT(ssSpCtorArg = ssSp, ssSize = ssSize, ssFlags = ssFlags)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is StackT) return false
        if (this.ssSp != other.ssSp) return false
        if (this.ssSize != other.ssSize) return false
        if (this.ssFlags != other.ssFlags) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.ssSp.hashCode()
        result = 31 * result + this.ssSize.hashCode()
        result = 31 * result + this.ssFlags.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<StackT> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<StackT> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 24L
                override fun readNative(addr: Long): StackT =
                    StackT(
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: StackT) {
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr, value.ssSp)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 8L, value.ssSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 16L, value.ssFlags)
                }
            }

        public operator fun invoke(
            ssSp: MutPtr = MutPtr(0L),
            ssSize: SizeT = 0uL,
            ssFlags: CInt = 0,
        ): StackT =
            StackT(
                ssSpCtorArg = ssSp,
                ssSize = ssSize,
                ssFlags = ssFlags,
            )
    }
}

public data class CpumaskT(
    public var ary: ULongArray = ULongArray(4),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CpumaskT) return false
        if (!this.ary.contentEquals(other.ary)) return false
        return true
    }

    override fun hashCode(): Int = this.ary.contentHashCode()

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<CpumaskT> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<CpumaskT> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 32L
                override fun readNative(addr: Long): CpumaskT =
                    CpumaskT(
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64, (4).toInt())
                        ).readNative(addr).toULongArray(),
                    )
                override fun writeNative(addr: Long, value: CpumaskT) {
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64, (4).toInt())
                    ).writeNative(addr, value.ary.toList())
                }
            }
    }
}

public class ShmidDs internal constructor(
    public var shmPerm: IpcPerm,
    public var shmSegsz: SizeT,
    public var shmLpid: PidT,
    public var shmCpid: PidT,
    public var shmNattch: ShmattT,
    public var shmAtime: TimeT,
    public var shmDtime: TimeT,
    public var shmCtime: TimeT,
    shmInternalCtorArg: MutPtr,
) {
    public var shmInternal: MutPtr = shmInternalCtorArg
        internal set

    public constructor() : this(
        shmPerm = IpcPerm(),
        shmSegsz = 0uL,
        shmLpid = 0,
        shmCpid = 0,
        shmNattch = 0u,
        shmAtime = 0L,
        shmDtime = 0L,
        shmCtime = 0L,
        shmInternalCtorArg = MutPtr(0L),
    )

    public operator fun component1(): IpcPerm = this.shmPerm

    public operator fun component2(): SizeT = this.shmSegsz

    public operator fun component3(): PidT = this.shmLpid

    public operator fun component4(): PidT = this.shmCpid

    public operator fun component5(): ShmattT = this.shmNattch

    public operator fun component6(): TimeT = this.shmAtime

    public operator fun component7(): TimeT = this.shmDtime

    public operator fun component8(): TimeT = this.shmCtime

    public operator fun component9(): MutPtr = this.shmInternal

    public fun copy(shmPerm: IpcPerm = this.shmPerm, shmSegsz: SizeT = this.shmSegsz, shmLpid: PidT = this.shmLpid, shmCpid: PidT = this.shmCpid, shmNattch: ShmattT = this.shmNattch, shmAtime: TimeT = this.shmAtime, shmDtime: TimeT = this.shmDtime, shmCtime: TimeT = this.shmCtime, shmInternal: MutPtr = this.shmInternal): ShmidDs = ShmidDs(shmPerm = shmPerm, shmSegsz = shmSegsz, shmLpid = shmLpid, shmCpid = shmCpid, shmNattch = shmNattch, shmAtime = shmAtime, shmDtime = shmDtime, shmCtime = shmCtime, shmInternalCtorArg = shmInternal)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ShmidDs) return false
        if (this.shmPerm != other.shmPerm) return false
        if (this.shmSegsz != other.shmSegsz) return false
        if (this.shmLpid != other.shmLpid) return false
        if (this.shmCpid != other.shmCpid) return false
        if (this.shmNattch != other.shmNattch) return false
        if (this.shmAtime != other.shmAtime) return false
        if (this.shmDtime != other.shmDtime) return false
        if (this.shmCtime != other.shmCtime) return false
        if (this.shmInternal != other.shmInternal) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.shmPerm.hashCode()
        result = 31 * result + this.shmSegsz.hashCode()
        result = 31 * result + this.shmLpid.hashCode()
        result = 31 * result + this.shmCpid.hashCode()
        result = 31 * result + this.shmNattch.hashCode()
        result = 31 * result + this.shmAtime.hashCode()
        result = 31 * result + this.shmDtime.hashCode()
        result = 31 * result + this.shmCtime.hashCode()
        result = 31 * result + this.shmInternal.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            shmPerm: IpcPerm = IpcPerm(),
            shmSegsz: SizeT = 0uL,
            shmLpid: PidT = 0,
            shmCpid: PidT = 0,
            shmNattch: ShmattT = 0u,
            shmAtime: TimeT = 0L,
            shmDtime: TimeT = 0L,
            shmCtime: TimeT = 0L,
            shmInternal: MutPtr = MutPtr(0L),
        ): ShmidDs =
            ShmidDs(
                shmPerm = shmPerm,
                shmSegsz = shmSegsz,
                shmLpid = shmLpid,
                shmCpid = shmCpid,
                shmNattch = shmNattch,
                shmAtime = shmAtime,
                shmDtime = shmDtime,
                shmCtime = shmCtime,
                shmInternalCtorArg = shmInternal,
            )
    }
}

public class KinfoFile internal constructor(
    public var fSize: SizeT,
    public var fPid: PidT,
    public var fUid: UidT,
    public var fFd: CInt,
    fFileCtorArg: MutPtr,
    public var fType: CShort,
    public var fCount: CInt,
    public var fMsgcount: CInt,
    public var fOffset: OffT,
    fDataCtorArg: MutPtr,
    public var fFlag: CUint,
) {
    public var fFile: MutPtr = fFileCtorArg
        internal set

    public var fData: MutPtr = fDataCtorArg
        internal set

    public constructor() : this(
        fSize = 0uL,
        fPid = 0,
        fUid = 0u,
        fFd = 0,
        fFileCtorArg = MutPtr(0L),
        fType = 0,
        fCount = 0,
        fMsgcount = 0,
        fOffset = 0L,
        fDataCtorArg = MutPtr(0L),
        fFlag = 0u,
    )

    public operator fun component1(): SizeT = this.fSize

    public operator fun component2(): PidT = this.fPid

    public operator fun component3(): UidT = this.fUid

    public operator fun component4(): CInt = this.fFd

    public operator fun component5(): MutPtr = this.fFile

    public operator fun component6(): CShort = this.fType

    public operator fun component7(): CInt = this.fCount

    public operator fun component8(): CInt = this.fMsgcount

    public operator fun component9(): OffT = this.fOffset

    public operator fun component10(): MutPtr = this.fData

    public operator fun component11(): CUint = this.fFlag

    public fun copy(fSize: SizeT = this.fSize, fPid: PidT = this.fPid, fUid: UidT = this.fUid, fFd: CInt = this.fFd, fFile: MutPtr = this.fFile, fType: CShort = this.fType, fCount: CInt = this.fCount, fMsgcount: CInt = this.fMsgcount, fOffset: OffT = this.fOffset, fData: MutPtr = this.fData, fFlag: CUint = this.fFlag): KinfoFile = KinfoFile(fSize = fSize, fPid = fPid, fUid = fUid, fFd = fFd, fFileCtorArg = fFile, fType = fType, fCount = fCount, fMsgcount = fMsgcount, fOffset = fOffset, fDataCtorArg = fData, fFlag = fFlag)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is KinfoFile) return false
        if (this.fSize != other.fSize) return false
        if (this.fPid != other.fPid) return false
        if (this.fUid != other.fUid) return false
        if (this.fFd != other.fFd) return false
        if (this.fFile != other.fFile) return false
        if (this.fType != other.fType) return false
        if (this.fCount != other.fCount) return false
        if (this.fMsgcount != other.fMsgcount) return false
        if (this.fOffset != other.fOffset) return false
        if (this.fData != other.fData) return false
        if (this.fFlag != other.fFlag) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.fSize.hashCode()
        result = 31 * result + this.fPid.hashCode()
        result = 31 * result + this.fUid.hashCode()
        result = 31 * result + this.fFd.hashCode()
        result = 31 * result + this.fFile.hashCode()
        result = 31 * result + this.fType.hashCode()
        result = 31 * result + this.fCount.hashCode()
        result = 31 * result + this.fMsgcount.hashCode()
        result = 31 * result + this.fOffset.hashCode()
        result = 31 * result + this.fData.hashCode()
        result = 31 * result + this.fFlag.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<KinfoFile> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<KinfoFile> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 72L
                override fun readNative(addr: Long): KinfoFile =
                    KinfoFile(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 16L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).readNative(addr + 32L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 36L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 40L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 48L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 56L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 64L),
                    )
                override fun writeNative(addr: Long, value: KinfoFile) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr, value.fSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 8L, value.fPid)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 12L, value.fUid)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 16L, value.fFd)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 24L, value.fFile)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).writeNative(addr + 32L, value.fType)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 36L, value.fCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 40L, value.fMsgcount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 48L, value.fOffset)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 56L, value.fData)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 64L, value.fFlag)
                }
            }

        public operator fun invoke(
            fSize: SizeT = 0uL,
            fPid: PidT = 0,
            fUid: UidT = 0u,
            fFd: CInt = 0,
            fFile: MutPtr = MutPtr(0L),
            fType: CShort = 0,
            fCount: CInt = 0,
            fMsgcount: CInt = 0,
            fOffset: OffT = 0L,
            fData: MutPtr = MutPtr(0L),
            fFlag: CUint = 0u,
        ): KinfoFile =
            KinfoFile(
                fSize = fSize,
                fPid = fPid,
                fUid = fUid,
                fFd = fFd,
                fFileCtorArg = fFile,
                fType = fType,
                fCount = fCount,
                fMsgcount = fMsgcount,
                fOffset = fOffset,
                fDataCtorArg = fData,
                fFlag = fFlag,
            )
    }
}

public data class KinfoCputime(
    public var cpUser: ULong = 0uL,
    public var cpNice: ULong = 0uL,
    public var cpSys: ULong = 0uL,
    public var cpIntr: ULong = 0uL,
    public var cpIdel: ULong = 0uL,
    public var cpUnused01: ULong = 0uL,
    public var cpUnused02: ULong = 0uL,
    public var cpSamplePc: ULong = 0uL,
    public var cpSampleSp: ULong = 0uL,
    public var cpMsg: UByteArray = UByteArray(32),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is KinfoCputime) return false
        if (this.cpUser != other.cpUser) return false
        if (this.cpNice != other.cpNice) return false
        if (this.cpSys != other.cpSys) return false
        if (this.cpIntr != other.cpIntr) return false
        if (this.cpIdel != other.cpIdel) return false
        if (this.cpUnused01 != other.cpUnused01) return false
        if (this.cpUnused02 != other.cpUnused02) return false
        if (this.cpSamplePc != other.cpSamplePc) return false
        if (this.cpSampleSp != other.cpSampleSp) return false
        if (!this.cpMsg.contentEquals(other.cpMsg)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cpUser.hashCode()
        result = 31 * result + this.cpNice.hashCode()
        result = 31 * result + this.cpSys.hashCode()
        result = 31 * result + this.cpIntr.hashCode()
        result = 31 * result + this.cpIdel.hashCode()
        result = 31 * result + this.cpUnused01.hashCode()
        result = 31 * result + this.cpUnused02.hashCode()
        result = 31 * result + this.cpSamplePc.hashCode()
        result = 31 * result + this.cpSampleSp.hashCode()
        result = 31 * result + this.cpMsg.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<KinfoCputime> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<KinfoCputime> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 104L
                override fun readNative(addr: Long): KinfoCputime =
                    KinfoCputime(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 32L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 40L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 48L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 56L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 64L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (32).toInt())
                        ).readNative(addr + 72L).toUByteArray(),
                    )
                override fun writeNative(addr: Long, value: KinfoCputime) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr, value.cpUser)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 8L, value.cpNice)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 16L, value.cpSys)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 24L, value.cpIntr)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 32L, value.cpIdel)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 40L, value.cpUnused01)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 48L, value.cpUnused02)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 56L, value.cpSamplePc)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 64L, value.cpSampleSp)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (32).toInt())
                    ).writeNative(addr + 72L, value.cpMsg.toList())
                }
            }
    }
}

public class KinfoLwp(
    public var klPid: PidT = 0,
    public var klTid: LwpidT = 0,
    public var klFlags: CInt = 0,
    public var klStat: Lwpstat = Lwpstat.entries.first(),
    public var klLock: CInt = 0,
    public var klTdflags: CInt = 0,
    public var klMpcount: CInt = 0,
    public var klPrio: CInt = 0,
    public var klTdprio: CInt = 0,
    public var klRtprio: Rtprio = Rtprio(),
    public var klUticks: ULong = 0uL,
    public var klSticks: ULong = 0uL,
    public var klIticks: ULong = 0uL,
    public var klCpticks: ULong = 0uL,
    public var klPctcpu: CUint = 0u,
    public var klSlptime: CUint = 0u,
    public var klOrigcpu: CInt = 0,
    public var klEstcpu: CInt = 0,
    public var klCpuid: CInt = 0,
    public var klRu: Rusage = Rusage(),
    public var klSiglist: SigsetT = SigsetT(),
    public var klSigmask: SigsetT = SigsetT(),
    public var klWchan: UintptrT = 0uL,
    public var klWmesg: UByteArray = UByteArray(9),
    public var klComm: UByteArray = UByteArray(MAXCOMLEN + 1),
)

public class KinfoProc(
    public var kpPaddr: UintptrT = 0uL,
    public var kpFlags: CInt = 0,
    public var kpStat: Procstat = Procstat.entries.first(),
    public var kpLock: CInt = 0,
    public var kpAcflag: CInt = 0,
    public var kpTraceflag: CInt = 0,
    public var kpFd: UintptrT = 0uL,
    public var kpSiglist: SigsetT = SigsetT(),
    public var kpSigignore: SigsetT = SigsetT(),
    public var kpSigcatch: SigsetT = SigsetT(),
    public var kpSigflag: CInt = 0,
    public var kpStart: Timeval = Timeval(),
    public var kpComm: UByteArray = UByteArray(MAXCOMLEN + 1),
    public var kpUid: UidT = 0u,
    public var kpNgroups: CShort = 0,
    public var kpGroups: UShortArray = UShortArray(NGROUPS),
    public var kpRuid: UidT = 0u,
    public var kpSvuid: UidT = 0u,
    public var kpRgid: GidT = 0u,
    public var kpSvgid: GidT = 0u,
    public var kpPid: PidT = 0,
    public var kpPpid: PidT = 0,
    public var kpPgid: PidT = 0,
    public var kpJobc: CInt = 0,
    public var kpSid: PidT = 0,
    public var kpLogin: UByteArray = UByteArray(40),
    // MAXNAMELEN rounded up to the nearest sizeof(long)
    public var kpTdev: DevT = 0u,
    public var kpTpgid: PidT = 0,
    public var kpTsid: PidT = 0,
    public var kpExitstat: CUshort = 0u,
    public var kpNthreads: CInt = 0,
    public var kpNice: CInt = 0,
    public var kpSwtime: CUint = 0u,
    public var kpVmMapSize: SizeT = 0uL,
    public var kpVmRssize: SegszT = 0,
    public var kpVmSwrss: SegszT = 0,
    public var kpVmTsize: SegszT = 0,
    public var kpVmDsize: SegszT = 0,
    public var kpVmSsize: SegszT = 0,
    public var kpVmPrssize: CUint = 0u,
    public var kpJailid: CInt = 0,
    public var kpRu: Rusage = Rusage(),
    public var kpCru: Rusage = Rusage(),
    public var kpAuxflags: CInt = 0,
    public var kpLwp: KinfoLwp = KinfoLwp(),
    public var kpKtaddr: UintptrT = 0uL,
    public var kpSpare: IntArray = IntArray(2),
)

public data class CAnonymousVmMap(
    public var priv: ULongArray = ULongArray(36),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CAnonymousVmMap) return false
        if (!this.priv.contentEquals(other.priv)) return false
        return true
    }

    override fun hashCode(): Int = this.priv.contentHashCode()

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<CAnonymousVmMap> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<CAnonymousVmMap> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 288L
                override fun readNative(addr: Long): CAnonymousVmMap =
                    CAnonymousVmMap(
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64, (36).toInt())
                        ).readNative(addr).toULongArray(),
                    )
                override fun writeNative(addr: Long, value: CAnonymousVmMap) {
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64, (36).toInt())
                    ).writeNative(addr, value.priv.toList())
                }
            }
    }
}

public data class VmMapEntry(
    public var priv: ULongArray = ULongArray(15),
    public var eflags: VmEflagsT = 0u,
    public var maptype: VmMaptypeT = 0u,
    public var protection: VmProtT = 0u,
    public var maxProtection: VmProtT = 0u,
    public var inheritance: VmInheritT = 0,
    public var wiredCount: CInt = 0,
    public var id: VmSubsysT = 0,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is VmMapEntry) return false
        if (!this.priv.contentEquals(other.priv)) return false
        if (this.eflags != other.eflags) return false
        if (this.maptype != other.maptype) return false
        if (this.protection != other.protection) return false
        if (this.maxProtection != other.maxProtection) return false
        if (this.inheritance != other.inheritance) return false
        if (this.wiredCount != other.wiredCount) return false
        if (this.id != other.id) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.priv.contentHashCode()
        result = 31 * result + this.eflags.hashCode()
        result = 31 * result + this.maptype.hashCode()
        result = 31 * result + this.protection.hashCode()
        result = 31 * result + this.maxProtection.hashCode()
        result = 31 * result + this.inheritance.hashCode()
        result = 31 * result + this.wiredCount.hashCode()
        result = 31 * result + this.id.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<VmMapEntry> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<VmMapEntry> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 136L
                override fun readNative(addr: Long): VmMapEntry =
                    VmMapEntry(
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64, (15).toInt())
                        ).readNative(addr).toULongArray(),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 120L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 124L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 125L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 126L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8).readNative(addr + 127L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 128L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 132L),
                    )
                override fun writeNative(addr: Long, value: VmMapEntry) {
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64, (15).toInt())
                    ).writeNative(addr, value.priv.toList())
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 120L, value.eflags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 124L, value.maptype)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 125L, value.protection)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 126L, value.maxProtection)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8).writeNative(addr + 127L, value.inheritance)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 128L, value.wiredCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 132L, value.id)
                }
            }
    }
}

public data class CAnonymousPmap(
    public var priv1: ULongArray = ULongArray(32),
    public var priv2: ULongArray = ULongArray(32),
    public var priv3: ULongArray = ULongArray(32),
    public var priv4: ULongArray = ULongArray(32),
    public var priv5: ULongArray = ULongArray(8),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CAnonymousPmap) return false
        if (!this.priv1.contentEquals(other.priv1)) return false
        if (!this.priv2.contentEquals(other.priv2)) return false
        if (!this.priv3.contentEquals(other.priv3)) return false
        if (!this.priv4.contentEquals(other.priv4)) return false
        if (!this.priv5.contentEquals(other.priv5)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.priv1.contentHashCode()
        result = 31 * result + this.priv2.contentHashCode()
        result = 31 * result + this.priv3.contentHashCode()
        result = 31 * result + this.priv4.contentHashCode()
        result = 31 * result + this.priv5.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<CAnonymousPmap> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<CAnonymousPmap> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 1088L
                override fun readNative(addr: Long): CAnonymousPmap =
                    CAnonymousPmap(
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64, (32).toInt())
                        ).readNative(addr).toULongArray(),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64, (32).toInt())
                        ).readNative(addr + 256L).toULongArray(),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64, (32).toInt())
                        ).readNative(addr + 512L).toULongArray(),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64, (32).toInt())
                        ).readNative(addr + 768L).toULongArray(),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64, (8).toInt())
                        ).readNative(addr + 1024L).toULongArray(),
                    )
                override fun writeNative(addr: Long, value: CAnonymousPmap) {
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64, (32).toInt())
                    ).writeNative(addr, value.priv1.toList())
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64, (32).toInt())
                    ).writeNative(addr + 256L, value.priv2.toList())
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64, (32).toInt())
                    ).writeNative(addr + 512L, value.priv3.toList())
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64, (32).toInt())
                    ).writeNative(addr + 768L, value.priv4.toList())
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64, (8).toInt())
                    ).writeNative(addr + 1024L, value.priv5.toList())
                }
            }
    }
}

public class Vmspace internal constructor(
    public var vmMap: CAnonymousVmMap,
    public var vmPmap: CAnonymousPmap,
    public var vmFlags: CInt,
    vmShmCtorArg: MutPtr,
    public var vmRssize: SegszT,
    public var vmSwrss: SegszT,
    public var vmTsize: SegszT,
    public var vmDsize: SegszT,
    public var vmSsize: SegszT,
    vmTaddrCtorArg: MutPtr,
    vmDaddrCtorArg: MutPtr,
    vmMaxsaddrCtorArg: MutPtr,
    vmMinsaddrCtorArg: MutPtr,
    public var unused1: CInt,
    public var unused2: CInt,
    public var vmPagesupply: CInt,
    public var vmHoldcnt: CUint,
    public var vmRefcnt: CUint,
) {
    public var vmShm: MutPtr = vmShmCtorArg
        internal set

    public var vmTaddr: MutPtr = vmTaddrCtorArg
        internal set

    public var vmDaddr: MutPtr = vmDaddrCtorArg
        internal set

    public var vmMaxsaddr: MutPtr = vmMaxsaddrCtorArg
        internal set

    public var vmMinsaddr: MutPtr = vmMinsaddrCtorArg
        internal set

    public constructor() : this(
        vmMap = CAnonymousVmMap(),
        vmPmap = CAnonymousPmap(),
        vmFlags = 0,
        vmShmCtorArg = MutPtr(0L),
        vmRssize = 0,
        vmSwrss = 0,
        vmTsize = 0,
        vmDsize = 0,
        vmSsize = 0,
        vmTaddrCtorArg = MutPtr(0L),
        vmDaddrCtorArg = MutPtr(0L),
        vmMaxsaddrCtorArg = MutPtr(0L),
        vmMinsaddrCtorArg = MutPtr(0L),
        unused1 = 0,
        unused2 = 0,
        vmPagesupply = 0,
        vmHoldcnt = 0u,
        vmRefcnt = 0u,
    )

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Vmspace> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Vmspace> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 1488L
                override fun readNative(addr: Long): Vmspace =
                    Vmspace(
                        (CAnonymousVmMap.typeLayout()).readNative(addr),
                        (CAnonymousPmap.typeLayout()).readNative(addr + 288L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 1376L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 1384L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).readNative(addr + 1392L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).readNative(addr + 1400L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).readNative(addr + 1408L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).readNative(addr + 1416L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).readNative(addr + 1424L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 1432L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 1440L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 1448L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 1456L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 1464L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 1468L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 1472L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 1476L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 1480L),
                    )
                override fun writeNative(addr: Long, value: Vmspace) {
                    (CAnonymousVmMap.typeLayout()).writeNative(addr, value.vmMap)
                    (CAnonymousPmap.typeLayout()).writeNative(addr + 288L, value.vmPmap)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 1376L, value.vmFlags)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 1384L, value.vmShm)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).writeNative(addr + 1392L, value.vmRssize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).writeNative(addr + 1400L, value.vmSwrss)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).writeNative(addr + 1408L, value.vmTsize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).writeNative(addr + 1416L, value.vmDsize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).writeNative(addr + 1424L, value.vmSsize)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 1432L, value.vmTaddr)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 1440L, value.vmDaddr)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 1448L, value.vmMaxsaddr)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 1456L, value.vmMinsaddr)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 1464L, value.unused1)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 1468L, value.unused2)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 1472L, value.vmPagesupply)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 1476L, value.vmHoldcnt)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 1480L, value.vmRefcnt)
                }
            }

        public operator fun invoke(
            vmMap: CAnonymousVmMap = CAnonymousVmMap(),
            vmPmap: CAnonymousPmap = CAnonymousPmap(),
            vmFlags: CInt = 0,
            vmShm: MutPtr = MutPtr(0L),
            vmRssize: SegszT = 0,
            vmSwrss: SegszT = 0,
            vmTsize: SegszT = 0,
            vmDsize: SegszT = 0,
            vmSsize: SegszT = 0,
            vmTaddr: MutPtr = MutPtr(0L),
            vmDaddr: MutPtr = MutPtr(0L),
            vmMaxsaddr: MutPtr = MutPtr(0L),
            vmMinsaddr: MutPtr = MutPtr(0L),
            unused1: CInt = 0,
            unused2: CInt = 0,
            vmPagesupply: CInt = 0,
            vmHoldcnt: CUint = 0u,
            vmRefcnt: CUint = 0u,
        ): Vmspace =
            Vmspace(
                vmMap = vmMap,
                vmPmap = vmPmap,
                vmFlags = vmFlags,
                vmShmCtorArg = vmShm,
                vmRssize = vmRssize,
                vmSwrss = vmSwrss,
                vmTsize = vmTsize,
                vmDsize = vmDsize,
                vmSsize = vmSsize,
                vmTaddrCtorArg = vmTaddr,
                vmDaddrCtorArg = vmDaddr,
                vmMaxsaddrCtorArg = vmMaxsaddr,
                vmMinsaddrCtorArg = vmMinsaddr,
                unused1 = unused1,
                unused2 = unused2,
                vmPagesupply = vmPagesupply,
                vmHoldcnt = vmHoldcnt,
                vmRefcnt = vmRefcnt,
            )
    }
}

public data class CpuctlMsrArgsT(
    public var msr: CInt = 0,
    public var data: ULong = 0uL,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<CpuctlMsrArgsT> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<CpuctlMsrArgsT> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): CpuctlMsrArgsT =
                    CpuctlMsrArgsT(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: CpuctlMsrArgsT) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.msr)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 8L, value.data)
                }
            }
    }
}

public data class CpuctlCpuidArgsT(
    public var level: CInt = 0,
    public var data: UIntArray = UIntArray(4),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CpuctlCpuidArgsT) return false
        if (this.level != other.level) return false
        if (!this.data.contentEquals(other.data)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.level.hashCode()
        result = 31 * result + this.data.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<CpuctlCpuidArgsT> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<CpuctlCpuidArgsT> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 20L
                override fun readNative(addr: Long): CpuctlCpuidArgsT =
                    CpuctlCpuidArgsT(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32, (4).toInt())
                        ).readNative(addr + 4L).toUIntArray(),
                    )
                override fun writeNative(addr: Long, value: CpuctlCpuidArgsT) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.level)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32, (4).toInt())
                    ).writeNative(addr + 4L, value.data.toList())
                }
            }
    }
}

public data class CpuctlCpuidCountArgsT(
    public var level: CInt = 0,
    public var levelType: CInt = 0,
    public var data: UIntArray = UIntArray(4),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CpuctlCpuidCountArgsT) return false
        if (this.level != other.level) return false
        if (this.levelType != other.levelType) return false
        if (!this.data.contentEquals(other.data)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.level.hashCode()
        result = 31 * result + this.levelType.hashCode()
        result = 31 * result + this.data.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<CpuctlCpuidCountArgsT> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<CpuctlCpuidCountArgsT> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 24L
                override fun readNative(addr: Long): CpuctlCpuidCountArgsT =
                    CpuctlCpuidCountArgsT(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 4L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32, (4).toInt())
                        ).readNative(addr + 8L).toUIntArray(),
                    )
                override fun writeNative(addr: Long, value: CpuctlCpuidCountArgsT) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.level)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 4L, value.levelType)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32, (4).toInt())
                    ).writeNative(addr + 8L, value.data.toList())
                }
            }
    }
}

public class CpuctlUpdateArgsT internal constructor(
    dataCtorArg: MutPtr,
    public var size: SizeT,
) {
    public var data: MutPtr = dataCtorArg
        internal set

    public constructor() : this(
        dataCtorArg = MutPtr(0L),
        size = 0uL,
    )

    public operator fun component1(): MutPtr = this.data

    public operator fun component2(): SizeT = this.size

    public fun copy(data: MutPtr = this.data, size: SizeT = this.size): CpuctlUpdateArgsT = CpuctlUpdateArgsT(dataCtorArg = data, size = size)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CpuctlUpdateArgsT) return false
        if (this.data != other.data) return false
        if (this.size != other.size) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.data.hashCode()
        result = 31 * result + this.size.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<CpuctlUpdateArgsT> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<CpuctlUpdateArgsT> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): CpuctlUpdateArgsT =
                    CpuctlUpdateArgsT(
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: CpuctlUpdateArgsT) {
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr, value.data)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 8L, value.size)
                }
            }

        public operator fun invoke(
            data: MutPtr = MutPtr(0L),
            size: SizeT = 0uL,
        ): CpuctlUpdateArgsT =
            CpuctlUpdateArgsT(
                dataCtorArg = data,
                size = size,
            )
    }
}

public data class Utmpx(
    public var utName: UByteArray = UByteArray(32),
    public var utId: UByteArray = UByteArray(4),
    public var utLine: UByteArray = UByteArray(32),
    public var utHost: UByteArray = UByteArray(256),
    public var utUnused: UByteArray = UByteArray(16),
    public var utSession: UShort = 0u,
    public var utType: UShort = 0u,
    public var utPid: PidT = 0,
    public var utExit: ExitStatus = ExitStatus(),
    public var utSs: SockaddrStorage = SockaddrStorage(),
    public var utTv: Timeval = Timeval(),
    public var utUnused2: UByteArray = UByteArray(16),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Utmpx) return false
        if (!this.utName.contentEquals(other.utName)) return false
        if (!this.utId.contentEquals(other.utId)) return false
        if (!this.utLine.contentEquals(other.utLine)) return false
        if (!this.utHost.contentEquals(other.utHost)) return false
        if (!this.utUnused.contentEquals(other.utUnused)) return false
        if (this.utSession != other.utSession) return false
        if (this.utType != other.utType) return false
        if (this.utPid != other.utPid) return false
        if (this.utExit != other.utExit) return false
        if (this.utSs != other.utSs) return false
        if (this.utTv != other.utTv) return false
        if (!this.utUnused2.contentEquals(other.utUnused2)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.utName.contentHashCode()
        result = 31 * result + this.utId.contentHashCode()
        result = 31 * result + this.utLine.contentHashCode()
        result = 31 * result + this.utHost.contentHashCode()
        result = 31 * result + this.utUnused.contentHashCode()
        result = 31 * result + this.utSession.hashCode()
        result = 31 * result + this.utType.hashCode()
        result = 31 * result + this.utPid.hashCode()
        result = 31 * result + this.utExit.hashCode()
        result = 31 * result + this.utSs.hashCode()
        result = 31 * result + this.utTv.hashCode()
        result = 31 * result + this.utUnused2.contentHashCode()
        return result
    }
}

public data class Lastlogx(
    public var llTv: Timeval = Timeval(),
    public var llLine: UByteArray = UByteArray(UTX_LINESIZE),
    public var llHost: UByteArray = UByteArray(UTX_HOSTSIZE),
    public var llSs: SockaddrStorage = SockaddrStorage(),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Lastlogx) return false
        if (this.llTv != other.llTv) return false
        if (!this.llLine.contentEquals(other.llLine)) return false
        if (!this.llHost.contentEquals(other.llHost)) return false
        if (this.llSs != other.llSs) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.llTv.hashCode()
        result = 31 * result + this.llLine.contentHashCode()
        result = 31 * result + this.llHost.contentHashCode()
        result = 31 * result + this.llSs.hashCode()
        return result
    }
}

public data class Dirent(
    public var dFileno: InoT = 0uL,
    public var dNamlen: UShort = 0u,
    public var dType: UByte = 0u,
    public var unused1: UByte = 0u,
    public var unused2: UInt = 0u,
    public var dName: UByteArray = UByteArray(256),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Dirent) return false
        if (this.dFileno != other.dFileno) return false
        if (this.dNamlen != other.dNamlen) return false
        if (this.dType != other.dType) return false
        if (this.unused1 != other.unused1) return false
        if (this.unused2 != other.unused2) return false
        if (!this.dName.contentEquals(other.dName)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dFileno.hashCode()
        result = 31 * result + this.dNamlen.hashCode()
        result = 31 * result + this.dType.hashCode()
        result = 31 * result + this.unused1.hashCode()
        result = 31 * result + this.unused2.hashCode()
        result = 31 * result + this.dName.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Dirent> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Dirent> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 272L
                override fun readNative(addr: Long): Dirent =
                    Dirent(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 10L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 11L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (256).toInt())
                        ).readNative(addr + 16L).toUByteArray(),
                    )
                override fun writeNative(addr: Long, value: Dirent) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr, value.dFileno)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 8L, value.dNamlen)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 10L, value.dType)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 11L, value.unused1)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.unused2)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (256).toInt())
                    ).writeNative(addr + 16L, value.dName.toList())
                }
            }
    }
}

public class Statfs(
    public var spare2: CLong = 0L,
    public var fBsize: CLong = 0L,
    public var fIosize: CLong = 0L,
    public var fBlocks: CLong = 0L,
    public var fBfree: CLong = 0L,
    public var fBavail: CLong = 0L,
    public var fFiles: CLong = 0L,
    public var fFfree: CLong = 0L,
    public var fFsid: FsidT = FsidT(),
    public var fOwner: UidT = 0u,
    public var fType: CInt = 0,
    public var fFlags: CInt = 0,
    public var fSyncwrites: CLong = 0L,
    public var fAsyncwrites: CLong = 0L,
    public var fFstypename: UByteArray = UByteArray(16),
    public var fMntonname: UByteArray = UByteArray(80),
    public var fSyncreads: CLong = 0L,
    public var fAsyncreads: CLong = 0L,
    public var spares1: CShort = 0,
    public var fMntfromname: UByteArray = UByteArray(80),
    public var spares2: CShort = 0,
    public var spare: LongArray = LongArray(2),
)

public class Sigevent internal constructor(
    public var sigevNotify: CInt,
    // The union is 8-byte in size, so it is aligned at a 8-byte offset.
    public var unused1: CInt,
    public var sigevSigno: CInt,
    // actually a union
    // pad the union
    public var unused2: CInt,
    public var sigevValue: Sigval,
    unused3CtorArg: MutPtr,
) {
    public var unused3: MutPtr = unused3CtorArg
        internal set

    public constructor() : this(
        sigevNotify = 0,
        unused1 = 0,
        sigevSigno = 0,
        unused2 = 0,
        sigevValue = Sigval(),
        unused3CtorArg = MutPtr(0L),
    )

    public operator fun component1(): CInt = this.sigevNotify

    public operator fun component2(): CInt = this.unused1

    public operator fun component3(): CInt = this.sigevSigno

    public operator fun component4(): CInt = this.unused2

    public operator fun component5(): Sigval = this.sigevValue

    public operator fun component6(): MutPtr = this.unused3

    public fun copy(sigevNotify: CInt = this.sigevNotify, unused1: CInt = this.unused1, sigevSigno: CInt = this.sigevSigno, unused2: CInt = this.unused2, sigevValue: Sigval = this.sigevValue, unused3: MutPtr = this.unused3): Sigevent = Sigevent(sigevNotify = sigevNotify, unused1 = unused1, sigevSigno = sigevSigno, unused2 = unused2, sigevValue = sigevValue, unused3CtorArg = unused3)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Sigevent) return false
        if (this.sigevNotify != other.sigevNotify) return false
        if (this.unused1 != other.unused1) return false
        if (this.sigevSigno != other.sigevSigno) return false
        if (this.unused2 != other.unused2) return false
        if (this.sigevValue != other.sigevValue) return false
        if (this.unused3 != other.unused3) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.sigevNotify.hashCode()
        result = 31 * result + this.unused1.hashCode()
        result = 31 * result + this.sigevSigno.hashCode()
        result = 31 * result + this.unused2.hashCode()
        result = 31 * result + this.sigevValue.hashCode()
        result = 31 * result + this.unused3.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            sigevNotify: CInt = 0,
            unused1: CInt = 0,
            sigevSigno: CInt = 0,
            unused2: CInt = 0,
            sigevValue: Sigval = Sigval(),
            unused3: MutPtr = MutPtr(0L),
        ): Sigevent =
            Sigevent(
                sigevNotify = sigevNotify,
                unused1 = unused1,
                sigevSigno = sigevSigno,
                unused2 = unused2,
                sigevValue = sigevValue,
                unused3CtorArg = unused3,
            )
    }
}

public class McontextT(
    public var mcOnstack: RegisterT = 0L,
    public var mcRdi: RegisterT = 0L,
    public var mcRsi: RegisterT = 0L,
    public var mcRdx: RegisterT = 0L,
    public var mcRcx: RegisterT = 0L,
    public var mcR8: RegisterT = 0L,
    public var mcR9: RegisterT = 0L,
    public var mcRax: RegisterT = 0L,
    public var mcRbx: RegisterT = 0L,
    public var mcRbp: RegisterT = 0L,
    public var mcR10: RegisterT = 0L,
    public var mcR11: RegisterT = 0L,
    public var mcR12: RegisterT = 0L,
    public var mcR13: RegisterT = 0L,
    public var mcR14: RegisterT = 0L,
    public var mcR15: RegisterT = 0L,
    public var mcXflags: RegisterT = 0L,
    public var mcTrapno: RegisterT = 0L,
    public var mcAddr: RegisterT = 0L,
    public var mcFlags: RegisterT = 0L,
    public var mcErr: RegisterT = 0L,
    public var mcRip: RegisterT = 0L,
    public var mcCs: RegisterT = 0L,
    public var mcRflags: RegisterT = 0L,
    public var mcRsp: RegisterT = 0L,
    public var mcSs: RegisterT = 0L,
    public var mcLen: CUint = 0u,
    public var mcFpformat: CUint = 0u,
    public var mcOwnedfp: CUint = 0u,
    public var reserved: CUint = 0u,
    public var unused: UIntArray = UIntArray(8),
    public var mcFpregs: UIntArray = UIntArray(256),
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<McontextT> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<McontextT> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 1280L
                override fun readNative(addr: Long): McontextT =
                    McontextT(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 32L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 40L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 48L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 56L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 64L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 72L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 80L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 88L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 96L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 104L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 112L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 120L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 128L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 136L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 144L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 152L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 160L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 168L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 176L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 184L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 192L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 200L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 208L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 212L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 216L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 220L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32, (8).toInt())
                        ).readNative(addr + 224L).toUIntArray(),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32, (256).toInt())
                        ).readNative(addr + 256L).toUIntArray(),
                    )
                override fun writeNative(addr: Long, value: McontextT) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr, value.mcOnstack)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 8L, value.mcRdi)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 16L, value.mcRsi)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 24L, value.mcRdx)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 32L, value.mcRcx)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 40L, value.mcR8)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 48L, value.mcR9)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 56L, value.mcRax)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 64L, value.mcRbx)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 72L, value.mcRbp)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 80L, value.mcR10)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 88L, value.mcR11)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 96L, value.mcR12)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 104L, value.mcR13)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 112L, value.mcR14)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 120L, value.mcR15)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 128L, value.mcXflags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 136L, value.mcTrapno)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 144L, value.mcAddr)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 152L, value.mcFlags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 160L, value.mcErr)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 168L, value.mcRip)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 176L, value.mcCs)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 184L, value.mcRflags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 192L, value.mcRsp)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 200L, value.mcSs)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 208L, value.mcLen)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 212L, value.mcFpformat)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 216L, value.mcOwnedfp)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 220L, value.reserved)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32, (8).toInt())
                    ).writeNative(addr + 224L, value.unused.toList())
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32, (256).toInt())
                    ).writeNative(addr + 256L, value.mcFpregs.toList())
                }
            }
    }
}

public class UcontextT internal constructor(
    public var ucSigmask: SigsetT,
    ucMcontextCtorArg: McontextT,
    ucLinkCtorArg: MutPtr,
    public var ucStack: StackT,
    public var ucCofunc: UcontextTUcCofuncCallback?,
    ucArgCtorArg: MutPtr,
    public var pad: IntArray,
) {
    public var ucMcontext: McontextT = ucMcontextCtorArg
        internal set

    public var ucLink: MutPtr = ucLinkCtorArg
        internal set

    public var ucArg: MutPtr = ucArgCtorArg
        internal set

    public constructor() : this(
        ucSigmask = SigsetT(),
        ucMcontextCtorArg = McontextT(),
        ucLinkCtorArg = MutPtr(0L),
        ucStack = StackT(),
        ucCofunc = null,
        ucArgCtorArg = MutPtr(0L),
        pad = IntArray(4),
    )

    public operator fun component1(): SigsetT = this.ucSigmask

    public operator fun component2(): McontextT = this.ucMcontext

    public operator fun component3(): MutPtr = this.ucLink

    public operator fun component4(): StackT = this.ucStack

    public operator fun component5(): UcontextTUcCofuncCallback? = this.ucCofunc

    public operator fun component6(): MutPtr = this.ucArg

    public operator fun component7(): IntArray = this.pad

    public fun copy(ucSigmask: SigsetT = this.ucSigmask, ucMcontext: McontextT = this.ucMcontext, ucLink: MutPtr = this.ucLink, ucStack: StackT = this.ucStack, ucCofunc: UcontextTUcCofuncCallback? = this.ucCofunc, ucArg: MutPtr = this.ucArg, pad: IntArray = this.pad): UcontextT = UcontextT(ucSigmask = ucSigmask, ucMcontextCtorArg = ucMcontext, ucLinkCtorArg = ucLink, ucStack = ucStack, ucCofunc = ucCofunc, ucArgCtorArg = ucArg, pad = pad)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is UcontextT) return false
        if (this.ucSigmask != other.ucSigmask) return false
        if (this.ucMcontext != other.ucMcontext) return false
        if (this.ucLink != other.ucLink) return false
        if (this.ucStack != other.ucStack) return false
        if (this.ucCofunc != other.ucCofunc) return false
        if (this.ucArg != other.ucArg) return false
        if (!this.pad.contentEquals(other.pad)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.ucSigmask.hashCode()
        result = 31 * result + this.ucMcontext.hashCode()
        result = 31 * result + this.ucLink.hashCode()
        result = 31 * result + this.ucStack.hashCode()
        result = 31 * result + this.ucCofunc.hashCode()
        result = 31 * result + this.ucArg.hashCode()
        result = 31 * result + this.pad.contentHashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            ucSigmask: SigsetT = SigsetT(),
            ucMcontext: McontextT = McontextT(),
            ucLink: MutPtr = MutPtr(0L),
            ucStack: StackT = StackT(),
            ucCofunc: UcontextTUcCofuncCallback? = null,
            ucArg: MutPtr = MutPtr(0L),
            pad: IntArray = IntArray(4),
        ): UcontextT =
            UcontextT(
                ucSigmask = ucSigmask,
                ucMcontextCtorArg = ucMcontext,
                ucLinkCtorArg = ucLink,
                ucStack = ucStack,
                ucCofunc = ucCofunc,
                ucArgCtorArg = ucArg,
                pad = pad,
            )
    }
}
