@file:OptIn(ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CChar
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CLong
import io.github.kotlinmania.libc.CShort
import io.github.kotlinmania.libc.CUchar
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.CUlonglong
import io.github.kotlinmania.libc.CUshort
import io.github.kotlinmania.libc.new.netbsd.sys.ipc.IpcPerm
import io.github.kotlinmania.libc.new.netbsd.sys.types.DevT
import io.github.kotlinmania.libc.new.netbsd.sys.types.LwpidT
import io.github.kotlinmania.libc.unix.GidT
import io.github.kotlinmania.libc.unix.InAddrT
import io.github.kotlinmania.libc.unix.InPortT
import io.github.kotlinmania.libc.unix.PidT
import io.github.kotlinmania.libc.unix.Sigval
import io.github.kotlinmania.libc.unix.SizeT
import io.github.kotlinmania.libc.unix.SsizeT
import io.github.kotlinmania.libc.unix.UidT
import io.github.kotlinmania.libc.unix.UintptrT
import io.github.kotlinmania.libc.unix.bsd.BlkcntT
import io.github.kotlinmania.libc.unix.bsd.OffT
import io.github.kotlinmania.libc.unix.bsd.PATH_MAX
import io.github.kotlinmania.libc.unix.bsd.PthreadT
import io.github.kotlinmania.libc.unix.bsd.SaFamilyT
import io.github.kotlinmania.libc.unix.bsd.Sockaddr
import io.github.kotlinmania.libc.unix.bsd.SocklenT
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.InoT
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.ModeT
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.NlinkT
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.SchedParam
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.TimeT
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

public class Aiocb internal constructor(
    public var aioOffset: OffT,
    aioBufCtorArg: MutPtr<CVoid>,
    public var aioNbytes: SizeT,
    public var aioFildes: CInt,
    public var aioLioOpcode: CInt,
    public var aioReqprio: CInt,
    public var aioSigevent: Sigevent,
    public var state: CInt,
    public var errnum: CInt,
    public var retval: SsizeT,
) {
    public var aioBuf: MutPtr<CVoid> = aioBufCtorArg
        internal set

    public constructor() : this(
        aioOffset = 0L,
        aioBufCtorArg = MutPtr(0L),
        aioNbytes = 0uL,
        aioFildes = 0,
        aioLioOpcode = 0,
        aioReqprio = 0,
        aioSigevent = Sigevent(),
        state = 0,
        errnum = 0,
        retval = 0L,
    )

    public operator fun component1(): OffT = this.aioOffset

    public operator fun component2(): MutPtr<CVoid> = this.aioBuf

    public operator fun component3(): SizeT = this.aioNbytes

    public operator fun component4(): CInt = this.aioFildes

    public operator fun component5(): CInt = this.aioLioOpcode

    public operator fun component6(): CInt = this.aioReqprio

    public operator fun component7(): Sigevent = this.aioSigevent

    public operator fun component8(): CInt = this.state

    public operator fun component9(): CInt = this.errnum

    public operator fun component10(): SsizeT = this.retval

    public fun copy(aioOffset: OffT = this.aioOffset, aioBuf: MutPtr<CVoid> = this.aioBuf, aioNbytes: SizeT = this.aioNbytes, aioFildes: CInt = this.aioFildes, aioLioOpcode: CInt = this.aioLioOpcode, aioReqprio: CInt = this.aioReqprio, aioSigevent: Sigevent = this.aioSigevent, state: CInt = this.state, errnum: CInt = this.errnum, retval: SsizeT = this.retval): Aiocb = Aiocb(aioOffset = aioOffset, aioBufCtorArg = aioBuf, aioNbytes = aioNbytes, aioFildes = aioFildes, aioLioOpcode = aioLioOpcode, aioReqprio = aioReqprio, aioSigevent = aioSigevent, state = state, errnum = errnum, retval = retval)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Aiocb) return false
        if (this.aioOffset != other.aioOffset) return false
        if (this.aioBuf != other.aioBuf) return false
        if (this.aioNbytes != other.aioNbytes) return false
        if (this.aioFildes != other.aioFildes) return false
        if (this.aioLioOpcode != other.aioLioOpcode) return false
        if (this.aioReqprio != other.aioReqprio) return false
        if (this.aioSigevent != other.aioSigevent) return false
        if (this.state != other.state) return false
        if (this.errnum != other.errnum) return false
        if (this.retval != other.retval) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.aioOffset.hashCode()
        result = 31 * result + this.aioBuf.hashCode()
        result = 31 * result + this.aioNbytes.hashCode()
        result = 31 * result + this.aioFildes.hashCode()
        result = 31 * result + this.aioLioOpcode.hashCode()
        result = 31 * result + this.aioReqprio.hashCode()
        result = 31 * result + this.aioSigevent.hashCode()
        result = 31 * result + this.state.hashCode()
        result = 31 * result + this.errnum.hashCode()
        result = 31 * result + this.retval.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            aioOffset: OffT = 0L,
            aioBuf: MutPtr<CVoid> = MutPtr(0L),
            aioNbytes: SizeT = 0uL,
            aioFildes: CInt = 0,
            aioLioOpcode: CInt = 0,
            aioReqprio: CInt = 0,
            aioSigevent: Sigevent = Sigevent(),
            state: CInt = 0,
            errnum: CInt = 0,
            retval: SsizeT = 0L,
        ): Aiocb = Aiocb(
            aioOffset = aioOffset,
            aioBufCtorArg = aioBuf,
            aioNbytes = aioNbytes,
            aioFildes = aioFildes,
            aioLioOpcode = aioLioOpcode,
            aioReqprio = aioReqprio,
            aioSigevent = aioSigevent,
            state = state,
            errnum = errnum,
            retval = retval,
        )
    }
}

public class GlobT internal constructor(
    public var glPathc: SizeT,
    public var glMatchc: SizeT,
    public var glOffs: SizeT,
    public var glFlags: CInt,
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
        glMatchc = 0uL,
        glOffs = 0uL,
        glFlags = 0,
        glPathvCtorArg = MutPtr(0L),
        unused3CtorArg = MutPtr(0L),
        unused4CtorArg = MutPtr(0L),
        unused5CtorArg = MutPtr(0L),
        unused6CtorArg = MutPtr(0L),
        unused7CtorArg = MutPtr(0L),
        unused8CtorArg = MutPtr(0L),
    )

    public operator fun component1(): SizeT = this.glPathc

    public operator fun component2(): SizeT = this.glMatchc

    public operator fun component3(): SizeT = this.glOffs

    public operator fun component4(): CInt = this.glFlags

    public operator fun component5(): MutPtr<MutPtr<CChar>> = this.glPathv

    public operator fun component6(): MutPtr<CVoid> = this.unused3

    public operator fun component7(): MutPtr<CVoid> = this.unused4

    public operator fun component8(): MutPtr<CVoid> = this.unused5

    public operator fun component9(): MutPtr<CVoid> = this.unused6

    public operator fun component10(): MutPtr<CVoid> = this.unused7

    public operator fun component11(): MutPtr<CVoid> = this.unused8

    public fun copy(glPathc: SizeT = this.glPathc, glMatchc: SizeT = this.glMatchc, glOffs: SizeT = this.glOffs, glFlags: CInt = this.glFlags, glPathv: MutPtr<MutPtr<CChar>> = this.glPathv, unused3: MutPtr<CVoid> = this.unused3, unused4: MutPtr<CVoid> = this.unused4, unused5: MutPtr<CVoid> = this.unused5, unused6: MutPtr<CVoid> = this.unused6, unused7: MutPtr<CVoid> = this.unused7, unused8: MutPtr<CVoid> = this.unused8): GlobT = GlobT(glPathc = glPathc, glMatchc = glMatchc, glOffs = glOffs, glFlags = glFlags, glPathvCtorArg = glPathv, unused3CtorArg = unused3, unused4CtorArg = unused4, unused5CtorArg = unused5, unused6CtorArg = unused6, unused7CtorArg = unused7, unused8CtorArg = unused8)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is GlobT) return false
        if (this.glPathc != other.glPathc) return false
        if (this.glMatchc != other.glMatchc) return false
        if (this.glOffs != other.glOffs) return false
        if (this.glFlags != other.glFlags) return false
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
        result = 31 * result + this.glMatchc.hashCode()
        result = 31 * result + this.glOffs.hashCode()
        result = 31 * result + this.glFlags.hashCode()
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
            glMatchc: SizeT = 0uL,
            glOffs: SizeT = 0uL,
            glFlags: CInt = 0,
            glPathv: MutPtr<MutPtr<CChar>> = MutPtr(0L),
            unused3: MutPtr<CVoid> = MutPtr(0L),
            unused4: MutPtr<CVoid> = MutPtr(0L),
            unused5: MutPtr<CVoid> = MutPtr(0L),
            unused6: MutPtr<CVoid> = MutPtr(0L),
            unused7: MutPtr<CVoid> = MutPtr(0L),
            unused8: MutPtr<CVoid> = MutPtr(0L),
        ): GlobT = GlobT(
            glPathc = glPathc,
            glMatchc = glMatchc,
            glOffs = glOffs,
            glFlags = glFlags,
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
        ): Tm = Tm(
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

public data class MqAttr(
    public var mqFlags: CLong = 0L,
    public var mqMaxmsg: CLong = 0L,
    public var mqMsgsize: CLong = 0L,
    public var mqCurmsgs: CLong = 0L,
)

public data class SigsetT(
    public var bits: UIntArray = UIntArray(4),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SigsetT) return false
        if (!this.bits.contentEquals(other.bits)) return false
        return true
    }

    override fun hashCode(): Int = this.bits.contentHashCode()

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SigsetT> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SigsetT> {
                override val sizeBytes: Long = 16L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): SigsetT =
                    SigsetT(
                        (io.github.kotlinmania.rustlang.core.mem.FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32, (4).toInt())).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: SigsetT) {
                    (io.github.kotlinmania.rustlang.core.mem.FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32, (4).toInt())).writeNative(addr, value.bits)
                }
            }
    }
}

public class Stat(
    public var stDev: DevT = 0uL,
    public var stMode: ModeT = 0u,
    public var stIno: InoT = 0uL,
    public var stNlink: NlinkT = 0u,
    public var stUid: UidT = 0u,
    public var stGid: GidT = 0u,
    public var stRdev: DevT = 0uL,
    public var stAtime: TimeT = 0L,
    public var stAtimensec: CLong = 0L,
    public var stMtime: TimeT = 0L,
    public var stMtimensec: CLong = 0L,
    public var stCtime: TimeT = 0L,
    public var stCtimensec: CLong = 0L,
    public var stBirthtime: TimeT = 0L,
    public var stBirthtimensec: CLong = 0L,
    public var stSize: OffT = 0L,
    public var stBlocks: BlkcntT = 0L,
    public var stBlksize: BlksizeT = 0,
    public var stFlags: UInt = 0u,
    public var stGen: UInt = 0u,
    public var stSpare: UIntArray = UIntArray(2),
)

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
        ): Addrinfo = Addrinfo(
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

public class SiginfoT internal constructor(
    public var siSigno: CInt,
    public var siCode: CInt,
    public var siErrno: CInt,
    public var pad1: CInt,
    siAddrCtorArg: MutPtr<CVoid>,
    public var pad2: ULongArray,
) {
    public var siAddr: MutPtr<CVoid> = siAddrCtorArg
        internal set

    public constructor() : this(
        siSigno = 0,
        siCode = 0,
        siErrno = 0,
        pad1 = 0,
        siAddrCtorArg = MutPtr(0L),
        pad2 = ULongArray(13),
    )

    public operator fun component1(): CInt = this.siSigno

    public operator fun component2(): CInt = this.siCode

    public operator fun component3(): CInt = this.siErrno

    public operator fun component4(): CInt = this.pad1

    public operator fun component5(): MutPtr<CVoid> = this.siAddr

    public operator fun component6(): ULongArray = this.pad2

    public fun copy(siSigno: CInt = this.siSigno, siCode: CInt = this.siCode, siErrno: CInt = this.siErrno, pad1: CInt = this.pad1, siAddr: MutPtr<CVoid> = this.siAddr, pad2: ULongArray = this.pad2): SiginfoT = SiginfoT(siSigno = siSigno, siCode = siCode, siErrno = siErrno, pad1 = pad1, siAddrCtorArg = siAddr, pad2 = pad2)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SiginfoT) return false
        if (this.siSigno != other.siSigno) return false
        if (this.siCode != other.siCode) return false
        if (this.siErrno != other.siErrno) return false
        if (this.pad1 != other.pad1) return false
        if (this.siAddr != other.siAddr) return false
        if (!this.pad2.contentEquals(other.pad2)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.siSigno.hashCode()
        result = 31 * result + this.siCode.hashCode()
        result = 31 * result + this.siErrno.hashCode()
        result = 31 * result + this.pad1.hashCode()
        result = 31 * result + this.siAddr.hashCode()
        result = 31 * result + this.pad2.contentHashCode()
        return result
    }

    public fun siPid(): PidT {
        data class SiginfoTimer(
            public var siSigno: CInt = 0,
            public var siErrno: CInt = 0,
            public var siCode: CInt = 0,
            public var pad1: CInt = 0,
            public var pid: PidT = 0,
        )
        return (ObjectSlotLayout<SiginfoTimer>()).readNative(((ConstPtr<SiginfoTimer>((constPtrFromRustCast<SiginfoT>(this)).rawAddress, (constPtrFromRustCast<SiginfoT>(this)).rawMeta))).rawAddress).pid
    }

    public fun siUid(): UidT {
        data class SiginfoTimer(
            public var siSigno: CInt = 0,
            public var siErrno: CInt = 0,
            public var siCode: CInt = 0,
            public var pad1: CInt = 0,
            public var pid: PidT = 0,
            public var uid: UidT = 0u,
        )
        return (ObjectSlotLayout<SiginfoTimer>()).readNative(((ConstPtr<SiginfoTimer>((constPtrFromRustCast<SiginfoT>(this)).rawAddress, (constPtrFromRustCast<SiginfoT>(this)).rawMeta))).rawAddress).uid
    }

    public fun siValue(): Sigval {
        data class SiginfoTimer(
            public var siSigno: CInt = 0,
            public var siErrno: CInt = 0,
            public var siCode: CInt = 0,
            public var pad1: CInt = 0,
            public var pid: PidT = 0,
            public var uid: UidT = 0u,
            public var value: Sigval = Sigval(),
        )
        return (ObjectSlotLayout<SiginfoTimer>()).readNative(((ConstPtr<SiginfoTimer>((constPtrFromRustCast<SiginfoT>(this)).rawAddress, (constPtrFromRustCast<SiginfoT>(this)).rawMeta))).rawAddress).value
    }

    public fun siStatus(): CInt {
        data class SiginfoTimer(
            public var siSigno: CInt = 0,
            public var siErrno: CInt = 0,
            public var siCode: CInt = 0,
            public var pad1: CInt = 0,
            public var pid: PidT = 0,
            public var uid: UidT = 0u,
            public var status: CInt = 0,
        )
        return (ObjectSlotLayout<SiginfoTimer>()).readNative(((ConstPtr<SiginfoTimer>((constPtrFromRustCast<SiginfoT>(this)).rawAddress, (constPtrFromRustCast<SiginfoT>(this)).rawMeta))).rawAddress).status
    }

    public companion object {
        public operator fun invoke(
            siSigno: CInt = 0,
            siCode: CInt = 0,
            siErrno: CInt = 0,
            pad1: CInt = 0,
            siAddr: MutPtr<CVoid> = MutPtr(0L),
            pad2: ULongArray = ULongArray(13),
        ): SiginfoT = SiginfoT(
            siSigno = siSigno,
            siCode = siCode,
            siErrno = siErrno,
            pad1 = pad1,
            siAddrCtorArg = siAddr,
            pad2 = pad2,
        )
    }
}

public class PthreadAttrT internal constructor(
    public var ptaMagic: CUint,
    public var ptaFlags: CInt,
    ptaPrivateCtorArg: MutPtr<CVoid>,
) {
    public var ptaPrivate: MutPtr<CVoid> = ptaPrivateCtorArg
        internal set

    public constructor() : this(
        ptaMagic = 0u,
        ptaFlags = 0,
        ptaPrivateCtorArg = MutPtr(0L),
    )

    public operator fun component1(): CUint = this.ptaMagic

    public operator fun component2(): CInt = this.ptaFlags

    public operator fun component3(): MutPtr<CVoid> = this.ptaPrivate

    public fun copy(ptaMagic: CUint = this.ptaMagic, ptaFlags: CInt = this.ptaFlags, ptaPrivate: MutPtr<CVoid> = this.ptaPrivate): PthreadAttrT = PthreadAttrT(ptaMagic = ptaMagic, ptaFlags = ptaFlags, ptaPrivateCtorArg = ptaPrivate)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PthreadAttrT) return false
        if (this.ptaMagic != other.ptaMagic) return false
        if (this.ptaFlags != other.ptaFlags) return false
        if (this.ptaPrivate != other.ptaPrivate) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.ptaMagic.hashCode()
        result = 31 * result + this.ptaFlags.hashCode()
        result = 31 * result + this.ptaPrivate.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<PthreadAttrT> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<PthreadAttrT> {
                override val sizeBytes: Long = 16L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): PthreadAttrT =
                    PthreadAttrT(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.mutPtrLayout<CVoid>(64)).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: PthreadAttrT) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.ptaMagic)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 4L, value.ptaFlags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.mutPtrLayout<CVoid>(64)).writeNative(addr + 8L, value.ptaPrivate)
                }
            }

        public operator fun invoke(
            ptaMagic: CUint = 0u,
            ptaFlags: CInt = 0,
            ptaPrivate: MutPtr<CVoid> = MutPtr(0L),
        ): PthreadAttrT = PthreadAttrT(
            ptaMagic = ptaMagic,
            ptaFlags = ptaFlags,
            ptaPrivateCtorArg = ptaPrivate,
        )
    }
}

