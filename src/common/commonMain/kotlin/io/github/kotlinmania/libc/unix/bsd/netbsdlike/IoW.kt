package io.github.kotlinmania.libc.unix.bsd.netbsdlike

import io.github.kotlinmania.libc.*

/** Builds a write-only ioctl number using the parameter's C ABI size in bytes. */
public fun ioW(group: ULong, number: ULong, size: ULong): ULong = ioctlNumber(IOC_IN, group, number, size)
