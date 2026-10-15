// port-lint: source wasi/mod.rs
package io.github.kotlinmania.libc.wasi

import io.github.kotlinmania.libc.*

public expect fun fstat(fildes: Int, buf: Stat?): Int
