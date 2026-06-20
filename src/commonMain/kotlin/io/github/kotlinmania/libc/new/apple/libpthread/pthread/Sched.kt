// port-lint: source new/apple/libpthread/pthread_/sched.rs
package io.github.kotlinmania.libc.new.apple.libpthread.pthread

import io.github.kotlinmania.libc.*

public data class SchedParam(
    val schedPriority: CInt,
    val opaque: ByteArray,
) {
    init {
        require(opaque.size == 4) { "__opaque must be 4 bytes" }
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false
        other as SchedParam
        if (schedPriority != other.schedPriority) return false
        if (!opaque.contentEquals(other.opaque)) return false
        return true
    }

    override fun hashCode(): Int = 31 * schedPriority + opaque.contentHashCode()
}
