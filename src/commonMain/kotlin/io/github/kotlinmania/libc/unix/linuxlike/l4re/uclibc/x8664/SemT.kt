// port-lint: source unix/linux_like/l4re/uclibc/x86_64/mod.rs
package io.github.kotlinmania.libc.unix.linuxlike.l4re.uclibc.x8664

import io.github.kotlinmania.libc.*

// C union; only one variant is valid at a time.
public data class SemT(
    val size: ByteArray? = null,
    val size2: ByteArray? = null,
    val align: LongArray? = null,
)
