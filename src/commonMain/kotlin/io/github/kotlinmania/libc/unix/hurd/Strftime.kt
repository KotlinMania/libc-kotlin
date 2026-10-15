// port-lint: source unix/hurd/mod.rs
package io.github.kotlinmania.libc.unix.hurd

import io.github.kotlinmania.libc.*

public expect fun strftime(s: String?, max: ULong, format: String?, tm: Tm?): ULong
