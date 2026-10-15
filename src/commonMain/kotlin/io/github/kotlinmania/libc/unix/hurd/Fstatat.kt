// port-lint: source unix/hurd/mod.rs
package io.github.kotlinmania.libc.unix.hurd

import io.github.kotlinmania.libc.*

public expect fun fstatat(fd: Int, file: String?, buf: Stat?, flag: Int): Int
