package io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd
import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.unix.In6Addr

// C union; only one variant is valid at a time.
public data class InDependaddr(
    val id46Addr: InAddr4in6? = null,
    val id6Addr: In6Addr? = null,
)
