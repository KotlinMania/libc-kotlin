@file:OptIn(ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CChar
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CLong
import io.github.kotlinmania.libc.CShort
import io.github.kotlinmania.libc.CUchar
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.CUlong
import io.github.kotlinmania.libc.CUshort
import io.github.kotlinmania.libc.unix.GidT
import io.github.kotlinmania.libc.unix.IFNAMSIZ
import io.github.kotlinmania.libc.unix.In6Addr
import io.github.kotlinmania.libc.unix.PidT
import io.github.kotlinmania.libc.unix.Sigval
import io.github.kotlinmania.libc.unix.SizeT
import io.github.kotlinmania.libc.unix.SsizeT
import io.github.kotlinmania.libc.unix.Timespec
import io.github.kotlinmania.libc.unix.Timeval
import io.github.kotlinmania.libc.unix.UidT
import io.github.kotlinmania.libc.unix.UintptrT
import io.github.kotlinmania.libc.unix.bsd.FsidT
import io.github.kotlinmania.libc.unix.bsd.Msghdr
import io.github.kotlinmania.libc.unix.bsd.OffT
import io.github.kotlinmania.libc.unix.bsd.PATH_MAX
import io.github.kotlinmania.libc.unix.bsd.Sockaddr
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.InAddr
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.IpcPerm
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.SiginfoT
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.SigsetT
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.SockaddrStorage
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.aarch64.McontextT
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.aarch64.RegisterT
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.aarch64.TimeT
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.freebsd11.SPECNAMELEN
import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
import io.github.kotlinmania.rustlang.core.mem.TypeLayout
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

// sys/cpuset.h
public class Aiocb internal constructor(
    public var aioFildes: CInt,
    public var aioOffset: OffT,
    aioBufCtorArg: MutPtr<CVoid>,
    public var aioNbytes: SizeT,
    public var unused1: IntArray,
    unused2CtorArg: MutPtr<CVoid>,
    public var aioLioOpcode: CInt,
    public var aioReqprio: CInt,
    // unused 3 through 5 are the __aiocb_private structure
    public var unused3: CLong,
    public var unused4: CLong,
    unused5CtorArg: MutPtr<CVoid>,
    public var aioSigevent: Sigevent,
) {
    public var aioBuf: MutPtr<CVoid> = aioBufCtorArg
        internal set

    public var unused2: MutPtr<CVoid> = unused2CtorArg
        internal set

    public var unused5: MutPtr<CVoid> = unused5CtorArg
        internal set

    public constructor() : this(
        aioFildes = 0,
        aioOffset = 0L,
        aioBufCtorArg = MutPtr(0L),
        aioNbytes = 0uL,
        unused1 = IntArray(2),
        unused2CtorArg = MutPtr(0L),
        aioLioOpcode = 0,
        aioReqprio = 0,
        unused3 = 0L,
        unused4 = 0L,
        unused5CtorArg = MutPtr(0L),
        aioSigevent = Sigevent(),
    )

    public operator fun component1(): CInt = this.aioFildes

    public operator fun component2(): OffT = this.aioOffset

    public operator fun component3(): MutPtr<CVoid> = this.aioBuf

    public operator fun component4(): SizeT = this.aioNbytes

    public operator fun component5(): IntArray = this.unused1

    public operator fun component6(): MutPtr<CVoid> = this.unused2

    public operator fun component7(): CInt = this.aioLioOpcode

    public operator fun component8(): CInt = this.aioReqprio

    public operator fun component9(): CLong = this.unused3

    public operator fun component10(): CLong = this.unused4

    public operator fun component11(): MutPtr<CVoid> = this.unused5

    public operator fun component12(): Sigevent = this.aioSigevent

    public fun copy(aioFildes: CInt = this.aioFildes, aioOffset: OffT = this.aioOffset, aioBuf: MutPtr<CVoid> = this.aioBuf, aioNbytes: SizeT = this.aioNbytes, unused1: IntArray = this.unused1, unused2: MutPtr<CVoid> = this.unused2, aioLioOpcode: CInt = this.aioLioOpcode, aioReqprio: CInt = this.aioReqprio, unused3: CLong = this.unused3, unused4: CLong = this.unused4, unused5: MutPtr<CVoid> = this.unused5, aioSigevent: Sigevent = this.aioSigevent): Aiocb = Aiocb(aioFildes = aioFildes, aioOffset = aioOffset, aioBufCtorArg = aioBuf, aioNbytes = aioNbytes, unused1 = unused1, unused2CtorArg = unused2, aioLioOpcode = aioLioOpcode, aioReqprio = aioReqprio, unused3 = unused3, unused4 = unused4, unused5CtorArg = unused5, aioSigevent = aioSigevent)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Aiocb) return false
        if (this.aioFildes != other.aioFildes) return false
        if (this.aioOffset != other.aioOffset) return false
        if (this.aioBuf != other.aioBuf) return false
        if (this.aioNbytes != other.aioNbytes) return false
        if (!this.unused1.contentEquals(other.unused1)) return false
        if (this.unused2 != other.unused2) return false
        if (this.aioLioOpcode != other.aioLioOpcode) return false
        if (this.aioReqprio != other.aioReqprio) return false
        if (this.unused3 != other.unused3) return false
        if (this.unused4 != other.unused4) return false
        if (this.unused5 != other.unused5) return false
        if (this.aioSigevent != other.aioSigevent) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.aioFildes.hashCode()
        result = 31 * result + this.aioOffset.hashCode()
        result = 31 * result + this.aioBuf.hashCode()
        result = 31 * result + this.aioNbytes.hashCode()
        result = 31 * result + this.unused1.contentHashCode()
        result = 31 * result + this.unused2.hashCode()
        result = 31 * result + this.aioLioOpcode.hashCode()
        result = 31 * result + this.aioReqprio.hashCode()
        result = 31 * result + this.unused3.hashCode()
        result = 31 * result + this.unused4.hashCode()
        result = 31 * result + this.unused5.hashCode()
        result = 31 * result + this.aioSigevent.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            aioFildes: CInt = 0,
            aioOffset: OffT = 0L,
            aioBuf: MutPtr<CVoid> = MutPtr(0L),
            aioNbytes: SizeT = 0uL,
            unused1: IntArray = IntArray(2),
            unused2: MutPtr<CVoid> = MutPtr(0L),
            aioLioOpcode: CInt = 0,
            aioReqprio: CInt = 0,
            unused3: CLong = 0L,
            unused4: CLong = 0L,
            unused5: MutPtr<CVoid> = MutPtr(0L),
            aioSigevent: Sigevent = Sigevent(),
        ): Aiocb =
            Aiocb(
                aioFildes = aioFildes,
                aioOffset = aioOffset,
                aioBufCtorArg = aioBuf,
                aioNbytes = aioNbytes,
                unused1 = unused1,
                unused2CtorArg = unused2,
                aioLioOpcode = aioLioOpcode,
                aioReqprio = aioReqprio,
                unused3 = unused3,
                unused4 = unused4,
                unused5CtorArg = unused5,
                aioSigevent = aioSigevent,
            )
    }
}

public class Jail internal constructor(
    public var version: UInt,
    pathCtorArg: MutPtr<CChar>,
    hostnameCtorArg: MutPtr<CChar>,
    jailnameCtorArg: MutPtr<CChar>,
    public var ip4s: CUint,
    public var ip6s: CUint,
    ip4CtorArg: MutPtr<InAddr>,
    ip6CtorArg: MutPtr<In6Addr>,
) {
    public var path: MutPtr<CChar> = pathCtorArg
        internal set

    public var hostname: MutPtr<CChar> = hostnameCtorArg
        internal set

    public var jailname: MutPtr<CChar> = jailnameCtorArg
        internal set

    public var ip4: MutPtr<InAddr> = ip4CtorArg
        internal set

    public var ip6: MutPtr<In6Addr> = ip6CtorArg
        internal set

    public constructor() : this(
        version = 0u,
        pathCtorArg = MutPtr(0L),
        hostnameCtorArg = MutPtr(0L),
        jailnameCtorArg = MutPtr(0L),
        ip4s = 0u,
        ip6s = 0u,
        ip4CtorArg = MutPtr(0L),
        ip6CtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.version

    public operator fun component2(): MutPtr<CChar> = this.path

    public operator fun component3(): MutPtr<CChar> = this.hostname

    public operator fun component4(): MutPtr<CChar> = this.jailname

    public operator fun component5(): CUint = this.ip4s

    public operator fun component6(): CUint = this.ip6s

    public operator fun component7(): MutPtr<InAddr> = this.ip4

    public operator fun component8(): MutPtr<In6Addr> = this.ip6

    public fun copy(version: UInt = this.version, path: MutPtr<CChar> = this.path, hostname: MutPtr<CChar> = this.hostname, jailname: MutPtr<CChar> = this.jailname, ip4s: CUint = this.ip4s, ip6s: CUint = this.ip6s, ip4: MutPtr<InAddr> = this.ip4, ip6: MutPtr<In6Addr> = this.ip6): Jail = Jail(version = version, pathCtorArg = path, hostnameCtorArg = hostname, jailnameCtorArg = jailname, ip4s = ip4s, ip6s = ip6s, ip4CtorArg = ip4, ip6CtorArg = ip6)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Jail) return false
        if (this.version != other.version) return false
        if (this.path != other.path) return false
        if (this.hostname != other.hostname) return false
        if (this.jailname != other.jailname) return false
        if (this.ip4s != other.ip4s) return false
        if (this.ip6s != other.ip6s) return false
        if (this.ip4 != other.ip4) return false
        if (this.ip6 != other.ip6) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.version.hashCode()
        result = 31 * result + this.path.hashCode()
        result = 31 * result + this.hostname.hashCode()
        result = 31 * result + this.jailname.hashCode()
        result = 31 * result + this.ip4s.hashCode()
        result = 31 * result + this.ip6s.hashCode()
        result = 31 * result + this.ip4.hashCode()
        result = 31 * result + this.ip6.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Jail> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Jail> {
                override val sizeBytes: Long = 56L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): Jail =
                    Jail(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
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
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 32L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 36L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<InAddr>(64)
                        ).readNative(addr + 40L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<In6Addr>(64)
                        ).readNative(addr + 48L),
                    )
                override fun writeNative(addr: Long, value: Jail) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.version)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CChar>(64)
                    ).writeNative(addr + 8L, value.path)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CChar>(64)
                    ).writeNative(addr + 16L, value.hostname)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CChar>(64)
                    ).writeNative(addr + 24L, value.jailname)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 32L, value.ip4s)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 36L, value.ip6s)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<InAddr>(64)
                    ).writeNative(addr + 40L, value.ip4)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<In6Addr>(64)
                    ).writeNative(addr + 48L, value.ip6)
                }
            }

        public operator fun invoke(
            version: UInt = 0u,
            path: MutPtr<CChar> = MutPtr(0L),
            hostname: MutPtr<CChar> = MutPtr(0L),
            jailname: MutPtr<CChar> = MutPtr(0L),
            ip4s: CUint = 0u,
            ip6s: CUint = 0u,
            ip4: MutPtr<InAddr> = MutPtr(0L),
            ip6: MutPtr<In6Addr> = MutPtr(0L),
        ): Jail =
            Jail(
                version = version,
                pathCtorArg = path,
                hostnameCtorArg = hostname,
                jailnameCtorArg = jailname,
                ip4s = ip4s,
                ip6s = ip6s,
                ip4CtorArg = ip4,
                ip6CtorArg = ip6,
            )
    }
}

public data class Statvfs(
    public var fBavail: FsblkcntT = 0uL,
    public var fBfree: FsblkcntT = 0uL,
    public var fBlocks: FsblkcntT = 0uL,
    public var fFavail: FsfilcntT = 0uL,
    public var fFfree: FsfilcntT = 0uL,
    public var fFiles: FsfilcntT = 0uL,
    public var fBsize: CUlong = 0uL,
    public var fFlag: CUlong = 0uL,
    public var fFrsize: CUlong = 0uL,
    public var fFsid: CUlong = 0uL,
    public var fNamemax: CUlong = 0uL,
)

// internal structure has changed over time
public data class Sem(
    public var data: UIntArray = UIntArray(4),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Sem) return false
        if (!this.data.contentEquals(other.data)) return false
        return true
    }

    override fun hashCode(): Int = this.data.contentHashCode()

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Sem> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Sem> {
                override val sizeBytes: Long = 16L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): Sem =
                    Sem(
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32, (4).toInt())
                        ).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: Sem) {
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32, (4).toInt())
                    ).writeNative(addr, value.data)
                }
            }
    }
}

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

public data class InputEvent(
    public var time: Timeval = Timeval(),
    public var type: UShort = 0u,
    public var code: UShort = 0u,
    public var value: Int = 0,
)

public data class InputAbsinfo(
    public var value: Int = 0,
    public var minimum: Int = 0,
    public var maximum: Int = 0,
    public var fuzz: Int = 0,
    public var flat: Int = 0,
    public var resolution: Int = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<InputAbsinfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<InputAbsinfo> {
                override val sizeBytes: Long = 24L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): InputAbsinfo =
                    InputAbsinfo(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 20L),
                    )
                override fun writeNative(addr: Long, value: InputAbsinfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.value)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 4L, value.minimum)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 8L, value.maximum)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 12L, value.fuzz)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 16L, value.flat)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 20L, value.resolution)
                }
            }
    }
}

public class MsqidDs internal constructor(
    public var msgPerm: IpcPerm,
    unused1CtorArg: MutPtr<CVoid>,
    unused2CtorArg: MutPtr<CVoid>,
    public var msgCbytes: MsglenT,
    public var msgQnum: MsgqnumT,
    public var msgQbytes: MsglenT,
    public var msgLspid: PidT,
    public var msgLrpid: PidT,
    public var msgStime: TimeT,
    public var msgRtime: TimeT,
    public var msgCtime: TimeT,
) {
    public var unused1: MutPtr<CVoid> = unused1CtorArg
        internal set

    public var unused2: MutPtr<CVoid> = unused2CtorArg
        internal set

    public constructor() : this(
        msgPerm = IpcPerm(),
        unused1CtorArg = MutPtr(0L),
        unused2CtorArg = MutPtr(0L),
        msgCbytes = 0uL,
        msgQnum = 0uL,
        msgQbytes = 0uL,
        msgLspid = 0,
        msgLrpid = 0,
        msgStime = 0L,
        msgRtime = 0L,
        msgCtime = 0L,
    )

    public operator fun component1(): IpcPerm = this.msgPerm

    public operator fun component2(): MutPtr<CVoid> = this.unused1

    public operator fun component3(): MutPtr<CVoid> = this.unused2

    public operator fun component4(): MsglenT = this.msgCbytes

    public operator fun component5(): MsgqnumT = this.msgQnum

    public operator fun component6(): MsglenT = this.msgQbytes

    public operator fun component7(): PidT = this.msgLspid

    public operator fun component8(): PidT = this.msgLrpid

    public operator fun component9(): TimeT = this.msgStime

    public operator fun component10(): TimeT = this.msgRtime

    public operator fun component11(): TimeT = this.msgCtime

    public fun copy(msgPerm: IpcPerm = this.msgPerm, unused1: MutPtr<CVoid> = this.unused1, unused2: MutPtr<CVoid> = this.unused2, msgCbytes: MsglenT = this.msgCbytes, msgQnum: MsgqnumT = this.msgQnum, msgQbytes: MsglenT = this.msgQbytes, msgLspid: PidT = this.msgLspid, msgLrpid: PidT = this.msgLrpid, msgStime: TimeT = this.msgStime, msgRtime: TimeT = this.msgRtime, msgCtime: TimeT = this.msgCtime): MsqidDs = MsqidDs(msgPerm = msgPerm, unused1CtorArg = unused1, unused2CtorArg = unused2, msgCbytes = msgCbytes, msgQnum = msgQnum, msgQbytes = msgQbytes, msgLspid = msgLspid, msgLrpid = msgLrpid, msgStime = msgStime, msgRtime = msgRtime, msgCtime = msgCtime)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is MsqidDs) return false
        if (this.msgPerm != other.msgPerm) return false
        if (this.unused1 != other.unused1) return false
        if (this.unused2 != other.unused2) return false
        if (this.msgCbytes != other.msgCbytes) return false
        if (this.msgQnum != other.msgQnum) return false
        if (this.msgQbytes != other.msgQbytes) return false
        if (this.msgLspid != other.msgLspid) return false
        if (this.msgLrpid != other.msgLrpid) return false
        if (this.msgStime != other.msgStime) return false
        if (this.msgRtime != other.msgRtime) return false
        if (this.msgCtime != other.msgCtime) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.msgPerm.hashCode()
        result = 31 * result + this.unused1.hashCode()
        result = 31 * result + this.unused2.hashCode()
        result = 31 * result + this.msgCbytes.hashCode()
        result = 31 * result + this.msgQnum.hashCode()
        result = 31 * result + this.msgQbytes.hashCode()
        result = 31 * result + this.msgLspid.hashCode()
        result = 31 * result + this.msgLrpid.hashCode()
        result = 31 * result + this.msgStime.hashCode()
        result = 31 * result + this.msgRtime.hashCode()
        result = 31 * result + this.msgCtime.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            msgPerm: IpcPerm = IpcPerm(),
            unused1: MutPtr<CVoid> = MutPtr(0L),
            unused2: MutPtr<CVoid> = MutPtr(0L),
            msgCbytes: MsglenT = 0uL,
            msgQnum: MsgqnumT = 0uL,
            msgQbytes: MsglenT = 0uL,
            msgLspid: PidT = 0,
            msgLrpid: PidT = 0,
            msgStime: TimeT = 0L,
            msgRtime: TimeT = 0L,
            msgCtime: TimeT = 0L,
        ): MsqidDs =
            MsqidDs(
                msgPerm = msgPerm,
                unused1CtorArg = unused1,
                unused2CtorArg = unused2,
                msgCbytes = msgCbytes,
                msgQnum = msgQnum,
                msgQbytes = msgQbytes,
                msgLspid = msgLspid,
                msgLrpid = msgLrpid,
                msgStime = msgStime,
                msgRtime = msgRtime,
                msgCtime = msgCtime,
            )
    }
}

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

public data class Mmsghdr(
    public var msgHdr: Msghdr = Msghdr(),
    public var msgLen: SsizeT = 0L,
)

public data class Sockcred(
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
        if (this.scUid != other.scUid) return false
        if (this.scEuid != other.scEuid) return false
        if (this.scGid != other.scGid) return false
        if (this.scEgid != other.scEgid) return false
        if (this.scNgroups != other.scNgroups) return false
        if (!this.scGroups.contentEquals(other.scGroups)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.scUid.hashCode()
        result = 31 * result + this.scEuid.hashCode()
        result = 31 * result + this.scGid.hashCode()
        result = 31 * result + this.scEgid.hashCode()
        result = 31 * result + this.scNgroups.hashCode()
        result = 31 * result + this.scGroups.contentHashCode()
        return result
    }
}

public class PtraceVmEntry internal constructor(
    public var pveEntry: CInt,
    public var pveTimestamp: CInt,
    public var pveStart: CUlong,
    public var pveEnd: CUlong,
    public var pveOffset: CUlong,
    public var pveProt: CUint,
    public var pvePathlen: CUint,
    public var pveFileid: CLong,
    public var pveFsid: UInt,
    pvePathCtorArg: MutPtr<CChar>,
) {
    public var pvePath: MutPtr<CChar> = pvePathCtorArg
        internal set

    public constructor() : this(
        pveEntry = 0,
        pveTimestamp = 0,
        pveStart = 0uL,
        pveEnd = 0uL,
        pveOffset = 0uL,
        pveProt = 0u,
        pvePathlen = 0u,
        pveFileid = 0L,
        pveFsid = 0u,
        pvePathCtorArg = MutPtr(0L),
    )

    public operator fun component1(): CInt = this.pveEntry

    public operator fun component2(): CInt = this.pveTimestamp

    public operator fun component3(): CUlong = this.pveStart

    public operator fun component4(): CUlong = this.pveEnd

    public operator fun component5(): CUlong = this.pveOffset

    public operator fun component6(): CUint = this.pveProt

    public operator fun component7(): CUint = this.pvePathlen

    public operator fun component8(): CLong = this.pveFileid

    public operator fun component9(): UInt = this.pveFsid

    public operator fun component10(): MutPtr<CChar> = this.pvePath

    public fun copy(pveEntry: CInt = this.pveEntry, pveTimestamp: CInt = this.pveTimestamp, pveStart: CUlong = this.pveStart, pveEnd: CUlong = this.pveEnd, pveOffset: CUlong = this.pveOffset, pveProt: CUint = this.pveProt, pvePathlen: CUint = this.pvePathlen, pveFileid: CLong = this.pveFileid, pveFsid: UInt = this.pveFsid, pvePath: MutPtr<CChar> = this.pvePath): PtraceVmEntry = PtraceVmEntry(pveEntry = pveEntry, pveTimestamp = pveTimestamp, pveStart = pveStart, pveEnd = pveEnd, pveOffset = pveOffset, pveProt = pveProt, pvePathlen = pvePathlen, pveFileid = pveFileid, pveFsid = pveFsid, pvePathCtorArg = pvePath)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PtraceVmEntry) return false
        if (this.pveEntry != other.pveEntry) return false
        if (this.pveTimestamp != other.pveTimestamp) return false
        if (this.pveStart != other.pveStart) return false
        if (this.pveEnd != other.pveEnd) return false
        if (this.pveOffset != other.pveOffset) return false
        if (this.pveProt != other.pveProt) return false
        if (this.pvePathlen != other.pvePathlen) return false
        if (this.pveFileid != other.pveFileid) return false
        if (this.pveFsid != other.pveFsid) return false
        if (this.pvePath != other.pvePath) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.pveEntry.hashCode()
        result = 31 * result + this.pveTimestamp.hashCode()
        result = 31 * result + this.pveStart.hashCode()
        result = 31 * result + this.pveEnd.hashCode()
        result = 31 * result + this.pveOffset.hashCode()
        result = 31 * result + this.pveProt.hashCode()
        result = 31 * result + this.pvePathlen.hashCode()
        result = 31 * result + this.pveFileid.hashCode()
        result = 31 * result + this.pveFsid.hashCode()
        result = 31 * result + this.pvePath.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            pveEntry: CInt = 0,
            pveTimestamp: CInt = 0,
            pveStart: CUlong = 0uL,
            pveEnd: CUlong = 0uL,
            pveOffset: CUlong = 0uL,
            pveProt: CUint = 0u,
            pvePathlen: CUint = 0u,
            pveFileid: CLong = 0L,
            pveFsid: UInt = 0u,
            pvePath: MutPtr<CChar> = MutPtr(0L),
        ): PtraceVmEntry =
            PtraceVmEntry(
                pveEntry = pveEntry,
                pveTimestamp = pveTimestamp,
                pveStart = pveStart,
                pveEnd = pveEnd,
                pveOffset = pveOffset,
                pveProt = pveProt,
                pvePathlen = pvePathlen,
                pveFileid = pveFileid,
                pveFsid = pveFsid,
                pvePathCtorArg = pvePath,
            )
    }
}

public data class PtraceLwpinfo(
    public var plLwpid: LwpidT = 0,
    public var plEvent: CInt = 0,
    public var plFlags: CInt = 0,
    public var plSigmask: SigsetT = SigsetT(),
    public var plSiglist: SigsetT = SigsetT(),
    public var plSiginfo: SiginfoT = SiginfoT(),
    public var plTdname: UByteArray = UByteArray(MAXCOMLEN + 1),
    public var plChildPid: PidT = 0,
    public var plSyscallCode: CUint = 0u,
    public var plSyscallNarg: CUint = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PtraceLwpinfo) return false
        if (this.plLwpid != other.plLwpid) return false
        if (this.plEvent != other.plEvent) return false
        if (this.plFlags != other.plFlags) return false
        if (this.plSigmask != other.plSigmask) return false
        if (this.plSiglist != other.plSiglist) return false
        if (this.plSiginfo != other.plSiginfo) return false
        if (!this.plTdname.contentEquals(other.plTdname)) return false
        if (this.plChildPid != other.plChildPid) return false
        if (this.plSyscallCode != other.plSyscallCode) return false
        if (this.plSyscallNarg != other.plSyscallNarg) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.plLwpid.hashCode()
        result = 31 * result + this.plEvent.hashCode()
        result = 31 * result + this.plFlags.hashCode()
        result = 31 * result + this.plSigmask.hashCode()
        result = 31 * result + this.plSiglist.hashCode()
        result = 31 * result + this.plSiginfo.hashCode()
        result = 31 * result + this.plTdname.contentHashCode()
        result = 31 * result + this.plChildPid.hashCode()
        result = 31 * result + this.plSyscallCode.hashCode()
        result = 31 * result + this.plSyscallNarg.hashCode()
        return result
    }
}

public data class PtraceScRet(
    public var srRetval: LongArray = LongArray(2),
    public var srError: CInt = 0,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PtraceScRet) return false
        if (!this.srRetval.contentEquals(other.srRetval)) return false
        if (this.srError != other.srError) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.srRetval.contentHashCode()
        result = 31 * result + this.srError.hashCode()
        return result
    }
}

public data class PtraceCoredump(
    public var pcFd: CInt = 0,
    public var pcFlags: UInt = 0u,
    public var pcLimit: OffT = 0L,
)

public class PtraceScRemote internal constructor(
    public var pscrRet: PtraceScRet,
    public var pscrSyscall: CUint,
    public var pscrNargs: CUint,
    pscrArgsCtorArg: MutPtr<RegisterT>,
) {
    public var pscrArgs: MutPtr<RegisterT> = pscrArgsCtorArg
        internal set

    public constructor() : this(
        pscrRet = PtraceScRet(),
        pscrSyscall = 0u,
        pscrNargs = 0u,
        pscrArgsCtorArg = MutPtr(0L),
    )

    public operator fun component1(): PtraceScRet = this.pscrRet

    public operator fun component2(): CUint = this.pscrSyscall

    public operator fun component3(): CUint = this.pscrNargs

    public operator fun component4(): MutPtr<RegisterT> = this.pscrArgs

    public fun copy(pscrRet: PtraceScRet = this.pscrRet, pscrSyscall: CUint = this.pscrSyscall, pscrNargs: CUint = this.pscrNargs, pscrArgs: MutPtr<RegisterT> = this.pscrArgs): PtraceScRemote = PtraceScRemote(pscrRet = pscrRet, pscrSyscall = pscrSyscall, pscrNargs = pscrNargs, pscrArgsCtorArg = pscrArgs)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PtraceScRemote) return false
        if (this.pscrRet != other.pscrRet) return false
        if (this.pscrSyscall != other.pscrSyscall) return false
        if (this.pscrNargs != other.pscrNargs) return false
        if (this.pscrArgs != other.pscrArgs) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.pscrRet.hashCode()
        result = 31 * result + this.pscrSyscall.hashCode()
        result = 31 * result + this.pscrNargs.hashCode()
        result = 31 * result + this.pscrArgs.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            pscrRet: PtraceScRet = PtraceScRet(),
            pscrSyscall: CUint = 0u,
            pscrNargs: CUint = 0u,
            pscrArgs: MutPtr<RegisterT> = MutPtr(0L),
        ): PtraceScRemote =
            PtraceScRemote(
                pscrRet = pscrRet,
                pscrSyscall = pscrSyscall,
                pscrNargs = pscrNargs,
                pscrArgsCtorArg = pscrArgs,
            )
    }
}

public data class CpusetT(
    public var bits: LongArray = LongArray(16),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CpusetT) return false
        if (!this.bits.contentEquals(other.bits)) return false
        return true
    }

    override fun hashCode(): Int = this.bits.contentHashCode()
}

