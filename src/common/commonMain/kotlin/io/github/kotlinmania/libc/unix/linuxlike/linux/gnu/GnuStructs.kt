@file:OptIn(ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.unix.linuxlike.linux.gnu

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CLong
import io.github.kotlinmania.libc.CShort
import io.github.kotlinmania.libc.CUlong
import io.github.kotlinmania.libc.unix.CcT
import io.github.kotlinmania.libc.unix.PidT
import io.github.kotlinmania.libc.unix.SizeT
import io.github.kotlinmania.libc.unix.SsizeT
import io.github.kotlinmania.libc.unix.UidT
import io.github.kotlinmania.libc.unix.linuxlike.Elf32Word
import io.github.kotlinmania.libc.unix.linuxlike.Elf64Word
import io.github.kotlinmania.libc.unix.linuxlike.Elf64Xword
import io.github.kotlinmania.libc.unix.linuxlike.Sigevent
import io.github.kotlinmania.libc.unix.linuxlike.SpeedT
import io.github.kotlinmania.libc.unix.linuxlike.TcflagT
import io.github.kotlinmania.libc.unix.linuxlike.linux.FanotifyEventInfoHeader
import io.github.kotlinmania.libc.unix.linuxlike.linux.Off64T
import io.github.kotlinmania.libc.unix.linuxlike.linux.S16
import io.github.kotlinmania.libc.unix.linuxlike.linux.S32
import io.github.kotlinmania.libc.unix.linuxlike.linux.SocklenT
import io.github.kotlinmania.libc.unix.linuxlike.linux.U16
import io.github.kotlinmania.libc.unix.linuxlike.linux.U32
import io.github.kotlinmania.libc.unix.linuxlike.linux.U8
import io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.b64.OffT
import io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.b64.TimeT
import io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.b64.aarch64.NCCS
import io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.b64.aarch64.S64
import io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.b64.aarch64.U64
import io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
import io.github.kotlinmania.rustlang.core.mem.TypeLayout
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

// Most `* _SUPER_MAGIC` constants are defined at the `linuxLike` level; the
// following are only available on newer Linux versions than the versions
// currently used in CI in some configurations, so we define them here.
public class Aiocb internal constructor(
    public var aioFildes: CInt,
    public var aioLioOpcode: CInt,
    public var aioReqprio: CInt,
    aioBufCtorArg: MutPtr,
    public var aioNbytes: SizeT,
    public var aioSigevent: Sigevent,
    nextPrioCtorArg: MutPtr,
    public var absPrio: CInt,
    public var policy: CInt,
    public var errorCode: CInt,
    public var returnValue: SsizeT,
    public var aioOffset: OffT,
    public var glibcReserved: UByteArray,
) {
    public var aioBuf: MutPtr = aioBufCtorArg
        internal set

    public var nextPrio: MutPtr = nextPrioCtorArg
        internal set

    public constructor() : this(
        aioFildes = 0,
        aioLioOpcode = 0,
        aioReqprio = 0,
        aioBufCtorArg = MutPtr(0L),
        aioNbytes = 0uL,
        aioSigevent = Sigevent(),
        nextPrioCtorArg = MutPtr(0L),
        absPrio = 0,
        policy = 0,
        errorCode = 0,
        returnValue = 0L,
        aioOffset = 0L,
        glibcReserved = UByteArray(32),
    )

    public operator fun component1(): CInt = this.aioFildes

    public operator fun component2(): CInt = this.aioLioOpcode

    public operator fun component3(): CInt = this.aioReqprio

    public operator fun component4(): MutPtr = this.aioBuf

    public operator fun component5(): SizeT = this.aioNbytes

    public operator fun component6(): Sigevent = this.aioSigevent

    public operator fun component7(): MutPtr = this.nextPrio

    public operator fun component8(): CInt = this.absPrio

    public operator fun component9(): CInt = this.policy

    public operator fun component10(): CInt = this.errorCode

    public operator fun component11(): SsizeT = this.returnValue

    public operator fun component12(): OffT = this.aioOffset

    public operator fun component13(): UByteArray = this.glibcReserved

    public fun copy(aioFildes: CInt = this.aioFildes, aioLioOpcode: CInt = this.aioLioOpcode, aioReqprio: CInt = this.aioReqprio, aioBuf: MutPtr = this.aioBuf, aioNbytes: SizeT = this.aioNbytes, aioSigevent: Sigevent = this.aioSigevent, nextPrio: MutPtr = this.nextPrio, absPrio: CInt = this.absPrio, policy: CInt = this.policy, errorCode: CInt = this.errorCode, returnValue: SsizeT = this.returnValue, aioOffset: OffT = this.aioOffset, glibcReserved: UByteArray = this.glibcReserved): Aiocb = Aiocb(aioFildes = aioFildes, aioLioOpcode = aioLioOpcode, aioReqprio = aioReqprio, aioBufCtorArg = aioBuf, aioNbytes = aioNbytes, aioSigevent = aioSigevent, nextPrioCtorArg = nextPrio, absPrio = absPrio, policy = policy, errorCode = errorCode, returnValue = returnValue, aioOffset = aioOffset, glibcReserved = glibcReserved)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Aiocb) return false
        if (this.aioFildes != other.aioFildes) return false
        if (this.aioLioOpcode != other.aioLioOpcode) return false
        if (this.aioReqprio != other.aioReqprio) return false
        if (this.aioBuf != other.aioBuf) return false
        if (this.aioNbytes != other.aioNbytes) return false
        if (this.aioSigevent != other.aioSigevent) return false
        if (this.nextPrio != other.nextPrio) return false
        if (this.absPrio != other.absPrio) return false
        if (this.policy != other.policy) return false
        if (this.errorCode != other.errorCode) return false
        if (this.returnValue != other.returnValue) return false
        if (this.aioOffset != other.aioOffset) return false
        if (!this.glibcReserved.contentEquals(other.glibcReserved)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.aioFildes.hashCode()
        result = 31 * result + this.aioLioOpcode.hashCode()
        result = 31 * result + this.aioReqprio.hashCode()
        result = 31 * result + this.aioBuf.hashCode()
        result = 31 * result + this.aioNbytes.hashCode()
        result = 31 * result + this.aioSigevent.hashCode()
        result = 31 * result + this.nextPrio.hashCode()
        result = 31 * result + this.absPrio.hashCode()
        result = 31 * result + this.policy.hashCode()
        result = 31 * result + this.errorCode.hashCode()
        result = 31 * result + this.returnValue.hashCode()
        result = 31 * result + this.aioOffset.hashCode()
        result = 31 * result + this.glibcReserved.contentHashCode()
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
            nextPrio: MutPtr = MutPtr(0L),
            absPrio: CInt = 0,
            policy: CInt = 0,
            errorCode: CInt = 0,
            returnValue: SsizeT = 0L,
            aioOffset: OffT = 0L,
            glibcReserved: UByteArray = UByteArray(32),
        ): Aiocb =
            Aiocb(
                aioFildes = aioFildes,
                aioLioOpcode = aioLioOpcode,
                aioReqprio = aioReqprio,
                aioBufCtorArg = aioBuf,
                aioNbytes = aioNbytes,
                aioSigevent = aioSigevent,
                nextPrioCtorArg = nextPrio,
                absPrio = absPrio,
                policy = policy,
                errorCode = errorCode,
                returnValue = returnValue,
                aioOffset = aioOffset,
                glibcReserved = glibcReserved,
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

public data class Timeval(
    public var tvSec: Int = 0,
    public var tvUsec: Int = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Timeval> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Timeval> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): Timeval =
                    Timeval(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: Timeval) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.tvSec)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 4L, value.tvUsec)
                }
            }
    }
}

