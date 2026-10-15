// port-lint: source wasi/mod.rs
package io.github.kotlinmania.libc.wasi

import io.github.kotlinmania.libc.*

public expect fun unlinkat(dirfd: Int, pathname: String?, flags: Int): Int
