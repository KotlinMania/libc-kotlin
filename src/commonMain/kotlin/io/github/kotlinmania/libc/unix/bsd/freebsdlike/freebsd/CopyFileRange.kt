// port-lint: source unix/bsd/freebsdlike/freebsd/mod.rs
package io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd

import io.github.kotlinmania.libc.*

public expect fun copyFileRange(infd: Int, inoffp: Long?, outfd: Int, outoffp: Long?, len: ULong, flags: UInt): Long
