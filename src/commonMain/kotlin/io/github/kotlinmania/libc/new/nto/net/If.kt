// port-lint: source new/nto/net/if_.rs
package io.github.kotlinmania.libc.new.nto.net

import io.github.kotlinmania.libc.*

public data class Ifreq(
    val ifrName: ByteArray,
    val ifrIfru: CAnonymousIfrIfru,
)

public data class IfreqBuffer(
    val length: ULong,
    val buffer: COpaquePointer?,
)

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
)
