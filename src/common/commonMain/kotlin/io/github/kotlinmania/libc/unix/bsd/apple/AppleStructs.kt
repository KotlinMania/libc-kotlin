@file:OptIn(ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.unix.bsd.apple

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CChar
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CLong
import io.github.kotlinmania.libc.CShort
import io.github.kotlinmania.libc.CUchar
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.CUlong
import io.github.kotlinmania.libc.CUshort
import io.github.kotlinmania.libc.new.apple.libpthread.sys.pthread.pthreadtypes.PthreadAttrT
import io.github.kotlinmania.libc.unix.GidT
import io.github.kotlinmania.libc.unix.IFNAMSIZ
import io.github.kotlinmania.libc.unix.In6Addr
import io.github.kotlinmania.libc.unix.InAddrT
import io.github.kotlinmania.libc.unix.InPortT
import io.github.kotlinmania.libc.unix.IntptrT
import io.github.kotlinmania.libc.unix.Iovec
import io.github.kotlinmania.libc.unix.PidT
import io.github.kotlinmania.libc.unix.SighandlerT
import io.github.kotlinmania.libc.unix.Sigval
import io.github.kotlinmania.libc.unix.SizeT
import io.github.kotlinmania.libc.unix.Timespec
import io.github.kotlinmania.libc.unix.Timeval
import io.github.kotlinmania.libc.unix.UidT
import io.github.kotlinmania.libc.unix.UintptrT
import io.github.kotlinmania.libc.unix.bsd.BlkcntT
import io.github.kotlinmania.libc.unix.bsd.FsidT
import io.github.kotlinmania.libc.unix.bsd.NCCS
import io.github.kotlinmania.libc.unix.bsd.OffT
import io.github.kotlinmania.libc.unix.bsd.SaFamilyT
import io.github.kotlinmania.libc.unix.bsd.Sockaddr
import io.github.kotlinmania.libc.unix.bsd.SockaddrIn6
import io.github.kotlinmania.libc.unix.bsd.SocklenT
import io.github.kotlinmania.libc.unix.bsd.apple.b64.IfData
import io.github.kotlinmania.libc.unix.bsd.apple.b64.Timeval32
import io.github.kotlinmania.libc.unix.bsd.apple.b64.aarch64.BooleanT
import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.mem.ObjectSlotLayout
import io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
import io.github.kotlinmania.rustlang.core.mem.TypeLayout
import io.github.kotlinmania.rustlang.core.mem.constPtrFromRustCast
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr

public class DebugStruct(
    private val out: StringBuilder,
    private val name: String,
) {
    private val fields: MutableList<String> = mutableListOf()

    public fun field(name: String, value: Any?): DebugStruct =
        apply {
            fields.add("$name: $value")
        }

    public fun finish() {
        if (fields.isEmpty()) {
            out.append(name)
        } else {
            out.append("$name { ${fields.joinToString(", ")} }")
        }
    }

    public fun finishNonExhaustive() {
        fields.add("..")
        finish()
    }
}

public data class IpMreq(
    public var imrMultiaddr: InAddr = InAddr(),
    public var imrInterface: InAddr = InAddr(),
)

public data class IpMreqn(
    public var imrMultiaddr: InAddr = InAddr(),
    public var imrAddress: InAddr = InAddr(),
    public var imrIfindex: CInt = 0,
)

public data class IpMreqSource(
    public var imrMultiaddr: InAddr = InAddr(),
    public var imrSourceaddr: InAddr = InAddr(),
    public var imrInterface: InAddr = InAddr(),
)

public class Aiocb internal constructor(
    public var aioFildes: CInt,
    public var aioOffset: OffT,
    aioBufCtorArg: MutPtr<CVoid>,
    public var aioNbytes: SizeT,
    public var aioReqprio: CInt,
    public var aioSigevent: Sigevent,
    public var aioLioOpcode: CInt,
) {
    public var aioBuf: MutPtr<CVoid> = aioBufCtorArg
        internal set

    public constructor() : this(
        aioFildes = 0,
        aioOffset = 0L,
        aioBufCtorArg = MutPtr(0L),
        aioNbytes = 0uL,
        aioReqprio = 0,
        aioSigevent = Sigevent(),
        aioLioOpcode = 0,
    )

    public operator fun component1(): CInt = this.aioFildes

    public operator fun component2(): OffT = this.aioOffset

    public operator fun component3(): MutPtr<CVoid> = this.aioBuf

    public operator fun component4(): SizeT = this.aioNbytes

    public operator fun component5(): CInt = this.aioReqprio

    public operator fun component6(): Sigevent = this.aioSigevent

    public operator fun component7(): CInt = this.aioLioOpcode

    public fun copy(aioFildes: CInt = this.aioFildes, aioOffset: OffT = this.aioOffset, aioBuf: MutPtr<CVoid> = this.aioBuf, aioNbytes: SizeT = this.aioNbytes, aioReqprio: CInt = this.aioReqprio, aioSigevent: Sigevent = this.aioSigevent, aioLioOpcode: CInt = this.aioLioOpcode): Aiocb = Aiocb(aioFildes = aioFildes, aioOffset = aioOffset, aioBufCtorArg = aioBuf, aioNbytes = aioNbytes, aioReqprio = aioReqprio, aioSigevent = aioSigevent, aioLioOpcode = aioLioOpcode)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Aiocb) return false
        if (this.aioFildes != other.aioFildes) return false
        if (this.aioOffset != other.aioOffset) return false
        if (this.aioBuf != other.aioBuf) return false
        if (this.aioNbytes != other.aioNbytes) return false
        if (this.aioReqprio != other.aioReqprio) return false
        if (this.aioSigevent != other.aioSigevent) return false
        if (this.aioLioOpcode != other.aioLioOpcode) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.aioFildes.hashCode()
        result = 31 * result + this.aioOffset.hashCode()
        result = 31 * result + this.aioBuf.hashCode()
        result = 31 * result + this.aioNbytes.hashCode()
        result = 31 * result + this.aioReqprio.hashCode()
        result = 31 * result + this.aioSigevent.hashCode()
        result = 31 * result + this.aioLioOpcode.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            aioFildes: CInt = 0,
            aioOffset: OffT = 0L,
            aioBuf: MutPtr<CVoid> = MutPtr(0L),
            aioNbytes: SizeT = 0uL,
            aioReqprio: CInt = 0,
            aioSigevent: Sigevent = Sigevent(),
            aioLioOpcode: CInt = 0,
        ): Aiocb =
            Aiocb(
                aioFildes = aioFildes,
                aioOffset = aioOffset,
                aioBufCtorArg = aioBuf,
                aioNbytes = aioNbytes,
                aioReqprio = aioReqprio,
                aioSigevent = aioSigevent,
                aioLioOpcode = aioLioOpcode,
            )
    }
}

public class GlobT internal constructor(
    public var glPathc: SizeT,
    public var unused1: CInt,
    public var glOffs: SizeT,
    public var unused2: CInt,
    glPathvCtorArg: MutPtr<MutPtr<CChar>>,
    unused3CtorArg: MutPtr<CVoid>,
    unused4CtorArg: MutPtr<CVoid>,
    unused5CtorArg: MutPtr<CVoid>,
    unused6CtorArg: MutPtr<CVoid>,
    unused7CtorArg: MutPtr<CVoid>,
    unused8CtorArg: MutPtr<CVoid>,
) {
    public var glPathv: MutPtr<MutPtr<CChar>> = glPathvCtorArg
        internal set

    public var unused3: MutPtr<CVoid> = unused3CtorArg
        internal set

    public var unused4: MutPtr<CVoid> = unused4CtorArg
        internal set

    public var unused5: MutPtr<CVoid> = unused5CtorArg
        internal set

    public var unused6: MutPtr<CVoid> = unused6CtorArg
        internal set

    public var unused7: MutPtr<CVoid> = unused7CtorArg
        internal set

    public var unused8: MutPtr<CVoid> = unused8CtorArg
        internal set

    public constructor() : this(
        glPathc = 0uL,
        unused1 = 0,
        glOffs = 0uL,
        unused2 = 0,
        glPathvCtorArg = MutPtr(0L),
        unused3CtorArg = MutPtr(0L),
        unused4CtorArg = MutPtr(0L),
        unused5CtorArg = MutPtr(0L),
        unused6CtorArg = MutPtr(0L),
        unused7CtorArg = MutPtr(0L),
        unused8CtorArg = MutPtr(0L),
    )

    public operator fun component1(): SizeT = this.glPathc

    public operator fun component2(): CInt = this.unused1

    public operator fun component3(): SizeT = this.glOffs

    public operator fun component4(): CInt = this.unused2

    public operator fun component5(): MutPtr<MutPtr<CChar>> = this.glPathv

    public operator fun component6(): MutPtr<CVoid> = this.unused3

    public operator fun component7(): MutPtr<CVoid> = this.unused4

    public operator fun component8(): MutPtr<CVoid> = this.unused5

    public operator fun component9(): MutPtr<CVoid> = this.unused6

    public operator fun component10(): MutPtr<CVoid> = this.unused7

    public operator fun component11(): MutPtr<CVoid> = this.unused8

    public fun copy(glPathc: SizeT = this.glPathc, unused1: CInt = this.unused1, glOffs: SizeT = this.glOffs, unused2: CInt = this.unused2, glPathv: MutPtr<MutPtr<CChar>> = this.glPathv, unused3: MutPtr<CVoid> = this.unused3, unused4: MutPtr<CVoid> = this.unused4, unused5: MutPtr<CVoid> = this.unused5, unused6: MutPtr<CVoid> = this.unused6, unused7: MutPtr<CVoid> = this.unused7, unused8: MutPtr<CVoid> = this.unused8): GlobT = GlobT(glPathc = glPathc, unused1 = unused1, glOffs = glOffs, unused2 = unused2, glPathvCtorArg = glPathv, unused3CtorArg = unused3, unused4CtorArg = unused4, unused5CtorArg = unused5, unused6CtorArg = unused6, unused7CtorArg = unused7, unused8CtorArg = unused8)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is GlobT) return false
        if (this.glPathc != other.glPathc) return false
        if (this.unused1 != other.unused1) return false
        if (this.glOffs != other.glOffs) return false
        if (this.unused2 != other.unused2) return false
        if (this.glPathv != other.glPathv) return false
        if (this.unused3 != other.unused3) return false
        if (this.unused4 != other.unused4) return false
        if (this.unused5 != other.unused5) return false
        if (this.unused6 != other.unused6) return false
        if (this.unused7 != other.unused7) return false
        if (this.unused8 != other.unused8) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.glPathc.hashCode()
        result = 31 * result + this.unused1.hashCode()
        result = 31 * result + this.glOffs.hashCode()
        result = 31 * result + this.unused2.hashCode()
        result = 31 * result + this.glPathv.hashCode()
        result = 31 * result + this.unused3.hashCode()
        result = 31 * result + this.unused4.hashCode()
        result = 31 * result + this.unused5.hashCode()
        result = 31 * result + this.unused6.hashCode()
        result = 31 * result + this.unused7.hashCode()
        result = 31 * result + this.unused8.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            glPathc: SizeT = 0uL,
            unused1: CInt = 0,
            glOffs: SizeT = 0uL,
            unused2: CInt = 0,
            glPathv: MutPtr<MutPtr<CChar>> = MutPtr(0L),
            unused3: MutPtr<CVoid> = MutPtr(0L),
            unused4: MutPtr<CVoid> = MutPtr(0L),
            unused5: MutPtr<CVoid> = MutPtr(0L),
            unused6: MutPtr<CVoid> = MutPtr(0L),
            unused7: MutPtr<CVoid> = MutPtr(0L),
            unused8: MutPtr<CVoid> = MutPtr(0L),
        ): GlobT =
            GlobT(
                glPathc = glPathc,
                unused1 = unused1,
                glOffs = glOffs,
                unused2 = unused2,
                glPathvCtorArg = glPathv,
                unused3CtorArg = unused3,
                unused4CtorArg = unused4,
                unused5CtorArg = unused5,
                unused6CtorArg = unused6,
                unused7CtorArg = unused7,
                unused8CtorArg = unused8,
            )
    }
}

public class Tm internal constructor(
    public var tmSec: CInt,
    public var tmMin: CInt,
    public var tmHour: CInt,
    public var tmMday: CInt,
    public var tmMon: CInt,
    public var tmYear: CInt,
    public var tmWday: CInt,
    public var tmYday: CInt,
    public var tmIsdst: CInt,
    public var tmGmtoff: CLong,
    tmZoneCtorArg: MutPtr<CChar>,
) {
    public var tmZone: MutPtr<CChar> = tmZoneCtorArg
        internal set

    public constructor() : this(
        tmSec = 0,
        tmMin = 0,
        tmHour = 0,
        tmMday = 0,
        tmMon = 0,
        tmYear = 0,
        tmWday = 0,
        tmYday = 0,
        tmIsdst = 0,
        tmGmtoff = 0L,
        tmZoneCtorArg = MutPtr(0L),
    )

    public operator fun component1(): CInt = this.tmSec

    public operator fun component2(): CInt = this.tmMin

    public operator fun component3(): CInt = this.tmHour

    public operator fun component4(): CInt = this.tmMday

    public operator fun component5(): CInt = this.tmMon

    public operator fun component6(): CInt = this.tmYear

    public operator fun component7(): CInt = this.tmWday

    public operator fun component8(): CInt = this.tmYday

    public operator fun component9(): CInt = this.tmIsdst

    public operator fun component10(): CLong = this.tmGmtoff

    public operator fun component11(): MutPtr<CChar> = this.tmZone

    public fun copy(tmSec: CInt = this.tmSec, tmMin: CInt = this.tmMin, tmHour: CInt = this.tmHour, tmMday: CInt = this.tmMday, tmMon: CInt = this.tmMon, tmYear: CInt = this.tmYear, tmWday: CInt = this.tmWday, tmYday: CInt = this.tmYday, tmIsdst: CInt = this.tmIsdst, tmGmtoff: CLong = this.tmGmtoff, tmZone: MutPtr<CChar> = this.tmZone): Tm = Tm(tmSec = tmSec, tmMin = tmMin, tmHour = tmHour, tmMday = tmMday, tmMon = tmMon, tmYear = tmYear, tmWday = tmWday, tmYday = tmYday, tmIsdst = tmIsdst, tmGmtoff = tmGmtoff, tmZoneCtorArg = tmZone)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Tm) return false
        if (this.tmSec != other.tmSec) return false
        if (this.tmMin != other.tmMin) return false
        if (this.tmHour != other.tmHour) return false
        if (this.tmMday != other.tmMday) return false
        if (this.tmMon != other.tmMon) return false
        if (this.tmYear != other.tmYear) return false
        if (this.tmWday != other.tmWday) return false
        if (this.tmYday != other.tmYday) return false
        if (this.tmIsdst != other.tmIsdst) return false
        if (this.tmGmtoff != other.tmGmtoff) return false
        if (this.tmZone != other.tmZone) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.tmSec.hashCode()
        result = 31 * result + this.tmMin.hashCode()
        result = 31 * result + this.tmHour.hashCode()
        result = 31 * result + this.tmMday.hashCode()
        result = 31 * result + this.tmMon.hashCode()
        result = 31 * result + this.tmYear.hashCode()
        result = 31 * result + this.tmWday.hashCode()
        result = 31 * result + this.tmYday.hashCode()
        result = 31 * result + this.tmIsdst.hashCode()
        result = 31 * result + this.tmGmtoff.hashCode()
        result = 31 * result + this.tmZone.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            tmSec: CInt = 0,
            tmMin: CInt = 0,
            tmHour: CInt = 0,
            tmMday: CInt = 0,
            tmMon: CInt = 0,
            tmYear: CInt = 0,
            tmWday: CInt = 0,
            tmYday: CInt = 0,
            tmIsdst: CInt = 0,
            tmGmtoff: CLong = 0L,
            tmZone: MutPtr<CChar> = MutPtr(0L),
        ): Tm =
            Tm(
                tmSec = tmSec,
                tmMin = tmMin,
                tmHour = tmHour,
                tmMday = tmMday,
                tmMon = tmMon,
                tmYear = tmYear,
                tmWday = tmWday,
                tmYday = tmYday,
                tmIsdst = tmIsdst,
                tmGmtoff = tmGmtoff,
                tmZoneCtorArg = tmZone,
            )
    }
}

public class Addrinfo internal constructor(
    public var aiFlags: CInt,
    public var aiFamily: CInt,
    public var aiSocktype: CInt,
    public var aiProtocol: CInt,
    public var aiAddrlen: SocklenT,
    aiCanonnameCtorArg: MutPtr<CChar>,
    aiAddrCtorArg: MutPtr<Sockaddr>,
    aiNextCtorArg: MutPtr<Addrinfo>,
) {
    public var aiCanonname: MutPtr<CChar> = aiCanonnameCtorArg
        internal set

    public var aiAddr: MutPtr<Sockaddr> = aiAddrCtorArg
        internal set

    public var aiNext: MutPtr<Addrinfo> = aiNextCtorArg
        internal set

    public constructor() : this(
        aiFlags = 0,
        aiFamily = 0,
        aiSocktype = 0,
        aiProtocol = 0,
        aiAddrlen = 0u,
        aiCanonnameCtorArg = MutPtr(0L),
        aiAddrCtorArg = MutPtr(0L),
        aiNextCtorArg = MutPtr(0L),
    )

    public operator fun component1(): CInt = this.aiFlags

    public operator fun component2(): CInt = this.aiFamily

    public operator fun component3(): CInt = this.aiSocktype

    public operator fun component4(): CInt = this.aiProtocol

    public operator fun component5(): SocklenT = this.aiAddrlen

    public operator fun component6(): MutPtr<CChar> = this.aiCanonname

    public operator fun component7(): MutPtr<Sockaddr> = this.aiAddr

    public operator fun component8(): MutPtr<Addrinfo> = this.aiNext

    public fun copy(aiFlags: CInt = this.aiFlags, aiFamily: CInt = this.aiFamily, aiSocktype: CInt = this.aiSocktype, aiProtocol: CInt = this.aiProtocol, aiAddrlen: SocklenT = this.aiAddrlen, aiCanonname: MutPtr<CChar> = this.aiCanonname, aiAddr: MutPtr<Sockaddr> = this.aiAddr, aiNext: MutPtr<Addrinfo> = this.aiNext): Addrinfo = Addrinfo(aiFlags = aiFlags, aiFamily = aiFamily, aiSocktype = aiSocktype, aiProtocol = aiProtocol, aiAddrlen = aiAddrlen, aiCanonnameCtorArg = aiCanonname, aiAddrCtorArg = aiAddr, aiNextCtorArg = aiNext)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Addrinfo) return false
        if (this.aiFlags != other.aiFlags) return false
        if (this.aiFamily != other.aiFamily) return false
        if (this.aiSocktype != other.aiSocktype) return false
        if (this.aiProtocol != other.aiProtocol) return false
        if (this.aiAddrlen != other.aiAddrlen) return false
        if (this.aiCanonname != other.aiCanonname) return false
        if (this.aiAddr != other.aiAddr) return false
        if (this.aiNext != other.aiNext) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.aiFlags.hashCode()
        result = 31 * result + this.aiFamily.hashCode()
        result = 31 * result + this.aiSocktype.hashCode()
        result = 31 * result + this.aiProtocol.hashCode()
        result = 31 * result + this.aiAddrlen.hashCode()
        result = 31 * result + this.aiCanonname.hashCode()
        result = 31 * result + this.aiAddr.hashCode()
        result = 31 * result + this.aiNext.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            aiFlags: CInt = 0,
            aiFamily: CInt = 0,
            aiSocktype: CInt = 0,
            aiProtocol: CInt = 0,
            aiAddrlen: SocklenT = 0u,
            aiCanonname: MutPtr<CChar> = MutPtr(0L),
            aiAddr: MutPtr<Sockaddr> = MutPtr(0L),
            aiNext: MutPtr<Addrinfo> = MutPtr(0L),
        ): Addrinfo =
            Addrinfo(
                aiFlags = aiFlags,
                aiFamily = aiFamily,
                aiSocktype = aiSocktype,
                aiProtocol = aiProtocol,
                aiAddrlen = aiAddrlen,
                aiCanonnameCtorArg = aiCanonname,
                aiAddrCtorArg = aiAddr,
                aiNextCtorArg = aiNext,
            )
    }
}

public data class MachTimebaseInfo(
    public var numer: UInt = 0u,
    public var denom: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<MachTimebaseInfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<MachTimebaseInfo> {
                override val sizeBytes: Long = 8L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): MachTimebaseInfo =
                    MachTimebaseInfo(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: MachTimebaseInfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.numer)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.denom)
                }
            }
    }
}

public class Stat(
    public var stDev: DevT = 0,
    public var stMode: ModeT = 0u,
    public var stNlink: NlinkT = 0u,
    public var stIno: InoT = 0uL,
    public var stUid: UidT = 0u,
    public var stGid: GidT = 0u,
    public var stRdev: DevT = 0,
    public var stAtime: TimeT = 0L,
    public var stAtimeNsec: CLong = 0L,
    public var stMtime: TimeT = 0L,
    public var stMtimeNsec: CLong = 0L,
    public var stCtime: TimeT = 0L,
    public var stCtimeNsec: CLong = 0L,
    public var stBirthtime: TimeT = 0L,
    public var stBirthtimeNsec: CLong = 0L,
    public var stSize: OffT = 0L,
    public var stBlocks: BlkcntT = 0L,
    public var stBlksize: BlksizeT = 0,
    public var stFlags: UInt = 0u,
    public var stGen: UInt = 0u,
    public var stLspare: Int = 0,
    public var stQspare: LongArray = LongArray(2),
)

