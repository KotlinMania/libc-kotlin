// port-lint: source new/emscripten/sched.rs
package io.github.kotlinmania.libc.new.emscripten.sched

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CLong
import io.github.kotlinmania.libc.unix.linuxlike.emscripten.TimeT

public data class CAnonSchedParamReserved2(
    public var reserved1: TimeT = 0L,
    public var reserved2: CLong = 0L,
)

public data class SchedParam(
    public var schedPriority: CInt = 0,
    public var reserved1: CInt = 0,
    public var reserved2: LongArray = LongArray(4),
    public var reserved3: CInt = 0,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SchedParam) return false
        if (this.schedPriority != other.schedPriority) return false
        if (this.reserved1 != other.reserved1) return false
        if (!this.reserved2.contentEquals(other.reserved2)) return false
        if (this.reserved3 != other.reserved3) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.schedPriority.hashCode()
        result = 31 * result + this.reserved1.hashCode()
        result = 31 * result + this.reserved2.contentHashCode()
        result = 31 * result + this.reserved3.hashCode()
        return result
    }
}