public data class CapRightsT(
    public var crRights: ULongArray = ULongArray(2),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CapRightsT) return false
        if (!this.crRights.contentEquals(other.crRights)) return false
        return true
    }

    override fun hashCode(): Int = this.crRights.contentHashCode()

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<CapRightsT> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<CapRightsT> {
                override val sizeBytes: Long = 16L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): CapRightsT =
                    CapRightsT(
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64, (2).toInt())
                        ).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: CapRightsT) {
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64, (2).toInt())
                    ).writeNative(addr, value.crRights)
                }
            }
    }
}

public data class Umutex(
    public var mOwner: LwpidT = 0,
    public var mFlags: UInt = 0u,
    public var mCeilings: UIntArray = UIntArray(2),
    public var mRbLink: UintptrT = 0uL,
    public var mSpare: UIntArray = UIntArray(2),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Umutex) return false
        if (this.mOwner != other.mOwner) return false
        if (this.mFlags != other.mFlags) return false
        if (!this.mCeilings.contentEquals(other.mCeilings)) return false
        if (this.mRbLink != other.mRbLink) return false
        if (!this.mSpare.contentEquals(other.mSpare)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.mOwner.hashCode()
        result = 31 * result + this.mFlags.hashCode()
        result = 31 * result + this.mCeilings.contentHashCode()
        result = 31 * result + this.mRbLink.hashCode()
        result = 31 * result + this.mSpare.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Umutex> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Umutex> {
                override val sizeBytes: Long = 32L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): Umutex =
                    Umutex(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32, (2).toInt())
                        ).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).readNative(addr + 16L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32, (2).toInt())
                        ).readNative(addr + 24L),
                    )
                override fun writeNative(addr: Long, value: Umutex) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.mOwner)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.mFlags)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32, (2).toInt())
                    ).writeNative(addr + 8L, value.mCeilings)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).writeNative(addr + 16L, value.mRbLink)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32, (2).toInt())
                    ).writeNative(addr + 24L, value.mSpare)
                }
            }
    }
}

public data class Ucond(
    public var cHasWaiters: UInt = 0u,
    public var cFlags: UInt = 0u,
    public var cClockid: UInt = 0u,
    public var cSpare: UIntArray = UIntArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Ucond) return false
        if (this.cHasWaiters != other.cHasWaiters) return false
        if (this.cFlags != other.cFlags) return false
        if (this.cClockid != other.cClockid) return false
        if (!this.cSpare.contentEquals(other.cSpare)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cHasWaiters.hashCode()
        result = 31 * result + this.cFlags.hashCode()
        result = 31 * result + this.cClockid.hashCode()
        result = 31 * result + this.cSpare.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Ucond> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Ucond> {
                override val sizeBytes: Long = 16L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): Ucond =
                    Ucond(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32, (1).toInt())
                        ).readNative(addr + 12L),
                    )
                override fun writeNative(addr: Long, value: Ucond) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.cHasWaiters)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.cFlags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.cClockid)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32, (1).toInt())
                    ).writeNative(addr + 12L, value.cSpare)
                }
            }
    }
}

public data class Uuid(
    public var timeLow: UInt = 0u,
    public var timeMid: UShort = 0u,
    public var timeHiAndVersion: UShort = 0u,
    public var clockSeqHiAndReserved: UByte = 0u,
    public var clockSeqLow: UByte = 0u,
    public var node: UByteArray = UByteArray(UUID_NODE_LEN),
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
}

public data class CAnonymousPthreadSpinlock(
    public var sClock: Umutex = Umutex(),
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<CAnonymousPthreadSpinlock> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<CAnonymousPthreadSpinlock> {
                override val sizeBytes: Long = 32L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): CAnonymousPthreadSpinlock =
                    CAnonymousPthreadSpinlock(
                        (Umutex.typeLayout()).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: CAnonymousPthreadSpinlock) {
                    (Umutex.typeLayout()).writeNative(addr, value.sClock)
                }
            }
    }
}

public data class CAnonymousPthreadBarrierattr(
    public var pshared: CInt = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<CAnonymousPthreadBarrierattr> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<CAnonymousPthreadBarrierattr> {
                override val sizeBytes: Long = 4L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): CAnonymousPthreadBarrierattr =
                    CAnonymousPthreadBarrierattr(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: CAnonymousPthreadBarrierattr) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.pshared)
                }
            }
    }
}

public data class CAnonymousPthreadBarrier(
    public var bLock: Umutex = Umutex(),
    public var bCv: Ucond = Ucond(),
    public var bCycle: Long = 0L,
    public var bCount: CInt = 0,
    public var bWaiters: CInt = 0,
    public var bRefcount: CInt = 0,
    public var bDestroying: CInt = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<CAnonymousPthreadBarrier> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<CAnonymousPthreadBarrier> {
                override val sizeBytes: Long = 72L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): CAnonymousPthreadBarrier =
                    CAnonymousPthreadBarrier(
                        (Umutex.typeLayout()).readNative(addr),
                        (Ucond.typeLayout()).readNative(addr + 32L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 48L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 56L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 60L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 64L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 68L),
                    )
                override fun writeNative(addr: Long, value: CAnonymousPthreadBarrier) {
                    (Umutex.typeLayout()).writeNative(addr, value.bLock)
                    (Ucond.typeLayout()).writeNative(addr + 32L, value.bCv)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 48L, value.bCycle)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 56L, value.bCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 60L, value.bWaiters)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 64L, value.bRefcount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 68L, value.bDestroying)
                }
            }
    }
}

public class KinfoVmentry(
    public var kveStructsize: CInt = 0,
    public var kveType: CInt = 0,
    public var kveStart: ULong = 0uL,
    public var kveEnd: ULong = 0uL,
    public var kveOffset: ULong = 0uL,
    public var kveVnFileid: ULong = 0uL,
    public var kveVnFsidFreebsd11: UInt = 0u,
    public var kveVnFsid: UInt = 0u,
    public var kveFlags: CInt = 0,
    public var kveResident: CInt = 0,
    public var kvePrivateResident: CInt = 0,
    public var kveProtection: CInt = 0,
    public var kveRefCount: CInt = 0,
    public var kveShadowCount: CInt = 0,
    public var kveVnType: CInt = 0,
    public var kveVnSize: ULong = 0uL,
    public var kveVnRdevFreebsd11: UInt = 0u,
    public var kveVnRdev: UInt = 0u,
    public var kveVnMode: UShort = 0u,
    public var kveStatus: UShort = 0u,
    public var kveIsSpare: IntArray = IntArray(8),
    public var kvePath: List<UByteArray> = List(32) { UByteArray(0) },
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<KinfoVmentry> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<KinfoVmentry> {
                override val sizeBytes: Long = 1224L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): KinfoVmentry =
                    KinfoVmentry(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 32L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 40L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 44L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 48L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 52L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 56L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 60L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 64L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 68L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 72L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 80L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 88L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 92L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 96L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 98L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 104L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 112L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32, (8).toInt())
                        ).readNative(addr + 120L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32, (12).toInt())
                        ).readNative(addr + 152L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(
                                    io.github.kotlinmania.rustlang.core.mem
                                        .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (32).toInt()),
                                    (32).toInt(),
                                )
                        ).readNative(addr + 200L),
                    )
                override fun writeNative(addr: Long, value: KinfoVmentry) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.kveStructsize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 4L, value.kveType)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 8L, value.kveStart)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 16L, value.kveEnd)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 24L, value.kveOffset)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 32L, value.kveVnFileid)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 40L, value.kveVnFsidFreebsd11)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 44L, value.kveVnFsid)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 48L, value.kveFlags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 52L, value.kveResident)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 56L, value.kvePrivateResident)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 60L, value.kveProtection)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 64L, value.kveRefCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 68L, value.kveShadowCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 72L, value.kveVnType)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 80L, value.kveVnSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 88L, value.kveVnRdevFreebsd11)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 92L, value.kveVnRdev)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 96L, value.kveVnMode)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 98L, value.kveStatus)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 104L, value.kveVnFsid)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 112L, value.kveVnRdev)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32, (8).toInt())
                    ).writeNative(addr + 120L, value.kveIsSpare)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32, (12).toInt())
                    ).writeNative(addr + 152L, value.kveIsSpare)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(
                                io.github.kotlinmania.rustlang.core.mem
                                    .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (32).toInt()),
                                (32).toInt(),
                            )
                    ).writeNative(addr + 200L, value.kvePath)
                }
            }
    }
}

public class CAnonymousFilestat internal constructor(
    stqeNextCtorArg: MutPtr<Filestat>,
) {
    public var stqeNext: MutPtr<Filestat> = stqeNextCtorArg
        internal set

    public constructor() : this(
        stqeNextCtorArg = MutPtr(0L),
    )

    public operator fun component1(): MutPtr<Filestat> = this.stqeNext

    public fun copy(stqeNext: MutPtr<Filestat> = this.stqeNext): CAnonymousFilestat = CAnonymousFilestat(stqeNextCtorArg = stqeNext)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CAnonymousFilestat) return false
        if (this.stqeNext != other.stqeNext) return false
        return true
    }

    override fun hashCode(): Int = this.stqeNext.hashCode()

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<CAnonymousFilestat> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<CAnonymousFilestat> {
                override val sizeBytes: Long = 8L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): CAnonymousFilestat =
                    CAnonymousFilestat(
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<Filestat>(64)
                        ).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: CAnonymousFilestat) {
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<Filestat>(64)
                    ).writeNative(addr, value.stqeNext)
                }
            }

        public operator fun invoke(
            stqeNext: MutPtr<Filestat> = MutPtr(0L),
        ): CAnonymousFilestat =
            CAnonymousFilestat(
                stqeNextCtorArg = stqeNext,
            )
    }
}

public class Filestat internal constructor(
    public var fsType: CInt,
    public var fsFlags: CInt,
    public var fsFflags: CInt,
    public var fsUflags: CInt,
    public var fsFd: CInt,
    public var fsRefCount: CInt,
    public var fsOffset: OffT,
    fsTypedepCtorArg: MutPtr<CVoid>,
    fsPathCtorArg: MutPtr<CChar>,
    public var next: CAnonymousFilestat,
    public var fsCapRights: CapRightsT,
) {
    public var fsTypedep: MutPtr<CVoid> = fsTypedepCtorArg
        internal set

    public var fsPath: MutPtr<CChar> = fsPathCtorArg
        internal set

    public constructor() : this(
        fsType = 0,
        fsFlags = 0,
        fsFflags = 0,
        fsUflags = 0,
        fsFd = 0,
        fsRefCount = 0,
        fsOffset = 0L,
        fsTypedepCtorArg = MutPtr(0L),
        fsPathCtorArg = MutPtr(0L),
        next = CAnonymousFilestat(),
        fsCapRights = CapRightsT(),
    )

    public operator fun component1(): CInt = this.fsType

    public operator fun component2(): CInt = this.fsFlags

    public operator fun component3(): CInt = this.fsFflags

    public operator fun component4(): CInt = this.fsUflags

    public operator fun component5(): CInt = this.fsFd

    public operator fun component6(): CInt = this.fsRefCount

    public operator fun component7(): OffT = this.fsOffset

    public operator fun component8(): MutPtr<CVoid> = this.fsTypedep

    public operator fun component9(): MutPtr<CChar> = this.fsPath

    public operator fun component10(): CAnonymousFilestat = this.next

    public operator fun component11(): CapRightsT = this.fsCapRights

    public fun copy(fsType: CInt = this.fsType, fsFlags: CInt = this.fsFlags, fsFflags: CInt = this.fsFflags, fsUflags: CInt = this.fsUflags, fsFd: CInt = this.fsFd, fsRefCount: CInt = this.fsRefCount, fsOffset: OffT = this.fsOffset, fsTypedep: MutPtr<CVoid> = this.fsTypedep, fsPath: MutPtr<CChar> = this.fsPath, next: CAnonymousFilestat = this.next, fsCapRights: CapRightsT = this.fsCapRights): Filestat = Filestat(fsType = fsType, fsFlags = fsFlags, fsFflags = fsFflags, fsUflags = fsUflags, fsFd = fsFd, fsRefCount = fsRefCount, fsOffset = fsOffset, fsTypedepCtorArg = fsTypedep, fsPathCtorArg = fsPath, next = next, fsCapRights = fsCapRights)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Filestat) return false
        if (this.fsType != other.fsType) return false
        if (this.fsFlags != other.fsFlags) return false
        if (this.fsFflags != other.fsFflags) return false
        if (this.fsUflags != other.fsUflags) return false
        if (this.fsFd != other.fsFd) return false
        if (this.fsRefCount != other.fsRefCount) return false
        if (this.fsOffset != other.fsOffset) return false
        if (this.fsTypedep != other.fsTypedep) return false
        if (this.fsPath != other.fsPath) return false
        if (this.next != other.next) return false
        if (this.fsCapRights != other.fsCapRights) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.fsType.hashCode()
        result = 31 * result + this.fsFlags.hashCode()
        result = 31 * result + this.fsFflags.hashCode()
        result = 31 * result + this.fsUflags.hashCode()
        result = 31 * result + this.fsFd.hashCode()
        result = 31 * result + this.fsRefCount.hashCode()
        result = 31 * result + this.fsOffset.hashCode()
        result = 31 * result + this.fsTypedep.hashCode()
        result = 31 * result + this.fsPath.hashCode()
        result = 31 * result + this.next.hashCode()
        result = 31 * result + this.fsCapRights.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            fsType: CInt = 0,
            fsFlags: CInt = 0,
            fsFflags: CInt = 0,
            fsUflags: CInt = 0,
            fsFd: CInt = 0,
            fsRefCount: CInt = 0,
            fsOffset: OffT = 0L,
            fsTypedep: MutPtr<CVoid> = MutPtr(0L),
            fsPath: MutPtr<CChar> = MutPtr(0L),
            next: CAnonymousFilestat = CAnonymousFilestat(),
            fsCapRights: CapRightsT = CapRightsT(),
        ): Filestat =
            Filestat(
                fsType = fsType,
                fsFlags = fsFlags,
                fsFflags = fsFflags,
                fsUflags = fsUflags,
                fsFd = fsFd,
                fsRefCount = fsRefCount,
                fsOffset = fsOffset,
                fsTypedepCtorArg = fsTypedep,
                fsPathCtorArg = fsPath,
                next = next,
                fsCapRights = fsCapRights,
            )
    }
}

public class FilestatList internal constructor(
    stqhFirstCtorArg: MutPtr<Filestat>,
    stqhLastCtorArg: MutPtr<MutPtr<Filestat>>,
) {
    public var stqhFirst: MutPtr<Filestat> = stqhFirstCtorArg
        internal set

    public var stqhLast: MutPtr<MutPtr<Filestat>> = stqhLastCtorArg
        internal set

    public constructor() : this(
        stqhFirstCtorArg = MutPtr(0L),
        stqhLastCtorArg = MutPtr(0L),
    )

    public operator fun component1(): MutPtr<Filestat> = this.stqhFirst

    public operator fun component2(): MutPtr<MutPtr<Filestat>> = this.stqhLast

    public fun copy(stqhFirst: MutPtr<Filestat> = this.stqhFirst, stqhLast: MutPtr<MutPtr<Filestat>> = this.stqhLast): FilestatList = FilestatList(stqhFirstCtorArg = stqhFirst, stqhLastCtorArg = stqhLast)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FilestatList) return false
        if (this.stqhFirst != other.stqhFirst) return false
        if (this.stqhLast != other.stqhLast) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.stqhFirst.hashCode()
        result = 31 * result + this.stqhLast.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<FilestatList> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<FilestatList> {
                override val sizeBytes: Long = 16L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): FilestatList =
                    FilestatList(
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<Filestat>(64)
                        ).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<MutPtr<Filestat>>(64)
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: FilestatList) {
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<Filestat>(64)
                    ).writeNative(addr, value.stqhFirst)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<MutPtr<Filestat>>(64)
                    ).writeNative(addr + 8L, value.stqhLast)
                }
            }

        public operator fun invoke(
            stqhFirst: MutPtr<Filestat> = MutPtr(0L),
            stqhLast: MutPtr<MutPtr<Filestat>> = MutPtr(0L),
        ): FilestatList =
            FilestatList(
                stqhFirstCtorArg = stqhFirst,
                stqhLastCtorArg = stqhLast,
            )
    }
}

public class Procstat internal constructor(
    public var tpe: CInt,
    public var kd: UintptrT,
    vmentriesCtorArg: MutPtr<CVoid>,
    filesCtorArg: MutPtr<CVoid>,
    argvCtorArg: MutPtr<CVoid>,
    envvCtorArg: MutPtr<CVoid>,
    public var core: UintptrT,
) {
    public var vmentries: MutPtr<CVoid> = vmentriesCtorArg
        internal set

    public var files: MutPtr<CVoid> = filesCtorArg
        internal set

    public var argv: MutPtr<CVoid> = argvCtorArg
        internal set

    public var envv: MutPtr<CVoid> = envvCtorArg
        internal set

    public constructor() : this(
        tpe = 0,
        kd = 0uL,
        vmentriesCtorArg = MutPtr(0L),
        filesCtorArg = MutPtr(0L),
        argvCtorArg = MutPtr(0L),
        envvCtorArg = MutPtr(0L),
        core = 0uL,
    )

    public operator fun component1(): CInt = this.tpe

    public operator fun component2(): UintptrT = this.kd

    public operator fun component3(): MutPtr<CVoid> = this.vmentries

    public operator fun component4(): MutPtr<CVoid> = this.files

    public operator fun component5(): MutPtr<CVoid> = this.argv

    public operator fun component6(): MutPtr<CVoid> = this.envv

    public operator fun component7(): UintptrT = this.core

    public fun copy(tpe: CInt = this.tpe, kd: UintptrT = this.kd, vmentries: MutPtr<CVoid> = this.vmentries, files: MutPtr<CVoid> = this.files, argv: MutPtr<CVoid> = this.argv, envv: MutPtr<CVoid> = this.envv, core: UintptrT = this.core): Procstat = Procstat(tpe = tpe, kd = kd, vmentriesCtorArg = vmentries, filesCtorArg = files, argvCtorArg = argv, envvCtorArg = envv, core = core)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Procstat) return false
        if (this.tpe != other.tpe) return false
        if (this.kd != other.kd) return false
        if (this.vmentries != other.vmentries) return false
        if (this.files != other.files) return false
        if (this.argv != other.argv) return false
        if (this.envv != other.envv) return false
        if (this.core != other.core) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.tpe.hashCode()
        result = 31 * result + this.kd.hashCode()
        result = 31 * result + this.vmentries.hashCode()
        result = 31 * result + this.files.hashCode()
        result = 31 * result + this.argv.hashCode()
        result = 31 * result + this.envv.hashCode()
        result = 31 * result + this.core.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Procstat> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Procstat> {
                override val sizeBytes: Long = 56L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): Procstat =
                    Procstat(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).readNative(addr + 8L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CVoid>(64)
                        ).readNative(addr + 16L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CVoid>(64)
                        ).readNative(addr + 24L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CVoid>(64)
                        ).readNative(addr + 32L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CVoid>(64)
                        ).readNative(addr + 40L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).readNative(addr + 48L),
                    )
                override fun writeNative(addr: Long, value: Procstat) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.tpe)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).writeNative(addr + 8L, value.kd)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr + 16L, value.vmentries)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr + 24L, value.files)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr + 32L, value.argv)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr + 40L, value.envv)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).writeNative(addr + 48L, value.core)
                }
            }

        public operator fun invoke(
            tpe: CInt = 0,
            kd: UintptrT = 0uL,
            vmentries: MutPtr<CVoid> = MutPtr(0L),
            files: MutPtr<CVoid> = MutPtr(0L),
            argv: MutPtr<CVoid> = MutPtr(0L),
            envv: MutPtr<CVoid> = MutPtr(0L),
            core: UintptrT = 0uL,
        ): Procstat =
            Procstat(
                tpe = tpe,
                kd = kd,
                vmentriesCtorArg = vmentries,
                filesCtorArg = files,
                argvCtorArg = argv,
                envvCtorArg = envv,
                core = core,
            )
    }
}

public data class Itimerspec(
    public var itInterval: Timespec = Timespec(),
    public var itValue: Timespec = Timespec(),
)

public data class CAnonymousTimer(
    public var priv: IntArray = IntArray(3),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CAnonymousTimer) return false
        if (!this.priv.contentEquals(other.priv)) return false
        return true
    }

    override fun hashCode(): Int = this.priv.contentHashCode()

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<CAnonymousTimer> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<CAnonymousTimer> {
                override val sizeBytes: Long = 12L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): CAnonymousTimer =
                    CAnonymousTimer(
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32, (3).toInt())
                        ).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: CAnonymousTimer) {
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32, (3).toInt())
                    ).writeNative(addr, value.priv)
                }
            }
    }
}

/**
 * Used to hold a copy of the command line, if it had a sane length.
 */
public data class Pargs(
    /**
     * Reference count.
     */
    public var arRef: UInt = 0u,
    /**
     * Length.
     */
    public var arLength: UInt = 0u,
    /**
     * Arguments.
     */
    public var arArgs: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Pargs) return false
        if (this.arRef != other.arRef) return false
        if (this.arLength != other.arLength) return false
        if (!this.arArgs.contentEquals(other.arArgs)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.arRef.hashCode()
        result = 31 * result + this.arLength.hashCode()
        result = 31 * result + this.arArgs.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Pargs> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Pargs> {
                override val sizeBytes: Long = 12L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): Pargs =
                    Pargs(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (1).toInt())
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: Pargs) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.arRef)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.arLength)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (1).toInt())
                    ).writeNative(addr + 8L, value.arArgs)
                }
            }
    }
}

public data class Priority(
    /**
     * Scheduling class.
     */
    public var priClass: UChar = 0u,
    /**
     * Normal priority level.
     */
    public var priLevel: UChar = 0u,
    /**
     * Priority before propagation.
     */
    public var priNative: UChar = 0u,
    /**
     * User priority based on pCpu and pNice.
     */
    public var priUser: UChar = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Priority> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Priority> {
                override val sizeBytes: Long = 4L
                override val alignBytes: Long = 1L
                override fun readNative(addr: Long): Priority =
                    Priority(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 1L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 2L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 3L),
                    )
                override fun writeNative(addr: Long, value: Priority) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr, value.priClass)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 1L, value.priLevel)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 2L, value.priNative)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 3L, value.priUser)
                }
            }
    }
}

public data class KvmSwap(
    public var kswDevname: UByteArray = UByteArray(32),
    public var kswUsed: UInt = 0u,
    public var kswTotal: UInt = 0u,
    public var kswFlags: CInt = 0,
    public var kswReserved1: UInt = 0u,
    public var kswReserved2: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is KvmSwap) return false
        if (!this.kswDevname.contentEquals(other.kswDevname)) return false
        if (this.kswUsed != other.kswUsed) return false
        if (this.kswTotal != other.kswTotal) return false
        if (this.kswFlags != other.kswFlags) return false
        if (this.kswReserved1 != other.kswReserved1) return false
        if (this.kswReserved2 != other.kswReserved2) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.kswDevname.contentHashCode()
        result = 31 * result + this.kswUsed.hashCode()
        result = 31 * result + this.kswTotal.hashCode()
        result = 31 * result + this.kswFlags.hashCode()
        result = 31 * result + this.kswReserved1.hashCode()
        result = 31 * result + this.kswReserved2.hashCode()
        return result
    }
}

public class Nlist internal constructor(
    nNameCtorArg: ConstPtr<CChar>,
    /**
     * type defines
     */
    public var nType: CUchar,
    /**
     * "type" and binding information
     */
    public var nOther: CChar,
    /**
     * used by stab entries
     */
    public var nDesc: CShort,
    public var nValue: CUlong,
) {
    /**
     * symbol name (in memory)
     */
    public var nName: ConstPtr<CChar> = nNameCtorArg
        internal set

    public constructor() : this(
        nNameCtorArg = ConstPtr(0L),
        nType = 0u,
        nOther = 0u,
        nDesc = 0,
        nValue = 0uL,
    )

    public operator fun component1(): ConstPtr<CChar> = this.nName

    public operator fun component2(): CUchar = this.nType

    public operator fun component3(): CChar = this.nOther

    public operator fun component4(): CShort = this.nDesc

    public operator fun component5(): CUlong = this.nValue

    public fun copy(nName: ConstPtr<CChar> = this.nName, nType: CUchar = this.nType, nOther: CChar = this.nOther, nDesc: CShort = this.nDesc, nValue: CUlong = this.nValue): Nlist = Nlist(nNameCtorArg = nName, nType = nType, nOther = nOther, nDesc = nDesc, nValue = nValue)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Nlist) return false
        if (this.nName != other.nName) return false
        if (this.nType != other.nType) return false
        if (this.nOther != other.nOther) return false
        if (this.nDesc != other.nDesc) return false
        if (this.nValue != other.nValue) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.nName.hashCode()
        result = 31 * result + this.nType.hashCode()
        result = 31 * result + this.nOther.hashCode()
        result = 31 * result + this.nDesc.hashCode()
        result = 31 * result + this.nValue.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            nName: ConstPtr<CChar> = ConstPtr(0L),
            nType: CUchar = 0u,
            nOther: CChar = 0u,
            nDesc: CShort = 0,
            nValue: CUlong = 0uL,
        ): Nlist =
            Nlist(
                nNameCtorArg = nName,
                nType = nType,
                nOther = nOther,
                nDesc = nDesc,
                nValue = nValue,
            )
    }
}

public class KvmNlist internal constructor(
    nNameCtorArg: ConstPtr<CChar>,
    public var nType: CUchar,
    public var nValue: KvaddrT,
) {
    public var nName: ConstPtr<CChar> = nNameCtorArg
        internal set

    public constructor() : this(
        nNameCtorArg = ConstPtr(0L),
        nType = 0u,
        nValue = 0uL,
    )

    public operator fun component1(): ConstPtr<CChar> = this.nName

    public operator fun component2(): CUchar = this.nType

    public operator fun component3(): KvaddrT = this.nValue

    public fun copy(nName: ConstPtr<CChar> = this.nName, nType: CUchar = this.nType, nValue: KvaddrT = this.nValue): KvmNlist = KvmNlist(nNameCtorArg = nName, nType = nType, nValue = nValue)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is KvmNlist) return false
        if (this.nName != other.nName) return false
        if (this.nType != other.nType) return false
        if (this.nValue != other.nValue) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.nName.hashCode()
        result = 31 * result + this.nType.hashCode()
        result = 31 * result + this.nValue.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<KvmNlist> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<KvmNlist> {
                override val sizeBytes: Long = 24L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): KvmNlist =
                    KvmNlist(
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .constPtrLayout<CChar>(64)
                        ).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: KvmNlist) {
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .constPtrLayout<CChar>(64)
                    ).writeNative(addr, value.nName)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 8L, value.nType)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 16L, value.nValue)
                }
            }

        public operator fun invoke(
            nName: ConstPtr<CChar> = ConstPtr(0L),
            nType: CUchar = 0u,
            nValue: KvaddrT = 0uL,
        ): KvmNlist =
            KvmNlist(
                nNameCtorArg = nName,
                nType = nType,
                nValue = nValue,
            )
    }
}

public data class CAnonymousSem(
    public var priv: UintptrT = 0uL,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<CAnonymousSem> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<CAnonymousSem> {
                override val sizeBytes: Long = 8L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): CAnonymousSem =
                    CAnonymousSem(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: CAnonymousSem) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).writeNative(addr, value.priv)
                }
            }
    }
}