public class PthreadMutexT internal constructor(
    public var ptmMagic: CUint,
    public var ptmErrorcheck: PthreadSpinT,
    public var ptmPad1: UByteArray,
    // actually a union with a non-unused, 0-initialized field
    public var ptmUnused: PthreadSpinT,
    public var ptmPad2: UByteArray,
    ptmOwnerCtorArg: PthreadT,
    ptmWaitersCtorArg: MutPtr<UByte>,
    public var ptmRecursed: CUint,
    ptmSpare2CtorArg: MutPtr<CVoid>,
) {
    public var ptmOwner: PthreadT = ptmOwnerCtorArg
        internal set

    public var ptmWaiters: MutPtr<UByte> = ptmWaitersCtorArg
        internal set

    public var ptmSpare2: MutPtr<CVoid> = ptmSpare2CtorArg
        internal set

    public constructor() : this(
        ptmMagic = 0u,
        ptmErrorcheck = 0u,
        ptmPad1 = UByteArray(3),
        ptmUnused = 0u,
        ptmPad2 = UByteArray(3),
        ptmOwnerCtorArg = 0uL,
        ptmWaitersCtorArg = MutPtr(0L),
        ptmRecursed = 0u,
        ptmSpare2CtorArg = MutPtr(0L),
    )

    public operator fun component1(): CUint = this.ptmMagic

    public operator fun component2(): PthreadSpinT = this.ptmErrorcheck

    public operator fun component3(): UByteArray = this.ptmPad1

    public operator fun component4(): PthreadSpinT = this.ptmUnused

    public operator fun component5(): UByteArray = this.ptmPad2

    public operator fun component6(): PthreadT = this.ptmOwner

    public operator fun component7(): MutPtr<UByte> = this.ptmWaiters

    public operator fun component8(): CUint = this.ptmRecursed

    public operator fun component9(): MutPtr<CVoid> = this.ptmSpare2

    public fun copy(ptmMagic: CUint = this.ptmMagic, ptmErrorcheck: PthreadSpinT = this.ptmErrorcheck, ptmPad1: UByteArray = this.ptmPad1, ptmUnused: PthreadSpinT = this.ptmUnused, ptmPad2: UByteArray = this.ptmPad2, ptmOwner: PthreadT = this.ptmOwner, ptmWaiters: MutPtr<UByte> = this.ptmWaiters, ptmRecursed: CUint = this.ptmRecursed, ptmSpare2: MutPtr<CVoid> = this.ptmSpare2): PthreadMutexT = PthreadMutexT(ptmMagic = ptmMagic, ptmErrorcheck = ptmErrorcheck, ptmPad1 = ptmPad1, ptmUnused = ptmUnused, ptmPad2 = ptmPad2, ptmOwnerCtorArg = ptmOwner, ptmWaitersCtorArg = ptmWaiters, ptmRecursed = ptmRecursed, ptmSpare2CtorArg = ptmSpare2)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PthreadMutexT) return false
        if (this.ptmMagic != other.ptmMagic) return false
        if (this.ptmErrorcheck != other.ptmErrorcheck) return false
        if (!this.ptmPad1.contentEquals(other.ptmPad1)) return false
        if (this.ptmUnused != other.ptmUnused) return false
        if (!this.ptmPad2.contentEquals(other.ptmPad2)) return false
        if (this.ptmOwner != other.ptmOwner) return false
        if (this.ptmWaiters != other.ptmWaiters) return false
        if (this.ptmRecursed != other.ptmRecursed) return false
        if (this.ptmSpare2 != other.ptmSpare2) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.ptmMagic.hashCode()
        result = 31 * result + this.ptmErrorcheck.hashCode()
        result = 31 * result + this.ptmPad1.contentHashCode()
        result = 31 * result + this.ptmUnused.hashCode()
        result = 31 * result + this.ptmPad2.contentHashCode()
        result = 31 * result + this.ptmOwner.hashCode()
        result = 31 * result + this.ptmWaiters.hashCode()
        result = 31 * result + this.ptmRecursed.hashCode()
        result = 31 * result + this.ptmSpare2.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            ptmMagic: CUint = 0u,
            ptmErrorcheck: PthreadSpinT = 0u,
            ptmPad1: UByteArray = UByteArray(3),
            ptmUnused: PthreadSpinT = 0u,
            ptmPad2: UByteArray = UByteArray(3),
            ptmOwner: PthreadT = 0uL,
            ptmWaiters: MutPtr<UByte> = MutPtr(0L),
            ptmRecursed: CUint = 0u,
            ptmSpare2: MutPtr<CVoid> = MutPtr(0L),
        ): PthreadMutexT = PthreadMutexT(
            ptmMagic = ptmMagic,
            ptmErrorcheck = ptmErrorcheck,
            ptmPad1 = ptmPad1,
            ptmUnused = ptmUnused,
            ptmPad2 = ptmPad2,
            ptmOwnerCtorArg = ptmOwner,
            ptmWaitersCtorArg = ptmWaiters,
            ptmRecursed = ptmRecursed,
            ptmSpare2CtorArg = ptmSpare2,
        )
    }
}

public class PthreadMutexattrT internal constructor(
    public var ptmaMagic: CUint,
    ptmaPrivateCtorArg: MutPtr<CVoid>,
) {
    public var ptmaPrivate: MutPtr<CVoid> = ptmaPrivateCtorArg
        internal set

    public constructor() : this(
        ptmaMagic = 0u,
        ptmaPrivateCtorArg = MutPtr(0L),
    )

    public operator fun component1(): CUint = this.ptmaMagic

    public operator fun component2(): MutPtr<CVoid> = this.ptmaPrivate

    public fun copy(ptmaMagic: CUint = this.ptmaMagic, ptmaPrivate: MutPtr<CVoid> = this.ptmaPrivate): PthreadMutexattrT = PthreadMutexattrT(ptmaMagic = ptmaMagic, ptmaPrivateCtorArg = ptmaPrivate)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PthreadMutexattrT) return false
        if (this.ptmaMagic != other.ptmaMagic) return false
        if (this.ptmaPrivate != other.ptmaPrivate) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.ptmaMagic.hashCode()
        result = 31 * result + this.ptmaPrivate.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<PthreadMutexattrT> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<PthreadMutexattrT> {
                override val sizeBytes: Long = 16L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): PthreadMutexattrT =
                    PthreadMutexattrT(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.mutPtrLayout<CVoid>(64)).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: PthreadMutexattrT) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.ptmaMagic)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.mutPtrLayout<CVoid>(64)).writeNative(addr + 8L, value.ptmaPrivate)
                }
            }

        public operator fun invoke(
            ptmaMagic: CUint = 0u,
            ptmaPrivate: MutPtr<CVoid> = MutPtr(0L),
        ): PthreadMutexattrT = PthreadMutexattrT(
            ptmaMagic = ptmaMagic,
            ptmaPrivateCtorArg = ptmaPrivate,
        )
    }
}

public class PthreadRwlockattrT internal constructor(
    public var ptraMagic: CUint,
    ptraPrivateCtorArg: MutPtr<CVoid>,
) {
    public var ptraPrivate: MutPtr<CVoid> = ptraPrivateCtorArg
        internal set

    public constructor() : this(
        ptraMagic = 0u,
        ptraPrivateCtorArg = MutPtr(0L),
    )

    public operator fun component1(): CUint = this.ptraMagic

    public operator fun component2(): MutPtr<CVoid> = this.ptraPrivate

    public fun copy(ptraMagic: CUint = this.ptraMagic, ptraPrivate: MutPtr<CVoid> = this.ptraPrivate): PthreadRwlockattrT = PthreadRwlockattrT(ptraMagic = ptraMagic, ptraPrivateCtorArg = ptraPrivate)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PthreadRwlockattrT) return false
        if (this.ptraMagic != other.ptraMagic) return false
        if (this.ptraPrivate != other.ptraPrivate) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.ptraMagic.hashCode()
        result = 31 * result + this.ptraPrivate.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<PthreadRwlockattrT> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<PthreadRwlockattrT> {
                override val sizeBytes: Long = 16L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): PthreadRwlockattrT =
                    PthreadRwlockattrT(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.mutPtrLayout<CVoid>(64)).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: PthreadRwlockattrT) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.ptraMagic)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.mutPtrLayout<CVoid>(64)).writeNative(addr + 8L, value.ptraPrivate)
                }
            }

        public operator fun invoke(
            ptraMagic: CUint = 0u,
            ptraPrivate: MutPtr<CVoid> = MutPtr(0L),
        ): PthreadRwlockattrT = PthreadRwlockattrT(
            ptraMagic = ptraMagic,
            ptraPrivateCtorArg = ptraPrivate,
        )
    }
}

public class PthreadCondT internal constructor(
    public var ptcMagic: CUint,
    public var ptcLock: PthreadSpinT,
    ptcWaitersFirstCtorArg: MutPtr<UByte>,
    ptcWaitersLastCtorArg: MutPtr<UByte>,
    ptcMutexCtorArg: MutPtr<PthreadMutexT>,
    ptcPrivateCtorArg: MutPtr<CVoid>,
) {
    public var ptcWaitersFirst: MutPtr<UByte> = ptcWaitersFirstCtorArg
        internal set

    public var ptcWaitersLast: MutPtr<UByte> = ptcWaitersLastCtorArg
        internal set

    public var ptcMutex: MutPtr<PthreadMutexT> = ptcMutexCtorArg
        internal set

    public var ptcPrivate: MutPtr<CVoid> = ptcPrivateCtorArg
        internal set

    public constructor() : this(
        ptcMagic = 0u,
        ptcLock = 0u,
        ptcWaitersFirstCtorArg = MutPtr(0L),
        ptcWaitersLastCtorArg = MutPtr(0L),
        ptcMutexCtorArg = MutPtr(0L),
        ptcPrivateCtorArg = MutPtr(0L),
    )

    public operator fun component1(): CUint = this.ptcMagic

    public operator fun component2(): PthreadSpinT = this.ptcLock

    public operator fun component3(): MutPtr<UByte> = this.ptcWaitersFirst

    public operator fun component4(): MutPtr<UByte> = this.ptcWaitersLast

    public operator fun component5(): MutPtr<PthreadMutexT> = this.ptcMutex

    public operator fun component6(): MutPtr<CVoid> = this.ptcPrivate

    public fun copy(ptcMagic: CUint = this.ptcMagic, ptcLock: PthreadSpinT = this.ptcLock, ptcWaitersFirst: MutPtr<UByte> = this.ptcWaitersFirst, ptcWaitersLast: MutPtr<UByte> = this.ptcWaitersLast, ptcMutex: MutPtr<PthreadMutexT> = this.ptcMutex, ptcPrivate: MutPtr<CVoid> = this.ptcPrivate): PthreadCondT = PthreadCondT(ptcMagic = ptcMagic, ptcLock = ptcLock, ptcWaitersFirstCtorArg = ptcWaitersFirst, ptcWaitersLastCtorArg = ptcWaitersLast, ptcMutexCtorArg = ptcMutex, ptcPrivateCtorArg = ptcPrivate)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PthreadCondT) return false
        if (this.ptcMagic != other.ptcMagic) return false
        if (this.ptcLock != other.ptcLock) return false
        if (this.ptcWaitersFirst != other.ptcWaitersFirst) return false
        if (this.ptcWaitersLast != other.ptcWaitersLast) return false
        if (this.ptcMutex != other.ptcMutex) return false
        if (this.ptcPrivate != other.ptcPrivate) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.ptcMagic.hashCode()
        result = 31 * result + this.ptcLock.hashCode()
        result = 31 * result + this.ptcWaitersFirst.hashCode()
        result = 31 * result + this.ptcWaitersLast.hashCode()
        result = 31 * result + this.ptcMutex.hashCode()
        result = 31 * result + this.ptcPrivate.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            ptcMagic: CUint = 0u,
            ptcLock: PthreadSpinT = 0u,
            ptcWaitersFirst: MutPtr<UByte> = MutPtr(0L),
            ptcWaitersLast: MutPtr<UByte> = MutPtr(0L),
            ptcMutex: MutPtr<PthreadMutexT> = MutPtr(0L),
            ptcPrivate: MutPtr<CVoid> = MutPtr(0L),
        ): PthreadCondT = PthreadCondT(
            ptcMagic = ptcMagic,
            ptcLock = ptcLock,
            ptcWaitersFirstCtorArg = ptcWaitersFirst,
            ptcWaitersLastCtorArg = ptcWaitersLast,
            ptcMutexCtorArg = ptcMutex,
            ptcPrivateCtorArg = ptcPrivate,
        )
    }
}

public class PthreadCondattrT internal constructor(
    public var ptcaMagic: CUint,
    ptcaPrivateCtorArg: MutPtr<CVoid>,
) {
    public var ptcaPrivate: MutPtr<CVoid> = ptcaPrivateCtorArg
        internal set

    public constructor() : this(
        ptcaMagic = 0u,
        ptcaPrivateCtorArg = MutPtr(0L),
    )

    public operator fun component1(): CUint = this.ptcaMagic

    public operator fun component2(): MutPtr<CVoid> = this.ptcaPrivate

    public fun copy(ptcaMagic: CUint = this.ptcaMagic, ptcaPrivate: MutPtr<CVoid> = this.ptcaPrivate): PthreadCondattrT = PthreadCondattrT(ptcaMagic = ptcaMagic, ptcaPrivateCtorArg = ptcaPrivate)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PthreadCondattrT) return false
        if (this.ptcaMagic != other.ptcaMagic) return false
        if (this.ptcaPrivate != other.ptcaPrivate) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.ptcaMagic.hashCode()
        result = 31 * result + this.ptcaPrivate.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<PthreadCondattrT> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<PthreadCondattrT> {
                override val sizeBytes: Long = 16L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): PthreadCondattrT =
                    PthreadCondattrT(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.mutPtrLayout<CVoid>(64)).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: PthreadCondattrT) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.ptcaMagic)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.mutPtrLayout<CVoid>(64)).writeNative(addr + 8L, value.ptcaPrivate)
                }
            }

        public operator fun invoke(
            ptcaMagic: CUint = 0u,
            ptcaPrivate: MutPtr<CVoid> = MutPtr(0L),
        ): PthreadCondattrT = PthreadCondattrT(
            ptcaMagic = ptcaMagic,
            ptcaPrivateCtorArg = ptcaPrivate,
        )
    }
}

public class PthreadRwlockT internal constructor(
    public var ptrMagic: CUint,
    public var ptrInterlock: PthreadSpinT,
    ptrRblockedFirstCtorArg: MutPtr<UByte>,
    ptrRblockedLastCtorArg: MutPtr<UByte>,
    ptrWblockedFirstCtorArg: MutPtr<UByte>,
    ptrWblockedLastCtorArg: MutPtr<UByte>,
    public var ptrNreaders: CUint,
    ptrOwnerCtorArg: PthreadT,
    ptrPrivateCtorArg: MutPtr<CVoid>,
) {
    public var ptrRblockedFirst: MutPtr<UByte> = ptrRblockedFirstCtorArg
        internal set

    public var ptrRblockedLast: MutPtr<UByte> = ptrRblockedLastCtorArg
        internal set

    public var ptrWblockedFirst: MutPtr<UByte> = ptrWblockedFirstCtorArg
        internal set

    public var ptrWblockedLast: MutPtr<UByte> = ptrWblockedLastCtorArg
        internal set

    public var ptrOwner: PthreadT = ptrOwnerCtorArg
        internal set

    public var ptrPrivate: MutPtr<CVoid> = ptrPrivateCtorArg
        internal set

    public constructor() : this(
        ptrMagic = 0u,
        ptrInterlock = 0u,
        ptrRblockedFirstCtorArg = MutPtr(0L),
        ptrRblockedLastCtorArg = MutPtr(0L),
        ptrWblockedFirstCtorArg = MutPtr(0L),
        ptrWblockedLastCtorArg = MutPtr(0L),
        ptrNreaders = 0u,
        ptrOwnerCtorArg = 0uL,
        ptrPrivateCtorArg = MutPtr(0L),
    )

    public operator fun component1(): CUint = this.ptrMagic

    public operator fun component2(): PthreadSpinT = this.ptrInterlock

    public operator fun component3(): MutPtr<UByte> = this.ptrRblockedFirst

    public operator fun component4(): MutPtr<UByte> = this.ptrRblockedLast

    public operator fun component5(): MutPtr<UByte> = this.ptrWblockedFirst

    public operator fun component6(): MutPtr<UByte> = this.ptrWblockedLast

    public operator fun component7(): CUint = this.ptrNreaders

    public operator fun component8(): PthreadT = this.ptrOwner

    public operator fun component9(): MutPtr<CVoid> = this.ptrPrivate

    public fun copy(ptrMagic: CUint = this.ptrMagic, ptrInterlock: PthreadSpinT = this.ptrInterlock, ptrRblockedFirst: MutPtr<UByte> = this.ptrRblockedFirst, ptrRblockedLast: MutPtr<UByte> = this.ptrRblockedLast, ptrWblockedFirst: MutPtr<UByte> = this.ptrWblockedFirst, ptrWblockedLast: MutPtr<UByte> = this.ptrWblockedLast, ptrNreaders: CUint = this.ptrNreaders, ptrOwner: PthreadT = this.ptrOwner, ptrPrivate: MutPtr<CVoid> = this.ptrPrivate): PthreadRwlockT = PthreadRwlockT(ptrMagic = ptrMagic, ptrInterlock = ptrInterlock, ptrRblockedFirstCtorArg = ptrRblockedFirst, ptrRblockedLastCtorArg = ptrRblockedLast, ptrWblockedFirstCtorArg = ptrWblockedFirst, ptrWblockedLastCtorArg = ptrWblockedLast, ptrNreaders = ptrNreaders, ptrOwnerCtorArg = ptrOwner, ptrPrivateCtorArg = ptrPrivate)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PthreadRwlockT) return false
        if (this.ptrMagic != other.ptrMagic) return false
        if (this.ptrInterlock != other.ptrInterlock) return false
        if (this.ptrRblockedFirst != other.ptrRblockedFirst) return false
        if (this.ptrRblockedLast != other.ptrRblockedLast) return false
        if (this.ptrWblockedFirst != other.ptrWblockedFirst) return false
        if (this.ptrWblockedLast != other.ptrWblockedLast) return false
        if (this.ptrNreaders != other.ptrNreaders) return false
        if (this.ptrOwner != other.ptrOwner) return false
        if (this.ptrPrivate != other.ptrPrivate) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.ptrMagic.hashCode()
        result = 31 * result + this.ptrInterlock.hashCode()
        result = 31 * result + this.ptrRblockedFirst.hashCode()
        result = 31 * result + this.ptrRblockedLast.hashCode()
        result = 31 * result + this.ptrWblockedFirst.hashCode()
        result = 31 * result + this.ptrWblockedLast.hashCode()
        result = 31 * result + this.ptrNreaders.hashCode()
        result = 31 * result + this.ptrOwner.hashCode()
        result = 31 * result + this.ptrPrivate.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            ptrMagic: CUint = 0u,
            ptrInterlock: PthreadSpinT = 0u,
            ptrRblockedFirst: MutPtr<UByte> = MutPtr(0L),
            ptrRblockedLast: MutPtr<UByte> = MutPtr(0L),
            ptrWblockedFirst: MutPtr<UByte> = MutPtr(0L),
            ptrWblockedLast: MutPtr<UByte> = MutPtr(0L),
            ptrNreaders: CUint = 0u,
            ptrOwner: PthreadT = 0uL,
            ptrPrivate: MutPtr<CVoid> = MutPtr(0L),
        ): PthreadRwlockT = PthreadRwlockT(
            ptrMagic = ptrMagic,
            ptrInterlock = ptrInterlock,
            ptrRblockedFirstCtorArg = ptrRblockedFirst,
            ptrRblockedLastCtorArg = ptrRblockedLast,
            ptrWblockedFirstCtorArg = ptrWblockedFirst,
            ptrWblockedLastCtorArg = ptrWblockedLast,
            ptrNreaders = ptrNreaders,
            ptrOwnerCtorArg = ptrOwner,
            ptrPrivateCtorArg = ptrPrivate,
        )
    }
}

public data class PthreadSpinlockT(
    public var ptsMagic: CUint = 0u,
    public var ptsSpin: PthreadSpinT = 0u,
    public var ptsFlags: CInt = 0,
)

