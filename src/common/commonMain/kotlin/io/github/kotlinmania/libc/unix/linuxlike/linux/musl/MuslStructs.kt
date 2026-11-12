@file:OptIn(ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.unix.linuxlike.linux.musl

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CChar
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CLong
import io.github.kotlinmania.libc.CShort
import io.github.kotlinmania.libc.CUchar
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.CUlong
import io.github.kotlinmania.libc.CUlonglong
import io.github.kotlinmania.libc.CUshort
import io.github.kotlinmania.libc.unix.CcT
import io.github.kotlinmania.libc.unix.PidT
import io.github.kotlinmania.libc.unix.SighandlerT
import io.github.kotlinmania.libc.unix.Sigval
import io.github.kotlinmania.libc.unix.SizeT
import io.github.kotlinmania.libc.unix.SsizeT
import io.github.kotlinmania.libc.unix.Timeval
import io.github.kotlinmania.libc.unix.UidT
import io.github.kotlinmania.libc.unix.linuxlike.Elf32Word
import io.github.kotlinmania.libc.unix.linuxlike.Elf64Word
import io.github.kotlinmania.libc.unix.linuxlike.Elf64Xword
import io.github.kotlinmania.libc.unix.linuxlike.FsidT
import io.github.kotlinmania.libc.unix.linuxlike.Sigevent
import io.github.kotlinmania.libc.unix.linuxlike.Sockaddr
import io.github.kotlinmania.libc.unix.linuxlike.SpeedT
import io.github.kotlinmania.libc.unix.linuxlike.TcflagT
import io.github.kotlinmania.libc.unix.linuxlike.linux.Off64T
import io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b64.SigsetT
import io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
import io.github.kotlinmania.rustlang.core.mem.TypeLayout
import io.github.kotlinmania.rustlang.core.mem.sizeOf
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr

public fun interface SigactionSaRestorerCallback {
    public operator fun invoke()
}

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

public data class SifieldsSigchld(
    public var siPid: PidT = 0,
    public var siUid: UidT = 0u,
    public var siStatus: CInt = 0,
    public var siUtime: CLong = 0L,
    public var siStime: CLong = 0L,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SifieldsSigchld> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SifieldsSigchld> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 32L
                override fun readNative(addr: Long): SifieldsSigchld =
                    SifieldsSigchld(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 24L),
                    )
                override fun writeNative(addr: Long, value: SifieldsSigchld) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.siPid)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 4L, value.siUid)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 8L, value.siStatus)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 16L, value.siUtime)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 24L, value.siStime)
                }
            }
    }
}

public class Sifields internal constructor(
    alignPointerCtorArg: MutPtr,
    public var sigchld: SifieldsSigchld,
) {
    public var alignPointer: MutPtr = alignPointerCtorArg
        internal set

    public constructor() : this(
        alignPointerCtorArg = MutPtr(0L),
        sigchld = SifieldsSigchld(),
    )

    public operator fun component1(): MutPtr = this.alignPointer

    public operator fun component2(): SifieldsSigchld = this.sigchld

    public fun copy(alignPointer: MutPtr = this.alignPointer, sigchld: SifieldsSigchld = this.sigchld): Sifields = Sifields(alignPointerCtorArg = alignPointer, sigchld = sigchld)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Sifields) return false
        if (this.alignPointer != other.alignPointer) return false
        if (this.sigchld != other.sigchld) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.alignPointer.hashCode()
        result = 31 * result + this.sigchld.hashCode()
        return result
    }

    public fun fmt(f: StringBuilder) {
        DebugStruct(f, "sifields").finishNonExhaustive()
    }

    public companion object {
        public operator fun invoke(
            alignPointer: MutPtr = MutPtr(0L),
            sigchld: SifieldsSigchld = SifieldsSigchld(),
        ): Sifields =
            Sifields(
                alignPointerCtorArg = alignPointer,
                sigchld = sigchld,
            )
    }
}

public data class SiginfoF(
    public var siginfoBase: IntArray = IntArray(3),
    public var sifields: Sifields = Sifields(),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SiginfoF) return false
        if (!this.siginfoBase.contentEquals(other.siginfoBase)) return false
        if (this.sifields != other.sifields) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.siginfoBase.contentHashCode()
        result = 31 * result + this.sifields.hashCode()
        return result
    }
}