public class SemidDs internal constructor(
    public var semPerm: IpcPerm,
    semBaseCtorArg: MutPtr<CAnonymousSem>,
    public var semNsems: CUshort,
    public var semOtime: TimeT,
    public var semCtime: TimeT,
) {
    public var semBase: MutPtr<CAnonymousSem> = semBaseCtorArg
        internal set

    public constructor() : this(
        semPerm = IpcPerm(),
        semBaseCtorArg = MutPtr(0L),
        semNsems = 0u,
        semOtime = 0L,
        semCtime = 0L,
    )

    public operator fun component1(): IpcPerm = this.semPerm

    public operator fun component2(): MutPtr<CAnonymousSem> = this.semBase

    public operator fun component3(): CUshort = this.semNsems

    public operator fun component4(): TimeT = this.semOtime

    public operator fun component5(): TimeT = this.semCtime

    public fun copy(semPerm: IpcPerm = this.semPerm, semBase: MutPtr<CAnonymousSem> = this.semBase, semNsems: CUshort = this.semNsems, semOtime: TimeT = this.semOtime, semCtime: TimeT = this.semCtime): SemidDs = SemidDs(semPerm = semPerm, semBaseCtorArg = semBase, semNsems = semNsems, semOtime = semOtime, semCtime = semCtime)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SemidDs) return false
        if (this.semPerm != other.semPerm) return false
        if (this.semBase != other.semBase) return false
        if (this.semNsems != other.semNsems) return false
        if (this.semOtime != other.semOtime) return false
        if (this.semCtime != other.semCtime) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.semPerm.hashCode()
        result = 31 * result + this.semBase.hashCode()
        result = 31 * result + this.semNsems.hashCode()
        result = 31 * result + this.semOtime.hashCode()
        result = 31 * result + this.semCtime.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            semPerm: IpcPerm = IpcPerm(),
            semBase: MutPtr<CAnonymousSem> = MutPtr(0L),
            semNsems: CUshort = 0u,
            semOtime: TimeT = 0L,
            semCtime: TimeT = 0L,
        ): SemidDs =
            SemidDs(
                semPerm = semPerm,
                semBaseCtorArg = semBase,
                semNsems = semNsems,
                semOtime = semOtime,
                semCtime = semCtime,
            )
    }
}

public data class Vmtotal(
    public var tVm: ULong = 0uL,
    public var tAvm: ULong = 0uL,
    public var tRm: ULong = 0uL,
    public var tArm: ULong = 0uL,
    public var tVmshr: ULong = 0uL,
    public var tAvmshr: ULong = 0uL,
    public var tRmshr: ULong = 0uL,
    public var tArmshr: ULong = 0uL,
    public var tFree: ULong = 0uL,
    public var tRq: Short = 0,
    public var tDw: Short = 0,
    public var tPw: Short = 0,
    public var tSl: Short = 0,
    public var tSw: Short = 0,
    public var tPad: UShortArray = UShortArray(3),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Vmtotal) return false
        if (this.tVm != other.tVm) return false
        if (this.tAvm != other.tAvm) return false
        if (this.tRm != other.tRm) return false
        if (this.tArm != other.tArm) return false
        if (this.tVmshr != other.tVmshr) return false
        if (this.tAvmshr != other.tAvmshr) return false
        if (this.tRmshr != other.tRmshr) return false
        if (this.tArmshr != other.tArmshr) return false
        if (this.tFree != other.tFree) return false
        if (this.tRq != other.tRq) return false
        if (this.tDw != other.tDw) return false
        if (this.tPw != other.tPw) return false
        if (this.tSl != other.tSl) return false
        if (this.tSw != other.tSw) return false
        if (!this.tPad.contentEquals(other.tPad)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.tVm.hashCode()
        result = 31 * result + this.tAvm.hashCode()
        result = 31 * result + this.tRm.hashCode()
        result = 31 * result + this.tArm.hashCode()
        result = 31 * result + this.tVmshr.hashCode()
        result = 31 * result + this.tAvmshr.hashCode()
        result = 31 * result + this.tRmshr.hashCode()
        result = 31 * result + this.tArmshr.hashCode()
        result = 31 * result + this.tFree.hashCode()
        result = 31 * result + this.tRq.hashCode()
        result = 31 * result + this.tDw.hashCode()
        result = 31 * result + this.tPw.hashCode()
        result = 31 * result + this.tSl.hashCode()
        result = 31 * result + this.tSw.hashCode()
        result = 31 * result + this.tPad.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Vmtotal> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Vmtotal> {
                override val sizeBytes: Long = 88L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): Vmtotal =
                    Vmtotal(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 32L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 40L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 48L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 56L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 64L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).readNative(addr + 72L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).readNative(addr + 74L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).readNative(addr + 76L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).readNative(addr + 78L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).readNative(addr + 80L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (3).toInt())
                        ).readNative(addr + 82L),
                    )
                override fun writeNative(addr: Long, value: Vmtotal) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr, value.tVm)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 8L, value.tAvm)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 16L, value.tRm)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 24L, value.tArm)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 32L, value.tVmshr)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 40L, value.tAvmshr)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 48L, value.tRmshr)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 56L, value.tArmshr)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 64L, value.tFree)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).writeNative(addr + 72L, value.tRq)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).writeNative(addr + 74L, value.tDw)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).writeNative(addr + 76L, value.tPw)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).writeNative(addr + 78L, value.tSl)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).writeNative(addr + 80L, value.tSw)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (3).toInt())
                    ).writeNative(addr + 82L, value.tPad)
                }
            }
    }
}

public data class Sockstat(
    public var inpPpcb: ULong = 0uL,
    public var soAddr: ULong = 0uL,
    public var soPcb: ULong = 0uL,
    public var unpConn: ULong = 0uL,
    public var domFamily: CInt = 0,
    public var proto: CInt = 0,
    public var soRcvSbState: CInt = 0,
    public var soSndSbState: CInt = 0,
    /**
     * Socket address.
     */
    public var saLocal: SockaddrStorage = SockaddrStorage(),
    /**
     * Peer address.
     */
    public var saPeer: SockaddrStorage = SockaddrStorage(),
    public var type: CInt = 0,
    public var dname: UByteArray = UByteArray(32),
    public var sendq: CUint = 0u,
    public var recvq: CUint = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Sockstat) return false
        if (this.inpPpcb != other.inpPpcb) return false
        if (this.soAddr != other.soAddr) return false
        if (this.soPcb != other.soPcb) return false
        if (this.unpConn != other.unpConn) return false
        if (this.domFamily != other.domFamily) return false
        if (this.proto != other.proto) return false
        if (this.soRcvSbState != other.soRcvSbState) return false
        if (this.soSndSbState != other.soSndSbState) return false
        if (this.saLocal != other.saLocal) return false
        if (this.saPeer != other.saPeer) return false
        if (this.type != other.type) return false
        if (!this.dname.contentEquals(other.dname)) return false
        if (this.sendq != other.sendq) return false
        if (this.recvq != other.recvq) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.inpPpcb.hashCode()
        result = 31 * result + this.soAddr.hashCode()
        result = 31 * result + this.soPcb.hashCode()
        result = 31 * result + this.unpConn.hashCode()
        result = 31 * result + this.domFamily.hashCode()
        result = 31 * result + this.proto.hashCode()
        result = 31 * result + this.soRcvSbState.hashCode()
        result = 31 * result + this.soSndSbState.hashCode()
        result = 31 * result + this.saLocal.hashCode()
        result = 31 * result + this.saPeer.hashCode()
        result = 31 * result + this.type.hashCode()
        result = 31 * result + this.dname.contentHashCode()
        result = 31 * result + this.sendq.hashCode()
        result = 31 * result + this.recvq.hashCode()
        return result
    }
}

public data class Shmstat(
    public var size: ULong = 0uL,
    public var mode: UShort = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Shmstat> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Shmstat> {
                override val sizeBytes: Long = 16L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): Shmstat =
                    Shmstat(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: Shmstat) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr, value.size)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 8L, value.mode)
                }
            }
    }
}

public data class SpacectlRange(
    public var rOffset: OffT = 0L,
    public var rLen: OffT = 0L,
)

public data class RusageExt(
    public var ruxRuntime: ULong = 0uL,
    public var ruxUticks: ULong = 0uL,
    public var ruxSticks: ULong = 0uL,
    public var ruxIticks: ULong = 0uL,
    public var ruxUu: ULong = 0uL,
    public var ruxSu: ULong = 0uL,
    public var ruxTu: ULong = 0uL,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<RusageExt> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<RusageExt> {
                override val sizeBytes: Long = 56L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): RusageExt =
                    RusageExt(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 32L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 40L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 48L),
                    )
                override fun writeNative(addr: Long, value: RusageExt) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr, value.ruxRuntime)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 8L, value.ruxUticks)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 16L, value.ruxSticks)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 24L, value.ruxIticks)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 32L, value.ruxUu)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 40L, value.ruxSu)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 48L, value.ruxTu)
                }
            }
    }
}

public class IfClonereq internal constructor(
    public var ifcrTotal: CInt,
    public var ifcrCount: CInt,
    ifcrBufferCtorArg: MutPtr<CChar>,
) {
    public var ifcrBuffer: MutPtr<CChar> = ifcrBufferCtorArg
        internal set

    public constructor() : this(
        ifcrTotal = 0,
        ifcrCount = 0,
        ifcrBufferCtorArg = MutPtr(0L),
    )

    public operator fun component1(): CInt = this.ifcrTotal

    public operator fun component2(): CInt = this.ifcrCount

    public operator fun component3(): MutPtr<CChar> = this.ifcrBuffer

    public fun copy(ifcrTotal: CInt = this.ifcrTotal, ifcrCount: CInt = this.ifcrCount, ifcrBuffer: MutPtr<CChar> = this.ifcrBuffer): IfClonereq = IfClonereq(ifcrTotal = ifcrTotal, ifcrCount = ifcrCount, ifcrBufferCtorArg = ifcrBuffer)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is IfClonereq) return false
        if (this.ifcrTotal != other.ifcrTotal) return false
        if (this.ifcrCount != other.ifcrCount) return false
        if (this.ifcrBuffer != other.ifcrBuffer) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.ifcrTotal.hashCode()
        result = 31 * result + this.ifcrCount.hashCode()
        result = 31 * result + this.ifcrBuffer.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<IfClonereq> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<IfClonereq> {
                override val sizeBytes: Long = 16L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): IfClonereq =
                    IfClonereq(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 4L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CChar>(64)
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: IfClonereq) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.ifcrTotal)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 4L, value.ifcrCount)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CChar>(64)
                    ).writeNative(addr + 8L, value.ifcrBuffer)
                }
            }

        public operator fun invoke(
            ifcrTotal: CInt = 0,
            ifcrCount: CInt = 0,
            ifcrBuffer: MutPtr<CChar> = MutPtr(0L),
        ): IfClonereq =
            IfClonereq(
                ifcrTotal = ifcrTotal,
                ifcrCount = ifcrCount,
                ifcrBufferCtorArg = ifcrBuffer,
            )
    }
}

public data class IfMsghdr(
    /**
     * to skip over non-understood messages
     */
    public var ifmMsglen: CUshort = 0u,
    /**
     * future binary compatibility
     */
    public var ifmVersion: CUchar = 0u,
    /**
     * message type
     */
    public var ifmType: CUchar = 0u,
    /**
     * like rtmAddrs
     */
    public var ifmAddrs: CInt = 0,
    /**
     * value of ifFlags
     */
    public var ifmFlags: CInt = 0,
    /**
     * index for associated ifp
     */
    public var ifmIndex: CUshort = 0u,
    public var ifmSpare1: CUshort = 0u,
    /**
     * statistics and other data about if
     */
    public var ifmData: IfData = IfData(),
)

public data class IfMsghdrl(
    /**
     * to skip over non-understood messages
     */
    public var ifmMsglen: CUshort = 0u,
    /**
     * future binary compatibility
     */
    public var ifmVersion: CUchar = 0u,
    /**
     * message type
     */
    public var ifmType: CUchar = 0u,
    /**
     * like rtmAddrs
     */
    public var ifmAddrs: CInt = 0,
    /**
     * value of ifFlags
     */
    public var ifmFlags: CInt = 0,
    /**
     * index for associated ifp
     */
    public var ifmIndex: CUshort = 0u,
    /**
     * spare space to grow ifIndex, see ifVar.h
     */
    public var ifmSpare1: CUshort = 0u,
    /**
     * length of ifMsghdrl incl. ifData
     */
    public var ifmLen: CUshort = 0u,
    /**
     * offset of ifData from beginning
     */
    public var ifmDataOff: CUshort = 0u,
    public var ifmSpare2: CInt = 0,
    /**
     * statistics and other data about if
     */
    public var ifmData: IfData = IfData(),
)

public data class IfaMsghdr(
    /**
     * to skip over non-understood messages
     */
    public var ifamMsglen: CUshort = 0u,
    /**
     * future binary compatibility
     */
    public var ifamVersion: CUchar = 0u,
    /**
     * message type
     */
    public var ifamType: CUchar = 0u,
    /**
     * like rtmAddrs
     */
    public var ifamAddrs: CInt = 0,
    /**
     * value of ifaFlags
     */
    public var ifamFlags: CInt = 0,
    /**
     * index for associated ifp
     */
    public var ifamIndex: CUshort = 0u,
    public var ifamSpare1: CUshort = 0u,
    /**
     * value of ifaIfp->ifMetric
     */
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
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 14L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: IfaMsghdr) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.ifamMsglen)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 2L, value.ifamVersion)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 3L, value.ifamType)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 4L, value.ifamAddrs)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 8L, value.ifamFlags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 12L, value.ifamIndex)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 14L, value.ifamSpare1)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 16L, value.ifamMetric)
                }
            }
    }
}

public data class IfaMsghdrl(
    /**
     * to skip over non-understood messages
     */
    public var ifamMsglen: CUshort = 0u,
    /**
     * future binary compatibility
     */
    public var ifamVersion: CUchar = 0u,
    /**
     * message type
     */
    public var ifamType: CUchar = 0u,
    /**
     * like rtmAddrs
     */
    public var ifamAddrs: CInt = 0,
    /**
     * value of ifaFlags
     */
    public var ifamFlags: CInt = 0,
    /**
     * index for associated ifp
     */
    public var ifamIndex: CUshort = 0u,
    /**
     * spare space to grow ifIndex, see ifVar.h
     */
    public var ifamSpare1: CUshort = 0u,
    /**
     * length of ifaMsghdrl incl. ifData
     */
    public var ifamLen: CUshort = 0u,
    /**
     * offset of ifData from beginning
     */
    public var ifamDataOff: CUshort = 0u,
    /**
     * value of ifaIfp->ifMetric
     */
    public var ifamMetric: CInt = 0,
    /**
     * statistics and other data about if or address
     */
    public var ifamData: IfData = IfData(),
)

public data class IfmaMsghdr(
    /**
     * to skip over non-understood messages
     */
    public var ifmamMsglen: CUshort = 0u,
    /**
     * future binary compatibility
     */
    public var ifmamVersion: CUchar = 0u,
    /**
     * message type
     */
    public var ifmamType: CUchar = 0u,
    /**
     * like rtmAddrs
     */
    public var ifmamAddrs: CInt = 0,
    /**
     * value of ifaFlags
     */
    public var ifmamFlags: CInt = 0,
    /**
     * index for associated ifp
     */
    public var ifmamIndex: CUshort = 0u,
    public var ifmamSpare1: CUshort = 0u,
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
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 14L),
                    )
                override fun writeNative(addr: Long, value: IfmaMsghdr) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.ifmamMsglen)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 2L, value.ifmamVersion)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 3L, value.ifmamType)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 4L, value.ifmamAddrs)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 8L, value.ifmamFlags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 12L, value.ifmamIndex)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 14L, value.ifmamSpare1)
                }
            }
    }
}

public data class IfAnnouncemsghdr(
    /**
     * to skip over non-understood messages
     */
    public var ifanMsglen: CUshort = 0u,
    /**
     * future binary compatibility
     */
    public var ifanVersion: CUchar = 0u,
    /**
     * message type
     */
    public var ifanType: CUchar = 0u,
    /**
     * index for associated ifp
     */
    public var ifanIndex: CUshort = 0u,
    /**
     * if name, e.g. "en0"
     */
    public var ifanName: UByteArray = UByteArray(IFNAMSIZ.toInt()),
    /**
     * what type of announcement
     */
    public var ifanWhat: CUshort = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is IfAnnouncemsghdr) return false
        if (this.ifanMsglen != other.ifanMsglen) return false
        if (this.ifanVersion != other.ifanVersion) return false
        if (this.ifanType != other.ifanType) return false
        if (this.ifanIndex != other.ifanIndex) return false
        if (!this.ifanName.contentEquals(other.ifanName)) return false
        if (this.ifanWhat != other.ifanWhat) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.ifanMsglen.hashCode()
        result = 31 * result + this.ifanVersion.hashCode()
        result = 31 * result + this.ifanType.hashCode()
        result = 31 * result + this.ifanIndex.hashCode()
        result = 31 * result + this.ifanName.contentHashCode()
        result = 31 * result + this.ifanWhat.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<IfAnnouncemsghdr> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<IfAnnouncemsghdr> {
                override val sizeBytes: Long =
                    io.github.kotlinmania.rustlang.core.mem
                        .alignUpBytes(
                            (
                                io.github.kotlinmania.rustlang.core.mem
                                    .alignUpBytes(
                                        (
                                            io.github.kotlinmania.rustlang.core.mem
                                                .alignUpBytes(6L, 1L) + ((IFNAMSIZ.toInt()).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8).strideBytes)
                                        ),
                                        2L,
                                    ) + 2L
                            ),
                            maxOf(2L, 1L),
                        )
                override val alignBytes: Long = maxOf(2L, 1L)
                override fun readNative(addr: Long): IfAnnouncemsghdr =
                    IfAnnouncemsghdr(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 2L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 3L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 4L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (IFNAMSIZ.toInt()).toInt())
                        ).readNative(
                            addr +
                                io.github.kotlinmania.rustlang.core.mem
                                    .alignUpBytes(6L, 1L),
                        ),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(
                            addr +
                                io.github.kotlinmania.rustlang.core.mem
                                    .alignUpBytes(
                                        (
                                            io.github.kotlinmania.rustlang.core.mem
                                                .alignUpBytes(6L, 1L) + ((IFNAMSIZ.toInt()).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8).strideBytes)
                                        ),
                                        2L,
                                    ),
                        ),
                    )
                override fun writeNative(addr: Long, value: IfAnnouncemsghdr) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.ifanMsglen)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 2L, value.ifanVersion)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 3L, value.ifanType)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 4L, value.ifanIndex)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (IFNAMSIZ.toInt()).toInt())
                    ).writeNative(
                        addr +
                            io.github.kotlinmania.rustlang.core.mem
                                .alignUpBytes(6L, 1L),
                        value.ifanName,
                    )
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(
                        addr +
                            io.github.kotlinmania.rustlang.core.mem
                                .alignUpBytes(
                                    (
                                        io.github.kotlinmania.rustlang.core.mem
                                            .alignUpBytes(6L, 1L) + ((IFNAMSIZ.toInt()).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8).strideBytes)
                                    ),
                                    2L,
                                ),
                        value.ifanWhat,
                    )
                }
            }
    }
}

public class IfreqBuffer internal constructor(
    public var length: SizeT,
    bufferCtorArg: MutPtr<CVoid>,
) {
    public var buffer: MutPtr<CVoid> = bufferCtorArg
        internal set

    public constructor() : this(
        length = 0uL,
        bufferCtorArg = MutPtr(0L),
    )

    public operator fun component1(): SizeT = this.length

    public operator fun component2(): MutPtr<CVoid> = this.buffer

    public fun copy(length: SizeT = this.length, buffer: MutPtr<CVoid> = this.buffer): IfreqBuffer = IfreqBuffer(length = length, bufferCtorArg = buffer)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is IfreqBuffer) return false
        if (this.length != other.length) return false
        if (this.buffer != other.buffer) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.length.hashCode()
        result = 31 * result + this.buffer.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<IfreqBuffer> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<IfreqBuffer> {
                override val sizeBytes: Long = 16L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): IfreqBuffer =
                    IfreqBuffer(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CVoid>(64)
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: IfreqBuffer) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).writeNative(addr, value.length)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr + 8L, value.buffer)
                }
            }

        public operator fun invoke(
            length: SizeT = 0uL,
            buffer: MutPtr<CVoid> = MutPtr(0L),
        ): IfreqBuffer =
            IfreqBuffer(
                length = length,
                bufferCtorArg = buffer,
            )
    }
}

public data class Ifaliasreq(
    /**
     * if name, e.g. "en0"
     */
    public var ifraName: UByteArray = UByteArray(IFNAMSIZ.toInt()),
    public var ifraAddr: Sockaddr = Sockaddr(),
    public var ifraBroadaddr: Sockaddr = Sockaddr(),
    public var ifraMask: Sockaddr = Sockaddr(),
    public var ifraVhid: CInt = 0,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Ifaliasreq) return false
        if (!this.ifraName.contentEquals(other.ifraName)) return false
        if (this.ifraAddr != other.ifraAddr) return false
        if (this.ifraBroadaddr != other.ifraBroadaddr) return false
        if (this.ifraMask != other.ifraMask) return false
        if (this.ifraVhid != other.ifraVhid) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.ifraName.contentHashCode()
        result = 31 * result + this.ifraAddr.hashCode()
        result = 31 * result + this.ifraBroadaddr.hashCode()
        result = 31 * result + this.ifraMask.hashCode()
        result = 31 * result + this.ifraVhid.hashCode()
        return result
    }
}

/**
 * 9.x compat
 */
public data class Oifaliasreq(
    /**
     * if name, e.g. "en0"
     */
    public var ifraName: UByteArray = UByteArray(IFNAMSIZ.toInt()),
    public var ifraAddr: Sockaddr = Sockaddr(),
    public var ifraBroadaddr: Sockaddr = Sockaddr(),
    public var ifraMask: Sockaddr = Sockaddr(),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Oifaliasreq) return false
        if (!this.ifraName.contentEquals(other.ifraName)) return false
        if (this.ifraAddr != other.ifraAddr) return false
        if (this.ifraBroadaddr != other.ifraBroadaddr) return false
        if (this.ifraMask != other.ifraMask) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.ifraName.contentHashCode()
        result = 31 * result + this.ifraAddr.hashCode()
        result = 31 * result + this.ifraBroadaddr.hashCode()
        result = 31 * result + this.ifraMask.hashCode()
        return result
    }
}

