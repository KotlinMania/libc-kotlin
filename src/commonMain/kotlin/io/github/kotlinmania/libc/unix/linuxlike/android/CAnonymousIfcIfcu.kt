// port-lint: source unix/linux_like/android/mod.rs
package io.github.kotlinmania.libc.unix.linuxlike.android

import io.github.kotlinmania.libc.*

// C union; only one variant is valid at a time.
public data class CAnonymousIfcIfcu(
    val ifcuBuf: String? = null,
    val ifcuReq: Ifreq? = null,
)