public class Aiocb internal constructor(
    public var aioFildes: CInt,
    public var aioLioOpcode: CInt,
    public var aioReqprio: CInt,
    aioBufCtorArg: MutPtr,
    public var aioNbytes: SizeT,
    public var aioSigevent: Sigevent,
    tdCtorArg: MutPtr,
    public var lock: IntArray,
    public var err: CInt,
    public var ret: SsizeT,
    public var aioOffset: OffT,
    nextCtorArg: MutPtr,
    prevCtorArg: MutPtr,
    public var dummy4: UByteArray,
) {
    public var aioBuf: MutPtr = aioBufCtorArg
        internal set

    public var td: MutPtr = tdCtorArg
        internal set

    public var next: MutPtr = nextCtorArg
        internal set

    public var prev: MutPtr = prevCtorArg
        internal set

    public constructor() : this(
        aioFildes = 0,
        aioLioOpcode = 0,
        aioReqprio = 0,
        aioBufCtorArg = MutPtr(0L),
        aioNbytes = 0uL,
        aioSigevent = Sigevent(),
        tdCtorArg = MutPtr(0L),
        lock = IntArray(2),
        err = 0,
        ret = 0L,
        aioOffset = 0L,
        nextCtorArg = MutPtr(0L),
        prevCtorArg = MutPtr(0L),
        dummy4 = UByteArray(32 - 2 * sizeOf<ConstPtr>(typeLayoutT = PrimitiveLayouts.constPtrLayout(64L))),
    )

    public operator fun component1(): CInt = this.aioFildes

    public operator fun component2(): CInt = this.aioLioOpcode

    public operator fun component3(): CInt = this.aioReqprio

    public operator fun component4(): MutPtr = this.aioBuf

    public operator fun component5(): SizeT = this.aioNbytes

    public operator fun component6(): Sigevent = this.aioSigevent

    public operator fun component7(): MutPtr = this.td

    public operator fun component8(): IntArray = this.lock

    public operator fun component9(): CInt = this.err

    public operator fun component10(): SsizeT = this.ret

    public operator fun component11(): OffT = this.aioOffset

    public operator fun component12(): MutPtr = this.next

    public operator fun component13(): MutPtr = this.prev

    public operator fun component14(): UByteArray = this.dummy4

    public fun copy(aioFildes: CInt = this.aioFildes, aioLioOpcode: CInt = this.aioLioOpcode, aioReqprio: CInt = this.aioReqprio, aioBuf: MutPtr = this.aioBuf, aioNbytes: SizeT = this.aioNbytes, aioSigevent: Sigevent = this.aioSigevent, td: MutPtr = this.td, lock: IntArray = this.lock, err: CInt = this.err, ret: SsizeT = this.ret, aioOffset: OffT = this.aioOffset, next: MutPtr = this.next, prev: MutPtr = this.prev, dummy4: UByteArray = this.dummy4): Aiocb = Aiocb(aioFildes = aioFildes, aioLioOpcode = aioLioOpcode, aioReqprio = aioReqprio, aioBufCtorArg = aioBuf, aioNbytes = aioNbytes, aioSigevent = aioSigevent, tdCtorArg = td, lock = lock, err = err, ret = ret, aioOffset = aioOffset, nextCtorArg = next, prevCtorArg = prev, dummy4 = dummy4)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Aiocb) return false
        if (this.aioFildes != other.aioFildes) return false
        if (this.aioLioOpcode != other.aioLioOpcode) return false
        if (this.aioReqprio != other.aioReqprio) return false
        if (this.aioBuf != other.aioBuf) return false
        if (this.aioNbytes != other.aioNbytes) return false
        if (this.aioSigevent != other.aioSigevent) return false
        if (this.td != other.td) return false
        if (!this.lock.contentEquals(other.lock)) return false
        if (this.err != other.err) return false
        if (this.ret != other.ret) return false
        if (this.aioOffset != other.aioOffset) return false
        if (this.next != other.next) return false
        if (this.prev != other.prev) return false
        if (!this.dummy4.contentEquals(other.dummy4)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.aioFildes.hashCode()
        result = 31 * result + this.aioLioOpcode.hashCode()
        result = 31 * result + this.aioReqprio.hashCode()
        result = 31 * result + this.aioBuf.hashCode()
        result = 31 * result + this.aioNbytes.hashCode()
        result = 31 * result + this.aioSigevent.hashCode()
        result = 31 * result + this.td.hashCode()
        result = 31 * result + this.lock.contentHashCode()
        result = 31 * result + this.err.hashCode()
        result = 31 * result + this.ret.hashCode()
        result = 31 * result + this.aioOffset.hashCode()
        result = 31 * result + this.next.hashCode()
        result = 31 * result + this.prev.hashCode()
        result = 31 * result + this.dummy4.contentHashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            aioFildes: CInt = 0,
            aioLioOpcode: CInt = 0,
            aioReqprio: CInt = 0,
            aioBuf: MutPtr = MutPtr(0L),
            aioNbytes: SizeT = 0uL,
            aioSigevent: Sigevent = Sigevent(),
            td: MutPtr = MutPtr(0L),
            lock: IntArray = IntArray(2),
            err: CInt = 0,
            ret: SsizeT = 0L,
            aioOffset: OffT = 0L,
            next: MutPtr = MutPtr(0L),
            prev: MutPtr = MutPtr(0L),
            dummy4: UByteArray = UByteArray(32 - 2 * sizeOf<ConstPtr>(typeLayoutT = PrimitiveLayouts.constPtrLayout(64L))),
        ): Aiocb =
            Aiocb(
                aioFildes = aioFildes,
                aioLioOpcode = aioLioOpcode,
                aioReqprio = aioReqprio,
                aioBufCtorArg = aioBuf,
                aioNbytes = aioNbytes,
                aioSigevent = aioSigevent,
                tdCtorArg = td,
                lock = lock,
                err = err,
                ret = ret,
                aioOffset = aioOffset,
                nextCtorArg = next,
                prevCtorArg = prev,
                dummy4 = dummy4,
            )
    }
}

public data class FanotifyEventMetadata(
    public var eventLen: CUint = 0u,
    public var vers: CUchar = 0u,
    public var reserved: CUchar = 0u,
    public var metadataLen: CUshort = 0u,
    public var mask: CUlonglong = 0uL,
    public var fd: CInt = 0,
    public var pid: CInt = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<FanotifyEventMetadata> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<FanotifyEventMetadata> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 24L
                override fun readNative(addr: Long): FanotifyEventMetadata =
                    FanotifyEventMetadata(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 5L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 6L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 20L),
                    )
                override fun writeNative(addr: Long, value: FanotifyEventMetadata) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.eventLen)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 4L, value.vers)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 5L, value.reserved)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 6L, value.metadataLen)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 8L, value.mask)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 16L, value.fd)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 20L, value.pid)
                }
            }
    }
}

public data class Sigaction(
    public var saSigaction: SighandlerT = 0uL,
    public var saMask: SigsetT = SigsetT(),
    public var saFlags: CInt = 0,
    public var saRestorer: SigactionSaRestorerCallback? = null,
)

