// port-lint: source unix/aix/powerpc64.rs
@file:OptIn(ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.unix.aix.powerpc64

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CChar
import io.github.kotlinmania.libc.CDouble
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CLong
import io.github.kotlinmania.libc.CLonglong
import io.github.kotlinmania.libc.CShort
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.CUlong
import io.github.kotlinmania.libc.CUlonglong
import io.github.kotlinmania.libc.CUshort
import io.github.kotlinmania.libc.unix.GidT
import io.github.kotlinmania.libc.unix.PidT
import io.github.kotlinmania.libc.unix.Sigval
import io.github.kotlinmania.libc.unix.SizeT
import io.github.kotlinmania.libc.unix.SsizeT
import io.github.kotlinmania.libc.unix.Timeval
import io.github.kotlinmania.libc.unix.UidT
import io.github.kotlinmania.libc.unix.aix.BlkcntT
import io.github.kotlinmania.libc.unix.aix.BlksizeT
import io.github.kotlinmania.libc.unix.aix.CaddrT
import io.github.kotlinmania.libc.unix.aix.DevT
import io.github.kotlinmania.libc.unix.aix.FsblkcntT
import io.github.kotlinmania.libc.unix.aix.FsfilcntT
import io.github.kotlinmania.libc.unix.aix.Fsid64T
import io.github.kotlinmania.libc.unix.aix.InoT
import io.github.kotlinmania.libc.unix.aix.IpcPerm
import io.github.kotlinmania.libc.unix.aix.ModeT
import io.github.kotlinmania.libc.unix.aix.NlinkT
import io.github.kotlinmania.libc.unix.aix.OffT
import io.github.kotlinmania.libc.unix.aix.Sigevent
import io.github.kotlinmania.libc.unix.aix.StTimespec
import io.github.kotlinmania.libc.unix.aix.StackT
import io.github.kotlinmania.libc.unix.aix.TimeT
import io.github.kotlinmania.libc.unix.aix.UioRw
import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
import io.github.kotlinmania.rustlang.core.mem.TypeLayout
import io.github.kotlinmania.rustlang.core.ptr.MutPtr

public fun interface FileopsTFoRwCallback {
    public operator fun invoke(file: MutPtr<File>, rw: UioRw, io: MutPtr<CVoid>, ext: CLong, secattr: MutPtr<CVoid>): CInt
}

public fun interface FileopsTFoIoctlCallback {
    public operator fun invoke(file: MutPtr<File>, a: CLong, b: CaddrT, c: CLong, d: CLong): CInt
}

public fun interface FnCallback {
    public operator fun invoke()
}

public fun interface FileopsTFoSelectCallback {
    public operator fun invoke(file: MutPtr<File>, a: CInt, b: MutPtr<CUshort>, c: FnCallback): CInt
}

public fun interface FileopsTFoCloseCallback {
    public operator fun invoke(file: MutPtr<File>): CInt
}

public fun interface FileopsTFoFstatCallback {
    public operator fun invoke(file: MutPtr<File>, sstat: MutPtr<Stat>): CInt
}

// Define lockDataInstrumented as an empty enum
public class LockDataInstrumented(
    public val handle: Long = -1L,
) {
    public val ptr: Long get() = handle
}

public data class SigsetT(
    public var ssSet: ULongArray = ULongArray(4),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SigsetT) return false
        if (!this.ssSet.contentEquals(other.ssSet)) return false
        return true
    }

    override fun hashCode(): Int = this.ssSet.contentHashCode()

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SigsetT> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SigsetT> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 32L
                override fun readNative(addr: Long): SigsetT =
                    SigsetT(
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64, (4).toInt())
                        ).readNative(addr).toULongArray(),
                    )
                override fun writeNative(addr: Long, value: SigsetT) {
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64, (4).toInt())
                    ).writeNative(addr, value.ssSet.toList())
                }
            }
    }
}

public data class FdSet(
    public var fdsBits: LongArray = LongArray(1024),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FdSet) return false
        if (!this.fdsBits.contentEquals(other.fdsBits)) return false
        return true
    }

    override fun hashCode(): Int = this.fdsBits.contentHashCode()

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<FdSet> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<FdSet> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 8192L
                override fun readNative(addr: Long): FdSet =
                    FdSet(
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64, (1024).toInt())
                        ).readNative(addr).toLongArray(),
                    )
                override fun writeNative(addr: Long, value: FdSet) {
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64, (1024).toInt())
                    ).writeNative(addr, value.fdsBits.toList())
                }
            }
    }
}

public data class Flock(
    public var lType: CShort = 0,
    public var lWhence: CShort = 0,
    public var lSysid: CUint = 0u,
    public var lPid: PidT = 0,
    public var lVfs: CInt = 0,
    public var lStart: OffT = 0L,
    public var lLen: OffT = 0L,
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
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 24L),
                    )
                override fun writeNative(addr: Long, value: Flock) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).writeNative(addr, value.lType)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).writeNative(addr + 2L, value.lWhence)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.lSysid)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 8L, value.lPid)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 12L, value.lVfs)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 16L, value.lStart)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 24L, value.lLen)
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
    public var fBasetype: UByteArray = UByteArray(16),
    public var fFlag: CUlong = 0uL,
    public var fNamemax: CUlong = 0uL,
    public var fFstr: UByteArray = UByteArray(32),
    public var fFiller: ULongArray = ULongArray(16),
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
        if (!this.fBasetype.contentEquals(other.fBasetype)) return false
        if (this.fFlag != other.fFlag) return false
        if (this.fNamemax != other.fNamemax) return false
        if (!this.fFstr.contentEquals(other.fFstr)) return false
        if (!this.fFiller.contentEquals(other.fFiller)) return false
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
        result = 31 * result + this.fBasetype.contentHashCode()
        result = 31 * result + this.fFlag.hashCode()
        result = 31 * result + this.fNamemax.hashCode()
        result = 31 * result + this.fFstr.contentHashCode()
        result = 31 * result + this.fFiller.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Statvfs> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Statvfs> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 264L
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
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (16).toInt())
                        ).readNative(addr + 72L).toUByteArray(),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 88L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 96L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (32).toInt())
                        ).readNative(addr + 104L).toUByteArray(),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64, (16).toInt())
                        ).readNative(addr + 136L).toULongArray(),
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
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (16).toInt())
                    ).writeNative(addr + 72L, value.fBasetype.toList())
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 88L, value.fFlag)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 96L, value.fNamemax)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (32).toInt())
                    ).writeNative(addr + 104L, value.fFstr.toList())
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64, (16).toInt())
                    ).writeNative(addr + 136L, value.fFiller.toList())
                }
            }
    }
}

public data class PthreadRwlockT(
    public var rwWord: LongArray = LongArray(10),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PthreadRwlockT) return false
        if (!this.rwWord.contentEquals(other.rwWord)) return false
        return true
    }

    override fun hashCode(): Int = this.rwWord.contentHashCode()

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<PthreadRwlockT> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<PthreadRwlockT> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 80L
                override fun readNative(addr: Long): PthreadRwlockT =
                    PthreadRwlockT(
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64, (10).toInt())
                        ).readNative(addr).toLongArray(),
                    )
                override fun writeNative(addr: Long, value: PthreadRwlockT) {
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64, (10).toInt())
                    ).writeNative(addr, value.rwWord.toList())
                }
            }
    }
}