public class Glob64T internal constructor(
    public var glPathc: SizeT,
    glPathvCtorArg: MutPtr,
    public var glOffs: SizeT,
    public var glFlags: CInt,
    unused1CtorArg: MutPtr,
    unused2CtorArg: MutPtr,
    unused3CtorArg: MutPtr,
    unused4CtorArg: MutPtr,
    unused5CtorArg: MutPtr,
) {
    public var glPathv: MutPtr = glPathvCtorArg
        internal set

    public var unused1: MutPtr = unused1CtorArg
        internal set

    public var unused2: MutPtr = unused2CtorArg
        internal set

    public var unused3: MutPtr = unused3CtorArg
        internal set

    public var unused4: MutPtr = unused4CtorArg
        internal set

    public var unused5: MutPtr = unused5CtorArg
        internal set

    public constructor() : this(
        glPathc = 0uL,
        glPathvCtorArg = MutPtr(0L),
        glOffs = 0uL,
        glFlags = 0,
        unused1CtorArg = MutPtr(0L),
        unused2CtorArg = MutPtr(0L),
        unused3CtorArg = MutPtr(0L),
        unused4CtorArg = MutPtr(0L),
        unused5CtorArg = MutPtr(0L),
    )

    public operator fun component1(): SizeT = this.glPathc

    public operator fun component2(): MutPtr = this.glPathv

    public operator fun component3(): SizeT = this.glOffs

    public operator fun component4(): CInt = this.glFlags

    public operator fun component5(): MutPtr = this.unused1

    public operator fun component6(): MutPtr = this.unused2

    public operator fun component7(): MutPtr = this.unused3

    public operator fun component8(): MutPtr = this.unused4

    public operator fun component9(): MutPtr = this.unused5

    public fun copy(glPathc: SizeT = this.glPathc, glPathv: MutPtr = this.glPathv, glOffs: SizeT = this.glOffs, glFlags: CInt = this.glFlags, unused1: MutPtr = this.unused1, unused2: MutPtr = this.unused2, unused3: MutPtr = this.unused3, unused4: MutPtr = this.unused4, unused5: MutPtr = this.unused5): Glob64T = Glob64T(glPathc = glPathc, glPathvCtorArg = glPathv, glOffs = glOffs, glFlags = glFlags, unused1CtorArg = unused1, unused2CtorArg = unused2, unused3CtorArg = unused3, unused4CtorArg = unused4, unused5CtorArg = unused5)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Glob64T) return false
        if (this.glPathc != other.glPathc) return false
        if (this.glPathv != other.glPathv) return false
        if (this.glOffs != other.glOffs) return false
        if (this.glFlags != other.glFlags) return false
        if (this.unused1 != other.unused1) return false
        if (this.unused2 != other.unused2) return false
        if (this.unused3 != other.unused3) return false
        if (this.unused4 != other.unused4) return false
        if (this.unused5 != other.unused5) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.glPathc.hashCode()
        result = 31 * result + this.glPathv.hashCode()
        result = 31 * result + this.glOffs.hashCode()
        result = 31 * result + this.glFlags.hashCode()
        result = 31 * result + this.unused1.hashCode()
        result = 31 * result + this.unused2.hashCode()
        result = 31 * result + this.unused3.hashCode()
        result = 31 * result + this.unused4.hashCode()
        result = 31 * result + this.unused5.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Glob64T> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Glob64T> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 72L
                override fun readNative(addr: Long): Glob64T =
                    Glob64T(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 24L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 32L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 40L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 48L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 56L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 64L),
                    )
                override fun writeNative(addr: Long, value: Glob64T) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr, value.glPathc)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 8L, value.glPathv)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 16L, value.glOffs)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 24L, value.glFlags)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 32L, value.unused1)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 40L, value.unused2)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 48L, value.unused3)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 56L, value.unused4)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 64L, value.unused5)
                }
            }

        public operator fun invoke(
            glPathc: SizeT = 0uL,
            glPathv: MutPtr = MutPtr(0L),
            glOffs: SizeT = 0uL,
            glFlags: CInt = 0,
            unused1: MutPtr = MutPtr(0L),
            unused2: MutPtr = MutPtr(0L),
            unused3: MutPtr = MutPtr(0L),
            unused4: MutPtr = MutPtr(0L),
            unused5: MutPtr = MutPtr(0L),
        ): Glob64T =
            Glob64T(
                glPathc = glPathc,
                glPathvCtorArg = glPathv,
                glOffs = glOffs,
                glFlags = glFlags,
                unused1CtorArg = unused1,
                unused2CtorArg = unused2,
                unused3CtorArg = unused3,
                unused4CtorArg = unused4,
                unused5CtorArg = unused5,
            )
    }
}