// `mips *` targets swap the `sErrno` and `sCode` fields otherwise this struct is
// target-agnostic (see https://www.openwall.com/lists/musl/2016/01/27/1/2)
//
// Note(union): C implementation uses unions
public data class SiginfoT(
    public var siSigno: CInt = 0,
    public var siErrno: CInt = 0,
    public var siCode: CInt = 0,
    public var pad: IntArray = IntArray(29),
    public var align: IntArray = IntArray(0),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SiginfoT) return false
        if (this.siSigno != other.siSigno) return false
        if (this.siErrno != other.siErrno) return false
        if (this.siCode != other.siCode) return false
        if (!this.pad.contentEquals(other.pad)) return false
        if (!this.align.contentEquals(other.align)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.siSigno.hashCode()
        result = 31 * result + this.siErrno.hashCode()
        result = 31 * result + this.siCode.hashCode()
        result = 31 * result + this.pad.contentHashCode()
        result = 31 * result + this.align.contentHashCode()
        return result
    }

    public fun siAddr(): MutPtr {
        val sz = maxOf(64L, typeLayout().sizeBytes)
        val scratch =
            io.github.kotlinmania.rustlang.core.intrinsics
                .kmAlloc(sz, 8L)
        typeLayout().writeNative(scratch, this)
        val out =
            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                .mutPtrLayout(64)
                .readNative(scratch + 16L)
        io.github.kotlinmania.rustlang.core.intrinsics
            .kmDealloc(scratch, sz, 8L)
        return out
    }

    public fun siValue(): Sigval {
        val sz = maxOf(64L, typeLayout().sizeBytes)
        val scratch =
            io.github.kotlinmania.rustlang.core.intrinsics
                .kmAlloc(sz, 8L)
        typeLayout().writeNative(scratch, this)
        val out = Sigval.typeLayout().readNative(scratch + 24L)
        io.github.kotlinmania.rustlang.core.intrinsics
            .kmDealloc(scratch, sz, 8L)
        return out
    }

    public fun sifields(): Sifields {
        val sz = maxOf(64L, typeLayout().sizeBytes)
        val scratch =
            io.github.kotlinmania.rustlang.core.intrinsics
                .kmAlloc(sz, 8L)
        typeLayout().writeNative(scratch, this)
        val out =
            Sifields(
                alignPointerCtorArg =
                    io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                        .mutPtrLayout(64)
                        .readNative(scratch + 16L),
                sigchld = SifieldsSigchld.typeLayout().readNative(scratch + 16L),
            )
        io.github.kotlinmania.rustlang.core.intrinsics
            .kmDealloc(scratch, sz, 8L)
        return out
    }

    public fun siPid(): PidT = this.sifields().sigchld.siPid

    public fun siUid(): UidT = this.sifields().sigchld.siUid

    public fun siStatus(): CInt = this.sifields().sigchld.siStatus

    public fun siUtime(): CLong = this.sifields().sigchld.siUtime

    public fun siStime(): CLong = this.sifields().sigchld.siStime

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SiginfoT> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SiginfoT> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 128L
                override fun readNative(addr: Long): SiginfoT =
                    SiginfoT(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 8L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32, (29).toInt())
                        ).readNative(addr + 12L).toIntArray(),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64, (0).toInt())
                        ).readNative(addr + 128L).toIntArray(),
                    )
                override fun writeNative(addr: Long, value: SiginfoT) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.siSigno)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 4L, value.siErrno)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 8L, value.siCode)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32, (29).toInt())
                    ).writeNative(addr + 12L, value.pad.toList())
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64, (0).toInt())
                    ).writeNative(addr + 128L, value.align.toList())
                }
            }
    }
}

public data class Statvfs(
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
    public var fReserved: IntArray = IntArray(6),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Statvfs) return false
        if (this.fBsize != other.fBsize) return false
        if (this.fFrsize != other.fFrsize) return false
        if (this.fBlocks != other.fBlocks) return false
        if (this.fBfree != other.fBfree) return false
        if (this.fBavail != other.fBavail) return false
        if (this.fFiles != other.fFiles) return false
        if (this.fFfree != other.fFfree) return false
        if (this.fFavail != other.fFavail) return false
        if (this.fFsid != other.fFsid) return false
        if (this.fFlag != other.fFlag) return false
        if (this.fNamemax != other.fNamemax) return false
        if (!this.fReserved.contentEquals(other.fReserved)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.fBsize.hashCode()
        result = 31 * result + this.fFrsize.hashCode()
        result = 31 * result + this.fBlocks.hashCode()
        result = 31 * result + this.fBfree.hashCode()
        result = 31 * result + this.fBavail.hashCode()
        result = 31 * result + this.fFiles.hashCode()
        result = 31 * result + this.fFfree.hashCode()
        result = 31 * result + this.fFavail.hashCode()
        result = 31 * result + this.fFsid.hashCode()
        result = 31 * result + this.fFlag.hashCode()
        result = 31 * result + this.fNamemax.hashCode()
        result = 31 * result + this.fReserved.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Statvfs> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Statvfs> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 112L
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
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32, (6).toInt())
                        ).readNative(addr + 88L).toIntArray(),
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
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32, (6).toInt())
                    ).writeNative(addr + 88L, value.fReserved.toList())
                }
            }
    }
}

