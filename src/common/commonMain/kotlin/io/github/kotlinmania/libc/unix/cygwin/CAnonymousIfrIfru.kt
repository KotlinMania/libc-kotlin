package io.github.kotlinmania.libc.unix.cygwin

import io.github.kotlinmania.libc.*

// C union; only one variant is valid at a time.
public data class CAnonymousIfrIfru(
    val ifruAddr: Sockaddr? = null,
    val ifruBroadaddr: Sockaddr? = null,
    val ifruDstaddr: Sockaddr? = null,
    val ifruNetmask: Sockaddr? = null,
    val ifruHwaddr: Sockaddr? = null,
    val ifruFlags: Int? = null,
    val ifruMetric: Int? = null,
    val ifruMtu: Int? = null,
    val ifruIfindex: Int? = null,
    val ifruData: String? = null,
)
