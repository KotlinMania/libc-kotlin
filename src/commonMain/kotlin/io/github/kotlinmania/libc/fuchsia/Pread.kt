// port-lint: source fuchsia/mod.rs
package io.github.kotlinmania.libc.fuchsia

import io.github.kotlinmania.libc.*

public expect fun pread(fd: Int, buf: COpaquePointer?, count: ULong, offset: Long): Long