public class Kevent internal constructor(
    public var ident: UintptrT,
    public var filter: UInt,
    public var flags: UInt,
    public var fflags: UInt,
    public var data: Long,
    udataCtorArg: MutPtr<CVoid>,
) {
    public var udata: MutPtr<CVoid> = udataCtorArg
        internal set

    public constructor() : this(
        ident = 0uL,
        filter = 0u,
        flags = 0u,
        fflags = 0u,
        data = 0L,
        udataCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UintptrT = this.ident

    public operator fun component2(): UInt = this.filter

    public operator fun component3(): UInt = this.flags

    public operator fun component4(): UInt = this.fflags

    public operator fun component5(): Long = this.data

    public operator fun component6(): MutPtr<CVoid> = this.udata

    public fun copy(ident: UintptrT = this.ident, filter: UInt = this.filter, flags: UInt = this.flags, fflags: UInt = this.fflags, data: Long = this.data, udata: MutPtr<CVoid> = this.udata): Kevent = Kevent(ident = ident, filter = filter, flags = flags, fflags = fflags, data = data, udataCtorArg = udata)

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
                override val sizeBytes: Long = 40L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): Kevent =
                    Kevent(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.mutPtrLayout<CVoid>(64)).readNative(addr + 32L),
                    )
                override fun writeNative(addr: Long, value: Kevent) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).writeNative(addr, value.ident)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.filter)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.flags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.fflags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 24L, value.data)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.mutPtrLayout<CVoid>(64)).writeNative(addr + 32L, value.udata)
                }
            }

        public operator fun invoke(
            ident: UintptrT = 0uL,
            filter: UInt = 0u,
            flags: UInt = 0u,
            fflags: UInt = 0u,
            data: Long = 0L,
            udata: MutPtr<CVoid> = MutPtr(0L),
        ): Kevent = Kevent(
            ident = ident,
            filter = filter,
            flags = flags,
            fflags = fflags,
            data = data,
            udataCtorArg = udata,
        )
    }
}

public data class Dqblk(
    public var dqbBhardlimit: UInt = 0u,
    public var dqbBsoftlimit: UInt = 0u,
    public var dqbCurblocks: UInt = 0u,
    public var dqbIhardlimit: UInt = 0u,
    public var dqbIsoftlimit: UInt = 0u,
    public var dqbCurinodes: UInt = 0u,
    public var dqbBtime: Int = 0,
    public var dqbItime: Int = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Dqblk> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Dqblk> {
                override val sizeBytes: Long = 32L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): Dqblk =
                    Dqblk(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 20L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 28L),
                    )
                override fun writeNative(addr: Long, value: Dqblk) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dqbBhardlimit)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.dqbBsoftlimit)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.dqbCurblocks)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.dqbIhardlimit)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.dqbIsoftlimit)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.dqbCurinodes)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 24L, value.dqbBtime)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 28L, value.dqbItime)
                }
            }
    }
}

public class DlInfo internal constructor(
    dliFnameCtorArg: ConstPtr<CChar>,
    dliFbaseCtorArg: MutPtr<CVoid>,
    dliSnameCtorArg: ConstPtr<CChar>,
    dliSaddrCtorArg: ConstPtr<CVoid>,
) {
    public var dliFname: ConstPtr<CChar> = dliFnameCtorArg
        internal set

    public var dliFbase: MutPtr<CVoid> = dliFbaseCtorArg
        internal set

    public var dliSname: ConstPtr<CChar> = dliSnameCtorArg
        internal set

    public var dliSaddr: ConstPtr<CVoid> = dliSaddrCtorArg
        internal set

    public constructor() : this(
        dliFnameCtorArg = ConstPtr(0L),
        dliFbaseCtorArg = MutPtr(0L),
        dliSnameCtorArg = ConstPtr(0L),
        dliSaddrCtorArg = ConstPtr(0L),
    )

    public operator fun component1(): ConstPtr<CChar> = this.dliFname

    public operator fun component2(): MutPtr<CVoid> = this.dliFbase

    public operator fun component3(): ConstPtr<CChar> = this.dliSname

    public operator fun component4(): ConstPtr<CVoid> = this.dliSaddr

    public fun copy(dliFname: ConstPtr<CChar> = this.dliFname, dliFbase: MutPtr<CVoid> = this.dliFbase, dliSname: ConstPtr<CChar> = this.dliSname, dliSaddr: ConstPtr<CVoid> = this.dliSaddr): DlInfo = DlInfo(dliFnameCtorArg = dliFname, dliFbaseCtorArg = dliFbase, dliSnameCtorArg = dliSname, dliSaddrCtorArg = dliSaddr)

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
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.constPtrLayout<CChar>(64)).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.mutPtrLayout<CVoid>(64)).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.constPtrLayout<CChar>(64)).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.constPtrLayout<CVoid>(64)).readNative(addr + 24L),
                    )
                override fun writeNative(addr: Long, value: DlInfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.constPtrLayout<CChar>(64)).writeNative(addr, value.dliFname)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.mutPtrLayout<CVoid>(64)).writeNative(addr + 8L, value.dliFbase)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.constPtrLayout<CChar>(64)).writeNative(addr + 16L, value.dliSname)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.constPtrLayout<CVoid>(64)).writeNative(addr + 24L, value.dliSaddr)
                }
            }

        public operator fun invoke(
            dliFname: ConstPtr<CChar> = ConstPtr(0L),
            dliFbase: MutPtr<CVoid> = MutPtr(0L),
            dliSname: ConstPtr<CChar> = ConstPtr(0L),
            dliSaddr: ConstPtr<CVoid> = ConstPtr(0L),
        ): DlInfo = DlInfo(
            dliFnameCtorArg = dliFname,
            dliFbaseCtorArg = dliFbase,
            dliSnameCtorArg = dliSname,
            dliSaddrCtorArg = dliSaddr,
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
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.mutPtrLayout<CChar>(64)).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.mutPtrLayout<CChar>(64)).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.mutPtrLayout<CChar>(64)).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.mutPtrLayout<CChar>(64)).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.mutPtrLayout<CChar>(64)).readNative(addr + 32L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.mutPtrLayout<CChar>(64)).readNative(addr + 40L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.mutPtrLayout<CChar>(64)).readNative(addr + 48L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.mutPtrLayout<CChar>(64)).readNative(addr + 56L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.mutPtrLayout<CChar>(64)).readNative(addr + 64L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.mutPtrLayout<CChar>(64)).readNative(addr + 72L),
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
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.mutPtrLayout<CChar>(64)).writeNative(addr, value.decimalPoint)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.mutPtrLayout<CChar>(64)).writeNative(addr + 8L, value.thousandsSep)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.mutPtrLayout<CChar>(64)).writeNative(addr + 16L, value.grouping)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.mutPtrLayout<CChar>(64)).writeNative(addr + 24L, value.intCurrSymbol)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.mutPtrLayout<CChar>(64)).writeNative(addr + 32L, value.currencySymbol)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.mutPtrLayout<CChar>(64)).writeNative(addr + 40L, value.monDecimalPoint)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.mutPtrLayout<CChar>(64)).writeNative(addr + 48L, value.monThousandsSep)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.mutPtrLayout<CChar>(64)).writeNative(addr + 56L, value.monGrouping)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.mutPtrLayout<CChar>(64)).writeNative(addr + 64L, value.positiveSign)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.mutPtrLayout<CChar>(64)).writeNative(addr + 72L, value.negativeSign)
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
        ): Lconv = Lconv(
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

public data class Sockcred(
    public var scPid: PidT = 0,
    public var scUid: UidT = 0u,
    public var scEuid: UidT = 0u,
    public var scGid: GidT = 0u,
    public var scEgid: GidT = 0u,
    public var scNgroups: CInt = 0,
    public var scGroups: UShortArray = UShortArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Sockcred) return false
        if (this.scPid != other.scPid) return false
        if (this.scUid != other.scUid) return false
        if (this.scEuid != other.scEuid) return false
        if (this.scGid != other.scGid) return false
        if (this.scEgid != other.scEgid) return false
        if (this.scNgroups != other.scNgroups) return false
        if (!this.scGroups.contentEquals(other.scGroups)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.scPid.hashCode()
        result = 31 * result + this.scUid.hashCode()
        result = 31 * result + this.scEuid.hashCode()
        result = 31 * result + this.scGid.hashCode()
        result = 31 * result + this.scEgid.hashCode()
        result = 31 * result + this.scNgroups.hashCode()
        result = 31 * result + this.scGroups.contentHashCode()
        return result
    }
}

public data class Uucred(
    public var crUnused: CUshort = 0u,
    public var crUid: UidT = 0u,
    public var crGid: GidT = 0u,
    public var crNgroups: CShort = 0,
    public var crGroups: UShortArray = UShortArray(NGROUPS_MAX),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Uucred) return false
        if (this.crUnused != other.crUnused) return false
        if (this.crUid != other.crUid) return false
        if (this.crGid != other.crGid) return false
        if (this.crNgroups != other.crNgroups) return false
        if (!this.crGroups.contentEquals(other.crGroups)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.crUnused.hashCode()
        result = 31 * result + this.crUid.hashCode()
        result = 31 * result + this.crGid.hashCode()
        result = 31 * result + this.crNgroups.hashCode()
        result = 31 * result + this.crGroups.contentHashCode()
        return result
    }
}

public data class Unpcbid(
    public var unpPid: PidT = 0,
    public var unpEuid: UidT = 0u,
    public var unpEgid: GidT = 0u,
)

public data class SockaddrDl(
    public var sdlLen: CUchar = 0u,
    public var sdlFamily: CUchar = 0u,
    public var sdlIndex: CUshort = 0u,
    public var sdlType: UByte = 0u,
    public var sdlNlen: UByte = 0u,
    public var sdlAlen: UByte = 0u,
    public var sdlSlen: UByte = 0u,
    public var sdlData: UByteArray = UByteArray(24),
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
                override val sizeBytes: Long = 32L
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
                        (io.github.kotlinmania.rustlang.core.mem.FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (24).toInt())).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: SockaddrDl) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr, value.sdlLen)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 1L, value.sdlFamily)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 2L, value.sdlIndex)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 4L, value.sdlType)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 5L, value.sdlNlen)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 6L, value.sdlAlen)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 7L, value.sdlSlen)
                    (io.github.kotlinmania.rustlang.core.mem.FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (24).toInt())).writeNative(addr + 8L, value.sdlData)
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
    shmInternalCtorArg: MutPtr<CVoid>,
) {
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
        ): ShmidDs = ShmidDs(
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

// elf.h
public data class Elf32Phdr(
    public var pType: Elf32Word = 0u,
    public var pOffset: Elf32Off = 0u,
    public var pVaddr: Elf32Addr = 0u,
    public var pPaddr: Elf32Addr = 0u,
    public var pFilesz: Elf32Word = 0u,
    public var pMemsz: Elf32Word = 0u,
    public var pFlags: Elf32Word = 0u,
    public var pAlign: Elf32Word = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Elf32Phdr> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Elf32Phdr> {
                override val sizeBytes: Long = 32L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): Elf32Phdr =
                    Elf32Phdr(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 20L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 28L),
                    )
                override fun writeNative(addr: Long, value: Elf32Phdr) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.pType)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.pOffset)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.pVaddr)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.pPaddr)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.pFilesz)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.pMemsz)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 24L, value.pFlags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 28L, value.pAlign)
                }
            }
    }
}

public data class Elf64Phdr(
    public var pType: Elf64Word = 0u,
    public var pFlags: Elf64Word = 0u,
    public var pOffset: Elf64Off = 0uL,
    public var pVaddr: Elf64Addr = 0uL,
    public var pPaddr: Elf64Addr = 0uL,
    public var pFilesz: Elf64Xword = 0uL,
    public var pMemsz: Elf64Xword = 0uL,
    public var pAlign: Elf64Xword = 0uL,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Elf64Phdr> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Elf64Phdr> {
                override val sizeBytes: Long = 56L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): Elf64Phdr =
                    Elf64Phdr(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 32L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 40L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 48L),
                    )
                override fun writeNative(addr: Long, value: Elf64Phdr) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.pType)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.pFlags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 8L, value.pOffset)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 16L, value.pVaddr)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 24L, value.pPaddr)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 32L, value.pFilesz)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 40L, value.pMemsz)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 48L, value.pAlign)
                }
            }
    }
}

public data class Aux32Info(
    public var aType: Elf32Word = 0u,
    public var aV: Elf32Word = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Aux32Info> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Aux32Info> {
                override val sizeBytes: Long = 8L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): Aux32Info =
                    Aux32Info(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: Aux32Info) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.aType)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.aV)
                }
            }
    }
}

public data class Aux64Info(
    public var aType: Elf64Word = 0u,
    public var aV: Elf64Xword = 0uL,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Aux64Info> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Aux64Info> {
                override val sizeBytes: Long = 16L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): Aux64Info =
                    Aux64Info(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: Aux64Info) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.aType)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 8L, value.aV)
                }
            }
    }
}

// link.h
public class DlPhdrInfo internal constructor(
    public var dlpiAddr: ElfAddr,
    dlpiNameCtorArg: ConstPtr<CChar>,
    dlpiPhdrCtorArg: ConstPtr<ElfPhdr>,
    public var dlpiPhnum: ElfHalf,
    public var dlpiAdds: CUlonglong,
    public var dlpiSubs: CUlonglong,
    public var dlpiTlsModid: Int,
    dlpiTlsDataCtorArg: MutPtr<CVoid>,
) {
    public var dlpiName: ConstPtr<CChar> = dlpiNameCtorArg
        internal set

    public var dlpiPhdr: ConstPtr<ElfPhdr> = dlpiPhdrCtorArg
        internal set

    public var dlpiTlsData: MutPtr<CVoid> = dlpiTlsDataCtorArg
        internal set

    public constructor() : this(
        dlpiAddr = 0u,
        dlpiNameCtorArg = ConstPtr(0L),
        dlpiPhdrCtorArg = ConstPtr(0L),
        dlpiPhnum = 0u,
        dlpiAdds = 0uL,
        dlpiSubs = 0uL,
        dlpiTlsModid = 0,
        dlpiTlsDataCtorArg = MutPtr(0L),
    )

    public operator fun component1(): ElfAddr = this.dlpiAddr

    public operator fun component2(): ConstPtr<CChar> = this.dlpiName

    public operator fun component3(): ConstPtr<ElfPhdr> = this.dlpiPhdr

    public operator fun component4(): ElfHalf = this.dlpiPhnum

    public operator fun component5(): CUlonglong = this.dlpiAdds

    public operator fun component6(): CUlonglong = this.dlpiSubs

    public operator fun component7(): Int = this.dlpiTlsModid

    public operator fun component8(): MutPtr<CVoid> = this.dlpiTlsData

    public fun copy(dlpiAddr: ElfAddr = this.dlpiAddr, dlpiName: ConstPtr<CChar> = this.dlpiName, dlpiPhdr: ConstPtr<ElfPhdr> = this.dlpiPhdr, dlpiPhnum: ElfHalf = this.dlpiPhnum, dlpiAdds: CUlonglong = this.dlpiAdds, dlpiSubs: CUlonglong = this.dlpiSubs, dlpiTlsModid: Int = this.dlpiTlsModid, dlpiTlsData: MutPtr<CVoid> = this.dlpiTlsData): DlPhdrInfo = DlPhdrInfo(dlpiAddr = dlpiAddr, dlpiNameCtorArg = dlpiName, dlpiPhdrCtorArg = dlpiPhdr, dlpiPhnum = dlpiPhnum, dlpiAdds = dlpiAdds, dlpiSubs = dlpiSubs, dlpiTlsModid = dlpiTlsModid, dlpiTlsDataCtorArg = dlpiTlsData)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DlPhdrInfo) return false
        if (this.dlpiAddr != other.dlpiAddr) return false
        if (this.dlpiName != other.dlpiName) return false
        if (this.dlpiPhdr != other.dlpiPhdr) return false
        if (this.dlpiPhnum != other.dlpiPhnum) return false
        if (this.dlpiAdds != other.dlpiAdds) return false
        if (this.dlpiSubs != other.dlpiSubs) return false
        if (this.dlpiTlsModid != other.dlpiTlsModid) return false
        if (this.dlpiTlsData != other.dlpiTlsData) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dlpiAddr.hashCode()
        result = 31 * result + this.dlpiName.hashCode()
        result = 31 * result + this.dlpiPhdr.hashCode()
        result = 31 * result + this.dlpiPhnum.hashCode()
        result = 31 * result + this.dlpiAdds.hashCode()
        result = 31 * result + this.dlpiSubs.hashCode()
        result = 31 * result + this.dlpiTlsModid.hashCode()
        result = 31 * result + this.dlpiTlsData.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<DlPhdrInfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<DlPhdrInfo> {
                override val sizeBytes: Long = 64L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): DlPhdrInfo =
                    DlPhdrInfo(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.constPtrLayout<CChar>(64)).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.constPtrLayout<ElfPhdr>(64)).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 32L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 40L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).readNative(addr + 48L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.mutPtrLayout<CVoid>(64)).readNative(addr + 56L),
                    )
                override fun writeNative(addr: Long, value: DlPhdrInfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr, value.dlpiAddr)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.constPtrLayout<CChar>(64)).writeNative(addr + 8L, value.dlpiName)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.constPtrLayout<ElfPhdr>(64)).writeNative(addr + 16L, value.dlpiPhdr)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 24L, value.dlpiPhnum)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 32L, value.dlpiAdds)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 40L, value.dlpiSubs)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).writeNative(addr + 48L, value.dlpiTlsModid)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.mutPtrLayout<CVoid>(64)).writeNative(addr + 56L, value.dlpiTlsData)
                }
            }

        public operator fun invoke(
            dlpiAddr: ElfAddr = 0u,
            dlpiName: ConstPtr<CChar> = ConstPtr(0L),
            dlpiPhdr: ConstPtr<ElfPhdr> = ConstPtr(0L),
            dlpiPhnum: ElfHalf = 0u,
            dlpiAdds: CUlonglong = 0uL,
            dlpiSubs: CUlonglong = 0uL,
            dlpiTlsModid: Int = 0,
            dlpiTlsData: MutPtr<CVoid> = MutPtr(0L),
        ): DlPhdrInfo = DlPhdrInfo(
            dlpiAddr = dlpiAddr,
            dlpiNameCtorArg = dlpiName,
            dlpiPhdrCtorArg = dlpiPhdr,
            dlpiPhnum = dlpiPhnum,
            dlpiAdds = dlpiAdds,
            dlpiSubs = dlpiSubs,
            dlpiTlsModid = dlpiTlsModid,
            dlpiTlsDataCtorArg = dlpiTlsData,
        )
    }
}

public data class AcceptFilterArg(
    public var afName: UByteArray = UByteArray(16),
    public var afArg: UByteArray = UByteArray((256 - 16).toInt()),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is AcceptFilterArg) return false
        if (!this.afName.contentEquals(other.afName)) return false
        if (!this.afArg.contentEquals(other.afArg)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.afName.contentHashCode()
        result = 31 * result + this.afArg.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<AcceptFilterArg> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<AcceptFilterArg> {
                override val sizeBytes: Long = io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes(16L, 1L) + ((256 - 16).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8).strideBytes)), 1L)
                override val alignBytes: Long = 1L
                override fun readNative(addr: Long): AcceptFilterArg =
                    AcceptFilterArg(
                        (io.github.kotlinmania.rustlang.core.mem.FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (16).toInt())).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (256 - 16).toInt())).readNative(addr + io.github.kotlinmania.rustlang.core.mem.alignUpBytes(16L, 1L)),
                    )
                override fun writeNative(addr: Long, value: AcceptFilterArg) {
                    (io.github.kotlinmania.rustlang.core.mem.FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (16).toInt())).writeNative(addr, value.afName)
                    (io.github.kotlinmania.rustlang.core.mem.FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (256 - 16).toInt())).writeNative(addr + io.github.kotlinmania.rustlang.core.mem.alignUpBytes(16L, 1L), value.afArg)
                }
            }
    }
}

