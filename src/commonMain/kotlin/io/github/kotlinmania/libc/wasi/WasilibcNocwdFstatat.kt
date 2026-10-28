package io.github.kotlinmania.libc.wasi

import io.github.kotlinmania.libc.*

public expect fun wasilibcNocwdFstatat(dirfd: Int, path: String?, buf: Stat?, flags: Int): Int