public data class Statvfs64(
    public var fBsize: CUlong = 0uL,
    public var fFrsize: CUlong = 0uL,
    public var fBlocks: Fsblkcnt64T = 0uL,
    public var fBfree: Fsblkcnt64T = 0uL,
    public var fBavail: Fsblkcnt64T = 0uL,
    public var fFiles: Fsfilcnt64T = 0uL,
    public var fFfree: Fsfilcnt64T = 0uL,
    public var fFavail: Fsfilcnt64T = 0uL,
    public var fFsid: CUlong = 0uL,
    public var fFlag: CUlong = 0uL,
    public var fNamemax: CUlong = 0uL,
    public var fReserved: IntArray = IntArray(6),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Statvfs64) return false
        if (this.fBsize != other.fBsize) return false
        if (this.fFrsize != other.fFrsize) return false
        if (this.fBlocks != other.fBlocks) return false
        if (this.fBfree != other.fBfree) return false
        if (this.fBavail != other.fBavail) return false
        if (this.fFiles != other.fFiles) return false
        if (this.fFfree != other.fFfree) return false
        if (this.fFavail != other.fFavail) return false
        if (this.fFsid != other.fFsid) return false
        if (this.fFlag != other.fFlag) return false
        if (this.fNamemax != other.fNamemax) return false
        if (!this.fReserved.contentEquals(other.fReserved)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.fBsize.hashCode()
        result = 31 * result + this.fFrsize.hashCode()
        result = 31 * result + this.fBlocks.hashCode()
        result = 31 * result + this.fBfree.hashCode()
        result = 31 * result + this.fBavail.hashCode()
        result = 31 * result + this.fFiles.hashCode()
        result = 31 * result + this.fFfree.hashCode()
        result = 31 * result + this.fFavail.hashCode()
        result = 31 * result + this.fFsid.hashCode()
        result = 31 * result + this.fFlag.hashCode()
        result = 31 * result + this.fNamemax.hashCode()
        result = 31 * result + this.fReserved.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Statvfs64> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Statvfs64> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 112L
                override fun readNative(addr: Long): Statvfs64 =
                    Statvfs64(
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
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32, (6).toInt())
                        ).readNative(addr + 88L).toIntArray(),
                    )
                override fun writeNative(addr: Long, value: Statvfs64) {
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
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32, (6).toInt())
                    ).writeNative(addr + 88L, value.fReserved.toList())
                }
            }
    }
}

public data class Termios(
    public var cIflag: TcflagT = 0u,
    public var cOflag: TcflagT = 0u,
    public var cCflag: TcflagT = 0u,
    public var cLflag: TcflagT = 0u,
    public var cLine: CcT = 0u,
    public var cCc: UByteArray = UByteArray(NCCS),
    public var cIspeed: SpeedT = 0u,
    public var cOspeed: SpeedT = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Termios) return false
        if (this.cIflag != other.cIflag) return false
        if (this.cOflag != other.cOflag) return false
        if (this.cCflag != other.cCflag) return false
        if (this.cLflag != other.cLflag) return false
        if (this.cLine != other.cLine) return false
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
        result = 31 * result + this.cLine.hashCode()
        result = 31 * result + this.cCc.contentHashCode()
        result = 31 * result + this.cIspeed.hashCode()
        result = 31 * result + this.cOspeed.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Termios> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Termios> {
                override val alignBytes: Long = 4L
                private val off6: Long =
                    io.github.kotlinmania.rustlang.core.mem
                        .alignUpBytes((17L + ((NCCS).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).strideBytes)), 4L)
                private val off7: Long =
                    io.github.kotlinmania.rustlang.core.mem
                        .alignUpBytes((off6 + 4L), 4L)
                override val sizeBytes: Long =
                    io.github.kotlinmania.rustlang.core.mem
                        .alignUpBytes((off7 + 4L), 4L)
                override fun readNative(addr: Long): Termios =
                    Termios(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 16L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (NCCS))
                        ).readNative(addr + 17L).toUByteArray(),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + off6),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + off7),
                    )
                override fun writeNative(addr: Long, value: Termios) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.cIflag)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.cOflag)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.cCflag)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.cLflag)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 16L, value.cLine)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (NCCS))
                    ).writeNative(addr + 17L, value.cCc.toList())
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + off6, value.cIspeed)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + off7, value.cOspeed)
                }
            }
    }
}

public data class Flock(
    public var lType: CShort = 0,
    public var lWhence: CShort = 0,
    public var lStart: OffT = 0L,
    public var lLen: OffT = 0L,
    public var lPid: PidT = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Flock> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Flock> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 32L
                override fun readNative(addr: Long): Flock =
                    Flock(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).readNative(addr + 2L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 24L),
                    )
                override fun writeNative(addr: Long, value: Flock) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).writeNative(addr, value.lType)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).writeNative(addr + 2L, value.lWhence)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 8L, value.lStart)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 16L, value.lLen)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 24L, value.lPid)
                }
            }
    }
}

public data class Flock64(
    public var lType: CShort = 0,
    public var lWhence: CShort = 0,
    public var lStart: Off64T = 0L,
    public var lLen: Off64T = 0L,
    public var lPid: PidT = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Flock64> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Flock64> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 32L
                override fun readNative(addr: Long): Flock64 =
                    Flock64(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).readNative(addr + 2L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 24L),
                    )
                override fun writeNative(addr: Long, value: Flock64) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).writeNative(addr, value.lType)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).writeNative(addr + 2L, value.lWhence)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 8L, value.lStart)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 16L, value.lLen)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 24L, value.lPid)
                }
            }
    }
}

