// port-lint: source unix/hurd/mod.rs
package io.github.kotlinmania.libc.unix.hurd

import io.github.kotlinmania.libc.*

public expect fun fstatat64(fd: Int, file: String?, buf: Stat64?, flag: Int): Int
