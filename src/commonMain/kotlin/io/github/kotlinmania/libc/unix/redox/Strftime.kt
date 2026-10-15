// port-lint: source unix/redox/mod.rs
package io.github.kotlinmania.libc.unix.redox

import io.github.kotlinmania.libc.*

public expect fun strftime(s: String?, max: ULong, format: String?, tm: Tm?): ULong
