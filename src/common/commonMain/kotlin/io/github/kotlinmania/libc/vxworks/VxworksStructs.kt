@file:OptIn(ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.vxworks

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CChar
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CLong
import io.github.kotlinmania.libc.CShort
import io.github.kotlinmania.libc.CUchar
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.CUshort
import io.github.kotlinmania.rustlang.core.ffi.ExternFnPtr
import io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
import io.github.kotlinmania.rustlang.core.mem.TypeLayout
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr

public fun interface SaUTSaHandlerCallback {
    public operator fun invoke(arg0: CInt): Nothing
}

public fun interface SaUTSaSigactionCallback {
    public operator fun invoke(arg0: CInt, arg1: MutPtr, arg2: MutPtr): Nothing
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

// Dummy functions, these don't really exist in VxWorks.
// wait.h macros
// bPthreadCondattrT.h
public data class PthreadCondattrT(
    public var condAttrStatus: CInt = 0,
    public var condAttrPshared: CInt = 0,
    public var condAttrClockId: ClockidT = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<PthreadCondattrT> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<PthreadCondattrT> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 12L
                override fun readNative(addr: Long): PthreadCondattrT =
                    PthreadCondattrT(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: PthreadCondattrT) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.condAttrStatus)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 4L, value.condAttrPshared)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 8L, value.condAttrClockId)
                }
            }
    }
}

// bPthreadCondT.h
public class PthreadCondT internal constructor(
    condSemIdCtorArg: VxSemId,
    public var condValid: CInt,
    public var condInitted: CInt,
    public var condRefCount: CInt,
    condMutexCtorArg: MutPtr,
    condAttrCtorArg: PthreadCondattrT,
    public var condSemName: UByteArray,
) {
    public var condSemId: VxSemId = condSemIdCtorArg
        internal set

    public var condMutex: MutPtr = condMutexCtorArg
        internal set

    public var condAttr: PthreadCondattrT = condAttrCtorArg
        internal set

    public constructor() : this(
        condSemIdCtorArg = MutPtr(0L),
        condValid = 0,
        condInitted = 0,
        condRefCount = 0,
        condMutexCtorArg = MutPtr(0L),
        condAttrCtorArg = PthreadCondattrT(),
        condSemName = UByteArray(PTHREAD_SHARED_SEM_NAME_MAX),
    )

    public operator fun component1(): VxSemId = this.condSemId

    public operator fun component2(): CInt = this.condValid

    public operator fun component3(): CInt = this.condInitted

    public operator fun component4(): CInt = this.condRefCount

    public operator fun component5(): MutPtr = this.condMutex

    public operator fun component6(): PthreadCondattrT = this.condAttr

    public operator fun component7(): UByteArray = this.condSemName

    public fun copy(condSemId: VxSemId = this.condSemId, condValid: CInt = this.condValid, condInitted: CInt = this.condInitted, condRefCount: CInt = this.condRefCount, condMutex: MutPtr = this.condMutex, condAttr: PthreadCondattrT = this.condAttr, condSemName: UByteArray = this.condSemName): PthreadCondT = PthreadCondT(condSemIdCtorArg = condSemId, condValid = condValid, condInitted = condInitted, condRefCount = condRefCount, condMutexCtorArg = condMutex, condAttrCtorArg = condAttr, condSemName = condSemName)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PthreadCondT) return false
        if (this.condSemId != other.condSemId) return false
        if (this.condValid != other.condValid) return false
        if (this.condInitted != other.condInitted) return false
        if (this.condRefCount != other.condRefCount) return false
        if (this.condMutex != other.condMutex) return false
        if (this.condAttr != other.condAttr) return false
        if (!this.condSemName.contentEquals(other.condSemName)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.condSemId.hashCode()
        result = 31 * result + this.condValid.hashCode()
        result = 31 * result + this.condInitted.hashCode()
        result = 31 * result + this.condRefCount.hashCode()
        result = 31 * result + this.condMutex.hashCode()
        result = 31 * result + this.condAttr.hashCode()
        result = 31 * result + this.condSemName.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<PthreadCondT> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<PthreadCondT> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long =
                    io.github.kotlinmania.rustlang.core.mem
                        .alignUpBytes((44L + ((PTHREAD_SHARED_SEM_NAME_MAX).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).strideBytes)), 8L)
                override fun readNative(addr: Long): PthreadCondT =
                    PthreadCondT(
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 16L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 24L),
                        (PthreadCondattrT.typeLayout()).readNative(addr + 32L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (PTHREAD_SHARED_SEM_NAME_MAX))
                        ).readNative(addr + 44L).toUByteArray(),
                    )
                override fun writeNative(addr: Long, value: PthreadCondT) {
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr, value.condSemId)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 8L, value.condValid)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 12L, value.condInitted)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 16L, value.condRefCount)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 24L, value.condMutex)
                    (PthreadCondattrT.typeLayout()).writeNative(addr + 32L, value.condAttr)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (PTHREAD_SHARED_SEM_NAME_MAX))
                    ).writeNative(addr + 44L, value.condSemName.toList())
                }
            }

        public operator fun invoke(
            condSemId: VxSemId = MutPtr(0L),
            condValid: CInt = 0,
            condInitted: CInt = 0,
            condRefCount: CInt = 0,
            condMutex: MutPtr = MutPtr(0L),
            condAttr: PthreadCondattrT = PthreadCondattrT(),
            condSemName: UByteArray = UByteArray(PTHREAD_SHARED_SEM_NAME_MAX),
        ): PthreadCondT =
            PthreadCondT(
                condSemIdCtorArg = condSemId,
                condValid = condValid,
                condInitted = condInitted,
                condRefCount = condRefCount,
                condMutexCtorArg = condMutex,
                condAttrCtorArg = condAttr,
                condSemName = condSemName,
            )
    }
}

// bPthreadRwlockattrT.h
public data class PthreadRwlockattrT(
    public var rwlockAttrStatus: CInt = 0,
    public var rwlockAttrPshared: CInt = 0,
    public var rwlockAttrMaxReaders: CUint = 0u,
    public var rwlockAttrConformOpt: CUint = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<PthreadRwlockattrT> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<PthreadRwlockattrT> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): PthreadRwlockattrT =
                    PthreadRwlockattrT(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                    )
                override fun writeNative(addr: Long, value: PthreadRwlockattrT) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.rwlockAttrStatus)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 4L, value.rwlockAttrPshared)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.rwlockAttrMaxReaders)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.rwlockAttrConformOpt)
                }
            }
    }
}

// bPthreadRwlockT.h
public class PthreadRwlockT internal constructor(
    rwlockSemIdCtorArg: VxSemId,
    public var rwlockReadersRefCount: CUint,
    public var rwlockValid: CInt,
    public var rwlockInitted: CInt,
    rwlockAttrCtorArg: PthreadRwlockattrT,
    public var rwlockSemName: UByteArray,
) {
    public var rwlockSemId: VxSemId = rwlockSemIdCtorArg
        internal set

    public var rwlockAttr: PthreadRwlockattrT = rwlockAttrCtorArg
        internal set

    public constructor() : this(
        rwlockSemIdCtorArg = MutPtr(0L),
        rwlockReadersRefCount = 0u,
        rwlockValid = 0,
        rwlockInitted = 0,
        rwlockAttrCtorArg = PthreadRwlockattrT(),
        rwlockSemName = UByteArray(PTHREAD_SHARED_SEM_NAME_MAX),
    )

    public operator fun component1(): VxSemId = this.rwlockSemId

    public operator fun component2(): CUint = this.rwlockReadersRefCount

    public operator fun component3(): CInt = this.rwlockValid

    public operator fun component4(): CInt = this.rwlockInitted

    public operator fun component5(): PthreadRwlockattrT = this.rwlockAttr

    public operator fun component6(): UByteArray = this.rwlockSemName

    public fun copy(rwlockSemId: VxSemId = this.rwlockSemId, rwlockReadersRefCount: CUint = this.rwlockReadersRefCount, rwlockValid: CInt = this.rwlockValid, rwlockInitted: CInt = this.rwlockInitted, rwlockAttr: PthreadRwlockattrT = this.rwlockAttr, rwlockSemName: UByteArray = this.rwlockSemName): PthreadRwlockT = PthreadRwlockT(rwlockSemIdCtorArg = rwlockSemId, rwlockReadersRefCount = rwlockReadersRefCount, rwlockValid = rwlockValid, rwlockInitted = rwlockInitted, rwlockAttrCtorArg = rwlockAttr, rwlockSemName = rwlockSemName)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PthreadRwlockT) return false
        if (this.rwlockSemId != other.rwlockSemId) return false
        if (this.rwlockReadersRefCount != other.rwlockReadersRefCount) return false
        if (this.rwlockValid != other.rwlockValid) return false
        if (this.rwlockInitted != other.rwlockInitted) return false
        if (this.rwlockAttr != other.rwlockAttr) return false
        if (!this.rwlockSemName.contentEquals(other.rwlockSemName)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.rwlockSemId.hashCode()
        result = 31 * result + this.rwlockReadersRefCount.hashCode()
        result = 31 * result + this.rwlockValid.hashCode()
        result = 31 * result + this.rwlockInitted.hashCode()
        result = 31 * result + this.rwlockAttr.hashCode()
        result = 31 * result + this.rwlockSemName.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<PthreadRwlockT> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<PthreadRwlockT> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long =
                    io.github.kotlinmania.rustlang.core.mem
                        .alignUpBytes((36L + ((PTHREAD_SHARED_SEM_NAME_MAX).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).strideBytes)), 8L)
                override fun readNative(addr: Long): PthreadRwlockT =
                    PthreadRwlockT(
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 16L),
                        (PthreadRwlockattrT.typeLayout()).readNative(addr + 20L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (PTHREAD_SHARED_SEM_NAME_MAX))
                        ).readNative(addr + 36L).toUByteArray(),
                    )
                override fun writeNative(addr: Long, value: PthreadRwlockT) {
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr, value.rwlockSemId)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.rwlockReadersRefCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 12L, value.rwlockValid)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 16L, value.rwlockInitted)
                    (PthreadRwlockattrT.typeLayout()).writeNative(addr + 20L, value.rwlockAttr)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (PTHREAD_SHARED_SEM_NAME_MAX))
                    ).writeNative(addr + 36L, value.rwlockSemName.toList())
                }
            }

        public operator fun invoke(
            rwlockSemId: VxSemId = MutPtr(0L),
            rwlockReadersRefCount: CUint = 0u,
            rwlockValid: CInt = 0,
            rwlockInitted: CInt = 0,
            rwlockAttr: PthreadRwlockattrT = PthreadRwlockattrT(),
            rwlockSemName: UByteArray = UByteArray(PTHREAD_SHARED_SEM_NAME_MAX),
        ): PthreadRwlockT =
            PthreadRwlockT(
                rwlockSemIdCtorArg = rwlockSemId,
                rwlockReadersRefCount = rwlockReadersRefCount,
                rwlockValid = rwlockValid,
                rwlockInitted = rwlockInitted,
                rwlockAttrCtorArg = rwlockAttr,
                rwlockSemName = rwlockSemName,
            )
    }
}