public data class PthreadCondT(
    public var cvWord: LongArray = LongArray(6),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PthreadCondT) return false
        if (!this.cvWord.contentEquals(other.cvWord)) return false
        return true
    }

    override fun hashCode(): Int = this.cvWord.contentHashCode()

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<PthreadCondT> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<PthreadCondT> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 48L
                override fun readNative(addr: Long): PthreadCondT =
                    PthreadCondT(
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64, (6).toInt())
                        ).readNative(addr).toLongArray(),
                    )
                override fun writeNative(addr: Long, value: PthreadCondT) {
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64, (6).toInt())
                    ).writeNative(addr, value.cvWord.toList())
                }
            }
    }
}

public data class PthreadMutexT(
    public var mtWord: LongArray = LongArray(8),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PthreadMutexT) return false
        if (!this.mtWord.contentEquals(other.mtWord)) return false
        return true
    }

    override fun hashCode(): Int = this.mtWord.contentHashCode()

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<PthreadMutexT> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<PthreadMutexT> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 64L
                override fun readNative(addr: Long): PthreadMutexT =
                    PthreadMutexT(
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64, (8).toInt())
                        ).readNative(addr).toLongArray(),
                    )
                override fun writeNative(addr: Long, value: PthreadMutexT) {
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64, (8).toInt())
                    ).writeNative(addr, value.mtWord.toList())
                }
            }
    }
}

public data class PthreadOnceT(
    public var onWord: LongArray = LongArray(9),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PthreadOnceT) return false
        if (!this.onWord.contentEquals(other.onWord)) return false
        return true
    }

    override fun hashCode(): Int = this.onWord.contentHashCode()

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<PthreadOnceT> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<PthreadOnceT> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 72L
                override fun readNative(addr: Long): PthreadOnceT =
                    PthreadOnceT(
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64, (9).toInt())
                        ).readNative(addr).toLongArray(),
                    )
                override fun writeNative(addr: Long, value: PthreadOnceT) {
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64, (9).toInt())
                    ).writeNative(addr, value.onWord.toList())
                }
            }
    }
}

public class Stat(
    public var stDev: DevT = 0uL,
    public var stIno: InoT = 0uL,
    public var stMode: ModeT = 0u,
    public var stNlink: NlinkT = 0,
    public var stFlag: CUshort = 0u,
    public var stUid: UidT = 0u,
    public var stGid: GidT = 0u,
    public var stRdev: DevT = 0uL,
    public var stSsize: CInt = 0,
    public var stAtim: StTimespec = StTimespec(),
    public var stMtim: StTimespec = StTimespec(),
    public var stCtim: StTimespec = StTimespec(),
    public var stBlksize: BlksizeT = 0L,
    public var stBlocks: BlkcntT = 0L,
    public var stVfstype: CInt = 0,
    public var stVfs: CUint = 0u,
    public var stType: CUint = 0u,
    public var stGen: CUint = 0u,
    public var stReserved: UIntArray = UIntArray(9),
    public var stPadtoLl: CUint = 0u,
    public var stSize: OffT = 0L,
)

public class Statfs(
    public var fVersion: CInt = 0,
    public var fType: CInt = 0,
    public var fBsize: CUlong = 0uL,
    public var fBlocks: FsblkcntT = 0uL,
    public var fBfree: FsblkcntT = 0uL,
    public var fBavail: FsblkcntT = 0uL,
    public var fFiles: FsblkcntT = 0uL,
    public var fFfree: FsblkcntT = 0uL,
    public var fFsid: Fsid64T = Fsid64T(),
    public var fVfstype: CInt = 0,
    public var fFsize: CUlong = 0uL,
    public var fVfsnumber: CInt = 0,
    public var fVfsoff: CInt = 0,
    public var fVfslen: CInt = 0,
    public var fVfsvers: CInt = 0,
    public var fFname: UByteArray = UByteArray(32),
    public var fFpack: UByteArray = UByteArray(32),
    public var fNameMax: CInt = 0,
)

