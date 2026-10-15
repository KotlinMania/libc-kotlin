// port-lint: source unix/bsd/netbsdlike/netbsd/mod.rs
package io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd

import io.github.kotlinmania.libc.*

public fun iocParmLen(x: UInt): UInt = (x shr IOCPARM_SHIFT.toInt()) and IOCPARM_MASK