public class Msghdr internal constructor(
    msgNameCtorArg: MutPtr,
    public var msgNamelen: SocklenT,
    msgIovCtorArg: MutPtr,
    public var msgIovlen: SizeT,
    msgControlCtorArg: MutPtr,
    public var msgControllen: SizeT,
    public var msgFlags: CInt,
) {
    public var msgName: MutPtr = msgNameCtorArg
        internal set

    public var msgIov: MutPtr = msgIovCtorArg
        internal set

    public var msgControl: MutPtr = msgControlCtorArg
        internal set

    public constructor() : this(
        msgNameCtorArg = MutPtr(0L),
        msgNamelen = 0u,
        msgIovCtorArg = MutPtr(0L),
        msgIovlen = 0uL,
        msgControlCtorArg = MutPtr(0L),
        msgControllen = 0uL,
        msgFlags = 0,
    )

    public operator fun component1(): MutPtr = this.msgName

    public operator fun component2(): SocklenT = this.msgNamelen

    public operator fun component3(): MutPtr = this.msgIov

    public operator fun component4(): SizeT = this.msgIovlen

    public operator fun component5(): MutPtr = this.msgControl

    public operator fun component6(): SizeT = this.msgControllen

    public operator fun component7(): CInt = this.msgFlags

    public fun copy(msgName: MutPtr = this.msgName, msgNamelen: SocklenT = this.msgNamelen, msgIov: MutPtr = this.msgIov, msgIovlen: SizeT = this.msgIovlen, msgControl: MutPtr = this.msgControl, msgControllen: SizeT = this.msgControllen, msgFlags: CInt = this.msgFlags): Msghdr = Msghdr(msgNameCtorArg = msgName, msgNamelen = msgNamelen, msgIovCtorArg = msgIov, msgIovlen = msgIovlen, msgControlCtorArg = msgControl, msgControllen = msgControllen, msgFlags = msgFlags)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Msghdr) return false
        if (this.msgName != other.msgName) return false
        if (this.msgNamelen != other.msgNamelen) return false
        if (this.msgIov != other.msgIov) return false
        if (this.msgIovlen != other.msgIovlen) return false
        if (this.msgControl != other.msgControl) return false
        if (this.msgControllen != other.msgControllen) return false
        if (this.msgFlags != other.msgFlags) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.msgName.hashCode()
        result = 31 * result + this.msgNamelen.hashCode()
        result = 31 * result + this.msgIov.hashCode()
        result = 31 * result + this.msgIovlen.hashCode()
        result = 31 * result + this.msgControl.hashCode()
        result = 31 * result + this.msgControllen.hashCode()
        result = 31 * result + this.msgFlags.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Msghdr> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Msghdr> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 56L
                override fun readNative(addr: Long): Msghdr =
                    Msghdr(
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 24L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 32L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 40L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 48L),
                    )
                override fun writeNative(addr: Long, value: Msghdr) {
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr, value.msgName)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.msgNamelen)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 16L, value.msgIov)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 24L, value.msgIovlen)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 32L, value.msgControl)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 40L, value.msgControllen)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 48L, value.msgFlags)
                }
            }

        public operator fun invoke(
            msgName: MutPtr = MutPtr(0L),
            msgNamelen: SocklenT = 0u,
            msgIov: MutPtr = MutPtr(0L),
            msgIovlen: SizeT = 0uL,
            msgControl: MutPtr = MutPtr(0L),
            msgControllen: SizeT = 0uL,
            msgFlags: CInt = 0,
        ): Msghdr =
            Msghdr(
                msgNameCtorArg = msgName,
                msgNamelen = msgNamelen,
                msgIovCtorArg = msgIov,
                msgIovlen = msgIovlen,
                msgControlCtorArg = msgControl,
                msgControllen = msgControllen,
                msgFlags = msgFlags,
            )
    }
}