public class Ifmediareq internal constructor(
    /**
     * if name, e.g. "en0"
     */
    public var ifmName: UByteArray,
    /**
     * current media options
     */
    public var ifmCurrent: CInt,
    /**
     * don't care mask
     */
    public var ifmMask: CInt,
    /**
     * media status
     */
    public var ifmStatus: CInt,
    /**
     * active options
     */
    public var ifmActive: CInt,
    /**
     * # entries in ifmUlist array
     */
    public var ifmCount: CInt,
    ifmUlistCtorArg: MutPtr<CInt>,
) {
    /**
     * media words
     */
    public var ifmUlist: MutPtr<CInt> = ifmUlistCtorArg
        internal set

    public constructor() : this(
        ifmName = UByteArray(IFNAMSIZ.toInt()),
        ifmCurrent = 0,
        ifmMask = 0,
        ifmStatus = 0,
        ifmActive = 0,
        ifmCount = 0,
        ifmUlistCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UByteArray = this.ifmName

    public operator fun component2(): CInt = this.ifmCurrent

    public operator fun component3(): CInt = this.ifmMask

    public operator fun component4(): CInt = this.ifmStatus

    public operator fun component5(): CInt = this.ifmActive

    public operator fun component6(): CInt = this.ifmCount

    public operator fun component7(): MutPtr<CInt> = this.ifmUlist

    public fun copy(ifmName: UByteArray = this.ifmName, ifmCurrent: CInt = this.ifmCurrent, ifmMask: CInt = this.ifmMask, ifmStatus: CInt = this.ifmStatus, ifmActive: CInt = this.ifmActive, ifmCount: CInt = this.ifmCount, ifmUlist: MutPtr<CInt> = this.ifmUlist): Ifmediareq = Ifmediareq(ifmName = ifmName, ifmCurrent = ifmCurrent, ifmMask = ifmMask, ifmStatus = ifmStatus, ifmActive = ifmActive, ifmCount = ifmCount, ifmUlistCtorArg = ifmUlist)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Ifmediareq) return false
        if (!this.ifmName.contentEquals(other.ifmName)) return false
        if (this.ifmCurrent != other.ifmCurrent) return false
        if (this.ifmMask != other.ifmMask) return false
        if (this.ifmStatus != other.ifmStatus) return false
        if (this.ifmActive != other.ifmActive) return false
        if (this.ifmCount != other.ifmCount) return false
        if (this.ifmUlist != other.ifmUlist) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.ifmName.contentHashCode()
        result = 31 * result + this.ifmCurrent.hashCode()
        result = 31 * result + this.ifmMask.hashCode()
        result = 31 * result + this.ifmStatus.hashCode()
        result = 31 * result + this.ifmActive.hashCode()
        result = 31 * result + this.ifmCount.hashCode()
        result = 31 * result + this.ifmUlist.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Ifmediareq> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Ifmediareq> {
                override val sizeBytes: Long =
                    io.github.kotlinmania.rustlang.core.mem
                        .alignUpBytes(
                            (
                                io.github.kotlinmania.rustlang.core.mem
                                    .alignUpBytes(
                                        (
                                            io.github.kotlinmania.rustlang.core.mem
                                                .alignUpBytes(
                                                    (
                                                        io.github.kotlinmania.rustlang.core.mem
                                                            .alignUpBytes(
                                                                (
                                                                    io.github.kotlinmania.rustlang.core.mem
                                                                        .alignUpBytes(
                                                                            (
                                                                                io.github.kotlinmania.rustlang.core.mem
                                                                                    .alignUpBytes(
                                                                                        (
                                                                                            io.github.kotlinmania.rustlang.core.mem
                                                                                                .alignUpBytes(((IFNAMSIZ.toInt()).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8).strideBytes), 4L) + 4L
                                                                                        ),
                                                                                        4L,
                                                                                    ) + 4L
                                                                            ),
                                                                            4L,
                                                                        ) + 4L
                                                                ),
                                                                4L,
                                                            ) + 4L
                                                    ),
                                                    4L,
                                                ) + 4L
                                        ),
                                        8L,
                                    ) + 8L
                            ),
                            maxOf(maxOf(1L, 4L), 8L),
                        )
                override val alignBytes: Long = maxOf(maxOf(1L, 4L), 8L)
                override fun readNative(addr: Long): Ifmediareq =
                    Ifmediareq(
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (IFNAMSIZ.toInt()).toInt())
                        ).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(
                            addr +
                                io.github.kotlinmania.rustlang.core.mem
                                    .alignUpBytes(((IFNAMSIZ.toInt()).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8).strideBytes), 4L),
                        ),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(
                            addr +
                                io.github.kotlinmania.rustlang.core.mem
                                    .alignUpBytes(
                                        (
                                            io.github.kotlinmania.rustlang.core.mem
                                                .alignUpBytes(((IFNAMSIZ.toInt()).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8).strideBytes), 4L) + 4L
                                        ),
                                        4L,
                                    ),
                        ),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(
                            addr +
                                io.github.kotlinmania.rustlang.core.mem
                                    .alignUpBytes(
                                        (
                                            io.github.kotlinmania.rustlang.core.mem
                                                .alignUpBytes(
                                                    (
                                                        io.github.kotlinmania.rustlang.core.mem
                                                            .alignUpBytes(((IFNAMSIZ.toInt()).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8).strideBytes), 4L) + 4L
                                                    ),
                                                    4L,
                                                ) + 4L
                                        ),
                                        4L,
                                    ),
                        ),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(
                            addr +
                                io.github.kotlinmania.rustlang.core.mem
                                    .alignUpBytes(
                                        (
                                            io.github.kotlinmania.rustlang.core.mem
                                                .alignUpBytes(
                                                    (
                                                        io.github.kotlinmania.rustlang.core.mem
                                                            .alignUpBytes(
                                                                (
                                                                    io.github.kotlinmania.rustlang.core.mem
                                                                        .alignUpBytes(((IFNAMSIZ.toInt()).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8).strideBytes), 4L) + 4L
                                                                ),
                                                                4L,
                                                            ) + 4L
                                                    ),
                                                    4L,
                                                ) + 4L
                                        ),
                                        4L,
                                    ),
                        ),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(
                            addr +
                                io.github.kotlinmania.rustlang.core.mem
                                    .alignUpBytes(
                                        (
                                            io.github.kotlinmania.rustlang.core.mem
                                                .alignUpBytes(
                                                    (
                                                        io.github.kotlinmania.rustlang.core.mem
                                                            .alignUpBytes(
                                                                (
                                                                    io.github.kotlinmania.rustlang.core.mem
                                                                        .alignUpBytes(
                                                                            (
                                                                                io.github.kotlinmania.rustlang.core.mem
                                                                                    .alignUpBytes(((IFNAMSIZ.toInt()).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8).strideBytes), 4L) + 4L
                                                                            ),
                                                                            4L,
                                                                        ) + 4L
                                                                ),
                                                                4L,
                                                            ) + 4L
                                                    ),
                                                    4L,
                                                ) + 4L
                                        ),
                                        4L,
                                    ),
                        ),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CInt>(64)
                        ).readNative(
                            addr +
                                io.github.kotlinmania.rustlang.core.mem
                                    .alignUpBytes(
                                        (
                                            io.github.kotlinmania.rustlang.core.mem
                                                .alignUpBytes(
                                                    (
                                                        io.github.kotlinmania.rustlang.core.mem
                                                            .alignUpBytes(
                                                                (
                                                                    io.github.kotlinmania.rustlang.core.mem
                                                                        .alignUpBytes(
                                                                            (
                                                                                io.github.kotlinmania.rustlang.core.mem
                                                                                    .alignUpBytes(
                                                                                        (
                                                                                            io.github.kotlinmania.rustlang.core.mem
                                                                                                .alignUpBytes(((IFNAMSIZ.toInt()).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8).strideBytes), 4L) + 4L
                                                                                        ),
                                                                                        4L,
                                                                                    ) + 4L
                                                                            ),
                                                                            4L,
                                                                        ) + 4L
                                                                ),
                                                                4L,
                                                            ) + 4L
                                                    ),
                                                    4L,
                                                ) + 4L
                                        ),
                                        8L,
                                    ),
                        ),
                    )
                override fun writeNative(addr: Long, value: Ifmediareq) {
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (IFNAMSIZ.toInt()).toInt())
                    ).writeNative(addr, value.ifmName)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(
                        addr +
                            io.github.kotlinmania.rustlang.core.mem
                                .alignUpBytes(((IFNAMSIZ.toInt()).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8).strideBytes), 4L),
                        value.ifmCurrent,
                    )
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(
                        addr +
                            io.github.kotlinmania.rustlang.core.mem
                                .alignUpBytes(
                                    (
                                        io.github.kotlinmania.rustlang.core.mem
                                            .alignUpBytes(((IFNAMSIZ.toInt()).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8).strideBytes), 4L) + 4L
                                    ),
                                    4L,
                                ),
                        value.ifmMask,
                    )
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(
                        addr +
                            io.github.kotlinmania.rustlang.core.mem
                                .alignUpBytes(
                                    (
                                        io.github.kotlinmania.rustlang.core.mem
                                            .alignUpBytes(
                                                (
                                                    io.github.kotlinmania.rustlang.core.mem
                                                        .alignUpBytes(((IFNAMSIZ.toInt()).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8).strideBytes), 4L) + 4L
                                                ),
                                                4L,
                                            ) + 4L
                                    ),
                                    4L,
                                ),
                        value.ifmStatus,
                    )
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(
                        addr +
                            io.github.kotlinmania.rustlang.core.mem
                                .alignUpBytes(
                                    (
                                        io.github.kotlinmania.rustlang.core.mem
                                            .alignUpBytes(
                                                (
                                                    io.github.kotlinmania.rustlang.core.mem
                                                        .alignUpBytes(
                                                            (
                                                                io.github.kotlinmania.rustlang.core.mem
                                                                    .alignUpBytes(((IFNAMSIZ.toInt()).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8).strideBytes), 4L) + 4L
                                                            ),
                                                            4L,
                                                        ) + 4L
                                                ),
                                                4L,
                                            ) + 4L
                                    ),
                                    4L,
                                ),
                        value.ifmActive,
                    )
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(
                        addr +
                            io.github.kotlinmania.rustlang.core.mem
                                .alignUpBytes(
                                    (
                                        io.github.kotlinmania.rustlang.core.mem
                                            .alignUpBytes(
                                                (
                                                    io.github.kotlinmania.rustlang.core.mem
                                                        .alignUpBytes(
                                                            (
                                                                io.github.kotlinmania.rustlang.core.mem
                                                                    .alignUpBytes(
                                                                        (
                                                                            io.github.kotlinmania.rustlang.core.mem
                                                                                .alignUpBytes(((IFNAMSIZ.toInt()).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8).strideBytes), 4L) + 4L
                                                                        ),
                                                                        4L,
                                                                    ) + 4L
                                                            ),
                                                            4L,
                                                        ) + 4L
                                                ),
                                                4L,
                                            ) + 4L
                                    ),
                                    4L,
                                ),
                        value.ifmCount,
                    )
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CInt>(64)
                    ).writeNative(
                        addr +
                            io.github.kotlinmania.rustlang.core.mem
                                .alignUpBytes(
                                    (
                                        io.github.kotlinmania.rustlang.core.mem
                                            .alignUpBytes(
                                                (
                                                    io.github.kotlinmania.rustlang.core.mem
                                                        .alignUpBytes(
                                                            (
                                                                io.github.kotlinmania.rustlang.core.mem
                                                                    .alignUpBytes(
                                                                        (
                                                                            io.github.kotlinmania.rustlang.core.mem
                                                                                .alignUpBytes(
                                                                                    (
                                                                                        io.github.kotlinmania.rustlang.core.mem
                                                                                            .alignUpBytes(((IFNAMSIZ.toInt()).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8).strideBytes), 4L) + 4L
                                                                                    ),
                                                                                    4L,
                                                                                ) + 4L
                                                                        ),
                                                                        4L,
                                                                    ) + 4L
                                                            ),
                                                            4L,
                                                        ) + 4L
                                                ),
                                                4L,
                                            ) + 4L
                                    ),
                                    8L,
                                ),
                        value.ifmUlist,
                    )
                }
            }

        public operator fun invoke(
            ifmName: UByteArray = UByteArray(IFNAMSIZ.toInt()),
            ifmCurrent: CInt = 0,
            ifmMask: CInt = 0,
            ifmStatus: CInt = 0,
            ifmActive: CInt = 0,
            ifmCount: CInt = 0,
            ifmUlist: MutPtr<CInt> = MutPtr(0L),
        ): Ifmediareq =
            Ifmediareq(
                ifmName = ifmName,
                ifmCurrent = ifmCurrent,
                ifmMask = ifmMask,
                ifmStatus = ifmStatus,
                ifmActive = ifmActive,
                ifmCount = ifmCount,
                ifmUlistCtorArg = ifmUlist,
            )
    }
}

public class Ifdrv internal constructor(
    /**
     * if name, e.g. "en0"
     */
    public var ifdName: UByteArray,
    public var ifdCmd: CUlong,
    public var ifdLen: SizeT,
    ifdDataCtorArg: MutPtr<CVoid>,
) {
    public var ifdData: MutPtr<CVoid> = ifdDataCtorArg
        internal set

    public constructor() : this(
        ifdName = UByteArray(IFNAMSIZ.toInt()),
        ifdCmd = 0uL,
        ifdLen = 0uL,
        ifdDataCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UByteArray = this.ifdName

    public operator fun component2(): CUlong = this.ifdCmd

    public operator fun component3(): SizeT = this.ifdLen

    public operator fun component4(): MutPtr<CVoid> = this.ifdData

    public fun copy(ifdName: UByteArray = this.ifdName, ifdCmd: CUlong = this.ifdCmd, ifdLen: SizeT = this.ifdLen, ifdData: MutPtr<CVoid> = this.ifdData): Ifdrv = Ifdrv(ifdName = ifdName, ifdCmd = ifdCmd, ifdLen = ifdLen, ifdDataCtorArg = ifdData)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Ifdrv) return false
        if (!this.ifdName.contentEquals(other.ifdName)) return false
        if (this.ifdCmd != other.ifdCmd) return false
        if (this.ifdLen != other.ifdLen) return false
        if (this.ifdData != other.ifdData) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.ifdName.contentHashCode()
        result = 31 * result + this.ifdCmd.hashCode()
        result = 31 * result + this.ifdLen.hashCode()
        result = 31 * result + this.ifdData.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            ifdName: UByteArray = UByteArray(IFNAMSIZ.toInt()),
            ifdCmd: CUlong = 0uL,
            ifdLen: SizeT = 0uL,
            ifdData: MutPtr<CVoid> = MutPtr(0L),
        ): Ifdrv =
            Ifdrv(
                ifdName = ifdName,
                ifdCmd = ifdCmd,
                ifdLen = ifdLen,
                ifdDataCtorArg = ifdData,
            )
    }
}

public data class Ifi2creq(
    /**
     * i2c address (0xA0, 0xA2)
     */
    public var devAddr: UByte = 0u,
    /**
     * read offset
     */
    public var offset: UByte = 0u,
    /**
     * read length
     */
    public var len: UByte = 0u,
    public var spare0: UByte = 0u,
    public var spare1: UInt = 0u,
    /**
     * read buffer
     */
    public var data: UByteArray = UByteArray(8),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Ifi2creq) return false
        if (this.devAddr != other.devAddr) return false
        if (this.offset != other.offset) return false
        if (this.len != other.len) return false
        if (this.spare0 != other.spare0) return false
        if (this.spare1 != other.spare1) return false
        if (!this.data.contentEquals(other.data)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.devAddr.hashCode()
        result = 31 * result + this.offset.hashCode()
        result = 31 * result + this.len.hashCode()
        result = 31 * result + this.spare0.hashCode()
        result = 31 * result + this.spare1.hashCode()
        result = 31 * result + this.data.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Ifi2creq> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Ifi2creq> {
                override val sizeBytes: Long = 16L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): Ifi2creq =
                    Ifi2creq(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 1L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 2L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 3L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (8).toInt())
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: Ifi2creq) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr, value.devAddr)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 1L, value.offset)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 2L, value.len)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 3L, value.spare0)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.spare1)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (8).toInt())
                    ).writeNative(addr + 8L, value.data)
                }
            }
    }
}

public data class Ifrsshash(
    /**
     * if name, e.g. "en0"
     */
    public var ifrhName: UByteArray = UByteArray(IFNAMSIZ.toInt()),
    /**
     * RSS_FUNC_
     */
    public var ifrhFunc: UByte = 0u,
    public var ifrhSpare0: UByte = 0u,
    public var ifrhSpare1: UShort = 0u,
    /**
     * RSS_TYPE_
     */
    public var ifrhTypes: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Ifrsshash) return false
        if (!this.ifrhName.contentEquals(other.ifrhName)) return false
        if (this.ifrhFunc != other.ifrhFunc) return false
        if (this.ifrhSpare0 != other.ifrhSpare0) return false
        if (this.ifrhSpare1 != other.ifrhSpare1) return false
        if (this.ifrhTypes != other.ifrhTypes) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.ifrhName.contentHashCode()
        result = 31 * result + this.ifrhFunc.hashCode()
        result = 31 * result + this.ifrhSpare0.hashCode()
        result = 31 * result + this.ifrhSpare1.hashCode()
        result = 31 * result + this.ifrhTypes.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Ifrsshash> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Ifrsshash> {
                override val sizeBytes: Long =
                    io.github.kotlinmania.rustlang.core.mem
                        .alignUpBytes(
                            (
                                io.github.kotlinmania.rustlang.core.mem
                                    .alignUpBytes(
                                        (
                                            io.github.kotlinmania.rustlang.core.mem
                                                .alignUpBytes(
                                                    (
                                                        io.github.kotlinmania.rustlang.core.mem
                                                            .alignUpBytes(
                                                                (
                                                                    io.github.kotlinmania.rustlang.core.mem
                                                                        .alignUpBytes(((IFNAMSIZ.toInt()).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8).strideBytes), 1L) + 1L
                                                                ),
                                                                1L,
                                                            ) + 1L
                                                    ),
                                                    2L,
                                                ) + 2L
                                        ),
                                        4L,
                                    ) + 4L
                            ),
                            maxOf(maxOf(1L, 2L), 4L),
                        )
                override val alignBytes: Long = maxOf(maxOf(1L, 2L), 4L)
                override fun readNative(addr: Long): Ifrsshash =
                    Ifrsshash(
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (IFNAMSIZ.toInt()).toInt())
                        ).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(
                            addr +
                                io.github.kotlinmania.rustlang.core.mem
                                    .alignUpBytes(((IFNAMSIZ.toInt()).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8).strideBytes), 1L),
                        ),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(
                            addr +
                                io.github.kotlinmania.rustlang.core.mem
                                    .alignUpBytes(
                                        (
                                            io.github.kotlinmania.rustlang.core.mem
                                                .alignUpBytes(((IFNAMSIZ.toInt()).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8).strideBytes), 1L) + 1L
                                        ),
                                        1L,
                                    ),
                        ),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(
                            addr +
                                io.github.kotlinmania.rustlang.core.mem
                                    .alignUpBytes(
                                        (
                                            io.github.kotlinmania.rustlang.core.mem
                                                .alignUpBytes(
                                                    (
                                                        io.github.kotlinmania.rustlang.core.mem
                                                            .alignUpBytes(((IFNAMSIZ.toInt()).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8).strideBytes), 1L) + 1L
                                                    ),
                                                    1L,
                                                ) + 1L
                                        ),
                                        2L,
                                    ),
                        ),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(
                            addr +
                                io.github.kotlinmania.rustlang.core.mem
                                    .alignUpBytes(
                                        (
                                            io.github.kotlinmania.rustlang.core.mem
                                                .alignUpBytes(
                                                    (
                                                        io.github.kotlinmania.rustlang.core.mem
                                                            .alignUpBytes(
                                                                (
                                                                    io.github.kotlinmania.rustlang.core.mem
                                                                        .alignUpBytes(((IFNAMSIZ.toInt()).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8).strideBytes), 1L) + 1L
                                                                ),
                                                                1L,
                                                            ) + 1L
                                                    ),
                                                    2L,
                                                ) + 2L
                                        ),
                                        4L,
                                    ),
                        ),
                    )
                override fun writeNative(addr: Long, value: Ifrsshash) {
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (IFNAMSIZ.toInt()).toInt())
                    ).writeNative(addr, value.ifrhName)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(
                        addr +
                            io.github.kotlinmania.rustlang.core.mem
                                .alignUpBytes(((IFNAMSIZ.toInt()).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8).strideBytes), 1L),
                        value.ifrhFunc,
                    )
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(
                        addr +
                            io.github.kotlinmania.rustlang.core.mem
                                .alignUpBytes(
                                    (
                                        io.github.kotlinmania.rustlang.core.mem
                                            .alignUpBytes(((IFNAMSIZ.toInt()).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8).strideBytes), 1L) + 1L
                                    ),
                                    1L,
                                ),
                        value.ifrhSpare0,
                    )
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(
                        addr +
                            io.github.kotlinmania.rustlang.core.mem
                                .alignUpBytes(
                                    (
                                        io.github.kotlinmania.rustlang.core.mem
                                            .alignUpBytes(
                                                (
                                                    io.github.kotlinmania.rustlang.core.mem
                                                        .alignUpBytes(((IFNAMSIZ.toInt()).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8).strideBytes), 1L) + 1L
                                                ),
                                                1L,
                                            ) + 1L
                                    ),
                                    2L,
                                ),
                        value.ifrhSpare1,
                    )
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(
                        addr +
                            io.github.kotlinmania.rustlang.core.mem
                                .alignUpBytes(
                                    (
                                        io.github.kotlinmania.rustlang.core.mem
                                            .alignUpBytes(
                                                (
                                                    io.github.kotlinmania.rustlang.core.mem
                                                        .alignUpBytes(
                                                            (
                                                                io.github.kotlinmania.rustlang.core.mem
                                                                    .alignUpBytes(((IFNAMSIZ.toInt()).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8).strideBytes), 1L) + 1L
                                                            ),
                                                            1L,
                                                        ) + 1L
                                                ),
                                                2L,
                                            ) + 2L
                                    ),
                                    4L,
                                ),
                        value.ifrhTypes,
                    )
                }
            }
    }
}

public data class Ifmibdata(
    /**
     * name of interface
     */
    public var ifmdName: UByteArray = UByteArray(IFNAMSIZ.toInt()),
    /**
     * number of promiscuous listeners
     */
    public var ifmdPcount: CInt = 0,
    /**
     * interface flags
     */
    public var ifmdFlags: CInt = 0,
    /**
     * instantaneous length of send queue
     */
    public var ifmdSndLen: CInt = 0,
    /**
     * maximum length of send queue
     */
    public var ifmdSndMaxlen: CInt = 0,
    /**
     * number of drops in send queue
     */
    public var ifmdSndDrops: CInt = 0,
    /**
     * for future expansion
     */
    public var ifmdFiller: IntArray = IntArray(4),
    /**
     * generic information and statistics
     */
    public var ifmdData: IfData = IfData(),
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

public data class IfmibIso88023(
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
        if (other !is IfmibIso88023) return false
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
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<IfmibIso88023> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<IfmibIso88023> {
                override val sizeBytes: Long = 124L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): IfmibIso88023 =
                    IfmibIso88023(
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
                override fun writeNative(addr: Long, value: IfmibIso88023) {
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

public data class CAnonymousPh(
    public var ph1: ULong = 0uL,
    public var ph2: ULong = 0uL,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<CAnonymousPh> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<CAnonymousPh> {
                override val sizeBytes: Long = 16L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): CAnonymousPh =
                    CAnonymousPh(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: CAnonymousPh) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr, value.ph1)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 8L, value.ph2)
                }
            }
    }
}

public data class Fid(
    public var fidLen: CUshort = 0u,
    public var fidData0: CUshort = 0u,
    public var fidData: UByteArray = UByteArray(MAXFIDSZ),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Fid) return false
        if (this.fidLen != other.fidLen) return false
        if (this.fidData0 != other.fidData0) return false
        if (!this.fidData.contentEquals(other.fidData)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.fidLen.hashCode()
        result = 31 * result + this.fidData0.hashCode()
        result = 31 * result + this.fidData.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Fid> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Fid> {
                override val sizeBytes: Long =
                    io.github.kotlinmania.rustlang.core.mem
                        .alignUpBytes(
                            (
                                io.github.kotlinmania.rustlang.core.mem
                                    .alignUpBytes(4L, 1L) + ((MAXFIDSZ).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8).strideBytes)
                            ),
                            maxOf(2L, 1L),
                        )
                override val alignBytes: Long = maxOf(2L, 1L)
                override fun readNative(addr: Long): Fid =
                    Fid(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 2L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (MAXFIDSZ).toInt())
                        ).readNative(
                            addr +
                                io.github.kotlinmania.rustlang.core.mem
                                    .alignUpBytes(4L, 1L),
                        ),
                    )
                override fun writeNative(addr: Long, value: Fid) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.fidLen)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 2L, value.fidData0)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (MAXFIDSZ).toInt())
                    ).writeNative(
                        addr +
                            io.github.kotlinmania.rustlang.core.mem
                                .alignUpBytes(4L, 1L),
                        value.fidData,
                    )
                }
            }
    }
}

public data class Fhandle(
    public var fhFsid: FsidT = FsidT(),
    public var fhFid: Fid = Fid(),
)

public data class Bintime(
    public var sec: TimeT = 0L,
    public var frac: ULong = 0uL,
)

public data class Clockinfo(
    /**
     * clock frequency
     */
    public var hz: CInt = 0,
    /**
     * micro-seconds per hz tick
     */
    public var tick: CInt = 0,
    public var spare: CInt = 0,
    /**
     * statistics clock frequency
     */
    public var stathz: CInt = 0,
    /**
     * profiling clock frequency
     */
    public var profhz: CInt = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Clockinfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Clockinfo> {
                override val sizeBytes: Long = 20L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): Clockinfo =
                    Clockinfo(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: Clockinfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.hz)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 4L, value.tick)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 8L, value.spare)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 12L, value.stathz)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 16L, value.profhz)
                }
            }
    }
}

public class CAnonymousStailqEntryDevstat internal constructor(
    stqeNextCtorArg: MutPtr<Devstat>,
) {
    public var stqeNext: MutPtr<Devstat> = stqeNextCtorArg
        internal set

    public constructor() : this(
        stqeNextCtorArg = MutPtr(0L),
    )

    public operator fun component1(): MutPtr<Devstat> = this.stqeNext

    public fun copy(stqeNext: MutPtr<Devstat> = this.stqeNext): CAnonymousStailqEntryDevstat = CAnonymousStailqEntryDevstat(stqeNextCtorArg = stqeNext)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CAnonymousStailqEntryDevstat) return false
        if (this.stqeNext != other.stqeNext) return false
        return true
    }

    override fun hashCode(): Int = this.stqeNext.hashCode()

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<CAnonymousStailqEntryDevstat> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<CAnonymousStailqEntryDevstat> {
                override val sizeBytes: Long = 8L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): CAnonymousStailqEntryDevstat =
                    CAnonymousStailqEntryDevstat(
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<Devstat>(64)
                        ).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: CAnonymousStailqEntryDevstat) {
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<Devstat>(64)
                    ).writeNative(addr, value.stqeNext)
                }
            }

        public operator fun invoke(
            stqeNext: MutPtr<Devstat> = MutPtr(0L),
        ): CAnonymousStailqEntryDevstat =
            CAnonymousStailqEntryDevstat(
                stqeNextCtorArg = stqeNext,
            )
    }
}

public class Devstat internal constructor(
    /**
     * Update sequence
     */
    public var sequence0: UInt,
    /**
     * Allocated entry
     */
    public var allocated: CInt,
    /**
     * started ops
     */
    public var startCount: UInt,
    /**
     * completed ops
     */
    public var endCount: UInt,
    /**
     * busy time unaccounted for since this time
     */
    public var busyFrom: Bintime,
    public var devLinks: CAnonymousStailqEntryDevstat,
    /**
     * Devstat device number.
     */
    public var deviceNumber: UInt,
    public var deviceName: UByteArray,
    public var unitNumber: CInt,
    public var bytes: ULongArray,
    public var operations: ULongArray,
    public var duration: List<Bintime>,
    public var busyTime: Bintime,
    /**
     * Time the device was created.
     */
    public var creationTime: Bintime,
    /**
     * Block size, bytes
     */
    public var blockSize: UInt,
    /**
     * The number of simple, ordered, and head of queue tags sent.
     */
    public var tagTypes: ULongArray,
    /**
     * Which statistics are supported by a given device.
     */
    public var flags: DevstatSupportFlags,
    /**
     * Device type
     */
    public var deviceType: DevstatTypeFlags,
    /**
     * Controls list pos.
     */
    public var priority: DevstatPriority,
    idCtorArg: ConstPtr<CVoid>,
    /**
     * Update sequence
     */
    public var sequence1: UInt,
) {
    /**
     * Identification for GEOM nodes
     */
    public var id: ConstPtr<CVoid> = idCtorArg
        internal set

    public constructor() : this(
        sequence0 = 0u,
        allocated = 0,
        startCount = 0u,
        endCount = 0u,
        busyFrom = Bintime(),
        devLinks = CAnonymousStailqEntryDevstat(),
        deviceNumber = 0u,
        deviceName = UByteArray(DEVSTAT_NAME_LEN),
        unitNumber = 0,
        bytes = ULongArray(DEVSTAT_N_TRANS_FLAGS),
        operations = ULongArray(DEVSTAT_N_TRANS_FLAGS),
        duration = List(DEVSTAT_N_TRANS_FLAGS) { Bintime() },
        busyTime = Bintime(),
        creationTime = Bintime(),
        blockSize = 0u,
        tagTypes = ULongArray(3),
        flags = DevstatSupportFlags.entries.first(),
        deviceType = DevstatTypeFlags.entries.first(),
        priority = DevstatPriority.entries.first(),
        idCtorArg = ConstPtr(0L),
        sequence1 = 0u,
    )

    public companion object {
        public operator fun invoke(
            sequence0: UInt = 0u,
            allocated: CInt = 0,
            startCount: UInt = 0u,
            endCount: UInt = 0u,
            busyFrom: Bintime = Bintime(),
            devLinks: CAnonymousStailqEntryDevstat = CAnonymousStailqEntryDevstat(),
            deviceNumber: UInt = 0u,
            deviceName: UByteArray = UByteArray(DEVSTAT_NAME_LEN),
            unitNumber: CInt = 0,
            bytes: ULongArray = ULongArray(DEVSTAT_N_TRANS_FLAGS),
            operations: ULongArray = ULongArray(DEVSTAT_N_TRANS_FLAGS),
            duration: List<Bintime> = List(DEVSTAT_N_TRANS_FLAGS) { Bintime() },
            busyTime: Bintime = Bintime(),
            creationTime: Bintime = Bintime(),
            blockSize: UInt = 0u,
            tagTypes: ULongArray = ULongArray(3),
            flags: DevstatSupportFlags = DevstatSupportFlags.entries.first(),
            deviceType: DevstatTypeFlags = DevstatTypeFlags.entries.first(),
            priority: DevstatPriority = DevstatPriority.entries.first(),
            id: ConstPtr<CVoid> = ConstPtr(0L),
            sequence1: UInt = 0u,
        ): Devstat =
            Devstat(
                sequence0 = sequence0,
                allocated = allocated,
                startCount = startCount,
                endCount = endCount,
                busyFrom = busyFrom,
                devLinks = devLinks,
                deviceNumber = deviceNumber,
                deviceName = deviceName,
                unitNumber = unitNumber,
                bytes = bytes,
                operations = operations,
                duration = duration,
                busyTime = busyTime,
                creationTime = creationTime,
                blockSize = blockSize,
                tagTypes = tagTypes,
                flags = flags,
                deviceType = deviceType,
                priority = priority,
                idCtorArg = id,
                sequence1 = sequence1,
            )
    }
}

public data class DevstatMatch(
    public var matchFields: DevstatMatchFlags = DevstatMatchFlags.entries.first(),
    public var deviceType: DevstatTypeFlags = DevstatTypeFlags.entries.first(),
    public var numMatchCategories: CInt = 0,
)

