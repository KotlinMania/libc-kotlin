// port-lint: source unix/bsd/netbsdlike/openbsd/x86.rs
package io.github.kotlinmania.libc.unix.bsd.netbsdlike.openbsd

// _ALIGNBYTES = size_of::<c_int>() - 1
internal const val ALIGNBYTES: Int = 3

public const val MAX_PAGE_SHIFT: UInt = 12u