public class SiginfoT internal constructor(
    public var siSigno: CInt,
    public var siErrno: CInt,
    public var siCode: CInt,
    public var siPid: PidT,
    public var siUid: UidT,
    public var siStatus: CInt,
    siAddrCtorArg: MutPtr<CVoid>,
    // Requires it to be union for tests
    // pub siValue: sigval,
    public var pad: IntArray,
) {
    public var siAddr: MutPtr<CVoid> = siAddrCtorArg
        internal set

    public constructor() : this(
        siSigno = 0,
        siErrno = 0,
        siCode = 0,
        siPid = 0,
        siUid = 0u,
        siStatus = 0,
        siAddrCtorArg = MutPtr(0L),
        pad = IntArray(9),
    )

    public operator fun component1(): CInt = this.siSigno

    public operator fun component2(): CInt = this.siErrno

    public operator fun component3(): CInt = this.siCode

    public operator fun component4(): PidT = this.siPid

    public operator fun component5(): UidT = this.siUid

    public operator fun component6(): CInt = this.siStatus

    public operator fun component7(): MutPtr<CVoid> = this.siAddr

    public operator fun component8(): IntArray = this.pad

    public fun copy(siSigno: CInt = this.siSigno, siErrno: CInt = this.siErrno, siCode: CInt = this.siCode, siPid: PidT = this.siPid, siUid: UidT = this.siUid, siStatus: CInt = this.siStatus, siAddr: MutPtr<CVoid> = this.siAddr, pad: IntArray = this.pad): SiginfoT = SiginfoT(siSigno = siSigno, siErrno = siErrno, siCode = siCode, siPid = siPid, siUid = siUid, siStatus = siStatus, siAddrCtorArg = siAddr, pad = pad)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SiginfoT) return false
        if (this.siSigno != other.siSigno) return false
        if (this.siErrno != other.siErrno) return false
        if (this.siCode != other.siCode) return false
        if (this.siPid != other.siPid) return false
        if (this.siUid != other.siUid) return false
        if (this.siStatus != other.siStatus) return false
        if (this.siAddr != other.siAddr) return false
        if (!this.pad.contentEquals(other.pad)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.siSigno.hashCode()
        result = 31 * result + this.siErrno.hashCode()
        result = 31 * result + this.siCode.hashCode()
        result = 31 * result + this.siPid.hashCode()
        result = 31 * result + this.siUid.hashCode()
        result = 31 * result + this.siStatus.hashCode()
        result = 31 * result + this.siAddr.hashCode()
        result = 31 * result + this.pad.contentHashCode()
        return result
    }

    public fun siValue(): Sigval {
        data class SiginfoTimer(
            public var siSigno: CInt = 0,
            public var siErrno: CInt = 0,
            public var siCode: CInt = 0,
            public var siPid: PidT = 0,
            public var siUid: UidT = 0u,
            public var siStatus: CInt = 0,
            public var siAddr: MutPtr<CVoid> = MutPtr(0L),
            public var siValue: Sigval = Sigval(),
        )
        return (ObjectSlotLayout<SiginfoTimer>()).readNative((ConstPtr<SiginfoTimer>(((constPtrFromRustCast<SiginfoT>(this))).rawAddress)).rawAddress).siValue
    }

    public companion object {
        public operator fun invoke(
            siSigno: CInt = 0,
            siErrno: CInt = 0,
            siCode: CInt = 0,
            siPid: PidT = 0,
            siUid: UidT = 0u,
            siStatus: CInt = 0,
            siAddr: MutPtr<CVoid> = MutPtr(0L),
            pad: IntArray = IntArray(9),
        ): SiginfoT =
            SiginfoT(
                siSigno = siSigno,
                siErrno = siErrno,
                siCode = siCode,
                siPid = siPid,
                siUid = siUid,
                siStatus = siStatus,
                siAddrCtorArg = siAddr,
                pad = pad,
            )
    }
}

public data class Sigaction(
    // Note(union): this field is actually a union
    public var saSigaction: SighandlerT = 0uL,
    public var saMask: SigsetT = 0u,
    public var saFlags: CInt = 0,
)

public class StackT internal constructor(
    ssSpCtorArg: MutPtr<CVoid>,
    public var ssSize: SizeT,
    public var ssFlags: CInt,
) {
    public var ssSp: MutPtr<CVoid> = ssSpCtorArg
        internal set

    public constructor() : this(
        ssSpCtorArg = MutPtr(0L),
        ssSize = 0uL,
        ssFlags = 0,
    )

    public operator fun component1(): MutPtr<CVoid> = this.ssSp

    public operator fun component2(): SizeT = this.ssSize

    public operator fun component3(): CInt = this.ssFlags

    public fun copy(ssSp: MutPtr<CVoid> = this.ssSp, ssSize: SizeT = this.ssSize, ssFlags: CInt = this.ssFlags): StackT = StackT(ssSpCtorArg = ssSp, ssSize = ssSize, ssFlags = ssFlags)

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
                override val sizeBytes: Long = 24L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): StackT =
                    StackT(
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CVoid>(64)
                        ).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: StackT) {
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr, value.ssSp)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).writeNative(addr + 8L, value.ssSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 16L, value.ssFlags)
                }
            }

        public operator fun invoke(
            ssSp: MutPtr<CVoid> = MutPtr(0L),
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

public data class FstoreT(
    public var fstFlags: CUint = 0u,
    public var fstPosmode: CInt = 0,
    public var fstOffset: OffT = 0L,
    public var fstLength: OffT = 0L,
    public var fstBytesalloc: OffT = 0L,
)

public data class FpunchholeT(
    public var fpFlags: CUint = 0u,
    // unused
    public var reserved: CUint = 0u,
    // (to maintain 8-byte alignment)
    public var fpOffset: OffT = 0L,
    // IN: start of the region
    public var fpLength: OffT = 0L,
)

public data class FtrimactivefileT(
    public var ftaOffset: OffT = 0L,
    public var ftaLength: OffT = 0L,
)

public data class FspecreadT(
    public var fsrFlags: CUint = 0u,
    public var reserved: CUint = 0u,
    public var fsrOffset: OffT = 0L,
    public var fsrLength: OffT = 0L,
)

public data class Radvisory(
    public var raOffset: OffT = 0L,
    public var raCount: CInt = 0,
)

public data class Statvfs(
    public var fBsize: CUlong = 0uL,
    public var fFrsize: CUlong = 0uL,
    public var fBlocks: FsblkcntT = 0u,
    public var fBfree: FsblkcntT = 0u,
    public var fBavail: FsblkcntT = 0u,
    public var fFiles: FsfilcntT = 0u,
    public var fFfree: FsfilcntT = 0u,
    public var fFavail: FsfilcntT = 0u,
    public var fFsid: CUlong = 0uL,
    public var fFlag: CUlong = 0uL,
    public var fNamemax: CUlong = 0uL,
)

public class DlInfo internal constructor(
    dliFnameCtorArg: ConstPtr<CChar>,
    dliFbaseCtorArg: MutPtr<CVoid>,
    dliSnameCtorArg: ConstPtr<CChar>,
    dliSaddrCtorArg: MutPtr<CVoid>,
) {
    public var dliFname: ConstPtr<CChar> = dliFnameCtorArg
        internal set

    public var dliFbase: MutPtr<CVoid> = dliFbaseCtorArg
        internal set

    public var dliSname: ConstPtr<CChar> = dliSnameCtorArg
        internal set

    public var dliSaddr: MutPtr<CVoid> = dliSaddrCtorArg
        internal set

    public constructor() : this(
        dliFnameCtorArg = ConstPtr(0L),
        dliFbaseCtorArg = MutPtr(0L),
        dliSnameCtorArg = ConstPtr(0L),
        dliSaddrCtorArg = MutPtr(0L),
    )

    public operator fun component1(): ConstPtr<CChar> = this.dliFname

    public operator fun component2(): MutPtr<CVoid> = this.dliFbase

    public operator fun component3(): ConstPtr<CChar> = this.dliSname

    public operator fun component4(): MutPtr<CVoid> = this.dliSaddr

    public fun copy(dliFname: ConstPtr<CChar> = this.dliFname, dliFbase: MutPtr<CVoid> = this.dliFbase, dliSname: ConstPtr<CChar> = this.dliSname, dliSaddr: MutPtr<CVoid> = this.dliSaddr): DlInfo = DlInfo(dliFnameCtorArg = dliFname, dliFbaseCtorArg = dliFbase, dliSnameCtorArg = dliSname, dliSaddrCtorArg = dliSaddr)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DlInfo) return false
        if (this.dliFname != other.dliFname) return false
        if (this.dliFbase != other.dliFbase) return false
        if (this.dliSname != other.dliSname) return false
        if (this.dliSaddr != other.dliSaddr) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dliFname.hashCode()
        result = 31 * result + this.dliFbase.hashCode()
        result = 31 * result + this.dliSname.hashCode()
        result = 31 * result + this.dliSaddr.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<DlInfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<DlInfo> {
                override val sizeBytes: Long = 32L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): DlInfo =
                    DlInfo(
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .constPtrLayout<CChar>(64)
                        ).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CVoid>(64)
                        ).readNative(addr + 8L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .constPtrLayout<CChar>(64)
                        ).readNative(addr + 16L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CVoid>(64)
                        ).readNative(addr + 24L),
                    )
                override fun writeNative(addr: Long, value: DlInfo) {
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .constPtrLayout<CChar>(64)
                    ).writeNative(addr, value.dliFname)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr + 8L, value.dliFbase)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .constPtrLayout<CChar>(64)
                    ).writeNative(addr + 16L, value.dliSname)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr + 24L, value.dliSaddr)
                }
            }

        public operator fun invoke(
            dliFname: ConstPtr<CChar> = ConstPtr(0L),
            dliFbase: MutPtr<CVoid> = MutPtr(0L),
            dliSname: ConstPtr<CChar> = ConstPtr(0L),
            dliSaddr: MutPtr<CVoid> = MutPtr(0L),
        ): DlInfo =
            DlInfo(
                dliFnameCtorArg = dliFname,
                dliFbaseCtorArg = dliFbase,
                dliSnameCtorArg = dliSname,
                dliSaddrCtorArg = dliSaddr,
            )
    }
}

public data class SockaddrIn(
    public var sinLen: UByte = 0u,
    public var sinFamily: SaFamilyT = 0u,
    public var sinPort: InPortT = 0u,
    public var sinAddr: InAddr = InAddr(),
    public var sinZero: UByteArray = UByteArray(8),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SockaddrIn) return false
        if (this.sinLen != other.sinLen) return false
        if (this.sinFamily != other.sinFamily) return false
        if (this.sinPort != other.sinPort) return false
        if (this.sinAddr != other.sinAddr) return false
        if (!this.sinZero.contentEquals(other.sinZero)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.sinLen.hashCode()
        result = 31 * result + this.sinFamily.hashCode()
        result = 31 * result + this.sinPort.hashCode()
        result = 31 * result + this.sinAddr.hashCode()
        result = 31 * result + this.sinZero.contentHashCode()
        return result
    }
}

public data class Kevent64S(
    public var ident: ULong = 0uL,
    public var filter: Short = 0,
    public var flags: UShort = 0u,
    public var fflags: UInt = 0u,
    public var data: Long = 0L,
    public var udata: ULong = 0uL,
    public var ext: ULongArray = ULongArray(2),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Kevent64S) return false
        if (this.ident != other.ident) return false
        if (this.filter != other.filter) return false
        if (this.flags != other.flags) return false
        if (this.fflags != other.fflags) return false
        if (this.data != other.data) return false
        if (this.udata != other.udata) return false
        if (!this.ext.contentEquals(other.ext)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.ident.hashCode()
        result = 31 * result + this.filter.hashCode()
        result = 31 * result + this.flags.hashCode()
        result = 31 * result + this.fflags.hashCode()
        result = 31 * result + this.data.hashCode()
        result = 31 * result + this.udata.hashCode()
        result = 31 * result + this.ext.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Kevent64S> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Kevent64S> {
                override val sizeBytes: Long = 48L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): Kevent64S =
                    Kevent64S(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 10L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 24L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64, (2).toInt())
                        ).readNative(addr + 32L),
                    )
                override fun writeNative(addr: Long, value: Kevent64S) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr, value.ident)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).writeNative(addr + 8L, value.filter)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 10L, value.flags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.fflags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 16L, value.data)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 24L, value.udata)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64, (2).toInt())
                    ).writeNative(addr + 32L, value.ext)
                }
            }
    }
}

public data class Dqblk(
    public var dqbBhardlimit: ULong = 0uL,
    public var dqbBsoftlimit: ULong = 0uL,
    public var dqbCurbytes: ULong = 0uL,
    public var dqbIhardlimit: UInt = 0u,
    public var dqbIsoftlimit: UInt = 0u,
    public var dqbCurinodes: UInt = 0u,
    public var dqbBtime: UInt = 0u,
    public var dqbItime: UInt = 0u,
    public var dqbId: UInt = 0u,
    public var dqbSpare: UIntArray = UIntArray(4),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Dqblk) return false
        if (this.dqbBhardlimit != other.dqbBhardlimit) return false
        if (this.dqbBsoftlimit != other.dqbBsoftlimit) return false
        if (this.dqbCurbytes != other.dqbCurbytes) return false
        if (this.dqbIhardlimit != other.dqbIhardlimit) return false
        if (this.dqbIsoftlimit != other.dqbIsoftlimit) return false
        if (this.dqbCurinodes != other.dqbCurinodes) return false
        if (this.dqbBtime != other.dqbBtime) return false
        if (this.dqbItime != other.dqbItime) return false
        if (this.dqbId != other.dqbId) return false
        if (!this.dqbSpare.contentEquals(other.dqbSpare)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dqbBhardlimit.hashCode()
        result = 31 * result + this.dqbBsoftlimit.hashCode()
        result = 31 * result + this.dqbCurbytes.hashCode()
        result = 31 * result + this.dqbIhardlimit.hashCode()
        result = 31 * result + this.dqbIsoftlimit.hashCode()
        result = 31 * result + this.dqbCurinodes.hashCode()
        result = 31 * result + this.dqbBtime.hashCode()
        result = 31 * result + this.dqbItime.hashCode()
        result = 31 * result + this.dqbId.hashCode()
        result = 31 * result + this.dqbSpare.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Dqblk> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Dqblk> {
                override val sizeBytes: Long = 64L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): Dqblk =
                    Dqblk(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 28L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 32L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 36L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 40L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 44L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32, (4).toInt())
                        ).readNative(addr + 48L),
                    )
                override fun writeNative(addr: Long, value: Dqblk) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr, value.dqbBhardlimit)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 8L, value.dqbBsoftlimit)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 16L, value.dqbCurbytes)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 24L, value.dqbIhardlimit)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 28L, value.dqbIsoftlimit)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 32L, value.dqbCurinodes)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 36L, value.dqbBtime)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 40L, value.dqbItime)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 44L, value.dqbId)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32, (4).toInt())
                    ).writeNative(addr + 48L, value.dqbSpare)
                }
            }
    }
}

public data class IfMsghdr(
    public var ifmMsglen: CUshort = 0u,
    public var ifmVersion: CUchar = 0u,
    public var ifmType: CUchar = 0u,
    public var ifmAddrs: CInt = 0,
    public var ifmFlags: CInt = 0,
    public var ifmIndex: CUshort = 0u,
    public var ifmData: IfData = IfData(),
)

public data class IfaMsghdr(
    public var ifamMsglen: CUshort = 0u,
    public var ifamVersion: CUchar = 0u,
    public var ifamType: CUchar = 0u,
    public var ifamAddrs: CInt = 0,
    public var ifamFlags: CInt = 0,
    public var ifamIndex: CUshort = 0u,
    public var ifamMetric: CInt = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<IfaMsghdr> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<IfaMsghdr> {
                override val sizeBytes: Long = 20L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): IfaMsghdr =
                    IfaMsghdr(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 2L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 3L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: IfaMsghdr) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.ifamMsglen)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 2L, value.ifamVersion)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 3L, value.ifamType)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 4L, value.ifamAddrs)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 8L, value.ifamFlags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 12L, value.ifamIndex)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 16L, value.ifamMetric)
                }
            }
    }
}

public data class IfmaMsghdr(
    public var ifmamMsglen: CUshort = 0u,
    public var ifmamVersion: CUchar = 0u,
    public var ifmamType: CUchar = 0u,
    public var ifmamAddrs: CInt = 0,
    public var ifmamFlags: CInt = 0,
    public var ifmamIndex: CUshort = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<IfmaMsghdr> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<IfmaMsghdr> {
                override val sizeBytes: Long = 16L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): IfmaMsghdr =
                    IfmaMsghdr(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 2L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 3L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 12L),
                    )
                override fun writeNative(addr: Long, value: IfmaMsghdr) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.ifmamMsglen)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 2L, value.ifmamVersion)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 3L, value.ifmamType)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 4L, value.ifmamAddrs)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 8L, value.ifmamFlags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 12L, value.ifmamIndex)
                }
            }
    }
}

public data class IfmaMsghdr2(
    public var ifmamMsglen: CUshort = 0u,
    public var ifmamVersion: CUchar = 0u,
    public var ifmamType: CUchar = 0u,
    public var ifmamAddrs: CInt = 0,
    public var ifmamFlags: CInt = 0,
    public var ifmamIndex: CUshort = 0u,
    public var ifmamRefcount: Int = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<IfmaMsghdr2> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<IfmaMsghdr2> {
                override val sizeBytes: Long = 20L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): IfmaMsghdr2 =
                    IfmaMsghdr2(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 2L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 3L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: IfmaMsghdr2) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.ifmamMsglen)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 2L, value.ifmamVersion)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 3L, value.ifmamType)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 4L, value.ifmamAddrs)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 8L, value.ifmamFlags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 12L, value.ifmamIndex)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 16L, value.ifmamRefcount)
                }
            }
    }
}

public data class RtMetrics(
    public var rmxLocks: UInt = 0u,
    public var rmxMtu: UInt = 0u,
    public var rmxHopcount: UInt = 0u,
    public var rmxExpire: Int = 0,
    public var rmxRecvpipe: UInt = 0u,
    public var rmxSendpipe: UInt = 0u,
    public var rmxSsthresh: UInt = 0u,
    public var rmxRtt: UInt = 0u,
    public var rmxRttvar: UInt = 0u,
    public var rmxPksent: UInt = 0u,
    /**
     * This field does not exist anymore, the u32 is now part of a resized
     * `rmxFiller` array.
     */
    public var rmxState: UInt = 0u,
    public var rmxFiller: UIntArray = UIntArray(3),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is RtMetrics) return false
        if (this.rmxLocks != other.rmxLocks) return false
        if (this.rmxMtu != other.rmxMtu) return false
        if (this.rmxHopcount != other.rmxHopcount) return false
        if (this.rmxExpire != other.rmxExpire) return false
        if (this.rmxRecvpipe != other.rmxRecvpipe) return false
        if (this.rmxSendpipe != other.rmxSendpipe) return false
        if (this.rmxSsthresh != other.rmxSsthresh) return false
        if (this.rmxRtt != other.rmxRtt) return false
        if (this.rmxRttvar != other.rmxRttvar) return false
        if (this.rmxPksent != other.rmxPksent) return false
        if (this.rmxState != other.rmxState) return false
        if (!this.rmxFiller.contentEquals(other.rmxFiller)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.rmxLocks.hashCode()
        result = 31 * result + this.rmxMtu.hashCode()
        result = 31 * result + this.rmxHopcount.hashCode()
        result = 31 * result + this.rmxExpire.hashCode()
        result = 31 * result + this.rmxRecvpipe.hashCode()
        result = 31 * result + this.rmxSendpipe.hashCode()
        result = 31 * result + this.rmxSsthresh.hashCode()
        result = 31 * result + this.rmxRtt.hashCode()
        result = 31 * result + this.rmxRttvar.hashCode()
        result = 31 * result + this.rmxPksent.hashCode()
        result = 31 * result + this.rmxState.hashCode()
        result = 31 * result + this.rmxFiller.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<RtMetrics> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<RtMetrics> {
                override val sizeBytes: Long = 56L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): RtMetrics =
                    RtMetrics(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 20L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 28L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 32L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 36L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 40L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32, (3).toInt())
                        ).readNative(addr + 44L),
                    )
                override fun writeNative(addr: Long, value: RtMetrics) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.rmxLocks)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.rmxMtu)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.rmxHopcount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 12L, value.rmxExpire)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.rmxRecvpipe)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.rmxSendpipe)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 24L, value.rmxSsthresh)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 28L, value.rmxRtt)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 32L, value.rmxRttvar)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 36L, value.rmxPksent)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 40L, value.rmxState)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32, (3).toInt())
                    ).writeNative(addr + 44L, value.rmxFiller)
                }
            }
    }
}

public data class RtMsghdr(
    public var rtmMsglen: CUshort = 0u,
    public var rtmVersion: CUchar = 0u,
    public var rtmType: CUchar = 0u,
    public var rtmIndex: CUshort = 0u,
    public var rtmFlags: CInt = 0,
    public var rtmAddrs: CInt = 0,
    public var rtmPid: PidT = 0,
    public var rtmSeq: CInt = 0,
    public var rtmErrno: CInt = 0,
    public var rtmUse: CInt = 0,
    public var rtmInits: UInt = 0u,
    public var rtmRmx: RtMetrics = RtMetrics(),
)

public data class RtMsghdr2(
    public var rtmMsglen: CUshort = 0u,
    public var rtmVersion: CUchar = 0u,
    public var rtmType: CUchar = 0u,
    public var rtmIndex: CUshort = 0u,
    public var rtmFlags: CInt = 0,
    public var rtmAddrs: CInt = 0,
    public var rtmRefcnt: Int = 0,
    public var rtmParentflags: CInt = 0,
    public var rtmReserved: CInt = 0,
    public var rtmUse: CInt = 0,
    public var rtmInits: UInt = 0u,
    public var rtmRmx: RtMetrics = RtMetrics(),
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<RtMsghdr2> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<RtMsghdr2> {
                override val sizeBytes: Long = 92L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): RtMsghdr2 =
                    RtMsghdr2(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 2L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 3L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 20L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 28L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 32L),
                        (RtMetrics.typeLayout()).readNative(addr + 36L),
                    )
                override fun writeNative(addr: Long, value: RtMsghdr2) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.rtmMsglen)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 2L, value.rtmVersion)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 3L, value.rtmType)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 4L, value.rtmIndex)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 8L, value.rtmFlags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 12L, value.rtmAddrs)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 16L, value.rtmRefcnt)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 20L, value.rtmParentflags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 24L, value.rtmReserved)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 28L, value.rtmUse)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 32L, value.rtmInits)
                    (RtMetrics.typeLayout()).writeNative(addr + 36L, value.rtmRmx)
                }
            }
    }
}

