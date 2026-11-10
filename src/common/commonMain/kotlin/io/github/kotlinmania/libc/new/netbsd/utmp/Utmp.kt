// port-lint: source new/netbsd/utmp_.rs
@file:OptIn(ExperimentalUnsignedTypes::class)
package io.github.kotlinmania.libc.new.netbsd.utmp

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.COpaquePointer
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.aarch64.TimeT

// Header: `utmp.h`
//
// <https://github.com/NetBSD/src/blob/master/include/utmp.h>

public val UT_NAMESIZE: Int = 8

public val UT_LINESIZE: Int = 8

public val UT_HOSTSIZE: Int = 16

public data class Lastlog(
    public var llTime: TimeT = 0L,
    public var llLine: UByteArray = UByteArray(UT_LINESIZE),
    public var llHost: UByteArray = UByteArray(UT_HOSTSIZE),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Lastlog) return false
        if (this.llTime != other.llTime) return false
        if (!this.llLine.contentEquals(other.llLine)) return false
        if (!this.llHost.contentEquals(other.llHost)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.llTime.hashCode()
        result = 31 * result + this.llLine.contentHashCode()
        result = 31 * result + this.llHost.contentHashCode()
        return result
    }
}

public data class Utmp(
    public var utLine: UByteArray = UByteArray(UT_LINESIZE),
    public var utName: UByteArray = UByteArray(UT_NAMESIZE),
    public var utHost: UByteArray = UByteArray(UT_HOSTSIZE),
    public var utTime: TimeT = 0L,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Utmp) return false
        if (!this.utLine.contentEquals(other.utLine)) return false
        if (!this.utName.contentEquals(other.utName)) return false
        if (!this.utHost.contentEquals(other.utHost)) return false
        if (this.utTime != other.utTime) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.utLine.contentHashCode()
        result = 31 * result + this.utName.contentHashCode()
        result = 31 * result + this.utHost.contentHashCode()
        result = 31 * result + this.utTime.hashCode()
        return result
    }
}

public expect fun utmpname(file: String?): CInt

public expect fun setutent()

public expect fun getutent(): COpaquePointer?

public expect fun endutent()
