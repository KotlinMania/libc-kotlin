// port-lint: source fuchsia/mod.rs
package io.github.kotlinmania.libc.fuchsia

import io.github.kotlinmania.libc.*

public expect fun fstatat(dirfd: Int, pathname: String?, buf: Stat?, flags: Int): Int
