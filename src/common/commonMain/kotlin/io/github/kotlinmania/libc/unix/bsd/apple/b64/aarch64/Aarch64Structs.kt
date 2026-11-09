@file:OptIn(ExperimentalUnsignedTypes::class)
package io.github.kotlinmania.libc.unix.bsd.apple.b64.aarch64

import io.github.kotlinmania.libc.*

public data class MallocZoneT(public var private: ULongArray = ULongArray(18)) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is MallocZoneT) return false
        if (!this.private.contentEquals(other.private)) return false
        return true
    }

    override fun hashCode(): Int {
        return this.private.contentHashCode()
    }
}

public data class MaxAlignT(public var priv: Double = 0.0)
