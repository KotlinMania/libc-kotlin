// port-lint: source wasi/mod.rs
package io.github.kotlinmania.libc.wasi

import io.github.kotlinmania.libc.*

public expect fun utimensat(dirfd: Int, path: String?, times: Timespec?, flag: Int): Int