public data class KiSigsetT(
    public var bits: UIntArray = UIntArray(4),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is KiSigsetT) return false
        if (!this.bits.contentEquals(other.bits)) return false
        return true
    }

    override fun hashCode(): Int = this.bits.contentHashCode()

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<KiSigsetT> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<KiSigsetT> {
                override val sizeBytes: Long = 16L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): KiSigsetT =
                    KiSigsetT(
                        (io.github.kotlinmania.rustlang.core.mem.FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32, (4).toInt())).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: KiSigsetT) {
                    (io.github.kotlinmania.rustlang.core.mem.FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32, (4).toInt())).writeNative(addr, value.bits)
                }
            }
    }
}

public class KinfoProc2 {
    public var pForw: ULong = 0uL

    public var pBack: ULong = 0uL

    public var pPaddr: ULong = 0uL

    public var pAddr: ULong = 0uL

    public var pFd: ULong = 0uL

    public var pCwdi: ULong = 0uL

    public var pStats: ULong = 0uL

    public var pLimit: ULong = 0uL

    public var pVmspace: ULong = 0uL

    public var pSigacts: ULong = 0uL

    public var pSess: ULong = 0uL

    public var pTsess: ULong = 0uL

    public var pRu: ULong = 0uL

    public var pEflag: Int = 0

    public var pExitsig: Int = 0

    public var pFlag: Int = 0

    public var pPid: Int = 0

    public var pPpid: Int = 0

    public var pSid: Int = 0

    public var pPgid: Int = 0

    public var pTpgid: Int = 0

    public var pUid: UInt = 0u

    public var pRuid: UInt = 0u

    public var pGid: UInt = 0u

    public var pRgid: UInt = 0u

    public var pGroups: UIntArray = UIntArray(KI_NGROUPS)

    public var pNgroups: Short = 0

    public var pJobc: Short = 0

    public var pTdev: UInt = 0u

    public var pEstcpu: UInt = 0u

    public var pRtimeSec: UInt = 0u

    public var pRtimeUsec: UInt = 0u

    public var pCpticks: Int = 0

    public var pPctcpu: UInt = 0u

    public var pSwtime: UInt = 0u

    public var pSlptime: UInt = 0u

    public var pSchedflags: Int = 0

    public var pUticks: ULong = 0uL

    public var pSticks: ULong = 0uL

    public var pIticks: ULong = 0uL

    public var pTracep: ULong = 0uL

    public var pTraceflag: Int = 0

    public var pHoldcnt: Int = 0

    public var pSiglist: KiSigsetT = KiSigsetT()

    public var pSigmask: KiSigsetT = KiSigsetT()

    public var pSigignore: KiSigsetT = KiSigsetT()

    public var pSigcatch: KiSigsetT = KiSigsetT()

    public var pStat: Byte = 0

    public var pPriority: UByte = 0u

    public var pUsrpri: UByte = 0u

    public var pNice: UByte = 0u

    public var pXstat: UShort = 0u

    public var pAcflag: UShort = 0u

    public var pComm: UByteArray = UByteArray(KI_MAXCOMLEN)

    public var pWmesg: UByteArray = UByteArray(KI_WMESGLEN)

    public var pWchan: ULong = 0uL

    public var pLogin: UByteArray = UByteArray(KI_MAXLOGNAME)

    public var pVmRssize: Int = 0

    public var pVmTsize: Int = 0

    public var pVmDsize: Int = 0

    public var pVmSsize: Int = 0

    public var pUvalid: Long = 0L

    public var pUstartSec: UInt = 0u

    public var pUstartUsec: UInt = 0u

    public var pUutimeSec: UInt = 0u

    public var pUutimeUsec: UInt = 0u

    public var pUstimeSec: UInt = 0u

    public var pUstimeUsec: UInt = 0u

    public var pUruMaxrss: ULong = 0uL

    public var pUruIxrss: ULong = 0uL

    public var pUruIdrss: ULong = 0uL

    public var pUruIsrss: ULong = 0uL

    public var pUruMinflt: ULong = 0uL

    public var pUruMajflt: ULong = 0uL

    public var pUruNswap: ULong = 0uL

    public var pUruInblock: ULong = 0uL

    public var pUruOublock: ULong = 0uL

    public var pUruMsgsnd: ULong = 0uL

    public var pUruMsgrcv: ULong = 0uL

    public var pUruNsignals: ULong = 0uL

    public var pUruNvcsw: ULong = 0uL

    public var pUruNivcsw: ULong = 0uL

    public var pUctimeSec: UInt = 0u

    public var pUctimeUsec: UInt = 0u

    public var pCpuid: ULong = 0uL

    public var pRealflag: ULong = 0uL

    public var pNlwps: ULong = 0uL

    public var pNrlwps: ULong = 0uL

    public var pRealstat: ULong = 0uL

    public var pSvuid: UInt = 0u

    public var pSvgid: UInt = 0u

    public var pEname: UByteArray = UByteArray(KI_MAXEMULLEN)

    public var pVmVsize: Long = 0L

