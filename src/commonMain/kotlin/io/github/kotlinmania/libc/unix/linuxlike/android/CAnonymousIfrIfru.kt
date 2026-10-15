// port-lint: source unix/linux_like/android/mod.rs
package io.github.kotlinmania.libc.unix.linuxlike.android

import io.github.kotlinmania.libc.*

// C union; only one variant is valid at a time.
public data class CAnonymousIfrIfru(
    val ifruAddr: Sockaddr? = null,
    val ifruDstaddr: Sockaddr? = null,
    val ifruBroadaddr: Sockaddr? = null,
    val ifruNetmask: Sockaddr? = null,
    val ifruHwaddr: Sockaddr? = null,
    val ifruFlags: Short? = null,
    val ifruIfindex: Int? = null,
    val ifruMetric: Int? = null,
    val ifruMtu: Int? = null,
    val ifruMap: CAnonymousIfruMap? = null,
    val ifruSlave: ByteArray? = null,
    val ifruNewname: ByteArray? = null,
    val ifruData: String? = null,
)
