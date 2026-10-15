// port-lint: source unix/bsd/mod.rs
package io.github.kotlinmania.libc.unix.bsd

import io.github.kotlinmania.libc.*

public expect fun strftime(buf: String?, maxsize: ULong, format: String?, timeptr: Tm?): ULong
