// port-lint: source unix/bsd/netbsdlike/openbsd/powerpc.rs
package io.github.kotlinmania.libc.unix.bsd.netbsdlike.openbsd.powerpc

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CDouble
import io.github.kotlinmania.rustlang.core.mem.ObjectSlotLayout

public val MAX_PAGE_SHIFT: UInt = 12u

internal val ALIGNBYTES: Int = sizeOf<CDouble>(typeLayoutT = ObjectSlotLayout<CDouble>()) - 1