public class RegexT internal constructor(
    public var reNsub: SizeT,
    opaqueCtorArg: MutPtr,
    paddingCtorArg: List<MutPtr>,
    public var nsub2: SizeT,
    public var padding2: CChar,
) {
    public var opaque: MutPtr = opaqueCtorArg
        internal set

    public var padding: List<MutPtr> = paddingCtorArg
        internal set

    public constructor() : this(
        reNsub = 0uL,
        opaqueCtorArg = MutPtr(0L),
        paddingCtorArg = List(4) { MutPtr(0L) },
        nsub2 = 0uL,
        padding2 = 0u,
    )

    public operator fun component1(): SizeT = this.reNsub

    public operator fun component2(): MutPtr = this.opaque

    public operator fun component3(): List<MutPtr> = this.padding

    public operator fun component4(): SizeT = this.nsub2

    public operator fun component5(): CChar = this.padding2

    public fun copy(reNsub: SizeT = this.reNsub, opaque: MutPtr = this.opaque, padding: List<MutPtr> = this.padding, nsub2: SizeT = this.nsub2, padding2: CChar = this.padding2): RegexT = RegexT(reNsub = reNsub, opaqueCtorArg = opaque, paddingCtorArg = padding, nsub2 = nsub2, padding2 = padding2)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is RegexT) return false
        if (this.reNsub != other.reNsub) return false
        if (this.opaque != other.opaque) return false
        if (this.padding != other.padding) return false
        if (this.nsub2 != other.nsub2) return false
        if (this.padding2 != other.padding2) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.reNsub.hashCode()
        result = 31 * result + this.opaque.hashCode()
        result = 31 * result + this.padding.hashCode()
        result = 31 * result + this.nsub2.hashCode()
        result = 31 * result + this.padding2.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<RegexT> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<RegexT> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 64L
                override fun readNative(addr: Long): RegexT =
                    RegexT(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 8L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(
                                    io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                        .mutPtrLayout(64),
                                    (4).toInt(),
                                )
                        ).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 48L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 56L),
                    )
                override fun writeNative(addr: Long, value: RegexT) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr, value.reNsub)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 8L, value.opaque)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(
                                io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                    .mutPtrLayout(64),
                                (4).toInt(),
                            )
                    ).writeNative(addr + 16L, value.padding)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 48L, value.nsub2)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 56L, value.padding2)
                }
            }

        public operator fun invoke(
            reNsub: SizeT = 0uL,
            opaque: MutPtr = MutPtr(0L),
            padding: List<MutPtr> = List(4) { MutPtr(0L) },
            nsub2: SizeT = 0uL,
            padding2: CChar = 0u,
        ): RegexT =
            RegexT(
                reNsub = reNsub,
                opaqueCtorArg = opaque,
                paddingCtorArg = padding,
                nsub2 = nsub2,
                padding2 = padding2,
            )
    }
}

public class Rtentry internal constructor(
    public var rtPad1: CUlong,
    public var rtDst: Sockaddr,
    public var rtGateway: Sockaddr,
    public var rtGenmask: Sockaddr,
    public var rtFlags: CUshort,
    public var rtPad2: CShort,
    public var rtPad3: CUlong,
    public var rtTos: CUchar,
    public var rtClass: CUchar,
    public var rtPad4: ShortArray,
    public var rtMetric: CShort,
    rtDevCtorArg: MutPtr,
    public var rtMtu: CUlong,
    public var rtWindow: CUlong,
    public var rtIrtt: CUshort,
) {
    public var rtDev: MutPtr = rtDevCtorArg
        internal set

    public constructor() : this(
        rtPad1 = 0uL,
        rtDst = Sockaddr(),
        rtGateway = Sockaddr(),
        rtGenmask = Sockaddr(),
        rtFlags = 0u,
        rtPad2 = 0,
        rtPad3 = 0uL,
        rtTos = 0u,
        rtClass = 0u,
        rtPad4 = ShortArray(3),
        rtMetric = 0,
        rtDevCtorArg = MutPtr(0L),
        rtMtu = 0uL,
        rtWindow = 0uL,
        rtIrtt = 0u,
    )

    public operator fun component1(): CUlong = this.rtPad1

    public operator fun component2(): Sockaddr = this.rtDst

    public operator fun component3(): Sockaddr = this.rtGateway

    public operator fun component4(): Sockaddr = this.rtGenmask

    public operator fun component5(): CUshort = this.rtFlags

    public operator fun component6(): CShort = this.rtPad2

    public operator fun component7(): CUlong = this.rtPad3

    public operator fun component8(): CUchar = this.rtTos

    public operator fun component9(): CUchar = this.rtClass

    public operator fun component10(): ShortArray = this.rtPad4

    public operator fun component11(): CShort = this.rtMetric

    public operator fun component12(): MutPtr = this.rtDev

    public operator fun component13(): CUlong = this.rtMtu

    public operator fun component14(): CUlong = this.rtWindow

    public operator fun component15(): CUshort = this.rtIrtt

    public fun copy(rtPad1: CUlong = this.rtPad1, rtDst: Sockaddr = this.rtDst, rtGateway: Sockaddr = this.rtGateway, rtGenmask: Sockaddr = this.rtGenmask, rtFlags: CUshort = this.rtFlags, rtPad2: CShort = this.rtPad2, rtPad3: CUlong = this.rtPad3, rtTos: CUchar = this.rtTos, rtClass: CUchar = this.rtClass, rtPad4: ShortArray = this.rtPad4, rtMetric: CShort = this.rtMetric, rtDev: MutPtr = this.rtDev, rtMtu: CUlong = this.rtMtu, rtWindow: CUlong = this.rtWindow, rtIrtt: CUshort = this.rtIrtt): Rtentry = Rtentry(rtPad1 = rtPad1, rtDst = rtDst, rtGateway = rtGateway, rtGenmask = rtGenmask, rtFlags = rtFlags, rtPad2 = rtPad2, rtPad3 = rtPad3, rtTos = rtTos, rtClass = rtClass, rtPad4 = rtPad4, rtMetric = rtMetric, rtDevCtorArg = rtDev, rtMtu = rtMtu, rtWindow = rtWindow, rtIrtt = rtIrtt)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Rtentry) return false
        if (this.rtPad1 != other.rtPad1) return false
        if (this.rtDst != other.rtDst) return false
        if (this.rtGateway != other.rtGateway) return false
        if (this.rtGenmask != other.rtGenmask) return false
        if (this.rtFlags != other.rtFlags) return false
        if (this.rtPad2 != other.rtPad2) return false
        if (this.rtPad3 != other.rtPad3) return false
        if (this.rtTos != other.rtTos) return false
        if (this.rtClass != other.rtClass) return false
        if (!this.rtPad4.contentEquals(other.rtPad4)) return false
        if (this.rtMetric != other.rtMetric) return false
        if (this.rtDev != other.rtDev) return false
        if (this.rtMtu != other.rtMtu) return false
        if (this.rtWindow != other.rtWindow) return false
        if (this.rtIrtt != other.rtIrtt) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.rtPad1.hashCode()
        result = 31 * result + this.rtDst.hashCode()
        result = 31 * result + this.rtGateway.hashCode()
        result = 31 * result + this.rtGenmask.hashCode()
        result = 31 * result + this.rtFlags.hashCode()
        result = 31 * result + this.rtPad2.hashCode()
        result = 31 * result + this.rtPad3.hashCode()
        result = 31 * result + this.rtTos.hashCode()
        result = 31 * result + this.rtClass.hashCode()
        result = 31 * result + this.rtPad4.contentHashCode()
        result = 31 * result + this.rtMetric.hashCode()
        result = 31 * result + this.rtDev.hashCode()
        result = 31 * result + this.rtMtu.hashCode()
        result = 31 * result + this.rtWindow.hashCode()
        result = 31 * result + this.rtIrtt.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            rtPad1: CUlong = 0uL,
            rtDst: Sockaddr = Sockaddr(),
            rtGateway: Sockaddr = Sockaddr(),
            rtGenmask: Sockaddr = Sockaddr(),
            rtFlags: CUshort = 0u,
            rtPad2: CShort = 0,
            rtPad3: CUlong = 0uL,
            rtTos: CUchar = 0u,
            rtClass: CUchar = 0u,
            rtPad4: ShortArray = ShortArray(3),
            rtMetric: CShort = 0,
            rtDev: MutPtr = MutPtr(0L),
            rtMtu: CUlong = 0uL,
            rtWindow: CUlong = 0uL,
            rtIrtt: CUshort = 0u,
        ): Rtentry =
            Rtentry(
                rtPad1 = rtPad1,
                rtDst = rtDst,
                rtGateway = rtGateway,
                rtGenmask = rtGenmask,
                rtFlags = rtFlags,
                rtPad2 = rtPad2,
                rtPad3 = rtPad3,
                rtTos = rtTos,
                rtClass = rtClass,
                rtPad4 = rtPad4,
                rtMetric = rtMetric,
                rtDevCtorArg = rtDev,
                rtMtu = rtMtu,
                rtWindow = rtWindow,
                rtIrtt = rtIrtt,
            )
    }
}

