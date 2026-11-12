// port-lint: source new/apple/libpthread/sys/_pthread/_pthread_types.rs
@file:OptIn(ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.new.apple.libpthread.sys.pthread.pthreadtypes

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CLong
import io.github.kotlinmania.libc.CUlong
import io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
import io.github.kotlinmania.rustlang.core.mem.TypeLayout

// Header: `sys / _pthread / _pthread_types.h`
//
// <https://github.com/apple-oss-distributions/libpthread/blob/main/include/sys/_pthread/_pthread_types.h>
//
// Note that the actual header defines `_opaque_pthread_ *` structs which are typedefed to
// `__darwin_pthread *` structs, and typedefed again in separate `_pthread_ *.h` files to their final
// `pthread_` name. This isn't useful for us so we simplify a bit and just define everything here.

public val PTHREAD_SIZE: Int = 8176

public val PTHREAD_ATTR_SIZE: Int = 56

public val PTHREAD_MUTEXATTR_SIZE: Int = 8

public val PTHREAD_MUTEX_SIZE: Int = 56

public val PTHREAD_CONDATTR_SIZE: Int = 8

public val PTHREAD_COND_SIZE: Int = 40

public val PTHREAD_ONCE_SIZE: Int = 8

public val PTHREAD_RWLOCK_SIZE: Int = 192

public val PTHREAD_RWLOCKATTR_SIZE: Int = 16

public data class PthreadAttrT(
    internal var sig: CLong = 0L,
    internal var opaque: UByteArray = UByteArray(PTHREAD_ATTR_SIZE),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PthreadAttrT) return false
        if (this.sig != other.sig) return false
        if (!this.opaque.contentEquals(other.opaque)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.sig.hashCode()
        result = 31 * result + this.opaque.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<PthreadAttrT> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<PthreadAttrT> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long =
                    io.github.kotlinmania.rustlang.core.mem
                        .alignUpBytes((8L + ((PTHREAD_ATTR_SIZE).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).strideBytes)), 8L)
                override fun readNative(addr: Long): PthreadAttrT =
                    PthreadAttrT(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (PTHREAD_ATTR_SIZE).toInt())
                        ).readNative(addr + 8L).toUByteArray(),
                    )
                override fun writeNative(addr: Long, value: PthreadAttrT) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr, value.sig)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (PTHREAD_ATTR_SIZE).toInt())
                    ).writeNative(addr + 8L, value.opaque.toList())
                }
            }
    }
}

public data class PthreadCondT(
    internal var sig: CLong = 0L,
    internal var opaque: UByteArray = UByteArray(PTHREAD_COND_SIZE),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PthreadCondT) return false
        if (this.sig != other.sig) return false
        if (!this.opaque.contentEquals(other.opaque)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.sig.hashCode()
        result = 31 * result + this.opaque.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<PthreadCondT> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<PthreadCondT> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long =
                    io.github.kotlinmania.rustlang.core.mem
                        .alignUpBytes((8L + ((PTHREAD_COND_SIZE).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).strideBytes)), 8L)
                override fun readNative(addr: Long): PthreadCondT =
                    PthreadCondT(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (PTHREAD_COND_SIZE).toInt())
                        ).readNative(addr + 8L).toUByteArray(),
                    )
                override fun writeNative(addr: Long, value: PthreadCondT) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr, value.sig)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (PTHREAD_COND_SIZE).toInt())
                    ).writeNative(addr + 8L, value.opaque.toList())
                }
            }
    }
}

public data class PthreadCondattrT(
    internal var sig: CLong = 0L,
    internal var opaque: UByteArray = UByteArray(PTHREAD_CONDATTR_SIZE),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PthreadCondattrT) return false
        if (this.sig != other.sig) return false
        if (!this.opaque.contentEquals(other.opaque)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.sig.hashCode()
        result = 31 * result + this.opaque.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<PthreadCondattrT> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<PthreadCondattrT> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long =
                    io.github.kotlinmania.rustlang.core.mem
                        .alignUpBytes((8L + ((PTHREAD_CONDATTR_SIZE).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).strideBytes)), 8L)
                override fun readNative(addr: Long): PthreadCondattrT =
                    PthreadCondattrT(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (PTHREAD_CONDATTR_SIZE).toInt())
                        ).readNative(addr + 8L).toUByteArray(),
                    )
                override fun writeNative(addr: Long, value: PthreadCondattrT) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr, value.sig)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (PTHREAD_CONDATTR_SIZE).toInt())
                    ).writeNative(addr + 8L, value.opaque.toList())
                }
            }
    }
}