public data class Cmsghdr(
    public var cmsgLen: SizeT = 0uL,
    public var cmsgLevel: CInt = 0,
    public var cmsgType: CInt = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Cmsghdr> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Cmsghdr> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): Cmsghdr =
                    Cmsghdr(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 12L),
                    )
                override fun writeNative(addr: Long, value: Cmsghdr) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr, value.cmsgLen)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 8L, value.cmsgLevel)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 12L, value.cmsgType)
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

public data class Mallinfo(
    public var arena: CInt = 0,
    public var ordblks: CInt = 0,
    public var smblks: CInt = 0,
    public var hblks: CInt = 0,
    public var hblkhd: CInt = 0,
    public var usmblks: CInt = 0,
    public var fsmblks: CInt = 0,
    public var uordblks: CInt = 0,
    public var fordblks: CInt = 0,
    public var keepcost: CInt = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Mallinfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Mallinfo> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 40L
                override fun readNative(addr: Long): Mallinfo =
                    Mallinfo(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 20L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 28L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 32L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 36L),
                    )
                override fun writeNative(addr: Long, value: Mallinfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.arena)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 4L, value.ordblks)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 8L, value.smblks)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 12L, value.hblks)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 16L, value.hblkhd)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 20L, value.usmblks)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 24L, value.fsmblks)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 28L, value.uordblks)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 32L, value.fordblks)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 36L, value.keepcost)
                }
            }
    }
}

public data class Mallinfo2(
    public var arena: SizeT = 0uL,
    public var ordblks: SizeT = 0uL,
    public var smblks: SizeT = 0uL,
    public var hblks: SizeT = 0uL,
    public var hblkhd: SizeT = 0uL,
    public var usmblks: SizeT = 0uL,
    public var fsmblks: SizeT = 0uL,
    public var uordblks: SizeT = 0uL,
    public var fordblks: SizeT = 0uL,
    public var keepcost: SizeT = 0uL,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Mallinfo2> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Mallinfo2> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 80L
                override fun readNative(addr: Long): Mallinfo2 =
                    Mallinfo2(
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
                    )
                override fun writeNative(addr: Long, value: Mallinfo2) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr, value.arena)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 8L, value.ordblks)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 16L, value.smblks)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 24L, value.hblks)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 32L, value.hblkhd)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 40L, value.usmblks)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 48L, value.fsmblks)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 56L, value.uordblks)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 64L, value.fordblks)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 72L, value.keepcost)
                }
            }
    }
}

public data class Ntptimeval(
    public var time: Timeval = Timeval(),
    public var maxerror: CLong = 0L,
    public var esterror: CLong = 0L,
    public var tai: CLong = 0L,
    public var glibcReserved1: CLong = 0L,
    public var glibcReserved2: CLong = 0L,
    public var glibcReserved3: CLong = 0L,
    public var glibcReserved4: CLong = 0L,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Ntptimeval> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Ntptimeval> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 64L
                override fun readNative(addr: Long): Ntptimeval =
                    Ntptimeval(
                        (Timeval.typeLayout()).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 32L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 40L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 48L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 56L),
                    )
                override fun writeNative(addr: Long, value: Ntptimeval) {
                    (Timeval.typeLayout()).writeNative(addr, value.time)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 8L, value.maxerror)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 16L, value.esterror)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 24L, value.tai)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 32L, value.glibcReserved1)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 40L, value.glibcReserved2)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 48L, value.glibcReserved3)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 56L, value.glibcReserved4)
                }
            }
    }
}