public class Aiocb internal constructor(
    public var aioLioOpcode: CInt,
    public var aioFildes: CInt,
    public var aioWord1: CInt,
    public var aioOffset: OffT,
    aioBufCtorArg: MutPtr<CVoid>,
    public var aioReturn: SsizeT,
    public var aioErrno: CInt,
    public var aioNbytes: SizeT,
    public var aioReqprio: CInt,
    public var aioSigevent: Sigevent,
    public var aioWord2: CInt,
    public var aioFp: CInt,
    aioHandleCtorArg: MutPtr<Aiocb>,
    public var aioReserved: UIntArray,
    public var aioSigevTid: CLong,
) {
    public var aioBuf: MutPtr<CVoid> = aioBufCtorArg
        internal set

    public var aioHandle: MutPtr<Aiocb> = aioHandleCtorArg
        internal set

    public constructor() : this(
        aioLioOpcode = 0,
        aioFildes = 0,
        aioWord1 = 0,
        aioOffset = 0L,
        aioBufCtorArg = MutPtr(0L),
        aioReturn = 0L,
        aioErrno = 0,
        aioNbytes = 0uL,
        aioReqprio = 0,
        aioSigevent = Sigevent(),
        aioWord2 = 0,
        aioFp = 0,
        aioHandleCtorArg = MutPtr(0L),
        aioReserved = UIntArray(2),
        aioSigevTid = 0L,
    )

    public operator fun component1(): CInt = this.aioLioOpcode

    public operator fun component2(): CInt = this.aioFildes

    public operator fun component3(): CInt = this.aioWord1

    public operator fun component4(): OffT = this.aioOffset

    public operator fun component5(): MutPtr<CVoid> = this.aioBuf

    public operator fun component6(): SsizeT = this.aioReturn

    public operator fun component7(): CInt = this.aioErrno

    public operator fun component8(): SizeT = this.aioNbytes

    public operator fun component9(): CInt = this.aioReqprio

    public operator fun component10(): Sigevent = this.aioSigevent

    public operator fun component11(): CInt = this.aioWord2

    public operator fun component12(): CInt = this.aioFp

    public operator fun component13(): MutPtr<Aiocb> = this.aioHandle

    public operator fun component14(): UIntArray = this.aioReserved

    public operator fun component15(): CLong = this.aioSigevTid

    public fun copy(aioLioOpcode: CInt = this.aioLioOpcode, aioFildes: CInt = this.aioFildes, aioWord1: CInt = this.aioWord1, aioOffset: OffT = this.aioOffset, aioBuf: MutPtr<CVoid> = this.aioBuf, aioReturn: SsizeT = this.aioReturn, aioErrno: CInt = this.aioErrno, aioNbytes: SizeT = this.aioNbytes, aioReqprio: CInt = this.aioReqprio, aioSigevent: Sigevent = this.aioSigevent, aioWord2: CInt = this.aioWord2, aioFp: CInt = this.aioFp, aioHandle: MutPtr<Aiocb> = this.aioHandle, aioReserved: UIntArray = this.aioReserved, aioSigevTid: CLong = this.aioSigevTid): Aiocb = Aiocb(aioLioOpcode = aioLioOpcode, aioFildes = aioFildes, aioWord1 = aioWord1, aioOffset = aioOffset, aioBufCtorArg = aioBuf, aioReturn = aioReturn, aioErrno = aioErrno, aioNbytes = aioNbytes, aioReqprio = aioReqprio, aioSigevent = aioSigevent, aioWord2 = aioWord2, aioFp = aioFp, aioHandleCtorArg = aioHandle, aioReserved = aioReserved, aioSigevTid = aioSigevTid)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Aiocb) return false
        if (this.aioLioOpcode != other.aioLioOpcode) return false
        if (this.aioFildes != other.aioFildes) return false
        if (this.aioWord1 != other.aioWord1) return false
        if (this.aioOffset != other.aioOffset) return false
        if (this.aioBuf != other.aioBuf) return false
        if (this.aioReturn != other.aioReturn) return false
        if (this.aioErrno != other.aioErrno) return false
        if (this.aioNbytes != other.aioNbytes) return false
        if (this.aioReqprio != other.aioReqprio) return false
        if (this.aioSigevent != other.aioSigevent) return false
        if (this.aioWord2 != other.aioWord2) return false
        if (this.aioFp != other.aioFp) return false
        if (this.aioHandle != other.aioHandle) return false
        if (!this.aioReserved.contentEquals(other.aioReserved)) return false
        if (this.aioSigevTid != other.aioSigevTid) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.aioLioOpcode.hashCode()
        result = 31 * result + this.aioFildes.hashCode()
        result = 31 * result + this.aioWord1.hashCode()
        result = 31 * result + this.aioOffset.hashCode()
        result = 31 * result + this.aioBuf.hashCode()
        result = 31 * result + this.aioReturn.hashCode()
        result = 31 * result + this.aioErrno.hashCode()
        result = 31 * result + this.aioNbytes.hashCode()
        result = 31 * result + this.aioReqprio.hashCode()
        result = 31 * result + this.aioSigevent.hashCode()
        result = 31 * result + this.aioWord2.hashCode()
        result = 31 * result + this.aioFp.hashCode()
        result = 31 * result + this.aioHandle.hashCode()
        result = 31 * result + this.aioReserved.contentHashCode()
        result = 31 * result + this.aioSigevTid.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            aioLioOpcode: CInt = 0,
            aioFildes: CInt = 0,
            aioWord1: CInt = 0,
            aioOffset: OffT = 0L,
            aioBuf: MutPtr<CVoid> = MutPtr(0L),
            aioReturn: SsizeT = 0L,
            aioErrno: CInt = 0,
            aioNbytes: SizeT = 0uL,
            aioReqprio: CInt = 0,
            aioSigevent: Sigevent = Sigevent(),
            aioWord2: CInt = 0,
            aioFp: CInt = 0,
            aioHandle: MutPtr<Aiocb> = MutPtr(0L),
            aioReserved: UIntArray = UIntArray(2),
            aioSigevTid: CLong = 0L,
        ): Aiocb =
            Aiocb(
                aioLioOpcode = aioLioOpcode,
                aioFildes = aioFildes,
                aioWord1 = aioWord1,
                aioOffset = aioOffset,
                aioBufCtorArg = aioBuf,
                aioReturn = aioReturn,
                aioErrno = aioErrno,
                aioNbytes = aioNbytes,
                aioReqprio = aioReqprio,
                aioSigevent = aioSigevent,
                aioWord2 = aioWord2,
                aioFp = aioFp,
                aioHandleCtorArg = aioHandle,
                aioReserved = aioReserved,
                aioSigevTid = aioSigevTid,
            )
    }
}

public data class VmxregT(
    public var v: UIntArray = UIntArray(4),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is VmxregT) return false
        if (!this.v.contentEquals(other.v)) return false
        return true
    }

    override fun hashCode(): Int = this.v.contentHashCode()

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<VmxregT> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<VmxregT> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): VmxregT =
                    VmxregT(
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32, (4).toInt())
                        ).readNative(addr).toUIntArray(),
                    )
                override fun writeNative(addr: Long, value: VmxregT) {
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32, (4).toInt())
                    ).writeNative(addr, value.v.toList())
                }
            }
    }
}

public data class VmxContextT(
    public var vr: List<VmxregT> = List(32) { VmxregT() },
    public var pad1: UIntArray = UIntArray(3),
    public var vscr: CUint = 0u,
    public var vrsave: CUint = 0u,
    public var pad2: UIntArray = UIntArray(3),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is VmxContextT) return false
        if (this.vr != other.vr) return false
        if (!this.pad1.contentEquals(other.pad1)) return false
        if (this.vscr != other.vscr) return false
        if (this.vrsave != other.vrsave) return false
        if (!this.pad2.contentEquals(other.pad2)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.vr.hashCode()
        result = 31 * result + this.pad1.contentHashCode()
        result = 31 * result + this.vscr.hashCode()
        result = 31 * result + this.vrsave.hashCode()
        result = 31 * result + this.pad2.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<VmxContextT> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<VmxContextT> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 544L
                override fun readNative(addr: Long): VmxContextT =
                    VmxContextT(
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(VmxregT.typeLayout(), (32).toInt())
                        ).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32, (3).toInt())
                        ).readNative(addr + 512L).toUIntArray(),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 524L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 528L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32, (3).toInt())
                        ).readNative(addr + 532L).toUIntArray(),
                    )
                override fun writeNative(addr: Long, value: VmxContextT) {
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(VmxregT.typeLayout(), (32).toInt())
                    ).writeNative(addr, value.vr)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32, (3).toInt())
                    ).writeNative(addr + 512L, value.pad1.toList())
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 524L, value.vscr)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 528L, value.vrsave)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32, (3).toInt())
                    ).writeNative(addr + 532L, value.pad2.toList())
                }
            }
    }
}

public data class VsxContextT(
    public var vsrDw1: ULongArray = ULongArray(32),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is VsxContextT) return false
        if (!this.vsrDw1.contentEquals(other.vsrDw1)) return false
        return true
    }

    override fun hashCode(): Int = this.vsrDw1.contentHashCode()

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<VsxContextT> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<VsxContextT> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 256L
                override fun readNative(addr: Long): VsxContextT =
                    VsxContextT(
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64, (32).toInt())
                        ).readNative(addr).toULongArray(),
                    )
                override fun writeNative(addr: Long, value: VsxContextT) {
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64, (32).toInt())
                    ).writeNative(addr, value.vsrDw1.toList())
                }
            }
    }
}

