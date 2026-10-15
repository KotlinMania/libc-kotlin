// port-lint: source wasi/mod.rs
package io.github.kotlinmania.libc.wasi

import io.github.kotlinmania.libc.*

public expect fun fstatat(dirfd: Int, pathname: String?, buf: Stat?, flags: Int): Int