    public var pVmMsize: Long = 0L

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<KinfoProc2> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<KinfoProc2> {
                override val sizeBytes: Long = io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes(152L, 4L) + ((KI_NGROUPS).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).strideBytes)), 2L) + 2L), 2L) + 2L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 4L) + 4L), 4L) + 4L), 4L) + 16L), 4L) + 16L), 4L) + 16L), 4L) + 16L), 1L) + 1L), 1L) + 1L), 1L) + 1L), 1L) + 1L), 2L) + 2L), 2L) + 2L), 1L) + ((KI_MAXCOMLEN).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8).strideBytes)), 1L) + ((KI_WMESGLEN).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8).strideBytes)), 8L) + 8L), 1L) + ((KI_MAXLOGNAME).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8).strideBytes)), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 8L) + 8L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 4L) + 4L), 4L) + 4L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 4L) + 4L), 4L) + 4L), 1L) + ((KI_MAXEMULLEN).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8).strideBytes)), 8L) + 8L), 8L) + 8L), maxOf(maxOf(maxOf(8L, 4L), 2L), 1L))
                override val alignBytes: Long = maxOf(maxOf(maxOf(8L, 4L), 2L), 1L)
                override fun readNative(addr: Long): KinfoProc2 =
                    KinfoProc2(
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
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 104L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 108L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 112L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 116L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 120L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 124L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 128L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 132L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 136L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 140L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 144L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 148L),
                        (io.github.kotlinmania.rustlang.core.mem.FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32, (KI_NGROUPS).toInt())).readNative(addr + io.github.kotlinmania.rustlang.core.mem.alignUpBytes(152L, 4L)),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).readNative(addr + io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes(152L, 4L) + ((KI_NGROUPS).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).strideBytes)), 2L)),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).readNative(addr + io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes(152L, 4L) + ((KI_NGROUPS).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).strideBytes)), 2L) + 2L), 2L)),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes(152L, 4L) + ((KI_NGROUPS).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).strideBytes)), 2L) + 2L), 2L) + 2L), 4L)),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes(152L, 4L) + ((KI_NGROUPS).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).strideBytes)), 2L) + 2L), 2L) + 2L), 4L) + 4L), 4L)),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes(152L, 4L) + ((KI_NGROUPS).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).strideBytes)), 2L) + 2L), 2L) + 2L), 4L) + 4L), 4L) + 4L), 4L)),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes(152L, 4L) + ((KI_NGROUPS).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).strideBytes)), 2L) + 2L), 2L) + 2L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L)),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes(152L, 4L) + ((KI_NGROUPS).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).strideBytes)), 2L) + 2L), 2L) + 2L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L)),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes(152L, 4L) + ((KI_NGROUPS).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).strideBytes)), 2L) + 2L), 2L) + 2L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L)),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes(152L, 4L) + ((KI_NGROUPS).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).strideBytes)), 2L) + 2L), 2L) + 2L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L)),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes(152L, 4L) + ((KI_NGROUPS).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).strideBytes)), 2L) + 2L), 2L) + 2L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L)),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes(152L, 4L) + ((KI_NGROUPS).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).strideBytes)), 2L) + 2L), 2L) + 2L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L)),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes(152L, 4L) + ((KI_NGROUPS).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).strideBytes)), 2L) + 2L), 2L) + 2L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 8L)),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes(152L, 4L) + ((KI_NGROUPS).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).strideBytes)), 2L) + 2L), 2L) + 2L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 8L) + 8L), 8L)),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes(152L, 4L) + ((KI_NGROUPS).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).strideBytes)), 2L) + 2L), 2L) + 2L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 8L) + 8L), 8L) + 8L), 8L)),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes(152L, 4L) + ((KI_NGROUPS).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).strideBytes)), 2L) + 2L), 2L) + 2L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L)),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes(152L, 4L) + ((KI_NGROUPS).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).strideBytes)), 2L) + 2L), 2L) + 2L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 4L)),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes(152L, 4L) + ((KI_NGROUPS).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).strideBytes)), 2L) + 2L), 2L) + 2L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 4L) + 4L), 4L)),
                        (KiSigsetT.typeLayout()).readNative(addr + io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes(152L, 4L) + ((KI_NGROUPS).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).strideBytes)), 2L) + 2L), 2L) + 2L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 4L) + 4L), 4L) + 4L), 4L)),
                        (KiSigsetT.typeLayout()).readNative(addr + io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes(152L, 4L) + ((KI_NGROUPS).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).strideBytes)), 2L) + 2L), 2L) + 2L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 4L) + 4L), 4L) + 4L), 4L) + 16L), 4L)),
                        (KiSigsetT.typeLayout()).readNative(addr + io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes(152L, 4L) + ((KI_NGROUPS).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).strideBytes)), 2L) + 2L), 2L) + 2L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 4L) + 4L), 4L) + 4L), 4L) + 16L), 4L) + 16L), 4L)),
                        (KiSigsetT.typeLayout()).readNative(addr + io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes(152L, 4L) + ((KI_NGROUPS).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).strideBytes)), 2L) + 2L), 2L) + 2L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 4L) + 4L), 4L) + 4L), 4L) + 16L), 4L) + 16L), 4L) + 16L), 4L)),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8).readNative(addr + io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes(152L, 4L) + ((KI_NGROUPS).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).strideBytes)), 2L) + 2L), 2L) + 2L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 4L) + 4L), 4L) + 4L), 4L) + 16L), 4L) + 16L), 4L) + 16L), 4L) + 16L), 1L)),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes(152L, 4L) + ((KI_NGROUPS).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).strideBytes)), 2L) + 2L), 2L) + 2L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 4L) + 4L), 4L) + 4L), 4L) + 16L), 4L) + 16L), 4L) + 16L), 4L) + 16L), 1L) + 1L), 1L)),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes(152L, 4L) + ((KI_NGROUPS).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).strideBytes)), 2L) + 2L), 2L) + 2L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 4L) + 4L), 4L) + 4L), 4L) + 16L), 4L) + 16L), 4L) + 16L), 4L) + 16L), 1L) + 1L), 1L) + 1L), 1L)),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes(152L, 4L) + ((KI_NGROUPS).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).strideBytes)), 2L) + 2L), 2L) + 2L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 4L) + 4L), 4L) + 4L), 4L) + 16L), 4L) + 16L), 4L) + 16L), 4L) + 16L), 1L) + 1L), 1L) + 1L), 1L) + 1L), 1L)),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes(152L, 4L) + ((KI_NGROUPS).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).strideBytes)), 2L) + 2L), 2L) + 2L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 4L) + 4L), 4L) + 4L), 4L) + 16L), 4L) + 16L), 4L) + 16L), 4L) + 16L), 1L) + 1L), 1L) + 1L), 1L) + 1L), 1L) + 1L), 2L)),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes(152L, 4L) + ((KI_NGROUPS).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).strideBytes)), 2L) + 2L), 2L) + 2L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 4L) + 4L), 4L) + 4L), 4L) + 16L), 4L) + 16L), 4L) + 16L), 4L) + 16L), 1L) + 1L), 1L) + 1L), 1L) + 1L), 1L) + 1L), 2L) + 2L), 2L)),
                        (io.github.kotlinmania.rustlang.core.mem.FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (KI_MAXCOMLEN).toInt())).readNative(addr + io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes(152L, 4L) + ((KI_NGROUPS).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).strideBytes)), 2L) + 2L), 2L) + 2L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 4L) + 4L), 4L) + 4L), 4L) + 16L), 4L) + 16L), 4L) + 16L), 4L) + 16L), 1L) + 1L), 1L) + 1L), 1L) + 1L), 1L) + 1L), 2L) + 2L), 2L) + 2L), 1L)),
                        (io.github.kotlinmania.rustlang.core.mem.FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (KI_WMESGLEN).toInt())).readNative(addr + io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes(152L, 4L) + ((KI_NGROUPS).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).strideBytes)), 2L) + 2L), 2L) + 2L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 4L) + 4L), 4L) + 4L), 4L) + 16L), 4L) + 16L), 4L) + 16L), 4L) + 16L), 1L) + 1L), 1L) + 1L), 1L) + 1L), 1L) + 1L), 2L) + 2L), 2L) + 2L), 1L) + ((KI_MAXCOMLEN).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8).strideBytes)), 1L)),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes(152L, 4L) + ((KI_NGROUPS).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).strideBytes)), 2L) + 2L), 2L) + 2L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 4L) + 4L), 4L) + 4L), 4L) + 16L), 4L) + 16L), 4L) + 16L), 4L) + 16L), 1L) + 1L), 1L) + 1L), 1L) + 1L), 1L) + 1L), 2L) + 2L), 2L) + 2L), 1L) + ((KI_MAXCOMLEN).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8).strideBytes)), 1L) + ((KI_WMESGLEN).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8).strideBytes)), 8L)),
                        (io.github.kotlinmania.rustlang.core.mem.FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (KI_MAXLOGNAME).toInt())).readNative(addr + io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes(152L, 4L) + ((KI_NGROUPS).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).strideBytes)), 2L) + 2L), 2L) + 2L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 4L) + 4L), 4L) + 4L), 4L) + 16L), 4L) + 16L), 4L) + 16L), 4L) + 16L), 1L) + 1L), 1L) + 1L), 1L) + 1L), 1L) + 1L), 2L) + 2L), 2L) + 2L), 1L) + ((KI_MAXCOMLEN).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8).strideBytes)), 1L) + ((KI_WMESGLEN).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8).strideBytes)), 8L) + 8L), 1L)),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes(152L, 4L) + ((KI_NGROUPS).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).strideBytes)), 2L) + 2L), 2L) + 2L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 4L) + 4L), 4L) + 4L), 4L) + 16L), 4L) + 16L), 4L) + 16L), 4L) + 16L), 1L) + 1L), 1L) + 1L), 1L) + 1L), 1L) + 1L), 2L) + 2L), 2L) + 2L), 1L) + ((KI_MAXCOMLEN).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8).strideBytes)), 1L) + ((KI_WMESGLEN).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8).strideBytes)), 8L) + 8L), 1L) + ((KI_MAXLOGNAME).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8).strideBytes)), 4L)),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes(152L, 4L) + ((KI_NGROUPS).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).strideBytes)), 2L) + 2L), 2L) + 2L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 4L) + 4L), 4L) + 4L), 4L) + 16L), 4L) + 16L), 4L) + 16L), 4L) + 16L), 1L) + 1L), 1L) + 1L), 1L) + 1L), 1L) + 1L), 2L) + 2L), 2L) + 2L), 1L) + ((KI_MAXCOMLEN).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8).strideBytes)), 1L) + ((KI_WMESGLEN).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8).strideBytes)), 8L) + 8L), 1L) + ((KI_MAXLOGNAME).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8).strideBytes)), 4L) + 4L), 4L)),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes(152L, 4L) + ((KI_NGROUPS).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).strideBytes)), 2L) + 2L), 2L) + 2L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 4L) + 4L), 4L) + 4L), 4L) + 16L), 4L) + 16L), 4L) + 16L), 4L) + 16L), 1L) + 1L), 1L) + 1L), 1L) + 1L), 1L) + 1L), 2L) + 2L), 2L) + 2L), 1L) + ((KI_MAXCOMLEN).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8).strideBytes)), 1L) + ((KI_WMESGLEN).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8).strideBytes)), 8L) + 8L), 1L) + ((KI_MAXLOGNAME).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8).strideBytes)), 4L) + 4L), 4L) + 4L), 4L)),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes(152L, 4L) + ((KI_NGROUPS).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).strideBytes)), 2L) + 2L), 2L) + 2L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 4L) + 4L), 4L) + 4L), 4L) + 16L), 4L) + 16L), 4L) + 16L), 4L) + 16L), 1L) + 1L), 1L) + 1L), 1L) + 1L), 1L) + 1L), 2L) + 2L), 2L) + 2L), 1L) + ((KI_MAXCOMLEN).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8).strideBytes)), 1L) + ((KI_WMESGLEN).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8).strideBytes)), 8L) + 8L), 1L) + ((KI_MAXLOGNAME).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8).strideBytes)), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L)),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes(152L, 4L) + ((KI_NGROUPS).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).strideBytes)), 2L) + 2L), 2L) + 2L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 4L) + 4L), 4L) + 4L), 4L) + 16L), 4L) + 16L), 4L) + 16L), 4L) + 16L), 1L) + 1L), 1L) + 1L), 1L) + 1L), 1L) + 1L), 2L) + 2L), 2L) + 2L), 1L) + ((KI_MAXCOMLEN).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8).strideBytes)), 1L) + ((KI_WMESGLEN).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8).strideBytes)), 8L) + 8L), 1L) + ((KI_MAXLOGNAME).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8).strideBytes)), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 8L)),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes(152L, 4L) + ((KI_NGROUPS).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).strideBytes)), 2L) + 2L), 2L) + 2L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 4L) + 4L), 4L) + 4L), 4L) + 16L), 4L) + 16L), 4L) + 16L), 4L) + 16L), 1L) + 1L), 1L) + 1L), 1L) + 1L), 1L) + 1L), 2L) + 2L), 2L) + 2L), 1L) + ((KI_MAXCOMLEN).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8).strideBytes)), 1L) + ((KI_WMESGLEN).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8).strideBytes)), 8L) + 8L), 1L) + ((KI_MAXLOGNAME).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8).strideBytes)), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 8L) + 8L), 4L)),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes(152L, 4L) + ((KI_NGROUPS).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).strideBytes)), 2L) + 2L), 2L) + 2L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 4L) + 4L), 4L) + 4L), 4L) + 16L), 4L) + 16L), 4L) + 16L), 4L) + 16L), 1L) + 1L), 1L) + 1L), 1L) + 1L), 1L) + 1L), 2L) + 2L), 2L) + 2L), 1L) + ((KI_MAXCOMLEN).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8).strideBytes)), 1L) + ((KI_WMESGLEN).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8).strideBytes)), 8L) + 8L), 1L) + ((KI_MAXLOGNAME).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8).strideBytes)), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 8L) + 8L), 4L) + 4L), 4L)),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes(152L, 4L) + ((KI_NGROUPS).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).strideBytes)), 2L) + 2L), 2L) + 2L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 4L) + 4L), 4L) + 4L), 4L) + 16L), 4L) + 16L), 4L) + 16L), 4L) + 16L), 1L) + 1L), 1L) + 1L), 1L) + 1L), 1L) + 1L), 2L) + 2L), 2L) + 2L), 1L) + ((KI_MAXCOMLEN).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8).strideBytes)), 1L) + ((KI_WMESGLEN).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8).strideBytes)), 8L) + 8L), 1L) + ((KI_MAXLOGNAME).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8).strideBytes)), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 8L) + 8L), 4L) + 4L), 4L) + 4L), 4L)),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes(152L, 4L) + ((KI_NGROUPS).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).strideBytes)), 2L) + 2L), 2L) + 2L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 4L) + 4L), 4L) + 4L), 4L) + 16L), 4L) + 16L), 4L) + 16L), 4L) + 16L), 1L) + 1L), 1L) + 1L), 1L) + 1L), 1L) + 1L), 2L) + 2L), 2L) + 2L), 1L) + ((KI_MAXCOMLEN).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8).strideBytes)), 1L) + ((KI_WMESGLEN).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8).strideBytes)), 8L) + 8L), 1L) + ((KI_MAXLOGNAME).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8).strideBytes)), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 8L) + 8L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L)),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes(152L, 4L) + ((KI_NGROUPS).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).strideBytes)), 2L) + 2L), 2L) + 2L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 4L) + 4L), 4L) + 4L), 4L) + 16L), 4L) + 16L), 4L) + 16L), 4L) + 16L), 1L) + 1L), 1L) + 1L), 1L) + 1L), 1L) + 1L), 2L) + 2L), 2L) + 2L), 1L) + ((KI_MAXCOMLEN).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8).strideBytes)), 1L) + ((KI_WMESGLEN).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8).strideBytes)), 8L) + 8L), 1L) + ((KI_MAXLOGNAME).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8).strideBytes)), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 8L) + 8L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L)),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes(152L, 4L) + ((KI_NGROUPS).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).strideBytes)), 2L) + 2L), 2L) + 2L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 4L) + 4L), 4L) + 4L), 4L) + 16L), 4L) + 16L), 4L) + 16L), 4L) + 16L), 1L) + 1L), 1L) + 1L), 1L) + 1L), 1L) + 1L), 2L) + 2L), 2L) + 2L), 1L) + ((KI_MAXCOMLEN).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8).strideBytes)), 1L) + ((KI_WMESGLEN).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8).strideBytes)), 8L) + 8L), 1L) + ((KI_MAXLOGNAME).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8).strideBytes)), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 8L) + 8L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L)),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes(152L, 4L) + ((KI_NGROUPS).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).strideBytes)), 2L) + 2L), 2L) + 2L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 4L) + 4L), 4L) + 4L), 4L) + 16L), 4L) + 16L), 4L) + 16L), 4L) + 16L), 1L) + 1L), 1L) + 1L), 1L) + 1L), 1L) + 1L), 2L) + 2L), 2L) + 2L), 1L) + ((KI_MAXCOMLEN).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8).strideBytes)), 1L) + ((KI_WMESGLEN).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8).strideBytes)), 8L) + 8L), 1L) + ((KI_MAXLOGNAME).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8).strideBytes)), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 8L) + 8L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 8L)),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes(152L, 4L) + ((KI_NGROUPS).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).strideBytes)), 2L) + 2L), 2L) + 2L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 4L) + 4L), 4L) + 4L), 4L) + 16L), 4L) + 16L), 4L) + 16L), 4L) + 16L), 1L) + 1L), 1L) + 1L), 1L) + 1L), 1L) + 1L), 2L) + 2L), 2L) + 2L), 1L) + ((KI_MAXCOMLEN).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8).strideBytes)), 1L) + ((KI_WMESGLEN).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8).strideBytes)), 8L) + 8L), 1L) + ((KI_MAXLOGNAME).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8).strideBytes)), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 8L) + 8L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 8L) + 8L), 8L)),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes(152L, 4L) + ((KI_NGROUPS).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).strideBytes)), 2L) + 2L), 2L) + 2L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 4L) + 4L), 4L) + 4L), 4L) + 16L), 4L) + 16L), 4L) + 16L), 4L) + 16L), 1L) + 1L), 1L) + 1L), 1L) + 1L), 1L) + 1L), 2L) + 2L), 2L) + 2L), 1L) + ((KI_MAXCOMLEN).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8).strideBytes)), 1L) + ((KI_WMESGLEN).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8).strideBytes)), 8L) + 8L), 1L) + ((KI_MAXLOGNAME).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8).strideBytes)), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 8L) + 8L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 8L) + 8L), 8L) + 8L), 8L)),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes(152L, 4L) + ((KI_NGROUPS).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).strideBytes)), 2L) + 2L), 2L) + 2L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 4L) + 4L), 4L) + 4L), 4L) + 16L), 4L) + 16L), 4L) + 16L), 4L) + 16L), 1L) + 1L), 1L) + 1L), 1L) + 1L), 1L) + 1L), 2L) + 2L), 2L) + 2L), 1L) + ((KI_MAXCOMLEN).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8).strideBytes)), 1L) + ((KI_WMESGLEN).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8).strideBytes)), 8L) + 8L), 1L) + ((KI_MAXLOGNAME).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8).strideBytes)), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 8L) + 8L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L)),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes(152L, 4L) + ((KI_NGROUPS).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).strideBytes)), 2L) + 2L), 2L) + 2L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 4L) + 4L), 4L) + 4L), 4L) + 16L), 4L) + 16L), 4L) + 16L), 4L) + 16L), 1L) + 1L), 1L) + 1L), 1L) + 1L), 1L) + 1L), 2L) + 2L), 2L) + 2L), 1L) + ((KI_MAXCOMLEN).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8).strideBytes)), 1L) + ((KI_WMESGLEN).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8).strideBytes)), 8L) + 8L), 1L) + ((KI_MAXLOGNAME).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8).strideBytes)), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 8L) + 8L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L)),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes(152L, 4L) + ((KI_NGROUPS).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).strideBytes)), 2L) + 2L), 2L) + 2L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 4L) + 4L), 4L) + 4L), 4L) + 16L), 4L) + 16L), 4L) + 16L), 4L) + 16L), 1L) + 1L), 1L) + 1L), 1L) + 1L), 1L) + 1L), 2L) + 2L), 2L) + 2L), 1L) + ((KI_MAXCOMLEN).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8).strideBytes)), 1L) + ((KI_WMESGLEN).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8).strideBytes)), 8L) + 8L), 1L) + ((KI_MAXLOGNAME).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8).strideBytes)), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 8L) + 8L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L)),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes(152L, 4L) + ((KI_NGROUPS).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).strideBytes)), 2L) + 2L), 2L) + 2L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 4L) + 4L), 4L) + 4L), 4L) + 16L), 4L) + 16L), 4L) + 16L), 4L) + 16L), 1L) + 1L), 1L) + 1L), 1L) + 1L), 1L) + 1L), 2L) + 2L), 2L) + 2L), 1L) + ((KI_MAXCOMLEN).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8).strideBytes)), 1L) + ((KI_WMESGLEN).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8).strideBytes)), 8L) + 8L), 1L) + ((KI_MAXLOGNAME).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8).strideBytes)), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 8L) + 8L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L)),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes(152L, 4L) + ((KI_NGROUPS).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).strideBytes)), 2L) + 2L), 2L) + 2L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 4L) + 4L), 4L) + 4L), 4L) + 16L), 4L) + 16L), 4L) + 16L), 4L) + 16L), 1L) + 1L), 1L) + 1L), 1L) + 1L), 1L) + 1L), 2L) + 2L), 2L) + 2L), 1L) + ((KI_MAXCOMLEN).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8).strideBytes)), 1L) + ((KI_WMESGLEN).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8).strideBytes)), 8L) + 8L), 1L) + ((KI_MAXLOGNAME).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8).strideBytes)), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 8L) + 8L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L)),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes(152L, 4L) + ((KI_NGROUPS).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).strideBytes)), 2L) + 2L), 2L) + 2L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 4L) + 4L), 4L) + 4L), 4L) + 16L), 4L) + 16L), 4L) + 16L), 4L) + 16L), 1L) + 1L), 1L) + 1L), 1L) + 1L), 1L) + 1L), 2L) + 2L), 2L) + 2L), 1L) + ((KI_MAXCOMLEN).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8).strideBytes)), 1L) + ((KI_WMESGLEN).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8).strideBytes)), 8L) + 8L), 1L) + ((KI_MAXLOGNAME).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8).strideBytes)), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 8L) + 8L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L)),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes(152L, 4L) + ((KI_NGROUPS).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).strideBytes)), 2L) + 2L), 2L) + 2L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 4L) + 4L), 4L) + 4L), 4L) + 16L), 4L) + 16L), 4L) + 16L), 4L) + 16L), 1L) + 1L), 1L) + 1L), 1L) + 1L), 1L) + 1L), 2L) + 2L), 2L) + 2L), 1L) + ((KI_MAXCOMLEN).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8).strideBytes)), 1L) + ((KI_WMESGLEN).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8).strideBytes)), 8L) + 8L), 1L) + ((KI_MAXLOGNAME).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8).strideBytes)), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 8L) + 8L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L)),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes(152L, 4L) + ((KI_NGROUPS).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).strideBytes)), 2L) + 2L), 2L) + 2L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 4L) + 4L), 4L) + 4L), 4L) + 16L), 4L) + 16L), 4L) + 16L), 4L) + 16L), 1L) + 1L), 1L) + 1L), 1L) + 1L), 1L) + 1L), 2L) + 2L), 2L) + 2L), 1L) + ((KI_MAXCOMLEN).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8).strideBytes)), 1L) + ((KI_WMESGLEN).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8).strideBytes)), 8L) + 8L), 1L) + ((KI_MAXLOGNAME).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8).strideBytes)), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 8L) + 8L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L)),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes(152L, 4L) + ((KI_NGROUPS).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).strideBytes)), 2L) + 2L), 2L) + 2L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 4L) + 4L), 4L) + 4L), 4L) + 16L), 4L) + 16L), 4L) + 16L), 4L) + 16L), 1L) + 1L), 1L) + 1L), 1L) + 1L), 1L) + 1L), 2L) + 2L), 2L) + 2L), 1L) + ((KI_MAXCOMLEN).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8).strideBytes)), 1L) + ((KI_WMESGLEN).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8).strideBytes)), 8L) + 8L), 1L) + ((KI_MAXLOGNAME).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8).strideBytes)), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 8L) + 8L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L)),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes(152L, 4L) + ((KI_NGROUPS).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).strideBytes)), 2L) + 2L), 2L) + 2L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 4L) + 4L), 4L) + 4L), 4L) + 16L), 4L) + 16L), 4L) + 16L), 4L) + 16L), 1L) + 1L), 1L) + 1L), 1L) + 1L), 1L) + 1L), 2L) + 2L), 2L) + 2L), 1L) + ((KI_MAXCOMLEN).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8).strideBytes)), 1L) + ((KI_WMESGLEN).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8).strideBytes)), 8L) + 8L), 1L) + ((KI_MAXLOGNAME).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8).strideBytes)), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 8L) + 8L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L)),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes(152L, 4L) + ((KI_NGROUPS).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).strideBytes)), 2L) + 2L), 2L) + 2L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 4L) + 4L), 4L) + 4L), 4L) + 16L), 4L) + 16L), 4L) + 16L), 4L) + 16L), 1L) + 1L), 1L) + 1L), 1L) + 1L), 1L) + 1L), 2L) + 2L), 2L) + 2L), 1L) + ((KI_MAXCOMLEN).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8).strideBytes)), 1L) + ((KI_WMESGLEN).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8).strideBytes)), 8L) + 8L), 1L) + ((KI_MAXLOGNAME).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8).strideBytes)), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 8L) + 8L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L)),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes(152L, 4L) + ((KI_NGROUPS).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).strideBytes)), 2L) + 2L), 2L) + 2L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 4L) + 4L), 4L) + 4L), 4L) + 16L), 4L) + 16L), 4L) + 16L), 4L) + 16L), 1L) + 1L), 1L) + 1L), 1L) + 1L), 1L) + 1L), 2L) + 2L), 2L) + 2L), 1L) + ((KI_MAXCOMLEN).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8).strideBytes)), 1L) + ((KI_WMESGLEN).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8).strideBytes)), 8L) + 8L), 1L) + ((KI_MAXLOGNAME).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8).strideBytes)), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 8L) + 8L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 4L)),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes(152L, 4L) + ((KI_NGROUPS).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).strideBytes)), 2L) + 2L), 2L) + 2L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 4L) + 4L), 4L) + 4L), 4L) + 16L), 4L) + 16L), 4L) + 16L), 4L) + 16L), 1L) + 1L), 1L) + 1L), 1L) + 1L), 1L) + 1L), 2L) + 2L), 2L) + 2L), 1L) + ((KI_MAXCOMLEN).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8).strideBytes)), 1L) + ((KI_WMESGLEN).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8).strideBytes)), 8L) + 8L), 1L) + ((KI_MAXLOGNAME).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8).strideBytes)), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 8L) + 8L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 4L) + 4L), 4L)),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes(152L, 4L) + ((KI_NGROUPS).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).strideBytes)), 2L) + 2L), 2L) + 2L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 4L) + 4L), 4L) + 4L), 4L) + 16L), 4L) + 16L), 4L) + 16L), 4L) + 16L), 1L) + 1L), 1L) + 1L), 1L) + 1L), 1L) + 1L), 2L) + 2L), 2L) + 2L), 1L) + ((KI_MAXCOMLEN).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8).strideBytes)), 1L) + ((KI_WMESGLEN).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8).strideBytes)), 8L) + 8L), 1L) + ((KI_MAXLOGNAME).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8).strideBytes)), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 8L) + 8L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 4L) + 4L), 4L) + 4L), 8L)),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes(152L, 4L) + ((KI_NGROUPS).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).strideBytes)), 2L) + 2L), 2L) + 2L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 4L) + 4L), 4L) + 4L), 4L) + 16L), 4L) + 16L), 4L) + 16L), 4L) + 16L), 1L) + 1L), 1L) + 1L), 1L) + 1L), 1L) + 1L), 2L) + 2L), 2L) + 2L), 1L) + ((KI_MAXCOMLEN).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8).strideBytes)), 1L) + ((KI_WMESGLEN).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8).strideBytes)), 8L) + 8L), 1L) + ((KI_MAXLOGNAME).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8).strideBytes)), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 8L) + 8L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 4L) + 4L), 4L) + 4L), 8L) + 8L), 8L)),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes(152L, 4L) + ((KI_NGROUPS).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).strideBytes)), 2L) + 2L), 2L) + 2L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 4L) + 4L), 4L) + 4L), 4L) + 16L), 4L) + 16L), 4L) + 16L), 4L) + 16L), 1L) + 1L), 1L) + 1L), 1L) + 1L), 1L) + 1L), 2L) + 2L), 2L) + 2L), 1L) + ((KI_MAXCOMLEN).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8).strideBytes)), 1L) + ((KI_WMESGLEN).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8).strideBytes)), 8L) + 8L), 1L) + ((KI_MAXLOGNAME).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8).strideBytes)), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 8L) + 8L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 4L) + 4L), 4L) + 4L), 8L) + 8L), 8L) + 8L), 8L)),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes(152L, 4L) + ((KI_NGROUPS).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).strideBytes)), 2L) + 2L), 2L) + 2L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 4L) + 4L), 4L) + 4L), 4L) + 16L), 4L) + 16L), 4L) + 16L), 4L) + 16L), 1L) + 1L), 1L) + 1L), 1L) + 1L), 1L) + 1L), 2L) + 2L), 2L) + 2L), 1L) + ((KI_MAXCOMLEN).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8).strideBytes)), 1L) + ((KI_WMESGLEN).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8).strideBytes)), 8L) + 8L), 1L) + ((KI_MAXLOGNAME).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8).strideBytes)), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 8L) + 8L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 4L) + 4L), 4L) + 4L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L)),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes(152L, 4L) + ((KI_NGROUPS).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).strideBytes)), 2L) + 2L), 2L) + 2L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 4L) + 4L), 4L) + 4L), 4L) + 16L), 4L) + 16L), 4L) + 16L), 4L) + 16L), 1L) + 1L), 1L) + 1L), 1L) + 1L), 1L) + 1L), 2L) + 2L), 2L) + 2L), 1L) + ((KI_MAXCOMLEN).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8).strideBytes)), 1L) + ((KI_WMESGLEN).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8).strideBytes)), 8L) + 8L), 1L) + ((KI_MAXLOGNAME).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8).strideBytes)), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 8L) + 8L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 4L) + 4L), 4L) + 4L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L)),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes(152L, 4L) + ((KI_NGROUPS).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).strideBytes)), 2L) + 2L), 2L) + 2L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 4L) + 4L), 4L) + 4L), 4L) + 16L), 4L) + 16L), 4L) + 16L), 4L) + 16L), 1L) + 1L), 1L) + 1L), 1L) + 1L), 1L) + 1L), 2L) + 2L), 2L) + 2L), 1L) + ((KI_MAXCOMLEN).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8).strideBytes)), 1L) + ((KI_WMESGLEN).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8).strideBytes)), 8L) + 8L), 1L) + ((KI_MAXLOGNAME).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8).strideBytes)), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 8L) + 8L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 4L) + 4L), 4L) + 4L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 4L)),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes(152L, 4L) + ((KI_NGROUPS).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).strideBytes)), 2L) + 2L), 2L) + 2L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 4L) + 4L), 4L) + 4L), 4L) + 16L), 4L) + 16L), 4L) + 16L), 4L) + 16L), 1L) + 1L), 1L) + 1L), 1L) + 1L), 1L) + 1L), 2L) + 2L), 2L) + 2L), 1L) + ((KI_MAXCOMLEN).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8).strideBytes)), 1L) + ((KI_WMESGLEN).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8).strideBytes)), 8L) + 8L), 1L) + ((KI_MAXLOGNAME).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8).strideBytes)), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 8L) + 8L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 4L) + 4L), 4L) + 4L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 4L) + 4L), 4L)),
                        (io.github.kotlinmania.rustlang.core.mem.FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (KI_MAXEMULLEN).toInt())).readNative(addr + io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes(152L, 4L) + ((KI_NGROUPS).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).strideBytes)), 2L) + 2L), 2L) + 2L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 4L) + 4L), 4L) + 4L), 4L) + 16L), 4L) + 16L), 4L) + 16L), 4L) + 16L), 1L) + 1L), 1L) + 1L), 1L) + 1L), 1L) + 1L), 2L) + 2L), 2L) + 2L), 1L) + ((KI_MAXCOMLEN).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8).strideBytes)), 1L) + ((KI_WMESGLEN).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8).strideBytes)), 8L) + 8L), 1L) + ((KI_MAXLOGNAME).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8).strideBytes)), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 8L) + 8L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 4L) + 4L), 4L) + 4L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 4L) + 4L), 4L) + 4L), 1L)),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes(152L, 4L) + ((KI_NGROUPS).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).strideBytes)), 2L) + 2L), 2L) + 2L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 4L) + 4L), 4L) + 4L), 4L) + 16L), 4L) + 16L), 4L) + 16L), 4L) + 16L), 1L) + 1L), 1L) + 1L), 1L) + 1L), 1L) + 1L), 2L) + 2L), 2L) + 2L), 1L) + ((KI_MAXCOMLEN).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8).strideBytes)), 1L) + ((KI_WMESGLEN).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8).strideBytes)), 8L) + 8L), 1L) + ((KI_MAXLOGNAME).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8).strideBytes)), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 8L) + 8L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 4L) + 4L), 4L) + 4L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 4L) + 4L), 4L) + 4L), 1L) + ((KI_MAXEMULLEN).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8).strideBytes)), 8L)),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes(152L, 4L) + ((KI_NGROUPS).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).strideBytes)), 2L) + 2L), 2L) + 2L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 4L) + 4L), 4L) + 4L), 4L) + 16L), 4L) + 16L), 4L) + 16L), 4L) + 16L), 1L) + 1L), 1L) + 1L), 1L) + 1L), 1L) + 1L), 2L) + 2L), 2L) + 2L), 1L) + ((KI_MAXCOMLEN).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8).strideBytes)), 1L) + ((KI_WMESGLEN).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8).strideBytes)), 8L) + 8L), 1L) + ((KI_MAXLOGNAME).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8).strideBytes)), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 8L) + 8L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 4L) + 4L), 4L) + 4L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 4L) + 4L), 4L) + 4L), 1L) + ((KI_MAXEMULLEN).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8).strideBytes)), 8L) + 8L), 8L)),
                    )
                override fun writeNative(addr: Long, value: KinfoProc2) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr, value.pForw)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 8L, value.pBack)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 16L, value.pPaddr)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 24L, value.pAddr)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 32L, value.pFd)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 40L, value.pCwdi)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 48L, value.pStats)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 56L, value.pLimit)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 64L, value.pVmspace)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 72L, value.pSigacts)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 80L, value.pSess)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 88L, value.pTsess)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 96L, value.pRu)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 104L, value.pEflag)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 108L, value.pExitsig)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 112L, value.pFlag)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 116L, value.pPid)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 120L, value.pPpid)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 124L, value.pSid)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 128L, value.pPgid)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 132L, value.pTpgid)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 136L, value.pUid)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 140L, value.pRuid)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 144L, value.pGid)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 148L, value.pRgid)
                    (io.github.kotlinmania.rustlang.core.mem.FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32, (KI_NGROUPS).toInt())).writeNative(addr + io.github.kotlinmania.rustlang.core.mem.alignUpBytes(152L, 4L), value.pGroups)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).writeNative(addr + io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes(152L, 4L) + ((KI_NGROUPS).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).strideBytes)), 2L), value.pNgroups)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).writeNative(addr + io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes(152L, 4L) + ((KI_NGROUPS).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).strideBytes)), 2L) + 2L), 2L), value.pJobc)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes(152L, 4L) + ((KI_NGROUPS).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).strideBytes)), 2L) + 2L), 2L) + 2L), 4L), value.pTdev)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes(152L, 4L) + ((KI_NGROUPS).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).strideBytes)), 2L) + 2L), 2L) + 2L), 4L) + 4L), 4L), value.pEstcpu)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes(152L, 4L) + ((KI_NGROUPS).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).strideBytes)), 2L) + 2L), 2L) + 2L), 4L) + 4L), 4L) + 4L), 4L), value.pRtimeSec)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes(152L, 4L) + ((KI_NGROUPS).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).strideBytes)), 2L) + 2L), 2L) + 2L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L), value.pRtimeUsec)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes(152L, 4L) + ((KI_NGROUPS).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).strideBytes)), 2L) + 2L), 2L) + 2L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L), value.pCpticks)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes(152L, 4L) + ((KI_NGROUPS).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).strideBytes)), 2L) + 2L), 2L) + 2L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L), value.pPctcpu)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes(152L, 4L) + ((KI_NGROUPS).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).strideBytes)), 2L) + 2L), 2L) + 2L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L), value.pSwtime)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes(152L, 4L) + ((KI_NGROUPS).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).strideBytes)), 2L) + 2L), 2L) + 2L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L), value.pSlptime)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes(152L, 4L) + ((KI_NGROUPS).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).strideBytes)), 2L) + 2L), 2L) + 2L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L), value.pSchedflags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes(152L, 4L) + ((KI_NGROUPS).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).strideBytes)), 2L) + 2L), 2L) + 2L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 8L), value.pUticks)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes(152L, 4L) + ((KI_NGROUPS).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).strideBytes)), 2L) + 2L), 2L) + 2L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 8L) + 8L), 8L), value.pSticks)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes(152L, 4L) + ((KI_NGROUPS).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).strideBytes)), 2L) + 2L), 2L) + 2L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 8L) + 8L), 8L) + 8L), 8L), value.pIticks)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes(152L, 4L) + ((KI_NGROUPS).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).strideBytes)), 2L) + 2L), 2L) + 2L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L), value.pTracep)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes(152L, 4L) + ((KI_NGROUPS).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).strideBytes)), 2L) + 2L), 2L) + 2L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 4L), value.pTraceflag)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes(152L, 4L) + ((KI_NGROUPS).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).strideBytes)), 2L) + 2L), 2L) + 2L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 4L) + 4L), 4L), value.pHoldcnt)
                    (KiSigsetT.typeLayout()).writeNative(addr + io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes(152L, 4L) + ((KI_NGROUPS).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).strideBytes)), 2L) + 2L), 2L) + 2L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 4L) + 4L), 4L) + 4L), 4L), value.pSiglist)
                    (KiSigsetT.typeLayout()).writeNative(addr + io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes(152L, 4L) + ((KI_NGROUPS).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).strideBytes)), 2L) + 2L), 2L) + 2L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 4L) + 4L), 4L) + 4L), 4L) + 16L), 4L), value.pSigmask)
                    (KiSigsetT.typeLayout()).writeNative(addr + io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes(152L, 4L) + ((KI_NGROUPS).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).strideBytes)), 2L) + 2L), 2L) + 2L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 4L) + 4L), 4L) + 4L), 4L) + 16L), 4L) + 16L), 4L), value.pSigignore)
                    (KiSigsetT.typeLayout()).writeNative(addr + io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes(152L, 4L) + ((KI_NGROUPS).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).strideBytes)), 2L) + 2L), 2L) + 2L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 4L) + 4L), 4L) + 4L), 4L) + 16L), 4L) + 16L), 4L) + 16L), 4L), value.pSigcatch)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8).writeNative(addr + io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes(152L, 4L) + ((KI_NGROUPS).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).strideBytes)), 2L) + 2L), 2L) + 2L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 4L) + 4L), 4L) + 4L), 4L) + 16L), 4L) + 16L), 4L) + 16L), 4L) + 16L), 1L), value.pStat)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes(152L, 4L) + ((KI_NGROUPS).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).strideBytes)), 2L) + 2L), 2L) + 2L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 4L) + 4L), 4L) + 4L), 4L) + 16L), 4L) + 16L), 4L) + 16L), 4L) + 16L), 1L) + 1L), 1L), value.pPriority)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes(152L, 4L) + ((KI_NGROUPS).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).strideBytes)), 2L) + 2L), 2L) + 2L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 4L) + 4L), 4L) + 4L), 4L) + 16L), 4L) + 16L), 4L) + 16L), 4L) + 16L), 1L) + 1L), 1L) + 1L), 1L), value.pUsrpri)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes(152L, 4L) + ((KI_NGROUPS).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).strideBytes)), 2L) + 2L), 2L) + 2L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 4L) + 4L), 4L) + 4L), 4L) + 16L), 4L) + 16L), 4L) + 16L), 4L) + 16L), 1L) + 1L), 1L) + 1L), 1L) + 1L), 1L), value.pNice)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes(152L, 4L) + ((KI_NGROUPS).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).strideBytes)), 2L) + 2L), 2L) + 2L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 4L) + 4L), 4L) + 4L), 4L) + 16L), 4L) + 16L), 4L) + 16L), 4L) + 16L), 1L) + 1L), 1L) + 1L), 1L) + 1L), 1L) + 1L), 2L), value.pXstat)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes(152L, 4L) + ((KI_NGROUPS).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).strideBytes)), 2L) + 2L), 2L) + 2L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 4L) + 4L), 4L) + 4L), 4L) + 16L), 4L) + 16L), 4L) + 16L), 4L) + 16L), 1L) + 1L), 1L) + 1L), 1L) + 1L), 1L) + 1L), 2L) + 2L), 2L), value.pAcflag)
                    (io.github.kotlinmania.rustlang.core.mem.FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (KI_MAXCOMLEN).toInt())).writeNative(addr + io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes(152L, 4L) + ((KI_NGROUPS).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).strideBytes)), 2L) + 2L), 2L) + 2L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 4L) + 4L), 4L) + 4L), 4L) + 16L), 4L) + 16L), 4L) + 16L), 4L) + 16L), 1L) + 1L), 1L) + 1L), 1L) + 1L), 1L) + 1L), 2L) + 2L), 2L) + 2L), 1L), value.pComm)
                    (io.github.kotlinmania.rustlang.core.mem.FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (KI_WMESGLEN).toInt())).writeNative(addr + io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes(152L, 4L) + ((KI_NGROUPS).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).strideBytes)), 2L) + 2L), 2L) + 2L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 4L) + 4L), 4L) + 4L), 4L) + 16L), 4L) + 16L), 4L) + 16L), 4L) + 16L), 1L) + 1L), 1L) + 1L), 1L) + 1L), 1L) + 1L), 2L) + 2L), 2L) + 2L), 1L) + ((KI_MAXCOMLEN).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8).strideBytes)), 1L), value.pWmesg)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes(152L, 4L) + ((KI_NGROUPS).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).strideBytes)), 2L) + 2L), 2L) + 2L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 4L) + 4L), 4L) + 4L), 4L) + 16L), 4L) + 16L), 4L) + 16L), 4L) + 16L), 1L) + 1L), 1L) + 1L), 1L) + 1L), 1L) + 1L), 2L) + 2L), 2L) + 2L), 1L) + ((KI_MAXCOMLEN).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8).strideBytes)), 1L) + ((KI_WMESGLEN).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8).strideBytes)), 8L), value.pWchan)
                    (io.github.kotlinmania.rustlang.core.mem.FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (KI_MAXLOGNAME).toInt())).writeNative(addr + io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes(152L, 4L) + ((KI_NGROUPS).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).strideBytes)), 2L) + 2L), 2L) + 2L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 4L) + 4L), 4L) + 4L), 4L) + 16L), 4L) + 16L), 4L) + 16L), 4L) + 16L), 1L) + 1L), 1L) + 1L), 1L) + 1L), 1L) + 1L), 2L) + 2L), 2L) + 2L), 1L) + ((KI_MAXCOMLEN).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8).strideBytes)), 1L) + ((KI_WMESGLEN).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8).strideBytes)), 8L) + 8L), 1L), value.pLogin)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes(152L, 4L) + ((KI_NGROUPS).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).strideBytes)), 2L) + 2L), 2L) + 2L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 4L) + 4L), 4L) + 4L), 4L) + 16L), 4L) + 16L), 4L) + 16L), 4L) + 16L), 1L) + 1L), 1L) + 1L), 1L) + 1L), 1L) + 1L), 2L) + 2L), 2L) + 2L), 1L) + ((KI_MAXCOMLEN).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8).strideBytes)), 1L) + ((KI_WMESGLEN).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8).strideBytes)), 8L) + 8L), 1L) + ((KI_MAXLOGNAME).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8).strideBytes)), 4L), value.pVmRssize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes(152L, 4L) + ((KI_NGROUPS).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).strideBytes)), 2L) + 2L), 2L) + 2L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 4L) + 4L), 4L) + 4L), 4L) + 16L), 4L) + 16L), 4L) + 16L), 4L) + 16L), 1L) + 1L), 1L) + 1L), 1L) + 1L), 1L) + 1L), 2L) + 2L), 2L) + 2L), 1L) + ((KI_MAXCOMLEN).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8).strideBytes)), 1L) + ((KI_WMESGLEN).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8).strideBytes)), 8L) + 8L), 1L) + ((KI_MAXLOGNAME).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8).strideBytes)), 4L) + 4L), 4L), value.pVmTsize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes(152L, 4L) + ((KI_NGROUPS).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).strideBytes)), 2L) + 2L), 2L) + 2L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 4L) + 4L), 4L) + 4L), 4L) + 16L), 4L) + 16L), 4L) + 16L), 4L) + 16L), 1L) + 1L), 1L) + 1L), 1L) + 1L), 1L) + 1L), 2L) + 2L), 2L) + 2L), 1L) + ((KI_MAXCOMLEN).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8).strideBytes)), 1L) + ((KI_WMESGLEN).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8).strideBytes)), 8L) + 8L), 1L) + ((KI_MAXLOGNAME).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8).strideBytes)), 4L) + 4L), 4L) + 4L), 4L), value.pVmDsize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes(152L, 4L) + ((KI_NGROUPS).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).strideBytes)), 2L) + 2L), 2L) + 2L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 4L) + 4L), 4L) + 4L), 4L) + 16L), 4L) + 16L), 4L) + 16L), 4L) + 16L), 1L) + 1L), 1L) + 1L), 1L) + 1L), 1L) + 1L), 2L) + 2L), 2L) + 2L), 1L) + ((KI_MAXCOMLEN).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8).strideBytes)), 1L) + ((KI_WMESGLEN).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8).strideBytes)), 8L) + 8L), 1L) + ((KI_MAXLOGNAME).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8).strideBytes)), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L), value.pVmSsize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes(152L, 4L) + ((KI_NGROUPS).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).strideBytes)), 2L) + 2L), 2L) + 2L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 4L) + 4L), 4L) + 4L), 4L) + 16L), 4L) + 16L), 4L) + 16L), 4L) + 16L), 1L) + 1L), 1L) + 1L), 1L) + 1L), 1L) + 1L), 2L) + 2L), 2L) + 2L), 1L) + ((KI_MAXCOMLEN).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8).strideBytes)), 1L) + ((KI_WMESGLEN).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8).strideBytes)), 8L) + 8L), 1L) + ((KI_MAXLOGNAME).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8).strideBytes)), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 8L), value.pUvalid)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes(152L, 4L) + ((KI_NGROUPS).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).strideBytes)), 2L) + 2L), 2L) + 2L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 4L) + 4L), 4L) + 4L), 4L) + 16L), 4L) + 16L), 4L) + 16L), 4L) + 16L), 1L) + 1L), 1L) + 1L), 1L) + 1L), 1L) + 1L), 2L) + 2L), 2L) + 2L), 1L) + ((KI_MAXCOMLEN).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8).strideBytes)), 1L) + ((KI_WMESGLEN).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8).strideBytes)), 8L) + 8L), 1L) + ((KI_MAXLOGNAME).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8).strideBytes)), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 8L) + 8L), 4L), value.pUstartSec)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes(152L, 4L) + ((KI_NGROUPS).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).strideBytes)), 2L) + 2L), 2L) + 2L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 4L) + 4L), 4L) + 4L), 4L) + 16L), 4L) + 16L), 4L) + 16L), 4L) + 16L), 1L) + 1L), 1L) + 1L), 1L) + 1L), 1L) + 1L), 2L) + 2L), 2L) + 2L), 1L) + ((KI_MAXCOMLEN).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8).strideBytes)), 1L) + ((KI_WMESGLEN).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8).strideBytes)), 8L) + 8L), 1L) + ((KI_MAXLOGNAME).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8).strideBytes)), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 8L) + 8L), 4L) + 4L), 4L), value.pUstartUsec)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes(152L, 4L) + ((KI_NGROUPS).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).strideBytes)), 2L) + 2L), 2L) + 2L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 4L) + 4L), 4L) + 4L), 4L) + 16L), 4L) + 16L), 4L) + 16L), 4L) + 16L), 1L) + 1L), 1L) + 1L), 1L) + 1L), 1L) + 1L), 2L) + 2L), 2L) + 2L), 1L) + ((KI_MAXCOMLEN).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8).strideBytes)), 1L) + ((KI_WMESGLEN).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8).strideBytes)), 8L) + 8L), 1L) + ((KI_MAXLOGNAME).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8).strideBytes)), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 8L) + 8L), 4L) + 4L), 4L) + 4L), 4L), value.pUutimeSec)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes(152L, 4L) + ((KI_NGROUPS).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).strideBytes)), 2L) + 2L), 2L) + 2L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 4L) + 4L), 4L) + 4L), 4L) + 16L), 4L) + 16L), 4L) + 16L), 4L) + 16L), 1L) + 1L), 1L) + 1L), 1L) + 1L), 1L) + 1L), 2L) + 2L), 2L) + 2L), 1L) + ((KI_MAXCOMLEN).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8).strideBytes)), 1L) + ((KI_WMESGLEN).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8).strideBytes)), 8L) + 8L), 1L) + ((KI_MAXLOGNAME).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8).strideBytes)), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 8L) + 8L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L), value.pUutimeUsec)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes(152L, 4L) + ((KI_NGROUPS).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).strideBytes)), 2L) + 2L), 2L) + 2L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 4L) + 4L), 4L) + 4L), 4L) + 16L), 4L) + 16L), 4L) + 16L), 4L) + 16L), 1L) + 1L), 1L) + 1L), 1L) + 1L), 1L) + 1L), 2L) + 2L), 2L) + 2L), 1L) + ((KI_MAXCOMLEN).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8).strideBytes)), 1L) + ((KI_WMESGLEN).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8).strideBytes)), 8L) + 8L), 1L) + ((KI_MAXLOGNAME).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8).strideBytes)), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 8L) + 8L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L), value.pUstimeSec)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes(152L, 4L) + ((KI_NGROUPS).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).strideBytes)), 2L) + 2L), 2L) + 2L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 4L) + 4L), 4L) + 4L), 4L) + 16L), 4L) + 16L), 4L) + 16L), 4L) + 16L), 1L) + 1L), 1L) + 1L), 1L) + 1L), 1L) + 1L), 2L) + 2L), 2L) + 2L), 1L) + ((KI_MAXCOMLEN).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8).strideBytes)), 1L) + ((KI_WMESGLEN).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8).strideBytes)), 8L) + 8L), 1L) + ((KI_MAXLOGNAME).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8).strideBytes)), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 8L) + 8L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L), value.pUstimeUsec)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes(152L, 4L) + ((KI_NGROUPS).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).strideBytes)), 2L) + 2L), 2L) + 2L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 4L) + 4L), 4L) + 4L), 4L) + 16L), 4L) + 16L), 4L) + 16L), 4L) + 16L), 1L) + 1L), 1L) + 1L), 1L) + 1L), 1L) + 1L), 2L) + 2L), 2L) + 2L), 1L) + ((KI_MAXCOMLEN).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8).strideBytes)), 1L) + ((KI_WMESGLEN).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8).strideBytes)), 8L) + 8L), 1L) + ((KI_MAXLOGNAME).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8).strideBytes)), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 8L) + 8L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 8L), value.pUruMaxrss)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes(152L, 4L) + ((KI_NGROUPS).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).strideBytes)), 2L) + 2L), 2L) + 2L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 4L) + 4L), 4L) + 4L), 4L) + 16L), 4L) + 16L), 4L) + 16L), 4L) + 16L), 1L) + 1L), 1L) + 1L), 1L) + 1L), 1L) + 1L), 2L) + 2L), 2L) + 2L), 1L) + ((KI_MAXCOMLEN).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8).strideBytes)), 1L) + ((KI_WMESGLEN).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8).strideBytes)), 8L) + 8L), 1L) + ((KI_MAXLOGNAME).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8).strideBytes)), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 8L) + 8L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 8L) + 8L), 8L), value.pUruIxrss)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes(152L, 4L) + ((KI_NGROUPS).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).strideBytes)), 2L) + 2L), 2L) + 2L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 4L) + 4L), 4L) + 4L), 4L) + 16L), 4L) + 16L), 4L) + 16L), 4L) + 16L), 1L) + 1L), 1L) + 1L), 1L) + 1L), 1L) + 1L), 2L) + 2L), 2L) + 2L), 1L) + ((KI_MAXCOMLEN).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8).strideBytes)), 1L) + ((KI_WMESGLEN).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8).strideBytes)), 8L) + 8L), 1L) + ((KI_MAXLOGNAME).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8).strideBytes)), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 8L) + 8L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 8L) + 8L), 8L) + 8L), 8L), value.pUruIdrss)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes(152L, 4L) + ((KI_NGROUPS).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).strideBytes)), 2L) + 2L), 2L) + 2L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 4L) + 4L), 4L) + 4L), 4L) + 16L), 4L) + 16L), 4L) + 16L), 4L) + 16L), 1L) + 1L), 1L) + 1L), 1L) + 1L), 1L) + 1L), 2L) + 2L), 2L) + 2L), 1L) + ((KI_MAXCOMLEN).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8).strideBytes)), 1L) + ((KI_WMESGLEN).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8).strideBytes)), 8L) + 8L), 1L) + ((KI_MAXLOGNAME).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8).strideBytes)), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 8L) + 8L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L), value.pUruIsrss)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes(152L, 4L) + ((KI_NGROUPS).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).strideBytes)), 2L) + 2L), 2L) + 2L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 4L) + 4L), 4L) + 4L), 4L) + 16L), 4L) + 16L), 4L) + 16L), 4L) + 16L), 1L) + 1L), 1L) + 1L), 1L) + 1L), 1L) + 1L), 2L) + 2L), 2L) + 2L), 1L) + ((KI_MAXCOMLEN).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8).strideBytes)), 1L) + ((KI_WMESGLEN).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8).strideBytes)), 8L) + 8L), 1L) + ((KI_MAXLOGNAME).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8).strideBytes)), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 8L) + 8L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L), value.pUruMinflt)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes(152L, 4L) + ((KI_NGROUPS).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).strideBytes)), 2L) + 2L), 2L) + 2L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 4L) + 4L), 4L) + 4L), 4L) + 16L), 4L) + 16L), 4L) + 16L), 4L) + 16L), 1L) + 1L), 1L) + 1L), 1L) + 1L), 1L) + 1L), 2L) + 2L), 2L) + 2L), 1L) + ((KI_MAXCOMLEN).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8).strideBytes)), 1L) + ((KI_WMESGLEN).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8).strideBytes)), 8L) + 8L), 1L) + ((KI_MAXLOGNAME).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8).strideBytes)), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 8L) + 8L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L), value.pUruMajflt)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes(152L, 4L) + ((KI_NGROUPS).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).strideBytes)), 2L) + 2L), 2L) + 2L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 4L) + 4L), 4L) + 4L), 4L) + 16L), 4L) + 16L), 4L) + 16L), 4L) + 16L), 1L) + 1L), 1L) + 1L), 1L) + 1L), 1L) + 1L), 2L) + 2L), 2L) + 2L), 1L) + ((KI_MAXCOMLEN).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8).strideBytes)), 1L) + ((KI_WMESGLEN).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8).strideBytes)), 8L) + 8L), 1L) + ((KI_MAXLOGNAME).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8).strideBytes)), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 8L) + 8L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L), value.pUruNswap)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes(152L, 4L) + ((KI_NGROUPS).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).strideBytes)), 2L) + 2L), 2L) + 2L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 4L) + 4L), 4L) + 4L), 4L) + 16L), 4L) + 16L), 4L) + 16L), 4L) + 16L), 1L) + 1L), 1L) + 1L), 1L) + 1L), 1L) + 1L), 2L) + 2L), 2L) + 2L), 1L) + ((KI_MAXCOMLEN).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8).strideBytes)), 1L) + ((KI_WMESGLEN).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8).strideBytes)), 8L) + 8L), 1L) + ((KI_MAXLOGNAME).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8).strideBytes)), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 8L) + 8L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L), value.pUruInblock)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes(152L, 4L) + ((KI_NGROUPS).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).strideBytes)), 2L) + 2L), 2L) + 2L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 4L) + 4L), 4L) + 4L), 4L) + 16L), 4L) + 16L), 4L) + 16L), 4L) + 16L), 1L) + 1L), 1L) + 1L), 1L) + 1L), 1L) + 1L), 2L) + 2L), 2L) + 2L), 1L) + ((KI_MAXCOMLEN).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8).strideBytes)), 1L) + ((KI_WMESGLEN).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8).strideBytes)), 8L) + 8L), 1L) + ((KI_MAXLOGNAME).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8).strideBytes)), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 8L) + 8L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L), value.pUruOublock)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes(152L, 4L) + ((KI_NGROUPS).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).strideBytes)), 2L) + 2L), 2L) + 2L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 4L) + 4L), 4L) + 4L), 4L) + 16L), 4L) + 16L), 4L) + 16L), 4L) + 16L), 1L) + 1L), 1L) + 1L), 1L) + 1L), 1L) + 1L), 2L) + 2L), 2L) + 2L), 1L) + ((KI_MAXCOMLEN).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8).strideBytes)), 1L) + ((KI_WMESGLEN).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8).strideBytes)), 8L) + 8L), 1L) + ((KI_MAXLOGNAME).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8).strideBytes)), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 8L) + 8L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L), value.pUruMsgsnd)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes(152L, 4L) + ((KI_NGROUPS).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).strideBytes)), 2L) + 2L), 2L) + 2L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 4L) + 4L), 4L) + 4L), 4L) + 16L), 4L) + 16L), 4L) + 16L), 4L) + 16L), 1L) + 1L), 1L) + 1L), 1L) + 1L), 1L) + 1L), 2L) + 2L), 2L) + 2L), 1L) + ((KI_MAXCOMLEN).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8).strideBytes)), 1L) + ((KI_WMESGLEN).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8).strideBytes)), 8L) + 8L), 1L) + ((KI_MAXLOGNAME).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8).strideBytes)), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 8L) + 8L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L), value.pUruMsgrcv)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes(152L, 4L) + ((KI_NGROUPS).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).strideBytes)), 2L) + 2L), 2L) + 2L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 4L) + 4L), 4L) + 4L), 4L) + 16L), 4L) + 16L), 4L) + 16L), 4L) + 16L), 1L) + 1L), 1L) + 1L), 1L) + 1L), 1L) + 1L), 2L) + 2L), 2L) + 2L), 1L) + ((KI_MAXCOMLEN).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8).strideBytes)), 1L) + ((KI_WMESGLEN).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8).strideBytes)), 8L) + 8L), 1L) + ((KI_MAXLOGNAME).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8).strideBytes)), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 8L) + 8L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L), value.pUruNsignals)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes(152L, 4L) + ((KI_NGROUPS).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).strideBytes)), 2L) + 2L), 2L) + 2L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 4L) + 4L), 4L) + 4L), 4L) + 16L), 4L) + 16L), 4L) + 16L), 4L) + 16L), 1L) + 1L), 1L) + 1L), 1L) + 1L), 1L) + 1L), 2L) + 2L), 2L) + 2L), 1L) + ((KI_MAXCOMLEN).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8).strideBytes)), 1L) + ((KI_WMESGLEN).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8).strideBytes)), 8L) + 8L), 1L) + ((KI_MAXLOGNAME).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8).strideBytes)), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 8L) + 8L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L), value.pUruNvcsw)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes(152L, 4L) + ((KI_NGROUPS).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).strideBytes)), 2L) + 2L), 2L) + 2L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 4L) + 4L), 4L) + 4L), 4L) + 16L), 4L) + 16L), 4L) + 16L), 4L) + 16L), 1L) + 1L), 1L) + 1L), 1L) + 1L), 1L) + 1L), 2L) + 2L), 2L) + 2L), 1L) + ((KI_MAXCOMLEN).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8).strideBytes)), 1L) + ((KI_WMESGLEN).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8).strideBytes)), 8L) + 8L), 1L) + ((KI_MAXLOGNAME).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8).strideBytes)), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 8L) + 8L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L), value.pUruNivcsw)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes(152L, 4L) + ((KI_NGROUPS).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).strideBytes)), 2L) + 2L), 2L) + 2L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 4L) + 4L), 4L) + 4L), 4L) + 16L), 4L) + 16L), 4L) + 16L), 4L) + 16L), 1L) + 1L), 1L) + 1L), 1L) + 1L), 1L) + 1L), 2L) + 2L), 2L) + 2L), 1L) + ((KI_MAXCOMLEN).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8).strideBytes)), 1L) + ((KI_WMESGLEN).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8).strideBytes)), 8L) + 8L), 1L) + ((KI_MAXLOGNAME).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8).strideBytes)), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 8L) + 8L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 4L), value.pUctimeSec)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes(152L, 4L) + ((KI_NGROUPS).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).strideBytes)), 2L) + 2L), 2L) + 2L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 4L) + 4L), 4L) + 4L), 4L) + 16L), 4L) + 16L), 4L) + 16L), 4L) + 16L), 1L) + 1L), 1L) + 1L), 1L) + 1L), 1L) + 1L), 2L) + 2L), 2L) + 2L), 1L) + ((KI_MAXCOMLEN).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8).strideBytes)), 1L) + ((KI_WMESGLEN).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8).strideBytes)), 8L) + 8L), 1L) + ((KI_MAXLOGNAME).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8).strideBytes)), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 8L) + 8L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 4L) + 4L), 4L), value.pUctimeUsec)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes(152L, 4L) + ((KI_NGROUPS).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).strideBytes)), 2L) + 2L), 2L) + 2L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 4L) + 4L), 4L) + 4L), 4L) + 16L), 4L) + 16L), 4L) + 16L), 4L) + 16L), 1L) + 1L), 1L) + 1L), 1L) + 1L), 1L) + 1L), 2L) + 2L), 2L) + 2L), 1L) + ((KI_MAXCOMLEN).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8).strideBytes)), 1L) + ((KI_WMESGLEN).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8).strideBytes)), 8L) + 8L), 1L) + ((KI_MAXLOGNAME).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8).strideBytes)), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 8L) + 8L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 4L) + 4L), 4L) + 4L), 8L), value.pCpuid)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes(152L, 4L) + ((KI_NGROUPS).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).strideBytes)), 2L) + 2L), 2L) + 2L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 4L) + 4L), 4L) + 4L), 4L) + 16L), 4L) + 16L), 4L) + 16L), 4L) + 16L), 1L) + 1L), 1L) + 1L), 1L) + 1L), 1L) + 1L), 2L) + 2L), 2L) + 2L), 1L) + ((KI_MAXCOMLEN).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8).strideBytes)), 1L) + ((KI_WMESGLEN).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8).strideBytes)), 8L) + 8L), 1L) + ((KI_MAXLOGNAME).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8).strideBytes)), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 8L) + 8L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 4L) + 4L), 4L) + 4L), 8L) + 8L), 8L), value.pRealflag)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes(152L, 4L) + ((KI_NGROUPS).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).strideBytes)), 2L) + 2L), 2L) + 2L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 4L) + 4L), 4L) + 4L), 4L) + 16L), 4L) + 16L), 4L) + 16L), 4L) + 16L), 1L) + 1L), 1L) + 1L), 1L) + 1L), 1L) + 1L), 2L) + 2L), 2L) + 2L), 1L) + ((KI_MAXCOMLEN).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8).strideBytes)), 1L) + ((KI_WMESGLEN).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8).strideBytes)), 8L) + 8L), 1L) + ((KI_MAXLOGNAME).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8).strideBytes)), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 8L) + 8L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 4L) + 4L), 4L) + 4L), 8L) + 8L), 8L) + 8L), 8L), value.pNlwps)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes(152L, 4L) + ((KI_NGROUPS).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).strideBytes)), 2L) + 2L), 2L) + 2L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 4L) + 4L), 4L) + 4L), 4L) + 16L), 4L) + 16L), 4L) + 16L), 4L) + 16L), 1L) + 1L), 1L) + 1L), 1L) + 1L), 1L) + 1L), 2L) + 2L), 2L) + 2L), 1L) + ((KI_MAXCOMLEN).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8).strideBytes)), 1L) + ((KI_WMESGLEN).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8).strideBytes)), 8L) + 8L), 1L) + ((KI_MAXLOGNAME).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8).strideBytes)), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 8L) + 8L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 4L) + 4L), 4L) + 4L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L), value.pNrlwps)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes(152L, 4L) + ((KI_NGROUPS).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).strideBytes)), 2L) + 2L), 2L) + 2L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 4L) + 4L), 4L) + 4L), 4L) + 16L), 4L) + 16L), 4L) + 16L), 4L) + 16L), 1L) + 1L), 1L) + 1L), 1L) + 1L), 1L) + 1L), 2L) + 2L), 2L) + 2L), 1L) + ((KI_MAXCOMLEN).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8).strideBytes)), 1L) + ((KI_WMESGLEN).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8).strideBytes)), 8L) + 8L), 1L) + ((KI_MAXLOGNAME).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8).strideBytes)), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 8L) + 8L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 4L) + 4L), 4L) + 4L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L), value.pRealstat)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes(152L, 4L) + ((KI_NGROUPS).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).strideBytes)), 2L) + 2L), 2L) + 2L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 4L) + 4L), 4L) + 4L), 4L) + 16L), 4L) + 16L), 4L) + 16L), 4L) + 16L), 1L) + 1L), 1L) + 1L), 1L) + 1L), 1L) + 1L), 2L) + 2L), 2L) + 2L), 1L) + ((KI_MAXCOMLEN).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8).strideBytes)), 1L) + ((KI_WMESGLEN).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8).strideBytes)), 8L) + 8L), 1L) + ((KI_MAXLOGNAME).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8).strideBytes)), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 8L) + 8L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 4L) + 4L), 4L) + 4L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 4L), value.pSvuid)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes(152L, 4L) + ((KI_NGROUPS).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).strideBytes)), 2L) + 2L), 2L) + 2L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 4L) + 4L), 4L) + 4L), 4L) + 16L), 4L) + 16L), 4L) + 16L), 4L) + 16L), 1L) + 1L), 1L) + 1L), 1L) + 1L), 1L) + 1L), 2L) + 2L), 2L) + 2L), 1L) + ((KI_MAXCOMLEN).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8).strideBytes)), 1L) + ((KI_WMESGLEN).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8).strideBytes)), 8L) + 8L), 1L) + ((KI_MAXLOGNAME).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8).strideBytes)), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 8L) + 8L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 4L) + 4L), 4L) + 4L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 4L) + 4L), 4L), value.pSvgid)
                    (io.github.kotlinmania.rustlang.core.mem.FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (KI_MAXEMULLEN).toInt())).writeNative(addr + io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes(152L, 4L) + ((KI_NGROUPS).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).strideBytes)), 2L) + 2L), 2L) + 2L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 4L) + 4L), 4L) + 4L), 4L) + 16L), 4L) + 16L), 4L) + 16L), 4L) + 16L), 1L) + 1L), 1L) + 1L), 1L) + 1L), 1L) + 1L), 2L) + 2L), 2L) + 2L), 1L) + ((KI_MAXCOMLEN).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8).strideBytes)), 1L) + ((KI_WMESGLEN).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8).strideBytes)), 8L) + 8L), 1L) + ((KI_MAXLOGNAME).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8).strideBytes)), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 8L) + 8L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 4L) + 4L), 4L) + 4L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 4L) + 4L), 4L) + 4L), 1L), value.pEname)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes(152L, 4L) + ((KI_NGROUPS).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).strideBytes)), 2L) + 2L), 2L) + 2L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 4L) + 4L), 4L) + 4L), 4L) + 16L), 4L) + 16L), 4L) + 16L), 4L) + 16L), 1L) + 1L), 1L) + 1L), 1L) + 1L), 1L) + 1L), 2L) + 2L), 2L) + 2L), 1L) + ((KI_MAXCOMLEN).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8).strideBytes)), 1L) + ((KI_WMESGLEN).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8).strideBytes)), 8L) + 8L), 1L) + ((KI_MAXLOGNAME).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8).strideBytes)), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 8L) + 8L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 4L) + 4L), 4L) + 4L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 4L) + 4L), 4L) + 4L), 1L) + ((KI_MAXEMULLEN).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8).strideBytes)), 8L), value.pVmVsize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes(152L, 4L) + ((KI_NGROUPS).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).strideBytes)), 2L) + 2L), 2L) + 2L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 4L) + 4L), 4L) + 4L), 4L) + 16L), 4L) + 16L), 4L) + 16L), 4L) + 16L), 1L) + 1L), 1L) + 1L), 1L) + 1L), 1L) + 1L), 2L) + 2L), 2L) + 2L), 1L) + ((KI_MAXCOMLEN).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8).strideBytes)), 1L) + ((KI_WMESGLEN).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8).strideBytes)), 8L) + 8L), 1L) + ((KI_MAXLOGNAME).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8).strideBytes)), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 8L) + 8L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 4L) + 4L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 4L) + 4L), 4L) + 4L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 8L) + 8L), 4L) + 4L), 4L) + 4L), 1L) + ((KI_MAXEMULLEN).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8).strideBytes)), 8L) + 8L), 8L), value.pVmMsize)
                }
            }
    }
}

