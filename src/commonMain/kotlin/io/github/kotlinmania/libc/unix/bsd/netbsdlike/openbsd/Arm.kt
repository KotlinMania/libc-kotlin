// port-lint: source unix/bsd/netbsdlike/openbsd/arm.rs
package io.github.kotlinmania.libc.unix.bsd.netbsdlike.openbsd

// _ALIGNBYTES = size_of::<c_double>() - 1
internal const val ALIGNBYTES: Int = 7

public const val MAX_PAGE_SHIFT: UInt = 12u