public class TmContextT(
    public var vmx: VmxContextT = VmxContextT(),
    public var vsx: VsxContextT = VsxContextT(),
    public var gpr: ULongArray = ULongArray(32),
    public var lr: CUlonglong = 0uL,
    public var ctr: CUlonglong = 0uL,
    public var cr: CUint = 0u,
    public var xer: CUint = 0u,
    public var amr: CUlonglong = 0uL,
    public var texasr: CUlonglong = 0uL,
    public var tfiar: CUlonglong = 0uL,
    public var tfhar: CUlonglong = 0uL,
    public var ppr: CUlonglong = 0uL,
    public var dscr: CUlonglong = 0uL,
    public var tar: CUlonglong = 0uL,
    public var fpscr: CUint = 0u,
    public var fpscrx: CUint = 0u,
    public var fpr: List<FpregT> = List(32) { FpregT() },
    public var tmcontext: CChar = 0u,
    public var tmstate: CChar = 0u,
    public var prevowner: CChar = 0u,
    public var pad: UByteArray = UByteArray(5),
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<TmContextT> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<TmContextT> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 1408L
                override fun readNative(addr: Long): TmContextT =
                    TmContextT(
                        (VmxContextT.typeLayout()).readNative(addr),
                        (VsxContextT.typeLayout()).readNative(addr + 544L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64, (32).toInt())
                        ).readNative(addr + 800L).toULongArray(),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 1056L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 1064L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 1072L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 1076L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 1080L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 1088L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 1096L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 1104L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 1112L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 1120L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 1128L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 1136L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 1140L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(FpregT.typeLayout(), (32).toInt())
                        ).readNative(addr + 1144L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 1400L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 1401L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 1402L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (5).toInt())
                        ).readNative(addr + 1403L).toUByteArray(),
                    )
                override fun writeNative(addr: Long, value: TmContextT) {
                    (VmxContextT.typeLayout()).writeNative(addr, value.vmx)
                    (VsxContextT.typeLayout()).writeNative(addr + 544L, value.vsx)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64, (32).toInt())
                    ).writeNative(addr + 800L, value.gpr.toList())
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 1056L, value.lr)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 1064L, value.ctr)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 1072L, value.cr)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 1076L, value.xer)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 1080L, value.amr)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 1088L, value.texasr)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 1096L, value.tfiar)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 1104L, value.tfhar)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 1112L, value.ppr)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 1120L, value.dscr)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 1128L, value.tar)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 1136L, value.fpscr)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 1140L, value.fpscrx)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(FpregT.typeLayout(), (32).toInt())
                    ).writeNative(addr + 1144L, value.fpr)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 1400L, value.tmcontext)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 1401L, value.tmstate)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 1402L, value.prevowner)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (5).toInt())
                    ).writeNative(addr + 1403L, value.pad.toList())
                }
            }
    }
}

public data class Context64(
    public var gpr: ULongArray = ULongArray(32),
    public var msr: CUlonglong = 0uL,
    public var iar: CUlonglong = 0uL,
    public var lr: CUlonglong = 0uL,
    public var ctr: CUlonglong = 0uL,
    public var cr: CUint = 0u,
    public var xer: CUint = 0u,
    public var fpscr: CUint = 0u,
    public var fpscrx: CUint = 0u,
    public var except: ULongArray = ULongArray(1),
    public var fpr: List<FpregT> = List(32) { FpregT() },
    public var fpeu: CChar = 0u,
    public var fpinfo: CChar = 0u,
    public var fpscr2431: CChar = 0u,
    public var pad: UByteArray = UByteArray(1),
    public var excpType: CInt = 0,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Context64) return false
        if (!this.gpr.contentEquals(other.gpr)) return false
        if (this.msr != other.msr) return false
        if (this.iar != other.iar) return false
        if (this.lr != other.lr) return false
        if (this.ctr != other.ctr) return false
        if (this.cr != other.cr) return false
        if (this.xer != other.xer) return false
        if (this.fpscr != other.fpscr) return false
        if (this.fpscrx != other.fpscrx) return false
        if (!this.except.contentEquals(other.except)) return false
        if (this.fpr != other.fpr) return false
        if (this.fpeu != other.fpeu) return false
        if (this.fpinfo != other.fpinfo) return false
        if (this.fpscr2431 != other.fpscr2431) return false
        if (!this.pad.contentEquals(other.pad)) return false
        if (this.excpType != other.excpType) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.gpr.contentHashCode()
        result = 31 * result + this.msr.hashCode()
        result = 31 * result + this.iar.hashCode()
        result = 31 * result + this.lr.hashCode()
        result = 31 * result + this.ctr.hashCode()
        result = 31 * result + this.cr.hashCode()
        result = 31 * result + this.xer.hashCode()
        result = 31 * result + this.fpscr.hashCode()
        result = 31 * result + this.fpscrx.hashCode()
        result = 31 * result + this.except.contentHashCode()
        result = 31 * result + this.fpr.hashCode()
        result = 31 * result + this.fpeu.hashCode()
        result = 31 * result + this.fpinfo.hashCode()
        result = 31 * result + this.fpscr2431.hashCode()
        result = 31 * result + this.pad.contentHashCode()
        result = 31 * result + this.excpType.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Context64> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Context64> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 576L
                override fun readNative(addr: Long): Context64 =
                    Context64(
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64, (32).toInt())
                        ).readNative(addr).toULongArray(),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 256L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 264L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 272L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 280L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 288L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 292L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 296L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 300L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64, (1).toInt())
                        ).readNative(addr + 304L).toULongArray(),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(FpregT.typeLayout(), (32).toInt())
                        ).readNative(addr + 312L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 568L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 569L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 570L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (1).toInt())
                        ).readNative(addr + 571L).toUByteArray(),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 572L),
                    )
                override fun writeNative(addr: Long, value: Context64) {
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64, (32).toInt())
                    ).writeNative(addr, value.gpr.toList())
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 256L, value.msr)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 264L, value.iar)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 272L, value.lr)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 280L, value.ctr)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 288L, value.cr)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 292L, value.xer)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 296L, value.fpscr)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 300L, value.fpscrx)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64, (1).toInt())
                    ).writeNative(addr + 304L, value.except.toList())
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(FpregT.typeLayout(), (32).toInt())
                    ).writeNative(addr + 312L, value.fpr)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 568L, value.fpeu)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 569L, value.fpinfo)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 570L, value.fpscr2431)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (1).toInt())
                    ).writeNative(addr + 571L, value.pad.toList())
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 572L, value.excpType)
                }
            }
    }
}

public data class McontextT(
    public var jmpContext: Context64 = Context64(),
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<McontextT> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<McontextT> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 576L
                override fun readNative(addr: Long): McontextT =
                    McontextT(
                        (Context64.typeLayout()).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: McontextT) {
                    (Context64.typeLayout()).writeNative(addr, value.jmpContext)
                }
            }
    }
}