// bStructTimeval.h
public data class Timeval(
    public var tvSec: TimeT = 0L,
    public var tvUsec: SusecondsT = 0L,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Timeval> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Timeval> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): Timeval =
                    Timeval(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: Timeval) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr, value.tvSec)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 8L, value.tvUsec)
                }
            }
    }
}

// socket.h
public data class Linger(
    public var lOnoff: CInt = 0,
    public var lLinger: CInt = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Linger> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Linger> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): Linger =
                    Linger(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: Linger) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.lOnoff)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 4L, value.lLinger)
                }
            }
    }
}

public data class Sockaddr(
    public var saLen: CUchar = 0u,
    public var saFamily: SaFamilyT = 0u,
    public var saData: UByteArray = UByteArray(14),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Sockaddr) return false
        if (this.saLen != other.saLen) return false
        if (this.saFamily != other.saFamily) return false
        if (!this.saData.contentEquals(other.saData)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.saLen.hashCode()
        result = 31 * result + this.saFamily.hashCode()
        result = 31 * result + this.saData.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Sockaddr> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Sockaddr> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): Sockaddr =
                    Sockaddr(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 1L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (14).toInt())
                        ).readNative(addr + 2L).toUByteArray(),
                    )
                override fun writeNative(addr: Long, value: Sockaddr) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr, value.saLen)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 1L, value.saFamily)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (14).toInt())
                    ).writeNative(addr + 2L, value.saData.toList())
                }
            }
    }
}

public class Iovec internal constructor(
    iovBaseCtorArg: MutPtr,
    public var iovLen: SizeT,
) {
    public var iovBase: MutPtr = iovBaseCtorArg
        internal set

    public constructor() : this(
        iovBaseCtorArg = MutPtr(0L),
        iovLen = 0uL,
    )

    public operator fun component1(): MutPtr = this.iovBase

    public operator fun component2(): SizeT = this.iovLen

    public fun copy(iovBase: MutPtr = this.iovBase, iovLen: SizeT = this.iovLen): Iovec = Iovec(iovBaseCtorArg = iovBase, iovLen = iovLen)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Iovec) return false
        if (this.iovBase != other.iovBase) return false
        if (this.iovLen != other.iovLen) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.iovBase.hashCode()
        result = 31 * result + this.iovLen.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Iovec> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Iovec> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): Iovec =
                    Iovec(
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: Iovec) {
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr, value.iovBase)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 8L, value.iovLen)
                }
            }

        public operator fun invoke(
            iovBase: MutPtr = MutPtr(0L),
            iovLen: SizeT = 0uL,
        ): Iovec =
            Iovec(
                iovBaseCtorArg = iovBase,
                iovLen = iovLen,
            )
    }
}

public class Msghdr internal constructor(
    msgNameCtorArg: MutPtr,
    public var msgNamelen: SocklenT,
    msgIovCtorArg: MutPtr,
    public var msgIovlen: CInt,
    msgControlCtorArg: MutPtr,
    public var msgControllen: SocklenT,
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
        msgIovlen = 0,
        msgControlCtorArg = MutPtr(0L),
        msgControllen = 0u,
        msgFlags = 0,
    )

    public operator fun component1(): MutPtr = this.msgName

    public operator fun component2(): SocklenT = this.msgNamelen

    public operator fun component3(): MutPtr = this.msgIov

    public operator fun component4(): CInt = this.msgIovlen

    public operator fun component5(): MutPtr = this.msgControl

    public operator fun component6(): SocklenT = this.msgControllen

    public operator fun component7(): CInt = this.msgFlags

    public fun copy(msgName: MutPtr = this.msgName, msgNamelen: SocklenT = this.msgNamelen, msgIov: MutPtr = this.msgIov, msgIovlen: CInt = this.msgIovlen, msgControl: MutPtr = this.msgControl, msgControllen: SocklenT = this.msgControllen, msgFlags: CInt = this.msgFlags): Msghdr = Msghdr(msgNameCtorArg = msgName, msgNamelen = msgNamelen, msgIovCtorArg = msgIov, msgIovlen = msgIovlen, msgControlCtorArg = msgControl, msgControllen = msgControllen, msgFlags = msgFlags)

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
                override val sizeBytes: Long = 48L
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
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 24L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 32L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 40L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 44L),
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
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 24L, value.msgIovlen)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 32L, value.msgControl)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 40L, value.msgControllen)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 44L, value.msgFlags)
                }
            }

        public operator fun invoke(
            msgName: MutPtr = MutPtr(0L),
            msgNamelen: SocklenT = 0u,
            msgIov: MutPtr = MutPtr(0L),
            msgIovlen: CInt = 0,
            msgControl: MutPtr = MutPtr(0L),
            msgControllen: SocklenT = 0u,
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
    public var cmsgLen: SocklenT = 0u,
    public var cmsgLevel: CInt = 0,
    public var cmsgType: CInt = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Cmsghdr> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Cmsghdr> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 12L
                override fun readNative(addr: Long): Cmsghdr =
                    Cmsghdr(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: Cmsghdr) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.cmsgLen)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 4L, value.cmsgLevel)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 8L, value.cmsgType)
                }
            }
    }
}

// poll.h
public data class Pollfd(
    public var fd: CInt = 0,
    public var events: CShort = 0,
    public var revents: CShort = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Pollfd> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Pollfd> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): Pollfd =
                    Pollfd(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).readNative(addr + 6L),
                    )
                override fun writeNative(addr: Long, value: Pollfd) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.fd)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).writeNative(addr + 4L, value.events)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).writeNative(addr + 6L, value.revents)
                }
            }
    }
}

// resource.h
public data class Rlimit(
    public var rlimCur: RlimT = 0uL,
    public var rlimMax: RlimT = 0uL,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Rlimit> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Rlimit> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): Rlimit =
                    Rlimit(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: Rlimit) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr, value.rlimCur)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 8L, value.rlimMax)
                }
            }
    }
}

// stat.h
public class Stat(
    public var stDev: DevT = 0uL,
    public var stIno: InoT = 0uL,
    public var stMode: ModeT = 0,
    public var stNlink: NlinkT = 0uL,
    public var stUid: UidT = 0u,
    public var stGid: GidT = 0u,
    public var stRdev: DevT = 0uL,
    public var stSize: OffT = 0L,
    public var stAtim: Timespec = Timespec(),
    public var stAtime: TimeT = 0L,
    public var stMtim: Timespec = Timespec(),
    public var stMtime: TimeT = 0L,
    public var stCtim: Timespec = Timespec(),
    public var stCtime: TimeT = 0L,
    public var stBlksize: BlksizeT = 0L,
    public var stBlocks: BlkcntT = 0L,
    public var stAttrib: CUchar = 0u,
    public var stReserved1: CInt = 0,
    public var stReserved2: CInt = 0,
    public var stReserved3: CInt = 0,
    public var stReserved4: CInt = 0,
)

// bStructTimespec.h
public data class Timespec(
    public var tvSec: TimeT = 0L,
    public var tvNsec: CLong = 0L,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Timespec> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Timespec> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): Timespec =
                    Timespec(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: Timespec) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr, value.tvSec)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 8L, value.tvNsec)
                }
            }
    }
}

// bStructSchedParam.h
public data class SchedParam(
    public var schedPriority: CInt = 0,
    // scheduling priority
    public var schedSsLowPriority: CInt = 0,
    // low scheduling priority
    public var schedSsReplPeriod: Timespec = Timespec(),
    // replenishment period
    public var schedSsInitBudget: Timespec = Timespec(),
    // initial budget
    public var schedSsMaxRepl: CInt = 0,
)

