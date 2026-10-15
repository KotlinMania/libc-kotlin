// port-lint: source fuchsia/mod.rs
package io.github.kotlinmania.libc.fuchsia

import io.github.kotlinmania.libc.*

public expect fun fallocate(fd: Int, mode: Int, offset: Long, len: Long): Int