public class KinfoLwp(
    public var lForw: ULong = 0uL,
    public var lBack: ULong = 0uL,
    public var lLaddr: ULong = 0uL,
    public var lAddr: ULong = 0uL,
    public var lLid: Int = 0,
    public var lFlag: Int = 0,
    public var lSwtime: UInt = 0u,
    public var lSlptime: UInt = 0u,
    public var lSchedflags: Int = 0,
    public var lHoldcnt: Int = 0,
    public var lPriority: UByte = 0u,
    public var lUsrpri: UByte = 0u,
    public var lStat: Byte = 0,
    public var lPad1: Byte = 0,
    public var lPad2: Int = 0,
    public var lWmesg: UByteArray = UByteArray(KI_WMESGLEN),
    public var lWchan: ULong = 0uL,
    public var lCpuid: ULong = 0uL,
    public var lRtimeSec: UInt = 0u,
    public var lRtimeUsec: UInt = 0u,
    public var lCpticks: UInt = 0u,
    public var lPctcpu: UInt = 0u,
    public var lPid: UInt = 0u,
    public var lName: UByteArray = UByteArray(KI_LNAMELEN),
)

public class KinfoVmentry(
    public var kveStart: ULong = 0uL,
    public var kveEnd: ULong = 0uL,
    public var kveOffset: ULong = 0uL,
    public var kveType: UInt = 0u,
    public var kveFlags: UInt = 0u,
    public var kveCount: UInt = 0u,
    public var kveWiredCount: UInt = 0u,
    public var kveAdvice: UInt = 0u,
    public var kveAttributes: UInt = 0u,
    public var kveProtection: UInt = 0u,
    public var kveMaxProtection: UInt = 0u,
    public var kveRefCount: UInt = 0u,
    public var kveInheritance: UInt = 0u,
    public var kveVnFileid: ULong = 0uL,
    public var kveVnSize: ULong = 0uL,
    public var kveVnFsid: ULong = 0uL,
    public var kveVnRdev: ULong = 0uL,
    public var kveVnType: UInt = 0u,
    public var kveVnMode: UInt = 0u,
    public var kvePath: UByteArray = UByteArray(PATH_MAX),
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<KinfoVmentry> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<KinfoVmentry> {
                override val sizeBytes: Long = io.github.kotlinmania.rustlang.core.mem.alignUpBytes((io.github.kotlinmania.rustlang.core.mem.alignUpBytes(104L, 1L) + ((PATH_MAX).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8).strideBytes)), maxOf(maxOf(8L, 4L), 1L))
                override val alignBytes: Long = maxOf(maxOf(8L, 4L), 1L)
                override fun readNative(addr: Long): KinfoVmentry =
                    KinfoVmentry(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 28L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 32L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 36L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 40L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 44L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 48L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 52L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 56L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 60L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 64L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 72L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 80L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 88L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 96L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 100L),
                        (io.github.kotlinmania.rustlang.core.mem.FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (PATH_MAX).toInt())).readNative(addr + io.github.kotlinmania.rustlang.core.mem.alignUpBytes(104L, 1L)),
                    )
                override fun writeNative(addr: Long, value: KinfoVmentry) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr, value.kveStart)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 8L, value.kveEnd)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 16L, value.kveOffset)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 24L, value.kveType)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 28L, value.kveFlags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 32L, value.kveCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 36L, value.kveWiredCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 40L, value.kveAdvice)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 44L, value.kveAttributes)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 48L, value.kveProtection)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 52L, value.kveMaxProtection)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 56L, value.kveRefCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 60L, value.kveInheritance)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 64L, value.kveVnFileid)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 72L, value.kveVnSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 80L, value.kveVnFsid)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 88L, value.kveVnRdev)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 96L, value.kveVnType)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 100L, value.kveVnMode)
                    (io.github.kotlinmania.rustlang.core.mem.FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (PATH_MAX).toInt())).writeNative(addr + io.github.kotlinmania.rustlang.core.mem.alignUpBytes(104L, 1L), value.kvePath)
                }
            }
    }
}