public class RegexT internal constructor(
    bufferCtorArg: MutPtr,
    public var allocated: SizeT,
    public var used: SizeT,
    public var syntax: CUlong,
    fastmapCtorArg: MutPtr,
    translateCtorArg: MutPtr,
    public var reNsub: SizeT,
    public var bitfield: UByte,
) {
    public var buffer: MutPtr = bufferCtorArg
        internal set

    public var fastmap: MutPtr = fastmapCtorArg
        internal set

    public var translate: MutPtr = translateCtorArg
        internal set

    public constructor() : this(
        bufferCtorArg = MutPtr(0L),
        allocated = 0uL,
        used = 0uL,
        syntax = 0uL,
        fastmapCtorArg = MutPtr(0L),
        translateCtorArg = MutPtr(0L),
        reNsub = 0uL,
        bitfield = 0u,
    )

    public operator fun component1(): MutPtr = this.buffer

    public operator fun component2(): SizeT = this.allocated

    public operator fun component3(): SizeT = this.used

    public operator fun component4(): CUlong = this.syntax

    public operator fun component5(): MutPtr = this.fastmap

    public operator fun component6(): MutPtr = this.translate

    public operator fun component7(): SizeT = this.reNsub

    public operator fun component8(): UByte = this.bitfield

    public fun copy(buffer: MutPtr = this.buffer, allocated: SizeT = this.allocated, used: SizeT = this.used, syntax: CUlong = this.syntax, fastmap: MutPtr = this.fastmap, translate: MutPtr = this.translate, reNsub: SizeT = this.reNsub, bitfield: UByte = this.bitfield): RegexT = RegexT(bufferCtorArg = buffer, allocated = allocated, used = used, syntax = syntax, fastmapCtorArg = fastmap, translateCtorArg = translate, reNsub = reNsub, bitfield = bitfield)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is RegexT) return false
        if (this.buffer != other.buffer) return false
        if (this.allocated != other.allocated) return false
        if (this.used != other.used) return false
        if (this.syntax != other.syntax) return false
        if (this.fastmap != other.fastmap) return false
        if (this.translate != other.translate) return false
        if (this.reNsub != other.reNsub) return false
        if (this.bitfield != other.bitfield) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.buffer.hashCode()
        result = 31 * result + this.allocated.hashCode()
        result = 31 * result + this.used.hashCode()
        result = 31 * result + this.syntax.hashCode()
        result = 31 * result + this.fastmap.hashCode()
        result = 31 * result + this.translate.hashCode()
        result = 31 * result + this.reNsub.hashCode()
        result = 31 * result + this.bitfield.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<RegexT> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<RegexT> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 64L
                override fun readNative(addr: Long): RegexT =
                    RegexT(
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 24L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 32L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 40L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 48L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 56L),
                    )
                override fun writeNative(addr: Long, value: RegexT) {
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr, value.buffer)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 8L, value.allocated)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 16L, value.used)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 24L, value.syntax)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 32L, value.fastmap)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 40L, value.translate)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 48L, value.reNsub)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 56L, value.bitfield)
                }
            }

        public operator fun invoke(
            buffer: MutPtr = MutPtr(0L),
            allocated: SizeT = 0uL,
            used: SizeT = 0uL,
            syntax: CUlong = 0uL,
            fastmap: MutPtr = MutPtr(0L),
            translate: MutPtr = MutPtr(0L),
            reNsub: SizeT = 0uL,
            bitfield: UByte = 0u,
        ): RegexT =
            RegexT(
                bufferCtorArg = buffer,
                allocated = allocated,
                used = used,
                syntax = syntax,
                fastmapCtorArg = fastmap,
                translateCtorArg = translate,
                reNsub = reNsub,
                bitfield = bitfield,
            )
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

public data class Seminfo(
    public var semmap: CInt = 0,
    public var semmni: CInt = 0,
    public var semmns: CInt = 0,
    public var semmnu: CInt = 0,
    public var semmsl: CInt = 0,
    public var semopm: CInt = 0,
    public var semume: CInt = 0,
    public var semusz: CInt = 0,
    public var semvmx: CInt = 0,
    public var semaem: CInt = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Seminfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Seminfo> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 40L
                override fun readNative(addr: Long): Seminfo =
                    Seminfo(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 20L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 28L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 32L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 36L),
                    )
                override fun writeNative(addr: Long, value: Seminfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.semmap)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 4L, value.semmni)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 8L, value.semmns)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 12L, value.semmnu)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 16L, value.semmsl)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 20L, value.semopm)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 24L, value.semume)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 28L, value.semusz)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 32L, value.semvmx)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 36L, value.semaem)
                }
            }
    }
}

public data class PtracePeeksiginfoArgs(
    public var off: U64 = 0uL,
    public var flags: U32 = 0u,
    public var nr: S32 = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<PtracePeeksiginfoArgs> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<PtracePeeksiginfoArgs> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): PtracePeeksiginfoArgs =
                    PtracePeeksiginfoArgs(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 12L),
                    )
                override fun writeNative(addr: Long, value: PtracePeeksiginfoArgs) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr, value.off)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.flags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 12L, value.nr)
                }
            }
    }
}

