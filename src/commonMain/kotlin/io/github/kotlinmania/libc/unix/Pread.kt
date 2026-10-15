// port-lint: source unix/mod.rs
package io.github.kotlinmania.libc.unix

import io.github.kotlinmania.libc.*

public expect fun pread(fd: Int, buf: COpaquePointer?, count: ULong, offset: Long): Long