// bPthreadAttrT.h
public class PthreadAttrT internal constructor(
    public var threadAttrStatus: CInt,
    public var threadAttrStacksize: SizeT,
    threadAttrStackaddrCtorArg: MutPtr,
    public var threadAttrGuardsize: SizeT,
    public var threadAttrDetachstate: CInt,
    public var threadAttrContentionscope: CInt,
    public var threadAttrInheritsched: CInt,
    public var threadAttrSchedpolicy: CInt,
    threadAttrNameCtorArg: MutPtr,
    public var threadAttrOptions: CInt,
    public var threadAttrSchedparam: SchedParam,
) {
    public var threadAttrStackaddr: MutPtr = threadAttrStackaddrCtorArg
        internal set

    public var threadAttrName: MutPtr = threadAttrNameCtorArg
        internal set

    public constructor() : this(
        threadAttrStatus = 0,
        threadAttrStacksize = 0uL,
        threadAttrStackaddrCtorArg = MutPtr(0L),
        threadAttrGuardsize = 0uL,
        threadAttrDetachstate = 0,
        threadAttrContentionscope = 0,
        threadAttrInheritsched = 0,
        threadAttrSchedpolicy = 0,
        threadAttrNameCtorArg = MutPtr(0L),
        threadAttrOptions = 0,
        threadAttrSchedparam = SchedParam(),
    )

    public operator fun component1(): CInt = this.threadAttrStatus

    public operator fun component2(): SizeT = this.threadAttrStacksize

    public operator fun component3(): MutPtr = this.threadAttrStackaddr

    public operator fun component4(): SizeT = this.threadAttrGuardsize

    public operator fun component5(): CInt = this.threadAttrDetachstate

    public operator fun component6(): CInt = this.threadAttrContentionscope

    public operator fun component7(): CInt = this.threadAttrInheritsched

    public operator fun component8(): CInt = this.threadAttrSchedpolicy

    public operator fun component9(): MutPtr = this.threadAttrName

    public operator fun component10(): CInt = this.threadAttrOptions

    public operator fun component11(): SchedParam = this.threadAttrSchedparam

    public fun copy(threadAttrStatus: CInt = this.threadAttrStatus, threadAttrStacksize: SizeT = this.threadAttrStacksize, threadAttrStackaddr: MutPtr = this.threadAttrStackaddr, threadAttrGuardsize: SizeT = this.threadAttrGuardsize, threadAttrDetachstate: CInt = this.threadAttrDetachstate, threadAttrContentionscope: CInt = this.threadAttrContentionscope, threadAttrInheritsched: CInt = this.threadAttrInheritsched, threadAttrSchedpolicy: CInt = this.threadAttrSchedpolicy, threadAttrName: MutPtr = this.threadAttrName, threadAttrOptions: CInt = this.threadAttrOptions, threadAttrSchedparam: SchedParam = this.threadAttrSchedparam): PthreadAttrT = PthreadAttrT(threadAttrStatus = threadAttrStatus, threadAttrStacksize = threadAttrStacksize, threadAttrStackaddrCtorArg = threadAttrStackaddr, threadAttrGuardsize = threadAttrGuardsize, threadAttrDetachstate = threadAttrDetachstate, threadAttrContentionscope = threadAttrContentionscope, threadAttrInheritsched = threadAttrInheritsched, threadAttrSchedpolicy = threadAttrSchedpolicy, threadAttrNameCtorArg = threadAttrName, threadAttrOptions = threadAttrOptions, threadAttrSchedparam = threadAttrSchedparam)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PthreadAttrT) return false
        if (this.threadAttrStatus != other.threadAttrStatus) return false
        if (this.threadAttrStacksize != other.threadAttrStacksize) return false
        if (this.threadAttrStackaddr != other.threadAttrStackaddr) return false
        if (this.threadAttrGuardsize != other.threadAttrGuardsize) return false
        if (this.threadAttrDetachstate != other.threadAttrDetachstate) return false
        if (this.threadAttrContentionscope != other.threadAttrContentionscope) return false
        if (this.threadAttrInheritsched != other.threadAttrInheritsched) return false
        if (this.threadAttrSchedpolicy != other.threadAttrSchedpolicy) return false
        if (this.threadAttrName != other.threadAttrName) return false
        if (this.threadAttrOptions != other.threadAttrOptions) return false
        if (this.threadAttrSchedparam != other.threadAttrSchedparam) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.threadAttrStatus.hashCode()
        result = 31 * result + this.threadAttrStacksize.hashCode()
        result = 31 * result + this.threadAttrStackaddr.hashCode()
        result = 31 * result + this.threadAttrGuardsize.hashCode()
        result = 31 * result + this.threadAttrDetachstate.hashCode()
        result = 31 * result + this.threadAttrContentionscope.hashCode()
        result = 31 * result + this.threadAttrInheritsched.hashCode()
        result = 31 * result + this.threadAttrSchedpolicy.hashCode()
        result = 31 * result + this.threadAttrName.hashCode()
        result = 31 * result + this.threadAttrOptions.hashCode()
        result = 31 * result + this.threadAttrSchedparam.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            threadAttrStatus: CInt = 0,
            threadAttrStacksize: SizeT = 0uL,
            threadAttrStackaddr: MutPtr = MutPtr(0L),
            threadAttrGuardsize: SizeT = 0uL,
            threadAttrDetachstate: CInt = 0,
            threadAttrContentionscope: CInt = 0,
            threadAttrInheritsched: CInt = 0,
            threadAttrSchedpolicy: CInt = 0,
            threadAttrName: MutPtr = MutPtr(0L),
            threadAttrOptions: CInt = 0,
            threadAttrSchedparam: SchedParam = SchedParam(),
        ): PthreadAttrT =
            PthreadAttrT(
                threadAttrStatus = threadAttrStatus,
                threadAttrStacksize = threadAttrStacksize,
                threadAttrStackaddrCtorArg = threadAttrStackaddr,
                threadAttrGuardsize = threadAttrGuardsize,
                threadAttrDetachstate = threadAttrDetachstate,
                threadAttrContentionscope = threadAttrContentionscope,
                threadAttrInheritsched = threadAttrInheritsched,
                threadAttrSchedpolicy = threadAttrSchedpolicy,
                threadAttrNameCtorArg = threadAttrName,
                threadAttrOptions = threadAttrOptions,
                threadAttrSchedparam = threadAttrSchedparam,
            )
    }
}

// signal.h
public data class Sigaction(
    public var saU: SaUT = SaUT(),
    public var saSigaction: SighandlerT = 0uL,
    public var saMask: SigsetT = 0uL,
    public var saFlags: CInt = 0,
)

// bStackT.h
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

// signal.h
public class SiginfoT internal constructor(
    public var siSigno: CInt,
    public var siCode: CInt,
    public var siValue: Sigval,
    public var siErrno: CInt,
    public var siStatus: CInt,
    siAddrCtorArg: MutPtr,
    public var siUid: UidT,
    public var siPid: PidT,
) {
    public var siAddr: MutPtr = siAddrCtorArg
        internal set

    public constructor() : this(
        siSigno = 0,
        siCode = 0,
        siValue = Sigval(),
        siErrno = 0,
        siStatus = 0,
        siAddrCtorArg = MutPtr(0L),
        siUid = 0u,
        siPid = 0,
    )

    public operator fun component1(): CInt = this.siSigno

    public operator fun component2(): CInt = this.siCode

    public operator fun component3(): Sigval = this.siValue

    public operator fun component4(): CInt = this.siErrno

    public operator fun component5(): CInt = this.siStatus

    public operator fun component6(): MutPtr = this.siAddr

    public operator fun component7(): UidT = this.siUid

    public operator fun component8(): PidT = this.siPid

    public fun copy(siSigno: CInt = this.siSigno, siCode: CInt = this.siCode, siValue: Sigval = this.siValue, siErrno: CInt = this.siErrno, siStatus: CInt = this.siStatus, siAddr: MutPtr = this.siAddr, siUid: UidT = this.siUid, siPid: PidT = this.siPid): SiginfoT = SiginfoT(siSigno = siSigno, siCode = siCode, siValue = siValue, siErrno = siErrno, siStatus = siStatus, siAddrCtorArg = siAddr, siUid = siUid, siPid = siPid)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SiginfoT) return false
        if (this.siSigno != other.siSigno) return false
        if (this.siCode != other.siCode) return false
        if (this.siValue != other.siValue) return false
        if (this.siErrno != other.siErrno) return false
        if (this.siStatus != other.siStatus) return false
        if (this.siAddr != other.siAddr) return false
        if (this.siUid != other.siUid) return false
        if (this.siPid != other.siPid) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.siSigno.hashCode()
        result = 31 * result + this.siCode.hashCode()
        result = 31 * result + this.siValue.hashCode()
        result = 31 * result + this.siErrno.hashCode()
        result = 31 * result + this.siStatus.hashCode()
        result = 31 * result + this.siAddr.hashCode()
        result = 31 * result + this.siUid.hashCode()
        result = 31 * result + this.siPid.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            siSigno: CInt = 0,
            siCode: CInt = 0,
            siValue: Sigval = Sigval(),
            siErrno: CInt = 0,
            siStatus: CInt = 0,
            siAddr: MutPtr = MutPtr(0L),
            siUid: UidT = 0u,
            siPid: PidT = 0,
        ): SiginfoT =
            SiginfoT(
                siSigno = siSigno,
                siCode = siCode,
                siValue = siValue,
                siErrno = siErrno,
                siStatus = siStatus,
                siAddrCtorArg = siAddr,
                siUid = siUid,
                siPid = siPid,
            )
    }
}

// pthread.h (krnl)
// bPthreadMutexattrT.h (usr)
public data class PthreadMutexattrT(
    public var mutexAttrStatus: CInt = 0,
    public var mutexAttrPshared: CInt = 0,
    public var mutexAttrProtocol: CInt = 0,
    public var mutexAttrPrioceiling: CInt = 0,
    public var mutexAttrType: CInt = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<PthreadMutexattrT> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<PthreadMutexattrT> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 20L
                override fun readNative(addr: Long): PthreadMutexattrT =
                    PthreadMutexattrT(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: PthreadMutexattrT) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.mutexAttrStatus)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 4L, value.mutexAttrPshared)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 8L, value.mutexAttrProtocol)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 12L, value.mutexAttrPrioceiling)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 16L, value.mutexAttrType)
                }
            }
    }
}

