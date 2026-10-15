// port-lint: source unix/bsd/netbsdlike/mod.rs
package io.github.kotlinmania.libc.unix.bsd.netbsdlike

import io.github.kotlinmania.libc.*

/** Builds an ioctl number with no parameter. */
public fun io(group: ULong, number: ULong): ULong = ioctlNumber(IOC_VOID, group, number, 0uL)
