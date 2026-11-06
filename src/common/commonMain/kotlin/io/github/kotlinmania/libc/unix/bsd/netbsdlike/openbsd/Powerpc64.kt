// port-lint: source unix/bsd/netbsdlike/openbsd/powerpc64.rs
package io.github.kotlinmania.libc.unix.bsd.netbsdlike.openbsd

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CLong

internal val ALIGNBYTES: Int = sizeOf<CLong>() - 1

public val MAX_PAGE_SHIFT: UInt = 12u