public data class ExtctxT(
    public var flags: CUint = 0u,
    public var rsvd1: UIntArray = UIntArray(3),
    public var vmx: VmxContextT = VmxContextT(),
    public var ukeys: UIntArray = UIntArray(2),
    public var vsx: VsxContextT = VsxContextT(),
    public var tm: TmContextT = TmContextT(),
    public var reserved: UByteArray = UByteArray(1860),
    public var extctxMagic: CInt = 0,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ExtctxT) return false
        if (this.flags != other.flags) return false
        if (!this.rsvd1.contentEquals(other.rsvd1)) return false
        if (this.vmx != other.vmx) return false
        if (!this.ukeys.contentEquals(other.ukeys)) return false
        if (this.vsx != other.vsx) return false
        if (this.tm != other.tm) return false
        if (!this.reserved.contentEquals(other.reserved)) return false
        if (this.extctxMagic != other.extctxMagic) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.flags.hashCode()
        result = 31 * result + this.rsvd1.contentHashCode()
        result = 31 * result + this.vmx.hashCode()
        result = 31 * result + this.ukeys.contentHashCode()
        result = 31 * result + this.vsx.hashCode()
        result = 31 * result + this.tm.hashCode()
        result = 31 * result + this.reserved.contentHashCode()
        result = 31 * result + this.extctxMagic.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ExtctxT> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ExtctxT> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 4096L
                override fun readNative(addr: Long): ExtctxT =
                    ExtctxT(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32, (3).toInt())
                        ).readNative(addr + 4L).toUIntArray(),
                        (VmxContextT.typeLayout()).readNative(addr + 16L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32, (2).toInt())
                        ).readNative(addr + 560L).toUIntArray(),
                        (VsxContextT.typeLayout()).readNative(addr + 568L),
                        (TmContextT.typeLayout()).readNative(addr + 824L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (1860).toInt())
                        ).readNative(addr + 2232L).toUByteArray(),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 4092L),
                    )
                override fun writeNative(addr: Long, value: ExtctxT) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.flags)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32, (3).toInt())
                    ).writeNative(addr + 4L, value.rsvd1.toList())
                    (VmxContextT.typeLayout()).writeNative(addr + 16L, value.vmx)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32, (2).toInt())
                    ).writeNative(addr + 560L, value.ukeys.toList())
                    (VsxContextT.typeLayout()).writeNative(addr + 568L, value.vsx)
                    (TmContextT.typeLayout()).writeNative(addr + 824L, value.tm)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (1860).toInt())
                    ).writeNative(addr + 2232L, value.reserved.toList())
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 4092L, value.extctxMagic)
                }
            }
    }
}

public class UcontextT internal constructor(
    public var scOnstack: CInt,
    public var ucSigmask: SigsetT,
    public var scUerror: CInt,
    ucMcontextCtorArg: McontextT,
    ucLinkCtorArg: MutPtr<UcontextT>,
    public var ucStack: StackT,
    extctxCtorArg: MutPtr<ExtctxT>,
    public var extctxMagic: CInt,
    public var pad: IntArray,
) {
    public var ucMcontext: McontextT = ucMcontextCtorArg
        internal set

    public var ucLink: MutPtr<UcontextT> = ucLinkCtorArg
        internal set

    public var extctx: MutPtr<ExtctxT> = extctxCtorArg
        internal set

    public constructor() : this(
        scOnstack = 0,
        ucSigmask = SigsetT(),
        scUerror = 0,
        ucMcontextCtorArg = McontextT(),
        ucLinkCtorArg = MutPtr(0L),
        ucStack = StackT(),
        extctxCtorArg = MutPtr(0L),
        extctxMagic = 0,
        pad = IntArray(1),
    )

    public operator fun component1(): CInt = this.scOnstack

    public operator fun component2(): SigsetT = this.ucSigmask

    public operator fun component3(): CInt = this.scUerror

    public operator fun component4(): McontextT = this.ucMcontext

    public operator fun component5(): MutPtr<UcontextT> = this.ucLink

    public operator fun component6(): StackT = this.ucStack

    public operator fun component7(): MutPtr<ExtctxT> = this.extctx

    public operator fun component8(): CInt = this.extctxMagic

    public operator fun component9(): IntArray = this.pad

    public fun copy(scOnstack: CInt = this.scOnstack, ucSigmask: SigsetT = this.ucSigmask, scUerror: CInt = this.scUerror, ucMcontext: McontextT = this.ucMcontext, ucLink: MutPtr<UcontextT> = this.ucLink, ucStack: StackT = this.ucStack, extctx: MutPtr<ExtctxT> = this.extctx, extctxMagic: CInt = this.extctxMagic, pad: IntArray = this.pad): UcontextT = UcontextT(scOnstack = scOnstack, ucSigmask = ucSigmask, scUerror = scUerror, ucMcontextCtorArg = ucMcontext, ucLinkCtorArg = ucLink, ucStack = ucStack, extctxCtorArg = extctx, extctxMagic = extctxMagic, pad = pad)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is UcontextT) return false
        if (this.scOnstack != other.scOnstack) return false
        if (this.ucSigmask != other.ucSigmask) return false
        if (this.scUerror != other.scUerror) return false
        if (this.ucMcontext != other.ucMcontext) return false
        if (this.ucLink != other.ucLink) return false
        if (this.ucStack != other.ucStack) return false
        if (this.extctx != other.extctx) return false
        if (this.extctxMagic != other.extctxMagic) return false
        if (!this.pad.contentEquals(other.pad)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.scOnstack.hashCode()
        result = 31 * result + this.ucSigmask.hashCode()
        result = 31 * result + this.scUerror.hashCode()
        result = 31 * result + this.ucMcontext.hashCode()
        result = 31 * result + this.ucLink.hashCode()
        result = 31 * result + this.ucStack.hashCode()
        result = 31 * result + this.extctx.hashCode()
        result = 31 * result + this.extctxMagic.hashCode()
        result = 31 * result + this.pad.contentHashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            scOnstack: CInt = 0,
            ucSigmask: SigsetT = SigsetT(),
            scUerror: CInt = 0,
            ucMcontext: McontextT = McontextT(),
            ucLink: MutPtr<UcontextT> = MutPtr(0L),
            ucStack: StackT = StackT(),
            extctx: MutPtr<ExtctxT> = MutPtr(0L),
            extctxMagic: CInt = 0,
            pad: IntArray = IntArray(1),
        ): UcontextT =
            UcontextT(
                scOnstack = scOnstack,
                ucSigmask = ucSigmask,
                scUerror = scUerror,
                ucMcontextCtorArg = ucMcontext,
                ucLinkCtorArg = ucLink,
                ucStack = ucStack,
                extctxCtorArg = extctx,
                extctxMagic = extctxMagic,
                pad = pad,
            )
    }
}

public data class Utmpx(
    public var utUser: UByteArray = UByteArray(256),
    public var utId: UByteArray = UByteArray(14),
    public var utLine: UByteArray = UByteArray(64),
    public var utPid: PidT = 0,
    public var utType: CShort = 0,
    public var utTv: Timeval = Timeval(),
    public var utHost: UByteArray = UByteArray(256),
    public var dblWordPad: CInt = 0,
    public var reservedA: IntArray = IntArray(2),
    public var reservedV: IntArray = IntArray(6),
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
        if (this.dblWordPad != other.dblWordPad) return false
        if (!this.reservedA.contentEquals(other.reservedA)) return false
        if (!this.reservedV.contentEquals(other.reservedV)) return false
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
        result = 31 * result + this.dblWordPad.hashCode()
        result = 31 * result + this.reservedA.contentHashCode()
        result = 31 * result + this.reservedV.contentHashCode()
        return result
    }
}

public data class PthreadSpinlockT(
    public var spWord: LongArray = LongArray(3),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PthreadSpinlockT) return false
        if (!this.spWord.contentEquals(other.spWord)) return false
        return true
    }

    override fun hashCode(): Int = this.spWord.contentHashCode()

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<PthreadSpinlockT> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<PthreadSpinlockT> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 24L
                override fun readNative(addr: Long): PthreadSpinlockT =
                    PthreadSpinlockT(
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64, (3).toInt())
                        ).readNative(addr).toLongArray(),
                    )
                override fun writeNative(addr: Long, value: PthreadSpinlockT) {
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64, (3).toInt())
                    ).writeNative(addr, value.spWord.toList())
                }
            }
    }
}

