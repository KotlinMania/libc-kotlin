package io.github.kotlinmania.libc.wasi

import io.github.kotlinmania.libc.*

public expect fun wasilibcNocwdOpendirat(dirfd: Int, path: String?): DIR?
