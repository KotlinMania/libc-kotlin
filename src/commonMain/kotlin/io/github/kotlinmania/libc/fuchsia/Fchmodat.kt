// port-lint: source fuchsia/mod.rs
package io.github.kotlinmania.libc.fuchsia

import io.github.kotlinmania.libc.*

public expect fun fchmodat(dirfd: Int, pathname: String?, mode: UInt, flags: Int): Int