public data class CAnonymousPtraceSyscallInfoEntry(
    public var nr: U64 = 0uL,
    public var args: ULongArray = ULongArray(6),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CAnonymousPtraceSyscallInfoEntry) return false
        if (this.nr != other.nr) return false
        if (!this.args.contentEquals(other.args)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.nr.hashCode()
        result = 31 * result + this.args.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<CAnonymousPtraceSyscallInfoEntry> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<CAnonymousPtraceSyscallInfoEntry> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 56L
                override fun readNative(addr: Long): CAnonymousPtraceSyscallInfoEntry =
                    CAnonymousPtraceSyscallInfoEntry(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64, (6).toInt())
                        ).readNative(addr + 8L).toULongArray(),
                    )
                override fun writeNative(addr: Long, value: CAnonymousPtraceSyscallInfoEntry) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr, value.nr)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64, (6).toInt())
                    ).writeNative(addr + 8L, value.args.toList())
                }
            }
    }
}

public data class CAnonymousPtraceSyscallInfoExit(
    public var sval: S64 = 0L,
    public var isError: U8 = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<CAnonymousPtraceSyscallInfoExit> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<CAnonymousPtraceSyscallInfoExit> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): CAnonymousPtraceSyscallInfoExit =
                    CAnonymousPtraceSyscallInfoExit(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: CAnonymousPtraceSyscallInfoExit) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr, value.sval)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 8L, value.isError)
                }
            }
    }
}

public data class CAnonymousPtraceSyscallInfoSeccomp(
    public var nr: U64 = 0uL,
    public var args: ULongArray = ULongArray(6),
    public var retData: U32 = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CAnonymousPtraceSyscallInfoSeccomp) return false
        if (this.nr != other.nr) return false
        if (!this.args.contentEquals(other.args)) return false
        if (this.retData != other.retData) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.nr.hashCode()
        result = 31 * result + this.args.contentHashCode()
        result = 31 * result + this.retData.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<CAnonymousPtraceSyscallInfoSeccomp> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<CAnonymousPtraceSyscallInfoSeccomp> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 64L
                override fun readNative(addr: Long): CAnonymousPtraceSyscallInfoSeccomp =
                    CAnonymousPtraceSyscallInfoSeccomp(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64, (6).toInt())
                        ).readNative(addr + 8L).toULongArray(),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 56L),
                    )
                override fun writeNative(addr: Long, value: CAnonymousPtraceSyscallInfoSeccomp) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr, value.nr)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64, (6).toInt())
                    ).writeNative(addr + 8L, value.args.toList())
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 56L, value.retData)
                }
            }
    }
}

public data class PtraceSyscallInfo(
    public var op: U8 = 0u,
    public var pad: UByteArray = UByteArray(3),
    public var arch: U32 = 0u,
    public var instructionPointer: U64 = 0uL,
    public var stackPointer: U64 = 0uL,
    public var u: CAnonymousPtraceSyscallInfoData = CAnonymousPtraceSyscallInfoData(),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PtraceSyscallInfo) return false
        if (this.op != other.op) return false
        if (!this.pad.contentEquals(other.pad)) return false
        if (this.arch != other.arch) return false
        if (this.instructionPointer != other.instructionPointer) return false
        if (this.stackPointer != other.stackPointer) return false
        if (this.u != other.u) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.op.hashCode()
        result = 31 * result + this.pad.contentHashCode()
        result = 31 * result + this.arch.hashCode()
        result = 31 * result + this.instructionPointer.hashCode()
        result = 31 * result + this.stackPointer.hashCode()
        result = 31 * result + this.u.hashCode()
        return result
    }
}

public data class PtraceSudConfig(
    public var mode: U64 = 0uL,
    public var selector: U64 = 0uL,
    public var offset: U64 = 0uL,
    public var len: U64 = 0uL,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<PtraceSudConfig> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<PtraceSudConfig> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 32L
                override fun readNative(addr: Long): PtraceSudConfig =
                    PtraceSudConfig(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 24L),
                    )
                override fun writeNative(addr: Long, value: PtraceSudConfig) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr, value.mode)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 8L, value.selector)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 16L, value.offset)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 24L, value.len)
                }
            }
    }
}

