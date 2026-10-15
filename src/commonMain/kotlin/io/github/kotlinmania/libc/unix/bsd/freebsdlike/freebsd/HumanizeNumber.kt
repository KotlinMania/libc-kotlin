// port-lint: source unix/bsd/freebsdlike/freebsd/mod.rs
package io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd

import io.github.kotlinmania.libc.*

public expect fun humanizeNumber(buf: String?, len: ULong, number: Long, suffix: String?, scale: Int, flags: Int): Int
