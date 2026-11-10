@file:OptIn(ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.teeos

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CLong
import io.github.kotlinmania.libc.COpaquePointer
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.U128

public data class ClongDouble(
    public var value: U128 = U128(),
) {
    public var field0: U128
        get() = value
        set(v) {
            value = v
        }
}

public data class PthreadCondT(
    public var size: UByteArray = UByteArray(SIZEOF_PTHREAD_COND_T),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PthreadCondT) return false
        if (!this.size.contentEquals(other.size)) return false
        return true
    }

    override fun hashCode(): Int = this.size.contentHashCode()
}

public data class PthreadMutexT(
    public var size: UByteArray = UByteArray(SIZEOF_PTHREAD_MUTEX_T),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PthreadMutexT) return false
        if (!this.size.contentEquals(other.size)) return false
        return true
    }

    override fun hashCode(): Int = this.size.contentHashCode()
}

public data class PthreadMutexattrT(
    public var size: UByteArray = UByteArray(SIZEOF_PTHREAD_MUTEXATTR_T),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PthreadMutexattrT) return false
        if (!this.size.contentEquals(other.size)) return false
        return true
    }

    override fun hashCode(): Int = this.size.contentHashCode()
}

public data class PthreadCondattrT(
    public var size: UByteArray = UByteArray(SIZEOF_PTHREAD_CONDATTR_T),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PthreadCondattrT) return false
        if (!this.size.contentEquals(other.size)) return false
        return true
    }

    override fun hashCode(): Int = this.size.contentHashCode()
}

public data class PthreadAttrT(
    public var size: ULongArray = ULongArray(7),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PthreadAttrT) return false
        if (!this.size.contentEquals(other.size)) return false
        return true
    }

    override fun hashCode(): Int = this.size.contentHashCode()
}

public data class CpuSetT(
    public var bits: ULongArray = ULongArray(128 / 8),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CpuSetT) return false
        if (!this.bits.contentEquals(other.bits)) return false
        return true
    }

    override fun hashCode(): Int = this.bits.contentHashCode()
}

public data class Timespec(
    public var tvSec: TimeT = 0L,
    public var tvNsec: CLong = 0L,
)

public data class Timeval(
    public var tvSec: TimeT = 0L,
    public var tvUsec: SusecondsT = 0L,
)

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
    public var tmGmtoff: CLong = 0L,
    public var tmZone: COpaquePointer? = null,
)

public data class MbstateT(
    public var opaque1: CUint = 0u,
    public var opaque2: CUint = 0u,
)

public data class SemT(
    public var value: IntArray = IntArray(4 * 8 / 8),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SemT) return false
        if (!this.value.contentEquals(other.value)) return false
        return true
    }

    override fun hashCode(): Int = this.value.contentHashCode()
}

public data class DivT(
    public var quot: CInt = 0,
    public var rem: CInt = 0,
)
