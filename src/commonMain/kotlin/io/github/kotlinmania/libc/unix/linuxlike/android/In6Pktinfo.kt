// port-lint: source unix/linux_like/android/mod.rs
package io.github.kotlinmania.libc.unix.linuxlike.android

import io.github.kotlinmania.libc.*

public data class In6Pktinfo(
    val ipi6Addr: In6Addr,
    val ipi6Ifindex: Int,
)
