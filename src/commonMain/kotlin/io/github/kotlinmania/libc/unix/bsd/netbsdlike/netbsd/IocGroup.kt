// port-lint: source unix/bsd/netbsdlike/netbsd/mod.rs
package io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd

import io.github.kotlinmania.libc.*

public fun iocGroup(x: UInt): UInt = (x shr IOCGROUP_SHIFT.toInt()) and 0xffu