public data class Termios(
    public var cIflag: TcflagT = 0uL,
    public var cOflag: TcflagT = 0uL,
    public var cCflag: TcflagT = 0uL,
    public var cLflag: TcflagT = 0uL,
    public var cCc: UByteArray = UByteArray(NCCS),
    public var cIspeed: SpeedT = 0uL,
    public var cOspeed: SpeedT = 0uL,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Termios) return false
        if (this.cIflag != other.cIflag) return false
        if (this.cOflag != other.cOflag) return false
        if (this.cCflag != other.cCflag) return false
        if (this.cLflag != other.cLflag) return false
        if (!this.cCc.contentEquals(other.cCc)) return false
        if (this.cIspeed != other.cIspeed) return false
        if (this.cOspeed != other.cOspeed) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cIflag.hashCode()
        result = 31 * result + this.cOflag.hashCode()
        result = 31 * result + this.cCflag.hashCode()
        result = 31 * result + this.cLflag.hashCode()
        result = 31 * result + this.cCc.contentHashCode()
        result = 31 * result + this.cIspeed.hashCode()
        result = 31 * result + this.cOspeed.hashCode()
        return result
    }
}

public data class Flock(
    public var lStart: OffT = 0L,
    public var lLen: OffT = 0L,
    public var lPid: PidT = 0,
    public var lType: CShort = 0,
    public var lWhence: CShort = 0,
)

public class SfHdtr internal constructor(
    headersCtorArg: MutPtr<Iovec>,
    public var hdrCnt: CInt,
    trailersCtorArg: MutPtr<Iovec>,
    public var trlCnt: CInt,
) {
    public var headers: MutPtr<Iovec> = headersCtorArg
        internal set

    public var trailers: MutPtr<Iovec> = trailersCtorArg
        internal set

    public constructor() : this(
        headersCtorArg = MutPtr(0L),
        hdrCnt = 0,
        trailersCtorArg = MutPtr(0L),
        trlCnt = 0,
    )

    public operator fun component1(): MutPtr<Iovec> = this.headers

    public operator fun component2(): CInt = this.hdrCnt

    public operator fun component3(): MutPtr<Iovec> = this.trailers

    public operator fun component4(): CInt = this.trlCnt

    public fun copy(headers: MutPtr<Iovec> = this.headers, hdrCnt: CInt = this.hdrCnt, trailers: MutPtr<Iovec> = this.trailers, trlCnt: CInt = this.trlCnt): SfHdtr = SfHdtr(headersCtorArg = headers, hdrCnt = hdrCnt, trailersCtorArg = trailers, trlCnt = trlCnt)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SfHdtr) return false
        if (this.headers != other.headers) return false
        if (this.hdrCnt != other.hdrCnt) return false
        if (this.trailers != other.trailers) return false
        if (this.trlCnt != other.trlCnt) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.headers.hashCode()
        result = 31 * result + this.hdrCnt.hashCode()
        result = 31 * result + this.trailers.hashCode()
        result = 31 * result + this.trlCnt.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SfHdtr> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SfHdtr> {
                override val sizeBytes: Long = 32L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): SfHdtr =
                    SfHdtr(
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<Iovec>(64)
                        ).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 8L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<Iovec>(64)
                        ).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 24L),
                    )
                override fun writeNative(addr: Long, value: SfHdtr) {
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<Iovec>(64)
                    ).writeNative(addr, value.headers)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 8L, value.hdrCnt)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<Iovec>(64)
                    ).writeNative(addr + 16L, value.trailers)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 24L, value.trlCnt)
                }
            }

        public operator fun invoke(
            headers: MutPtr<Iovec> = MutPtr(0L),
            hdrCnt: CInt = 0,
            trailers: MutPtr<Iovec> = MutPtr(0L),
            trlCnt: CInt = 0,
        ): SfHdtr =
            SfHdtr(
                headersCtorArg = headers,
                hdrCnt = hdrCnt,
                trailersCtorArg = trailers,
                trlCnt = trlCnt,
            )
    }
}

public class Lconv internal constructor(
    decimalPointCtorArg: MutPtr<CChar>,
    thousandsSepCtorArg: MutPtr<CChar>,
    groupingCtorArg: MutPtr<CChar>,
    intCurrSymbolCtorArg: MutPtr<CChar>,
    currencySymbolCtorArg: MutPtr<CChar>,
    monDecimalPointCtorArg: MutPtr<CChar>,
    monThousandsSepCtorArg: MutPtr<CChar>,
    monGroupingCtorArg: MutPtr<CChar>,
    positiveSignCtorArg: MutPtr<CChar>,
    negativeSignCtorArg: MutPtr<CChar>,
    public var intFracDigits: CChar,
    public var fracDigits: CChar,
    public var pCsPrecedes: CChar,
    public var pSepBySpace: CChar,
    public var nCsPrecedes: CChar,
    public var nSepBySpace: CChar,
    public var pSignPosn: CChar,
    public var nSignPosn: CChar,
    public var intPCsPrecedes: CChar,
    public var intNCsPrecedes: CChar,
    public var intPSepBySpace: CChar,
    public var intNSepBySpace: CChar,
    public var intPSignPosn: CChar,
    public var intNSignPosn: CChar,
) {
    public var decimalPoint: MutPtr<CChar> = decimalPointCtorArg
        internal set

    public var thousandsSep: MutPtr<CChar> = thousandsSepCtorArg
        internal set

    public var grouping: MutPtr<CChar> = groupingCtorArg
        internal set

    public var intCurrSymbol: MutPtr<CChar> = intCurrSymbolCtorArg
        internal set

    public var currencySymbol: MutPtr<CChar> = currencySymbolCtorArg
        internal set

    public var monDecimalPoint: MutPtr<CChar> = monDecimalPointCtorArg
        internal set

    public var monThousandsSep: MutPtr<CChar> = monThousandsSepCtorArg
        internal set

    public var monGrouping: MutPtr<CChar> = monGroupingCtorArg
        internal set

    public var positiveSign: MutPtr<CChar> = positiveSignCtorArg
        internal set

    public var negativeSign: MutPtr<CChar> = negativeSignCtorArg
        internal set

    public constructor() : this(
        decimalPointCtorArg = MutPtr(0L),
        thousandsSepCtorArg = MutPtr(0L),
        groupingCtorArg = MutPtr(0L),
        intCurrSymbolCtorArg = MutPtr(0L),
        currencySymbolCtorArg = MutPtr(0L),
        monDecimalPointCtorArg = MutPtr(0L),
        monThousandsSepCtorArg = MutPtr(0L),
        monGroupingCtorArg = MutPtr(0L),
        positiveSignCtorArg = MutPtr(0L),
        negativeSignCtorArg = MutPtr(0L),
        intFracDigits = 0u,
        fracDigits = 0u,
        pCsPrecedes = 0u,
        pSepBySpace = 0u,
        nCsPrecedes = 0u,
        nSepBySpace = 0u,
        pSignPosn = 0u,
        nSignPosn = 0u,
        intPCsPrecedes = 0u,
        intNCsPrecedes = 0u,
        intPSepBySpace = 0u,
        intNSepBySpace = 0u,
        intPSignPosn = 0u,
        intNSignPosn = 0u,
    )

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Lconv> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Lconv> {
                override val sizeBytes: Long = 96L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): Lconv =
                    Lconv(
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CChar>(64)
                        ).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CChar>(64)
                        ).readNative(addr + 8L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CChar>(64)
                        ).readNative(addr + 16L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CChar>(64)
                        ).readNative(addr + 24L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CChar>(64)
                        ).readNative(addr + 32L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CChar>(64)
                        ).readNative(addr + 40L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CChar>(64)
                        ).readNative(addr + 48L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CChar>(64)
                        ).readNative(addr + 56L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CChar>(64)
                        ).readNative(addr + 64L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CChar>(64)
                        ).readNative(addr + 72L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8).readNative(addr + 80L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8).readNative(addr + 81L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8).readNative(addr + 82L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8).readNative(addr + 83L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8).readNative(addr + 84L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8).readNative(addr + 85L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8).readNative(addr + 86L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8).readNative(addr + 87L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8).readNative(addr + 88L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8).readNative(addr + 89L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8).readNative(addr + 90L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8).readNative(addr + 91L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8).readNative(addr + 92L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8).readNative(addr + 93L),
                    )
                override fun writeNative(addr: Long, value: Lconv) {
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CChar>(64)
                    ).writeNative(addr, value.decimalPoint)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CChar>(64)
                    ).writeNative(addr + 8L, value.thousandsSep)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CChar>(64)
                    ).writeNative(addr + 16L, value.grouping)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CChar>(64)
                    ).writeNative(addr + 24L, value.intCurrSymbol)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CChar>(64)
                    ).writeNative(addr + 32L, value.currencySymbol)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CChar>(64)
                    ).writeNative(addr + 40L, value.monDecimalPoint)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CChar>(64)
                    ).writeNative(addr + 48L, value.monThousandsSep)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CChar>(64)
                    ).writeNative(addr + 56L, value.monGrouping)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CChar>(64)
                    ).writeNative(addr + 64L, value.positiveSign)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CChar>(64)
                    ).writeNative(addr + 72L, value.negativeSign)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8).writeNative(addr + 80L, value.intFracDigits)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8).writeNative(addr + 81L, value.fracDigits)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8).writeNative(addr + 82L, value.pCsPrecedes)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8).writeNative(addr + 83L, value.pSepBySpace)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8).writeNative(addr + 84L, value.nCsPrecedes)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8).writeNative(addr + 85L, value.nSepBySpace)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8).writeNative(addr + 86L, value.pSignPosn)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8).writeNative(addr + 87L, value.nSignPosn)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8).writeNative(addr + 88L, value.intPCsPrecedes)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8).writeNative(addr + 89L, value.intNCsPrecedes)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8).writeNative(addr + 90L, value.intPSepBySpace)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8).writeNative(addr + 91L, value.intNSepBySpace)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8).writeNative(addr + 92L, value.intPSignPosn)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8).writeNative(addr + 93L, value.intNSignPosn)
                }
            }

        public operator fun invoke(
            decimalPoint: MutPtr<CChar> = MutPtr(0L),
            thousandsSep: MutPtr<CChar> = MutPtr(0L),
            grouping: MutPtr<CChar> = MutPtr(0L),
            intCurrSymbol: MutPtr<CChar> = MutPtr(0L),
            currencySymbol: MutPtr<CChar> = MutPtr(0L),
            monDecimalPoint: MutPtr<CChar> = MutPtr(0L),
            monThousandsSep: MutPtr<CChar> = MutPtr(0L),
            monGrouping: MutPtr<CChar> = MutPtr(0L),
            positiveSign: MutPtr<CChar> = MutPtr(0L),
            negativeSign: MutPtr<CChar> = MutPtr(0L),
            intFracDigits: CChar = 0u,
            fracDigits: CChar = 0u,
            pCsPrecedes: CChar = 0u,
            pSepBySpace: CChar = 0u,
            nCsPrecedes: CChar = 0u,
            nSepBySpace: CChar = 0u,
            pSignPosn: CChar = 0u,
            nSignPosn: CChar = 0u,
            intPCsPrecedes: CChar = 0u,
            intNCsPrecedes: CChar = 0u,
            intPSepBySpace: CChar = 0u,
            intNSepBySpace: CChar = 0u,
            intPSignPosn: CChar = 0u,
            intNSignPosn: CChar = 0u,
        ): Lconv =
            Lconv(
                decimalPointCtorArg = decimalPoint,
                thousandsSepCtorArg = thousandsSep,
                groupingCtorArg = grouping,
                intCurrSymbolCtorArg = intCurrSymbol,
                currencySymbolCtorArg = currencySymbol,
                monDecimalPointCtorArg = monDecimalPoint,
                monThousandsSepCtorArg = monThousandsSep,
                monGroupingCtorArg = monGrouping,
                positiveSignCtorArg = positiveSign,
                negativeSignCtorArg = negativeSign,
                intFracDigits = intFracDigits,
                fracDigits = fracDigits,
                pCsPrecedes = pCsPrecedes,
                pSepBySpace = pSepBySpace,
                nCsPrecedes = nCsPrecedes,
                nSepBySpace = nSepBySpace,
                pSignPosn = pSignPosn,
                nSignPosn = nSignPosn,
                intPCsPrecedes = intPCsPrecedes,
                intNCsPrecedes = intNCsPrecedes,
                intPSepBySpace = intPSepBySpace,
                intNSepBySpace = intNSepBySpace,
                intPSignPosn = intPSignPosn,
                intNSignPosn = intNSignPosn,
            )
    }
}

public class ProcTaskinfo(
    public var ptiVirtualSize: ULong = 0uL,
    public var ptiResidentSize: ULong = 0uL,
    public var ptiTotalUser: ULong = 0uL,
    public var ptiTotalSystem: ULong = 0uL,
    public var ptiThreadsUser: ULong = 0uL,
    public var ptiThreadsSystem: ULong = 0uL,
    public var ptiPolicy: Int = 0,
    public var ptiFaults: Int = 0,
    public var ptiPageins: Int = 0,
    public var ptiCowFaults: Int = 0,
    public var ptiMessagesSent: Int = 0,
    public var ptiMessagesReceived: Int = 0,
    public var ptiSyscallsMach: Int = 0,
    public var ptiSyscallsUnix: Int = 0,
    public var ptiCsw: Int = 0,
    public var ptiThreadnum: Int = 0,
    public var ptiNumrunning: Int = 0,
    public var ptiPriority: Int = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ProcTaskinfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ProcTaskinfo> {
                override val sizeBytes: Long = 96L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): ProcTaskinfo =
                    ProcTaskinfo(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 32L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 40L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 48L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 52L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 56L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 60L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 64L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 68L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 72L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 76L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 80L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 84L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 88L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 92L),
                    )
                override fun writeNative(addr: Long, value: ProcTaskinfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr, value.ptiVirtualSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 8L, value.ptiResidentSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 16L, value.ptiTotalUser)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 24L, value.ptiTotalSystem)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 32L, value.ptiThreadsUser)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 40L, value.ptiThreadsSystem)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 48L, value.ptiPolicy)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 52L, value.ptiFaults)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 56L, value.ptiPageins)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 60L, value.ptiCowFaults)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 64L, value.ptiMessagesSent)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 68L, value.ptiMessagesReceived)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 72L, value.ptiSyscallsMach)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 76L, value.ptiSyscallsUnix)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 80L, value.ptiCsw)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 84L, value.ptiThreadnum)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 88L, value.ptiNumrunning)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 92L, value.ptiPriority)
                }
            }
    }
}

public class ProcBsdinfo(
    public var pbiFlags: UInt = 0u,
    public var pbiStatus: UInt = 0u,
    public var pbiXstatus: UInt = 0u,
    public var pbiPid: UInt = 0u,
    public var pbiPpid: UInt = 0u,
    public var pbiUid: UidT = 0u,
    public var pbiGid: GidT = 0u,
    public var pbiRuid: UidT = 0u,
    public var pbiRgid: GidT = 0u,
    public var pbiSvuid: UidT = 0u,
    public var pbiSvgid: GidT = 0u,
    public var rfu1: UInt = 0u,
    public var pbiComm: UByteArray = UByteArray(MAXCOMLEN),
    public var pbiName: UByteArray = UByteArray(32),
    // MAXCOMLEN * 2, but macro isn't happy...
    public var pbiNfiles: UInt = 0u,
    public var pbiPgid: UInt = 0u,
    public var pbiPjobc: UInt = 0u,
    public var eTdev: UInt = 0u,
    public var eTpgid: UInt = 0u,
    public var pbiNice: Int = 0,
    public var pbiStartTvsec: ULong = 0uL,
    public var pbiStartTvusec: ULong = 0uL,
)

public data class ProcTaskallinfo(
    public var pbsd: ProcBsdinfo = ProcBsdinfo(),
    public var ptinfo: ProcTaskinfo = ProcTaskinfo(),
)

public data class XswUsage(
    public var xsuTotal: ULong = 0uL,
    public var xsuAvail: ULong = 0uL,
    public var xsuUsed: ULong = 0uL,
    public var xsuPagesize: UInt = 0u,
    public var xsuEncrypted: BooleanT = 0,
)

public data class Xucred(
    public var crVersion: CUint = 0u,
    public var crUid: UidT = 0u,
    public var crNgroups: CShort = 0,
    public var crGroups: UShortArray = UShortArray(16),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Xucred) return false
        if (this.crVersion != other.crVersion) return false
        if (this.crUid != other.crUid) return false
        if (this.crNgroups != other.crNgroups) return false
        if (!this.crGroups.contentEquals(other.crGroups)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.crVersion.hashCode()
        result = 31 * result + this.crUid.hashCode()
        result = 31 * result + this.crNgroups.hashCode()
        result = 31 * result + this.crGroups.contentHashCode()
        return result
    }
}

public data class MachHeader(
    public var magic: UInt = 0u,
    public var cputype: CpuTypeT = 0,
    public var cpusubtype: CpuSubtypeT = 0,
    public var filetype: UInt = 0u,
    public var ncmds: UInt = 0u,
    public var sizeofcmds: UInt = 0u,
    public var flags: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<MachHeader> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<MachHeader> {
                override val sizeBytes: Long = 28L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): MachHeader =
                    MachHeader(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 20L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 24L),
                    )
                override fun writeNative(addr: Long, value: MachHeader) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.magic)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 4L, value.cputype)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 8L, value.cpusubtype)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.filetype)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.ncmds)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.sizeofcmds)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 24L, value.flags)
                }
            }
    }
}

public data class MachHeader64(
    public var magic: UInt = 0u,
    public var cputype: CpuTypeT = 0,
    public var cpusubtype: CpuSubtypeT = 0,
    public var filetype: UInt = 0u,
    public var ncmds: UInt = 0u,
    public var sizeofcmds: UInt = 0u,
    public var flags: UInt = 0u,
    public var reserved: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<MachHeader64> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<MachHeader64> {
                override val sizeBytes: Long = 32L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): MachHeader64 =
                    MachHeader64(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 20L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 28L),
                    )
                override fun writeNative(addr: Long, value: MachHeader64) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.magic)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 4L, value.cputype)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 8L, value.cpusubtype)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.filetype)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.ncmds)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.sizeofcmds)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 24L, value.flags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 28L, value.reserved)
                }
            }
    }
}

public data class SegmentCommand(
    public var cmd: UInt = 0u,
    public var cmdsize: UInt = 0u,
    public var segname: UByteArray = UByteArray(16),
    public var vmaddr: UInt = 0u,
    public var vmsize: UInt = 0u,
    public var fileoff: UInt = 0u,
    public var filesize: UInt = 0u,
    public var maxprot: VmProtT = 0,
    public var initprot: VmProtT = 0,
    public var nsects: UInt = 0u,
    public var flags: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SegmentCommand) return false
        if (this.cmd != other.cmd) return false
        if (this.cmdsize != other.cmdsize) return false
        if (!this.segname.contentEquals(other.segname)) return false
        if (this.vmaddr != other.vmaddr) return false
        if (this.vmsize != other.vmsize) return false
        if (this.fileoff != other.fileoff) return false
        if (this.filesize != other.filesize) return false
        if (this.maxprot != other.maxprot) return false
        if (this.initprot != other.initprot) return false
        if (this.nsects != other.nsects) return false
        if (this.flags != other.flags) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cmd.hashCode()
        result = 31 * result + this.cmdsize.hashCode()
        result = 31 * result + this.segname.contentHashCode()
        result = 31 * result + this.vmaddr.hashCode()
        result = 31 * result + this.vmsize.hashCode()
        result = 31 * result + this.fileoff.hashCode()
        result = 31 * result + this.filesize.hashCode()
        result = 31 * result + this.maxprot.hashCode()
        result = 31 * result + this.initprot.hashCode()
        result = 31 * result + this.nsects.hashCode()
        result = 31 * result + this.flags.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SegmentCommand> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SegmentCommand> {
                override val sizeBytes: Long = 56L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): SegmentCommand =
                    SegmentCommand(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (16).toInt())
                        ).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 28L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 32L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 36L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 40L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 44L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 48L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 52L),
                    )
                override fun writeNative(addr: Long, value: SegmentCommand) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.cmd)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.cmdsize)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (16).toInt())
                    ).writeNative(addr + 8L, value.segname)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 24L, value.vmaddr)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 28L, value.vmsize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 32L, value.fileoff)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 36L, value.filesize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 40L, value.maxprot)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 44L, value.initprot)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 48L, value.nsects)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 52L, value.flags)
                }
            }
    }
}

public data class SegmentCommand64(
    public var cmd: UInt = 0u,
    public var cmdsize: UInt = 0u,
    public var segname: UByteArray = UByteArray(16),
    public var vmaddr: ULong = 0uL,
    public var vmsize: ULong = 0uL,
    public var fileoff: ULong = 0uL,
    public var filesize: ULong = 0uL,
    public var maxprot: VmProtT = 0,
    public var initprot: VmProtT = 0,
    public var nsects: UInt = 0u,
    public var flags: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SegmentCommand64) return false
        if (this.cmd != other.cmd) return false
        if (this.cmdsize != other.cmdsize) return false
        if (!this.segname.contentEquals(other.segname)) return false
        if (this.vmaddr != other.vmaddr) return false
        if (this.vmsize != other.vmsize) return false
        if (this.fileoff != other.fileoff) return false
        if (this.filesize != other.filesize) return false
        if (this.maxprot != other.maxprot) return false
        if (this.initprot != other.initprot) return false
        if (this.nsects != other.nsects) return false
        if (this.flags != other.flags) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cmd.hashCode()
        result = 31 * result + this.cmdsize.hashCode()
        result = 31 * result + this.segname.contentHashCode()
        result = 31 * result + this.vmaddr.hashCode()
        result = 31 * result + this.vmsize.hashCode()
        result = 31 * result + this.fileoff.hashCode()
        result = 31 * result + this.filesize.hashCode()
        result = 31 * result + this.maxprot.hashCode()
        result = 31 * result + this.initprot.hashCode()
        result = 31 * result + this.nsects.hashCode()
        result = 31 * result + this.flags.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SegmentCommand64> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SegmentCommand64> {
                override val sizeBytes: Long = 72L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): SegmentCommand64 =
                    SegmentCommand64(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (16).toInt())
                        ).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 32L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 40L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 48L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 56L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 60L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 64L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 68L),
                    )
                override fun writeNative(addr: Long, value: SegmentCommand64) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.cmd)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.cmdsize)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (16).toInt())
                    ).writeNative(addr + 8L, value.segname)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 24L, value.vmaddr)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 32L, value.vmsize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 40L, value.fileoff)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 48L, value.filesize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 56L, value.maxprot)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 60L, value.initprot)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 64L, value.nsects)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 68L, value.flags)
                }
            }
    }
}

