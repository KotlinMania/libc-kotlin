// port-lint: source wasi/mod.rs
package io.github.kotlinmania.libc.wasi

import io.github.kotlinmania.libc.*

public expect fun ioctl(fd: Int, request: Int, vararg args: Any?): Int