public class DevstatMatchTable internal constructor(
    matchStrCtorArg: ConstPtr<CChar>,
    public var type: DevstatTypeFlags,
    public var matchField: DevstatMatchFlags,
) {
    public var matchStr: ConstPtr<CChar> = matchStrCtorArg
        internal set

    public constructor() : this(
        matchStrCtorArg = ConstPtr(0L),
        type = DevstatTypeFlags.entries.first(),
        matchField = DevstatMatchFlags.entries.first(),
    )

    public operator fun component1(): ConstPtr<CChar> = this.matchStr

    public operator fun component2(): DevstatTypeFlags = this.type

    public operator fun component3(): DevstatMatchFlags = this.matchField

    public fun copy(matchStr: ConstPtr<CChar> = this.matchStr, type: DevstatTypeFlags = this.type, matchField: DevstatMatchFlags = this.matchField): DevstatMatchTable = DevstatMatchTable(matchStrCtorArg = matchStr, type = type, matchField = matchField)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DevstatMatchTable) return false
        if (this.matchStr != other.matchStr) return false
        if (this.type != other.type) return false
        if (this.matchField != other.matchField) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.matchStr.hashCode()
        result = 31 * result + this.type.hashCode()
        result = 31 * result + this.matchField.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            matchStr: ConstPtr<CChar> = ConstPtr(0L),
            type: DevstatTypeFlags = DevstatTypeFlags.entries.first(),
            matchField: DevstatMatchFlags = DevstatMatchFlags.entries.first(),
        ): DevstatMatchTable =
            DevstatMatchTable(
                matchStrCtorArg = matchStr,
                type = type,
                matchField = matchField,
            )
    }
}

public data class DeviceSelection(
    public var deviceNumber: UInt = 0u,
    public var deviceName: UByteArray = UByteArray(DEVSTAT_NAME_LEN),
    public var unitNumber: CInt = 0,
    public var selected: CInt = 0,
    public var bytes: ULong = 0uL,
    public var position: CInt = 0,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DeviceSelection) return false
        if (this.deviceNumber != other.deviceNumber) return false
        if (!this.deviceName.contentEquals(other.deviceName)) return false
        if (this.unitNumber != other.unitNumber) return false
        if (this.selected != other.selected) return false
        if (this.bytes != other.bytes) return false
        if (this.position != other.position) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.deviceNumber.hashCode()
        result = 31 * result + this.deviceName.contentHashCode()
        result = 31 * result + this.unitNumber.hashCode()
        result = 31 * result + this.selected.hashCode()
        result = 31 * result + this.bytes.hashCode()
        result = 31 * result + this.position.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<DeviceSelection> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<DeviceSelection> {
                override val sizeBytes: Long =
                    io.github.kotlinmania.rustlang.core.mem
                        .alignUpBytes(
                            (
                                io.github.kotlinmania.rustlang.core.mem
                                    .alignUpBytes(
                                        (
                                            io.github.kotlinmania.rustlang.core.mem
                                                .alignUpBytes(
                                                    (
                                                        io.github.kotlinmania.rustlang.core.mem
                                                            .alignUpBytes(
                                                                (
                                                                    io.github.kotlinmania.rustlang.core.mem
                                                                        .alignUpBytes(
                                                                            (
                                                                                io.github.kotlinmania.rustlang.core.mem
                                                                                    .alignUpBytes(4L, 1L) + ((DEVSTAT_NAME_LEN).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8).strideBytes)
                                                                            ),
                                                                            4L,
                                                                        ) + 4L
                                                                ),
                                                                4L,
                                                            ) + 4L
                                                    ),
                                                    8L,
                                                ) + 8L
                                        ),
                                        4L,
                                    ) + 4L
                            ),
                            maxOf(maxOf(4L, 1L), 8L),
                        )
                override val alignBytes: Long = maxOf(maxOf(4L, 1L), 8L)
                override fun readNative(addr: Long): DeviceSelection =
                    DeviceSelection(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (DEVSTAT_NAME_LEN).toInt())
                        ).readNative(
                            addr +
                                io.github.kotlinmania.rustlang.core.mem
                                    .alignUpBytes(4L, 1L),
                        ),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(
                            addr +
                                io.github.kotlinmania.rustlang.core.mem
                                    .alignUpBytes(
                                        (
                                            io.github.kotlinmania.rustlang.core.mem
                                                .alignUpBytes(4L, 1L) + ((DEVSTAT_NAME_LEN).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8).strideBytes)
                                        ),
                                        4L,
                                    ),
                        ),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(
                            addr +
                                io.github.kotlinmania.rustlang.core.mem
                                    .alignUpBytes(
                                        (
                                            io.github.kotlinmania.rustlang.core.mem
                                                .alignUpBytes(
                                                    (
                                                        io.github.kotlinmania.rustlang.core.mem
                                                            .alignUpBytes(4L, 1L) + ((DEVSTAT_NAME_LEN).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8).strideBytes)
                                                    ),
                                                    4L,
                                                ) + 4L
                                        ),
                                        4L,
                                    ),
                        ),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(
                            addr +
                                io.github.kotlinmania.rustlang.core.mem
                                    .alignUpBytes(
                                        (
                                            io.github.kotlinmania.rustlang.core.mem
                                                .alignUpBytes(
                                                    (
                                                        io.github.kotlinmania.rustlang.core.mem
                                                            .alignUpBytes(
                                                                (
                                                                    io.github.kotlinmania.rustlang.core.mem
                                                                        .alignUpBytes(4L, 1L) + ((DEVSTAT_NAME_LEN).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8).strideBytes)
                                                                ),
                                                                4L,
                                                            ) + 4L
                                                    ),
                                                    4L,
                                                ) + 4L
                                        ),
                                        8L,
                                    ),
                        ),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(
                            addr +
                                io.github.kotlinmania.rustlang.core.mem
                                    .alignUpBytes(
                                        (
                                            io.github.kotlinmania.rustlang.core.mem
                                                .alignUpBytes(
                                                    (
                                                        io.github.kotlinmania.rustlang.core.mem
                                                            .alignUpBytes(
                                                                (
                                                                    io.github.kotlinmania.rustlang.core.mem
                                                                        .alignUpBytes(
                                                                            (
                                                                                io.github.kotlinmania.rustlang.core.mem
                                                                                    .alignUpBytes(4L, 1L) + ((DEVSTAT_NAME_LEN).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8).strideBytes)
                                                                            ),
                                                                            4L,
                                                                        ) + 4L
                                                                ),
                                                                4L,
                                                            ) + 4L
                                                    ),
                                                    8L,
                                                ) + 8L
                                        ),
                                        4L,
                                    ),
                        ),
                    )
                override fun writeNative(addr: Long, value: DeviceSelection) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.deviceNumber)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (DEVSTAT_NAME_LEN).toInt())
                    ).writeNative(
                        addr +
                            io.github.kotlinmania.rustlang.core.mem
                                .alignUpBytes(4L, 1L),
                        value.deviceName,
                    )
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(
                        addr +
                            io.github.kotlinmania.rustlang.core.mem
                                .alignUpBytes(
                                    (
                                        io.github.kotlinmania.rustlang.core.mem
                                            .alignUpBytes(4L, 1L) + ((DEVSTAT_NAME_LEN).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8).strideBytes)
                                    ),
                                    4L,
                                ),
                        value.unitNumber,
                    )
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(
                        addr +
                            io.github.kotlinmania.rustlang.core.mem
                                .alignUpBytes(
                                    (
                                        io.github.kotlinmania.rustlang.core.mem
                                            .alignUpBytes(
                                                (
                                                    io.github.kotlinmania.rustlang.core.mem
                                                        .alignUpBytes(4L, 1L) + ((DEVSTAT_NAME_LEN).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8).strideBytes)
                                                ),
                                                4L,
                                            ) + 4L
                                    ),
                                    4L,
                                ),
                        value.selected,
                    )
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(
                        addr +
                            io.github.kotlinmania.rustlang.core.mem
                                .alignUpBytes(
                                    (
                                        io.github.kotlinmania.rustlang.core.mem
                                            .alignUpBytes(
                                                (
                                                    io.github.kotlinmania.rustlang.core.mem
                                                        .alignUpBytes(
                                                            (
                                                                io.github.kotlinmania.rustlang.core.mem
                                                                    .alignUpBytes(4L, 1L) + ((DEVSTAT_NAME_LEN).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8).strideBytes)
                                                            ),
                                                            4L,
                                                        ) + 4L
                                                ),
                                                4L,
                                            ) + 4L
                                    ),
                                    8L,
                                ),
                        value.bytes,
                    )
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(
                        addr +
                            io.github.kotlinmania.rustlang.core.mem
                                .alignUpBytes(
                                    (
                                        io.github.kotlinmania.rustlang.core.mem
                                            .alignUpBytes(
                                                (
                                                    io.github.kotlinmania.rustlang.core.mem
                                                        .alignUpBytes(
                                                            (
                                                                io.github.kotlinmania.rustlang.core.mem
                                                                    .alignUpBytes(
                                                                        (
                                                                            io.github.kotlinmania.rustlang.core.mem
                                                                                .alignUpBytes(4L, 1L) + ((DEVSTAT_NAME_LEN).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8).strideBytes)
                                                                        ),
                                                                        4L,
                                                                    ) + 4L
                                                            ),
                                                            4L,
                                                        ) + 4L
                                                ),
                                                8L,
                                            ) + 8L
                                    ),
                                    4L,
                                ),
                        value.position,
                    )
                }
            }
    }
}

public class Devinfo internal constructor(
    devicesCtorArg: MutPtr<Devstat>,
    memPtrCtorArg: MutPtr<UByte>,
    public var generation: CLong,
    public var numdevs: CInt,
) {
    public var devices: MutPtr<Devstat> = devicesCtorArg
        internal set

    public var memPtr: MutPtr<UByte> = memPtrCtorArg
        internal set

    public constructor() : this(
        devicesCtorArg = MutPtr(0L),
        memPtrCtorArg = MutPtr(0L),
        generation = 0L,
        numdevs = 0,
    )

    public operator fun component1(): MutPtr<Devstat> = this.devices

    public operator fun component2(): MutPtr<UByte> = this.memPtr

    public operator fun component3(): CLong = this.generation

    public operator fun component4(): CInt = this.numdevs

    public fun copy(devices: MutPtr<Devstat> = this.devices, memPtr: MutPtr<UByte> = this.memPtr, generation: CLong = this.generation, numdevs: CInt = this.numdevs): Devinfo = Devinfo(devicesCtorArg = devices, memPtrCtorArg = memPtr, generation = generation, numdevs = numdevs)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Devinfo) return false
        if (this.devices != other.devices) return false
        if (this.memPtr != other.memPtr) return false
        if (this.generation != other.generation) return false
        if (this.numdevs != other.numdevs) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.devices.hashCode()
        result = 31 * result + this.memPtr.hashCode()
        result = 31 * result + this.generation.hashCode()
        result = 31 * result + this.numdevs.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            devices: MutPtr<Devstat> = MutPtr(0L),
            memPtr: MutPtr<UByte> = MutPtr(0L),
            generation: CLong = 0L,
            numdevs: CInt = 0,
        ): Devinfo =
            Devinfo(
                devicesCtorArg = devices,
                memPtrCtorArg = memPtr,
                generation = generation,
                numdevs = numdevs,
            )
    }
}

public data class Sockcred2(
    public var scVersion: CInt = 0,
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
        if (other !is Sockcred2) return false
        if (this.scVersion != other.scVersion) return false
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
        var result = this.scVersion.hashCode()
        result = 31 * result + this.scPid.hashCode()
        result = 31 * result + this.scUid.hashCode()
        result = 31 * result + this.scEuid.hashCode()
        result = 31 * result + this.scGid.hashCode()
        result = 31 * result + this.scEgid.hashCode()
        result = 31 * result + this.scNgroups.hashCode()
        result = 31 * result + this.scGroups.contentHashCode()
        return result
    }
}

public data class Ifconf(
    public var ifcLen: CInt = 0,
    public var ifcIfcu: CAnonymousIfcIfcu = CAnonymousIfcIfcu(),
)

public data class AuMaskT(
    public var amSuccess: CUint = 0u,
    public var amFailure: CUint = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<AuMaskT> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<AuMaskT> {
                override val sizeBytes: Long = 8L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): AuMaskT =
                    AuMaskT(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: AuMaskT) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.amSuccess)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.amFailure)
                }
            }
    }
}

public data class AuTidT(
    public var port: UInt = 0u,
    public var machine: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<AuTidT> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<AuTidT> {
                override val sizeBytes: Long = 8L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): AuTidT =
                    AuTidT(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: AuTidT) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.port)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.machine)
                }
            }
    }
}

public data class AuditinfoT(
    public var aiAuid: AuIdT = 0u,
    public var aiMask: AuMaskT = AuMaskT(),
    public var aiTermid: AuTidT = AuTidT(),
    public var aiAsid: AuAsidT = 0,
)

public data class TcpFastopen(
    public var enable: CInt = 0,
    public var psk: UByteArray = UByteArray(TCP_FASTOPEN_PSK_LEN),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is TcpFastopen) return false
        if (this.enable != other.enable) return false
        if (!this.psk.contentEquals(other.psk)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.enable.hashCode()
        result = 31 * result + this.psk.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<TcpFastopen> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<TcpFastopen> {
                override val sizeBytes: Long =
                    io.github.kotlinmania.rustlang.core.mem
                        .alignUpBytes(
                            (
                                io.github.kotlinmania.rustlang.core.mem
                                    .alignUpBytes(4L, 1L) + ((TCP_FASTOPEN_PSK_LEN).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).strideBytes)
                            ),
                            maxOf(4L, 1L),
                        )
                override val alignBytes: Long = maxOf(4L, 1L)
                override fun readNative(addr: Long): TcpFastopen =
                    TcpFastopen(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (TCP_FASTOPEN_PSK_LEN).toInt())
                        ).readNative(
                            addr +
                                io.github.kotlinmania.rustlang.core.mem
                                    .alignUpBytes(4L, 1L),
                        ),
                    )
                override fun writeNative(addr: Long, value: TcpFastopen) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.enable)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (TCP_FASTOPEN_PSK_LEN).toInt())
                    ).writeNative(
                        addr +
                            io.github.kotlinmania.rustlang.core.mem
                                .alignUpBytes(4L, 1L),
                        value.psk,
                    )
                }
            }
    }
}

public data class TcpFunctionSet(
    public var functionSetName: UByteArray = UByteArray(TCP_FUNCTION_NAME_LEN_MAX),
    public var pcbcnt: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is TcpFunctionSet) return false
        if (!this.functionSetName.contentEquals(other.functionSetName)) return false
        if (this.pcbcnt != other.pcbcnt) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.functionSetName.contentHashCode()
        result = 31 * result + this.pcbcnt.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<TcpFunctionSet> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<TcpFunctionSet> {
                override val sizeBytes: Long =
                    io.github.kotlinmania.rustlang.core.mem
                        .alignUpBytes(
                            (
                                io.github.kotlinmania.rustlang.core.mem
                                    .alignUpBytes(((TCP_FUNCTION_NAME_LEN_MAX).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8).strideBytes), 4L) + 4L
                            ),
                            maxOf(1L, 4L),
                        )
                override val alignBytes: Long = maxOf(1L, 4L)
                override fun readNative(addr: Long): TcpFunctionSet =
                    TcpFunctionSet(
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (TCP_FUNCTION_NAME_LEN_MAX).toInt())
                        ).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(
                            addr +
                                io.github.kotlinmania.rustlang.core.mem
                                    .alignUpBytes(((TCP_FUNCTION_NAME_LEN_MAX).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8).strideBytes), 4L),
                        ),
                    )
                override fun writeNative(addr: Long, value: TcpFunctionSet) {
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (TCP_FUNCTION_NAME_LEN_MAX).toInt())
                    ).writeNative(addr, value.functionSetName)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(
                        addr +
                            io.github.kotlinmania.rustlang.core.mem
                                .alignUpBytes(((TCP_FUNCTION_NAME_LEN_MAX).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8).strideBytes), 4L),
                        value.pcbcnt,
                    )
                }
            }
    }
}

// Note: this structure will change in a backwards-incompatible way in
// FreeBSD 15.
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
    public var tcpiDeliveredCe: UInt = 0u,
    public var tcpiReceivedCe: UInt = 0u,
    public var tcpiDeliveredE1Bytes: UInt = 0u,
    public var tcpiDeliveredE0Bytes: UInt = 0u,
    public var tcpiDeliveredCeBytes: UInt = 0u,
    public var tcpiReceivedE1Bytes: UInt = 0u,
    public var tcpiReceivedE0Bytes: UInt = 0u,
    public var tcpiReceivedCeBytes: UInt = 0u,
    public var tcpiTotalTlp: UInt = 0u,
    public var tcpiTotalTlpBytes: ULong = 0uL,
    public var tcpiSndUna: UInt = 0u,
    public var tcpiSndMax: UInt = 0u,
    public var tcpiRcvNumsacks: UInt = 0u,
    public var tcpiRcvAdv: UInt = 0u,
    public var tcpiDupacks: UInt = 0u,
    public var tcpiPad: UIntArray = UIntArray(10),
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<TcpInfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<TcpInfo> {
                override val sizeBytes: Long = 400L
                override val alignBytes: Long = 8L
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
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 132L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 136L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 140L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 144L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 148L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 152L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 156L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 160L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 164L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 168L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 176L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 180L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 184L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 188L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 192L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32, (10).toInt())
                        ).readNative(addr + 196L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32, (14).toInt())
                        ).readNative(addr + 236L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32, (26).toInt())
                        ).readNative(addr + 292L),
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
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 132L, value.tcpiDeliveredCe)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 136L, value.tcpiReceivedCe)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 140L, value.tcpiDeliveredE1Bytes)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 144L, value.tcpiDeliveredE0Bytes)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 148L, value.tcpiDeliveredCeBytes)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 152L, value.tcpiReceivedE1Bytes)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 156L, value.tcpiReceivedE0Bytes)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 160L, value.tcpiReceivedCeBytes)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 164L, value.tcpiTotalTlp)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 168L, value.tcpiTotalTlpBytes)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 176L, value.tcpiSndUna)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 180L, value.tcpiSndMax)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 184L, value.tcpiRcvNumsacks)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 188L, value.tcpiRcvAdv)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 192L, value.tcpiDupacks)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32, (10).toInt())
                    ).writeNative(addr + 196L, value.tcpiPad)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32, (14).toInt())
                    ).writeNative(addr + 236L, value.tcpiPad)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32, (26).toInt())
                    ).writeNative(addr + 292L, value.tcpiPad)
                }
            }
    }
}

public data class UmtxTime(
    public var timeout: Timespec = Timespec(),
    public var flags: UInt = 0u,
    public var clockid: UInt = 0u,
)

public data class ShmLargepageConf(
    public var psind: CInt = 0,
    public var allocPolicy: CInt = 0,
    public var pad: IntArray = IntArray(10),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ShmLargepageConf) return false
        if (this.psind != other.psind) return false
        if (this.allocPolicy != other.allocPolicy) return false
        if (!this.pad.contentEquals(other.pad)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.psind.hashCode()
        result = 31 * result + this.allocPolicy.hashCode()
        result = 31 * result + this.pad.contentHashCode()
        return result
    }
}

public data class MemoryType(
    public var priva: ULongArray = ULongArray(32),
    public var privb: ULongArray = ULongArray(26),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is MemoryType) return false
        if (!this.priva.contentEquals(other.priva)) return false
        if (!this.privb.contentEquals(other.privb)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.priva.contentHashCode()
        result = 31 * result + this.privb.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<MemoryType> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<MemoryType> {
                override val sizeBytes: Long = 464L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): MemoryType =
                    MemoryType(
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64, (32).toInt())
                        ).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64, (26).toInt())
                        ).readNative(addr + 256L),
                    )
                override fun writeNative(addr: Long, value: MemoryType) {
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64, (32).toInt())
                    ).writeNative(addr, value.priva)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64, (26).toInt())
                    ).writeNative(addr + 256L, value.privb)
                }
            }
    }
}

public data class MemoryTypeList(
    public var priv: ULongArray = ULongArray(2),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is MemoryTypeList) return false
        if (!this.priv.contentEquals(other.priv)) return false
        return true
    }

    override fun hashCode(): Int = this.priv.contentHashCode()

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<MemoryTypeList> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<MemoryTypeList> {
                override val sizeBytes: Long = 16L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): MemoryTypeList =
                    MemoryTypeList(
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64, (2).toInt())
                        ).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: MemoryTypeList) {
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64, (2).toInt())
                    ).writeNative(addr, value.priv)
                }
            }
    }
}

public data class Pidfh(
    public var priva: List<ULongArray> = List(8) { ULongArray(0) },
    public var privb: ULongArray = ULongArray(2),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Pidfh) return false
        if (this.priva != other.priva) return false
        if (!this.privb.contentEquals(other.privb)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.priva.hashCode()
        result = 31 * result + this.privb.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Pidfh> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Pidfh> {
                override val sizeBytes: Long = 2064L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): Pidfh =
                    Pidfh(
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(
                                    io.github.kotlinmania.rustlang.core.mem
                                        .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64, (32).toInt()),
                                    (8).toInt(),
                                )
                        ).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64, (2).toInt())
                        ).readNative(addr + 2048L),
                    )
                override fun writeNative(addr: Long, value: Pidfh) {
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(
                                io.github.kotlinmania.rustlang.core.mem
                                    .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64, (32).toInt()),
                                (8).toInt(),
                            )
                    ).writeNative(addr, value.priva)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64, (2).toInt())
                    ).writeNative(addr + 2048L, value.privb)
                }
            }
    }
}

public data class SctpEvent(
    public var seAssocId: SctpAssocT = 0u,
    public var seType: UShort = 0u,
    public var seOn: UByte = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SctpEvent> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SctpEvent> {
                override val sizeBytes: Long = 8L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): SctpEvent =
                    SctpEvent(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 6L),
                    )
                override fun writeNative(addr: Long, value: SctpEvent) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.seAssocId)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 4L, value.seType)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 6L, value.seOn)
                }
            }
    }
}

public data class SctpEventSubscribe(
    public var sctpDataIoEvent: UByte = 0u,
    public var sctpAssociationEvent: UByte = 0u,
    public var sctpAddressEvent: UByte = 0u,
    public var sctpSendFailureEvent: UByte = 0u,
    public var sctpPeerErrorEvent: UByte = 0u,
    public var sctpShutdownEvent: UByte = 0u,
    public var sctpPartialDeliveryEvent: UByte = 0u,
    public var sctpAdaptationLayerEvent: UByte = 0u,
    public var sctpAuthenticationEvent: UByte = 0u,
    public var sctpSenderDryEvent: UByte = 0u,
    public var sctpStreamResetEvent: UByte = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SctpEventSubscribe> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SctpEventSubscribe> {
                override val sizeBytes: Long = 11L
                override val alignBytes: Long = 1L
                override fun readNative(addr: Long): SctpEventSubscribe =
                    SctpEventSubscribe(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 1L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 2L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 3L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 5L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 6L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 7L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 9L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 10L),
                    )
                override fun writeNative(addr: Long, value: SctpEventSubscribe) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr, value.sctpDataIoEvent)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 1L, value.sctpAssociationEvent)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 2L, value.sctpAddressEvent)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 3L, value.sctpSendFailureEvent)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 4L, value.sctpPeerErrorEvent)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 5L, value.sctpShutdownEvent)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 6L, value.sctpPartialDeliveryEvent)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 7L, value.sctpAdaptationLayerEvent)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 8L, value.sctpAuthenticationEvent)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 9L, value.sctpSenderDryEvent)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 10L, value.sctpStreamResetEvent)
                }
            }
    }
}

public data class SctpInitmsg(
    public var sinitNumOstreams: UShort = 0u,
    public var sinitMaxInstreams: UShort = 0u,
    public var sinitMaxAttempts: UShort = 0u,
    public var sinitMaxInitTimeo: UShort = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SctpInitmsg> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SctpInitmsg> {
                override val sizeBytes: Long = 8L
                override val alignBytes: Long = 2L
                override fun readNative(addr: Long): SctpInitmsg =
                    SctpInitmsg(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 2L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 6L),
                    )
                override fun writeNative(addr: Long, value: SctpInitmsg) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.sinitNumOstreams)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 2L, value.sinitMaxInstreams)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 4L, value.sinitMaxAttempts)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 6L, value.sinitMaxInitTimeo)
                }
            }
    }
}

public data class SctpSndrcvinfo(
    public var sinfoStream: UShort = 0u,
    public var sinfoSsn: UShort = 0u,
    public var sinfoFlags: UShort = 0u,
    public var sinfoPpid: UInt = 0u,
    public var sinfoContext: UInt = 0u,
    public var sinfoTimetolive: UInt = 0u,
    public var sinfoTsn: UInt = 0u,
    public var sinfoCumtsn: UInt = 0u,
    public var sinfoAssocId: SctpAssocT = 0u,
    public var sinfoKeynumber: UShort = 0u,
    public var sinfoKeynumberValid: UShort = 0u,
    public var reservePad: List<UByteArray> = List(4) { UByteArray(0) },
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SctpSndrcvinfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SctpSndrcvinfo> {
                override val sizeBytes: Long = 128L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): SctpSndrcvinfo =
                    SctpSndrcvinfo(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 2L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 20L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 28L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 32L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 34L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(
                                    io.github.kotlinmania.rustlang.core.mem
                                        .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (23).toInt()),
                                    (4).toInt(),
                                )
                        ).readNative(addr + 36L),
                    )
                override fun writeNative(addr: Long, value: SctpSndrcvinfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.sinfoStream)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 2L, value.sinfoSsn)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 4L, value.sinfoFlags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.sinfoPpid)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.sinfoContext)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.sinfoTimetolive)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.sinfoTsn)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 24L, value.sinfoCumtsn)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 28L, value.sinfoAssocId)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 32L, value.sinfoKeynumber)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 34L, value.sinfoKeynumberValid)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(
                                io.github.kotlinmania.rustlang.core.mem
                                    .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (23).toInt()),
                                (4).toInt(),
                            )
                    ).writeNative(addr + 36L, value.reservePad)
                }
            }
    }
}

public class SctpExtrcvinfo(
    public var sinfoStream: UShort = 0u,
    public var sinfoSsn: UShort = 0u,
    public var sinfoFlags: UShort = 0u,
    public var sinfoPpid: UInt = 0u,
    public var sinfoContext: UInt = 0u,
    public var sinfoTimetolive: UInt = 0u,
    public var sinfoTsn: UInt = 0u,
    public var sinfoCumtsn: UInt = 0u,
    public var sinfoAssocId: SctpAssocT = 0u,
    public var serinfoNextFlags: UShort = 0u,
    public var serinfoNextStream: UShort = 0u,
    public var serinfoNextAid: UInt = 0u,
    public var serinfoNextLength: UInt = 0u,
    public var serinfoNextPpid: UInt = 0u,
    public var sinfoKeynumber: UShort = 0u,
    public var sinfoKeynumberValid: UShort = 0u,
    public var reservePad: List<UByteArray> = List(4) { UByteArray(0) },
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SctpExtrcvinfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SctpExtrcvinfo> {
                override val sizeBytes: Long = 128L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): SctpExtrcvinfo =
                    SctpExtrcvinfo(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 2L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 20L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 28L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 32L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 34L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 36L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 40L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 44L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 48L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 50L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(
                                    io.github.kotlinmania.rustlang.core.mem
                                        .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (19).toInt()),
                                    (4).toInt(),
                                )
                        ).readNative(addr + 52L),
                    )
                override fun writeNative(addr: Long, value: SctpExtrcvinfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.sinfoStream)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 2L, value.sinfoSsn)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 4L, value.sinfoFlags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.sinfoPpid)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.sinfoContext)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.sinfoTimetolive)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.sinfoTsn)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 24L, value.sinfoCumtsn)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 28L, value.sinfoAssocId)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 32L, value.serinfoNextFlags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 34L, value.serinfoNextStream)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 36L, value.serinfoNextAid)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 40L, value.serinfoNextLength)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 44L, value.serinfoNextPpid)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 48L, value.sinfoKeynumber)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 50L, value.sinfoKeynumberValid)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(
                                io.github.kotlinmania.rustlang.core.mem
                                    .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (19).toInt()),
                                (4).toInt(),
                            )
                    ).writeNative(addr + 52L, value.reservePad)
                }
            }
    }
}