public data class LoadCommand(
    public var cmd: UInt = 0u,
    public var cmdsize: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<LoadCommand> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<LoadCommand> {
                override val sizeBytes: Long = 8L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): LoadCommand =
                    LoadCommand(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: LoadCommand) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.cmd)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.cmdsize)
                }
            }
    }
}

public data class SockaddrDl(
    public var sdlLen: CUchar = 0u,
    public var sdlFamily: CUchar = 0u,
    public var sdlIndex: CUshort = 0u,
    public var sdlType: CUchar = 0u,
    public var sdlNlen: CUchar = 0u,
    public var sdlAlen: CUchar = 0u,
    public var sdlSlen: CUchar = 0u,
    public var sdlData: UByteArray = UByteArray(12),
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
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SockaddrDl> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SockaddrDl> {
                override val sizeBytes: Long = 20L
                override val alignBytes: Long = 2L
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
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (12).toInt())
                        ).readNative(addr + 8L),
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
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (12).toInt())
                    ).writeNative(addr + 8L, value.sdlData)
                }
            }
    }
}

public data class SockaddrInarp(
    public var sinLen: CUchar = 0u,
    public var sinFamily: CUchar = 0u,
    public var sinPort: CUshort = 0u,
    public var sinAddr: InAddr = InAddr(),
    public var sinSrcaddr: InAddr = InAddr(),
    public var sinTos: CUshort = 0u,
    public var sinOther: CUshort = 0u,
)

public data class SockaddrCtl(
    public var scLen: CUchar = 0u,
    public var scFamily: CUchar = 0u,
    public var ssSysaddr: UShort = 0u,
    public var scId: UInt = 0u,
    public var scUnit: UInt = 0u,
    public var scReserved: UIntArray = UIntArray(5),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SockaddrCtl) return false
        if (this.scLen != other.scLen) return false
        if (this.scFamily != other.scFamily) return false
        if (this.ssSysaddr != other.ssSysaddr) return false
        if (this.scId != other.scId) return false
        if (this.scUnit != other.scUnit) return false
        if (!this.scReserved.contentEquals(other.scReserved)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.scLen.hashCode()
        result = 31 * result + this.scFamily.hashCode()
        result = 31 * result + this.ssSysaddr.hashCode()
        result = 31 * result + this.scId.hashCode()
        result = 31 * result + this.scUnit.hashCode()
        result = 31 * result + this.scReserved.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SockaddrCtl> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SockaddrCtl> {
                override val sizeBytes: Long = 32L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): SockaddrCtl =
                    SockaddrCtl(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 1L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 2L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32, (5).toInt())
                        ).readNative(addr + 12L),
                    )
                override fun writeNative(addr: Long, value: SockaddrCtl) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr, value.scLen)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 1L, value.scFamily)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 2L, value.ssSysaddr)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.scId)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.scUnit)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32, (5).toInt())
                    ).writeNative(addr + 12L, value.scReserved)
                }
            }
    }
}

public data class InPktinfo(
    public var ipiIfindex: CUint = 0u,
    public var ipiSpecDst: InAddr = InAddr(),
    public var ipiAddr: InAddr = InAddr(),
)

public data class In6Pktinfo(
    public var ipi6Addr: In6Addr = In6Addr(),
    public var ipi6Ifindex: CUint = 0u,
)

// sys/ipc.h:
public data class IpcPerm(
    public var uid: UidT = 0u,
    public var gid: GidT = 0u,
    public var cuid: UidT = 0u,
    public var cgid: GidT = 0u,
    public var mode: ModeT = 0u,
    public var seq: CUshort = 0u,
    public var key: KeyT = 0,
)

// sys/sem.h
public data class Sembuf(
    public var semNum: CUshort = 0u,
    public var semOp: CShort = 0,
    public var semFlg: CShort = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Sembuf> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Sembuf> {
                override val sizeBytes: Long = 6L
                override val alignBytes: Long = 2L
                override fun readNative(addr: Long): Sembuf =
                    Sembuf(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).readNative(addr + 2L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: Sembuf) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.semNum)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).writeNative(addr + 2L, value.semOp)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).writeNative(addr + 4L, value.semFlg)
                }
            }
    }
}

// sys/shm.h
public data class Arphdr(
    public var arHrd: UShort = 0u,
    public var arPro: UShort = 0u,
    public var arHln: UByte = 0u,
    public var arPln: UByte = 0u,
    public var arOp: UShort = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Arphdr> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Arphdr> {
                override val sizeBytes: Long = 8L
                override val alignBytes: Long = 2L
                override fun readNative(addr: Long): Arphdr =
                    Arphdr(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 2L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 5L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 6L),
                    )
                override fun writeNative(addr: Long, value: Arphdr) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.arHrd)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 2L, value.arPro)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 4L, value.arHln)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 5L, value.arPln)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 6L, value.arOp)
                }
            }
    }
}

public data class InAddr(
    public var sAddr: InAddrT = 0u,
)

// net/ndrv.h
public data class SockaddrNdrv(
    public var sndLen: CUchar = 0u,
    public var sndFamily: CUchar = 0u,
    public var sndName: UByteArray = UByteArray(IFNAMSIZ.toInt()),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SockaddrNdrv) return false
        if (this.sndLen != other.sndLen) return false
        if (this.sndFamily != other.sndFamily) return false
        if (!this.sndName.contentEquals(other.sndName)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.sndLen.hashCode()
        result = 31 * result + this.sndFamily.hashCode()
        result = 31 * result + this.sndName.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SockaddrNdrv> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SockaddrNdrv> {
                override val sizeBytes: Long =
                    io.github.kotlinmania.rustlang.core.mem
                        .alignUpBytes(
                            (
                                io.github.kotlinmania.rustlang.core.mem
                                    .alignUpBytes(2L, 1L) + ((IFNAMSIZ).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).strideBytes)
                            ),
                            1L,
                        )
                override val alignBytes: Long = 1L
                override fun readNative(addr: Long): SockaddrNdrv =
                    SockaddrNdrv(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 1L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (IFNAMSIZ).toInt())
                        ).readNative(
                            addr +
                                io.github.kotlinmania.rustlang.core.mem
                                    .alignUpBytes(2L, 1L),
                        ),
                    )
                override fun writeNative(addr: Long, value: SockaddrNdrv) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr, value.sndLen)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 1L, value.sndFamily)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (IFNAMSIZ).toInt())
                    ).writeNative(
                        addr +
                            io.github.kotlinmania.rustlang.core.mem
                                .alignUpBytes(2L, 1L),
                        value.sndName,
                    )
                }
            }
    }
}

// sys/socket.h
public class SaEndpointsT internal constructor(
    public var saeSrcif: CUint,
    saeSrcaddrCtorArg: ConstPtr<Sockaddr>,
    // optional source address
    public var saeSrcaddrlen: SocklenT,
    saeDstaddrCtorArg: ConstPtr<Sockaddr>,
    // destination address
    public var saeDstaddrlen: SocklenT,
) {
    // optional source interface
    public var saeSrcaddr: ConstPtr<Sockaddr> = saeSrcaddrCtorArg
        internal set

    // size of source address
    public var saeDstaddr: ConstPtr<Sockaddr> = saeDstaddrCtorArg
        internal set

    public constructor() : this(
        saeSrcif = 0u,
        saeSrcaddrCtorArg = ConstPtr(0L),
        saeSrcaddrlen = 0u,
        saeDstaddrCtorArg = ConstPtr(0L),
        saeDstaddrlen = 0u,
    )

    public operator fun component1(): CUint = this.saeSrcif

    public operator fun component2(): ConstPtr<Sockaddr> = this.saeSrcaddr

    public operator fun component3(): SocklenT = this.saeSrcaddrlen

    public operator fun component4(): ConstPtr<Sockaddr> = this.saeDstaddr

    public operator fun component5(): SocklenT = this.saeDstaddrlen

    public fun copy(saeSrcif: CUint = this.saeSrcif, saeSrcaddr: ConstPtr<Sockaddr> = this.saeSrcaddr, saeSrcaddrlen: SocklenT = this.saeSrcaddrlen, saeDstaddr: ConstPtr<Sockaddr> = this.saeDstaddr, saeDstaddrlen: SocklenT = this.saeDstaddrlen): SaEndpointsT = SaEndpointsT(saeSrcif = saeSrcif, saeSrcaddrCtorArg = saeSrcaddr, saeSrcaddrlen = saeSrcaddrlen, saeDstaddrCtorArg = saeDstaddr, saeDstaddrlen = saeDstaddrlen)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SaEndpointsT) return false
        if (this.saeSrcif != other.saeSrcif) return false
        if (this.saeSrcaddr != other.saeSrcaddr) return false
        if (this.saeSrcaddrlen != other.saeSrcaddrlen) return false
        if (this.saeDstaddr != other.saeDstaddr) return false
        if (this.saeDstaddrlen != other.saeDstaddrlen) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.saeSrcif.hashCode()
        result = 31 * result + this.saeSrcaddr.hashCode()
        result = 31 * result + this.saeSrcaddrlen.hashCode()
        result = 31 * result + this.saeDstaddr.hashCode()
        result = 31 * result + this.saeDstaddrlen.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            saeSrcif: CUint = 0u,
            saeSrcaddr: ConstPtr<Sockaddr> = ConstPtr(0L),
            saeSrcaddrlen: SocklenT = 0u,
            saeDstaddr: ConstPtr<Sockaddr> = ConstPtr(0L),
            saeDstaddrlen: SocklenT = 0u,
        ): SaEndpointsT =
            SaEndpointsT(
                saeSrcif = saeSrcif,
                saeSrcaddrCtorArg = saeSrcaddr,
                saeSrcaddrlen = saeSrcaddrlen,
                saeDstaddrCtorArg = saeDstaddr,
                saeDstaddrlen = saeDstaddrlen,
            )
    }
}

public class Timex(
    public var modes: CUint = 0u,
    public var offset: CLong = 0L,
    public var freq: CLong = 0L,
    public var maxerror: CLong = 0L,
    public var esterror: CLong = 0L,
    public var status: CInt = 0,
    public var constant: CLong = 0L,
    public var precision: CLong = 0L,
    public var tolerance: CLong = 0L,
    public var ppsfreq: CLong = 0L,
    public var jitter: CLong = 0L,
    public var shift: CInt = 0,
    public var stabil: CLong = 0L,
    public var jitcnt: CLong = 0L,
    public var calcnt: CLong = 0L,
    public var errcnt: CLong = 0L,
    public var stbcnt: CLong = 0L,
)

public data class Ntptimeval(
    public var time: Timespec = Timespec(),
    public var maxerror: CLong = 0L,
    public var esterror: CLong = 0L,
    public var tai: CLong = 0L,
    public var timeState: CInt = 0,
)

public data class ThreadStandardPolicy(
    public var noData: NaturalT = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ThreadStandardPolicy> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ThreadStandardPolicy> {
                override val sizeBytes: Long = 4L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): ThreadStandardPolicy =
                    ThreadStandardPolicy(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: ThreadStandardPolicy) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.noData)
                }
            }
    }
}

public data class ThreadExtendedPolicy(
    public var timeshare: BooleanT = 0,
)

public data class ThreadTimeConstraintPolicy(
    public var period: UInt = 0u,
    public var computation: UInt = 0u,
    public var constraint: UInt = 0u,
    public var preemptible: BooleanT = 0,
)

public data class ThreadPrecedencePolicy(
    public var importance: IntegerT = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ThreadPrecedencePolicy> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ThreadPrecedencePolicy> {
                override val sizeBytes: Long = 4L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): ThreadPrecedencePolicy =
                    ThreadPrecedencePolicy(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: ThreadPrecedencePolicy) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.importance)
                }
            }
    }
}

public data class ThreadAffinityPolicy(
    public var affinityTag: IntegerT = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ThreadAffinityPolicy> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ThreadAffinityPolicy> {
                override val sizeBytes: Long = 4L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): ThreadAffinityPolicy =
                    ThreadAffinityPolicy(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: ThreadAffinityPolicy) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.affinityTag)
                }
            }
    }
}

public data class ThreadBackgroundPolicy(
    public var priority: IntegerT = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ThreadBackgroundPolicy> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ThreadBackgroundPolicy> {
                override val sizeBytes: Long = 4L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): ThreadBackgroundPolicy =
                    ThreadBackgroundPolicy(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: ThreadBackgroundPolicy) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.priority)
                }
            }
    }
}

public data class ThreadLatencyQosPolicy(
    public var threadLatencyQosTier: ThreadLatencyQosT = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ThreadLatencyQosPolicy> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ThreadLatencyQosPolicy> {
                override val sizeBytes: Long = 4L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): ThreadLatencyQosPolicy =
                    ThreadLatencyQosPolicy(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: ThreadLatencyQosPolicy) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.threadLatencyQosTier)
                }
            }
    }
}

public data class ThreadThroughputQosPolicy(
    public var threadThroughputQosTier: ThreadThroughputQosT = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ThreadThroughputQosPolicy> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ThreadThroughputQosPolicy> {
                override val sizeBytes: Long = 4L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): ThreadThroughputQosPolicy =
                    ThreadThroughputQosPolicy(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: ThreadThroughputQosPolicy) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.threadThroughputQosTier)
                }
            }
    }
}

// malloc/malloc.h
public data class MallocStatisticsT(
    public var blocksInUse: CUint = 0u,
    public var sizeInUse: SizeT = 0uL,
    public var maxSizeInUse: SizeT = 0uL,
    public var sizeAllocated: SizeT = 0uL,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<MallocStatisticsT> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<MallocStatisticsT> {
                override val sizeBytes: Long = 32L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): MallocStatisticsT =
                    MallocStatisticsT(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).readNative(addr + 24L),
                    )
                override fun writeNative(addr: Long, value: MallocStatisticsT) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.blocksInUse)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).writeNative(addr + 8L, value.sizeInUse)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).writeNative(addr + 16L, value.maxSizeInUse)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).writeNative(addr + 24L, value.sizeAllocated)
                }
            }
    }
}

public data class Mstats(
    public var bytesTotal: SizeT = 0uL,
    public var chunksUsed: SizeT = 0uL,
    public var bytesUsed: SizeT = 0uL,
    public var chunksFree: SizeT = 0uL,
    public var bytesFree: SizeT = 0uL,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Mstats> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Mstats> {
                override val sizeBytes: Long = 40L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): Mstats =
                    Mstats(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).readNative(addr + 32L),
                    )
                override fun writeNative(addr: Long, value: Mstats) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).writeNative(addr, value.bytesTotal)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).writeNative(addr + 8L, value.chunksUsed)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).writeNative(addr + 16L, value.bytesUsed)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).writeNative(addr + 24L, value.chunksFree)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).writeNative(addr + 32L, value.bytesFree)
                }
            }
    }
}

public data class VmRangeT(
    public var address: VmAddressT = 0uL,
    public var size: VmSizeT = 0uL,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<VmRangeT> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<VmRangeT> {
                override val sizeBytes: Long = 16L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): VmRangeT =
                    VmRangeT(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: VmRangeT) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).writeNative(addr, value.address)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).writeNative(addr + 8L, value.size)
                }
            }
    }
}

public class VinfoStat(
    public var vstDev: UInt = 0u,
    public var vstMode: UShort = 0u,
    public var vstNlink: UShort = 0u,
    public var vstIno: ULong = 0uL,
    public var vstUid: UidT = 0u,
    public var vstGid: GidT = 0u,
    public var vstAtime: Long = 0L,
    public var vstAtimensec: Long = 0L,
    public var vstMtime: Long = 0L,
    public var vstMtimensec: Long = 0L,
    public var vstCtime: Long = 0L,
    public var vstCtimensec: Long = 0L,
    public var vstBirthtime: Long = 0L,
    public var vstBirthtimensec: Long = 0L,
    public var vstSize: OffT = 0L,
    public var vstBlocks: Long = 0L,
    public var vstBlksize: Int = 0,
    public var vstFlags: UInt = 0u,
    public var vstGen: UInt = 0u,
    public var vstRdev: UInt = 0u,
    public var vstQspare: LongArray = LongArray(2),
)

public data class VnodeInfo(
    public var viStat: VinfoStat = VinfoStat(),
    public var viType: CInt = 0,
    public var viPad: CInt = 0,
    public var viFsid: FsidT = FsidT(),
)

public data class VnodeInfoPath(
    public var vipVi: VnodeInfo = VnodeInfo(),
    // Normally it's `vipPath: [cChar; MAXPATHLEN]` but because libc supports an old rustc
    // version, we go around this limitation like this.
    public var vipPath: List<UByteArray> = List(32) { UByteArray(0) },
)

public data class ProcVnodepathinfo(
    public var pviCdir: VnodeInfoPath = VnodeInfoPath(),
    public var pviRdir: VnodeInfoPath = VnodeInfoPath(),
)

public data class VmStatistics(
    public var freeCount: NaturalT = 0u,
    public var activeCount: NaturalT = 0u,
    public var inactiveCount: NaturalT = 0u,
    public var wireCount: NaturalT = 0u,
    public var zeroFillCount: NaturalT = 0u,
    public var reactivations: NaturalT = 0u,
    public var pageins: NaturalT = 0u,
    public var pageouts: NaturalT = 0u,
    public var faults: NaturalT = 0u,
    public var cowFaults: NaturalT = 0u,
    public var lookups: NaturalT = 0u,
    public var hits: NaturalT = 0u,
    public var purgeableCount: NaturalT = 0u,
    public var purges: NaturalT = 0u,
    public var speculativeCount: NaturalT = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<VmStatistics> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<VmStatistics> {
                override val sizeBytes: Long = 60L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): VmStatistics =
                    VmStatistics(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 20L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 28L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 32L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 36L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 40L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 44L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 48L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 52L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 56L),
                    )
                override fun writeNative(addr: Long, value: VmStatistics) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.freeCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.activeCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.inactiveCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.wireCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.zeroFillCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.reactivations)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 24L, value.pageins)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 28L, value.pageouts)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 32L, value.faults)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 36L, value.cowFaults)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 40L, value.lookups)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 44L, value.hits)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 48L, value.purgeableCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 52L, value.purges)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 56L, value.speculativeCount)
                }
            }
    }
}

public data class TaskThreadTimesInfo(
    public var userTime: TimeValueT = TimeValueT(),
    public var systemTime: TimeValueT = TimeValueT(),
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<TaskThreadTimesInfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<TaskThreadTimesInfo> {
                override val sizeBytes: Long = 16L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): TaskThreadTimesInfo =
                    TaskThreadTimesInfo(
                        (TimeValueT.typeLayout()).readNative(addr),
                        (TimeValueT.typeLayout()).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: TaskThreadTimesInfo) {
                    (TimeValueT.typeLayout()).writeNative(addr, value.userTime)
                    (TimeValueT.typeLayout()).writeNative(addr + 8L, value.systemTime)
                }
            }
    }
}

public data class RusageInfoV0(
    public var riUuid: UByteArray = UByteArray(16),
    public var riUserTime: ULong = 0uL,
    public var riSystemTime: ULong = 0uL,
    public var riPkgIdleWkups: ULong = 0uL,
    public var riInterruptWkups: ULong = 0uL,
    public var riPageins: ULong = 0uL,
    public var riWiredSize: ULong = 0uL,
    public var riResidentSize: ULong = 0uL,
    public var riPhysFootprint: ULong = 0uL,
    public var riProcStartAbstime: ULong = 0uL,
    public var riProcExitAbstime: ULong = 0uL,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is RusageInfoV0) return false
        if (!this.riUuid.contentEquals(other.riUuid)) return false
        if (this.riUserTime != other.riUserTime) return false
        if (this.riSystemTime != other.riSystemTime) return false
        if (this.riPkgIdleWkups != other.riPkgIdleWkups) return false
        if (this.riInterruptWkups != other.riInterruptWkups) return false
        if (this.riPageins != other.riPageins) return false
        if (this.riWiredSize != other.riWiredSize) return false
        if (this.riResidentSize != other.riResidentSize) return false
        if (this.riPhysFootprint != other.riPhysFootprint) return false
        if (this.riProcStartAbstime != other.riProcStartAbstime) return false
        if (this.riProcExitAbstime != other.riProcExitAbstime) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.riUuid.contentHashCode()
        result = 31 * result + this.riUserTime.hashCode()
        result = 31 * result + this.riSystemTime.hashCode()
        result = 31 * result + this.riPkgIdleWkups.hashCode()
        result = 31 * result + this.riInterruptWkups.hashCode()
        result = 31 * result + this.riPageins.hashCode()
        result = 31 * result + this.riWiredSize.hashCode()
        result = 31 * result + this.riResidentSize.hashCode()
        result = 31 * result + this.riPhysFootprint.hashCode()
        result = 31 * result + this.riProcStartAbstime.hashCode()
        result = 31 * result + this.riProcExitAbstime.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<RusageInfoV0> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<RusageInfoV0> {
                override val sizeBytes: Long = 96L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): RusageInfoV0 =
                    RusageInfoV0(
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (16).toInt())
                        ).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 32L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 40L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 48L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 56L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 64L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 72L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 80L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 88L),
                    )
                override fun writeNative(addr: Long, value: RusageInfoV0) {
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (16).toInt())
                    ).writeNative(addr, value.riUuid)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 16L, value.riUserTime)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 24L, value.riSystemTime)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 32L, value.riPkgIdleWkups)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 40L, value.riInterruptWkups)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 48L, value.riPageins)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 56L, value.riWiredSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 64L, value.riResidentSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 72L, value.riPhysFootprint)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 80L, value.riProcStartAbstime)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 88L, value.riProcExitAbstime)
                }
            }
    }
}