// pthread.h (krnl)
// bPthreadMutexT.h (usr)
public class PthreadMutexT internal constructor(
    mutexSemIdCtorArg: VxSemId,
    // _Vx_SEM_ID ..
    public var mutexValid: CInt,
    public var mutexInitted: CInt,
    public var mutexCondRefCount: CInt,
    public var mutexSavPriority: CInt,
    mutexAttrCtorArg: PthreadMutexattrT,
    public var mutexSemName: UByteArray,
) {
    public var mutexSemId: VxSemId = mutexSemIdCtorArg
        internal set

    public var mutexAttr: PthreadMutexattrT = mutexAttrCtorArg
        internal set

    public constructor() : this(
        mutexSemIdCtorArg = MutPtr(0L),
        mutexValid = 0,
        mutexInitted = 0,
        mutexCondRefCount = 0,
        mutexSavPriority = 0,
        mutexAttrCtorArg = PthreadMutexattrT(),
        mutexSemName = UByteArray(PTHREAD_SHARED_SEM_NAME_MAX),
    )

    public operator fun component1(): VxSemId = this.mutexSemId

    public operator fun component2(): CInt = this.mutexValid

    public operator fun component3(): CInt = this.mutexInitted

    public operator fun component4(): CInt = this.mutexCondRefCount

    public operator fun component5(): CInt = this.mutexSavPriority

    public operator fun component6(): PthreadMutexattrT = this.mutexAttr

    public operator fun component7(): UByteArray = this.mutexSemName

    public fun copy(mutexSemId: VxSemId = this.mutexSemId, mutexValid: CInt = this.mutexValid, mutexInitted: CInt = this.mutexInitted, mutexCondRefCount: CInt = this.mutexCondRefCount, mutexSavPriority: CInt = this.mutexSavPriority, mutexAttr: PthreadMutexattrT = this.mutexAttr, mutexSemName: UByteArray = this.mutexSemName): PthreadMutexT = PthreadMutexT(mutexSemIdCtorArg = mutexSemId, mutexValid = mutexValid, mutexInitted = mutexInitted, mutexCondRefCount = mutexCondRefCount, mutexSavPriority = mutexSavPriority, mutexAttrCtorArg = mutexAttr, mutexSemName = mutexSemName)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PthreadMutexT) return false
        if (this.mutexSemId != other.mutexSemId) return false
        if (this.mutexValid != other.mutexValid) return false
        if (this.mutexInitted != other.mutexInitted) return false
        if (this.mutexCondRefCount != other.mutexCondRefCount) return false
        if (this.mutexSavPriority != other.mutexSavPriority) return false
        if (this.mutexAttr != other.mutexAttr) return false
        if (!this.mutexSemName.contentEquals(other.mutexSemName)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.mutexSemId.hashCode()
        result = 31 * result + this.mutexValid.hashCode()
        result = 31 * result + this.mutexInitted.hashCode()
        result = 31 * result + this.mutexCondRefCount.hashCode()
        result = 31 * result + this.mutexSavPriority.hashCode()
        result = 31 * result + this.mutexAttr.hashCode()
        result = 31 * result + this.mutexSemName.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<PthreadMutexT> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<PthreadMutexT> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long =
                    io.github.kotlinmania.rustlang.core.mem
                        .alignUpBytes((44L + ((PTHREAD_SHARED_SEM_NAME_MAX).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).strideBytes)), 8L)
                override fun readNative(addr: Long): PthreadMutexT =
                    PthreadMutexT(
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 20L),
                        (PthreadMutexattrT.typeLayout()).readNative(addr + 24L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (PTHREAD_SHARED_SEM_NAME_MAX))
                        ).readNative(addr + 44L).toUByteArray(),
                    )
                override fun writeNative(addr: Long, value: PthreadMutexT) {
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr, value.mutexSemId)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 8L, value.mutexValid)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 12L, value.mutexInitted)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 16L, value.mutexCondRefCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 20L, value.mutexSavPriority)
                    (PthreadMutexattrT.typeLayout()).writeNative(addr + 24L, value.mutexAttr)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (PTHREAD_SHARED_SEM_NAME_MAX))
                    ).writeNative(addr + 44L, value.mutexSemName.toList())
                }
            }

        public operator fun invoke(
            mutexSemId: VxSemId = MutPtr(0L),
            mutexValid: CInt = 0,
            mutexInitted: CInt = 0,
            mutexCondRefCount: CInt = 0,
            mutexSavPriority: CInt = 0,
            mutexAttr: PthreadMutexattrT = PthreadMutexattrT(),
            mutexSemName: UByteArray = UByteArray(PTHREAD_SHARED_SEM_NAME_MAX),
        ): PthreadMutexT =
            PthreadMutexT(
                mutexSemIdCtorArg = mutexSemId,
                mutexValid = mutexValid,
                mutexInitted = mutexInitted,
                mutexCondRefCount = mutexCondRefCount,
                mutexSavPriority = mutexSavPriority,
                mutexAttrCtorArg = mutexAttr,
                mutexSemName = mutexSemName,
            )
    }
}

// time.h
public data class Tm(
    public var tmSec: CInt = 0,
    public var tmMin: CInt = 0,
    public var tmHour: CInt = 0,
    public var tmMday: CInt = 0,
    public var tmMon: CInt = 0,
    public var tmYear: CInt = 0,
    public var tmWday: CInt = 0,
    public var tmYday: CInt = 0,
    public var tmIsdst: CInt = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Tm> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Tm> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 36L
                override fun readNative(addr: Long): Tm =
                    Tm(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 20L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 28L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 32L),
                    )
                override fun writeNative(addr: Long, value: Tm) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.tmSec)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 4L, value.tmMin)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 8L, value.tmHour)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 12L, value.tmMday)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 16L, value.tmMon)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 20L, value.tmYear)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 24L, value.tmWday)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 28L, value.tmYday)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 32L, value.tmIsdst)
                }
            }
    }
}

// sys/times.h
public data class Tms(
    public var tmsUtime: ClockT = 0L,
    public var tmsStime: ClockT = 0L,
    public var tmsCutime: ClockT = 0L,
    public var tmsCstime: ClockT = 0L,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Tms> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Tms> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 32L
                override fun readNative(addr: Long): Tms =
                    Tms(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 24L),
                    )
                override fun writeNative(addr: Long, value: Tms) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr, value.tmsUtime)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 8L, value.tmsStime)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 16L, value.tmsCutime)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 24L, value.tmsCstime)
                }
            }
    }
}

// utime.h
public data class Utimbuf(
    public var actime: TimeT = 0L,
    public var modtime: TimeT = 0L,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Utimbuf> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Utimbuf> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): Utimbuf =
                    Utimbuf(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: Utimbuf) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr, value.actime)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 8L, value.modtime)
                }
            }
    }
}

// in.h
public data class InAddr(
    public var sAddr: InAddrT = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<InAddr> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<InAddr> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): InAddr =
                    InAddr(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: InAddr) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.sAddr)
                }
            }
    }
}

// in.h
public data class IpMreq(
    public var imrMultiaddr: InAddr = InAddr(),
    public var imrInterface: InAddr = InAddr(),
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<IpMreq> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<IpMreq> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): IpMreq =
                    IpMreq(
                        (InAddr.typeLayout()).readNative(addr),
                        (InAddr.typeLayout()).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: IpMreq) {
                    (InAddr.typeLayout()).writeNative(addr, value.imrMultiaddr)
                    (InAddr.typeLayout()).writeNative(addr + 4L, value.imrInterface)
                }
            }
    }
}

public data class In6Addr(
    public var s6Addr: UByteArray = UByteArray(16),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is In6Addr) return false
        if (!this.s6Addr.contentEquals(other.s6Addr)) return false
        return true
    }

    override fun hashCode(): Int = this.s6Addr.contentHashCode()

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<In6Addr> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<In6Addr> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): In6Addr =
                    In6Addr(
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (16).toInt())
                        ).readNative(addr).toUByteArray(),
                    )
                override fun writeNative(addr: Long, value: In6Addr) {
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (16).toInt())
                    ).writeNative(addr, value.s6Addr.toList())
                }
            }
    }
}

// in6.h
public data class Ipv6Mreq(
    public var ipv6mrMultiaddr: In6Addr = In6Addr(),
    public var ipv6mrInterface: CUint = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Ipv6Mreq> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Ipv6Mreq> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 20L
                override fun readNative(addr: Long): Ipv6Mreq =
                    Ipv6Mreq(
                        (In6Addr.typeLayout()).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: Ipv6Mreq) {
                    (In6Addr.typeLayout()).writeNative(addr, value.ipv6mrMultiaddr)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.ipv6mrInterface)
                }
            }
    }
}

// netdb.h
public class Addrinfo internal constructor(
    public var aiFlags: CInt,
    public var aiFamily: CInt,
    public var aiSocktype: CInt,
    public var aiProtocol: CInt,
    public var aiAddrlen: SizeT,
    aiCanonnameCtorArg: MutPtr,
    aiAddrCtorArg: MutPtr,
    aiNextCtorArg: MutPtr,
) {
    public var aiCanonname: MutPtr = aiCanonnameCtorArg
        internal set

    public var aiAddr: MutPtr = aiAddrCtorArg
        internal set

    public var aiNext: MutPtr = aiNextCtorArg
        internal set

    public constructor() : this(
        aiFlags = 0,
        aiFamily = 0,
        aiSocktype = 0,
        aiProtocol = 0,
        aiAddrlen = 0uL,
        aiCanonnameCtorArg = MutPtr(0L),
        aiAddrCtorArg = MutPtr(0L),
        aiNextCtorArg = MutPtr(0L),
    )

    public operator fun component1(): CInt = this.aiFlags

    public operator fun component2(): CInt = this.aiFamily

    public operator fun component3(): CInt = this.aiSocktype

    public operator fun component4(): CInt = this.aiProtocol

    public operator fun component5(): SizeT = this.aiAddrlen

    public operator fun component6(): MutPtr = this.aiCanonname

    public operator fun component7(): MutPtr = this.aiAddr

    public operator fun component8(): MutPtr = this.aiNext

    public fun copy(aiFlags: CInt = this.aiFlags, aiFamily: CInt = this.aiFamily, aiSocktype: CInt = this.aiSocktype, aiProtocol: CInt = this.aiProtocol, aiAddrlen: SizeT = this.aiAddrlen, aiCanonname: MutPtr = this.aiCanonname, aiAddr: MutPtr = this.aiAddr, aiNext: MutPtr = this.aiNext): Addrinfo = Addrinfo(aiFlags = aiFlags, aiFamily = aiFamily, aiSocktype = aiSocktype, aiProtocol = aiProtocol, aiAddrlen = aiAddrlen, aiCanonnameCtorArg = aiCanonname, aiAddrCtorArg = aiAddr, aiNextCtorArg = aiNext)

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
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Addrinfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Addrinfo> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 48L
                override fun readNative(addr: Long): Addrinfo =
                    Addrinfo(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 16L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 24L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 32L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 40L),
                    )
                override fun writeNative(addr: Long, value: Addrinfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.aiFlags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 4L, value.aiFamily)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 8L, value.aiSocktype)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 12L, value.aiProtocol)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 16L, value.aiAddrlen)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 24L, value.aiCanonname)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 32L, value.aiAddr)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 40L, value.aiNext)
                }
            }

        public operator fun invoke(
            aiFlags: CInt = 0,
            aiFamily: CInt = 0,
            aiSocktype: CInt = 0,
            aiProtocol: CInt = 0,
            aiAddrlen: SizeT = 0uL,
            aiCanonname: MutPtr = MutPtr(0L),
            aiAddr: MutPtr = MutPtr(0L),
            aiNext: MutPtr = MutPtr(0L),
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

// netdb.h
public class Servent internal constructor(
    sNameCtorArg: MutPtr,
    sAliasesCtorArg: MutPtr,
    public var sPort: CInt,
    sProtoCtorArg: MutPtr,
) {
    public var sName: MutPtr = sNameCtorArg
        internal set

    public var sAliases: MutPtr = sAliasesCtorArg
        internal set

    public var sProto: MutPtr = sProtoCtorArg
        internal set

    public constructor() : this(
        sNameCtorArg = MutPtr(0L),
        sAliasesCtorArg = MutPtr(0L),
        sPort = 0,
        sProtoCtorArg = MutPtr(0L),
    )

    public operator fun component1(): MutPtr = this.sName

    public operator fun component2(): MutPtr = this.sAliases

    public operator fun component3(): CInt = this.sPort

    public operator fun component4(): MutPtr = this.sProto

    public fun copy(sName: MutPtr = this.sName, sAliases: MutPtr = this.sAliases, sPort: CInt = this.sPort, sProto: MutPtr = this.sProto): Servent = Servent(sNameCtorArg = sName, sAliasesCtorArg = sAliases, sPort = sPort, sProtoCtorArg = sProto)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Servent) return false
        if (this.sName != other.sName) return false
        if (this.sAliases != other.sAliases) return false
        if (this.sPort != other.sPort) return false
        if (this.sProto != other.sProto) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.sName.hashCode()
        result = 31 * result + this.sAliases.hashCode()
        result = 31 * result + this.sPort.hashCode()
        result = 31 * result + this.sProto.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Servent> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Servent> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 32L
                override fun readNative(addr: Long): Servent =
                    Servent(
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 16L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 24L),
                    )
                override fun writeNative(addr: Long, value: Servent) {
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr, value.sName)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 8L, value.sAliases)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 16L, value.sPort)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 24L, value.sProto)
                }
            }

        public operator fun invoke(
            sName: MutPtr = MutPtr(0L),
            sAliases: MutPtr = MutPtr(0L),
            sPort: CInt = 0,
            sProto: MutPtr = MutPtr(0L),
        ): Servent =
            Servent(
                sNameCtorArg = sName,
                sAliasesCtorArg = sAliases,
                sPort = sPort,
                sProtoCtorArg = sProto,
            )
    }
}