public class CAnonymousPosixSpawnFaeOpen internal constructor(
    pathCtorArg: MutPtr<CChar>,
    public var oflag: CInt,
    public var mode: ModeT,
) {
    public var path: MutPtr<CChar> = pathCtorArg
        internal set

    public constructor() : this(
        pathCtorArg = MutPtr(0L),
        oflag = 0,
        mode = 0u,
    )

    public operator fun component1(): MutPtr<CChar> = this.path

    public operator fun component2(): CInt = this.oflag

    public operator fun component3(): ModeT = this.mode

    public fun copy(path: MutPtr<CChar> = this.path, oflag: CInt = this.oflag, mode: ModeT = this.mode): CAnonymousPosixSpawnFaeOpen = CAnonymousPosixSpawnFaeOpen(pathCtorArg = path, oflag = oflag, mode = mode)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CAnonymousPosixSpawnFaeOpen) return false
        if (this.path != other.path) return false
        if (this.oflag != other.oflag) return false
        if (this.mode != other.mode) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.path.hashCode()
        result = 31 * result + this.oflag.hashCode()
        result = 31 * result + this.mode.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            path: MutPtr<CChar> = MutPtr(0L),
            oflag: CInt = 0,
            mode: ModeT = 0u,
        ): CAnonymousPosixSpawnFaeOpen = CAnonymousPosixSpawnFaeOpen(
            pathCtorArg = path,
            oflag = oflag,
            mode = mode,
        )
    }
}