public data class PthreadBarrierT(
    public var brWord: LongArray = LongArray(5),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PthreadBarrierT) return false
        if (!this.brWord.contentEquals(other.brWord)) return false
        return true
    }

    override fun hashCode(): Int = this.brWord.contentHashCode()

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<PthreadBarrierT> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<PthreadBarrierT> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 40L
                override fun readNative(addr: Long): PthreadBarrierT =
                    PthreadBarrierT(
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64, (5).toInt())
                        ).readNative(addr).toLongArray(),
                    )
                override fun writeNative(addr: Long, value: PthreadBarrierT) {
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64, (5).toInt())
                    ).writeNative(addr, value.brWord.toList())
                }
            }
    }
}

public data class MsqidDs(
    public var msgPerm: IpcPerm = IpcPerm(),
    public var msgFirst: CUint = 0u,
    public var msgLast: CUint = 0u,
    public var msgCbytes: CUint = 0u,
    public var msgQnum: CUint = 0u,
    public var msgQbytes: CUlong = 0uL,
    public var msgLspid: PidT = 0,
    public var msgLrpid: PidT = 0,
    public var msgStime: TimeT = 0L,
    public var msgRtime: TimeT = 0L,
    public var msgCtime: TimeT = 0L,
    public var msgRwait: CInt = 0,
    public var msgWwait: CInt = 0,
    public var msgReqevents: CUshort = 0u,
)

public class SiginfoT internal constructor(
    public var siSigno: CInt,
    public var siErrno: CInt,
    public var siCode: CInt,
    public var siPid: PidT,
    public var siUid: UidT,
    public var siStatus: CInt,
    siAddrCtorArg: MutPtr<CVoid>,
    public var siBand: CLong,
    public var siValue: Sigval,
    public var siFlags: CInt,
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
        siBand = 0L,
        siValue = Sigval(),
        siFlags = 0,
        pad = IntArray(3),
    )

    public operator fun component1(): CInt = this.siSigno

    public operator fun component2(): CInt = this.siErrno

    public operator fun component3(): CInt = this.siCode

    public operator fun component4(): PidT = this.siPid

    public operator fun component5(): UidT = this.siUid

    public operator fun component6(): CInt = this.siStatus

    public operator fun component7(): MutPtr<CVoid> = this.siAddr

    public operator fun component8(): CLong = this.siBand

    public operator fun component9(): Sigval = this.siValue

    public operator fun component10(): CInt = this.siFlags

    public operator fun component11(): IntArray = this.pad

    public fun copy(siSigno: CInt = this.siSigno, siErrno: CInt = this.siErrno, siCode: CInt = this.siCode, siPid: PidT = this.siPid, siUid: UidT = this.siUid, siStatus: CInt = this.siStatus, siAddr: MutPtr<CVoid> = this.siAddr, siBand: CLong = this.siBand, siValue: Sigval = this.siValue, siFlags: CInt = this.siFlags, pad: IntArray = this.pad): SiginfoT = SiginfoT(siSigno = siSigno, siErrno = siErrno, siCode = siCode, siPid = siPid, siUid = siUid, siStatus = siStatus, siAddrCtorArg = siAddr, siBand = siBand, siValue = siValue, siFlags = siFlags, pad = pad)

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
        if (this.siBand != other.siBand) return false
        if (this.siValue != other.siValue) return false
        if (this.siFlags != other.siFlags) return false
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
        result = 31 * result + this.siBand.hashCode()
        result = 31 * result + this.siValue.hashCode()
        result = 31 * result + this.siFlags.hashCode()
        result = 31 * result + this.pad.contentHashCode()
        return result
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
            siBand: CLong = 0L,
            siValue: Sigval = Sigval(),
            siFlags: CInt = 0,
            pad: IntArray = IntArray(3),
        ): SiginfoT =
            SiginfoT(
                siSigno = siSigno,
                siErrno = siErrno,
                siCode = siCode,
                siPid = siPid,
                siUid = siUid,
                siStatus = siStatus,
                siAddrCtorArg = siAddr,
                siBand = siBand,
                siValue = siValue,
                siFlags = siFlags,
                pad = pad,
            )
    }
}

public data class PollfdExt(
    public var fd: CInt = 0,
    public var events: CShort = 0,
    public var revents: CShort = 0,
    public var data: PollfdExtU = PollfdExtU(),
)

public class KernelSimpleLock internal constructor(
    public var slock: CLong,
    slockpCtorArg: MutPtr<LockDataInstrumented>,
) {
    public var slockp: MutPtr<LockDataInstrumented> = slockpCtorArg
        internal set

    public constructor() : this(
        slock = 0L,
        slockpCtorArg = MutPtr(0L),
    )

    public operator fun component1(): CLong = this.slock

    public operator fun component2(): MutPtr<LockDataInstrumented> = this.slockp

    public fun copy(slock: CLong = this.slock, slockp: MutPtr<LockDataInstrumented> = this.slockp): KernelSimpleLock = KernelSimpleLock(slock = slock, slockpCtorArg = slockp)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is KernelSimpleLock) return false
        if (this.slock != other.slock) return false
        if (this.slockp != other.slockp) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.slock.hashCode()
        result = 31 * result + this.slockp.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            slock: CLong = 0L,
            slockp: MutPtr<LockDataInstrumented> = MutPtr(0L),
        ): KernelSimpleLock =
            KernelSimpleLock(
                slock = slock,
                slockpCtorArg = slockp,
            )
    }
}

public data class FileopsT(
    public var foRw: FileopsTFoRwCallback? = null,
    public var foIoctl: FileopsTFoIoctlCallback? = null,
    public var foSelect: FileopsTFoSelectCallback? = null,
    public var foClose: FileopsTFoCloseCallback? = null,
    public var foFstat: FileopsTFoFstatCallback? = null,
)

