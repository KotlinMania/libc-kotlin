// port-lint: source unix/bsd/netbsdlike/netbsd/mod.rs
package io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd

import io.github.kotlinmania.libc.*

public expect fun strpct(buf: String?, bufsiz: ULong, numerator: ULong, denominator: ULong, precision: ULong): String?
