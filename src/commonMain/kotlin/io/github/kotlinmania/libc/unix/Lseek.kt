// port-lint: source unix/mod.rs
package io.github.kotlinmania.libc.unix

import io.github.kotlinmania.libc.*

public expect fun lseek(fd: Int, offset: Long, whence: Int): Long
