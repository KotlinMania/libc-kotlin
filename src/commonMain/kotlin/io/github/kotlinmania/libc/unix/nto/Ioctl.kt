// port-lint: source unix/nto/mod.rs
package io.github.kotlinmania.libc.unix.nto

import io.github.kotlinmania.libc.*

public expect fun ioctl(fd: Int, request: Int, vararg args: Any?): Int
