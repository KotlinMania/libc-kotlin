package io.github.kotlinmania.libc.unix.bsd.apple

import io.github.kotlinmania.libc.*

// C union; only one variant is valid at a time.
public data class CAnonymousIfrIfru(
    val ifruAddr: Sockaddr? = null,
    val ifruDstaddr: Sockaddr? = null,
    val ifruBroadaddr: Sockaddr? = null,
    val ifruFlags: Short? = null,
    val ifruMetrics: Int? = null,
    val ifruMtu: Int? = null,
    val ifruPhys: Int? = null,
    val ifruMedia: Int? = null,
    val ifruIntval: Int? = null,
    val ifruData: String? = null,
    val ifruDevmtu: Ifdevmtu? = null,
    val ifruKpi: Ifkpi? = null,
    val ifruWakeFlags: UInt? = null,
    val ifruRouteRefcnt: UInt? = null,
    val ifruCap: IntArray? = null,
    val ifruFunctionalType: UInt? = null,
)
