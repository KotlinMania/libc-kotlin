// port-lint: source new/apple/libpthread/pthread_/sched.rs
@file:OptIn(ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.new.apple.libpthread.pthread.sched

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt

public data class SchedParam(
    public var schedPriority: CInt = 0,
    public var opaque: UByteArray = UByteArray(4),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SchedParam) return false
        if (this.schedPriority != other.schedPriority) return false
        if (!this.opaque.contentEquals(other.opaque)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.schedPriority.hashCode()
        result = 31 * result + this.opaque.contentHashCode()
        return result
    }
}