public data class Iocb(
    public var aioData: U64 = 0uL,
    public var aioKey: U32 = 0u,
    public var aioRwFlags: KernelRwfT = 0,
    public var aioLioOpcode: U16 = 0u,
    public var aioReqprio: S16 = 0,
    public var aioFildes: U32 = 0u,
    public var aioBuf: U64 = 0uL,
    public var aioNbytes: U64 = 0uL,
    public var aioOffset: S64 = 0L,
    public var aioReserved2: U64 = 0uL,
    public var aioFlags: U32 = 0u,
    public var aioResfd: U32 = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Iocb> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Iocb> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 64L
                override fun readNative(addr: Long): Iocb =
                    Iocb(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).readNative(addr + 18L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 20L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 32L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 40L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 48L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 56L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 60L),
                    )
                override fun writeNative(addr: Long, value: Iocb) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr, value.aioData)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.aioKey)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 12L, value.aioRwFlags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 16L, value.aioLioOpcode)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).writeNative(addr + 18L, value.aioReqprio)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.aioFildes)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 24L, value.aioBuf)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 32L, value.aioNbytes)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 40L, value.aioOffset)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 48L, value.aioReserved2)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 56L, value.aioFlags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 60L, value.aioResfd)
                }
            }
    }
}

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
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<TcpInfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<TcpInfo> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 104L
                override fun readNative(addr: Long): TcpInfo =
                    TcpInfo(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 1L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 2L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 3L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 5L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 6L),
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
                    )
                override fun writeNative(addr: Long, value: TcpInfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr, value.tcpiState)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 1L, value.tcpiCaState)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 2L, value.tcpiRetransmits)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 3L, value.tcpiProbes)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 4L, value.tcpiBackoff)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 5L, value.tcpiOptions)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 6L, value.tcpiSndRcvWscale)
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
                }
            }
    }
}

public data class FanotifyEventInfoPidfd(
    public var hdr: FanotifyEventInfoHeader = FanotifyEventInfoHeader(),
    public var pidfd: S32 = 0,
)

public data class FanotifyEventInfoError(
    public var hdr: FanotifyEventInfoHeader = FanotifyEventInfoHeader(),
    public var error: S32 = 0,
    public var errorCount: U32 = 0u,
)

public data class SemT(
    public var size: UByteArray = UByteArray(32),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SemT) return false
        if (!this.size.contentEquals(other.size)) return false
        return true
    }

    override fun hashCode(): Int = this.size.contentHashCode()

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SemT> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SemT> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 32L
                override fun readNative(addr: Long): SemT =
                    SemT(
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (32).toInt())
                        ).readNative(addr).toUByteArray(),
                    )
                override fun writeNative(addr: Long, value: SemT) {
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (32).toInt())
                    ).writeNative(addr, value.size.toList())
                }
            }
    }
}

public data class MbstateT(
    public var count: CInt = 0,
    public var wchb: UByteArray = UByteArray(4),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is MbstateT) return false
        if (this.count != other.count) return false
        if (!this.wchb.contentEquals(other.wchb)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.count.hashCode()
        result = 31 * result + this.wchb.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<MbstateT> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<MbstateT> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): MbstateT =
                    MbstateT(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (4).toInt())
                        ).readNative(addr + 4L).toUByteArray(),
                    )
                override fun writeNative(addr: Long, value: MbstateT) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.count)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (4).toInt())
                    ).writeNative(addr + 4L, value.wchb.toList())
                }
            }
    }
}

public data class Fpos64T(
    public var pos: Off64T = 0L,
    public var state: MbstateT = MbstateT(),
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Fpos64T> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Fpos64T> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): Fpos64T =
                    Fpos64T(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr),
                        (MbstateT.typeLayout()).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: Fpos64T) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr, value.pos)
                    (MbstateT.typeLayout()).writeNative(addr + 8L, value.state)
                }
            }
    }
}

public data class FposT(
    public var pos: OffT = 0L,
    public var state: MbstateT = MbstateT(),
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<FposT> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<FposT> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): FposT =
                    FposT(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr),
                        (MbstateT.typeLayout()).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: FposT) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr, value.pos)
                    (MbstateT.typeLayout()).writeNative(addr + 8L, value.state)
                }
            }
    }
}

// linux x32 compatibility
// See https://sourceware.org/bugzilla/showBug.cgi?id=16437
public data class Timespec(
    public var tvSec: TimeT = 0L,
    public var tvNsec: CLong = 0L,
    public var pad: Int = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Timespec> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Timespec> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 24L
                override fun readNative(addr: Long): Timespec =
                    Timespec(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: Timespec) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr, value.tvSec)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 8L, value.tvNsec)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 16L, value.pad)
                }
            }
    }
}

