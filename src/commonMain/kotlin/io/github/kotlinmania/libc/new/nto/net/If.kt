// port-lint: source new/nto/net/if_.rs
package io.github.kotlinmania.libc.new.nto.net

import io.github.kotlinmania.libc.*
import kotlinx.cinterop.COpaquePointer

// C union; only one variant is valid at a time.
public data class CAnonymousIfrIfru(
    val ifruAddr: Sockaddr? = null,
    val ifruDstaddr: Sockaddr? = null,
    val ifruBroadaddr: Sockaddr? = null,
    val ifruBuffer: IfreqBuffer? = null,
    val ifruFlags: ShortArray? = null,
    val ifruIndex: CShort? = null,
    val ifruJid: CInt? = null,
    val ifruMetric: CInt? = null,
    val ifruMtu: CInt? = null,
    val ifruPhys: CInt? = null,
    val ifruMedia: CInt? = null,
    val ifruData: String? = null,
    val ifruCap: IntArray? = null,
    val ifruFib: CUInt? = null,
    val ifruVlanPcp: CUChar? = null,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false
        other as CAnonymousIfrIfru
        if (ifruAddr != other.ifruAddr) return false
        if (ifruDstaddr != other.ifruDstaddr) return false
        if (ifruBroadaddr != other.ifruBroadaddr) return false
        if (ifruBuffer != other.ifruBuffer) return false
        if (ifruFlags != null) {
            if (other.ifruFlags == null || !ifruFlags.contentEquals(other.ifruFlags)) return false
        } else if (other.ifruFlags != null) {
            return false
        }
        if (ifruIndex != other.ifruIndex) return false
        if (ifruJid != other.ifruJid) return false
        if (ifruMetric != other.ifruMetric) return false
        if (ifruMtu != other.ifruMtu) return false
        if (ifruPhys != other.ifruPhys) return false
        if (ifruMedia != other.ifruMedia) return false
        if (ifruData != other.ifruData) return false
        if (ifruCap != null) {
            if (other.ifruCap == null || !ifruCap.contentEquals(other.ifruCap)) return false
        } else if (other.ifruCap != null) {
            return false
        }
        if (ifruFib != other.ifruFib) return false
        if (ifruVlanPcp != other.ifruVlanPcp) return false
        return true
    }

    override fun hashCode(): Int {
        var result = ifruAddr?.hashCode() ?: 0
        result = 31 * result + (ifruDstaddr?.hashCode() ?: 0)
        result = 31 * result + (ifruBroadaddr?.hashCode() ?: 0)
        result = 31 * result + (ifruBuffer?.hashCode() ?: 0)
        result = 31 * result + (ifruFlags?.contentHashCode() ?: 0)
        result = 31 * result + (ifruIndex?.hashCode() ?: 0)
        result = 31 * result + (ifruJid ?: 0)
        result = 31 * result + (ifruMetric ?: 0)
        result = 31 * result + (ifruMtu ?: 0)
        result = 31 * result + (ifruPhys ?: 0)
        result = 31 * result + (ifruMedia ?: 0)
        result = 31 * result + (ifruData?.hashCode() ?: 0)
        result = 31 * result + (ifruCap?.contentHashCode() ?: 0)
        result = 31 * result + (ifruFib?.hashCode() ?: 0)
        result = 31 * result + (ifruVlanPcp?.hashCode() ?: 0)
        return result
    }
}

public data class Ifreq(
    val ifrName: ByteArray,
    val ifrIfru: CAnonymousIfrIfru,
) {
    init {
        require(ifrName.size == IFNAMSIZ) { "ifr_name must be $IFNAMSIZ bytes" }
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false
        other as Ifreq
        if (!ifrName.contentEquals(other.ifrName)) return false
        if (ifrIfru != other.ifrIfru) return false
        return true
    }

    override fun hashCode(): Int = 31 * ifrName.contentHashCode() + ifrIfru.hashCode()
}

public data class IfreqBuffer(
    val length: ULong,
    val buffer: COpaquePointer?,
)
