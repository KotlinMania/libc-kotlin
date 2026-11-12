// port-lint: source unix/bsd/netbsdlike/openbsd/powerpc64.rs
package io.github.kotlinmania.libc.unix.bsd.netbsdlike.openbsd.powerpc64

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CLong
import io.github.kotlinmania.rustlang.core.mem.ObjectSlotLayout

public val MAX_PAGE_SHIFT: UInt = 12u

internal val ALIGNBYTES: Int = sizeOf<CLong>(typeLayoutT = ObjectSlotLayout<CLong>()) - 1
