// port-lint: source wasi/mod.rs
package io.github.kotlinmania.libc.wasi

import io.github.kotlinmania.libc.*

public expect fun wasilibcNocwdOpenatNomode(dirfd: Int, path: String?, flags: Int): Int
