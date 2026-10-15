// port-lint: source unix/bsd/netbsdlike/netbsd/mod.rs
package io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd

import io.github.kotlinmania.libc.*

public fun ioc(inout: ULong, group: ULong, num: ULong, len: ULong): ULong =
    inout or
        ((len and IOCPARM_MASK.toULong()) shl IOCPARM_SHIFT.toInt()) or
        (group shl IOCGROUP_SHIFT.toInt()) or
        num