public data class ExitStatus(
    public var eTermination: CShort = 0,
    public var eExit: CShort = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ExitStatus> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ExitStatus> {
                override val alignBytes: Long = 2L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): ExitStatus =
                    ExitStatus(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).readNative(addr + 2L),
                    )
                override fun writeNative(addr: Long, value: ExitStatus) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).writeNative(addr, value.eTermination)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).writeNative(addr + 2L, value.eExit)
                }
            }
    }
}

public data class Elf64Chdr(
    public var chType: Elf64Word = 0u,
    public var chReserved: Elf64Word = 0u,
    public var chSize: Elf64Xword = 0uL,
    public var chAddralign: Elf64Xword = 0uL,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Elf64Chdr> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Elf64Chdr> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 24L
                override fun readNative(addr: Long): Elf64Chdr =
                    Elf64Chdr(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: Elf64Chdr) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.chType)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.chReserved)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 8L, value.chSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 16L, value.chAddralign)
                }
            }
    }
}

public data class Elf32Chdr(
    public var chType: Elf32Word = 0u,
    public var chSize: Elf32Word = 0u,
    public var chAddralign: Elf32Word = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Elf32Chdr> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Elf32Chdr> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 12L
                override fun readNative(addr: Long): Elf32Chdr =
                    Elf32Chdr(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: Elf32Chdr) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.chType)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.chSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.chAddralign)
                }
            }
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
    public var time: Timeval = Timeval(),
    public var tick: CLong = 0L,
    public var ppsfreq: CLong = 0L,
    public var jitter: CLong = 0L,
    public var shift: CInt = 0,
    public var stabil: CLong = 0L,
    public var jitcnt: CLong = 0L,
    public var calcnt: CLong = 0L,
    public var errcnt: CLong = 0L,
    public var stbcnt: CLong = 0L,
    public var tai: CInt = 0,
    public var padding: IntArray = IntArray(11),
)

public data class Ntptimeval(
    public var time: Timeval = Timeval(),
    public var maxerror: CLong = 0L,
    public var esterror: CLong = 0L,
)

