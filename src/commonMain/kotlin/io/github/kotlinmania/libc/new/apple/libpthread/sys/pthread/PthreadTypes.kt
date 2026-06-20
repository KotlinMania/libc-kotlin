// port-lint: source new/apple/libpthread/sys/_pthread/_pthread_types.rs
package io.github.kotlinmania.libc.new.apple.libpthread.sys.pthread

import io.github.kotlinmania.libc.*

/**
 * Header: `sys/_pthread/_pthread_types.h`.
 *
 * Upstream defines `_opaque_pthread_*` structs typedefed through `__darwin_pthread*`
 * to the final `pthread_*` names; this is flattened to the final names here.
 *
 * The sizes below are the 64-bit layout; the 32-bit layout uses 4088 / 36 / 8 /
 * 40 / 4 / 24 / 4 / 124 / 12 respectively.
 */

internal const val PTHREAD_SIZE: Int = 8176
internal const val PTHREAD_ATTR_SIZE: Int = 56
internal const val PTHREAD_MUTEXATTR_SIZE: Int = 8
internal const val PTHREAD_MUTEX_SIZE: Int = 56
internal const val PTHREAD_CONDATTR_SIZE: Int = 8
internal const val PTHREAD_COND_SIZE: Int = 40
internal const val PTHREAD_ONCE_SIZE: Int = 8
internal const val PTHREAD_RWLOCK_SIZE: Int = 192
internal const val PTHREAD_RWLOCKATTR_SIZE: Int = 16

public data class PthreadAttrT(
    val sig: CLong,
    val opaque: ByteArray,
) {
    init {
        require(opaque.size == PTHREAD_ATTR_SIZE) { "__opaque must be $PTHREAD_ATTR_SIZE bytes" }
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false
        other as PthreadAttrT
        if (sig != other.sig) return false
        if (!opaque.contentEquals(other.opaque)) return false
        return true
    }

    override fun hashCode(): Int = 31 * sig.hashCode() + opaque.contentHashCode()
}

public data class PthreadCondT(
    val sig: CLong,
    val opaque: ByteArray,
) {
    init {
        require(opaque.size == PTHREAD_COND_SIZE) { "__opaque must be $PTHREAD_COND_SIZE bytes" }
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false
        other as PthreadCondT
        if (sig != other.sig) return false
        if (!opaque.contentEquals(other.opaque)) return false
        return true
    }

    override fun hashCode(): Int = 31 * sig.hashCode() + opaque.contentHashCode()
}

public data class PthreadCondattrT(
    val sig: CLong,
    val opaque: ByteArray,
) {
    init {
        require(opaque.size == PTHREAD_CONDATTR_SIZE) { "__opaque must be $PTHREAD_CONDATTR_SIZE bytes" }
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false
        other as PthreadCondattrT
        if (sig != other.sig) return false
        if (!opaque.contentEquals(other.opaque)) return false
        return true
    }

    override fun hashCode(): Int = 31 * sig.hashCode() + opaque.contentHashCode()
}

public data class PthreadMutexT(
    val sig: CLong,
    val opaque: ByteArray,
) {
    init {
        require(opaque.size == PTHREAD_MUTEX_SIZE) { "__opaque must be $PTHREAD_MUTEX_SIZE bytes" }
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false
        other as PthreadMutexT
        if (sig != other.sig) return false
        if (!opaque.contentEquals(other.opaque)) return false
        return true
    }

    override fun hashCode(): Int = 31 * sig.hashCode() + opaque.contentHashCode()
}

public data class PthreadMutexattrT(
    val sig: CLong,
    val opaque: ByteArray,
) {
    init {
        require(opaque.size == PTHREAD_MUTEXATTR_SIZE) { "__opaque must be $PTHREAD_MUTEXATTR_SIZE bytes" }
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false
        other as PthreadMutexattrT
        if (sig != other.sig) return false
        if (!opaque.contentEquals(other.opaque)) return false
        return true
    }

    override fun hashCode(): Int = 31 * sig.hashCode() + opaque.contentHashCode()
}

public data class PthreadOnceT(
    val sig: CLong,
    val opaque: ByteArray,
) {
    init {
        require(opaque.size == PTHREAD_ONCE_SIZE) { "__opaque must be $PTHREAD_ONCE_SIZE bytes" }
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false
        other as PthreadOnceT
        if (sig != other.sig) return false
        if (!opaque.contentEquals(other.opaque)) return false
        return true
    }

    override fun hashCode(): Int = 31 * sig.hashCode() + opaque.contentHashCode()
}

public data class PthreadRwlockT(
    val sig: CLong,
    val opaque: ByteArray,
) {
    init {
        require(opaque.size == PTHREAD_RWLOCK_SIZE) { "__opaque must be $PTHREAD_RWLOCK_SIZE bytes" }
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false
        other as PthreadRwlockT
        if (sig != other.sig) return false
        if (!opaque.contentEquals(other.opaque)) return false
        return true
    }

    override fun hashCode(): Int = 31 * sig.hashCode() + opaque.contentHashCode()
}

public data class PthreadRwlockattrT(
    val sig: CLong,
    val opaque: ByteArray,
) {
    init {
        require(opaque.size == PTHREAD_RWLOCKATTR_SIZE) { "__opaque must be $PTHREAD_RWLOCKATTR_SIZE bytes" }
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false
        other as PthreadRwlockattrT
        if (sig != other.sig) return false
        if (!opaque.contentEquals(other.opaque)) return false
        return true
    }

    override fun hashCode(): Int = 31 * sig.hashCode() + opaque.contentHashCode()
}

public typealias PthreadKeyT = CULong
