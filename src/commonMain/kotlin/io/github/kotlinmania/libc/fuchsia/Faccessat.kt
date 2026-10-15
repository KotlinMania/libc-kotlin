// port-lint: source fuchsia/mod.rs
package io.github.kotlinmania.libc.fuchsia

import io.github.kotlinmania.libc.*

public expect fun faccessat(dirfd: Int, pathname: String?, mode: Int, flags: Int): Int
