// port-lint: source unix/bsd/netbsdlike/openbsd/x86.rs
package io.github.kotlinmania.libc.unix.bsd.netbsdlike.openbsd

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt

internal val ALIGNBYTES: Int = sizeOf<CInt>() - 1

public val MAX_PAGE_SHIFT: UInt = 12u