public data class SctpSndinfo(
    public var sndSid: UShort = 0u,
    public var sndFlags: UShort = 0u,
    public var sndPpid: UInt = 0u,
    public var sndContext: UInt = 0u,
    public var sndAssocId: SctpAssocT = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SctpSndinfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SctpSndinfo> {
                override val sizeBytes: Long = 16L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): SctpSndinfo =
                    SctpSndinfo(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 2L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                    )
                override fun writeNative(addr: Long, value: SctpSndinfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.sndSid)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 2L, value.sndFlags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.sndPpid)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.sndContext)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.sndAssocId)
                }
            }
    }
}

public data class SctpPrinfo(
    public var prPolicy: UShort = 0u,
    public var prValue: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SctpPrinfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SctpPrinfo> {
                override val sizeBytes: Long = 8L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): SctpPrinfo =
                    SctpPrinfo(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: SctpPrinfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.prPolicy)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.prValue)
                }
            }
    }
}

public data class SctpDefaultPrinfo(
    public var prPolicy: UShort = 0u,
    public var prValue: UInt = 0u,
    public var prAssocId: SctpAssocT = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SctpDefaultPrinfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SctpDefaultPrinfo> {
                override val sizeBytes: Long = 12L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): SctpDefaultPrinfo =
                    SctpDefaultPrinfo(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: SctpDefaultPrinfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.prPolicy)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.prValue)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.prAssocId)
                }
            }
    }
}

public data class SctpAuthinfo(
    public var authKeynumber: UShort = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SctpAuthinfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SctpAuthinfo> {
                override val sizeBytes: Long = 2L
                override val alignBytes: Long = 2L
                override fun readNative(addr: Long): SctpAuthinfo =
                    SctpAuthinfo(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: SctpAuthinfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.authKeynumber)
                }
            }
    }
}

public data class SctpRcvinfo(
    public var rcvSid: UShort = 0u,
    public var rcvSsn: UShort = 0u,
    public var rcvFlags: UShort = 0u,
    public var rcvPpid: UInt = 0u,
    public var rcvTsn: UInt = 0u,
    public var rcvCumtsn: UInt = 0u,
    public var rcvContext: UInt = 0u,
    public var rcvAssocId: SctpAssocT = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SctpRcvinfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SctpRcvinfo> {
                override val sizeBytes: Long = 28L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): SctpRcvinfo =
                    SctpRcvinfo(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 2L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 20L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 24L),
                    )
                override fun writeNative(addr: Long, value: SctpRcvinfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.rcvSid)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 2L, value.rcvSsn)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 4L, value.rcvFlags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.rcvPpid)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.rcvTsn)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.rcvCumtsn)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.rcvContext)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 24L, value.rcvAssocId)
                }
            }
    }
}

public data class SctpNxtinfo(
    public var nxtSid: UShort = 0u,
    public var nxtFlags: UShort = 0u,
    public var nxtPpid: UInt = 0u,
    public var nxtLength: UInt = 0u,
    public var nxtAssocId: SctpAssocT = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SctpNxtinfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SctpNxtinfo> {
                override val sizeBytes: Long = 16L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): SctpNxtinfo =
                    SctpNxtinfo(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 2L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                    )
                override fun writeNative(addr: Long, value: SctpNxtinfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.nxtSid)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 2L, value.nxtFlags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.nxtPpid)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.nxtLength)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.nxtAssocId)
                }
            }
    }
}

public data class SctpRecvvRn(
    public var recvvRcvinfo: SctpRcvinfo = SctpRcvinfo(),
    public var recvvNxtinfo: SctpNxtinfo = SctpNxtinfo(),
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SctpRecvvRn> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SctpRecvvRn> {
                override val sizeBytes: Long = 44L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): SctpRecvvRn =
                    SctpRecvvRn(
                        (SctpRcvinfo.typeLayout()).readNative(addr),
                        (SctpNxtinfo.typeLayout()).readNative(addr + 28L),
                    )
                override fun writeNative(addr: Long, value: SctpRecvvRn) {
                    (SctpRcvinfo.typeLayout()).writeNative(addr, value.recvvRcvinfo)
                    (SctpNxtinfo.typeLayout()).writeNative(addr + 28L, value.recvvNxtinfo)
                }
            }
    }
}

public data class SctpSendvSpa(
    public var sendvFlags: UInt = 0u,
    public var sendvSndinfo: SctpSndinfo = SctpSndinfo(),
    public var sendvPrinfo: SctpPrinfo = SctpPrinfo(),
    public var sendvAuthinfo: SctpAuthinfo = SctpAuthinfo(),
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SctpSendvSpa> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SctpSendvSpa> {
                override val sizeBytes: Long = 32L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): SctpSendvSpa =
                    SctpSendvSpa(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (SctpSndinfo.typeLayout()).readNative(addr + 4L),
                        (SctpPrinfo.typeLayout()).readNative(addr + 20L),
                        (SctpAuthinfo.typeLayout()).readNative(addr + 28L),
                    )
                override fun writeNative(addr: Long, value: SctpSendvSpa) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.sendvFlags)
                    (SctpSndinfo.typeLayout()).writeNative(addr + 4L, value.sendvSndinfo)
                    (SctpPrinfo.typeLayout()).writeNative(addr + 20L, value.sendvPrinfo)
                    (SctpAuthinfo.typeLayout()).writeNative(addr + 28L, value.sendvAuthinfo)
                }
            }
    }
}

public data class SctpSndAllCompletes(
    public var sallStream: UShort = 0u,
    public var sallFlags: UShort = 0u,
    public var sallPpid: UInt = 0u,
    public var sallContext: UInt = 0u,
    public var sallNumSent: UInt = 0u,
    public var sallNumFailed: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SctpSndAllCompletes> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SctpSndAllCompletes> {
                override val sizeBytes: Long = 20L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): SctpSndAllCompletes =
                    SctpSndAllCompletes(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 2L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: SctpSndAllCompletes) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.sallStream)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 2L, value.sallFlags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.sallPpid)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.sallContext)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.sallNumSent)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.sallNumFailed)
                }
            }
    }
}

public data class SctpPcbinfo(
    public var epCount: UInt = 0u,
    public var asocCount: UInt = 0u,
    public var laddrCount: UInt = 0u,
    public var raddrCount: UInt = 0u,
    public var chkCount: UInt = 0u,
    public var readqCount: UInt = 0u,
    public var freeChunks: UInt = 0u,
    public var streamOque: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SctpPcbinfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SctpPcbinfo> {
                override val sizeBytes: Long = 32L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): SctpPcbinfo =
                    SctpPcbinfo(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 20L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 28L),
                    )
                override fun writeNative(addr: Long, value: SctpPcbinfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.epCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.asocCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.laddrCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.raddrCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.chkCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.readqCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 24L, value.freeChunks)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 28L, value.streamOque)
                }
            }
    }
}

public data class SctpSockstat(
    public var ssAssocId: SctpAssocT = 0u,
    public var ssTotalSndbuf: UInt = 0u,
    public var ssTotalRecvBuf: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SctpSockstat> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SctpSockstat> {
                override val sizeBytes: Long = 12L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): SctpSockstat =
                    SctpSockstat(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: SctpSockstat) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.ssAssocId)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.ssTotalSndbuf)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.ssTotalRecvBuf)
                }
            }
    }
}

public data class SctpAssocChange(
    public var sacType: UShort = 0u,
    public var sacFlags: UShort = 0u,
    public var sacLength: UInt = 0u,
    public var sacState: UShort = 0u,
    public var sacError: UShort = 0u,
    public var sacOutboundStreams: UShort = 0u,
    public var sacInboundStreams: UShort = 0u,
    public var sacAssocId: SctpAssocT = 0u,
    public var sacInfo: UByteArray = UByteArray(0),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SctpAssocChange) return false
        if (this.sacType != other.sacType) return false
        if (this.sacFlags != other.sacFlags) return false
        if (this.sacLength != other.sacLength) return false
        if (this.sacState != other.sacState) return false
        if (this.sacError != other.sacError) return false
        if (this.sacOutboundStreams != other.sacOutboundStreams) return false
        if (this.sacInboundStreams != other.sacInboundStreams) return false
        if (this.sacAssocId != other.sacAssocId) return false
        if (!this.sacInfo.contentEquals(other.sacInfo)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.sacType.hashCode()
        result = 31 * result + this.sacFlags.hashCode()
        result = 31 * result + this.sacLength.hashCode()
        result = 31 * result + this.sacState.hashCode()
        result = 31 * result + this.sacError.hashCode()
        result = 31 * result + this.sacOutboundStreams.hashCode()
        result = 31 * result + this.sacInboundStreams.hashCode()
        result = 31 * result + this.sacAssocId.hashCode()
        result = 31 * result + this.sacInfo.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SctpAssocChange> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SctpAssocChange> {
                override val sizeBytes: Long = 20L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): SctpAssocChange =
                    SctpAssocChange(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 2L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 10L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 14L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (0).toInt())
                        ).readNative(addr + 20L),
                    )
                override fun writeNative(addr: Long, value: SctpAssocChange) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.sacType)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 2L, value.sacFlags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.sacLength)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 8L, value.sacState)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 10L, value.sacError)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 12L, value.sacOutboundStreams)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 14L, value.sacInboundStreams)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.sacAssocId)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (0).toInt())
                    ).writeNative(addr + 20L, value.sacInfo)
                }
            }
    }
}

public data class SctpPaddrChange(
    public var spcType: UShort = 0u,
    public var spcFlags: UShort = 0u,
    public var spcLength: UInt = 0u,
    public var spcAaddr: SockaddrStorage = SockaddrStorage(),
    public var spcState: UInt = 0u,
    public var spcError: UInt = 0u,
    public var spcAssocId: SctpAssocT = 0u,
)

public data class SctpRemoteError(
    public var sreType: UShort = 0u,
    public var sreFlags: UShort = 0u,
    public var sreLength: UInt = 0u,
    public var sreError: UShort = 0u,
    public var sreAssocId: SctpAssocT = 0u,
    public var sreData: UByteArray = UByteArray(0),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SctpRemoteError) return false
        if (this.sreType != other.sreType) return false
        if (this.sreFlags != other.sreFlags) return false
        if (this.sreLength != other.sreLength) return false
        if (this.sreError != other.sreError) return false
        if (this.sreAssocId != other.sreAssocId) return false
        if (!this.sreData.contentEquals(other.sreData)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.sreType.hashCode()
        result = 31 * result + this.sreFlags.hashCode()
        result = 31 * result + this.sreLength.hashCode()
        result = 31 * result + this.sreError.hashCode()
        result = 31 * result + this.sreAssocId.hashCode()
        result = 31 * result + this.sreData.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SctpRemoteError> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SctpRemoteError> {
                override val sizeBytes: Long = 16L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): SctpRemoteError =
                    SctpRemoteError(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 2L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (0).toInt())
                        ).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: SctpRemoteError) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.sreType)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 2L, value.sreFlags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.sreLength)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 8L, value.sreError)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.sreAssocId)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (0).toInt())
                    ).writeNative(addr + 16L, value.sreData)
                }
            }
    }
}

public data class SctpSendFailedEvent(
    public var ssfeType: UShort = 0u,
    public var ssfeFlags: UShort = 0u,
    public var ssfeLength: UInt = 0u,
    public var ssfeError: UInt = 0u,
    public var ssfeInfo: SctpSndinfo = SctpSndinfo(),
    public var ssfeAssocId: SctpAssocT = 0u,
    public var ssfeData: UByteArray = UByteArray(0),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SctpSendFailedEvent) return false
        if (this.ssfeType != other.ssfeType) return false
        if (this.ssfeFlags != other.ssfeFlags) return false
        if (this.ssfeLength != other.ssfeLength) return false
        if (this.ssfeError != other.ssfeError) return false
        if (this.ssfeInfo != other.ssfeInfo) return false
        if (this.ssfeAssocId != other.ssfeAssocId) return false
        if (!this.ssfeData.contentEquals(other.ssfeData)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.ssfeType.hashCode()
        result = 31 * result + this.ssfeFlags.hashCode()
        result = 31 * result + this.ssfeLength.hashCode()
        result = 31 * result + this.ssfeError.hashCode()
        result = 31 * result + this.ssfeInfo.hashCode()
        result = 31 * result + this.ssfeAssocId.hashCode()
        result = 31 * result + this.ssfeData.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SctpSendFailedEvent> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SctpSendFailedEvent> {
                override val sizeBytes: Long = 32L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): SctpSendFailedEvent =
                    SctpSendFailedEvent(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 2L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (SctpSndinfo.typeLayout()).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 28L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (0).toInt())
                        ).readNative(addr + 32L),
                    )
                override fun writeNative(addr: Long, value: SctpSendFailedEvent) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.ssfeType)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 2L, value.ssfeFlags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.ssfeLength)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.ssfeError)
                    (SctpSndinfo.typeLayout()).writeNative(addr + 12L, value.ssfeInfo)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 28L, value.ssfeAssocId)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (0).toInt())
                    ).writeNative(addr + 32L, value.ssfeData)
                }
            }
    }
}

public data class SctpShutdownEvent(
    public var sseType: UShort = 0u,
    public var sseFlags: UShort = 0u,
    public var sseLength: UInt = 0u,
    public var sseAssocId: SctpAssocT = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SctpShutdownEvent> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SctpShutdownEvent> {
                override val sizeBytes: Long = 12L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): SctpShutdownEvent =
                    SctpShutdownEvent(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 2L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: SctpShutdownEvent) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.sseType)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 2L, value.sseFlags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.sseLength)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.sseAssocId)
                }
            }
    }
}

public data class SctpAdaptationEvent(
    public var saiType: UShort = 0u,
    public var saiFlags: UShort = 0u,
    public var saiLength: UInt = 0u,
    public var saiAdaptationInd: UInt = 0u,
    public var saiAssocId: SctpAssocT = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SctpAdaptationEvent> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SctpAdaptationEvent> {
                override val sizeBytes: Long = 16L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): SctpAdaptationEvent =
                    SctpAdaptationEvent(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 2L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                    )
                override fun writeNative(addr: Long, value: SctpAdaptationEvent) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.saiType)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 2L, value.saiFlags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.saiLength)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.saiAdaptationInd)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.saiAssocId)
                }
            }
    }
}

public data class SctpSetadaptation(
    public var ssbAdaptationInd: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SctpSetadaptation> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SctpSetadaptation> {
                override val sizeBytes: Long = 4L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): SctpSetadaptation =
                    SctpSetadaptation(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: SctpSetadaptation) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.ssbAdaptationInd)
                }
            }
    }
}

public data class SctpPdapiEvent(
    public var pdapiType: UShort = 0u,
    public var pdapiFlags: UShort = 0u,
    public var pdapiLength: UInt = 0u,
    public var pdapiIndication: UInt = 0u,
    public var pdapiStream: UShort = 0u,
    public var pdapiSeq: UShort = 0u,
    public var pdapiAssocId: SctpAssocT = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SctpPdapiEvent> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SctpPdapiEvent> {
                override val sizeBytes: Long = 20L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): SctpPdapiEvent =
                    SctpPdapiEvent(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 2L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 14L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: SctpPdapiEvent) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.pdapiType)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 2L, value.pdapiFlags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.pdapiLength)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.pdapiIndication)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 12L, value.pdapiStream)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 14L, value.pdapiSeq)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.pdapiAssocId)
                }
            }
    }
}

public data class SctpSenderDryEvent(
    public var senderDryType: UShort = 0u,
    public var senderDryFlags: UShort = 0u,
    public var senderDryLength: UInt = 0u,
    public var senderDryAssocId: SctpAssocT = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SctpSenderDryEvent> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SctpSenderDryEvent> {
                override val sizeBytes: Long = 12L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): SctpSenderDryEvent =
                    SctpSenderDryEvent(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 2L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: SctpSenderDryEvent) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.senderDryType)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 2L, value.senderDryFlags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.senderDryLength)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.senderDryAssocId)
                }
            }
    }
}

public data class SctpStreamResetEvent(
    public var strresetType: UShort = 0u,
    public var strresetFlags: UShort = 0u,
    public var strresetLength: UInt = 0u,
    public var strresetAssocId: SctpAssocT = 0u,
    public var strresetStreamList: UShortArray = UShortArray(0),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SctpStreamResetEvent) return false
        if (this.strresetType != other.strresetType) return false
        if (this.strresetFlags != other.strresetFlags) return false
        if (this.strresetLength != other.strresetLength) return false
        if (this.strresetAssocId != other.strresetAssocId) return false
        if (!this.strresetStreamList.contentEquals(other.strresetStreamList)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.strresetType.hashCode()
        result = 31 * result + this.strresetFlags.hashCode()
        result = 31 * result + this.strresetLength.hashCode()
        result = 31 * result + this.strresetAssocId.hashCode()
        result = 31 * result + this.strresetStreamList.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SctpStreamResetEvent> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SctpStreamResetEvent> {
                override val sizeBytes: Long = 12L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): SctpStreamResetEvent =
                    SctpStreamResetEvent(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 2L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (0).toInt())
                        ).readNative(addr + 12L),
                    )
                override fun writeNative(addr: Long, value: SctpStreamResetEvent) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.strresetType)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 2L, value.strresetFlags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.strresetLength)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.strresetAssocId)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (0).toInt())
                    ).writeNative(addr + 12L, value.strresetStreamList)
                }
            }
    }
}

public data class SctpStreamChangeEvent(
    public var strchangeType: UShort = 0u,
    public var strchangeFlags: UShort = 0u,
    public var strchangeLength: UInt = 0u,
    public var strchangeAssocId: SctpAssocT = 0u,
    public var strchangeInstrms: UShort = 0u,
    public var strchangeOutstrms: UShort = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SctpStreamChangeEvent> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SctpStreamChangeEvent> {
                override val sizeBytes: Long = 16L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): SctpStreamChangeEvent =
                    SctpStreamChangeEvent(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 2L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 14L),
                    )
                override fun writeNative(addr: Long, value: SctpStreamChangeEvent) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.strchangeType)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 2L, value.strchangeFlags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.strchangeLength)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.strchangeAssocId)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 12L, value.strchangeInstrms)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 14L, value.strchangeOutstrms)
                }
            }
    }
}

public class Filedesc internal constructor(
    fdFilesCtorArg: MutPtr<Fdescenttbl>,
    fdMapCtorArg: MutPtr<CUlong>,
    public var fdFreefile: CInt,
    public var fdRefcnt: CInt,
    public var fdHoldcnt: CInt,
    public var fdSx: Sx,
    public var fdKqlist: Kqlist,
    public var fdHoldleaderscount: CInt,
    public var fdHoldleaderswakeup: CInt,
) {
    public var fdFiles: MutPtr<Fdescenttbl> = fdFilesCtorArg
        internal set

    public var fdMap: MutPtr<CUlong> = fdMapCtorArg
        internal set

    public constructor() : this(
        fdFilesCtorArg = MutPtr(0L),
        fdMapCtorArg = MutPtr(0L),
        fdFreefile = 0,
        fdRefcnt = 0,
        fdHoldcnt = 0,
        fdSx = Sx(),
        fdKqlist = Kqlist(),
        fdHoldleaderscount = 0,
        fdHoldleaderswakeup = 0,
    )

    public operator fun component1(): MutPtr<Fdescenttbl> = this.fdFiles

    public operator fun component2(): MutPtr<CUlong> = this.fdMap

    public operator fun component3(): CInt = this.fdFreefile

    public operator fun component4(): CInt = this.fdRefcnt

    public operator fun component5(): CInt = this.fdHoldcnt

    public operator fun component6(): Sx = this.fdSx

    public operator fun component7(): Kqlist = this.fdKqlist

    public operator fun component8(): CInt = this.fdHoldleaderscount

    public operator fun component9(): CInt = this.fdHoldleaderswakeup

    public fun copy(fdFiles: MutPtr<Fdescenttbl> = this.fdFiles, fdMap: MutPtr<CUlong> = this.fdMap, fdFreefile: CInt = this.fdFreefile, fdRefcnt: CInt = this.fdRefcnt, fdHoldcnt: CInt = this.fdHoldcnt, fdSx: Sx = this.fdSx, fdKqlist: Kqlist = this.fdKqlist, fdHoldleaderscount: CInt = this.fdHoldleaderscount, fdHoldleaderswakeup: CInt = this.fdHoldleaderswakeup): Filedesc = Filedesc(fdFilesCtorArg = fdFiles, fdMapCtorArg = fdMap, fdFreefile = fdFreefile, fdRefcnt = fdRefcnt, fdHoldcnt = fdHoldcnt, fdSx = fdSx, fdKqlist = fdKqlist, fdHoldleaderscount = fdHoldleaderscount, fdHoldleaderswakeup = fdHoldleaderswakeup)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Filedesc) return false
        if (this.fdFiles != other.fdFiles) return false
        if (this.fdMap != other.fdMap) return false
        if (this.fdFreefile != other.fdFreefile) return false
        if (this.fdRefcnt != other.fdRefcnt) return false
        if (this.fdHoldcnt != other.fdHoldcnt) return false
        if (this.fdSx != other.fdSx) return false
        if (this.fdKqlist != other.fdKqlist) return false
        if (this.fdHoldleaderscount != other.fdHoldleaderscount) return false
        if (this.fdHoldleaderswakeup != other.fdHoldleaderswakeup) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.fdFiles.hashCode()
        result = 31 * result + this.fdMap.hashCode()
        result = 31 * result + this.fdFreefile.hashCode()
        result = 31 * result + this.fdRefcnt.hashCode()
        result = 31 * result + this.fdHoldcnt.hashCode()
        result = 31 * result + this.fdSx.hashCode()
        result = 31 * result + this.fdKqlist.hashCode()
        result = 31 * result + this.fdHoldleaderscount.hashCode()
        result = 31 * result + this.fdHoldleaderswakeup.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Filedesc> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Filedesc> {
                override val sizeBytes: Long = 88L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): Filedesc =
                    Filedesc(
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<Fdescenttbl>(64)
                        ).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CUlong>(64)
                        ).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 20L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 24L),
                        (Sx.typeLayout()).readNative(addr + 32L),
                        (Kqlist.typeLayout()).readNative(addr + 64L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 80L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 84L),
                    )
                override fun writeNative(addr: Long, value: Filedesc) {
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<Fdescenttbl>(64)
                    ).writeNative(addr, value.fdFiles)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CUlong>(64)
                    ).writeNative(addr + 8L, value.fdMap)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 16L, value.fdFreefile)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 20L, value.fdRefcnt)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 24L, value.fdHoldcnt)
                    (Sx.typeLayout()).writeNative(addr + 32L, value.fdSx)
                    (Kqlist.typeLayout()).writeNative(addr + 64L, value.fdKqlist)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 80L, value.fdHoldleaderscount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 84L, value.fdHoldleaderswakeup)
                }
            }

        public operator fun invoke(
            fdFiles: MutPtr<Fdescenttbl> = MutPtr(0L),
            fdMap: MutPtr<CUlong> = MutPtr(0L),
            fdFreefile: CInt = 0,
            fdRefcnt: CInt = 0,
            fdHoldcnt: CInt = 0,
            fdSx: Sx = Sx(),
            fdKqlist: Kqlist = Kqlist(),
            fdHoldleaderscount: CInt = 0,
            fdHoldleaderswakeup: CInt = 0,
        ): Filedesc =
            Filedesc(
                fdFilesCtorArg = fdFiles,
                fdMapCtorArg = fdMap,
                fdFreefile = fdFreefile,
                fdRefcnt = fdRefcnt,
                fdHoldcnt = fdHoldcnt,
                fdSx = fdSx,
                fdKqlist = fdKqlist,
                fdHoldleaderscount = fdHoldleaderscount,
                fdHoldleaderswakeup = fdHoldleaderswakeup,
            )
    }
}

public class Fdescenttbl internal constructor(
    public var fdtNfiles: CInt,
    fdtOfilesCtorArg: List<MutPtr<CVoid>>,
) {
    public var fdtOfiles: List<MutPtr<CVoid>> = fdtOfilesCtorArg
        internal set

    public constructor() : this(
        fdtNfiles = 0,
        fdtOfilesCtorArg = List(0) { MutPtr(0L) },
    )

    public operator fun component1(): CInt = this.fdtNfiles

    public operator fun component2(): List<MutPtr<CVoid>> = this.fdtOfiles

    public fun copy(fdtNfiles: CInt = this.fdtNfiles, fdtOfiles: List<MutPtr<CVoid>> = this.fdtOfiles): Fdescenttbl = Fdescenttbl(fdtNfiles = fdtNfiles, fdtOfilesCtorArg = fdtOfiles)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Fdescenttbl) return false
        if (this.fdtNfiles != other.fdtNfiles) return false
        if (this.fdtOfiles != other.fdtOfiles) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.fdtNfiles.hashCode()
        result = 31 * result + this.fdtOfiles.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Fdescenttbl> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Fdescenttbl> {
                override val sizeBytes: Long = 8L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): Fdescenttbl =
                    Fdescenttbl(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(
                                    io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                        .mutPtrLayout<CVoid>(64),
                                    (0).toInt(),
                                )
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: Fdescenttbl) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.fdtNfiles)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(
                                io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                    .mutPtrLayout<CVoid>(64),
                                (0).toInt(),
                            )
                    ).writeNative(addr + 8L, value.fdtOfiles)
                }
            }

        public operator fun invoke(
            fdtNfiles: CInt = 0,
            fdtOfiles: List<MutPtr<CVoid>> = List(0) { MutPtr(0L) },
        ): Fdescenttbl =
            Fdescenttbl(
                fdtNfiles = fdtNfiles,
                fdtOfilesCtorArg = fdtOfiles,
            )
    }
}

public data class Sx(
    public var lockObject: LockObject = LockObject(),
    public var sxLock: UintptrT = 0uL,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Sx> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Sx> {
                override val sizeBytes: Long = 32L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): Sx =
                    Sx(
                        (LockObject.typeLayout()).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).readNative(addr + 24L),
                    )
                override fun writeNative(addr: Long, value: Sx) {
                    (LockObject.typeLayout()).writeNative(addr, value.lockObject)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).writeNative(addr + 24L, value.sxLock)
                }
            }
    }
}

public class LockObject internal constructor(
    loNameCtorArg: ConstPtr<CChar>,
    public var loFlags: CUint,
    public var loData: CUint,
    loWitnessCtorArg: MutPtr<CVoid>,
) {
    public var loName: ConstPtr<CChar> = loNameCtorArg
        internal set

    // This is normally `class witness`.
    public var loWitness: MutPtr<CVoid> = loWitnessCtorArg
        internal set

    public constructor() : this(
        loNameCtorArg = ConstPtr(0L),
        loFlags = 0u,
        loData = 0u,
        loWitnessCtorArg = MutPtr(0L),
    )

    public operator fun component1(): ConstPtr<CChar> = this.loName

    public operator fun component2(): CUint = this.loFlags

    public operator fun component3(): CUint = this.loData

    public operator fun component4(): MutPtr<CVoid> = this.loWitness

    public fun copy(loName: ConstPtr<CChar> = this.loName, loFlags: CUint = this.loFlags, loData: CUint = this.loData, loWitness: MutPtr<CVoid> = this.loWitness): LockObject = LockObject(loNameCtorArg = loName, loFlags = loFlags, loData = loData, loWitnessCtorArg = loWitness)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is LockObject) return false
        if (this.loName != other.loName) return false
        if (this.loFlags != other.loFlags) return false
        if (this.loData != other.loData) return false
        if (this.loWitness != other.loWitness) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.loName.hashCode()
        result = 31 * result + this.loFlags.hashCode()
        result = 31 * result + this.loData.hashCode()
        result = 31 * result + this.loWitness.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<LockObject> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<LockObject> {
                override val sizeBytes: Long = 24L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): LockObject =
                    LockObject(
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .constPtrLayout<CChar>(64)
                        ).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CVoid>(64)
                        ).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: LockObject) {
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .constPtrLayout<CChar>(64)
                    ).writeNative(addr, value.loName)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.loFlags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.loData)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr + 16L, value.loWitness)
                }
            }

        public operator fun invoke(
            loName: ConstPtr<CChar> = ConstPtr(0L),
            loFlags: CUint = 0u,
            loData: CUint = 0u,
            loWitness: MutPtr<CVoid> = MutPtr(0L),
        ): LockObject =
            LockObject(
                loNameCtorArg = loName,
                loFlags = loFlags,
                loData = loData,
                loWitnessCtorArg = loWitness,
            )
    }
}

