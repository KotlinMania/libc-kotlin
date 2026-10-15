// port-lint: source unix/linux_like/linux/mod.rs
package io.github.kotlinmania.libc.unix.linuxlike.linux

import io.github.kotlinmania.libc.*

public data class FanotifyEventInfoFid(
    val hdr: FanotifyEventInfoHeader,
    val fsid: io.github.kotlinmania.libc.unix.linuxlike.linux.CAnonymousKernelFsidT,
    val handle: UByteArray,
)
