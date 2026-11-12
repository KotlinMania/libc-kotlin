// port-lint: source unix/bsd/netbsdlike/openbsd/x86.rs
package io.github.kotlinmania.libc.unix.bsd.netbsdlike.openbsd.x86

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.rustlang.core.mem.ObjectSlotLayout

public val MAX_PAGE_SHIFT: UInt = 12u

internal val ALIGNBYTES: Int = sizeOf<CInt>(typeLayoutT = ObjectSlotLayout<CInt>()) - 1