// netdb.h
public class Protoent internal constructor(
    pNameCtorArg: MutPtr,
    pAliasesCtorArg: MutPtr,
    public var pProto: CInt,
) {
    public var pName: MutPtr = pNameCtorArg
        internal set

    public var pAliases: MutPtr = pAliasesCtorArg
        internal set

    public constructor() : this(
        pNameCtorArg = MutPtr(0L),
        pAliasesCtorArg = MutPtr(0L),
        pProto = 0,
    )

    public operator fun component1(): MutPtr = this.pName

    public operator fun component2(): MutPtr = this.pAliases

    public operator fun component3(): CInt = this.pProto

    public fun copy(pName: MutPtr = this.pName, pAliases: MutPtr = this.pAliases, pProto: CInt = this.pProto): Protoent = Protoent(pNameCtorArg = pName, pAliasesCtorArg = pAliases, pProto = pProto)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Protoent) return false
        if (this.pName != other.pName) return false
        if (this.pAliases != other.pAliases) return false
        if (this.pProto != other.pProto) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.pName.hashCode()
        result = 31 * result + this.pAliases.hashCode()
        result = 31 * result + this.pProto.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Protoent> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Protoent> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 24L
                override fun readNative(addr: Long): Protoent =
                    Protoent(
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: Protoent) {
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr, value.pName)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 8L, value.pAliases)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 16L, value.pProto)
                }
            }

        public operator fun invoke(
            pName: MutPtr = MutPtr(0L),
            pAliases: MutPtr = MutPtr(0L),
            pProto: CInt = 0,
        ): Protoent =
            Protoent(
                pNameCtorArg = pName,
                pAliasesCtorArg = pAliases,
                pProto = pProto,
            )
    }
}

// netdb.h
public class Hostent internal constructor(
    hNameCtorArg: MutPtr,
    hAliasesCtorArg: MutPtr,
    public var hAddrtype: CInt,
    public var hLength: CInt,
    hAddrListCtorArg: MutPtr,
) {
    public var hName: MutPtr = hNameCtorArg
        internal set

    public var hAliases: MutPtr = hAliasesCtorArg
        internal set

    public var hAddrList: MutPtr = hAddrListCtorArg
        internal set

    public constructor() : this(
        hNameCtorArg = MutPtr(0L),
        hAliasesCtorArg = MutPtr(0L),
        hAddrtype = 0,
        hLength = 0,
        hAddrListCtorArg = MutPtr(0L),
    )

    public operator fun component1(): MutPtr = this.hName

    public operator fun component2(): MutPtr = this.hAliases

    public operator fun component3(): CInt = this.hAddrtype

    public operator fun component4(): CInt = this.hLength

    public operator fun component5(): MutPtr = this.hAddrList

    public fun copy(hName: MutPtr = this.hName, hAliases: MutPtr = this.hAliases, hAddrtype: CInt = this.hAddrtype, hLength: CInt = this.hLength, hAddrList: MutPtr = this.hAddrList): Hostent = Hostent(hNameCtorArg = hName, hAliasesCtorArg = hAliases, hAddrtype = hAddrtype, hLength = hLength, hAddrListCtorArg = hAddrList)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Hostent) return false
        if (this.hName != other.hName) return false
        if (this.hAliases != other.hAliases) return false
        if (this.hAddrtype != other.hAddrtype) return false
        if (this.hLength != other.hLength) return false
        if (this.hAddrList != other.hAddrList) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.hName.hashCode()
        result = 31 * result + this.hAliases.hashCode()
        result = 31 * result + this.hAddrtype.hashCode()
        result = 31 * result + this.hLength.hashCode()
        result = 31 * result + this.hAddrList.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Hostent> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Hostent> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 32L
                override fun readNative(addr: Long): Hostent =
                    Hostent(
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 20L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 24L),
                    )
                override fun writeNative(addr: Long, value: Hostent) {
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr, value.hName)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 8L, value.hAliases)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 16L, value.hAddrtype)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 20L, value.hLength)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 24L, value.hAddrList)
                }
            }

        public operator fun invoke(
            hName: MutPtr = MutPtr(0L),
            hAliases: MutPtr = MutPtr(0L),
            hAddrtype: CInt = 0,
            hLength: CInt = 0,
            hAddrList: MutPtr = MutPtr(0L),
        ): Hostent =
            Hostent(
                hNameCtorArg = hName,
                hAliasesCtorArg = hAliases,
                hAddrtype = hAddrtype,
                hLength = hLength,
                hAddrListCtorArg = hAddrList,
            )
    }
}

// in.h
public data class SockaddrIn(
    public var sinLen: UByte = 0u,
    public var sinFamily: UByte = 0u,
    public var sinPort: UShort = 0u,
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

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SockaddrIn> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SockaddrIn> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): SockaddrIn =
                    SockaddrIn(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 1L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 2L),
                        (InAddr.typeLayout()).readNative(addr + 4L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (8).toInt())
                        ).readNative(addr + 8L).toUByteArray(),
                    )
                override fun writeNative(addr: Long, value: SockaddrIn) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr, value.sinLen)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 1L, value.sinFamily)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 2L, value.sinPort)
                    (InAddr.typeLayout()).writeNative(addr + 4L, value.sinAddr)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (8).toInt())
                    ).writeNative(addr + 8L, value.sinZero.toList())
                }
            }
    }
}

// in6.h
public data class SockaddrIn6(
    public var sin6Len: UByte = 0u,
    public var sin6Family: UByte = 0u,
    public var sin6Port: UShort = 0u,
    public var sin6Flowinfo: UInt = 0u,
    public var sin6Addr: In6Addr = In6Addr(),
    public var sin6ScopeId: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SockaddrIn6> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SockaddrIn6> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 28L
                override fun readNative(addr: Long): SockaddrIn6 =
                    SockaddrIn6(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 1L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 2L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (In6Addr.typeLayout()).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 24L),
                    )
                override fun writeNative(addr: Long, value: SockaddrIn6) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr, value.sin6Len)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 1L, value.sin6Family)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 2L, value.sin6Port)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.sin6Flowinfo)
                    (In6Addr.typeLayout()).writeNative(addr + 8L, value.sin6Addr)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 24L, value.sin6ScopeId)
                }
            }
    }
}

public class DlInfo internal constructor(
    dliFnameCtorArg: ConstPtr,
    dliFbaseCtorArg: MutPtr,
    dliSnameCtorArg: ConstPtr,
    dliSaddrCtorArg: MutPtr,
) {
    public var dliFname: ConstPtr = dliFnameCtorArg
        internal set

    public var dliFbase: MutPtr = dliFbaseCtorArg
        internal set

    public var dliSname: ConstPtr = dliSnameCtorArg
        internal set

    public var dliSaddr: MutPtr = dliSaddrCtorArg
        internal set

    public constructor() : this(
        dliFnameCtorArg = ConstPtr(0L),
        dliFbaseCtorArg = MutPtr(0L),
        dliSnameCtorArg = ConstPtr(0L),
        dliSaddrCtorArg = MutPtr(0L),
    )

    public operator fun component1(): ConstPtr = this.dliFname

    public operator fun component2(): MutPtr = this.dliFbase

    public operator fun component3(): ConstPtr = this.dliSname

    public operator fun component4(): MutPtr = this.dliSaddr

    public fun copy(dliFname: ConstPtr = this.dliFname, dliFbase: MutPtr = this.dliFbase, dliSname: ConstPtr = this.dliSname, dliSaddr: MutPtr = this.dliSaddr): DlInfo = DlInfo(dliFnameCtorArg = dliFname, dliFbaseCtorArg = dliFbase, dliSnameCtorArg = dliSname, dliSaddrCtorArg = dliSaddr)

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
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 32L
                override fun readNative(addr: Long): DlInfo =
                    DlInfo(
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .constPtrLayout(64)
                        ).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 8L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .constPtrLayout(64)
                        ).readNative(addr + 16L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 24L),
                    )
                override fun writeNative(addr: Long, value: DlInfo) {
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .constPtrLayout(64)
                    ).writeNative(addr, value.dliFname)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 8L, value.dliFbase)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .constPtrLayout(64)
                    ).writeNative(addr + 16L, value.dliSname)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 24L, value.dliSaddr)
                }
            }

        public operator fun invoke(
            dliFname: ConstPtr = ConstPtr(0L),
            dliFbase: MutPtr = MutPtr(0L),
            dliSname: ConstPtr = ConstPtr(0L),
            dliSaddr: MutPtr = MutPtr(0L),
        ): DlInfo =
            DlInfo(
                dliFnameCtorArg = dliFname,
                dliFbaseCtorArg = dliFbase,
                dliSnameCtorArg = dliSname,
                dliSaddrCtorArg = dliSaddr,
            )
    }
}