public class RusageInfoV1(
    public var riUuid: UByteArray = UByteArray(16),
    public var riUserTime: ULong = 0uL,
    public var riSystemTime: ULong = 0uL,
    public var riPkgIdleWkups: ULong = 0uL,
    public var riInterruptWkups: ULong = 0uL,
    public var riPageins: ULong = 0uL,
    public var riWiredSize: ULong = 0uL,
    public var riResidentSize: ULong = 0uL,
    public var riPhysFootprint: ULong = 0uL,
    public var riProcStartAbstime: ULong = 0uL,
    public var riProcExitAbstime: ULong = 0uL,
    public var riChildUserTime: ULong = 0uL,
    public var riChildSystemTime: ULong = 0uL,
    public var riChildPkgIdleWkups: ULong = 0uL,
    public var riChildInterruptWkups: ULong = 0uL,
    public var riChildPageins: ULong = 0uL,
    public var riChildElapsedAbstime: ULong = 0uL,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<RusageInfoV1> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<RusageInfoV1> {
                override val sizeBytes: Long = 144L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): RusageInfoV1 =
                    RusageInfoV1(
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (16).toInt())
                        ).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 32L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 40L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 48L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 56L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 64L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 72L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 80L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 88L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 96L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 104L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 112L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 120L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 128L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 136L),
                    )
                override fun writeNative(addr: Long, value: RusageInfoV1) {
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (16).toInt())
                    ).writeNative(addr, value.riUuid)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 16L, value.riUserTime)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 24L, value.riSystemTime)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 32L, value.riPkgIdleWkups)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 40L, value.riInterruptWkups)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 48L, value.riPageins)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 56L, value.riWiredSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 64L, value.riResidentSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 72L, value.riPhysFootprint)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 80L, value.riProcStartAbstime)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 88L, value.riProcExitAbstime)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 96L, value.riChildUserTime)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 104L, value.riChildSystemTime)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 112L, value.riChildPkgIdleWkups)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 120L, value.riChildInterruptWkups)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 128L, value.riChildPageins)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 136L, value.riChildElapsedAbstime)
                }
            }
    }
}

public class RusageInfoV2(
    public var riUuid: UByteArray = UByteArray(16),
    public var riUserTime: ULong = 0uL,
    public var riSystemTime: ULong = 0uL,
    public var riPkgIdleWkups: ULong = 0uL,
    public var riInterruptWkups: ULong = 0uL,
    public var riPageins: ULong = 0uL,
    public var riWiredSize: ULong = 0uL,
    public var riResidentSize: ULong = 0uL,
    public var riPhysFootprint: ULong = 0uL,
    public var riProcStartAbstime: ULong = 0uL,
    public var riProcExitAbstime: ULong = 0uL,
    public var riChildUserTime: ULong = 0uL,
    public var riChildSystemTime: ULong = 0uL,
    public var riChildPkgIdleWkups: ULong = 0uL,
    public var riChildInterruptWkups: ULong = 0uL,
    public var riChildPageins: ULong = 0uL,
    public var riChildElapsedAbstime: ULong = 0uL,
    public var riDiskioBytesread: ULong = 0uL,
    public var riDiskioByteswritten: ULong = 0uL,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<RusageInfoV2> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<RusageInfoV2> {
                override val sizeBytes: Long = 160L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): RusageInfoV2 =
                    RusageInfoV2(
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (16).toInt())
                        ).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 32L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 40L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 48L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 56L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 64L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 72L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 80L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 88L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 96L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 104L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 112L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 120L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 128L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 136L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 144L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 152L),
                    )
                override fun writeNative(addr: Long, value: RusageInfoV2) {
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (16).toInt())
                    ).writeNative(addr, value.riUuid)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 16L, value.riUserTime)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 24L, value.riSystemTime)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 32L, value.riPkgIdleWkups)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 40L, value.riInterruptWkups)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 48L, value.riPageins)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 56L, value.riWiredSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 64L, value.riResidentSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 72L, value.riPhysFootprint)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 80L, value.riProcStartAbstime)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 88L, value.riProcExitAbstime)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 96L, value.riChildUserTime)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 104L, value.riChildSystemTime)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 112L, value.riChildPkgIdleWkups)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 120L, value.riChildInterruptWkups)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 128L, value.riChildPageins)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 136L, value.riChildElapsedAbstime)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 144L, value.riDiskioBytesread)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 152L, value.riDiskioByteswritten)
                }
            }
    }
}

public class RusageInfoV3(
    public var riUuid: UByteArray = UByteArray(16),
    public var riUserTime: ULong = 0uL,
    public var riSystemTime: ULong = 0uL,
    public var riPkgIdleWkups: ULong = 0uL,
    public var riInterruptWkups: ULong = 0uL,
    public var riPageins: ULong = 0uL,
    public var riWiredSize: ULong = 0uL,
    public var riResidentSize: ULong = 0uL,
    public var riPhysFootprint: ULong = 0uL,
    public var riProcStartAbstime: ULong = 0uL,
    public var riProcExitAbstime: ULong = 0uL,
    public var riChildUserTime: ULong = 0uL,
    public var riChildSystemTime: ULong = 0uL,
    public var riChildPkgIdleWkups: ULong = 0uL,
    public var riChildInterruptWkups: ULong = 0uL,
    public var riChildPageins: ULong = 0uL,
    public var riChildElapsedAbstime: ULong = 0uL,
    public var riDiskioBytesread: ULong = 0uL,
    public var riDiskioByteswritten: ULong = 0uL,
    public var riCpuTimeQosDefault: ULong = 0uL,
    public var riCpuTimeQosMaintenance: ULong = 0uL,
    public var riCpuTimeQosBackground: ULong = 0uL,
    public var riCpuTimeQosUtility: ULong = 0uL,
    public var riCpuTimeQosLegacy: ULong = 0uL,
    public var riCpuTimeQosUserInitiated: ULong = 0uL,
    public var riCpuTimeQosUserInteractive: ULong = 0uL,
    public var riBilledSystemTime: ULong = 0uL,
    public var riServicedSystemTime: ULong = 0uL,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<RusageInfoV3> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<RusageInfoV3> {
                override val sizeBytes: Long = 232L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): RusageInfoV3 =
                    RusageInfoV3(
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (16).toInt())
                        ).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 32L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 40L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 48L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 56L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 64L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 72L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 80L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 88L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 96L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 104L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 112L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 120L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 128L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 136L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 144L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 152L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 160L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 168L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 176L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 184L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 192L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 200L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 208L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 216L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 224L),
                    )
                override fun writeNative(addr: Long, value: RusageInfoV3) {
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (16).toInt())
                    ).writeNative(addr, value.riUuid)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 16L, value.riUserTime)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 24L, value.riSystemTime)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 32L, value.riPkgIdleWkups)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 40L, value.riInterruptWkups)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 48L, value.riPageins)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 56L, value.riWiredSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 64L, value.riResidentSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 72L, value.riPhysFootprint)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 80L, value.riProcStartAbstime)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 88L, value.riProcExitAbstime)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 96L, value.riChildUserTime)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 104L, value.riChildSystemTime)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 112L, value.riChildPkgIdleWkups)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 120L, value.riChildInterruptWkups)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 128L, value.riChildPageins)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 136L, value.riChildElapsedAbstime)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 144L, value.riDiskioBytesread)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 152L, value.riDiskioByteswritten)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 160L, value.riCpuTimeQosDefault)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 168L, value.riCpuTimeQosMaintenance)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 176L, value.riCpuTimeQosBackground)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 184L, value.riCpuTimeQosUtility)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 192L, value.riCpuTimeQosLegacy)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 200L, value.riCpuTimeQosUserInitiated)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 208L, value.riCpuTimeQosUserInteractive)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 216L, value.riBilledSystemTime)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 224L, value.riServicedSystemTime)
                }
            }
    }
}

public class RusageInfoV4(
    public var riUuid: UByteArray = UByteArray(16),
    public var riUserTime: ULong = 0uL,
    public var riSystemTime: ULong = 0uL,
    public var riPkgIdleWkups: ULong = 0uL,
    public var riInterruptWkups: ULong = 0uL,
    public var riPageins: ULong = 0uL,
    public var riWiredSize: ULong = 0uL,
    public var riResidentSize: ULong = 0uL,
    public var riPhysFootprint: ULong = 0uL,
    public var riProcStartAbstime: ULong = 0uL,
    public var riProcExitAbstime: ULong = 0uL,
    public var riChildUserTime: ULong = 0uL,
    public var riChildSystemTime: ULong = 0uL,
    public var riChildPkgIdleWkups: ULong = 0uL,
    public var riChildInterruptWkups: ULong = 0uL,
    public var riChildPageins: ULong = 0uL,
    public var riChildElapsedAbstime: ULong = 0uL,
    public var riDiskioBytesread: ULong = 0uL,
    public var riDiskioByteswritten: ULong = 0uL,
    public var riCpuTimeQosDefault: ULong = 0uL,
    public var riCpuTimeQosMaintenance: ULong = 0uL,
    public var riCpuTimeQosBackground: ULong = 0uL,
    public var riCpuTimeQosUtility: ULong = 0uL,
    public var riCpuTimeQosLegacy: ULong = 0uL,
    public var riCpuTimeQosUserInitiated: ULong = 0uL,
    public var riCpuTimeQosUserInteractive: ULong = 0uL,
    public var riBilledSystemTime: ULong = 0uL,
    public var riServicedSystemTime: ULong = 0uL,
    public var riLogicalWrites: ULong = 0uL,
    public var riLifetimeMaxPhysFootprint: ULong = 0uL,
    public var riInstructions: ULong = 0uL,
    public var riCycles: ULong = 0uL,
    public var riBilledEnergy: ULong = 0uL,
    public var riServicedEnergy: ULong = 0uL,
    public var riIntervalMaxPhysFootprint: ULong = 0uL,
    public var riRunnableTime: ULong = 0uL,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<RusageInfoV4> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<RusageInfoV4> {
                override val sizeBytes: Long = 296L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): RusageInfoV4 =
                    RusageInfoV4(
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (16).toInt())
                        ).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 32L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 40L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 48L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 56L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 64L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 72L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 80L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 88L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 96L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 104L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 112L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 120L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 128L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 136L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 144L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 152L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 160L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 168L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 176L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 184L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 192L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 200L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 208L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 216L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 224L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 232L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 240L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 248L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 256L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 264L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 272L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 280L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 288L),
                    )
                override fun writeNative(addr: Long, value: RusageInfoV4) {
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (16).toInt())
                    ).writeNative(addr, value.riUuid)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 16L, value.riUserTime)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 24L, value.riSystemTime)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 32L, value.riPkgIdleWkups)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 40L, value.riInterruptWkups)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 48L, value.riPageins)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 56L, value.riWiredSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 64L, value.riResidentSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 72L, value.riPhysFootprint)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 80L, value.riProcStartAbstime)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 88L, value.riProcExitAbstime)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 96L, value.riChildUserTime)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 104L, value.riChildSystemTime)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 112L, value.riChildPkgIdleWkups)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 120L, value.riChildInterruptWkups)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 128L, value.riChildPageins)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 136L, value.riChildElapsedAbstime)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 144L, value.riDiskioBytesread)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 152L, value.riDiskioByteswritten)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 160L, value.riCpuTimeQosDefault)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 168L, value.riCpuTimeQosMaintenance)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 176L, value.riCpuTimeQosBackground)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 184L, value.riCpuTimeQosUtility)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 192L, value.riCpuTimeQosLegacy)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 200L, value.riCpuTimeQosUserInitiated)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 208L, value.riCpuTimeQosUserInteractive)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 216L, value.riBilledSystemTime)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 224L, value.riServicedSystemTime)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 232L, value.riLogicalWrites)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 240L, value.riLifetimeMaxPhysFootprint)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 248L, value.riInstructions)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 256L, value.riCycles)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 264L, value.riBilledEnergy)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 272L, value.riServicedEnergy)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 280L, value.riIntervalMaxPhysFootprint)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 288L, value.riRunnableTime)
                }
            }
    }
}

public data class ImageOffset(
    public var uuid: UuidT = UByteArray(16),
    public var offset: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ImageOffset) return false
        if (!this.uuid.contentEquals(other.uuid)) return false
        if (this.offset != other.offset) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.uuid.contentHashCode()
        result = 31 * result + this.offset.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ImageOffset> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ImageOffset> {
                override val sizeBytes: Long = 20L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): ImageOffset =
                    ImageOffset(
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (16).toInt())
                        ).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: ImageOffset) {
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (16).toInt())
                    ).writeNative(addr, value.uuid)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.offset)
                }
            }
    }
}

public data class Attrlist(
    public var bitmapcount: CUshort = 0u,
    public var reserved: UShort = 0u,
    public var commonattr: AttrgroupT = 0u,
    public var volattr: AttrgroupT = 0u,
    public var dirattr: AttrgroupT = 0u,
    public var fileattr: AttrgroupT = 0u,
    public var forkattr: AttrgroupT = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Attrlist> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Attrlist> {
                override val sizeBytes: Long = 24L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): Attrlist =
                    Attrlist(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 2L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 20L),
                    )
                override fun writeNative(addr: Long, value: Attrlist) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.bitmapcount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 2L, value.reserved)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.commonattr)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.volattr)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.dirattr)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.fileattr)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.forkattr)
                }
            }
    }
}

public data class AttrreferenceT(
    public var attrDataoffset: Int = 0,
    public var attrLength: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<AttrreferenceT> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<AttrreferenceT> {
                override val sizeBytes: Long = 8L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): AttrreferenceT =
                    AttrreferenceT(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: AttrreferenceT) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.attrDataoffset)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.attrLength)
                }
            }
    }
}

public data class VolCapabilitiesAttrT(
    public var capabilities: VolCapabilitiesSetT = UIntArray(4),
    public var valid: VolCapabilitiesSetT = UIntArray(4),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is VolCapabilitiesAttrT) return false
        if (!this.capabilities.contentEquals(other.capabilities)) return false
        if (!this.valid.contentEquals(other.valid)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.capabilities.contentHashCode()
        result = 31 * result + this.valid.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<VolCapabilitiesAttrT> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<VolCapabilitiesAttrT> {
                override val sizeBytes: Long = 32L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): VolCapabilitiesAttrT =
                    VolCapabilitiesAttrT(
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32, (4).toInt())
                        ).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32, (4).toInt())
                        ).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: VolCapabilitiesAttrT) {
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32, (4).toInt())
                    ).writeNative(addr, value.capabilities)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32, (4).toInt())
                    ).writeNative(addr + 16L, value.valid)
                }
            }
    }
}

public data class AttributeSetT(
    public var commonattr: AttrgroupT = 0u,
    public var volattr: AttrgroupT = 0u,
    public var dirattr: AttrgroupT = 0u,
    public var fileattr: AttrgroupT = 0u,
    public var forkattr: AttrgroupT = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<AttributeSetT> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<AttributeSetT> {
                override val sizeBytes: Long = 20L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): AttributeSetT =
                    AttributeSetT(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: AttributeSetT) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.commonattr)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.volattr)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.dirattr)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.fileattr)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.forkattr)
                }
            }
    }
}

public data class VolAttributesAttrT(
    public var validattr: AttributeSetT = AttributeSetT(),
    public var nativeattr: AttributeSetT = AttributeSetT(),
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<VolAttributesAttrT> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<VolAttributesAttrT> {
                override val sizeBytes: Long = 40L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): VolAttributesAttrT =
                    VolAttributesAttrT(
                        (AttributeSetT.typeLayout()).readNative(addr),
                        (AttributeSetT.typeLayout()).readNative(addr + 20L),
                    )
                override fun writeNative(addr: Long, value: VolAttributesAttrT) {
                    (AttributeSetT.typeLayout()).writeNative(addr, value.validattr)
                    (AttributeSetT.typeLayout()).writeNative(addr + 20L, value.nativeattr)
                }
            }
    }
}

public class TcpConnectionInfo(
    public var tcpiState: UByte = 0u,
    public var tcpiSndWscale: UByte = 0u,
    public var tcpiRcvWscale: UByte = 0u,
    public var pad1: UByte = 0u,
    public var tcpiOptions: UInt = 0u,
    public var tcpiFlags: UInt = 0u,
    public var tcpiRto: UInt = 0u,
    public var tcpiMaxseg: UInt = 0u,
    public var tcpiSndSsthresh: UInt = 0u,
    public var tcpiSndCwnd: UInt = 0u,
    public var tcpiSndWnd: UInt = 0u,
    public var tcpiSndSbbytes: UInt = 0u,
    public var tcpiRcvWnd: UInt = 0u,
    public var tcpiRttcur: UInt = 0u,
    public var tcpiSrtt: UInt = 0u,
    public var tcpiRttvar: UInt = 0u,
    public var tcpiTfoCookieReq: UInt = 0u,
    public var tcpiTfoCookieRcv: UInt = 0u,
    public var tcpiTfoSynLoss: UInt = 0u,
    public var tcpiTfoSynDataSent: UInt = 0u,
    public var tcpiTfoSynDataAcked: UInt = 0u,
    public var tcpiTfoSynDataRcv: UInt = 0u,
    public var tcpiTfoCookieReqRcv: UInt = 0u,
    public var tcpiTfoCookieSent: UInt = 0u,
    public var tcpiTfoCookieInvalid: UInt = 0u,
    public var tcpiTfoCookieWrong: UInt = 0u,
    public var tcpiTfoNoCookieRcv: UInt = 0u,
    public var tcpiTfoHeuristicsDisable: UInt = 0u,
    public var tcpiTfoSendBlackhole: UInt = 0u,
    public var tcpiTfoRecvBlackhole: UInt = 0u,
    public var tcpiTfoOnebyteProxy: UInt = 0u,
    public var pad2: UInt = 0u,
    public var tcpiTxpackets: ULong = 0uL,
    public var tcpiTxbytes: ULong = 0uL,
    public var tcpiTxretransmitbytes: ULong = 0uL,
    public var tcpiRxpackets: ULong = 0uL,
    public var tcpiRxbytes: ULong = 0uL,
    public var tcpiRxoutoforderbytes: ULong = 0uL,
    public var tcpiRxretransmitpackets: ULong = 0uL,
)

public data class In6Addrlifetime(
    public var ia6tExpire: TimeT = 0L,
    public var ia6tPreferred: TimeT = 0L,
    public var ia6tVltime: UInt = 0u,
    public var ia6tPltime: UInt = 0u,
)

public class In6Ifstat(
    public var ifs6InReceive: UQuadT = 0uL,
    public var ifs6InHdrerr: UQuadT = 0uL,
    public var ifs6InToobig: UQuadT = 0uL,
    public var ifs6InNoroute: UQuadT = 0uL,
    public var ifs6InAddrerr: UQuadT = 0uL,
    public var ifs6InProtounknown: UQuadT = 0uL,
    public var ifs6InTruncated: UQuadT = 0uL,
    public var ifs6InDiscard: UQuadT = 0uL,
    public var ifs6InDeliver: UQuadT = 0uL,
    public var ifs6OutForward: UQuadT = 0uL,
    public var ifs6OutRequest: UQuadT = 0uL,
    public var ifs6OutDiscard: UQuadT = 0uL,
    public var ifs6OutFragok: UQuadT = 0uL,
    public var ifs6OutFragfail: UQuadT = 0uL,
    public var ifs6OutFragcreat: UQuadT = 0uL,
    public var ifs6ReassReqd: UQuadT = 0uL,
    public var ifs6ReassOk: UQuadT = 0uL,
    public var ifs6AtmfragRcvd: UQuadT = 0uL,
    public var ifs6ReassFail: UQuadT = 0uL,
    public var ifs6InMcast: UQuadT = 0uL,
    public var ifs6OutMcast: UQuadT = 0uL,
    public var ifs6CantfowardIcmp6: UQuadT = 0uL,
    public var ifs6AddrExpiryCnt: UQuadT = 0uL,
    public var ifs6PfxExpiryCnt: UQuadT = 0uL,
    public var ifs6DefrtrExpiryCnt: UQuadT = 0uL,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<In6Ifstat> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<In6Ifstat> {
                override val sizeBytes: Long = 200L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): In6Ifstat =
                    In6Ifstat(
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
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 88L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 96L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 104L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 112L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 120L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 128L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 136L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 144L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 152L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 160L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 168L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 176L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 184L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 192L),
                    )
                override fun writeNative(addr: Long, value: In6Ifstat) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr, value.ifs6InReceive)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 8L, value.ifs6InHdrerr)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 16L, value.ifs6InToobig)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 24L, value.ifs6InNoroute)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 32L, value.ifs6InAddrerr)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 40L, value.ifs6InProtounknown)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 48L, value.ifs6InTruncated)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 56L, value.ifs6InDiscard)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 64L, value.ifs6InDeliver)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 72L, value.ifs6OutForward)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 80L, value.ifs6OutRequest)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 88L, value.ifs6OutDiscard)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 96L, value.ifs6OutFragok)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 104L, value.ifs6OutFragfail)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 112L, value.ifs6OutFragcreat)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 120L, value.ifs6ReassReqd)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 128L, value.ifs6ReassOk)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 136L, value.ifs6AtmfragRcvd)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 144L, value.ifs6ReassFail)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 152L, value.ifs6InMcast)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 160L, value.ifs6OutMcast)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 168L, value.ifs6CantfowardIcmp6)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 176L, value.ifs6AddrExpiryCnt)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 184L, value.ifs6PfxExpiryCnt)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 192L, value.ifs6DefrtrExpiryCnt)
                }
            }
    }
}