public class File internal constructor(
    public var fFlag: CLong,
    public var fCount: CInt,
    public var fOptions: CShort,
    public var fType: CShort,
    fDataCtorArg: MutPtr<CVoid>,
    public var fOffset: CLonglong,
    public var fDirOff: CLong,
    fCredCtorArg: MutPtr<CVoid>,
    public var fLock: KernelSimpleLock,
    public var fOffsetLock: KernelSimpleLock,
    fVinfoCtorArg: CaddrT,
    fOpsCtorArg: MutPtr<FileopsT>,
    fParentpCtorArg: CaddrT,
    fFnamepCtorArg: CaddrT,
    public var fFdata: UByteArray,
) {
    // Should be pointer to 'vnode'
    public var fData: MutPtr<CVoid> = fDataCtorArg
        internal set

    // Should be pointer to 'cred'
    public var fCred: MutPtr<CVoid> = fCredCtorArg
        internal set

    public var fVinfo: CaddrT = fVinfoCtorArg
        internal set

    public var fOps: MutPtr<FileopsT> = fOpsCtorArg
        internal set

    public var fParentp: CaddrT = fParentpCtorArg
        internal set

    public var fFnamep: CaddrT = fFnamepCtorArg
        internal set

    public constructor() : this(
        fFlag = 0L,
        fCount = 0,
        fOptions = 0,
        fType = 0,
        fDataCtorArg = MutPtr(0L),
        fOffset = 0L,
        fDirOff = 0L,
        fCredCtorArg = MutPtr(0L),
        fLock = KernelSimpleLock(),
        fOffsetLock = KernelSimpleLock(),
        fVinfoCtorArg = MutPtr(0L),
        fOpsCtorArg = MutPtr(0L),
        fParentpCtorArg = MutPtr(0L),
        fFnamepCtorArg = MutPtr(0L),
        fFdata = UByteArray(160),
    )

    public operator fun component1(): CLong = this.fFlag

    public operator fun component2(): CInt = this.fCount

    public operator fun component3(): CShort = this.fOptions

    public operator fun component4(): CShort = this.fType

    public operator fun component5(): MutPtr<CVoid> = this.fData

    public operator fun component6(): CLonglong = this.fOffset

    public operator fun component7(): CLong = this.fDirOff

    public operator fun component8(): MutPtr<CVoid> = this.fCred

    public operator fun component9(): KernelSimpleLock = this.fLock

    public operator fun component10(): KernelSimpleLock = this.fOffsetLock

    public operator fun component11(): CaddrT = this.fVinfo

    public operator fun component12(): MutPtr<FileopsT> = this.fOps

    public operator fun component13(): CaddrT = this.fParentp

    public operator fun component14(): CaddrT = this.fFnamep

    public operator fun component15(): UByteArray = this.fFdata

    public fun copy(fFlag: CLong = this.fFlag, fCount: CInt = this.fCount, fOptions: CShort = this.fOptions, fType: CShort = this.fType, fData: MutPtr<CVoid> = this.fData, fOffset: CLonglong = this.fOffset, fDirOff: CLong = this.fDirOff, fCred: MutPtr<CVoid> = this.fCred, fLock: KernelSimpleLock = this.fLock, fOffsetLock: KernelSimpleLock = this.fOffsetLock, fVinfo: CaddrT = this.fVinfo, fOps: MutPtr<FileopsT> = this.fOps, fParentp: CaddrT = this.fParentp, fFnamep: CaddrT = this.fFnamep, fFdata: UByteArray = this.fFdata): File = File(fFlag = fFlag, fCount = fCount, fOptions = fOptions, fType = fType, fDataCtorArg = fData, fOffset = fOffset, fDirOff = fDirOff, fCredCtorArg = fCred, fLock = fLock, fOffsetLock = fOffsetLock, fVinfoCtorArg = fVinfo, fOpsCtorArg = fOps, fParentpCtorArg = fParentp, fFnamepCtorArg = fFnamep, fFdata = fFdata)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is File) return false
        if (this.fFlag != other.fFlag) return false
        if (this.fCount != other.fCount) return false
        if (this.fOptions != other.fOptions) return false
        if (this.fType != other.fType) return false
        if (this.fData != other.fData) return false
        if (this.fOffset != other.fOffset) return false
        if (this.fDirOff != other.fDirOff) return false
        if (this.fCred != other.fCred) return false
        if (this.fLock != other.fLock) return false
        if (this.fOffsetLock != other.fOffsetLock) return false
        if (this.fVinfo != other.fVinfo) return false
        if (this.fOps != other.fOps) return false
        if (this.fParentp != other.fParentp) return false
        if (this.fFnamep != other.fFnamep) return false
        if (!this.fFdata.contentEquals(other.fFdata)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.fFlag.hashCode()
        result = 31 * result + this.fCount.hashCode()
        result = 31 * result + this.fOptions.hashCode()
        result = 31 * result + this.fType.hashCode()
        result = 31 * result + this.fData.hashCode()
        result = 31 * result + this.fOffset.hashCode()
        result = 31 * result + this.fDirOff.hashCode()
        result = 31 * result + this.fCred.hashCode()
        result = 31 * result + this.fLock.hashCode()
        result = 31 * result + this.fOffsetLock.hashCode()
        result = 31 * result + this.fVinfo.hashCode()
        result = 31 * result + this.fOps.hashCode()
        result = 31 * result + this.fParentp.hashCode()
        result = 31 * result + this.fFnamep.hashCode()
        result = 31 * result + this.fFdata.contentHashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            fFlag: CLong = 0L,
            fCount: CInt = 0,
            fOptions: CShort = 0,
            fType: CShort = 0,
            fData: MutPtr<CVoid> = MutPtr(0L),
            fOffset: CLonglong = 0L,
            fDirOff: CLong = 0L,
            fCred: MutPtr<CVoid> = MutPtr(0L),
            fLock: KernelSimpleLock = KernelSimpleLock(),
            fOffsetLock: KernelSimpleLock = KernelSimpleLock(),
            fVinfo: CaddrT = MutPtr(0L),
            fOps: MutPtr<FileopsT> = MutPtr(0L),
            fParentp: CaddrT = MutPtr(0L),
            fFnamep: CaddrT = MutPtr(0L),
            fFdata: UByteArray = UByteArray(160),
        ): File =
            File(
                fFlag = fFlag,
                fCount = fCount,
                fOptions = fOptions,
                fType = fType,
                fDataCtorArg = fData,
                fOffset = fOffset,
                fDirOff = fDirOff,
                fCredCtorArg = fCred,
                fLock = fLock,
                fOffsetLock = fOffsetLock,
                fVinfoCtorArg = fVinfo,
                fOpsCtorArg = fOps,
                fParentpCtorArg = fParentp,
                fFnamepCtorArg = fFnamep,
                fFdata = fFdata,
            )
    }
}

public class LdInfoFile internal constructor(
    public var ldinfoFd: CInt,
    ldinfoFpCtorArg: MutPtr<File>,
    public var coreOffset: CLong,
) {
    public var ldinfoFp: MutPtr<File> = ldinfoFpCtorArg
        internal set

    public constructor() : this(
        ldinfoFd = 0,
        ldinfoFpCtorArg = MutPtr(0L),
        coreOffset = 0L,
    )

    public operator fun component1(): CInt = this.ldinfoFd

    public operator fun component2(): MutPtr<File> = this.ldinfoFp

    public operator fun component3(): CLong = this.coreOffset

    public fun copy(ldinfoFd: CInt = this.ldinfoFd, ldinfoFp: MutPtr<File> = this.ldinfoFp, coreOffset: CLong = this.coreOffset): LdInfoFile = LdInfoFile(ldinfoFd = ldinfoFd, ldinfoFpCtorArg = ldinfoFp, coreOffset = coreOffset)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is LdInfoFile) return false
        if (this.ldinfoFd != other.ldinfoFd) return false
        if (this.ldinfoFp != other.ldinfoFp) return false
        if (this.coreOffset != other.coreOffset) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.ldinfoFd.hashCode()
        result = 31 * result + this.ldinfoFp.hashCode()
        result = 31 * result + this.coreOffset.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            ldinfoFd: CInt = 0,
            ldinfoFp: MutPtr<File> = MutPtr(0L),
            coreOffset: CLong = 0L,
        ): LdInfoFile =
            LdInfoFile(
                ldinfoFd = ldinfoFd,
                ldinfoFpCtorArg = ldinfoFp,
                coreOffset = coreOffset,
            )
    }
}

