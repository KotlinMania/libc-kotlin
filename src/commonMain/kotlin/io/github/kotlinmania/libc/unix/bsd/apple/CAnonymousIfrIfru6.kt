package io.github.kotlinmania.libc.unix.bsd.apple
import io.github.kotlinmania.libc.unix.bsd.SockaddrIn6

import io.github.kotlinmania.libc.*

// C union; only one variant is valid at a time.
public data class CAnonymousIfrIfru6(
    val ifruAddr: SockaddrIn6? = null,
    val ifruDstaddr: SockaddrIn6? = null,
    val ifruFlags: Int? = null,
    val ifruFlags6: Int? = null,
    val ifruMetrics: Int? = null,
    val ifruIntval: Int? = null,
    val ifruData: String? = null,
    val ifruLifetime: In6Addrlifetime? = null,
    val ifruStat: In6Ifstat? = null,
    val ifruIcmp6stat: Icmp6Ifstat? = null,
    val ifruScopeId: UIntArray? = null,
)