public data class MqAttr(
    public var mqMaxmsg: CLong = 0L,
    public var mqMsgsize: CLong = 0L,
    public var mqFlags: CLong = 0L,
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
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr, value.mqMaxmsg)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 8L, value.mqMsgsize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 16L, value.mqFlags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 24L, value.mqCurmsgs)
                }
            }
    }
}

public data class Winsize(
    public var wsRow: CUshort = 0u,
    public var wsCol: CUshort = 0u,
    public var wsXpixel: CUshort = 0u,
    public var wsYpixel: CUshort = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Winsize> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Winsize> {
                override val alignBytes: Long = 2L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): Winsize =
                    Winsize(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 2L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 6L),
                    )
                override fun writeNative(addr: Long, value: Winsize) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.wsRow)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 2L, value.wsCol)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 4L, value.wsXpixel)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 6L, value.wsYpixel)
                }
            }
    }
}

public data class Termios(
    public var cIflag: TcflagT = 0u,
    public var cOflag: TcflagT = 0u,
    public var cCflag: TcflagT = 0u,
    public var cLflag: TcflagT = 0u,
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

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Termios> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Termios> {
                override val alignBytes: Long = 4L
                private val off5: Long =
                    io.github.kotlinmania.rustlang.core.mem
                        .alignUpBytes((16L + ((NCCS).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).strideBytes)), 4L)
                private val off6: Long =
                    io.github.kotlinmania.rustlang.core.mem
                        .alignUpBytes((off5 + 4L), 4L)
                override val sizeBytes: Long =
                    io.github.kotlinmania.rustlang.core.mem
                        .alignUpBytes((off6 + 4L), 4L)
                override fun readNative(addr: Long): Termios =
                    Termios(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (NCCS))
                        ).readNative(addr + 16L).toUByteArray(),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + off5),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + off6),
                    )
                override fun writeNative(addr: Long, value: Termios) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.cIflag)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.cOflag)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.cCflag)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.cLflag)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (NCCS))
                    ).writeNative(addr + 16L, value.cCc.toList())
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + off5, value.cIspeed)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + off6, value.cOspeed)
                }
            }
    }
}

public data class Rusage(
    public var ruUtime: Timeval = Timeval(),
    public var ruStime: Timeval = Timeval(),
    public var ruMaxrss: CLong = 0L,
    public var ruIxrss: CLong = 0L,
    public var ruIdrss: CLong = 0L,
    public var ruIsrss: CLong = 0L,
    public var ruMinflt: CLong = 0L,
    public var ruMajflt: CLong = 0L,
    public var ruNswap: CLong = 0L,
    public var ruInblock: CLong = 0L,
    public var ruOublock: CLong = 0L,
    public var ruMsgsnd: CLong = 0L,
    public var ruMsgrcv: CLong = 0L,
    public var ruNsignals: CLong = 0L,
    public var ruNvcsw: CLong = 0L,
    public var ruNivcsw: CLong = 0L,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Rusage> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Rusage> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 144L
                override fun readNative(addr: Long): Rusage =
                    Rusage(
                        (Timeval.typeLayout()).readNative(addr),
                        (Timeval.typeLayout()).readNative(addr + 16L),
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
                    )
                override fun writeNative(addr: Long, value: Rusage) {
                    (Timeval.typeLayout()).writeNative(addr, value.ruUtime)
                    (Timeval.typeLayout()).writeNative(addr + 16L, value.ruStime)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 32L, value.ruMaxrss)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 40L, value.ruIxrss)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 48L, value.ruIdrss)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 56L, value.ruIsrss)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 64L, value.ruMinflt)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 72L, value.ruMajflt)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 80L, value.ruNswap)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 88L, value.ruInblock)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 96L, value.ruOublock)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 104L, value.ruMsgsnd)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 112L, value.ruMsgrcv)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 120L, value.ruNsignals)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 128L, value.ruNvcsw)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 136L, value.ruNivcsw)
                }
            }
    }
}

public class Lconv internal constructor(
    currencySymbolCtorArg: MutPtr,
    intCurrSymbolCtorArg: MutPtr,
    monDecimalPointCtorArg: MutPtr,
    monGroupingCtorArg: MutPtr,
    monThousandsSepCtorArg: MutPtr,
    negativeSignCtorArg: MutPtr,
    positiveSignCtorArg: MutPtr,
    public var fracDigits: CChar,
    public var nCsPrecedes: CChar,
    public var nSepBySpace: CChar,
    public var nSignPosn: CChar,
    public var pCsPrecedes: CChar,
    public var pSepBySpace: CChar,
    public var pSignPosn: CChar,
    public var intFracDigits: CChar,
    public var intNCsPrecedes: CChar,
    public var intNSepBySpace: CChar,
    public var intNSignPosn: CChar,
    public var intPCsPrecedes: CChar,
    public var intPSepBySpace: CChar,
    public var intPSignPosn: CChar,
    decimalPointCtorArg: MutPtr,
    groupingCtorArg: MutPtr,
    thousandsSepCtorArg: MutPtr,
    fracGroupingCtorArg: MutPtr,
    fracSepCtorArg: MutPtr,
    falseValCtorArg: MutPtr,
    trueValCtorArg: MutPtr,
    noCtorArg: MutPtr,
    yesCtorArg: MutPtr,
) {
    public var currencySymbol: MutPtr = currencySymbolCtorArg
        internal set

    public var intCurrSymbol: MutPtr = intCurrSymbolCtorArg
        internal set

    public var monDecimalPoint: MutPtr = monDecimalPointCtorArg
        internal set

    public var monGrouping: MutPtr = monGroupingCtorArg
        internal set

    public var monThousandsSep: MutPtr = monThousandsSepCtorArg
        internal set

    public var negativeSign: MutPtr = negativeSignCtorArg
        internal set

    public var positiveSign: MutPtr = positiveSignCtorArg
        internal set

    public var decimalPoint: MutPtr = decimalPointCtorArg
        internal set

    public var grouping: MutPtr = groupingCtorArg
        internal set

    public var thousandsSep: MutPtr = thousandsSepCtorArg
        internal set

    public var fracGrouping: MutPtr = fracGroupingCtorArg
        internal set

    public var fracSep: MutPtr = fracSepCtorArg
        internal set

    public var falseVal: MutPtr = falseValCtorArg
        internal set

    public var trueVal: MutPtr = trueValCtorArg
        internal set

    public var no: MutPtr = noCtorArg
        internal set

    public var yes: MutPtr = yesCtorArg
        internal set

    public constructor() : this(
        currencySymbolCtorArg = MutPtr(0L),
        intCurrSymbolCtorArg = MutPtr(0L),
        monDecimalPointCtorArg = MutPtr(0L),
        monGroupingCtorArg = MutPtr(0L),
        monThousandsSepCtorArg = MutPtr(0L),
        negativeSignCtorArg = MutPtr(0L),
        positiveSignCtorArg = MutPtr(0L),
        fracDigits = 0u,
        nCsPrecedes = 0u,
        nSepBySpace = 0u,
        nSignPosn = 0u,
        pCsPrecedes = 0u,
        pSepBySpace = 0u,
        pSignPosn = 0u,
        intFracDigits = 0u,
        intNCsPrecedes = 0u,
        intNSepBySpace = 0u,
        intNSignPosn = 0u,
        intPCsPrecedes = 0u,
        intPSepBySpace = 0u,
        intPSignPosn = 0u,
        decimalPointCtorArg = MutPtr(0L),
        groupingCtorArg = MutPtr(0L),
        thousandsSepCtorArg = MutPtr(0L),
        fracGroupingCtorArg = MutPtr(0L),
        fracSepCtorArg = MutPtr(0L),
        falseValCtorArg = MutPtr(0L),
        trueValCtorArg = MutPtr(0L),
        noCtorArg = MutPtr(0L),
        yesCtorArg = MutPtr(0L),
    )

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Lconv> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Lconv> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 144L
                override fun readNative(addr: Long): Lconv =
                    Lconv(
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 8L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 16L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 24L),
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
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 56L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 57L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 58L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 59L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 60L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 61L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 62L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 63L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 64L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 65L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 66L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 67L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 68L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 69L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 72L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 80L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 88L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 96L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 104L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 112L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 120L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 128L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 136L),
                    )
                override fun writeNative(addr: Long, value: Lconv) {
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr, value.currencySymbol)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 8L, value.intCurrSymbol)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 16L, value.monDecimalPoint)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 24L, value.monGrouping)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 32L, value.monThousandsSep)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 40L, value.negativeSign)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 48L, value.positiveSign)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 56L, value.fracDigits)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 57L, value.nCsPrecedes)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 58L, value.nSepBySpace)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 59L, value.nSignPosn)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 60L, value.pCsPrecedes)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 61L, value.pSepBySpace)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 62L, value.pSignPosn)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 63L, value.intFracDigits)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 64L, value.intNCsPrecedes)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 65L, value.intNSepBySpace)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 66L, value.intNSignPosn)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 67L, value.intPCsPrecedes)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 68L, value.intPSepBySpace)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 69L, value.intPSignPosn)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 72L, value.decimalPoint)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 80L, value.grouping)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 88L, value.thousandsSep)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 96L, value.fracGrouping)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 104L, value.fracSep)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 112L, value.falseVal)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 120L, value.trueVal)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 128L, value.no)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 136L, value.yes)
                }
            }

        public operator fun invoke(
            currencySymbol: MutPtr = MutPtr(0L),
            intCurrSymbol: MutPtr = MutPtr(0L),
            monDecimalPoint: MutPtr = MutPtr(0L),
            monGrouping: MutPtr = MutPtr(0L),
            monThousandsSep: MutPtr = MutPtr(0L),
            negativeSign: MutPtr = MutPtr(0L),
            positiveSign: MutPtr = MutPtr(0L),
            fracDigits: CChar = 0u,
            nCsPrecedes: CChar = 0u,
            nSepBySpace: CChar = 0u,
            nSignPosn: CChar = 0u,
            pCsPrecedes: CChar = 0u,
            pSepBySpace: CChar = 0u,
            pSignPosn: CChar = 0u,
            intFracDigits: CChar = 0u,
            intNCsPrecedes: CChar = 0u,
            intNSepBySpace: CChar = 0u,
            intNSignPosn: CChar = 0u,
            intPCsPrecedes: CChar = 0u,
            intPSepBySpace: CChar = 0u,
            intPSignPosn: CChar = 0u,
            decimalPoint: MutPtr = MutPtr(0L),
            grouping: MutPtr = MutPtr(0L),
            thousandsSep: MutPtr = MutPtr(0L),
            fracGrouping: MutPtr = MutPtr(0L),
            fracSep: MutPtr = MutPtr(0L),
            falseVal: MutPtr = MutPtr(0L),
            trueVal: MutPtr = MutPtr(0L),
            no: MutPtr = MutPtr(0L),
            yes: MutPtr = MutPtr(0L),
        ): Lconv =
            Lconv(
                currencySymbolCtorArg = currencySymbol,
                intCurrSymbolCtorArg = intCurrSymbol,
                monDecimalPointCtorArg = monDecimalPoint,
                monGroupingCtorArg = monGrouping,
                monThousandsSepCtorArg = monThousandsSep,
                negativeSignCtorArg = negativeSign,
                positiveSignCtorArg = positiveSign,
                fracDigits = fracDigits,
                nCsPrecedes = nCsPrecedes,
                nSepBySpace = nSepBySpace,
                nSignPosn = nSignPosn,
                pCsPrecedes = pCsPrecedes,
                pSepBySpace = pSepBySpace,
                pSignPosn = pSignPosn,
                intFracDigits = intFracDigits,
                intNCsPrecedes = intNCsPrecedes,
                intNSepBySpace = intNSepBySpace,
                intNSignPosn = intNSignPosn,
                intPCsPrecedes = intPCsPrecedes,
                intPSepBySpace = intPSepBySpace,
                intPSignPosn = intPSignPosn,
                decimalPointCtorArg = decimalPoint,
                groupingCtorArg = grouping,
                thousandsSepCtorArg = thousandsSep,
                fracGroupingCtorArg = fracGrouping,
                fracSepCtorArg = fracSep,
                falseValCtorArg = falseVal,
                trueValCtorArg = trueVal,
                noCtorArg = no,
                yesCtorArg = yes,
            )
    }
}