public class Icmp6Ifstat(
    public var ifs6InMsg: UQuadT = 0uL,
    public var ifs6InError: UQuadT = 0uL,
    public var ifs6InDstunreach: UQuadT = 0uL,
    public var ifs6InAdminprohib: UQuadT = 0uL,
    public var ifs6InTimeexceed: UQuadT = 0uL,
    public var ifs6InParamprob: UQuadT = 0uL,
    public var ifs6InPkttoobig: UQuadT = 0uL,
    public var ifs6InEcho: UQuadT = 0uL,
    public var ifs6InEchoreply: UQuadT = 0uL,
    public var ifs6InRoutersolicit: UQuadT = 0uL,
    public var ifs6InRouteradvert: UQuadT = 0uL,
    public var ifs6InNeighborsolicit: UQuadT = 0uL,
    public var ifs6InNeighboradvert: UQuadT = 0uL,
    public var ifs6InRedirect: UQuadT = 0uL,
    public var ifs6InMldquery: UQuadT = 0uL,
    public var ifs6InMldreport: UQuadT = 0uL,
    public var ifs6InMlddone: UQuadT = 0uL,
    public var ifs6OutMsg: UQuadT = 0uL,
    public var ifs6OutError: UQuadT = 0uL,
    public var ifs6OutDstunreach: UQuadT = 0uL,
    public var ifs6OutAdminprohib: UQuadT = 0uL,
    public var ifs6OutTimeexceed: UQuadT = 0uL,
    public var ifs6OutParamprob: UQuadT = 0uL,
    public var ifs6OutPkttoobig: UQuadT = 0uL,
    public var ifs6OutEcho: UQuadT = 0uL,
    public var ifs6OutEchoreply: UQuadT = 0uL,
    public var ifs6OutRoutersolicit: UQuadT = 0uL,
    public var ifs6OutRouteradvert: UQuadT = 0uL,
    public var ifs6OutNeighborsolicit: UQuadT = 0uL,
    public var ifs6OutNeighboradvert: UQuadT = 0uL,
    public var ifs6OutRedirect: UQuadT = 0uL,
    public var ifs6OutMldquery: UQuadT = 0uL,
    public var ifs6OutMldreport: UQuadT = 0uL,
    public var ifs6OutMlddone: UQuadT = 0uL,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Icmp6Ifstat> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Icmp6Ifstat> {
                override val sizeBytes: Long = 272L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): Icmp6Ifstat =
                    Icmp6Ifstat(
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
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 88L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 96L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 104L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 112L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 120L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 128L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 136L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 144L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 152L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 160L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 168L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 176L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 184L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 192L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 200L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 208L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 216L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 224L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 232L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 240L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 248L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 256L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 264L),
                    )
                override fun writeNative(addr: Long, value: Icmp6Ifstat) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr, value.ifs6InMsg)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 8L, value.ifs6InError)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 16L, value.ifs6InDstunreach)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 24L, value.ifs6InAdminprohib)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 32L, value.ifs6InTimeexceed)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 40L, value.ifs6InParamprob)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 48L, value.ifs6InPkttoobig)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 56L, value.ifs6InEcho)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 64L, value.ifs6InEchoreply)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 72L, value.ifs6InRoutersolicit)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 80L, value.ifs6InRouteradvert)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 88L, value.ifs6InNeighborsolicit)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 96L, value.ifs6InNeighboradvert)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 104L, value.ifs6InRedirect)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 112L, value.ifs6InMldquery)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 120L, value.ifs6InMldreport)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 128L, value.ifs6InMlddone)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 136L, value.ifs6OutMsg)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 144L, value.ifs6OutError)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 152L, value.ifs6OutDstunreach)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 160L, value.ifs6OutAdminprohib)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 168L, value.ifs6OutTimeexceed)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 176L, value.ifs6OutParamprob)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 184L, value.ifs6OutPkttoobig)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 192L, value.ifs6OutEcho)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 200L, value.ifs6OutEchoreply)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 208L, value.ifs6OutRoutersolicit)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 216L, value.ifs6OutRouteradvert)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 224L, value.ifs6OutNeighborsolicit)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 232L, value.ifs6OutNeighboradvert)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 240L, value.ifs6OutRedirect)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 248L, value.ifs6OutMldquery)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 256L, value.ifs6OutMldreport)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 264L, value.ifs6OutMlddone)
                }
            }
    }
}

// mach/hostInfo.h

public data class HostCpuLoadInfo(
    public var cpuTicks: UIntArray = UIntArray(CPU_STATE_MAX),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is HostCpuLoadInfo) return false
        if (!this.cpuTicks.contentEquals(other.cpuTicks)) return false
        return true
    }

    override fun hashCode(): Int = this.cpuTicks.contentHashCode()

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<HostCpuLoadInfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<HostCpuLoadInfo> {
                override val sizeBytes: Long =
                    io.github.kotlinmania.rustlang.core.mem
                        .alignUpBytes(((CPU_STATE_MAX).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).strideBytes), 4L)
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): HostCpuLoadInfo =
                    HostCpuLoadInfo(
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32, (CPU_STATE_MAX).toInt())
                        ).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: HostCpuLoadInfo) {
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32, (CPU_STATE_MAX).toInt())
                    ).writeNative(addr, value.cpuTicks)
                }
            }
    }
}

// net/ifMib.h
public data class Ifmibdata(
    /**
     * Name of interface
     */
    public var ifmdName: UByteArray = UByteArray(IFNAMSIZ.toInt()),
    /**
     * Number of promiscuous listeners
     */
    public var ifmdPcount: CUint = 0u,
    /**
     * Interface flags
     */
    public var ifmdFlags: CUint = 0u,
    /**
     * Instantaneous length of send queue
     */
    public var ifmdSndLen: CUint = 0u,
    /**
     * Maximum length of send queue
     */
    public var ifmdSndMaxlen: CUint = 0u,
    /**
     * Number of drops in send queue
     */
    public var ifmdSndDrops: CUint = 0u,
    /**
     * For future expansion
     */
    public var ifmdFiller: UIntArray = UIntArray(4),
    /**
     * Generic information and statistics
     */
    public var ifmdData: IfData64 = IfData64(),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Ifmibdata) return false
        if (!this.ifmdName.contentEquals(other.ifmdName)) return false
        if (this.ifmdPcount != other.ifmdPcount) return false
        if (this.ifmdFlags != other.ifmdFlags) return false
        if (this.ifmdSndLen != other.ifmdSndLen) return false
        if (this.ifmdSndMaxlen != other.ifmdSndMaxlen) return false
        if (this.ifmdSndDrops != other.ifmdSndDrops) return false
        if (!this.ifmdFiller.contentEquals(other.ifmdFiller)) return false
        if (this.ifmdData != other.ifmdData) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.ifmdName.contentHashCode()
        result = 31 * result + this.ifmdPcount.hashCode()
        result = 31 * result + this.ifmdFlags.hashCode()
        result = 31 * result + this.ifmdSndLen.hashCode()
        result = 31 * result + this.ifmdSndMaxlen.hashCode()
        result = 31 * result + this.ifmdSndDrops.hashCode()
        result = 31 * result + this.ifmdFiller.contentHashCode()
        result = 31 * result + this.ifmdData.hashCode()
        return result
    }
}

public data class IfsIso88023(
    public var dot3StatsAlignmentErrors: UInt = 0u,
    public var dot3StatsFCSErrors: UInt = 0u,
    public var dot3StatsSingleCollisionFrames: UInt = 0u,
    public var dot3StatsMultipleCollisionFrames: UInt = 0u,
    public var dot3StatsSQETestErrors: UInt = 0u,
    public var dot3StatsDeferredTransmissions: UInt = 0u,
    public var dot3StatsLateCollisions: UInt = 0u,
    public var dot3StatsExcessiveCollisions: UInt = 0u,
    public var dot3StatsInternalMacTransmitErrors: UInt = 0u,
    public var dot3StatsCarrierSenseErrors: UInt = 0u,
    public var dot3StatsFrameTooLongs: UInt = 0u,
    public var dot3StatsInternalMacReceiveErrors: UInt = 0u,
    public var dot3StatsEtherChipSet: UInt = 0u,
    public var dot3StatsMissedFrames: UInt = 0u,
    public var dot3StatsCollFrequencies: UIntArray = UIntArray(16),
    public var dot3Compliance: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is IfsIso88023) return false
        if (this.dot3StatsAlignmentErrors != other.dot3StatsAlignmentErrors) return false
        if (this.dot3StatsFCSErrors != other.dot3StatsFCSErrors) return false
        if (this.dot3StatsSingleCollisionFrames != other.dot3StatsSingleCollisionFrames) return false
        if (this.dot3StatsMultipleCollisionFrames != other.dot3StatsMultipleCollisionFrames) return false
        if (this.dot3StatsSQETestErrors != other.dot3StatsSQETestErrors) return false
        if (this.dot3StatsDeferredTransmissions != other.dot3StatsDeferredTransmissions) return false
        if (this.dot3StatsLateCollisions != other.dot3StatsLateCollisions) return false
        if (this.dot3StatsExcessiveCollisions != other.dot3StatsExcessiveCollisions) return false
        if (this.dot3StatsInternalMacTransmitErrors != other.dot3StatsInternalMacTransmitErrors) return false
        if (this.dot3StatsCarrierSenseErrors != other.dot3StatsCarrierSenseErrors) return false
        if (this.dot3StatsFrameTooLongs != other.dot3StatsFrameTooLongs) return false
        if (this.dot3StatsInternalMacReceiveErrors != other.dot3StatsInternalMacReceiveErrors) return false
        if (this.dot3StatsEtherChipSet != other.dot3StatsEtherChipSet) return false
        if (this.dot3StatsMissedFrames != other.dot3StatsMissedFrames) return false
        if (!this.dot3StatsCollFrequencies.contentEquals(other.dot3StatsCollFrequencies)) return false
        if (this.dot3Compliance != other.dot3Compliance) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dot3StatsAlignmentErrors.hashCode()
        result = 31 * result + this.dot3StatsFCSErrors.hashCode()
        result = 31 * result + this.dot3StatsSingleCollisionFrames.hashCode()
        result = 31 * result + this.dot3StatsMultipleCollisionFrames.hashCode()
        result = 31 * result + this.dot3StatsSQETestErrors.hashCode()
        result = 31 * result + this.dot3StatsDeferredTransmissions.hashCode()
        result = 31 * result + this.dot3StatsLateCollisions.hashCode()
        result = 31 * result + this.dot3StatsExcessiveCollisions.hashCode()
        result = 31 * result + this.dot3StatsInternalMacTransmitErrors.hashCode()
        result = 31 * result + this.dot3StatsCarrierSenseErrors.hashCode()
        result = 31 * result + this.dot3StatsFrameTooLongs.hashCode()
        result = 31 * result + this.dot3StatsInternalMacReceiveErrors.hashCode()
        result = 31 * result + this.dot3StatsEtherChipSet.hashCode()
        result = 31 * result + this.dot3StatsMissedFrames.hashCode()
        result = 31 * result + this.dot3StatsCollFrequencies.contentHashCode()
        result = 31 * result + this.dot3Compliance.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<IfsIso88023> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<IfsIso88023> {
                override val sizeBytes: Long = 124L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): IfsIso88023 =
                    IfsIso88023(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 20L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 28L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 32L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 36L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 40L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 44L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 48L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 52L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32, (16).toInt())
                        ).readNative(addr + 56L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 120L),
                    )
                override fun writeNative(addr: Long, value: IfsIso88023) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dot3StatsAlignmentErrors)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.dot3StatsFCSErrors)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.dot3StatsSingleCollisionFrames)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.dot3StatsMultipleCollisionFrames)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.dot3StatsSQETestErrors)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.dot3StatsDeferredTransmissions)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 24L, value.dot3StatsLateCollisions)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 28L, value.dot3StatsExcessiveCollisions)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 32L, value.dot3StatsInternalMacTransmitErrors)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 36L, value.dot3StatsCarrierSenseErrors)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 40L, value.dot3StatsFrameTooLongs)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 44L, value.dot3StatsInternalMacReceiveErrors)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 48L, value.dot3StatsEtherChipSet)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 52L, value.dot3StatsMissedFrames)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32, (16).toInt())
                    ).writeNative(addr + 56L, value.dot3StatsCollFrequencies)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 120L, value.dot3Compliance)
                }
            }
    }
}

// kernControl.h
public data class CtlInfo(
    public var ctlId: UInt = 0u,
    public var ctlName: UByteArray = UByteArray(MAX_KCTL_NAME),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CtlInfo) return false
        if (this.ctlId != other.ctlId) return false
        if (!this.ctlName.contentEquals(other.ctlName)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.ctlId.hashCode()
        result = 31 * result + this.ctlName.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<CtlInfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<CtlInfo> {
                override val sizeBytes: Long =
                    io.github.kotlinmania.rustlang.core.mem
                        .alignUpBytes(
                            (
                                io.github.kotlinmania.rustlang.core.mem
                                    .alignUpBytes(4L, 1L) + ((MAX_KCTL_NAME).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8).strideBytes)
                            ),
                            maxOf(4L, 1L),
                        )
                override val alignBytes: Long = maxOf(4L, 1L)
                override fun readNative(addr: Long): CtlInfo =
                    CtlInfo(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (MAX_KCTL_NAME).toInt())
                        ).readNative(
                            addr +
                                io.github.kotlinmania.rustlang.core.mem
                                    .alignUpBytes(4L, 1L),
                        ),
                    )
                override fun writeNative(addr: Long, value: CtlInfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.ctlId)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (MAX_KCTL_NAME).toInt())
                    ).writeNative(
                        addr +
                            io.github.kotlinmania.rustlang.core.mem
                                .alignUpBytes(4L, 1L),
                        value.ctlName,
                    )
                }
            }
    }
}

// sys/procInfo.h
public data class ProcFdinfo(
    public var procFd: Int = 0,
    public var procFdtype: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ProcFdinfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ProcFdinfo> {
                override val sizeBytes: Long = 8L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): ProcFdinfo =
                    ProcFdinfo(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: ProcFdinfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.procFd)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.procFdtype)
                }
            }
    }
}

public class Kevent internal constructor(
    public var ident: UintptrT,
    public var filter: Short,
    public var flags: UShort,
    public var fflags: UInt,
    public var data: IntptrT,
    udataCtorArg: MutPtr<CVoid>,
) {
    public var udata: MutPtr<CVoid> = udataCtorArg
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

    public operator fun component2(): Short = this.filter

    public operator fun component3(): UShort = this.flags

    public operator fun component4(): UInt = this.fflags

    public operator fun component5(): IntptrT = this.data

    public operator fun component6(): MutPtr<CVoid> = this.udata

    public fun copy(ident: UintptrT = this.ident, filter: Short = this.filter, flags: UShort = this.flags, fflags: UInt = this.fflags, data: IntptrT = this.data, udata: MutPtr<CVoid> = this.udata): Kevent = Kevent(ident = ident, filter = filter, flags = flags, fflags = fflags, data = data, udataCtorArg = udata)

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
                override val sizeBytes: Long = 32L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): Kevent =
                    Kevent(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 10L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).readNative(addr + 16L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CVoid>(64)
                        ).readNative(addr + 24L),
                    )
                override fun writeNative(addr: Long, value: Kevent) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).writeNative(addr, value.ident)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).writeNative(addr + 8L, value.filter)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 10L, value.flags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.fflags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.ISIZE64).writeNative(addr + 16L, value.data)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr + 24L, value.udata)
                }
            }

        public operator fun invoke(
            ident: UintptrT = 0uL,
            filter: Short = 0,
            flags: UShort = 0u,
            fflags: UInt = 0u,
            data: IntptrT = 0L,
            udata: MutPtr<CVoid> = MutPtr(0L),
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

public data class SemidDs(
    // Note the manpage shows different types than the system header.
    public var semPerm: IpcPerm = IpcPerm(),
    public var semBase: Int = 0,
    public var semNsems: CUshort = 0u,
    public var semOtime: TimeT = 0L,
    public var semPad1: Int = 0,
    public var semCtime: TimeT = 0L,
    public var semPad2: Int = 0,
    public var semPad3: IntArray = IntArray(4),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SemidDs) return false
        if (this.semPerm != other.semPerm) return false
        if (this.semBase != other.semBase) return false
        if (this.semNsems != other.semNsems) return false
        if (this.semOtime != other.semOtime) return false
        if (this.semPad1 != other.semPad1) return false
        if (this.semCtime != other.semCtime) return false
        if (this.semPad2 != other.semPad2) return false
        if (!this.semPad3.contentEquals(other.semPad3)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.semPerm.hashCode()
        result = 31 * result + this.semBase.hashCode()
        result = 31 * result + this.semNsems.hashCode()
        result = 31 * result + this.semOtime.hashCode()
        result = 31 * result + this.semPad1.hashCode()
        result = 31 * result + this.semCtime.hashCode()
        result = 31 * result + this.semPad2.hashCode()
        result = 31 * result + this.semPad3.contentHashCode()
        return result
    }
}

public class ShmidDs internal constructor(
    public var shmPerm: IpcPerm,
    public var shmSegsz: SizeT,
    public var shmLpid: PidT,
    public var shmCpid: PidT,
    public var shmNattch: ShmattT,
    public var shmAtime: TimeT,
    // Note(macos): 64-bit wrong align => wrong offset
    public var shmDtime: TimeT,
    // Note(macos): 64-bit wrong align => wrong offset
    public var shmCtime: TimeT,
    shmInternalCtorArg: MutPtr<CVoid>,
) {
    // Note(macos): 64-bit wrong align => wrong offset
    // Note: 64-bit wrong align => wrong offset:
    public var shmInternal: MutPtr<CVoid> = shmInternalCtorArg
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

    public operator fun component9(): MutPtr<CVoid> = this.shmInternal

    public fun copy(shmPerm: IpcPerm = this.shmPerm, shmSegsz: SizeT = this.shmSegsz, shmLpid: PidT = this.shmLpid, shmCpid: PidT = this.shmCpid, shmNattch: ShmattT = this.shmNattch, shmAtime: TimeT = this.shmAtime, shmDtime: TimeT = this.shmDtime, shmCtime: TimeT = this.shmCtime, shmInternal: MutPtr<CVoid> = this.shmInternal): ShmidDs = ShmidDs(shmPerm = shmPerm, shmSegsz = shmSegsz, shmLpid = shmLpid, shmCpid = shmCpid, shmNattch = shmNattch, shmAtime = shmAtime, shmDtime = shmDtime, shmCtime = shmCtime, shmInternalCtorArg = shmInternal)

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
            shmInternal: MutPtr<CVoid> = MutPtr(0L),
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

public data class ProcThreadinfo(
    public var pthUserTime: ULong = 0uL,
    public var pthSystemTime: ULong = 0uL,
    public var pthCpuUsage: Int = 0,
    public var pthPolicy: Int = 0,
    public var pthRunState: Int = 0,
    public var pthFlags: Int = 0,
    public var pthSleepTime: Int = 0,
    public var pthCurpri: Int = 0,
    public var pthPriority: Int = 0,
    public var pthMaxpriority: Int = 0,
    public var pthName: UByteArray = UByteArray(MAXTHREADNAMESIZE),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ProcThreadinfo) return false
        if (this.pthUserTime != other.pthUserTime) return false
        if (this.pthSystemTime != other.pthSystemTime) return false
        if (this.pthCpuUsage != other.pthCpuUsage) return false
        if (this.pthPolicy != other.pthPolicy) return false
        if (this.pthRunState != other.pthRunState) return false
        if (this.pthFlags != other.pthFlags) return false
        if (this.pthSleepTime != other.pthSleepTime) return false
        if (this.pthCurpri != other.pthCurpri) return false
        if (this.pthPriority != other.pthPriority) return false
        if (this.pthMaxpriority != other.pthMaxpriority) return false
        if (!this.pthName.contentEquals(other.pthName)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.pthUserTime.hashCode()
        result = 31 * result + this.pthSystemTime.hashCode()
        result = 31 * result + this.pthCpuUsage.hashCode()
        result = 31 * result + this.pthPolicy.hashCode()
        result = 31 * result + this.pthRunState.hashCode()
        result = 31 * result + this.pthFlags.hashCode()
        result = 31 * result + this.pthSleepTime.hashCode()
        result = 31 * result + this.pthCurpri.hashCode()
        result = 31 * result + this.pthPriority.hashCode()
        result = 31 * result + this.pthMaxpriority.hashCode()
        result = 31 * result + this.pthName.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ProcThreadinfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ProcThreadinfo> {
                override val sizeBytes: Long =
                    io.github.kotlinmania.rustlang.core.mem
                        .alignUpBytes(
                            (
                                io.github.kotlinmania.rustlang.core.mem
                                    .alignUpBytes(48L, 1L) + ((MAXTHREADNAMESIZE).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8).strideBytes)
                            ),
                            maxOf(maxOf(8L, 4L), 1L),
                        )
                override val alignBytes: Long = maxOf(maxOf(8L, 4L), 1L)
                override fun readNative(addr: Long): ProcThreadinfo =
                    ProcThreadinfo(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 20L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 28L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 32L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 36L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 40L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 44L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (MAXTHREADNAMESIZE).toInt())
                        ).readNative(
                            addr +
                                io.github.kotlinmania.rustlang.core.mem
                                    .alignUpBytes(48L, 1L),
                        ),
                    )
                override fun writeNative(addr: Long, value: ProcThreadinfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr, value.pthUserTime)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 8L, value.pthSystemTime)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 16L, value.pthCpuUsage)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 20L, value.pthPolicy)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 24L, value.pthRunState)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 28L, value.pthFlags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 32L, value.pthSleepTime)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 36L, value.pthCurpri)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 40L, value.pthPriority)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 44L, value.pthMaxpriority)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (MAXTHREADNAMESIZE).toInt())
                    ).writeNative(
                        addr +
                            io.github.kotlinmania.rustlang.core.mem
                                .alignUpBytes(48L, 1L),
                        value.pthName,
                    )
                }
            }
    }
}