public data class Utmpx(
    public var utType: CShort = 0,
    public var utPid: PidT = 0,
    public var utLine: UByteArray = UByteArray(UT_LINESIZE),
    public var utId: UByteArray = UByteArray(4),
    public var utUser: UByteArray = UByteArray(UT_NAMESIZE),
    public var utHost: UByteArray = UByteArray(UT_HOSTSIZE),
    public var utExit: ExitStatus = ExitStatus(),
    public var utSession: CLong = 0L,
    public var utTv: Timeval = Timeval(),
    public var utAddrV6: IntArray = IntArray(4),
    public var glibcReserved: UByteArray = UByteArray(20),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Utmpx) return false
        if (this.utType != other.utType) return false
        if (this.utPid != other.utPid) return false
        if (!this.utLine.contentEquals(other.utLine)) return false
        if (!this.utId.contentEquals(other.utId)) return false
        if (!this.utUser.contentEquals(other.utUser)) return false
        if (!this.utHost.contentEquals(other.utHost)) return false
        if (this.utExit != other.utExit) return false
        if (this.utSession != other.utSession) return false
        if (this.utTv != other.utTv) return false
        if (!this.utAddrV6.contentEquals(other.utAddrV6)) return false
        if (!this.glibcReserved.contentEquals(other.glibcReserved)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.utType.hashCode()
        result = 31 * result + this.utPid.hashCode()
        result = 31 * result + this.utLine.contentHashCode()
        result = 31 * result + this.utId.contentHashCode()
        result = 31 * result + this.utUser.contentHashCode()
        result = 31 * result + this.utHost.contentHashCode()
        result = 31 * result + this.utExit.hashCode()
        result = 31 * result + this.utSession.hashCode()
        result = 31 * result + this.utTv.hashCode()
        result = 31 * result + this.utAddrV6.contentHashCode()
        result = 31 * result + this.glibcReserved.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Utmpx> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Utmpx> {
                override val alignBytes: Long = 8L
                private val off3: Long =
                    io.github.kotlinmania.rustlang.core.mem
                        .alignUpBytes((8L + ((UT_LINESIZE).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).strideBytes)), 1L)
                private val off4: Long =
                    io.github.kotlinmania.rustlang.core.mem
                        .alignUpBytes((off3 + 4L), 1L)
                private val off5: Long =
                    io.github.kotlinmania.rustlang.core.mem
                        .alignUpBytes((off4 + ((UT_NAMESIZE).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).strideBytes)), 1L)
                private val off6: Long =
                    io.github.kotlinmania.rustlang.core.mem
                        .alignUpBytes((off5 + ((UT_HOSTSIZE).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).strideBytes)), 2L)
                private val off7: Long =
                    io.github.kotlinmania.rustlang.core.mem
                        .alignUpBytes((off6 + 4L), 8L)
                private val off8: Long =
                    io.github.kotlinmania.rustlang.core.mem
                        .alignUpBytes((off7 + 8L), 4L)
                private val off9: Long =
                    io.github.kotlinmania.rustlang.core.mem
                        .alignUpBytes((off8 + 8L), 4L)
                private val off10: Long =
                    io.github.kotlinmania.rustlang.core.mem
                        .alignUpBytes((off9 + 16L), 1L)
                override val sizeBytes: Long =
                    io.github.kotlinmania.rustlang.core.mem
                        .alignUpBytes((off10 + 20L), 8L)
                override fun readNative(addr: Long): Utmpx =
                    Utmpx(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 4L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (UT_LINESIZE))
                        ).readNative(addr + 8L).toUByteArray(),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (4).toInt())
                        ).readNative(addr + off3).toUByteArray(),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (UT_NAMESIZE))
                        ).readNative(addr + off4).toUByteArray(),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (UT_HOSTSIZE))
                        ).readNative(addr + off5).toUByteArray(),
                        (ExitStatus.typeLayout()).readNative(addr + off6),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + off7),
                        (Timeval.typeLayout()).readNative(addr + off8),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32, (4).toInt())
                        ).readNative(addr + off9).toIntArray(),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (20).toInt())
                        ).readNative(addr + off10).toUByteArray(),
                    )
                override fun writeNative(addr: Long, value: Utmpx) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).writeNative(addr, value.utType)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 4L, value.utPid)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (UT_LINESIZE))
                    ).writeNative(addr + 8L, value.utLine.toList())
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (4).toInt())
                    ).writeNative(addr + off3, value.utId.toList())
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (UT_NAMESIZE))
                    ).writeNative(addr + off4, value.utUser.toList())
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (UT_HOSTSIZE))
                    ).writeNative(addr + off5, value.utHost.toList())
                    (ExitStatus.typeLayout()).writeNative(addr + off6, value.utExit)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + off7, value.utSession)
                    (Timeval.typeLayout()).writeNative(addr + off8, value.utTv)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32, (4).toInt())
                    ).writeNative(addr + off9, value.utAddrV6.toList())
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (20).toInt())
                    ).writeNative(addr + off10, value.glibcReserved.toList())
                }
            }
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

public data class CAnonymousPtraceSyscallInfoData(
    public var entry: CAnonymousPtraceSyscallInfoEntry = CAnonymousPtraceSyscallInfoEntry(),
    public var exit: CAnonymousPtraceSyscallInfoExit = CAnonymousPtraceSyscallInfoExit(),
    public var seccomp: CAnonymousPtraceSyscallInfoSeccomp = CAnonymousPtraceSyscallInfoSeccomp(),
) {
    public fun fmt(f: StringBuilder) {
        DebugStruct(f, "__c_anonymous_ptrace_syscall_info_data").finishNonExhaustive()
    }

    public fun eq(other: CAnonymousPtraceSyscallInfoData): Boolean = this.entry == other.entry || this.exit == other.exit || this.seccomp == other.seccomp

    public override fun hashCode(): Int {
        var state = 0
        run {
            state = 31 * state + (this.entry).hashCode()
            state = 31 * state + (this.exit).hashCode()
            state = 31 * state + (this.seccomp).hashCode()
        }
        return state
    }
}