// netinet/tcp.h
public class TcpInfo(
    public var tcpiState: UByte = 0u,
    public var tcpiCaState: UByte = 0u,
    public var tcpiRetransmits: UByte = 0u,
    public var tcpiProbes: UByte = 0u,
    public var tcpiBackoff: UByte = 0u,
    public var tcpiOptions: UByte = 0u,
    /**
     * This contains the bitfields `tcpiSndWscale` and `tcpiRcvWscale`.
     * Each is 4 bits.
     */
    public var tcpiSndRcvWscale: UByte = 0u,
    /**
     * This contains the bitfields `tcpiDeliveryRateAppLimited` (1 bit) and
     * `tcpiFastopenClientFail` (2 bits).
     */
    public var tcpiDeliveryFastopenBitfields: UByte = 0u,
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
    public var tcpiTotalRetrans: UInt = 0u,
    public var tcpiPacingRate: ULong = 0uL,
    public var tcpiMaxPacingRate: ULong = 0uL,
    public var tcpiBytesAcked: ULong = 0uL,
    public var tcpiBytesReceived: ULong = 0uL,
    public var tcpiSegsOut: UInt = 0u,
    public var tcpiSegsIn: UInt = 0u,
    public var tcpiNotsentBytes: UInt = 0u,
    public var tcpiMinRtt: UInt = 0u,
    public var tcpiDataSegsIn: UInt = 0u,
    public var tcpiDataSegsOut: UInt = 0u,
    public var tcpiDeliveryRate: ULong = 0uL,
    public var tcpiBusyTime: ULong = 0uL,
    public var tcpiRwndLimited: ULong = 0uL,
    public var tcpiSndbufLimited: ULong = 0uL,
    public var tcpiDelivered: UInt = 0u,
    public var tcpiDeliveredCe: UInt = 0u,
    public var tcpiBytesSent: ULong = 0uL,
    public var tcpiBytesRetrans: ULong = 0uL,
    public var tcpiDsackDups: UInt = 0u,
    public var tcpiReordSeen: UInt = 0u,
    public var tcpiRcvOoopack: UInt = 0u,
    public var tcpiSndWnd: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<TcpInfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<TcpInfo> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 232L
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
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 104L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 112L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 120L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 128L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 136L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 140L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 144L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 148L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 152L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 156L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 160L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 168L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 176L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 184L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 192L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 196L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 200L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 208L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 216L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 220L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 224L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 228L),
                    )
                override fun writeNative(addr: Long, value: TcpInfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr, value.tcpiState)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 1L, value.tcpiCaState)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 2L, value.tcpiRetransmits)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 3L, value.tcpiProbes)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 4L, value.tcpiBackoff)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 5L, value.tcpiOptions)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 6L, value.tcpiSndRcvWscale)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 7L, value.tcpiDeliveryFastopenBitfields)
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
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 100L, value.tcpiTotalRetrans)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 104L, value.tcpiPacingRate)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 112L, value.tcpiMaxPacingRate)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 120L, value.tcpiBytesAcked)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 128L, value.tcpiBytesReceived)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 136L, value.tcpiSegsOut)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 140L, value.tcpiSegsIn)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 144L, value.tcpiNotsentBytes)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 148L, value.tcpiMinRtt)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 152L, value.tcpiDataSegsIn)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 156L, value.tcpiDataSegsOut)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 160L, value.tcpiDeliveryRate)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 168L, value.tcpiBusyTime)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 176L, value.tcpiRwndLimited)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 184L, value.tcpiSndbufLimited)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 192L, value.tcpiDelivered)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 196L, value.tcpiDeliveredCe)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 200L, value.tcpiBytesSent)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 208L, value.tcpiBytesRetrans)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 216L, value.tcpiDsackDups)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 220L, value.tcpiReordSeen)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 224L, value.tcpiRcvOoopack)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 228L, value.tcpiSndWnd)
                }
            }
    }
}

public data class Statfs(
    public var fType: CUlong = 0uL,
    public var fBsize: CUlong = 0uL,
    public var fBlocks: FsblkcntT = 0uL,
    public var fBfree: FsblkcntT = 0uL,
    public var fBavail: FsblkcntT = 0uL,
    public var fFiles: FsfilcntT = 0uL,
    public var fFfree: FsfilcntT = 0uL,
    public var fFsid: FsidT = FsidT(),
    public var fNamelen: CUlong = 0uL,
    public var fFrsize: CUlong = 0uL,
    public var fFlags: CUlong = 0uL,
    public var fSpare: ULongArray = ULongArray(4),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Statfs) return false
        if (this.fType != other.fType) return false
        if (this.fBsize != other.fBsize) return false
        if (this.fBlocks != other.fBlocks) return false
        if (this.fBfree != other.fBfree) return false
        if (this.fBavail != other.fBavail) return false
        if (this.fFiles != other.fFiles) return false
        if (this.fFfree != other.fFfree) return false
        if (this.fFsid != other.fFsid) return false
        if (this.fNamelen != other.fNamelen) return false
        if (this.fFrsize != other.fFrsize) return false
        if (this.fFlags != other.fFlags) return false
        if (!this.fSpare.contentEquals(other.fSpare)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.fType.hashCode()
        result = 31 * result + this.fBsize.hashCode()
        result = 31 * result + this.fBlocks.hashCode()
        result = 31 * result + this.fBfree.hashCode()
        result = 31 * result + this.fBavail.hashCode()
        result = 31 * result + this.fFiles.hashCode()
        result = 31 * result + this.fFfree.hashCode()
        result = 31 * result + this.fFsid.hashCode()
        result = 31 * result + this.fNamelen.hashCode()
        result = 31 * result + this.fFrsize.hashCode()
        result = 31 * result + this.fFlags.hashCode()
        result = 31 * result + this.fSpare.contentHashCode()
        return result
    }
}

public data class Statfs64(
    public var fType: CUlong = 0uL,
    public var fBsize: CUlong = 0uL,
    public var fBlocks: Fsblkcnt64T = 0uL,
    public var fBfree: Fsblkcnt64T = 0uL,
    public var fBavail: Fsblkcnt64T = 0uL,
    public var fFiles: Fsfilcnt64T = 0uL,
    public var fFfree: Fsfilcnt64T = 0uL,
    public var fFsid: FsidT = FsidT(),
    public var fNamelen: CUlong = 0uL,
    public var fFrsize: CUlong = 0uL,
    public var fFlags: CUlong = 0uL,
    public var fSpare: ULongArray = ULongArray(4),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Statfs64) return false
        if (this.fType != other.fType) return false
        if (this.fBsize != other.fBsize) return false
        if (this.fBlocks != other.fBlocks) return false
        if (this.fBfree != other.fBfree) return false
        if (this.fBavail != other.fBavail) return false
        if (this.fFiles != other.fFiles) return false
        if (this.fFfree != other.fFfree) return false
        if (this.fFsid != other.fFsid) return false
        if (this.fNamelen != other.fNamelen) return false
        if (this.fFrsize != other.fFrsize) return false
        if (this.fFlags != other.fFlags) return false
        if (!this.fSpare.contentEquals(other.fSpare)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.fType.hashCode()
        result = 31 * result + this.fBsize.hashCode()
        result = 31 * result + this.fBlocks.hashCode()
        result = 31 * result + this.fBfree.hashCode()
        result = 31 * result + this.fBavail.hashCode()
        result = 31 * result + this.fFiles.hashCode()
        result = 31 * result + this.fFfree.hashCode()
        result = 31 * result + this.fFsid.hashCode()
        result = 31 * result + this.fNamelen.hashCode()
        result = 31 * result + this.fFrsize.hashCode()
        result = 31 * result + this.fFlags.hashCode()
        result = 31 * result + this.fSpare.contentHashCode()
        return result
    }
}

