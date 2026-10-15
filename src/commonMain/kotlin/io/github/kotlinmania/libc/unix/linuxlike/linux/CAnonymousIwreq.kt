// port-lint: source unix/linux_like/linux/mod.rs
package io.github.kotlinmania.libc.unix.linuxlike.linux

import io.github.kotlinmania.libc.*

// C union; only one variant is valid at a time.
public data class CAnonymousIwreq(
    val ifrnName: ByteArray? = null,
)
