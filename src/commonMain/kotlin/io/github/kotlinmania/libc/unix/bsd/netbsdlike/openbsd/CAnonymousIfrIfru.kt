package io.github.kotlinmania.libc.unix.bsd.netbsdlike.openbsd
import io.github.kotlinmania.libc.unix.bsd.Sockaddr

import io.github.kotlinmania.libc.*

// C union; only one variant is valid at a time.
public data class CAnonymousIfrIfru(
    val ifruAddr: Sockaddr? = null,
    val ifruDstaddr: Sockaddr? = null,
    val ifruBroadaddr: Sockaddr? = null,
    val ifruFlags: Short? = null,
    val ifruMetric: Int? = null,
    val ifruVnetid: Long? = null,
    val ifruMedia: ULong? = null,
    val ifruData: String? = null,
    val ifruIndex: UInt? = null,
)