public class LdInfo internal constructor(
    public var ldinfoNext: CUint,
    public var ldinfoFlags: CUint,
    public var file: LdInfoFile,
    ldinfoTextorgCtorArg: MutPtr<CVoid>,
    public var ldinfoTextsize: CUlong,
    ldinfoDataorgCtorArg: MutPtr<CVoid>,
    public var ldinfoDatasize: CUlong,
    public var ldinfoFilename: UByteArray,
) {
    public var ldinfoTextorg: MutPtr<CVoid> = ldinfoTextorgCtorArg
        internal set

    public var ldinfoDataorg: MutPtr<CVoid> = ldinfoDataorgCtorArg
        internal set

    public constructor() : this(
        ldinfoNext = 0u,
        ldinfoFlags = 0u,
        file = LdInfoFile(),
        ldinfoTextorgCtorArg = MutPtr(0L),
        ldinfoTextsize = 0uL,
        ldinfoDataorgCtorArg = MutPtr(0L),
        ldinfoDatasize = 0uL,
        ldinfoFilename = UByteArray(2),
    )

    public operator fun component1(): CUint = this.ldinfoNext

    public operator fun component2(): CUint = this.ldinfoFlags

    public operator fun component3(): LdInfoFile = this.file

    public operator fun component4(): MutPtr<CVoid> = this.ldinfoTextorg

    public operator fun component5(): CUlong = this.ldinfoTextsize

    public operator fun component6(): MutPtr<CVoid> = this.ldinfoDataorg

    public operator fun component7(): CUlong = this.ldinfoDatasize

    public operator fun component8(): UByteArray = this.ldinfoFilename

    public fun copy(ldinfoNext: CUint = this.ldinfoNext, ldinfoFlags: CUint = this.ldinfoFlags, file: LdInfoFile = this.file, ldinfoTextorg: MutPtr<CVoid> = this.ldinfoTextorg, ldinfoTextsize: CUlong = this.ldinfoTextsize, ldinfoDataorg: MutPtr<CVoid> = this.ldinfoDataorg, ldinfoDatasize: CUlong = this.ldinfoDatasize, ldinfoFilename: UByteArray = this.ldinfoFilename): LdInfo = LdInfo(ldinfoNext = ldinfoNext, ldinfoFlags = ldinfoFlags, file = file, ldinfoTextorgCtorArg = ldinfoTextorg, ldinfoTextsize = ldinfoTextsize, ldinfoDataorgCtorArg = ldinfoDataorg, ldinfoDatasize = ldinfoDatasize, ldinfoFilename = ldinfoFilename)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is LdInfo) return false
        if (this.ldinfoNext != other.ldinfoNext) return false
        if (this.ldinfoFlags != other.ldinfoFlags) return false
        if (this.file != other.file) return false
        if (this.ldinfoTextorg != other.ldinfoTextorg) return false
        if (this.ldinfoTextsize != other.ldinfoTextsize) return false
        if (this.ldinfoDataorg != other.ldinfoDataorg) return false
        if (this.ldinfoDatasize != other.ldinfoDatasize) return false
        if (!this.ldinfoFilename.contentEquals(other.ldinfoFilename)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.ldinfoNext.hashCode()
        result = 31 * result + this.ldinfoFlags.hashCode()
        result = 31 * result + this.file.hashCode()
        result = 31 * result + this.ldinfoTextorg.hashCode()
        result = 31 * result + this.ldinfoTextsize.hashCode()
        result = 31 * result + this.ldinfoDataorg.hashCode()
        result = 31 * result + this.ldinfoDatasize.hashCode()
        result = 31 * result + this.ldinfoFilename.contentHashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            ldinfoNext: CUint = 0u,
            ldinfoFlags: CUint = 0u,
            file: LdInfoFile = LdInfoFile(),
            ldinfoTextorg: MutPtr<CVoid> = MutPtr(0L),
            ldinfoTextsize: CUlong = 0uL,
            ldinfoDataorg: MutPtr<CVoid> = MutPtr(0L),
            ldinfoDatasize: CUlong = 0uL,
            ldinfoFilename: UByteArray = UByteArray(2),
        ): LdInfo =
            LdInfo(
                ldinfoNext = ldinfoNext,
                ldinfoFlags = ldinfoFlags,
                file = file,
                ldinfoTextorgCtorArg = ldinfoTextorg,
                ldinfoTextsize = ldinfoTextsize,
                ldinfoDataorgCtorArg = ldinfoDataorg,
                ldinfoDatasize = ldinfoDatasize,
                ldinfoFilename = ldinfoFilename,
            )
    }
}

public class PollfdExtU internal constructor(
    addrCtorArg: MutPtr<CVoid>,
    public var data32: UInt,
    public var data: ULong,
) {
    public var addr: MutPtr<CVoid> = addrCtorArg
        internal set

    public constructor() : this(
        addrCtorArg = MutPtr(0L),
        data32 = 0u,
        data = 0uL,
    )

    public operator fun component1(): MutPtr<CVoid> = this.addr

    public operator fun component2(): UInt = this.data32

    public operator fun component3(): ULong = this.data

    public fun copy(addr: MutPtr<CVoid> = this.addr, data32: UInt = this.data32, data: ULong = this.data): PollfdExtU = PollfdExtU(addrCtorArg = addr, data32 = data32, data = data)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PollfdExtU) return false
        if (this.addr != other.addr) return false
        if (this.data32 != other.data32) return false
        if (this.data != other.data) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.addr.hashCode()
        result = 31 * result + this.data32.hashCode()
        result = 31 * result + this.data.hashCode()
        return result
    }

    public fun eq(other: PollfdExtU): Boolean = ((this.addr).rawAddress.toULong() == (other.addr).rawAddress.toULong()) && this.data32 == other.data32 && this.data == other.data

    public companion object {
        public operator fun invoke(
            addr: MutPtr<CVoid> = MutPtr(0L),
            data32: UInt = 0u,
            data: ULong = 0uL,
        ): PollfdExtU =
            PollfdExtU(
                addrCtorArg = addr,
                data32 = data32,
                data = data,
            )
    }
}

public data class FpregT(
    public var d: CDouble = 0.0,
) {
    public fun eq(other: FpregT): Boolean = this.d == other.d

    public override fun hashCode(): Int {
        var state = 0
        val d: ULong = this.d.toRawBits().toULong()
        state = 31 * state + (d).hashCode()
        return state
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<FpregT> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<FpregT> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): FpregT =
                    FpregT(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F64).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: FpregT) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F64).writeNative(addr, value.d)
                }
            }
    }
}

public val PTHREAD_MUTEX_INITIALIZER: PthreadMutexT = PthreadMutexT(mtWord = longArrayOf(0L, 2L, 0L, 0L, 0L, 0L, 0L, 0L))

public val PTHREAD_COND_INITIALIZER: PthreadCondT = PthreadCondT(cvWord = longArrayOf(0L, 0L, 0L, 0L, 2L, 0L))

public val PTHREAD_RWLOCK_INITIALIZER: PthreadRwlockT = PthreadRwlockT(rwWord = longArrayOf(2L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L))

public val PTHREAD_ONCE_INIT: PthreadOnceT = PthreadOnceT(onWord = longArrayOf(0L, 0L, 0L, 0L, 0L, 2L, 0L, 0L, 0L))

public val RLIM_INFINITY: CUlong = 0x7fffffffffffffffuL

public expect fun getsystemcfg(label: CInt): CUlong
