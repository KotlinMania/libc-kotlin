// port-lint: source new/nto/net/if_.rs
@file:OptIn(ExperimentalUnsignedTypes::class)
package io.github.kotlinmania.libc.new.nto.net.ifbranch

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.COpaquePointer
import io.github.kotlinmania.libc.CShort
import io.github.kotlinmania.libc.CUchar
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.new.qurt.SizeT
import io.github.kotlinmania.libc.unix.IFNAMSIZ
import io.github.kotlinmania.libc.unix.nto.Sockaddr

public data class CAnonymousIfrIfru(
    public var ifruAddr: Sockaddr = Sockaddr(),
    public var ifruDstaddr: Sockaddr = Sockaddr(),
    public var ifruBroadaddr: Sockaddr = Sockaddr(),
    public var ifruBuffer: IfreqBuffer = IfreqBuffer(),
    public var ifruFlags: ShortArray = ShortArray(2),
    public var ifruIndex: CShort = 0,
    public var ifruJid: CInt = 0,
    public var ifruMetric: CInt = 0,
    public var ifruMtu: CInt = 0,
    public var ifruPhys: CInt = 0,
    public var ifruMedia: CInt = 0,
    public var ifruData: COpaquePointer? = null,
    public var ifruCap: IntArray = IntArray(2),
    public var ifruFib: CUint = 0u,
    public var ifruVlanPcp: CUchar = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CAnonymousIfrIfru) return false
        if (this.ifruAddr != other.ifruAddr) return false
        if (this.ifruDstaddr != other.ifruDstaddr) return false
        if (this.ifruBroadaddr != other.ifruBroadaddr) return false
        if (this.ifruBuffer != other.ifruBuffer) return false
        if (!this.ifruFlags.contentEquals(other.ifruFlags)) return false
        if (this.ifruIndex != other.ifruIndex) return false
        if (this.ifruJid != other.ifruJid) return false
        if (this.ifruMetric != other.ifruMetric) return false
        if (this.ifruMtu != other.ifruMtu) return false
        if (this.ifruPhys != other.ifruPhys) return false
        if (this.ifruMedia != other.ifruMedia) return false
        if (this.ifruData != other.ifruData) return false
        if (!this.ifruCap.contentEquals(other.ifruCap)) return false
        if (this.ifruFib != other.ifruFib) return false
        if (this.ifruVlanPcp != other.ifruVlanPcp) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.ifruAddr.hashCode()
        result = 31 * result + this.ifruDstaddr.hashCode()
        result = 31 * result + this.ifruBroadaddr.hashCode()
        result = 31 * result + this.ifruBuffer.hashCode()
        result = 31 * result + this.ifruFlags.contentHashCode()
        result = 31 * result + this.ifruIndex.hashCode()
        result = 31 * result + this.ifruJid.hashCode()
        result = 31 * result + this.ifruMetric.hashCode()
        result = 31 * result + this.ifruMtu.hashCode()
        result = 31 * result + this.ifruPhys.hashCode()
        result = 31 * result + this.ifruMedia.hashCode()
        result = 31 * result + this.ifruData.hashCode()
        result = 31 * result + this.ifruCap.contentHashCode()
        result = 31 * result + this.ifruFib.hashCode()
        result = 31 * result + this.ifruVlanPcp.hashCode()
        return result
    }
}

public data class Ifreq(
    /**
     * if name, e.g. "en0"
     */
    public var ifrName: UByteArray = UByteArray((IFNAMSIZ).toInt()),
    public var ifrIfru: CAnonymousIfrIfru = CAnonymousIfrIfru(),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Ifreq) return false
        if (!this.ifrName.contentEquals(other.ifrName)) return false
        if (this.ifrIfru != other.ifrIfru) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.ifrName.contentHashCode()
        result = 31 * result + this.ifrIfru.hashCode()
        return result
    }
}

public data class IfreqBuffer(public var length: SizeT = 0uL, public var buffer: COpaquePointer? = null)
