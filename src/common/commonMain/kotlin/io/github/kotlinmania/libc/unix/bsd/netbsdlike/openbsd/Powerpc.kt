// port-lint: source unix/bsd/netbsdlike/openbsd/powerpc.rs
package io.github.kotlinmania.libc.unix.bsd.netbsdlike.openbsd

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CDouble

internal val ALIGNBYTES: Int = sizeOf<CDouble>() - 1

public val MAX_PAGE_SHIFT: UInt = 12u
