// port-lint: source unix/solarish/mod.rs
package io.github.kotlinmania.libc.unix.solarish

import io.github.kotlinmania.libc.*

public expect fun strftime(s: String?, maxsize: ULong, format: String?, timeptr: Tm?): ULong
