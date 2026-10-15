// port-lint: source unix/bsd/freebsdlike/freebsd/mod.rs
package io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd

import io.github.kotlinmania.libc.*

// C union; only one variant is valid at a time.
public data class InDependaddr(
    val id46Addr: InAddr4in6? = null,
    val id6Addr: In6Addr? = null,
)
