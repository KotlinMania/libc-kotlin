// port-lint: source unix/nuttx/mod.rs
package io.github.kotlinmania.libc.unix.nuttx

import io.github.kotlinmania.libc.*

public expect fun ioctl(fd: Int, request: Int, vararg args: Any?): Int