public class Kqlist internal constructor(
    tqhFirstCtorArg: MutPtr<CVoid>,
    tqhLastCtorArg: MutPtr<MutPtr<CVoid>>,
) {
    public var tqhFirst: MutPtr<CVoid> = tqhFirstCtorArg
        internal set

    public var tqhLast: MutPtr<MutPtr<CVoid>> = tqhLastCtorArg
        internal set

    public constructor() : this(
        tqhFirstCtorArg = MutPtr(0L),
        tqhLastCtorArg = MutPtr(0L),
    )

    public operator fun component1(): MutPtr<CVoid> = this.tqhFirst

    public operator fun component2(): MutPtr<MutPtr<CVoid>> = this.tqhLast

    public fun copy(tqhFirst: MutPtr<CVoid> = this.tqhFirst, tqhLast: MutPtr<MutPtr<CVoid>> = this.tqhLast): Kqlist = Kqlist(tqhFirstCtorArg = tqhFirst, tqhLastCtorArg = tqhLast)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Kqlist) return false
        if (this.tqhFirst != other.tqhFirst) return false
        if (this.tqhLast != other.tqhLast) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.tqhFirst.hashCode()
        result = 31 * result + this.tqhLast.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Kqlist> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Kqlist> {
                override val sizeBytes: Long = 16L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): Kqlist =
                    Kqlist(
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CVoid>(64)
                        ).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<MutPtr<CVoid>>(64)
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: Kqlist) {
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr, value.tqhFirst)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<MutPtr<CVoid>>(64)
                    ).writeNative(addr + 8L, value.tqhLast)
                }
            }

        public operator fun invoke(
            tqhFirst: MutPtr<CVoid> = MutPtr(0L),
            tqhLast: MutPtr<MutPtr<CVoid>> = MutPtr(0L),
        ): Kqlist =
            Kqlist(
                tqhFirstCtorArg = tqhFirst,
                tqhLastCtorArg = tqhLast,
            )
    }
}

public data class Splice(
    public var spFd: CInt = 0,
    public var spMax: OffT = 0L,
    public var spIdle: Timeval = Timeval(),
)

public data class Utmpx(
    public var utType: CShort = 0,
    public var utTv: Timeval = Timeval(),
    public var utId: UByteArray = UByteArray(8),
    public var utPid: PidT = 0,
    public var utUser: UByteArray = UByteArray(32),
    public var utLine: UByteArray = UByteArray(16),
    public var utHost: UByteArray = UByteArray(128),
    public var utSpare: UByteArray = UByteArray(64),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Utmpx) return false
        if (this.utType != other.utType) return false
        if (this.utTv != other.utTv) return false
        if (!this.utId.contentEquals(other.utId)) return false
        if (this.utPid != other.utPid) return false
        if (!this.utUser.contentEquals(other.utUser)) return false
        if (!this.utLine.contentEquals(other.utLine)) return false
        if (!this.utHost.contentEquals(other.utHost)) return false
        if (!this.utSpare.contentEquals(other.utSpare)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.utType.hashCode()
        result = 31 * result + this.utTv.hashCode()
        result = 31 * result + this.utId.contentHashCode()
        result = 31 * result + this.utPid.hashCode()
        result = 31 * result + this.utUser.contentHashCode()
        result = 31 * result + this.utLine.contentHashCode()
        result = 31 * result + this.utHost.contentHashCode()
        result = 31 * result + this.utSpare.contentHashCode()
        return result
    }
}

public data class Xucred(
    public var crVersion: CUint = 0u,
    public var crUid: UidT = 0u,
    public var crNgroups: CShort = 0,
    public var crGroups: UShortArray = UShortArray(16),
    public var crPidCAnonymousUnion: CAnonymousCrPid = CAnonymousCrPid(),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Xucred) return false
        if (this.crVersion != other.crVersion) return false
        if (this.crUid != other.crUid) return false
        if (this.crNgroups != other.crNgroups) return false
        if (!this.crGroups.contentEquals(other.crGroups)) return false
        if (this.crPidCAnonymousUnion != other.crPidCAnonymousUnion) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.crVersion.hashCode()
        result = 31 * result + this.crUid.hashCode()
        result = 31 * result + this.crNgroups.hashCode()
        result = 31 * result + this.crGroups.contentHashCode()
        result = 31 * result + this.crPidCAnonymousUnion.hashCode()
        return result
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
    public var sdlData: UByteArray = UByteArray(46),
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
                override val sizeBytes: Long = 54L
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
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (46).toInt())
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
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (46).toInt())
                    ).writeNative(addr + 8L, value.sdlData)
                }
            }
    }
}

public data class MqAttr(
    public var mqFlags: CLong = 0L,
    public var mqMaxmsg: CLong = 0L,
    public var mqMsgsize: CLong = 0L,
    public var mqCurmsgs: CLong = 0L,
    public var reserved: LongArray = LongArray(4),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is MqAttr) return false
        if (this.mqFlags != other.mqFlags) return false
        if (this.mqMaxmsg != other.mqMaxmsg) return false
        if (this.mqMsgsize != other.mqMsgsize) return false
        if (this.mqCurmsgs != other.mqCurmsgs) return false
        if (!this.reserved.contentEquals(other.reserved)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.mqFlags.hashCode()
        result = 31 * result + this.mqMaxmsg.hashCode()
        result = 31 * result + this.mqMsgsize.hashCode()
        result = 31 * result + this.mqCurmsgs.hashCode()
        result = 31 * result + this.reserved.contentHashCode()
        return result
    }
}

public data class Ptsstat(
    public var dev: ULong = 0uL,
    public var devname: UByteArray = UByteArray(SPECNAMELEN + 1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Ptsstat) return false
        if (this.dev != other.dev) return false
        if (!this.devname.contentEquals(other.devname)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dev.hashCode()
        result = 31 * result + this.devname.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Ptsstat> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Ptsstat> {
                override val sizeBytes: Long =
                    io.github.kotlinmania.rustlang.core.mem
                        .alignUpBytes(
                            (
                                io.github.kotlinmania.rustlang.core.mem
                                    .alignUpBytes(12L, 1L) + ((SPECNAMELEN + 1).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8).strideBytes)
                            ),
                            maxOf(maxOf(8L, 4L), 1L),
                        )
                override val alignBytes: Long = maxOf(maxOf(8L, 4L), 1L)
                override fun readNative(addr: Long): Ptsstat =
                    Ptsstat(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (SPECNAMELEN + 1).toInt())
                        ).readNative(
                            addr +
                                io.github.kotlinmania.rustlang.core.mem
                                    .alignUpBytes(12L, 1L),
                        ),
                    )
                override fun writeNative(addr: Long, value: Ptsstat) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr, value.dev)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.dev)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (SPECNAMELEN + 1).toInt())
                    ).writeNative(
                        addr +
                            io.github.kotlinmania.rustlang.core.mem
                                .alignUpBytes(12L, 1L),
                        value.devname,
                    )
                }
            }
    }
}

public data class Elf32Auxinfo(
    public var aType: CInt = 0,
    public var aUn: CAnonymousElf32AuxvUnion = CAnonymousElf32AuxvUnion(),
)

public data class Ifreq(
    /**
     * if name, e.g. "en0"
     */
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

public class IfData(
    /**
     * ethernet, tokenring, etc
     */
    public var ifiType: UByte = 0u,
    /**
     * e.g., AUI, Thinnet, 10base-T, etc
     */
    public var ifiPhysical: UByte = 0u,
    /**
     * media address length
     */
    public var ifiAddrlen: UByte = 0u,
    /**
     * media header length
     */
    public var ifiHdrlen: UByte = 0u,
    /**
     * current link state
     */
    public var ifiLinkState: UByte = 0u,
    /**
     * carp vhid
     */
    public var ifiVhid: UByte = 0u,
    /**
     * length of this data struct
     */
    public var ifiDatalen: UShort = 0u,
    /**
     * maximum transmission unit
     */
    public var ifiMtu: UInt = 0u,
    /**
     * routing metric (external only)
     */
    public var ifiMetric: UInt = 0u,
    /**
     * linespeed
     */
    public var ifiBaudrate: ULong = 0uL,
    /**
     * packets received on interface
     */
    public var ifiIpackets: ULong = 0uL,
    /**
     * input errors on interface
     */
    public var ifiIerrors: ULong = 0uL,
    /**
     * packets sent on interface
     */
    public var ifiOpackets: ULong = 0uL,
    /**
     * output errors on interface
     */
    public var ifiOerrors: ULong = 0uL,
    /**
     * collisions on csma interfaces
     */
    public var ifiCollisions: ULong = 0uL,
    /**
     * total number of octets received
     */
    public var ifiIbytes: ULong = 0uL,
    /**
     * total number of octets sent
     */
    public var ifiObytes: ULong = 0uL,
    /**
     * packets received via multicast
     */
    public var ifiImcasts: ULong = 0uL,
    /**
     * packets sent via multicast
     */
    public var ifiOmcasts: ULong = 0uL,
    /**
     * dropped on input
     */
    public var ifiIqdrops: ULong = 0uL,
    /**
     * dropped on output
     */
    public var ifiOqdrops: ULong = 0uL,
    /**
     * destined for unsupported protocol
     */
    public var ifiNoproto: ULong = 0uL,
    /**
     * HW offload capabilities, see IFCAP
     */
    public var ifiHwassist: ULong = 0uL,
    /**
     * uptime at attach or stat reset
     */
    public var ifiEpoch: CAnonymousIfiEpoch = CAnonymousIfiEpoch(),
    /**
     * time of last administrative change
     */
    public var ifiLastchange: CAnonymousIfiLastchange = CAnonymousIfiLastchange(),
)

public data class Ifstat(
    /**
     * if name, e.g. "en0"
     */
    public var ifsName: UByteArray = UByteArray(IFNAMSIZ.toInt()),
    public var ascii: UByteArray = UByteArray(IFSTATMAX + 1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Ifstat) return false
        if (!this.ifsName.contentEquals(other.ifsName)) return false
        if (!this.ascii.contentEquals(other.ascii)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.ifsName.contentHashCode()
        result = 31 * result + this.ascii.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Ifstat> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Ifstat> {
                override val sizeBytes: Long =
                    io.github.kotlinmania.rustlang.core.mem
                        .alignUpBytes(
                            (
                                io.github.kotlinmania.rustlang.core.mem
                                    .alignUpBytes(((IFNAMSIZ.toInt()).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8).strideBytes), 1L) + ((IFSTATMAX + 1).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8).strideBytes)
                            ),
                            1L,
                        )
                override val alignBytes: Long = 1L
                override fun readNative(addr: Long): Ifstat =
                    Ifstat(
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (IFNAMSIZ.toInt()).toInt())
                        ).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (IFSTATMAX + 1).toInt())
                        ).readNative(
                            addr +
                                io.github.kotlinmania.rustlang.core.mem
                                    .alignUpBytes(((IFNAMSIZ.toInt()).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8).strideBytes), 1L),
                        ),
                    )
                override fun writeNative(addr: Long, value: Ifstat) {
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (IFNAMSIZ.toInt()).toInt())
                    ).writeNative(addr, value.ifsName)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (IFSTATMAX + 1).toInt())
                    ).writeNative(
                        addr +
                            io.github.kotlinmania.rustlang.core.mem
                                .alignUpBytes(((IFNAMSIZ.toInt()).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8).strideBytes), 1L),
                        value.ascii,
                    )
                }
            }
    }
}

public data class Ifrsskey(
    /**
     * if name, e.g. "en0"
     */
    public var ifrkName: UByteArray = UByteArray(IFNAMSIZ.toInt()),
    /**
     * RSS_FUNC_
     */
    public var ifrkFunc: UByte = 0u,
    public var ifrkSpare0: UByte = 0u,
    public var ifrkKeylen: UShort = 0u,
    public var ifrkKey: UByteArray = UByteArray(RSS_KEYLEN),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Ifrsskey) return false
        if (!this.ifrkName.contentEquals(other.ifrkName)) return false
        if (this.ifrkFunc != other.ifrkFunc) return false
        if (this.ifrkSpare0 != other.ifrkSpare0) return false
        if (this.ifrkKeylen != other.ifrkKeylen) return false
        if (!this.ifrkKey.contentEquals(other.ifrkKey)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.ifrkName.contentHashCode()
        result = 31 * result + this.ifrkFunc.hashCode()
        result = 31 * result + this.ifrkSpare0.hashCode()
        result = 31 * result + this.ifrkKeylen.hashCode()
        result = 31 * result + this.ifrkKey.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Ifrsskey> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Ifrsskey> {
                override val sizeBytes: Long =
                    io.github.kotlinmania.rustlang.core.mem
                        .alignUpBytes(
                            (
                                io.github.kotlinmania.rustlang.core.mem
                                    .alignUpBytes(
                                        (
                                            io.github.kotlinmania.rustlang.core.mem
                                                .alignUpBytes(
                                                    (
                                                        io.github.kotlinmania.rustlang.core.mem
                                                            .alignUpBytes(
                                                                (
                                                                    io.github.kotlinmania.rustlang.core.mem
                                                                        .alignUpBytes(((IFNAMSIZ.toInt()).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8).strideBytes), 1L) + 1L
                                                                ),
                                                                1L,
                                                            ) + 1L
                                                    ),
                                                    2L,
                                                ) + 2L
                                        ),
                                        1L,
                                    ) + ((RSS_KEYLEN).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).strideBytes)
                            ),
                            maxOf(1L, 2L),
                        )
                override val alignBytes: Long = maxOf(1L, 2L)
                override fun readNative(addr: Long): Ifrsskey =
                    Ifrsskey(
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (IFNAMSIZ.toInt()).toInt())
                        ).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(
                            addr +
                                io.github.kotlinmania.rustlang.core.mem
                                    .alignUpBytes(((IFNAMSIZ.toInt()).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8).strideBytes), 1L),
                        ),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(
                            addr +
                                io.github.kotlinmania.rustlang.core.mem
                                    .alignUpBytes(
                                        (
                                            io.github.kotlinmania.rustlang.core.mem
                                                .alignUpBytes(((IFNAMSIZ.toInt()).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8).strideBytes), 1L) + 1L
                                        ),
                                        1L,
                                    ),
                        ),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(
                            addr +
                                io.github.kotlinmania.rustlang.core.mem
                                    .alignUpBytes(
                                        (
                                            io.github.kotlinmania.rustlang.core.mem
                                                .alignUpBytes(
                                                    (
                                                        io.github.kotlinmania.rustlang.core.mem
                                                            .alignUpBytes(((IFNAMSIZ.toInt()).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8).strideBytes), 1L) + 1L
                                                    ),
                                                    1L,
                                                ) + 1L
                                        ),
                                        2L,
                                    ),
                        ),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (RSS_KEYLEN).toInt())
                        ).readNative(
                            addr +
                                io.github.kotlinmania.rustlang.core.mem
                                    .alignUpBytes(
                                        (
                                            io.github.kotlinmania.rustlang.core.mem
                                                .alignUpBytes(
                                                    (
                                                        io.github.kotlinmania.rustlang.core.mem
                                                            .alignUpBytes(
                                                                (
                                                                    io.github.kotlinmania.rustlang.core.mem
                                                                        .alignUpBytes(((IFNAMSIZ.toInt()).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8).strideBytes), 1L) + 1L
                                                                ),
                                                                1L,
                                                            ) + 1L
                                                    ),
                                                    2L,
                                                ) + 2L
                                        ),
                                        1L,
                                    ),
                        ),
                    )
                override fun writeNative(addr: Long, value: Ifrsskey) {
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (IFNAMSIZ.toInt()).toInt())
                    ).writeNative(addr, value.ifrkName)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(
                        addr +
                            io.github.kotlinmania.rustlang.core.mem
                                .alignUpBytes(((IFNAMSIZ.toInt()).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8).strideBytes), 1L),
                        value.ifrkFunc,
                    )
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(
                        addr +
                            io.github.kotlinmania.rustlang.core.mem
                                .alignUpBytes(
                                    (
                                        io.github.kotlinmania.rustlang.core.mem
                                            .alignUpBytes(((IFNAMSIZ.toInt()).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8).strideBytes), 1L) + 1L
                                    ),
                                    1L,
                                ),
                        value.ifrkSpare0,
                    )
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(
                        addr +
                            io.github.kotlinmania.rustlang.core.mem
                                .alignUpBytes(
                                    (
                                        io.github.kotlinmania.rustlang.core.mem
                                            .alignUpBytes(
                                                (
                                                    io.github.kotlinmania.rustlang.core.mem
                                                        .alignUpBytes(((IFNAMSIZ.toInt()).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8).strideBytes), 1L) + 1L
                                                ),
                                                1L,
                                            ) + 1L
                                    ),
                                    2L,
                                ),
                        value.ifrkKeylen,
                    )
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (RSS_KEYLEN).toInt())
                    ).writeNative(
                        addr +
                            io.github.kotlinmania.rustlang.core.mem
                                .alignUpBytes(
                                    (
                                        io.github.kotlinmania.rustlang.core.mem
                                            .alignUpBytes(
                                                (
                                                    io.github.kotlinmania.rustlang.core.mem
                                                        .alignUpBytes(
                                                            (
                                                                io.github.kotlinmania.rustlang.core.mem
                                                                    .alignUpBytes(((IFNAMSIZ.toInt()).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8).strideBytes), 1L) + 1L
                                                            ),
                                                            1L,
                                                        ) + 1L
                                                ),
                                                2L,
                                            ) + 2L
                                    ),
                                    1L,
                                ),
                        value.ifrkKey,
                    )
                }
            }
    }
}

public data class Ifdownreason(
    public var ifdrName: UByteArray = UByteArray(IFNAMSIZ.toInt()),
    public var ifdrReason: UInt = 0u,
    public var ifdrVendor: UInt = 0u,
    public var ifdrMsg: UByteArray = UByteArray(IFDR_MSG_SIZE),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Ifdownreason) return false
        if (!this.ifdrName.contentEquals(other.ifdrName)) return false
        if (this.ifdrReason != other.ifdrReason) return false
        if (this.ifdrVendor != other.ifdrVendor) return false
        if (!this.ifdrMsg.contentEquals(other.ifdrMsg)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.ifdrName.contentHashCode()
        result = 31 * result + this.ifdrReason.hashCode()
        result = 31 * result + this.ifdrVendor.hashCode()
        result = 31 * result + this.ifdrMsg.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Ifdownreason> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Ifdownreason> {
                override val sizeBytes: Long =
                    io.github.kotlinmania.rustlang.core.mem
                        .alignUpBytes(
                            (
                                io.github.kotlinmania.rustlang.core.mem
                                    .alignUpBytes(
                                        (
                                            io.github.kotlinmania.rustlang.core.mem
                                                .alignUpBytes(
                                                    (
                                                        io.github.kotlinmania.rustlang.core.mem
                                                            .alignUpBytes(((IFNAMSIZ.toInt()).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8).strideBytes), 4L) + 4L
                                                    ),
                                                    4L,
                                                ) + 4L
                                        ),
                                        1L,
                                    ) + ((IFDR_MSG_SIZE).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8).strideBytes)
                            ),
                            maxOf(1L, 4L),
                        )
                override val alignBytes: Long = maxOf(1L, 4L)
                override fun readNative(addr: Long): Ifdownreason =
                    Ifdownreason(
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (IFNAMSIZ.toInt()).toInt())
                        ).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(
                            addr +
                                io.github.kotlinmania.rustlang.core.mem
                                    .alignUpBytes(((IFNAMSIZ.toInt()).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8).strideBytes), 4L),
                        ),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(
                            addr +
                                io.github.kotlinmania.rustlang.core.mem
                                    .alignUpBytes(
                                        (
                                            io.github.kotlinmania.rustlang.core.mem
                                                .alignUpBytes(((IFNAMSIZ.toInt()).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8).strideBytes), 4L) + 4L
                                        ),
                                        4L,
                                    ),
                        ),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (IFDR_MSG_SIZE).toInt())
                        ).readNative(
                            addr +
                                io.github.kotlinmania.rustlang.core.mem
                                    .alignUpBytes(
                                        (
                                            io.github.kotlinmania.rustlang.core.mem
                                                .alignUpBytes(
                                                    (
                                                        io.github.kotlinmania.rustlang.core.mem
                                                            .alignUpBytes(((IFNAMSIZ.toInt()).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8).strideBytes), 4L) + 4L
                                                    ),
                                                    4L,
                                                ) + 4L
                                        ),
                                        1L,
                                    ),
                        ),
                    )
                override fun writeNative(addr: Long, value: Ifdownreason) {
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (IFNAMSIZ.toInt()).toInt())
                    ).writeNative(addr, value.ifdrName)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(
                        addr +
                            io.github.kotlinmania.rustlang.core.mem
                                .alignUpBytes(((IFNAMSIZ.toInt()).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8).strideBytes), 4L),
                        value.ifdrReason,
                    )
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(
                        addr +
                            io.github.kotlinmania.rustlang.core.mem
                                .alignUpBytes(
                                    (
                                        io.github.kotlinmania.rustlang.core.mem
                                            .alignUpBytes(((IFNAMSIZ.toInt()).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8).strideBytes), 4L) + 4L
                                    ),
                                    4L,
                                ),
                        value.ifdrVendor,
                    )
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (IFDR_MSG_SIZE).toInt())
                    ).writeNative(
                        addr +
                            io.github.kotlinmania.rustlang.core.mem
                                .alignUpBytes(
                                    (
                                        io.github.kotlinmania.rustlang.core.mem
                                            .alignUpBytes(
                                                (
                                                    io.github.kotlinmania.rustlang.core.mem
                                                        .alignUpBytes(((IFNAMSIZ.toInt()).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8).strideBytes), 4L) + 4L
                                                ),
                                                4L,
                                            ) + 4L
                                    ),
                                    1L,
                                ),
                        value.ifdrMsg,
                    )
                }
            }
    }
}

public data class Sctphdr(
    public var srcPort: UShort = 0u,
    public var destPort: UShort = 0u,
    public var vTag: UInt = 0u,
    public var checksum: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Sctphdr> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Sctphdr> {
                override val sizeBytes: Long = 12L
                override val alignBytes: Long = 1L
                override fun readNative(addr: Long): Sctphdr =
                    Sctphdr(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 2L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: Sctphdr) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.srcPort)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 2L, value.destPort)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.vTag)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.checksum)
                }
            }
    }
}

public data class SctpChunkhdr(
    public var chunkType: UByte = 0u,
    public var chunkFlags: UByte = 0u,
    public var chunkLength: UShort = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SctpChunkhdr> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SctpChunkhdr> {
                override val sizeBytes: Long = 4L
                override val alignBytes: Long = 1L
                override fun readNative(addr: Long): SctpChunkhdr =
                    SctpChunkhdr(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 1L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 2L),
                    )
                override fun writeNative(addr: Long, value: SctpChunkhdr) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr, value.chunkType)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 1L, value.chunkFlags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 2L, value.chunkLength)
                }
            }
    }
}

public data class SctpParamhdr(
    public var paramType: UShort = 0u,
    public var paramLength: UShort = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SctpParamhdr> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SctpParamhdr> {
                override val sizeBytes: Long = 4L
                override val alignBytes: Long = 1L
                override fun readNative(addr: Long): SctpParamhdr =
                    SctpParamhdr(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 2L),
                    )
                override fun writeNative(addr: Long, value: SctpParamhdr) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.paramType)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 2L, value.paramLength)
                }
            }
    }
}

public data class SctpGenErrorCause(
    public var code: UShort = 0u,
    public var length: UShort = 0u,
    public var info: UByteArray = UByteArray(0),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SctpGenErrorCause) return false
        if (this.code != other.code) return false
        if (this.length != other.length) return false
        if (!this.info.contentEquals(other.info)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.code.hashCode()
        result = 31 * result + this.length.hashCode()
        result = 31 * result + this.info.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SctpGenErrorCause> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SctpGenErrorCause> {
                override val sizeBytes: Long = 4L
                override val alignBytes: Long = 1L
                override fun readNative(addr: Long): SctpGenErrorCause =
                    SctpGenErrorCause(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 2L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (0).toInt())
                        ).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: SctpGenErrorCause) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.code)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 2L, value.length)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (0).toInt())
                    ).writeNative(addr + 4L, value.info)
                }
            }
    }
}

public data class SctpErrorCause(
    public var code: UShort = 0u,
    public var length: UShort = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SctpErrorCause> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SctpErrorCause> {
                override val sizeBytes: Long = 4L
                override val alignBytes: Long = 1L
                override fun readNative(addr: Long): SctpErrorCause =
                    SctpErrorCause(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 2L),
                    )
                override fun writeNative(addr: Long, value: SctpErrorCause) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.code)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 2L, value.length)
                }
            }
    }
}

public data class SctpErrorInvalidStream(
    public var cause: SctpErrorCause = SctpErrorCause(),
    public var streamId: UShort = 0u,
    public var reserved: UShort = 0u,
)

public data class SctpErrorMissingParam(
    public var cause: SctpErrorCause = SctpErrorCause(),
    public var numMissingParams: UInt = 0u,
    public var tpe: UByteArray = UByteArray(0),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SctpErrorMissingParam) return false
        if (this.cause != other.cause) return false
        if (this.numMissingParams != other.numMissingParams) return false
        if (!this.tpe.contentEquals(other.tpe)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cause.hashCode()
        result = 31 * result + this.numMissingParams.hashCode()
        result = 31 * result + this.tpe.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SctpErrorMissingParam> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SctpErrorMissingParam> {
                override val sizeBytes: Long = 8L
                override val alignBytes: Long = 1L
                override fun readNative(addr: Long): SctpErrorMissingParam =
                    SctpErrorMissingParam(
                        (SctpErrorCause.typeLayout()).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (0).toInt())
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: SctpErrorMissingParam) {
                    (SctpErrorCause.typeLayout()).writeNative(addr, value.cause)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.numMissingParams)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (0).toInt())
                    ).writeNative(addr + 8L, value.tpe)
                }
            }
    }
}

public data class SctpErrorStaleCookie(
    public var cause: SctpErrorCause = SctpErrorCause(),
    public var staleTime: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SctpErrorStaleCookie> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SctpErrorStaleCookie> {
                override val sizeBytes: Long = 8L
                override val alignBytes: Long = 1L
                override fun readNative(addr: Long): SctpErrorStaleCookie =
                    SctpErrorStaleCookie(
                        (SctpErrorCause.typeLayout()).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: SctpErrorStaleCookie) {
                    (SctpErrorCause.typeLayout()).writeNative(addr, value.cause)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.staleTime)
                }
            }
    }
}

public data class SctpErrorOutOfResource(
    public var cause: SctpErrorCause = SctpErrorCause(),
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SctpErrorOutOfResource> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SctpErrorOutOfResource> {
                override val sizeBytes: Long = 4L
                override val alignBytes: Long = 1L
                override fun readNative(addr: Long): SctpErrorOutOfResource =
                    SctpErrorOutOfResource(
                        (SctpErrorCause.typeLayout()).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: SctpErrorOutOfResource) {
                    (SctpErrorCause.typeLayout()).writeNative(addr, value.cause)
                }
            }
    }
}