public data class Sysinfo(
    public var uptime: CUlong = 0uL,
    public var loads: ULongArray = ULongArray(3),
    public var totalram: CUlong = 0uL,
    public var freeram: CUlong = 0uL,
    public var sharedram: CUlong = 0uL,
    public var bufferram: CUlong = 0uL,
    public var totalswap: CUlong = 0uL,
    public var freeswap: CUlong = 0uL,
    public var procs: CUshort = 0u,
    public var pad: CUshort = 0u,
    public var totalhigh: CUlong = 0uL,
    public var freehigh: CUlong = 0uL,
    public var memUnit: CUint = 0u,
    public var reserved: UByteArray = UByteArray(256),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Sysinfo) return false
        if (this.uptime != other.uptime) return false
        if (!this.loads.contentEquals(other.loads)) return false
        if (this.totalram != other.totalram) return false
        if (this.freeram != other.freeram) return false
        if (this.sharedram != other.sharedram) return false
        if (this.bufferram != other.bufferram) return false
        if (this.totalswap != other.totalswap) return false
        if (this.freeswap != other.freeswap) return false
        if (this.procs != other.procs) return false
        if (this.pad != other.pad) return false
        if (this.totalhigh != other.totalhigh) return false
        if (this.freehigh != other.freehigh) return false
        if (this.memUnit != other.memUnit) return false
        if (!this.reserved.contentEquals(other.reserved)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.uptime.hashCode()
        result = 31 * result + this.loads.contentHashCode()
        result = 31 * result + this.totalram.hashCode()
        result = 31 * result + this.freeram.hashCode()
        result = 31 * result + this.sharedram.hashCode()
        result = 31 * result + this.bufferram.hashCode()
        result = 31 * result + this.totalswap.hashCode()
        result = 31 * result + this.freeswap.hashCode()
        result = 31 * result + this.procs.hashCode()
        result = 31 * result + this.pad.hashCode()
        result = 31 * result + this.totalhigh.hashCode()
        result = 31 * result + this.freehigh.hashCode()
        result = 31 * result + this.memUnit.hashCode()
        result = 31 * result + this.reserved.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Sysinfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Sysinfo> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 368L
                override fun readNative(addr: Long): Sysinfo =
                    Sysinfo(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64, (3).toInt())
                        ).readNative(addr + 8L).toULongArray(),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 32L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 40L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 48L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 56L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 64L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 72L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 80L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 82L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 88L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 96L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 104L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (256).toInt())
                        ).readNative(addr + 108L).toUByteArray(),
                    )
                override fun writeNative(addr: Long, value: Sysinfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr, value.uptime)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64, (3).toInt())
                    ).writeNative(addr + 8L, value.loads.toList())
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 32L, value.totalram)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 40L, value.freeram)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 48L, value.sharedram)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 56L, value.bufferram)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 64L, value.totalswap)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 72L, value.freeswap)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 80L, value.procs)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 82L, value.pad)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 88L, value.totalhigh)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 96L, value.freehigh)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 104L, value.memUnit)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (256).toInt())
                    ).writeNative(addr + 108L, value.reserved.toList())
                }
            }
    }
}

public data class Utmpx(
    public var utType: CShort = 0,
    public var utPad1: CShort = 0,
    public var utPid: PidT = 0,
    public var utLine: UByteArray = UByteArray(32),
    public var utId: UByteArray = UByteArray(4),
    public var utUser: UByteArray = UByteArray(32),
    public var utHost: UByteArray = UByteArray(256),
    public var utExit: ExitStatus = ExitStatus(),
    public var utSession: CLong = 0L,
    public var utPad2: CInt = 0,
    public var utTv: Timeval = Timeval(),
    public var utAddrV6: UIntArray = UIntArray(4),
    public var unused: UByteArray = UByteArray(20),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Utmpx) return false
        if (this.utType != other.utType) return false
        if (this.utPad1 != other.utPad1) return false
        if (this.utPid != other.utPid) return false
        if (!this.utLine.contentEquals(other.utLine)) return false
        if (!this.utId.contentEquals(other.utId)) return false
        if (!this.utUser.contentEquals(other.utUser)) return false
        if (!this.utHost.contentEquals(other.utHost)) return false
        if (this.utExit != other.utExit) return false
        if (this.utSession != other.utSession) return false
        if (this.utPad2 != other.utPad2) return false
        if (this.utTv != other.utTv) return false
        if (!this.utAddrV6.contentEquals(other.utAddrV6)) return false
        if (!this.unused.contentEquals(other.unused)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.utType.hashCode()
        result = 31 * result + this.utPad1.hashCode()
        result = 31 * result + this.utPid.hashCode()
        result = 31 * result + this.utLine.contentHashCode()
        result = 31 * result + this.utId.contentHashCode()
        result = 31 * result + this.utUser.contentHashCode()
        result = 31 * result + this.utHost.contentHashCode()
        result = 31 * result + this.utExit.hashCode()
        result = 31 * result + this.utSession.hashCode()
        result = 31 * result + this.utPad2.hashCode()
        result = 31 * result + this.utTv.hashCode()
        result = 31 * result + this.utAddrV6.contentHashCode()
        result = 31 * result + this.unused.contentHashCode()
        return result
    }
}
