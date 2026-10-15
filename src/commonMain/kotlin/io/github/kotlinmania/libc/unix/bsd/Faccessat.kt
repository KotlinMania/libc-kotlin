// port-lint: source unix/bsd/mod.rs
package io.github.kotlinmania.libc.unix.bsd

import io.github.kotlinmania.libc.*

public expect fun faccessat(dirfd: Int, pathname: String?, mode: Int, flags: Int): Int