public data class SctpErrorUnresolvAddr(
    public var cause: SctpErrorCause = SctpErrorCause(),
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SctpErrorUnresolvAddr> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SctpErrorUnresolvAddr> {
                override val sizeBytes: Long = 4L
                override val alignBytes: Long = 1L
                override fun readNative(addr: Long): SctpErrorUnresolvAddr =
                    SctpErrorUnresolvAddr(
                        (SctpErrorCause.typeLayout()).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: SctpErrorUnresolvAddr) {
                    (SctpErrorCause.typeLayout()).writeNative(addr, value.cause)
                }
            }
    }
}

public data class SctpErrorUnrecognizedChunk(
    public var cause: SctpErrorCause = SctpErrorCause(),
    public var ch: SctpChunkhdr = SctpChunkhdr(),
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SctpErrorUnrecognizedChunk> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SctpErrorUnrecognizedChunk> {
                override val sizeBytes: Long = 8L
                override val alignBytes: Long = 1L
                override fun readNative(addr: Long): SctpErrorUnrecognizedChunk =
                    SctpErrorUnrecognizedChunk(
                        (SctpErrorCause.typeLayout()).readNative(addr),
                        (SctpChunkhdr.typeLayout()).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: SctpErrorUnrecognizedChunk) {
                    (SctpErrorCause.typeLayout()).writeNative(addr, value.cause)
                    (SctpChunkhdr.typeLayout()).writeNative(addr + 4L, value.ch)
                }
            }
    }
}

public data class SctpErrorNoUserData(
    public var cause: SctpErrorCause = SctpErrorCause(),
    public var tsn: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SctpErrorNoUserData> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SctpErrorNoUserData> {
                override val sizeBytes: Long = 8L
                override val alignBytes: Long = 1L
                override fun readNative(addr: Long): SctpErrorNoUserData =
                    SctpErrorNoUserData(
                        (SctpErrorCause.typeLayout()).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: SctpErrorNoUserData) {
                    (SctpErrorCause.typeLayout()).writeNative(addr, value.cause)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.tsn)
                }
            }
    }
}

public data class SctpErrorAuthInvalidHmac(
    public var cause: SctpErrorCause = SctpErrorCause(),
    public var hmacId: UShort = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SctpErrorAuthInvalidHmac> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SctpErrorAuthInvalidHmac> {
                override val sizeBytes: Long = 6L
                override val alignBytes: Long = 1L
                override fun readNative(addr: Long): SctpErrorAuthInvalidHmac =
                    SctpErrorAuthInvalidHmac(
                        (SctpErrorCause.typeLayout()).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: SctpErrorAuthInvalidHmac) {
                    (SctpErrorCause.typeLayout()).writeNative(addr, value.cause)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 4L, value.hmacId)
                }
            }
    }
}

public data class KinfoFile(
    public var kfStructsize: CInt = 0,
    public var kfType: CInt = 0,
    public var kfFd: CInt = 0,
    public var kfRefCount: CInt = 0,
    public var kfFlags: CInt = 0,
    public var kfPad0: CInt = 0,
    public var kfOffset: Long = 0L,
    public var priv: UByteArray = UByteArray(304),
    // Note(freebsd): this is really a giant union
    public var kfStatus: UShort = 0u,
    public var kfPad1: UShort = 0u,
    public var kfIspare0: CInt = 0,
    public var kfCapRights: CapRightsT = CapRightsT(),
    public var kfCapSpare: ULong = 0uL,
    public var kfPath: UByteArray = UByteArray(PATH_MAX),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is KinfoFile) return false
        if (this.kfStructsize != other.kfStructsize) return false
        if (this.kfType != other.kfType) return false
        if (this.kfFd != other.kfFd) return false
        if (this.kfRefCount != other.kfRefCount) return false
        if (this.kfFlags != other.kfFlags) return false
        if (this.kfPad0 != other.kfPad0) return false
        if (this.kfOffset != other.kfOffset) return false
        if (!this.priv.contentEquals(other.priv)) return false
        if (this.kfStatus != other.kfStatus) return false
        if (this.kfPad1 != other.kfPad1) return false
        if (this.kfIspare0 != other.kfIspare0) return false
        if (this.kfCapRights != other.kfCapRights) return false
        if (this.kfCapSpare != other.kfCapSpare) return false
        if (!this.kfPath.contentEquals(other.kfPath)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.kfStructsize.hashCode()
        result = 31 * result + this.kfType.hashCode()
        result = 31 * result + this.kfFd.hashCode()
        result = 31 * result + this.kfRefCount.hashCode()
        result = 31 * result + this.kfFlags.hashCode()
        result = 31 * result + this.kfPad0.hashCode()
        result = 31 * result + this.kfOffset.hashCode()
        result = 31 * result + this.priv.contentHashCode()
        result = 31 * result + this.kfStatus.hashCode()
        result = 31 * result + this.kfPad1.hashCode()
        result = 31 * result + this.kfIspare0.hashCode()
        result = 31 * result + this.kfCapRights.hashCode()
        result = 31 * result + this.kfCapSpare.hashCode()
        result = 31 * result + this.kfPath.contentHashCode()
        return result
    }
}

public class CAnonymousCrPid internal constructor(
    crUnusedCtorArg: MutPtr<CVoid>,
    public var crPid: PidT,
) {
    public var crUnused: MutPtr<CVoid> = crUnusedCtorArg
        internal set

    public constructor() : this(
        crUnusedCtorArg = MutPtr(0L),
        crPid = 0,
    )

    public operator fun component1(): MutPtr<CVoid> = this.crUnused

    public operator fun component2(): PidT = this.crPid

    public fun copy(crUnused: MutPtr<CVoid> = this.crUnused, crPid: PidT = this.crPid): CAnonymousCrPid = CAnonymousCrPid(crUnusedCtorArg = crUnused, crPid = crPid)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CAnonymousCrPid) return false
        if (this.crUnused != other.crUnused) return false
        if (this.crPid != other.crPid) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.crUnused.hashCode()
        result = 31 * result + this.crPid.hashCode()
        return result
    }

    public fun fmt(f: StringBuilder) {
        DebugStruct(f, "__c_anonymous_cr_pid").finishNonExhaustive()
    }

    public fun eq(other: CAnonymousCrPid): Boolean = this.crPid == other.crPid

    public companion object {
        public operator fun invoke(
            crUnused: MutPtr<CVoid> = MutPtr(0L),
            crPid: PidT = 0,
        ): CAnonymousCrPid =
            CAnonymousCrPid(
                crUnusedCtorArg = crUnused,
                crPid = crPid,
            )
    }
}

public data class Sigevent(
    public var sigevNotify: CInt = 0,
    public var sigevSigno: CInt = 0,
    public var sigevValue: Sigval = Sigval(),
    // The rest of the structure is actually a union.  We expose only
    // sigevNotifyThreadId because it's the most useful union member.
    public var sigevNotifyThreadId: LwpidT = 0,
    public var unused1: CInt = 0,
    public var unused2: LongArray = LongArray(7),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Sigevent) return false
        if (this.sigevNotify != other.sigevNotify) return false
        if (this.sigevSigno != other.sigevSigno) return false
        if (this.sigevValue != other.sigevValue) return false
        if (this.sigevNotifyThreadId != other.sigevNotifyThreadId) return false
        if (this.unused1 != other.unused1) return false
        if (!this.unused2.contentEquals(other.unused2)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.sigevNotify.hashCode()
        result = 31 * result + this.sigevSigno.hashCode()
        result = 31 * result + this.sigevValue.hashCode()
        result = 31 * result + this.sigevNotifyThreadId.hashCode()
        result = 31 * result + this.unused1.hashCode()
        result = 31 * result + this.unused2.contentHashCode()
        return result
    }

    public fun eq(other: Sigevent): Boolean = this.sigevNotify == other.sigevNotify && this.sigevSigno == other.sigevSigno && this.sigevValue == other.sigevValue && this.sigevNotifyThreadId == other.sigevNotifyThreadId
}

public data class CAnonymousElf32AuxvUnion(
    public var aVal: CInt = 0,
) {
    public fun fmt(f: StringBuilder) {
        DebugStruct(f, "__c_anonymous_elf32_auxv_union").finishNonExhaustive()
    }

    public fun eq(other: CAnonymousElf32AuxvUnion): Boolean = this.aVal == other.aVal

    public override fun hashCode(): Int {
        error("traits")
    }
}

public data class CAnonymousIfiEpoch(
    public var tt: TimeT = 0L,
    public var ph: ULong = 0uL,
) {
    public fun fmt(f: StringBuilder) {
        DebugStruct(f, "__c_anonymous_ifi_epoch").finishNonExhaustive()
    }

    public fun eq(other: CAnonymousIfiEpoch): Boolean = this.tt == other.tt && this.ph == other.ph

    public override fun hashCode(): Int {
        var state = 0
        run {
            state = 31 * state + (this.tt).hashCode()
            state = 31 * state + (this.ph).hashCode()
        }
        return state
    }
}

public data class CAnonymousIfiLastchange(
    public var tv: Timeval = Timeval(),
    public var ph: CAnonymousPh = CAnonymousPh(),
) {
    public fun fmt(f: StringBuilder) {
        DebugStruct(f, "__c_anonymous_ifi_lastchange").finishNonExhaustive()
    }

    public fun eq(other: CAnonymousIfiLastchange): Boolean = this.tv == other.tv && this.ph == other.ph

    public override fun hashCode(): Int {
        var state = 0
        run {
            state = 31 * state + (this.tv).hashCode()
            state = 31 * state + (this.ph).hashCode()
        }
        return state
    }
}

public class CAnonymousIfrIfru internal constructor(
    public var ifruAddr: Sockaddr,
    public var ifruDstaddr: Sockaddr,
    public var ifruBroadaddr: Sockaddr,
    public var ifruBuffer: IfreqBuffer,
    public var ifruFlags: ShortArray,
    public var ifruIndex: CShort,
    public var ifruJid: CInt,
    public var ifruMetric: CInt,
    public var ifruMtu: CInt,
    public var ifruPhys: CInt,
    public var ifruMedia: CInt,
    ifruDataCtorArg: CaddrT,
    public var ifruCap: IntArray,
    public var ifruFib: CUint,
    public var ifruVlanPcp: CUchar,
) {
    public var ifruData: CaddrT = ifruDataCtorArg
        internal set

    public constructor() : this(
        ifruAddr = Sockaddr(),
        ifruDstaddr = Sockaddr(),
        ifruBroadaddr = Sockaddr(),
        ifruBuffer = IfreqBuffer(),
        ifruFlags = ShortArray(2),
        ifruIndex = 0,
        ifruJid = 0,
        ifruMetric = 0,
        ifruMtu = 0,
        ifruPhys = 0,
        ifruMedia = 0,
        ifruDataCtorArg = MutPtr(0L),
        ifruCap = IntArray(2),
        ifruFib = 0u,
        ifruVlanPcp = 0u,
    )

    public operator fun component1(): Sockaddr = this.ifruAddr

    public operator fun component2(): Sockaddr = this.ifruDstaddr

    public operator fun component3(): Sockaddr = this.ifruBroadaddr

    public operator fun component4(): IfreqBuffer = this.ifruBuffer

    public operator fun component5(): ShortArray = this.ifruFlags

    public operator fun component6(): CShort = this.ifruIndex

    public operator fun component7(): CInt = this.ifruJid

    public operator fun component8(): CInt = this.ifruMetric

    public operator fun component9(): CInt = this.ifruMtu

    public operator fun component10(): CInt = this.ifruPhys

    public operator fun component11(): CInt = this.ifruMedia

    public operator fun component12(): CaddrT = this.ifruData

    public operator fun component13(): IntArray = this.ifruCap

    public operator fun component14(): CUint = this.ifruFib

    public operator fun component15(): CUchar = this.ifruVlanPcp

    public fun copy(ifruAddr: Sockaddr = this.ifruAddr, ifruDstaddr: Sockaddr = this.ifruDstaddr, ifruBroadaddr: Sockaddr = this.ifruBroadaddr, ifruBuffer: IfreqBuffer = this.ifruBuffer, ifruFlags: ShortArray = this.ifruFlags, ifruIndex: CShort = this.ifruIndex, ifruJid: CInt = this.ifruJid, ifruMetric: CInt = this.ifruMetric, ifruMtu: CInt = this.ifruMtu, ifruPhys: CInt = this.ifruPhys, ifruMedia: CInt = this.ifruMedia, ifruData: CaddrT = this.ifruData, ifruCap: IntArray = this.ifruCap, ifruFib: CUint = this.ifruFib, ifruVlanPcp: CUchar = this.ifruVlanPcp): CAnonymousIfrIfru = CAnonymousIfrIfru(ifruAddr = ifruAddr, ifruDstaddr = ifruDstaddr, ifruBroadaddr = ifruBroadaddr, ifruBuffer = ifruBuffer, ifruFlags = ifruFlags, ifruIndex = ifruIndex, ifruJid = ifruJid, ifruMetric = ifruMetric, ifruMtu = ifruMtu, ifruPhys = ifruPhys, ifruMedia = ifruMedia, ifruDataCtorArg = ifruData, ifruCap = ifruCap, ifruFib = ifruFib, ifruVlanPcp = ifruVlanPcp)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CAnonymousIfrIfru) return false
        if (this.ifruAddr != other.ifruAddr) return false
        if (this.ifruDstaddr != other.ifruDstaddr) return false
        if (this.ifruBroadaddr != other.ifruBroadaddr) return false
        if (this.ifruBuffer != other.ifruBuffer) return false
        if (!this.ifruFlags.contentEquals(other.ifruFlags)) return false
        if (this.ifruIndex != other.ifruIndex) return false
        if (this.ifruJid != other.ifruJid) return false
        if (this.ifruMetric != other.ifruMetric) return false
        if (this.ifruMtu != other.ifruMtu) return false
        if (this.ifruPhys != other.ifruPhys) return false
        if (this.ifruMedia != other.ifruMedia) return false
        if (this.ifruData != other.ifruData) return false
        if (!this.ifruCap.contentEquals(other.ifruCap)) return false
        if (this.ifruFib != other.ifruFib) return false
        if (this.ifruVlanPcp != other.ifruVlanPcp) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.ifruAddr.hashCode()
        result = 31 * result + this.ifruDstaddr.hashCode()
        result = 31 * result + this.ifruBroadaddr.hashCode()
        result = 31 * result + this.ifruBuffer.hashCode()
        result = 31 * result + this.ifruFlags.contentHashCode()
        result = 31 * result + this.ifruIndex.hashCode()
        result = 31 * result + this.ifruJid.hashCode()
        result = 31 * result + this.ifruMetric.hashCode()
        result = 31 * result + this.ifruMtu.hashCode()
        result = 31 * result + this.ifruPhys.hashCode()
        result = 31 * result + this.ifruMedia.hashCode()
        result = 31 * result + this.ifruData.hashCode()
        result = 31 * result + this.ifruCap.contentHashCode()
        result = 31 * result + this.ifruFib.hashCode()
        result = 31 * result + this.ifruVlanPcp.hashCode()
        return result
    }

    public fun fmt(f: StringBuilder) {
        DebugStruct(f, "__c_anonymous_ifr_ifru").finishNonExhaustive()
    }

    public fun eq(other: CAnonymousIfrIfru): Boolean = this.ifruAddr == other.ifruAddr && this.ifruDstaddr == other.ifruDstaddr && this.ifruBroadaddr == other.ifruBroadaddr && this.ifruBuffer == other.ifruBuffer && this.ifruFlags.contentEquals(other.ifruFlags) && this.ifruIndex == other.ifruIndex && this.ifruJid == other.ifruJid && this.ifruMetric == other.ifruMetric && this.ifruMtu == other.ifruMtu && this.ifruPhys == other.ifruPhys && this.ifruMedia == other.ifruMedia && this.ifruData == other.ifruData && this.ifruCap.contentEquals(other.ifruCap) && this.ifruFib == other.ifruFib && this.ifruVlanPcp == other.ifruVlanPcp

    public companion object {
        public operator fun invoke(
            ifruAddr: Sockaddr = Sockaddr(),
            ifruDstaddr: Sockaddr = Sockaddr(),
            ifruBroadaddr: Sockaddr = Sockaddr(),
            ifruBuffer: IfreqBuffer = IfreqBuffer(),
            ifruFlags: ShortArray = ShortArray(2),
            ifruIndex: CShort = 0,
            ifruJid: CInt = 0,
            ifruMetric: CInt = 0,
            ifruMtu: CInt = 0,
            ifruPhys: CInt = 0,
            ifruMedia: CInt = 0,
            ifruData: CaddrT = MutPtr(0L),
            ifruCap: IntArray = IntArray(2),
            ifruFib: CUint = 0u,
            ifruVlanPcp: CUchar = 0u,
        ): CAnonymousIfrIfru =
            CAnonymousIfrIfru(
                ifruAddr = ifruAddr,
                ifruDstaddr = ifruDstaddr,
                ifruBroadaddr = ifruBroadaddr,
                ifruBuffer = ifruBuffer,
                ifruFlags = ifruFlags,
                ifruIndex = ifruIndex,
                ifruJid = ifruJid,
                ifruMetric = ifruMetric,
                ifruMtu = ifruMtu,
                ifruPhys = ifruPhys,
                ifruMedia = ifruMedia,
                ifruDataCtorArg = ifruData,
                ifruCap = ifruCap,
                ifruFib = ifruFib,
                ifruVlanPcp = ifruVlanPcp,
            )
    }
}

public class CAnonymousIfcIfcu internal constructor(
    ifcuBufCtorArg: CaddrT,
    ifcuReqCtorArg: MutPtr<Ifreq>,
) {
    public var ifcuBuf: CaddrT = ifcuBufCtorArg
        internal set

    public var ifcuReq: MutPtr<Ifreq> = ifcuReqCtorArg
        internal set

    public constructor() : this(
        ifcuBufCtorArg = MutPtr(0L),
        ifcuReqCtorArg = MutPtr(0L),
    )

    public operator fun component1(): CaddrT = this.ifcuBuf

    public operator fun component2(): MutPtr<Ifreq> = this.ifcuReq

    public fun copy(ifcuBuf: CaddrT = this.ifcuBuf, ifcuReq: MutPtr<Ifreq> = this.ifcuReq): CAnonymousIfcIfcu = CAnonymousIfcIfcu(ifcuBufCtorArg = ifcuBuf, ifcuReqCtorArg = ifcuReq)

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

    public fun eq(other: CAnonymousIfcIfcu): Boolean = this.ifcuBuf == other.ifcuBuf && ((this.ifcuReq).rawAddress.toULong() == (other.ifcuReq).rawAddress.toULong())

    public companion object {
        public operator fun invoke(
            ifcuBuf: CaddrT = MutPtr(0L),
            ifcuReq: MutPtr<Ifreq> = MutPtr(0L),
        ): CAnonymousIfcIfcu =
            CAnonymousIfcIfcu(
                ifcuBufCtorArg = ifcuBuf,
                ifcuReqCtorArg = ifcuReq,
            )
    }
}

public class UcontextT internal constructor(
    public var ucSigmask: SigsetT,
    ucMcontextCtorArg: McontextT,
    ucLinkCtorArg: MutPtr<UcontextT>,
    public var ucStack: StackT,
    public var ucFlags: CInt,
    public var spare: IntArray,
) {
    public var ucMcontext: McontextT = ucMcontextCtorArg
        internal set

    public var ucLink: MutPtr<UcontextT> = ucLinkCtorArg
        internal set

    public constructor() : this(
        ucSigmask = SigsetT(),
        ucMcontextCtorArg = McontextT(),
        ucLinkCtorArg = MutPtr(0L),
        ucStack = StackT(),
        ucFlags = 0,
        spare = IntArray(4),
    )

    public operator fun component1(): SigsetT = this.ucSigmask

    public operator fun component2(): McontextT = this.ucMcontext

    public operator fun component3(): MutPtr<UcontextT> = this.ucLink

    public operator fun component4(): StackT = this.ucStack

    public operator fun component5(): CInt = this.ucFlags

    public operator fun component6(): IntArray = this.spare

    public fun copy(ucSigmask: SigsetT = this.ucSigmask, ucMcontext: McontextT = this.ucMcontext, ucLink: MutPtr<UcontextT> = this.ucLink, ucStack: StackT = this.ucStack, ucFlags: CInt = this.ucFlags, spare: IntArray = this.spare): UcontextT = UcontextT(ucSigmask = ucSigmask, ucMcontextCtorArg = ucMcontext, ucLinkCtorArg = ucLink, ucStack = ucStack, ucFlags = ucFlags, spare = spare)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is UcontextT) return false
        if (this.ucSigmask != other.ucSigmask) return false
        if (this.ucMcontext != other.ucMcontext) return false
        if (this.ucLink != other.ucLink) return false
        if (this.ucStack != other.ucStack) return false
        if (this.ucFlags != other.ucFlags) return false
        if (!this.spare.contentEquals(other.spare)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.ucSigmask.hashCode()
        result = 31 * result + this.ucMcontext.hashCode()
        result = 31 * result + this.ucLink.hashCode()
        result = 31 * result + this.ucStack.hashCode()
        result = 31 * result + this.ucFlags.hashCode()
        result = 31 * result + this.spare.contentHashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            ucSigmask: SigsetT = SigsetT(),
            ucMcontext: McontextT = McontextT(),
            ucLink: MutPtr<UcontextT> = MutPtr(0L),
            ucStack: StackT = StackT(),
            ucFlags: CInt = 0,
            spare: IntArray = IntArray(4),
        ): UcontextT =
            UcontextT(
                ucSigmask = ucSigmask,
                ucMcontextCtorArg = ucMcontext,
                ucLinkCtorArg = ucLink,
                ucStack = ucStack,
                ucFlags = ucFlags,
                spare = spare,
            )
    }
}

public data class Xinpgen(
    public var xigLen: KsizeT = 0uL,
    public var xigCount: UInt = 0u,
    public var xigSpare32: UInt = 0u,
    public var xigGen: InpGenT = 0uL,
    public var xigSogen: SoGenT = 0uL,
    public var xigSpare64: ULongArray = ULongArray(4),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Xinpgen) return false
        if (this.xigLen != other.xigLen) return false
        if (this.xigCount != other.xigCount) return false
        if (this.xigSpare32 != other.xigSpare32) return false
        if (this.xigGen != other.xigGen) return false
        if (this.xigSogen != other.xigSogen) return false
        if (!this.xigSpare64.contentEquals(other.xigSpare64)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.xigLen.hashCode()
        result = 31 * result + this.xigCount.hashCode()
        result = 31 * result + this.xigSpare32.hashCode()
        result = 31 * result + this.xigGen.hashCode()
        result = 31 * result + this.xigSogen.hashCode()
        result = 31 * result + this.xigSpare64.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Xinpgen> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Xinpgen> {
                override val sizeBytes: Long = 64L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): Xinpgen =
                    Xinpgen(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 24L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64, (4).toInt())
                        ).readNative(addr + 32L),
                    )
                override fun writeNative(addr: Long, value: Xinpgen) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr, value.xigLen)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.xigCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.xigSpare32)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 16L, value.xigGen)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 24L, value.xigSogen)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64, (4).toInt())
                    ).writeNative(addr + 32L, value.xigSpare64)
                }
            }
    }
}

public data class InAddr4in6(
    public var ia46Pad32: UIntArray = UIntArray(3),
    public var ia46Addr4: InAddr = InAddr(),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is InAddr4in6) return false
        if (!this.ia46Pad32.contentEquals(other.ia46Pad32)) return false
        if (this.ia46Addr4 != other.ia46Addr4) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.ia46Pad32.contentHashCode()
        result = 31 * result + this.ia46Addr4.hashCode()
        return result
    }
}

public data class InDependaddr(
    public var id46Addr: InAddr4in6 = InAddr4in6(),
    public var id6Addr: In6Addr = In6Addr(),
) {
    public fun fmt(f: StringBuilder) {
        DebugStruct(f, "in_dependaddr").finishNonExhaustive()
    }
}

public data class InEndpoints(
    public var ieFport: UShort = 0u,
    public var ieLport: UShort = 0u,
    public var ieDependfaddr: InDependaddr = InDependaddr(),
    public var ieDependladdr: InDependaddr = InDependaddr(),
    public var ie6Zoneid: UInt = 0u,
)

public data class InConninfo(
    public var incFlags: UByte = 0u,
    public var incLen: UByte = 0u,
    public var incFibnum: UShort = 0u,
    public var incIe: InEndpoints = InEndpoints(),
)

public class XktlsSessionOnedir(
    // Note: this field is called `gen` in upstream FreeBSD, but `gen` is
    // reserved keyword in Rust since the 2024 Edition, hence `gennum`.
    public var gennum: ULong = 0uL,
    public var rsrv1: ULongArray = ULongArray(8),
    public var rsrv2: UIntArray = UIntArray(8),
    public var iv: UByteArray = UByteArray(32),
    public var cipherAlgorithm: Int = 0,
    public var authAlgorithm: Int = 0,
    public var cipherKeyLen: UShort = 0u,
    public var ivLen: UShort = 0u,
    public var authKeyLen: UShort = 0u,
    public var maxFrameLen: UShort = 0u,
    public var tlsVmajor: UByte = 0u,
    public var tlsVminor: UByte = 0u,
    public var tlsHlen: UByte = 0u,
    public var tlsTlen: UByte = 0u,
    public var tlsBs: UByte = 0u,
    public var flags: UByte = 0u,
    public var drvStLen: UShort = 0u,
    public var ifnet: UByteArray = UByteArray(16),
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<XktlsSessionOnedir> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<XktlsSessionOnedir> {
                override val sizeBytes: Long = 176L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): XktlsSessionOnedir =
                    XktlsSessionOnedir(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64, (8).toInt())
                        ).readNative(addr + 8L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32, (8).toInt())
                        ).readNative(addr + 72L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (32).toInt())
                        ).readNative(addr + 104L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 136L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 140L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 144L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 146L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 148L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 150L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 152L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 153L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 154L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 155L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 156L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 157L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 158L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (16).toInt())
                        ).readNative(addr + 160L),
                    )
                override fun writeNative(addr: Long, value: XktlsSessionOnedir) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr, value.gennum)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64, (8).toInt())
                    ).writeNative(addr + 8L, value.rsrv1)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32, (8).toInt())
                    ).writeNative(addr + 72L, value.rsrv2)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (32).toInt())
                    ).writeNative(addr + 104L, value.iv)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 136L, value.cipherAlgorithm)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 140L, value.authAlgorithm)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 144L, value.cipherKeyLen)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 146L, value.ivLen)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 148L, value.authKeyLen)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 150L, value.maxFrameLen)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 152L, value.tlsVmajor)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 153L, value.tlsVminor)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 154L, value.tlsHlen)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 155L, value.tlsTlen)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 156L, value.tlsBs)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 157L, value.flags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 158L, value.drvStLen)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (16).toInt())
                    ).writeNative(addr + 160L, value.ifnet)
                }
            }
    }
}

public data class XktlsSession(
    public var tsz: UInt = 0u,
    public var fsz: UInt = 0u,
    public var inpGencnt: ULong = 0uL,
    public var soPcb: KvaddrT = 0uL,
    public var coninf: InConninfo = InConninfo(),
    public var rxVlanId: CUshort = 0u,
    public var rcv: XktlsSessionOnedir = XktlsSessionOnedir(),
    public var snd: XktlsSessionOnedir = XktlsSessionOnedir(),
)
