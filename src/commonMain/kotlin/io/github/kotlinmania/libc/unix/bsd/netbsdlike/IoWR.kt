// port-lint: source unix/bsd/netbsdlike/mod.rs
package io.github.kotlinmania.libc.unix.bsd.netbsdlike

import io.github.kotlinmania.libc.*

/** Builds a read-write ioctl number using the parameter's C ABI size in bytes. */
public fun ioWR(group: ULong, number: ULong, size: ULong): ULong = ioctlNumber(IOC_INOUT, group, number, size)
