// port-lint: source unix/bsd/mod.rs
package io.github.kotlinmania.libc.unix.bsd

import io.github.kotlinmania.libc.*

public expect fun ioctl(fd: Int, request: ULong, vararg args: Any?): Int