// grp.h
public class Group internal constructor(
    grNameCtorArg: MutPtr,
    grPasswdCtorArg: MutPtr,
    public var grGid: CInt,
    grMemCtorArg: MutPtr,
) {
    public var grName: MutPtr = grNameCtorArg
        internal set

    public var grPasswd: MutPtr = grPasswdCtorArg
        internal set

    public var grMem: MutPtr = grMemCtorArg
        internal set

    public constructor() : this(
        grNameCtorArg = MutPtr(0L),
        grPasswdCtorArg = MutPtr(0L),
        grGid = 0,
        grMemCtorArg = MutPtr(0L),
    )

    public operator fun component1(): MutPtr = this.grName

    public operator fun component2(): MutPtr = this.grPasswd

    public operator fun component3(): CInt = this.grGid

    public operator fun component4(): MutPtr = this.grMem

    public fun copy(grName: MutPtr = this.grName, grPasswd: MutPtr = this.grPasswd, grGid: CInt = this.grGid, grMem: MutPtr = this.grMem): Group = Group(grNameCtorArg = grName, grPasswdCtorArg = grPasswd, grGid = grGid, grMemCtorArg = grMem)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Group) return false
        if (this.grName != other.grName) return false
        if (this.grPasswd != other.grPasswd) return false
        if (this.grGid != other.grGid) return false
        if (this.grMem != other.grMem) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.grName.hashCode()
        result = 31 * result + this.grPasswd.hashCode()
        result = 31 * result + this.grGid.hashCode()
        result = 31 * result + this.grMem.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Group> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Group> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 32L
                override fun readNative(addr: Long): Group =
                    Group(
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 16L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 24L),
                    )
                override fun writeNative(addr: Long, value: Group) {
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr, value.grName)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 8L, value.grPasswd)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 16L, value.grGid)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 24L, value.grMem)
                }
            }

        public operator fun invoke(
            grName: MutPtr = MutPtr(0L),
            grPasswd: MutPtr = MutPtr(0L),
            grGid: CInt = 0,
            grMem: MutPtr = MutPtr(0L),
        ): Group =
            Group(
                grNameCtorArg = grName,
                grPasswdCtorArg = grPasswd,
                grGid = grGid,
                grMemCtorArg = grMem,
            )
    }
}

public data class Utsname(
    public var sysname: UByteArray = UByteArray(80),
    public var nodename: UByteArray = UByteArray(256),
    public var release: UByteArray = UByteArray(80),
    public var version: UByteArray = UByteArray(256),
    public var machine: UByteArray = UByteArray(256),
    public var endian: UByteArray = UByteArray(80),
    public var kernelversion: UByteArray = UByteArray(80),
    public var releaseversion: UByteArray = UByteArray(80),
    public var processor: UByteArray = UByteArray(80),
    public var bsprevision: UByteArray = UByteArray(80),
    public var builddate: UByteArray = UByteArray(80),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Utsname) return false
        if (!this.sysname.contentEquals(other.sysname)) return false
        if (!this.nodename.contentEquals(other.nodename)) return false
        if (!this.release.contentEquals(other.release)) return false
        if (!this.version.contentEquals(other.version)) return false
        if (!this.machine.contentEquals(other.machine)) return false
        if (!this.endian.contentEquals(other.endian)) return false
        if (!this.kernelversion.contentEquals(other.kernelversion)) return false
        if (!this.releaseversion.contentEquals(other.releaseversion)) return false
        if (!this.processor.contentEquals(other.processor)) return false
        if (!this.bsprevision.contentEquals(other.bsprevision)) return false
        if (!this.builddate.contentEquals(other.builddate)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.sysname.contentHashCode()
        result = 31 * result + this.nodename.contentHashCode()
        result = 31 * result + this.release.contentHashCode()
        result = 31 * result + this.version.contentHashCode()
        result = 31 * result + this.machine.contentHashCode()
        result = 31 * result + this.endian.contentHashCode()
        result = 31 * result + this.kernelversion.contentHashCode()
        result = 31 * result + this.releaseversion.contentHashCode()
        result = 31 * result + this.processor.contentHashCode()
        result = 31 * result + this.bsprevision.contentHashCode()
        result = 31 * result + this.builddate.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Utsname> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Utsname> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 1408L
                override fun readNative(addr: Long): Utsname =
                    Utsname(
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (80).toInt())
                        ).readNative(addr).toUByteArray(),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (256).toInt())
                        ).readNative(addr + 80L).toUByteArray(),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (80).toInt())
                        ).readNative(addr + 336L).toUByteArray(),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (256).toInt())
                        ).readNative(addr + 416L).toUByteArray(),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (256).toInt())
                        ).readNative(addr + 672L).toUByteArray(),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (80).toInt())
                        ).readNative(addr + 928L).toUByteArray(),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (80).toInt())
                        ).readNative(addr + 1008L).toUByteArray(),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (80).toInt())
                        ).readNative(addr + 1088L).toUByteArray(),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (80).toInt())
                        ).readNative(addr + 1168L).toUByteArray(),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (80).toInt())
                        ).readNative(addr + 1248L).toUByteArray(),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (80).toInt())
                        ).readNative(addr + 1328L).toUByteArray(),
                    )
                override fun writeNative(addr: Long, value: Utsname) {
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (80).toInt())
                    ).writeNative(addr, value.sysname.toList())
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (256).toInt())
                    ).writeNative(addr + 80L, value.nodename.toList())
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (80).toInt())
                    ).writeNative(addr + 336L, value.release.toList())
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (256).toInt())
                    ).writeNative(addr + 416L, value.version.toList())
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (256).toInt())
                    ).writeNative(addr + 672L, value.machine.toList())
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (80).toInt())
                    ).writeNative(addr + 928L, value.endian.toList())
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (80).toInt())
                    ).writeNative(addr + 1008L, value.kernelversion.toList())
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (80).toInt())
                    ).writeNative(addr + 1088L, value.releaseversion.toList())
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (80).toInt())
                    ).writeNative(addr + 1168L, value.processor.toList())
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (80).toInt())
                    ).writeNative(addr + 1248L, value.bsprevision.toList())
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (80).toInt())
                    ).writeNative(addr + 1328L, value.builddate.toList())
                }
            }
    }
}

// dirent.h
public data class Dirent(
    public var dIno: InoT = 0uL,
    public var dName: UByteArray = UByteArray(PARM_NAME_MAX + 1),
    public var dType: CUchar = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Dirent) return false
        if (this.dIno != other.dIno) return false
        if (!this.dName.contentEquals(other.dName)) return false
        if (this.dType != other.dType) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dIno.hashCode()
        result = 31 * result + this.dName.contentHashCode()
        result = 31 * result + this.dType.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Dirent> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Dirent> {
                override val alignBytes: Long = 8L
                private val off2: Long =
                    io.github.kotlinmania.rustlang.core.mem
                        .alignUpBytes((8L + ((PARM_NAME_MAX + 1).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).strideBytes)), 1L)
                override val sizeBytes: Long =
                    io.github.kotlinmania.rustlang.core.mem
                        .alignUpBytes((off2 + 1L), 8L)
                override fun readNative(addr: Long): Dirent =
                    Dirent(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (PARM_NAME_MAX + 1))
                        ).readNative(addr + 8L).toUByteArray(),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + off2),
                    )
                override fun writeNative(addr: Long, value: Dirent) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr, value.dIno)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (PARM_NAME_MAX + 1))
                    ).writeNative(addr + 8L, value.dName.toList())
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + off2, value.dType)
                }
            }
    }
}

