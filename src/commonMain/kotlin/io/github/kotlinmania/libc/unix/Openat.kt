// port-lint: source unix/mod.rs
package io.github.kotlinmania.libc.unix

import io.github.kotlinmania.libc.*

public expect fun openat(dirfd: Int, pathname: String?, flags: Int, vararg args: Any?): Int
