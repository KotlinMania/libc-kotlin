// port-lint: source unix/bsd/freebsdlike/freebsd/x86_64/mod.rs
package io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.x8664

import io.github.kotlinmania.libc.*

// C union; only one variant is valid at a time.
public data class CAnonymousElf64AuxvUnion(
    val aVal: Long? = null,
    val aPtr: COpaquePointer? = null,
    val aFcn: (() -> Unit)? = null,
)
