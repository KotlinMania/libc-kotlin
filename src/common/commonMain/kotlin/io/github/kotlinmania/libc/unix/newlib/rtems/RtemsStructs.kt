@file:OptIn(ExperimentalUnsignedTypes::class)
package io.github.kotlinmania.libc.unix.newlib.rtems

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.COpaquePointer
import io.github.kotlinmania.libc.unix.newlib.SaFamilyT

public fun interface FnCallback {
    public operator fun invoke(arg0: COpaquePointer?): COpaquePointer?
}

public data class SockaddrUn(public var sunFamily: SaFamilyT = 0u, public var sunPath: UByteArray = UByteArray(108)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SockaddrUn) return false
        if (this.sunFamily != other.sunFamily) return false
        if (!this.sunPath.contentEquals(other.sunPath)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.sunFamily.hashCode()
        result = 31 * result + this.sunPath.contentHashCode()
        return result
    }
}
