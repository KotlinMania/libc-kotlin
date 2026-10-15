// port-lint: source windows/mod.rs
package io.github.kotlinmania.libc.windows

import io.github.kotlinmania.libc.*

public expect fun lseek64(fd: Int, offset: Long, origin: Int): Long