public data class PthreadMutexT(
    internal var sig: CLong = 0L,
    internal var opaque: UByteArray = UByteArray(PTHREAD_MUTEX_SIZE),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PthreadMutexT) return false
        if (this.sig != other.sig) return false
        if (!this.opaque.contentEquals(other.opaque)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.sig.hashCode()
        result = 31 * result + this.opaque.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<PthreadMutexT> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<PthreadMutexT> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long =
                    io.github.kotlinmania.rustlang.core.mem
                        .alignUpBytes((8L + ((PTHREAD_MUTEX_SIZE).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).strideBytes)), 8L)
                override fun readNative(addr: Long): PthreadMutexT =
                    PthreadMutexT(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (PTHREAD_MUTEX_SIZE).toInt())
                        ).readNative(addr + 8L).toUByteArray(),
                    )
                override fun writeNative(addr: Long, value: PthreadMutexT) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr, value.sig)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (PTHREAD_MUTEX_SIZE).toInt())
                    ).writeNative(addr + 8L, value.opaque.toList())
                }
            }
    }
}

public data class PthreadMutexattrT(
    internal var sig: CLong = 0L,
    internal var opaque: UByteArray = UByteArray(PTHREAD_MUTEXATTR_SIZE),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PthreadMutexattrT) return false
        if (this.sig != other.sig) return false
        if (!this.opaque.contentEquals(other.opaque)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.sig.hashCode()
        result = 31 * result + this.opaque.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<PthreadMutexattrT> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<PthreadMutexattrT> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long =
                    io.github.kotlinmania.rustlang.core.mem
                        .alignUpBytes((8L + ((PTHREAD_MUTEXATTR_SIZE).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).strideBytes)), 8L)
                override fun readNative(addr: Long): PthreadMutexattrT =
                    PthreadMutexattrT(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (PTHREAD_MUTEXATTR_SIZE).toInt())
                        ).readNative(addr + 8L).toUByteArray(),
                    )
                override fun writeNative(addr: Long, value: PthreadMutexattrT) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr, value.sig)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (PTHREAD_MUTEXATTR_SIZE).toInt())
                    ).writeNative(addr + 8L, value.opaque.toList())
                }
            }
    }
}

public data class PthreadOnceT(
    internal var sig: CLong = 0L,
    internal var opaque: UByteArray = UByteArray(PTHREAD_ONCE_SIZE),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PthreadOnceT) return false
        if (this.sig != other.sig) return false
        if (!this.opaque.contentEquals(other.opaque)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.sig.hashCode()
        result = 31 * result + this.opaque.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<PthreadOnceT> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<PthreadOnceT> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long =
                    io.github.kotlinmania.rustlang.core.mem
                        .alignUpBytes((8L + ((PTHREAD_ONCE_SIZE).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).strideBytes)), 8L)
                override fun readNative(addr: Long): PthreadOnceT =
                    PthreadOnceT(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (PTHREAD_ONCE_SIZE).toInt())
                        ).readNative(addr + 8L).toUByteArray(),
                    )
                override fun writeNative(addr: Long, value: PthreadOnceT) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr, value.sig)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (PTHREAD_ONCE_SIZE).toInt())
                    ).writeNative(addr + 8L, value.opaque.toList())
                }
            }
    }
}

public data class PthreadRwlockT(
    internal var sig: CLong = 0L,
    internal var opaque: UByteArray = UByteArray(PTHREAD_RWLOCK_SIZE),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PthreadRwlockT) return false
        if (this.sig != other.sig) return false
        if (!this.opaque.contentEquals(other.opaque)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.sig.hashCode()
        result = 31 * result + this.opaque.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<PthreadRwlockT> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<PthreadRwlockT> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long =
                    io.github.kotlinmania.rustlang.core.mem
                        .alignUpBytes((8L + ((PTHREAD_RWLOCK_SIZE).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).strideBytes)), 8L)
                override fun readNative(addr: Long): PthreadRwlockT =
                    PthreadRwlockT(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (PTHREAD_RWLOCK_SIZE).toInt())
                        ).readNative(addr + 8L).toUByteArray(),
                    )
                override fun writeNative(addr: Long, value: PthreadRwlockT) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr, value.sig)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (PTHREAD_RWLOCK_SIZE).toInt())
                    ).writeNative(addr + 8L, value.opaque.toList())
                }
            }
    }
}

public data class PthreadRwlockattrT(
    internal var sig: CLong = 0L,
    internal var opaque: UByteArray = UByteArray(PTHREAD_RWLOCKATTR_SIZE),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PthreadRwlockattrT) return false
        if (this.sig != other.sig) return false
        if (!this.opaque.contentEquals(other.opaque)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.sig.hashCode()
        result = 31 * result + this.opaque.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<PthreadRwlockattrT> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<PthreadRwlockattrT> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long =
                    io.github.kotlinmania.rustlang.core.mem
                        .alignUpBytes((8L + ((PTHREAD_RWLOCKATTR_SIZE).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).strideBytes)), 8L)
                override fun readNative(addr: Long): PthreadRwlockattrT =
                    PthreadRwlockattrT(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (PTHREAD_RWLOCKATTR_SIZE).toInt())
                        ).readNative(addr + 8L).toUByteArray(),
                    )
                override fun writeNative(addr: Long, value: PthreadRwlockattrT) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr, value.sig)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (PTHREAD_RWLOCKATTR_SIZE).toInt())
                    ).writeNative(addr + 8L, value.opaque.toList())
                }
            }
    }
}

public typealias PthreadKeyT = CUlong
