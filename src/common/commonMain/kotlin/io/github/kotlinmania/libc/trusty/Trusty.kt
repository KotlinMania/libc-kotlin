// port-lint: source trusty.rs
package io.github.kotlinmania.libc.trusty

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CChar
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CLong
import io.github.kotlinmania.libc.CUlong
import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
import io.github.kotlinmania.rustlang.core.mem.TypeLayout
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr

public typealias SizeT = ULong

public typealias SsizeT = Long

public typealias OffT = Long

public typealias CUint8T = UByte

public typealias CUint16T = UShort

public typealias CUint32T = UInt

public typealias CUint64T = ULong

public typealias CInt8T = Byte

public typealias CInt16T = Short

public typealias CInt32T = Int

public typealias CInt64T = Long

public typealias IntptrT = Long

public typealias UintptrT = ULong

public typealias TimeT = CLong

public typealias ClockidT = CInt

public class Iovec internal constructor(
    iovBaseCtorArg: MutPtr<CVoid>,
    public var iovLen: SizeT,
) {
    public var iovBase: MutPtr<CVoid> = iovBaseCtorArg
        internal set

    public constructor() : this(
        iovBaseCtorArg = MutPtr(0L),
        iovLen = 0uL,
    )

    public operator fun component1(): MutPtr<CVoid> = this.iovBase

    public operator fun component2(): SizeT = this.iovLen

    public fun copy(iovBase: MutPtr<CVoid> = this.iovBase, iovLen: SizeT = this.iovLen): Iovec = Iovec(iovBaseCtorArg = iovBase, iovLen = iovLen)

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
                                .mutPtrLayout<CVoid>(64)
                        ).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: Iovec) {
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr, value.iovBase)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 8L, value.iovLen)
                }
            }

        public operator fun invoke(
            iovBase: MutPtr<CVoid> = MutPtr(0L),
            iovLen: SizeT = 0uL,
        ): Iovec =
            Iovec(
                iovBaseCtorArg = iovBase,
                iovLen = iovLen,
            )
    }
}

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

public val PROT_READ: Int = 1

public val PROT_WRITE: Int = 2

// Trusty only supports `CLOCK_BOOTTIME`.
public val CLOCK_BOOTTIME: ClockidT = 7

public val STDOUT_FILENO: CInt = 1

public val STDERR_FILENO: CInt = 2

public val AT_PAGESZ: CUlong = 6uL

public val MAP_FAILED: MutPtr<CVoid> = MutPtr<CVoid>((0.inv()).toLong())

public expect fun calloc(nobj: SizeT, size: SizeT): MutPtr<CVoid>

public expect fun malloc(size: SizeT): MutPtr<CVoid>

public expect fun realloc(p: MutPtr<CVoid>, size: SizeT): MutPtr<CVoid>

public expect fun free(p: MutPtr<CVoid>)

public expect fun memalign(align: SizeT, size: SizeT): MutPtr<CVoid>

public expect fun posixMemalign(memptr: MutPtr<MutPtr<CVoid>>, align: SizeT, size: SizeT): CInt

public expect fun write(fd: CInt, buf: ConstPtr<CVoid>, count: SizeT): SsizeT

public expect fun writev(fd: CInt, iov: ConstPtr<Iovec>, iovcnt: CInt): SsizeT

public expect fun close(fd: CInt): CInt

public expect fun strlen(cs: ConstPtr<CChar>): SizeT

public expect fun getauxval(type: CUlong): CUlong

public expect fun mmap(addr: MutPtr<CVoid>, len: SizeT, prot: CInt, flags: CInt, fd: CInt, offset: OffT): MutPtr<CVoid>

public expect fun munmap(addr: MutPtr<CVoid>, len: SizeT): CInt

public expect fun clockGettime(clkId: ClockidT, tp: MutPtr<Timespec>): CInt

public expect fun nanosleep(rqtp: ConstPtr<Timespec>, rmtp: MutPtr<Timespec>): CInt
