// port-lint: source new/apple/libpthread/sys/_pthread/_pthread_types.rs
@file:OptIn(ExperimentalUnsignedTypes::class)
package io.github.kotlinmania.libc.new.apple.libpthread.sys.pthread.pthreadtypes

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CLong
import io.github.kotlinmania.libc.CUlong

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

public data class PthreadAttrT(internal var sig: CLong = 0L, internal var opaque: UByteArray = UByteArray((PTHREAD_ATTR_SIZE).toInt())) {
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
}

public data class PthreadCondT(internal var sig: CLong = 0L, internal var opaque: UByteArray = UByteArray((PTHREAD_COND_SIZE).toInt())) {
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
}

public data class PthreadCondattrT(internal var sig: CLong = 0L, internal var opaque: UByteArray = UByteArray((PTHREAD_CONDATTR_SIZE).toInt())) {
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
}

public data class PthreadMutexT(internal var sig: CLong = 0L, internal var opaque: UByteArray = UByteArray((PTHREAD_MUTEX_SIZE).toInt())) {
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
}

public data class PthreadMutexattrT(internal var sig: CLong = 0L, internal var opaque: UByteArray = UByteArray((PTHREAD_MUTEXATTR_SIZE).toInt())) {
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
}

public data class PthreadOnceT(internal var sig: CLong = 0L, internal var opaque: UByteArray = UByteArray((PTHREAD_ONCE_SIZE).toInt())) {
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
}

public data class PthreadRwlockT(internal var sig: CLong = 0L, internal var opaque: UByteArray = UByteArray((PTHREAD_RWLOCK_SIZE).toInt())) {
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
}

public data class PthreadRwlockattrT(internal var sig: CLong = 0L, internal var opaque: UByteArray = UByteArray((PTHREAD_RWLOCKATTR_SIZE).toInt())) {
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
}

public typealias PthreadKeyT = CUlong
