package io.github.kotlinmania.libc.windows.gnu

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.COpaquePointer

public data class MaxAlignT(public var priv: DoubleArray = DoubleArray(4)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is MaxAlignT) return false
        if (!this.priv.contentEquals(other.priv)) return false
        return true
    }

    override fun hashCode(): Int {
        return this.priv.contentHashCode()
    }
}