public data class CAnonymousPosixSpawnFaeDup2(
    public var newfildes: CInt = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<CAnonymousPosixSpawnFaeDup2> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<CAnonymousPosixSpawnFaeDup2> {
                override val sizeBytes: Long = 4L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): CAnonymousPosixSpawnFaeDup2 =
                    CAnonymousPosixSpawnFaeDup2(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: CAnonymousPosixSpawnFaeDup2) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.newfildes)
                }
            }
    }
}

public data class PosixSpawnattrT(
    public var saFlags: CShort = 0,
    public var saPgroup: PidT = 0,
    public var saSchedparam: SchedParam = SchedParam(),
    public var saSchedpolicy: CInt = 0,
    public var saSigdefault: SigsetT = SigsetT(),
    public var saSigmask: SigsetT = SigsetT(),
)

public data class PosixSpawnFileActionsEntryT(
    public var faeAction: FaeAction = FaeAction.entries.first(),
    public var faeFildes: CInt = 0,
    public var faeData: CAnonymousPosixSpawnFae = CAnonymousPosixSpawnFae(),
)

public class PosixSpawnFileActionsT internal constructor(
    public var size: CUint,
    public var len: CUint,
    faeCtorArg: MutPtr<PosixSpawnFileActionsEntryT>,
) {
    public var fae: MutPtr<PosixSpawnFileActionsEntryT> = faeCtorArg
        internal set

    public constructor() : this(
        size = 0u,
        len = 0u,
        faeCtorArg = MutPtr(0L),
    )

    public operator fun component1(): CUint = this.size

    public operator fun component2(): CUint = this.len

    public operator fun component3(): MutPtr<PosixSpawnFileActionsEntryT> = this.fae

    public fun copy(size: CUint = this.size, len: CUint = this.len, fae: MutPtr<PosixSpawnFileActionsEntryT> = this.fae): PosixSpawnFileActionsT = PosixSpawnFileActionsT(size = size, len = len, faeCtorArg = fae)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PosixSpawnFileActionsT) return false
        if (this.size != other.size) return false
        if (this.len != other.len) return false
        if (this.fae != other.fae) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.size.hashCode()
        result = 31 * result + this.len.hashCode()
        result = 31 * result + this.fae.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<PosixSpawnFileActionsT> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<PosixSpawnFileActionsT> {
                override val sizeBytes: Long = 16L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): PosixSpawnFileActionsT =
                    PosixSpawnFileActionsT(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.mutPtrLayout<PosixSpawnFileActionsEntryT>(64)).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: PosixSpawnFileActionsT) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.size)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.len)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.mutPtrLayout<PosixSpawnFileActionsEntryT>(64)).writeNative(addr + 8L, value.fae)
                }
            }

        public operator fun invoke(
            size: CUint = 0u,
            len: CUint = 0u,
            fae: MutPtr<PosixSpawnFileActionsEntryT> = MutPtr(0L),
        ): PosixSpawnFileActionsT = PosixSpawnFileActionsT(
            size = size,
            len = len,
            faeCtorArg = fae,
        )
    }
}

public data class PtraceLwpinfo(
    public var plLwpid: LwpidT = 0,
    public var plEvent: CInt = 0,
)

public class PtraceLwpstatus internal constructor(
    public var plLwpid: LwpidT,
    public var plSigpend: SigsetT,
    public var plSigmask: SigsetT,
    public var plName: UByteArray,
    plPrivateCtorArg: MutPtr<CVoid>,
) {
    public var plPrivate: MutPtr<CVoid> = plPrivateCtorArg
        internal set

    public constructor() : this(
        plLwpid = 0,
        plSigpend = SigsetT(),
        plSigmask = SigsetT(),
        plName = UByteArray(20),
        plPrivateCtorArg = MutPtr(0L),
    )

    public operator fun component1(): LwpidT = this.plLwpid

    public operator fun component2(): SigsetT = this.plSigpend

    public operator fun component3(): SigsetT = this.plSigmask

    public operator fun component4(): UByteArray = this.plName

    public operator fun component5(): MutPtr<CVoid> = this.plPrivate

    public fun copy(plLwpid: LwpidT = this.plLwpid, plSigpend: SigsetT = this.plSigpend, plSigmask: SigsetT = this.plSigmask, plName: UByteArray = this.plName, plPrivate: MutPtr<CVoid> = this.plPrivate): PtraceLwpstatus = PtraceLwpstatus(plLwpid = plLwpid, plSigpend = plSigpend, plSigmask = plSigmask, plName = plName, plPrivateCtorArg = plPrivate)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PtraceLwpstatus) return false
        if (this.plLwpid != other.plLwpid) return false
        if (this.plSigpend != other.plSigpend) return false
        if (this.plSigmask != other.plSigmask) return false
        if (!this.plName.contentEquals(other.plName)) return false
        if (this.plPrivate != other.plPrivate) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.plLwpid.hashCode()
        result = 31 * result + this.plSigpend.hashCode()
        result = 31 * result + this.plSigmask.hashCode()
        result = 31 * result + this.plName.contentHashCode()
        result = 31 * result + this.plPrivate.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            plLwpid: LwpidT = 0,
            plSigpend: SigsetT = SigsetT(),
            plSigmask: SigsetT = SigsetT(),
            plName: UByteArray = UByteArray(20),
            plPrivate: MutPtr<CVoid> = MutPtr(0L),
        ): PtraceLwpstatus = PtraceLwpstatus(
            plLwpid = plLwpid,
            plSigpend = plSigpend,
            plSigmask = plSigmask,
            plName = plName,
            plPrivateCtorArg = plPrivate,
        )
    }
}

public data class PtraceSiginfo(
    public var psiSiginfo: SiginfoT = SiginfoT(),
    public var psiLwpid: LwpidT = 0,
)

public data class PtraceEvent(
    public var peSetEvent: CInt = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<PtraceEvent> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<PtraceEvent> {
                override val sizeBytes: Long = 4L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): PtraceEvent =
                    PtraceEvent(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: PtraceEvent) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.peSetEvent)
                }
            }
    }
}

public data class Sysctldesc(
    public var descrNum: Int = 0,
    public var descrVer: UInt = 0u,
    public var descrLen: UInt = 0u,
    public var descrStr: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Sysctldesc) return false
        if (this.descrNum != other.descrNum) return false
        if (this.descrVer != other.descrVer) return false
        if (this.descrLen != other.descrLen) return false
        if (!this.descrStr.contentEquals(other.descrStr)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.descrNum.hashCode()
        result = 31 * result + this.descrVer.hashCode()
        result = 31 * result + this.descrLen.hashCode()
        result = 31 * result + this.descrStr.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Sysctldesc> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Sysctldesc> {
                override val sizeBytes: Long = 16L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): Sysctldesc =
                    Sysctldesc(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (1).toInt())).readNative(addr + 12L),
                    )
                override fun writeNative(addr: Long, value: Sysctldesc) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.descrNum)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.descrVer)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.descrLen)
                    (io.github.kotlinmania.rustlang.core.mem.FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (1).toInt())).writeNative(addr + 12L, value.descrStr)
                }
            }
    }
}

public class TcpInfo(
    public var tcpiState: UByte = 0u,
    public var tcpiCaState: UByte = 0u,
    public var tcpiRetransmits: UByte = 0u,
    public var tcpiProbes: UByte = 0u,
    public var tcpiBackoff: UByte = 0u,
    public var tcpiOptions: UByte = 0u,
    public var tcpSndWscale: UByte = 0u,
    public var tcpRcvWscale: UByte = 0u,
    public var tcpiRto: UInt = 0u,
    public var tcpiAto: UInt = 0u,
    public var tcpiSndMss: UInt = 0u,
    public var tcpiRcvMss: UInt = 0u,
    public var tcpiUnacked: UInt = 0u,
    public var tcpiSacked: UInt = 0u,
    public var tcpiLost: UInt = 0u,
    public var tcpiRetrans: UInt = 0u,
    public var tcpiFackets: UInt = 0u,
    public var tcpiLastDataSent: UInt = 0u,
    public var tcpiLastAckSent: UInt = 0u,
    public var tcpiLastDataRecv: UInt = 0u,
    public var tcpiLastAckRecv: UInt = 0u,
    public var tcpiPmtu: UInt = 0u,
    public var tcpiRcvSsthresh: UInt = 0u,
    public var tcpiRtt: UInt = 0u,
    public var tcpiRttvar: UInt = 0u,
    public var tcpiSndSsthresh: UInt = 0u,
    public var tcpiSndCwnd: UInt = 0u,
    public var tcpiAdvmss: UInt = 0u,
    public var tcpiReordering: UInt = 0u,
    public var tcpiRcvRtt: UInt = 0u,
    public var tcpiRcvSpace: UInt = 0u,
    public var tcpiSndWnd: UInt = 0u,
    public var tcpiSndBwnd: UInt = 0u,
    public var tcpiSndNxt: UInt = 0u,
    public var tcpiRcvNxt: UInt = 0u,
    public var tcpiToeTid: UInt = 0u,
    public var tcpiSndRexmitpack: UInt = 0u,
    public var tcpiRcvOoopack: UInt = 0u,
    public var tcpiSndZerowin: UInt = 0u,
    public var tcpiPad: UIntArray = UIntArray(26),
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<TcpInfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<TcpInfo> {
                override val sizeBytes: Long = 236L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): TcpInfo =
                    TcpInfo(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 1L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 2L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 3L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 5L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 6L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 7L),
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
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 60L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 64L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 68L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 72L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 76L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 80L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 84L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 88L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 92L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 96L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 100L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 104L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 108L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 112L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 116L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 120L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 124L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 128L),
                        (io.github.kotlinmania.rustlang.core.mem.FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32, (26).toInt())).readNative(addr + 132L),
                    )
                override fun writeNative(addr: Long, value: TcpInfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr, value.tcpiState)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 1L, value.tcpiCaState)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 2L, value.tcpiRetransmits)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 3L, value.tcpiProbes)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 4L, value.tcpiBackoff)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 5L, value.tcpiOptions)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 6L, value.tcpSndWscale)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 7L, value.tcpRcvWscale)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.tcpiRto)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.tcpiAto)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.tcpiSndMss)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.tcpiRcvMss)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 24L, value.tcpiUnacked)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 28L, value.tcpiSacked)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 32L, value.tcpiLost)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 36L, value.tcpiRetrans)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 40L, value.tcpiFackets)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 44L, value.tcpiLastDataSent)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 48L, value.tcpiLastAckSent)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 52L, value.tcpiLastDataRecv)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 56L, value.tcpiLastAckRecv)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 60L, value.tcpiPmtu)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 64L, value.tcpiRcvSsthresh)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 68L, value.tcpiRtt)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 72L, value.tcpiRttvar)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 76L, value.tcpiSndSsthresh)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 80L, value.tcpiSndCwnd)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 84L, value.tcpiAdvmss)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 88L, value.tcpiReordering)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 92L, value.tcpiRcvRtt)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 96L, value.tcpiRcvSpace)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 100L, value.tcpiSndWnd)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 104L, value.tcpiSndBwnd)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 108L, value.tcpiSndNxt)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 112L, value.tcpiRcvNxt)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 116L, value.tcpiToeTid)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 120L, value.tcpiSndRexmitpack)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 124L, value.tcpiRcvOoopack)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 128L, value.tcpiSndZerowin)
                    (io.github.kotlinmania.rustlang.core.mem.FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32, (26).toInt())).writeNative(addr + 132L, value.tcpiPad)
                }
            }
    }
}

public data class InPktinfo(
    public var ipiAddr: InAddr = InAddr(),
    public var ipiIfindex: CUint = 0u,
)

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

public data class IpMreq(
    public var imrMultiaddr: InAddr = InAddr(),
    public var imrInterface: InAddr = InAddr(),
)

public data class SockaddrIn(
    public var sinLen: UByte = 0u,
    public var sinFamily: SaFamilyT = 0u,
    public var sinPort: InPortT = 0u,
    public var sinAddr: InAddr = InAddr(),
    public var sinZero: ByteArray = ByteArray(8),
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

public data class Dirent(
    public var dFileno: InoT = 0uL,
    public var dReclen: UShort = 0u,
    public var dNamlen: UShort = 0u,
    public var dType: UByte = 0u,
    public var dName: UByteArray = UByteArray(512),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Dirent) return false
        if (this.dFileno != other.dFileno) return false
        if (this.dReclen != other.dReclen) return false
        if (this.dNamlen != other.dNamlen) return false
        if (this.dType != other.dType) return false
        if (!this.dName.contentEquals(other.dName)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dFileno.hashCode()
        result = 31 * result + this.dReclen.hashCode()
        result = 31 * result + this.dNamlen.hashCode()
        result = 31 * result + this.dType.hashCode()
        result = 31 * result + this.dName.contentHashCode()
        return result
    }
}

public data class SockaddrStorage(
    public var ssLen: UByte = 0u,
    public var ssFamily: SaFamilyT = 0u,
    public var ssPad1: UByteArray = UByteArray(6),
    public var ssPad2: Long = 0L,
    public var ssPad3: UByteArray = UByteArray(112),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SockaddrStorage) return false
        if (this.ssLen != other.ssLen) return false
        if (this.ssFamily != other.ssFamily) return false
        if (!this.ssPad1.contentEquals(other.ssPad1)) return false
        if (this.ssPad2 != other.ssPad2) return false
        if (!this.ssPad3.contentEquals(other.ssPad3)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.ssLen.hashCode()
        result = 31 * result + this.ssFamily.hashCode()
        result = 31 * result + this.ssPad1.contentHashCode()
        result = 31 * result + this.ssPad2.hashCode()
        result = 31 * result + this.ssPad3.contentHashCode()
        return result
    }
}

public class Sigevent internal constructor(
    public var sigevNotify: CInt,
    public var sigevSigno: CInt,
    public var sigevValue: Sigval,
    unused1CtorArg: MutPtr<CVoid>,
    sigevNotifyAttributesCtorArg: MutPtr<CVoid>,
) {
    public var unused1: MutPtr<CVoid> = unused1CtorArg
        internal set

    // actually a function pointer
    public var sigevNotifyAttributes: MutPtr<CVoid> = sigevNotifyAttributesCtorArg
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

    public operator fun component5(): MutPtr<CVoid> = this.sigevNotifyAttributes

    public fun copy(sigevNotify: CInt = this.sigevNotify, sigevSigno: CInt = this.sigevSigno, sigevValue: Sigval = this.sigevValue, unused1: MutPtr<CVoid> = this.unused1, sigevNotifyAttributes: MutPtr<CVoid> = this.sigevNotifyAttributes): Sigevent = Sigevent(sigevNotify = sigevNotify, sigevSigno = sigevSigno, sigevValue = sigevValue, unused1CtorArg = unused1, sigevNotifyAttributesCtorArg = sigevNotifyAttributes)

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
            sigevNotifyAttributes: MutPtr<CVoid> = MutPtr(0L),
        ): Sigevent = Sigevent(
            sigevNotify = sigevNotify,
            sigevSigno = sigevSigno,
            sigevValue = sigevValue,
            unused1CtorArg = unused1,
            sigevNotifyAttributesCtorArg = sigevNotifyAttributes,
        )
    }
}

public data class CAnonymousPosixSpawnFae(
    public var open: CAnonymousPosixSpawnFaeOpen = CAnonymousPosixSpawnFaeOpen(),
    public var dup2: CAnonymousPosixSpawnFaeDup2 = CAnonymousPosixSpawnFaeDup2(),
) {
    public fun fmt(f: StringBuilder) {
        DebugStruct(f, "__c_anonymous_posix_spawn_fae").finishNonExhaustive()
    }

    public fun eq(other: CAnonymousPosixSpawnFae): Boolean = this.open == other.open || this.dup2 == other.dup2

    public override fun hashCode(): Int {
        var state = 0
        run {
            state = 31 * state + (this.open).hashCode()
            state = 31 * state + (this.dup2).hashCode()
        }
        return state
    }
}