public class Statfs(
    public var fBsize: UInt = 0u,
    public var fIosize: Int = 0,
    public var fBlocks: ULong = 0uL,
    public var fBfree: ULong = 0uL,
    public var fBavail: ULong = 0uL,
    public var fFiles: ULong = 0uL,
    public var fFfree: ULong = 0uL,
    public var fFsid: FsidT = FsidT(),
    public var fOwner: UidT = 0u,
    public var fType: UInt = 0u,
    public var fFlags: UInt = 0u,
    public var fFssubtype: UInt = 0u,
    public var fFstypename: UByteArray = UByteArray(16),
    public var fMntonname: UByteArray = UByteArray(1024),
    public var fMntfromname: UByteArray = UByteArray(1024),
    public var fFlagsExt: UInt = 0u,
    public var fReserved: UIntArray = UIntArray(7),
)

public data class Dirent(
    public var dIno: ULong = 0uL,
    public var dSeekoff: ULong = 0uL,
    public var dReclen: UShort = 0u,
    public var dNamlen: UShort = 0u,
    public var dType: UByte = 0u,
    public var dName: UByteArray = UByteArray(1024),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Dirent) return false
        if (this.dIno != other.dIno) return false
        if (this.dSeekoff != other.dSeekoff) return false
        if (this.dReclen != other.dReclen) return false
        if (this.dNamlen != other.dNamlen) return false
        if (this.dType != other.dType) return false
        if (!this.dName.contentEquals(other.dName)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dIno.hashCode()
        result = 31 * result + this.dSeekoff.hashCode()
        result = 31 * result + this.dReclen.hashCode()
        result = 31 * result + this.dNamlen.hashCode()
        result = 31 * result + this.dType.hashCode()
        result = 31 * result + this.dName.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Dirent> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Dirent> {
                override val sizeBytes: Long = 1048L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): Dirent =
                    Dirent(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 18L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 20L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (1024).toInt())
                        ).readNative(addr + 21L),
                    )
                override fun writeNative(addr: Long, value: Dirent) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr, value.dIno)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 8L, value.dSeekoff)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 16L, value.dReclen)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 18L, value.dNamlen)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 20L, value.dType)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (1024).toInt())
                    ).writeNative(addr + 21L, value.dName)
                }
            }
    }
}

public data class SockaddrStorage(
    public var ssLen: UByte = 0u,
    public var ssFamily: SaFamilyT = 0u,
    public var ssPad1: UByteArray = UByteArray(6),
    public var ssAlign: Long = 0L,
    public var ssPad2: UByteArray = UByteArray(112),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SockaddrStorage) return false
        if (this.ssLen != other.ssLen) return false
        if (this.ssFamily != other.ssFamily) return false
        if (!this.ssPad1.contentEquals(other.ssPad1)) return false
        if (this.ssAlign != other.ssAlign) return false
        if (!this.ssPad2.contentEquals(other.ssPad2)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.ssLen.hashCode()
        result = 31 * result + this.ssFamily.hashCode()
        result = 31 * result + this.ssPad1.contentHashCode()
        result = 31 * result + this.ssAlign.hashCode()
        result = 31 * result + this.ssPad2.contentHashCode()
        return result
    }
}

public data class Utmpx(
    public var utUser: UByteArray = UByteArray(UTX_USERSIZE),
    public var utId: UByteArray = UByteArray(UTX_IDSIZE),
    public var utLine: UByteArray = UByteArray(UTX_LINESIZE),
    public var utPid: PidT = 0,
    public var utType: CShort = 0,
    public var utTv: Timeval = Timeval(),
    public var utHost: UByteArray = UByteArray(UTX_HOSTSIZE),
    public var utPad: UIntArray = UIntArray(16),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Utmpx) return false
        if (!this.utUser.contentEquals(other.utUser)) return false
        if (!this.utId.contentEquals(other.utId)) return false
        if (!this.utLine.contentEquals(other.utLine)) return false
        if (this.utPid != other.utPid) return false
        if (this.utType != other.utType) return false
        if (this.utTv != other.utTv) return false
        if (!this.utHost.contentEquals(other.utHost)) return false
        if (!this.utPad.contentEquals(other.utPad)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.utUser.contentHashCode()
        result = 31 * result + this.utId.contentHashCode()
        result = 31 * result + this.utLine.contentHashCode()
        result = 31 * result + this.utPid.hashCode()
        result = 31 * result + this.utType.hashCode()
        result = 31 * result + this.utTv.hashCode()
        result = 31 * result + this.utHost.contentHashCode()
        result = 31 * result + this.utPad.contentHashCode()
        return result
    }
}

public class Sigevent internal constructor(
    public var sigevNotify: CInt,
    public var sigevSigno: CInt,
    public var sigevValue: Sigval,
    unused1CtorArg: MutPtr<CVoid>,
    sigevNotifyAttributesCtorArg: MutPtr<PthreadAttrT>,
) {
    public var unused1: MutPtr<CVoid> = unused1CtorArg
        internal set

    // actually a function pointer
    public var sigevNotifyAttributes: MutPtr<PthreadAttrT> = sigevNotifyAttributesCtorArg
        internal set

    public constructor() : this(
        sigevNotify = 0,
        sigevSigno = 0,
        sigevValue = Sigval(),
        unused1CtorArg = MutPtr(0L),
        sigevNotifyAttributesCtorArg = MutPtr(0L),
    )

    public operator fun component1(): CInt = this.sigevNotify

    public operator fun component2(): CInt = this.sigevSigno

    public operator fun component3(): Sigval = this.sigevValue

    public operator fun component4(): MutPtr<CVoid> = this.unused1

    public operator fun component5(): MutPtr<PthreadAttrT> = this.sigevNotifyAttributes

    public fun copy(sigevNotify: CInt = this.sigevNotify, sigevSigno: CInt = this.sigevSigno, sigevValue: Sigval = this.sigevValue, unused1: MutPtr<CVoid> = this.unused1, sigevNotifyAttributes: MutPtr<PthreadAttrT> = this.sigevNotifyAttributes): Sigevent = Sigevent(sigevNotify = sigevNotify, sigevSigno = sigevSigno, sigevValue = sigevValue, unused1CtorArg = unused1, sigevNotifyAttributesCtorArg = sigevNotifyAttributes)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Sigevent) return false
        if (this.sigevNotify != other.sigevNotify) return false
        if (this.sigevSigno != other.sigevSigno) return false
        if (this.sigevValue != other.sigevValue) return false
        if (this.unused1 != other.unused1) return false
        if (this.sigevNotifyAttributes != other.sigevNotifyAttributes) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.sigevNotify.hashCode()
        result = 31 * result + this.sigevSigno.hashCode()
        result = 31 * result + this.sigevValue.hashCode()
        result = 31 * result + this.unused1.hashCode()
        result = 31 * result + this.sigevNotifyAttributes.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            sigevNotify: CInt = 0,
            sigevSigno: CInt = 0,
            sigevValue: Sigval = Sigval(),
            unused1: MutPtr<CVoid> = MutPtr(0L),
            sigevNotifyAttributes: MutPtr<PthreadAttrT> = MutPtr(0L),
        ): Sigevent =
            Sigevent(
                sigevNotify = sigevNotify,
                sigevSigno = sigevSigno,
                sigevValue = sigevValue,
                unused1CtorArg = unused1,
                sigevNotifyAttributesCtorArg = sigevNotifyAttributes,
            )
    }
}

public data class ProcessorCpuLoadInfo(
    public var cpuTicks: UIntArray = UIntArray(CPU_STATE_MAX),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ProcessorCpuLoadInfo) return false
        if (!this.cpuTicks.contentEquals(other.cpuTicks)) return false
        return true
    }

    override fun hashCode(): Int = this.cpuTicks.contentHashCode()

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ProcessorCpuLoadInfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ProcessorCpuLoadInfo> {
                override val sizeBytes: Long =
                    io.github.kotlinmania.rustlang.core.mem
                        .alignUpBytes(((CPU_STATE_MAX).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).strideBytes), 4L)
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): ProcessorCpuLoadInfo =
                    ProcessorCpuLoadInfo(
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32, (CPU_STATE_MAX).toInt())
                        ).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: ProcessorCpuLoadInfo) {
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32, (CPU_STATE_MAX).toInt())
                    ).writeNative(addr, value.cpuTicks)
                }
            }
    }
}

public data class ProcessorBasicInfo(
    public var cpuType: CpuTypeT = 0,
    public var cpuSubtype: CpuSubtypeT = 0,
    public var running: BooleanT = 0,
    public var slotNum: CInt = 0,
    public var isMaster: BooleanT = 0,
)

public data class ProcessorSetBasicInfo(
    public var processorCount: CInt = 0,
    public var defaultPolicy: CInt = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ProcessorSetBasicInfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ProcessorSetBasicInfo> {
                override val sizeBytes: Long = 8L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): ProcessorSetBasicInfo =
                    ProcessorSetBasicInfo(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: ProcessorSetBasicInfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.processorCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 4L, value.defaultPolicy)
                }
            }
    }
}

public data class ProcessorSetLoadInfo(
    public var taskCount: CInt = 0,
    public var threadCount: CInt = 0,
    public var loadAverage: IntegerT = 0,
    public var machFactor: IntegerT = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ProcessorSetLoadInfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ProcessorSetLoadInfo> {
                override val sizeBytes: Long = 16L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): ProcessorSetLoadInfo =
                    ProcessorSetLoadInfo(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 12L),
                    )
                override fun writeNative(addr: Long, value: ProcessorSetLoadInfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.taskCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 4L, value.threadCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 8L, value.loadAverage)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 12L, value.machFactor)
                }
            }
    }
}

public data class TimeValueT(
    public var seconds: IntegerT = 0,
    public var microseconds: IntegerT = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<TimeValueT> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<TimeValueT> {
                override val sizeBytes: Long = 8L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): TimeValueT =
                    TimeValueT(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: TimeValueT) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.seconds)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 4L, value.microseconds)
                }
            }
    }
}

public data class ThreadBasicInfo(
    public var userTime: TimeValueT = TimeValueT(),
    public var systemTime: TimeValueT = TimeValueT(),
    public var cpuUsage: IntegerT = 0,
    public var policy: PolicyT = 0,
    public var runState: IntegerT = 0,
    public var flags: IntegerT = 0,
    public var suspendCount: IntegerT = 0,
    public var sleepTime: IntegerT = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ThreadBasicInfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ThreadBasicInfo> {
                override val sizeBytes: Long = 40L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): ThreadBasicInfo =
                    ThreadBasicInfo(
                        (TimeValueT.typeLayout()).readNative(addr),
                        (TimeValueT.typeLayout()).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 20L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 28L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 32L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 36L),
                    )
                override fun writeNative(addr: Long, value: ThreadBasicInfo) {
                    (TimeValueT.typeLayout()).writeNative(addr, value.userTime)
                    (TimeValueT.typeLayout()).writeNative(addr + 8L, value.systemTime)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 16L, value.cpuUsage)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 20L, value.policy)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 24L, value.runState)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 28L, value.flags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 32L, value.suspendCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 36L, value.sleepTime)
                }
            }
    }
}

public data class ThreadIdentifierInfo(
    public var threadId: ULong = 0uL,
    public var threadHandle: ULong = 0uL,
    public var dispatchQaddr: ULong = 0uL,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ThreadIdentifierInfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ThreadIdentifierInfo> {
                override val sizeBytes: Long = 24L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): ThreadIdentifierInfo =
                    ThreadIdentifierInfo(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: ThreadIdentifierInfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr, value.threadId)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 8L, value.threadHandle)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 16L, value.dispatchQaddr)
                }
            }
    }
}

public data class ThreadExtendedInfo(
    public var pthUserTime: ULong = 0uL,
    public var pthSystemTime: ULong = 0uL,
    public var pthCpuUsage: Int = 0,
    public var pthPolicy: Int = 0,
    public var pthRunState: Int = 0,
    public var pthFlags: Int = 0,
    public var pthSleepTime: Int = 0,
    public var pthCurpri: Int = 0,
    public var pthPriority: Int = 0,
    public var pthMaxpriority: Int = 0,
    public var pthName: UByteArray = UByteArray(MAXTHREADNAMESIZE),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ThreadExtendedInfo) return false
        if (this.pthUserTime != other.pthUserTime) return false
        if (this.pthSystemTime != other.pthSystemTime) return false
        if (this.pthCpuUsage != other.pthCpuUsage) return false
        if (this.pthPolicy != other.pthPolicy) return false
        if (this.pthRunState != other.pthRunState) return false
        if (this.pthFlags != other.pthFlags) return false
        if (this.pthSleepTime != other.pthSleepTime) return false
        if (this.pthCurpri != other.pthCurpri) return false
        if (this.pthPriority != other.pthPriority) return false
        if (this.pthMaxpriority != other.pthMaxpriority) return false
        if (!this.pthName.contentEquals(other.pthName)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.pthUserTime.hashCode()
        result = 31 * result + this.pthSystemTime.hashCode()
        result = 31 * result + this.pthCpuUsage.hashCode()
        result = 31 * result + this.pthPolicy.hashCode()
        result = 31 * result + this.pthRunState.hashCode()
        result = 31 * result + this.pthFlags.hashCode()
        result = 31 * result + this.pthSleepTime.hashCode()
        result = 31 * result + this.pthCurpri.hashCode()
        result = 31 * result + this.pthPriority.hashCode()
        result = 31 * result + this.pthMaxpriority.hashCode()
        result = 31 * result + this.pthName.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ThreadExtendedInfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ThreadExtendedInfo> {
                override val sizeBytes: Long =
                    io.github.kotlinmania.rustlang.core.mem
                        .alignUpBytes(
                            (
                                io.github.kotlinmania.rustlang.core.mem
                                    .alignUpBytes(48L, 1L) + ((MAXTHREADNAMESIZE).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8).strideBytes)
                            ),
                            maxOf(maxOf(8L, 4L), 1L),
                        )
                override val alignBytes: Long = maxOf(maxOf(8L, 4L), 1L)
                override fun readNative(addr: Long): ThreadExtendedInfo =
                    ThreadExtendedInfo(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 20L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 28L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 32L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 36L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 40L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 44L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (MAXTHREADNAMESIZE).toInt())
                        ).readNative(
                            addr +
                                io.github.kotlinmania.rustlang.core.mem
                                    .alignUpBytes(48L, 1L),
                        ),
                    )
                override fun writeNative(addr: Long, value: ThreadExtendedInfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr, value.pthUserTime)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 8L, value.pthSystemTime)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 16L, value.pthCpuUsage)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 20L, value.pthPolicy)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 24L, value.pthRunState)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 28L, value.pthFlags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 32L, value.pthSleepTime)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 36L, value.pthCurpri)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 40L, value.pthPriority)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 44L, value.pthMaxpriority)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (MAXTHREADNAMESIZE).toInt())
                    ).writeNative(
                        addr +
                            io.github.kotlinmania.rustlang.core.mem
                                .alignUpBytes(48L, 1L),
                        value.pthName,
                    )
                }
            }
    }
}

public class IfData64(
    public var ifiType: CUchar = 0u,
    public var ifiTypelen: CUchar = 0u,
    public var ifiPhysical: CUchar = 0u,
    public var ifiAddrlen: CUchar = 0u,
    public var ifiHdrlen: CUchar = 0u,
    public var ifiRecvquota: CUchar = 0u,
    public var ifiXmitquota: CUchar = 0u,
    public var ifiUnused1: CUchar = 0u,
    public var ifiMtu: UInt = 0u,
    public var ifiMetric: UInt = 0u,
    public var ifiBaudrate: ULong = 0uL,
    public var ifiIpackets: ULong = 0uL,
    public var ifiIerrors: ULong = 0uL,
    public var ifiOpackets: ULong = 0uL,
    public var ifiOerrors: ULong = 0uL,
    public var ifiCollisions: ULong = 0uL,
    public var ifiIbytes: ULong = 0uL,
    public var ifiObytes: ULong = 0uL,
    public var ifiImcasts: ULong = 0uL,
    public var ifiOmcasts: ULong = 0uL,
    public var ifiIqdrops: ULong = 0uL,
    public var ifiNoproto: ULong = 0uL,
    public var ifiRecvtiming: UInt = 0u,
    public var ifiXmittiming: UInt = 0u,
    public var ifiLastchange: Timeval32 = Timeval32(),
)

public data class IfMsghdr2(
    public var ifmMsglen: CUshort = 0u,
    public var ifmVersion: CUchar = 0u,
    public var ifmType: CUchar = 0u,
    public var ifmAddrs: CInt = 0,
    public var ifmFlags: CInt = 0,
    public var ifmIndex: CUshort = 0u,
    public var ifmSndLen: CInt = 0,
    public var ifmSndMaxlen: CInt = 0,
    public var ifmSndDrops: CInt = 0,
    public var ifmTimer: CInt = 0,
    public var ifmData: IfData64 = IfData64(),
)

public class VmStatistics64(
    public var freeCount: NaturalT = 0u,
    public var activeCount: NaturalT = 0u,
    public var inactiveCount: NaturalT = 0u,
    public var wireCount: NaturalT = 0u,
    public var zeroFillCount: ULong = 0uL,
    public var reactivations: ULong = 0uL,
    public var pageins: ULong = 0uL,
    public var pageouts: ULong = 0uL,
    public var faults: ULong = 0uL,
    public var cowFaults: ULong = 0uL,
    public var lookups: ULong = 0uL,
    public var hits: ULong = 0uL,
    public var purges: ULong = 0uL,
    public var purgeableCount: NaturalT = 0u,
    public var speculativeCount: NaturalT = 0u,
    public var decompressions: ULong = 0uL,
    public var compressions: ULong = 0uL,
    public var swapins: ULong = 0uL,
    public var swapouts: ULong = 0uL,
    public var compressorPageCount: NaturalT = 0u,
    public var throttledCount: NaturalT = 0u,
    public var externalPageCount: NaturalT = 0u,
    public var internalPageCount: NaturalT = 0u,
    public var totalUncompressedPagesInCompressor: ULong = 0uL,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<VmStatistics64> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<VmStatistics64> {
                override val sizeBytes: Long = 152L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): VmStatistics64 =
                    VmStatistics64(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 32L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 40L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 48L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 56L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 64L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 72L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 80L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 88L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 92L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 96L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 104L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 112L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 120L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 128L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 132L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 136L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 140L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 144L),
                    )
                override fun writeNative(addr: Long, value: VmStatistics64) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.freeCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.activeCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.inactiveCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.wireCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 16L, value.zeroFillCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 24L, value.reactivations)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 32L, value.pageins)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 40L, value.pageouts)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 48L, value.faults)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 56L, value.cowFaults)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 64L, value.lookups)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 72L, value.hits)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 80L, value.purges)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 88L, value.purgeableCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 92L, value.speculativeCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 96L, value.decompressions)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 104L, value.compressions)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 112L, value.swapins)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 120L, value.swapouts)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 128L, value.compressorPageCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 132L, value.throttledCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 136L, value.externalPageCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 140L, value.internalPageCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 144L, value.totalUncompressedPagesInCompressor)
                }
            }
    }
}

public data class MachTaskBasicInfo(
    public var virtualSize: MachVmSizeT = 0uL,
    public var residentSize: MachVmSizeT = 0uL,
    public var residentSizeMax: MachVmSizeT = 0uL,
    public var userTime: TimeValueT = TimeValueT(),
    public var systemTime: TimeValueT = TimeValueT(),
    public var policy: PolicyT = 0,
    public var suspendCount: IntegerT = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<MachTaskBasicInfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<MachTaskBasicInfo> {
                override val sizeBytes: Long = 48L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): MachTaskBasicInfo =
                    MachTaskBasicInfo(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 16L),
                        (TimeValueT.typeLayout()).readNative(addr + 24L),
                        (TimeValueT.typeLayout()).readNative(addr + 32L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 40L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 44L),
                    )
                override fun writeNative(addr: Long, value: MachTaskBasicInfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr, value.virtualSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 8L, value.residentSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 16L, value.residentSizeMax)
                    (TimeValueT.typeLayout()).writeNative(addr + 24L, value.userTime)
                    (TimeValueT.typeLayout()).writeNative(addr + 32L, value.systemTime)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 40L, value.policy)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 44L, value.suspendCount)
                }
            }
    }
}

public data class Log2phys(
    public var l2pFlags: CUint = 0u,
    public var l2pContigbytes: OffT = 0L,
    public var l2pDevoffset: OffT = 0L,
)

public data class OsUnfairLockS(
    public var osUnfairLockOpaque: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<OsUnfairLockS> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<OsUnfairLockS> {
                override val sizeBytes: Long = 4L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): OsUnfairLockS =
                    OsUnfairLockS(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: OsUnfairLockS) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.osUnfairLockOpaque)
                }
            }
    }
}

public data class SockaddrVm(
    public var svmLen: CUchar = 0u,
    public var svmFamily: SaFamilyT = 0u,
    public var svmReserved1: CUshort = 0u,
    public var svmPort: CUint = 0u,
    public var svmCid: CUint = 0u,
)

public data class Ifdevmtu(
    public var ifdmCurrent: CInt = 0,
    public var ifdmMin: CInt = 0,
    public var ifdmMax: CInt = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Ifdevmtu> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Ifdevmtu> {
                override val sizeBytes: Long = 12L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): Ifdevmtu =
                    Ifdevmtu(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: Ifdevmtu) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.ifdmCurrent)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 4L, value.ifdmMin)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 8L, value.ifdmMax)
                }
            }
    }
}

public data class Ifkpi(
    public var ifkModuleId: CUint = 0u,
    public var ifkType: CUint = 0u,
    public var ifkData: CAnonymousIfkData = CAnonymousIfkData(),
)

public data class Ifreq(
    public var ifrName: UByteArray = UByteArray(IFNAMSIZ.toInt()),
    public var ifrIfru: CAnonymousIfrIfru = CAnonymousIfrIfru(),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Ifreq) return false
        if (!this.ifrName.contentEquals(other.ifrName)) return false
        if (this.ifrIfru != other.ifrIfru) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.ifrName.contentHashCode()
        result = 31 * result + this.ifrIfru.hashCode()
        return result
    }
}

