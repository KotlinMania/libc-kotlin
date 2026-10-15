// port-lint: source unix/bsd/netbsdlike/netbsd/mod.rs
package io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd

import io.github.kotlinmania.libc.*

public expect fun snprintbM(buf: String?, buflen: ULong, fmt: String?, `val`: ULong, max: ULong): Int