public data class SockaddrUn(
    public var sunLen: UByte = 0u,
    public var sunFamily: SaFamilyT = 0u,
    public var sunPath: UByteArray = UByteArray(104),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SockaddrUn) return false
        if (this.sunLen != other.sunLen) return false
        if (this.sunFamily != other.sunFamily) return false
        if (!this.sunPath.contentEquals(other.sunPath)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.sunLen.hashCode()
        result = 31 * result + this.sunFamily.hashCode()
        result = 31 * result + this.sunPath.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SockaddrUn> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SockaddrUn> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 106L
                override fun readNative(addr: Long): SockaddrUn =
                    SockaddrUn(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 1L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (104).toInt())
                        ).readNative(addr + 2L).toUByteArray(),
                    )
                override fun writeNative(addr: Long, value: SockaddrUn) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr, value.sunLen)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 1L, value.sunFamily)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (104).toInt())
                    ).writeNative(addr + 2L, value.sunPath.toList())
                }
            }
    }
}

// rtpLibCommon.h
public class RtpDesc internal constructor(
    public var status: CInt,
    public var options: UInt,
    entrAddrCtorArg: MutPtr,
    public var initTaskId: TaskId,
    public var parentId: RtpId,
    public var pathName: UByteArray,
    public var taskCnt: CInt,
    textStartCtorArg: MutPtr,
    textEndCtorArg: MutPtr,
) {
    public var entrAddr: MutPtr = entrAddrCtorArg
        internal set

    public var textStart: MutPtr = textStartCtorArg
        internal set

    public var textEnd: MutPtr = textEndCtorArg
        internal set

    public constructor() : this(
        status = 0,
        options = 0u,
        entrAddrCtorArg = MutPtr(0L),
        initTaskId = 0,
        parentId = 0,
        pathName = UByteArray(VX_RTP_NAME_LENGTH + 1),
        taskCnt = 0,
        textStartCtorArg = MutPtr(0L),
        textEndCtorArg = MutPtr(0L),
    )

    public operator fun component1(): CInt = this.status

    public operator fun component2(): UInt = this.options

    public operator fun component3(): MutPtr = this.entrAddr

    public operator fun component4(): TaskId = this.initTaskId

    public operator fun component5(): RtpId = this.parentId

    public operator fun component6(): UByteArray = this.pathName

    public operator fun component7(): CInt = this.taskCnt

    public operator fun component8(): MutPtr = this.textStart

    public operator fun component9(): MutPtr = this.textEnd

    public fun copy(status: CInt = this.status, options: UInt = this.options, entrAddr: MutPtr = this.entrAddr, initTaskId: TaskId = this.initTaskId, parentId: RtpId = this.parentId, pathName: UByteArray = this.pathName, taskCnt: CInt = this.taskCnt, textStart: MutPtr = this.textStart, textEnd: MutPtr = this.textEnd): RtpDesc = RtpDesc(status = status, options = options, entrAddrCtorArg = entrAddr, initTaskId = initTaskId, parentId = parentId, pathName = pathName, taskCnt = taskCnt, textStartCtorArg = textStart, textEndCtorArg = textEnd)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is RtpDesc) return false
        if (this.status != other.status) return false
        if (this.options != other.options) return false
        if (this.entrAddr != other.entrAddr) return false
        if (this.initTaskId != other.initTaskId) return false
        if (this.parentId != other.parentId) return false
        if (!this.pathName.contentEquals(other.pathName)) return false
        if (this.taskCnt != other.taskCnt) return false
        if (this.textStart != other.textStart) return false
        if (this.textEnd != other.textEnd) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.status.hashCode()
        result = 31 * result + this.options.hashCode()
        result = 31 * result + this.entrAddr.hashCode()
        result = 31 * result + this.initTaskId.hashCode()
        result = 31 * result + this.parentId.hashCode()
        result = 31 * result + this.pathName.contentHashCode()
        result = 31 * result + this.taskCnt.hashCode()
        result = 31 * result + this.textStart.hashCode()
        result = 31 * result + this.textEnd.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<RtpDesc> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<RtpDesc> {
                override val alignBytes: Long = 8L
                private val off6: Long =
                    io.github.kotlinmania.rustlang.core.mem
                        .alignUpBytes((24L + ((VX_RTP_NAME_LENGTH + 1).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).strideBytes)), 4L)
                private val off7: Long =
                    io.github.kotlinmania.rustlang.core.mem
                        .alignUpBytes((off6 + 4L), 8L)
                private val off8: Long =
                    io.github.kotlinmania.rustlang.core.mem
                        .alignUpBytes((off7 + 8L), 8L)
                override val sizeBytes: Long =
                    io.github.kotlinmania.rustlang.core.mem
                        .alignUpBytes((off8 + 8L), 8L)
                override fun readNative(addr: Long): RtpDesc =
                    RtpDesc(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 20L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (VX_RTP_NAME_LENGTH + 1))
                        ).readNative(addr + 24L).toUByteArray(),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + off6),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + off7),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + off8),
                    )
                override fun writeNative(addr: Long, value: RtpDesc) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.status)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.options)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 8L, value.entrAddr)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 16L, value.initTaskId)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 20L, value.parentId)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (VX_RTP_NAME_LENGTH + 1))
                    ).writeNative(addr + 24L, value.pathName.toList())
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + off6, value.taskCnt)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + off7, value.textStart)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + off8, value.textEnd)
                }
            }

        public operator fun invoke(
            status: CInt = 0,
            options: UInt = 0u,
            entrAddr: MutPtr = MutPtr(0L),
            initTaskId: TaskId = 0,
            parentId: RtpId = 0,
            pathName: UByteArray = UByteArray(VX_RTP_NAME_LENGTH + 1),
            taskCnt: CInt = 0,
            textStart: MutPtr = MutPtr(0L),
            textEnd: MutPtr = MutPtr(0L),
        ): RtpDesc =
            RtpDesc(
                status = status,
                options = options,
                entrAddrCtorArg = entrAddr,
                initTaskId = initTaskId,
                parentId = parentId,
                pathName = pathName,
                taskCnt = taskCnt,
                textStartCtorArg = textStart,
                textEndCtorArg = textEnd,
            )
    }
}

// socket.h
public data class SockaddrStorage(
    public var ssLen: CUchar = 0u,
    public var ssFamily: SaFamilyT = 0u,
    public var ssPad1: UByteArray = UByteArray(SS_PAD1SIZE),
    public var ssAlign: Int = 0,
    public var ssPad2: UByteArray = UByteArray(SS_PAD2SIZE),
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

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SockaddrStorage> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SockaddrStorage> {
                override val alignBytes: Long = 4L
                private val off3: Long =
                    io.github.kotlinmania.rustlang.core.mem
                        .alignUpBytes((2L + ((SS_PAD1SIZE).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).strideBytes)), 4L)
                private val off4: Long =
                    io.github.kotlinmania.rustlang.core.mem
                        .alignUpBytes((off3 + 4L), 1L)
                override val sizeBytes: Long =
                    io.github.kotlinmania.rustlang.core.mem
                        .alignUpBytes((off4 + ((SS_PAD2SIZE).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).strideBytes)), 4L)
                override fun readNative(addr: Long): SockaddrStorage =
                    SockaddrStorage(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 1L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (SS_PAD1SIZE))
                        ).readNative(addr + 2L).toUByteArray(),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + off3),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (SS_PAD2SIZE))
                        ).readNative(addr + off4).toUByteArray(),
                    )
                override fun writeNative(addr: Long, value: SockaddrStorage) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr, value.ssLen)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 1L, value.ssFamily)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (SS_PAD1SIZE))
                    ).writeNative(addr + 2L, value.ssPad1.toList())
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + off3, value.ssAlign)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (SS_PAD2SIZE))
                    ).writeNative(addr + off4, value.ssPad2.toList())
                }
            }
    }
}

public data class SaUT(
    public var saHandler: SaUTSaHandlerCallback? = null,
    public var saSigaction: SaUTSaSigactionCallback? = null,
) {
    public fun fmt(f: StringBuilder) {
        DebugStruct(f, "sa_u_t").finishNonExhaustive()
    }

    public fun eq(other: SaUT): Boolean =
        run {
            val h1 =
                when (val matchVal = this.saHandler) {
                    null -> 0
                    else -> {
                        val handler = matchVal
                        ((handler as? ExternFnPtr)?.rawAddress ?: error("Kotlin closure callback has no native C function address")).toInt()
                    }
                }
            val h2 =
                when (val matchVal1 = other.saHandler) {
                    null -> 0
                    else -> {
                        val handler1 = matchVal1
                        ((handler1 as? ExternFnPtr)?.rawAddress ?: error("Kotlin closure callback has no native C function address")).toInt()
                    }
                }
            h1 == h2
        }

    public override fun hashCode(): Int {
        var state = 0
        run {
            val h =
                when (val matchVal = this.saHandler) {
                    null -> 0
                    else -> {
                        val handler = matchVal
                        ((handler as? ExternFnPtr)?.rawAddress ?: error("Kotlin closure callback has no native C function address")).toInt()
                    }
                }
            state = 31 * state + (h).hashCode()
        }
        return state
    }
}

public class Sigval internal constructor(
    public var sivalInt: CInt,
    sivalPtrCtorArg: MutPtr,
) {
    public var sivalPtr: MutPtr = sivalPtrCtorArg
        internal set

    public constructor() : this(
        sivalInt = 0,
        sivalPtrCtorArg = MutPtr(0L),
    )

    public operator fun component1(): CInt = this.sivalInt

    public operator fun component2(): MutPtr = this.sivalPtr

    public fun copy(sivalInt: CInt = this.sivalInt, sivalPtr: MutPtr = this.sivalPtr): Sigval = Sigval(sivalInt = sivalInt, sivalPtrCtorArg = sivalPtr)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Sigval) return false
        if (this.sivalInt != other.sivalInt) return false
        if (this.sivalPtr != other.sivalPtr) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.sivalInt.hashCode()
        result = 31 * result + this.sivalPtr.hashCode()
        return result
    }

    public fun fmt(f: StringBuilder) {
        DebugStruct(f, "sigval").finishNonExhaustive()
    }

    public fun eq(other: Sigval): Boolean = this.sivalPtr.rawAddress.toInt() == other.sivalPtr.rawAddress.toInt()

    public companion object {
        public operator fun invoke(
            sivalInt: CInt = 0,
            sivalPtr: MutPtr = MutPtr(0L),
        ): Sigval =
            Sigval(
                sivalInt = sivalInt,
                sivalPtrCtorArg = sivalPtr,
            )
    }
}
