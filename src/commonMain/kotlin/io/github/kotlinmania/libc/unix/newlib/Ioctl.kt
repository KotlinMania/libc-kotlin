// port-lint: source unix/newlib/mod.rs
package io.github.kotlinmania.libc.unix.newlib

import io.github.kotlinmania.libc.*

public expect fun ioctl(fd: Int, request: ULong, vararg args: Any?): Int