public data class In6Ifreq(
    public var ifrName: UByteArray = UByteArray(IFNAMSIZ.toInt()),
    public var ifrIfru: CAnonymousIfrIfru6 = CAnonymousIfrIfru6(),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is In6Ifreq) return false
        if (!this.ifrName.contentEquals(other.ifrName)) return false
        if (this.ifrIfru != other.ifrIfru) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.ifrName.contentHashCode()
        result = 31 * result + this.ifrIfru.hashCode()
        return result
    }
}

public data class Ifconf(
    public var ifcLen: CInt = 0,
    public var ifcIfcu: CAnonymousIfcIfcu = CAnonymousIfcIfcu(),
) {
    public fun eq(other: Ifconf): Boolean {
        val lenPtr1 = addrOf(this.ifcLen)
        val lenPtr2 = addrOf(other.ifcLen)
        val ifcuPtr1 = addrOf(this.ifcIfcu)
        val ifcuPtr2 = addrOf(other.ifcIfcu)
        // SAFETY: `ifconf` implements `Copy` so the reads are valid
        val len1 = lenPtr1.readUnaligned()
        val len2 = lenPtr2.readUnaligned()
        val ifcu1 = ifcuPtr1.readUnaligned()
        val ifcu2 = ifcuPtr2.readUnaligned()
        return len1 == len2 && ifcu1 == ifcu2
    }
}

public class CAnonymousIfkData internal constructor(
    ifkPtrCtorArg: MutPtr<CVoid>,
    public var ifkValue: CInt,
) {
    public var ifkPtr: MutPtr<CVoid> = ifkPtrCtorArg
        internal set

    public constructor() : this(
        ifkPtrCtorArg = MutPtr(0L),
        ifkValue = 0,
    )

    public operator fun component1(): MutPtr<CVoid> = this.ifkPtr

    public operator fun component2(): CInt = this.ifkValue

    public fun copy(ifkPtr: MutPtr<CVoid> = this.ifkPtr, ifkValue: CInt = this.ifkValue): CAnonymousIfkData = CAnonymousIfkData(ifkPtrCtorArg = ifkPtr, ifkValue = ifkValue)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CAnonymousIfkData) return false
        if (this.ifkPtr != other.ifkPtr) return false
        if (this.ifkValue != other.ifkValue) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.ifkPtr.hashCode()
        result = 31 * result + this.ifkValue.hashCode()
        return result
    }

    public fun fmt(f: StringBuilder) {
        DebugStruct(f, "__c_anonymous_ifk_data").finishNonExhaustive()
    }

    public fun eq(other: CAnonymousIfkData): Boolean = ((this.ifkPtr).rawAddress.toULong() == (other.ifkPtr).rawAddress.toULong()) && this.ifkValue == other.ifkValue

    public companion object {
        public operator fun invoke(
            ifkPtr: MutPtr<CVoid> = MutPtr(0L),
            ifkValue: CInt = 0,
        ): CAnonymousIfkData =
            CAnonymousIfkData(
                ifkPtrCtorArg = ifkPtr,
                ifkValue = ifkValue,
            )
    }
}

public class CAnonymousIfrIfru internal constructor(
    public var ifruAddr: Sockaddr,
    public var ifruDstaddr: Sockaddr,
    public var ifruBroadaddr: Sockaddr,
    public var ifruFlags: CShort,
    public var ifruMetrics: CInt,
    public var ifruMtu: CInt,
    public var ifruPhys: CInt,
    public var ifruMedia: CInt,
    public var ifruIntval: CInt,
    ifruDataCtorArg: MutPtr<CChar>,
    public var ifruDevmtu: Ifdevmtu,
    public var ifruKpi: Ifkpi,
    public var ifruWakeFlags: UInt,
    public var ifruRouteRefcnt: UInt,
    public var ifruCap: IntArray,
    public var ifruFunctionalType: UInt,
) {
    public var ifruData: MutPtr<CChar> = ifruDataCtorArg
        internal set

    public constructor() : this(
        ifruAddr = Sockaddr(),
        ifruDstaddr = Sockaddr(),
        ifruBroadaddr = Sockaddr(),
        ifruFlags = 0,
        ifruMetrics = 0,
        ifruMtu = 0,
        ifruPhys = 0,
        ifruMedia = 0,
        ifruIntval = 0,
        ifruDataCtorArg = MutPtr(0L),
        ifruDevmtu = Ifdevmtu(),
        ifruKpi = Ifkpi(),
        ifruWakeFlags = 0u,
        ifruRouteRefcnt = 0u,
        ifruCap = IntArray(2),
        ifruFunctionalType = 0u,
    )

    public operator fun component1(): Sockaddr = this.ifruAddr

    public operator fun component2(): Sockaddr = this.ifruDstaddr

    public operator fun component3(): Sockaddr = this.ifruBroadaddr

    public operator fun component4(): CShort = this.ifruFlags

    public operator fun component5(): CInt = this.ifruMetrics

    public operator fun component6(): CInt = this.ifruMtu

    public operator fun component7(): CInt = this.ifruPhys

    public operator fun component8(): CInt = this.ifruMedia

    public operator fun component9(): CInt = this.ifruIntval

    public operator fun component10(): MutPtr<CChar> = this.ifruData

    public operator fun component11(): Ifdevmtu = this.ifruDevmtu

    public operator fun component12(): Ifkpi = this.ifruKpi

    public operator fun component13(): UInt = this.ifruWakeFlags

    public operator fun component14(): UInt = this.ifruRouteRefcnt

    public operator fun component15(): IntArray = this.ifruCap

    public operator fun component16(): UInt = this.ifruFunctionalType

    public fun copy(ifruAddr: Sockaddr = this.ifruAddr, ifruDstaddr: Sockaddr = this.ifruDstaddr, ifruBroadaddr: Sockaddr = this.ifruBroadaddr, ifruFlags: CShort = this.ifruFlags, ifruMetrics: CInt = this.ifruMetrics, ifruMtu: CInt = this.ifruMtu, ifruPhys: CInt = this.ifruPhys, ifruMedia: CInt = this.ifruMedia, ifruIntval: CInt = this.ifruIntval, ifruData: MutPtr<CChar> = this.ifruData, ifruDevmtu: Ifdevmtu = this.ifruDevmtu, ifruKpi: Ifkpi = this.ifruKpi, ifruWakeFlags: UInt = this.ifruWakeFlags, ifruRouteRefcnt: UInt = this.ifruRouteRefcnt, ifruCap: IntArray = this.ifruCap, ifruFunctionalType: UInt = this.ifruFunctionalType): CAnonymousIfrIfru = CAnonymousIfrIfru(ifruAddr = ifruAddr, ifruDstaddr = ifruDstaddr, ifruBroadaddr = ifruBroadaddr, ifruFlags = ifruFlags, ifruMetrics = ifruMetrics, ifruMtu = ifruMtu, ifruPhys = ifruPhys, ifruMedia = ifruMedia, ifruIntval = ifruIntval, ifruDataCtorArg = ifruData, ifruDevmtu = ifruDevmtu, ifruKpi = ifruKpi, ifruWakeFlags = ifruWakeFlags, ifruRouteRefcnt = ifruRouteRefcnt, ifruCap = ifruCap, ifruFunctionalType = ifruFunctionalType)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CAnonymousIfrIfru) return false
        if (this.ifruAddr != other.ifruAddr) return false
        if (this.ifruDstaddr != other.ifruDstaddr) return false
        if (this.ifruBroadaddr != other.ifruBroadaddr) return false
        if (this.ifruFlags != other.ifruFlags) return false
        if (this.ifruMetrics != other.ifruMetrics) return false
        if (this.ifruMtu != other.ifruMtu) return false
        if (this.ifruPhys != other.ifruPhys) return false
        if (this.ifruMedia != other.ifruMedia) return false
        if (this.ifruIntval != other.ifruIntval) return false
        if (this.ifruData != other.ifruData) return false
        if (this.ifruDevmtu != other.ifruDevmtu) return false
        if (this.ifruKpi != other.ifruKpi) return false
        if (this.ifruWakeFlags != other.ifruWakeFlags) return false
        if (this.ifruRouteRefcnt != other.ifruRouteRefcnt) return false
        if (!this.ifruCap.contentEquals(other.ifruCap)) return false
        if (this.ifruFunctionalType != other.ifruFunctionalType) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.ifruAddr.hashCode()
        result = 31 * result + this.ifruDstaddr.hashCode()
        result = 31 * result + this.ifruBroadaddr.hashCode()
        result = 31 * result + this.ifruFlags.hashCode()
        result = 31 * result + this.ifruMetrics.hashCode()
        result = 31 * result + this.ifruMtu.hashCode()
        result = 31 * result + this.ifruPhys.hashCode()
        result = 31 * result + this.ifruMedia.hashCode()
        result = 31 * result + this.ifruIntval.hashCode()
        result = 31 * result + this.ifruData.hashCode()
        result = 31 * result + this.ifruDevmtu.hashCode()
        result = 31 * result + this.ifruKpi.hashCode()
        result = 31 * result + this.ifruWakeFlags.hashCode()
        result = 31 * result + this.ifruRouteRefcnt.hashCode()
        result = 31 * result + this.ifruCap.contentHashCode()
        result = 31 * result + this.ifruFunctionalType.hashCode()
        return result
    }

    public fun fmt(f: StringBuilder) {
        DebugStruct(f, "__c_anonymous_ifr_ifru").finishNonExhaustive()
    }

    public fun eq(other: CAnonymousIfrIfru): Boolean = this.ifruAddr == other.ifruAddr && this.ifruDstaddr == other.ifruDstaddr && this.ifruBroadaddr == other.ifruBroadaddr && this.ifruFlags == other.ifruFlags && this.ifruMetrics == other.ifruMetrics && this.ifruMtu == other.ifruMtu && this.ifruPhys == other.ifruPhys && this.ifruMedia == other.ifruMedia && this.ifruIntval == other.ifruIntval && ((this.ifruData).rawAddress.toULong() == (other.ifruData).rawAddress.toULong()) && this.ifruDevmtu == other.ifruDevmtu && this.ifruKpi == other.ifruKpi && this.ifruWakeFlags == other.ifruWakeFlags && this.ifruRouteRefcnt == other.ifruRouteRefcnt && (this.ifruCap.zip(other.ifruCap)).all({ (a, b) -> a == b }) && this.ifruFunctionalType == other.ifruFunctionalType

    public companion object {
        public operator fun invoke(
            ifruAddr: Sockaddr = Sockaddr(),
            ifruDstaddr: Sockaddr = Sockaddr(),
            ifruBroadaddr: Sockaddr = Sockaddr(),
            ifruFlags: CShort = 0,
            ifruMetrics: CInt = 0,
            ifruMtu: CInt = 0,
            ifruPhys: CInt = 0,
            ifruMedia: CInt = 0,
            ifruIntval: CInt = 0,
            ifruData: MutPtr<CChar> = MutPtr(0L),
            ifruDevmtu: Ifdevmtu = Ifdevmtu(),
            ifruKpi: Ifkpi = Ifkpi(),
            ifruWakeFlags: UInt = 0u,
            ifruRouteRefcnt: UInt = 0u,
            ifruCap: IntArray = IntArray(2),
            ifruFunctionalType: UInt = 0u,
        ): CAnonymousIfrIfru =
            CAnonymousIfrIfru(
                ifruAddr = ifruAddr,
                ifruDstaddr = ifruDstaddr,
                ifruBroadaddr = ifruBroadaddr,
                ifruFlags = ifruFlags,
                ifruMetrics = ifruMetrics,
                ifruMtu = ifruMtu,
                ifruPhys = ifruPhys,
                ifruMedia = ifruMedia,
                ifruIntval = ifruIntval,
                ifruDataCtorArg = ifruData,
                ifruDevmtu = ifruDevmtu,
                ifruKpi = ifruKpi,
                ifruWakeFlags = ifruWakeFlags,
                ifruRouteRefcnt = ifruRouteRefcnt,
                ifruCap = ifruCap,
                ifruFunctionalType = ifruFunctionalType,
            )
    }
}

public class CAnonymousIfcIfcu internal constructor(
    ifcuBufCtorArg: MutPtr<CChar>,
    ifcuReqCtorArg: MutPtr<Ifreq>,
) {
    public var ifcuBuf: MutPtr<CChar> = ifcuBufCtorArg
        internal set

    public var ifcuReq: MutPtr<Ifreq> = ifcuReqCtorArg
        internal set

    public constructor() : this(
        ifcuBufCtorArg = MutPtr(0L),
        ifcuReqCtorArg = MutPtr(0L),
    )

    public operator fun component1(): MutPtr<CChar> = this.ifcuBuf

    public operator fun component2(): MutPtr<Ifreq> = this.ifcuReq

    public fun copy(ifcuBuf: MutPtr<CChar> = this.ifcuBuf, ifcuReq: MutPtr<Ifreq> = this.ifcuReq): CAnonymousIfcIfcu = CAnonymousIfcIfcu(ifcuBufCtorArg = ifcuBuf, ifcuReqCtorArg = ifcuReq)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CAnonymousIfcIfcu) return false
        if (this.ifcuBuf != other.ifcuBuf) return false
        if (this.ifcuReq != other.ifcuReq) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.ifcuBuf.hashCode()
        result = 31 * result + this.ifcuReq.hashCode()
        return result
    }

    public fun fmt(f: StringBuilder) {
        DebugStruct(f, "__c_anonymous_ifc_ifcu").finishNonExhaustive()
    }

    public fun eq(other: CAnonymousIfcIfcu): Boolean = ((this.ifcuBuf).rawAddress.toULong() == (other.ifcuBuf).rawAddress.toULong()) && ((this.ifcuReq).rawAddress.toULong() == (other.ifcuReq).rawAddress.toULong())

    public companion object {
        public operator fun invoke(
            ifcuBuf: MutPtr<CChar> = MutPtr(0L),
            ifcuReq: MutPtr<Ifreq> = MutPtr(0L),
        ): CAnonymousIfcIfcu =
            CAnonymousIfcIfcu(
                ifcuBufCtorArg = ifcuBuf,
                ifcuReqCtorArg = ifcuReq,
            )
    }
}

public class CAnonymousIfrIfru6 internal constructor(
    public var ifruAddr: SockaddrIn6,
    public var ifruDstaddr: SockaddrIn6,
    public var ifruFlags: CInt,
    public var ifruFlags6: CInt,
    public var ifruMetrics: CInt,
    public var ifruIntval: CInt,
    ifruDataCtorArg: MutPtr<CChar>,
    public var ifruLifetime: In6Addrlifetime,
    public var ifruStat: In6Ifstat,
    public var ifruIcmp6stat: Icmp6Ifstat,
    public var ifruScopeId: UIntArray,
) {
    public var ifruData: MutPtr<CChar> = ifruDataCtorArg
        internal set

    public constructor() : this(
        ifruAddr = SockaddrIn6(),
        ifruDstaddr = SockaddrIn6(),
        ifruFlags = 0,
        ifruFlags6 = 0,
        ifruMetrics = 0,
        ifruIntval = 0,
        ifruDataCtorArg = MutPtr(0L),
        ifruLifetime = In6Addrlifetime(),
        ifruStat = In6Ifstat(),
        ifruIcmp6stat = Icmp6Ifstat(),
        ifruScopeId = UIntArray(SCOPE6_ID_MAX.toInt()),
    )

    public operator fun component1(): SockaddrIn6 = this.ifruAddr

    public operator fun component2(): SockaddrIn6 = this.ifruDstaddr

    public operator fun component3(): CInt = this.ifruFlags

    public operator fun component4(): CInt = this.ifruFlags6

    public operator fun component5(): CInt = this.ifruMetrics

    public operator fun component6(): CInt = this.ifruIntval

    public operator fun component7(): MutPtr<CChar> = this.ifruData

    public operator fun component8(): In6Addrlifetime = this.ifruLifetime

    public operator fun component9(): In6Ifstat = this.ifruStat

    public operator fun component10(): Icmp6Ifstat = this.ifruIcmp6stat

    public operator fun component11(): UIntArray = this.ifruScopeId

    public fun copy(ifruAddr: SockaddrIn6 = this.ifruAddr, ifruDstaddr: SockaddrIn6 = this.ifruDstaddr, ifruFlags: CInt = this.ifruFlags, ifruFlags6: CInt = this.ifruFlags6, ifruMetrics: CInt = this.ifruMetrics, ifruIntval: CInt = this.ifruIntval, ifruData: MutPtr<CChar> = this.ifruData, ifruLifetime: In6Addrlifetime = this.ifruLifetime, ifruStat: In6Ifstat = this.ifruStat, ifruIcmp6stat: Icmp6Ifstat = this.ifruIcmp6stat, ifruScopeId: UIntArray = this.ifruScopeId): CAnonymousIfrIfru6 = CAnonymousIfrIfru6(ifruAddr = ifruAddr, ifruDstaddr = ifruDstaddr, ifruFlags = ifruFlags, ifruFlags6 = ifruFlags6, ifruMetrics = ifruMetrics, ifruIntval = ifruIntval, ifruDataCtorArg = ifruData, ifruLifetime = ifruLifetime, ifruStat = ifruStat, ifruIcmp6stat = ifruIcmp6stat, ifruScopeId = ifruScopeId)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CAnonymousIfrIfru6) return false
        if (this.ifruAddr != other.ifruAddr) return false
        if (this.ifruDstaddr != other.ifruDstaddr) return false
        if (this.ifruFlags != other.ifruFlags) return false
        if (this.ifruFlags6 != other.ifruFlags6) return false
        if (this.ifruMetrics != other.ifruMetrics) return false
        if (this.ifruIntval != other.ifruIntval) return false
        if (this.ifruData != other.ifruData) return false
        if (this.ifruLifetime != other.ifruLifetime) return false
        if (this.ifruStat != other.ifruStat) return false
        if (this.ifruIcmp6stat != other.ifruIcmp6stat) return false
        if (!this.ifruScopeId.contentEquals(other.ifruScopeId)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.ifruAddr.hashCode()
        result = 31 * result + this.ifruDstaddr.hashCode()
        result = 31 * result + this.ifruFlags.hashCode()
        result = 31 * result + this.ifruFlags6.hashCode()
        result = 31 * result + this.ifruMetrics.hashCode()
        result = 31 * result + this.ifruIntval.hashCode()
        result = 31 * result + this.ifruData.hashCode()
        result = 31 * result + this.ifruLifetime.hashCode()
        result = 31 * result + this.ifruStat.hashCode()
        result = 31 * result + this.ifruIcmp6stat.hashCode()
        result = 31 * result + this.ifruScopeId.contentHashCode()
        return result
    }

    public fun fmt(f: StringBuilder) {
        DebugStruct(f, "__c_anonymous_ifr_ifru6").finishNonExhaustive()
    }

    public fun eq(other: CAnonymousIfrIfru6): Boolean = this.ifruAddr == other.ifruAddr && this.ifruDstaddr == other.ifruDstaddr && this.ifruFlags == other.ifruFlags && this.ifruFlags6 == other.ifruFlags6 && this.ifruMetrics == other.ifruMetrics && this.ifruIntval == other.ifruIntval && ((this.ifruData).rawAddress.toULong() == (other.ifruData).rawAddress.toULong()) && (this.ifruScopeId.zip(other.ifruScopeId)).all({ (a, b) -> a == b })

    public companion object {
        public operator fun invoke(
            ifruAddr: SockaddrIn6 = SockaddrIn6(),
            ifruDstaddr: SockaddrIn6 = SockaddrIn6(),
            ifruFlags: CInt = 0,
            ifruFlags6: CInt = 0,
            ifruMetrics: CInt = 0,
            ifruIntval: CInt = 0,
            ifruData: MutPtr<CChar> = MutPtr(0L),
            ifruLifetime: In6Addrlifetime = In6Addrlifetime(),
            ifruStat: In6Ifstat = In6Ifstat(),
            ifruIcmp6stat: Icmp6Ifstat = Icmp6Ifstat(),
            ifruScopeId: UIntArray = UIntArray(SCOPE6_ID_MAX.toInt()),
        ): CAnonymousIfrIfru6 =
            CAnonymousIfrIfru6(
                ifruAddr = ifruAddr,
                ifruDstaddr = ifruDstaddr,
                ifruFlags = ifruFlags,
                ifruFlags6 = ifruFlags6,
                ifruMetrics = ifruMetrics,
                ifruIntval = ifruIntval,
                ifruDataCtorArg = ifruData,
                ifruLifetime = ifruLifetime,
                ifruStat = ifruStat,
                ifruIcmp6stat = ifruIcmp6stat,
                ifruScopeId = ifruScopeId,
            )
    }
}

public class Semun internal constructor(
    public var value: CInt,
    bufCtorArg: MutPtr<SemidDs>,
    arrayCtorArg: MutPtr<CUshort>,
) {
    public var buf: MutPtr<SemidDs> = bufCtorArg
        internal set

    public var array: MutPtr<CUshort> = arrayCtorArg
        internal set

    public constructor() : this(
        value = 0,
        bufCtorArg = MutPtr(0L),
        arrayCtorArg = MutPtr(0L),
    )

    public operator fun component1(): CInt = this.value

    public operator fun component2(): MutPtr<SemidDs> = this.buf

    public operator fun component3(): MutPtr<CUshort> = this.array

    public fun copy(value: CInt = this.value, buf: MutPtr<SemidDs> = this.buf, array: MutPtr<CUshort> = this.array): Semun = Semun(value = value, bufCtorArg = buf, arrayCtorArg = array)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Semun) return false
        if (this.value != other.value) return false
        if (this.buf != other.buf) return false
        if (this.array != other.array) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.value.hashCode()
        result = 31 * result + this.buf.hashCode()
        result = 31 * result + this.array.hashCode()
        return result
    }

    public fun fmt(f: StringBuilder) {
        DebugStruct(f, "semun").finishNonExhaustive()
    }

    public fun eq(other: Semun): Boolean = this.value == other.value

    public companion object {
        public operator fun invoke(
            value: CInt = 0,
            buf: MutPtr<SemidDs> = MutPtr(0L),
            array: MutPtr<CUshort> = MutPtr(0L),
        ): Semun =
            Semun(
                value = value,
                bufCtorArg = buf,
                arrayCtorArg = array,
            )
    }
}
