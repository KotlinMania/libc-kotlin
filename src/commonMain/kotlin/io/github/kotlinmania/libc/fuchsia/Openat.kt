// port-lint: source fuchsia/mod.rs
package io.github.kotlinmania.libc.fuchsia

import io.github.kotlinmania.libc.*

public expect fun openat(dirfd: Int, pathname: String?, flags: Int, vararg args: Any?): Int
