// port-lint: source unix/bsd/netbsdlike/mod.rs
package io.github.kotlinmania.libc.unix.bsd.netbsdlike

import io.github.kotlinmania.libc.*

internal fun ioctlNumber(direction: ULong, group: ULong, number: ULong, size: ULong): ULong =
    direction or ((size and IOCPARM_MASK.toULong()) shl 16) or (group shl 8) or number
