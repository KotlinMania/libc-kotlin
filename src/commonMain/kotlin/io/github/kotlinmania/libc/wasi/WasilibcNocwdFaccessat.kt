package io.github.kotlinmania.libc.wasi

import io.github.kotlinmania.libc.*

public expect fun wasilibcNocwdFaccessat(dirfd: Int, path: String?, mode: Int, flags: Int): Int
