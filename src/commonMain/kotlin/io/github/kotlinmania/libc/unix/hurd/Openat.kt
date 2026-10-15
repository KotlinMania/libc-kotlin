// port-lint: source unix/hurd/mod.rs
package io.github.kotlinmania.libc.unix.hurd

import io.github.kotlinmania.libc.*

public expect fun openat(fd: Int, file: String?, oflag: Int, vararg args: Any?): Int
