package io.github.kotlinmania.libc.wasi

import io.github.kotlinmania.libc.*

public expect fun wasilibcNocwdUtimensat(dirfd: Int, path: String?, times: Timespec?, flags: Int): Int
