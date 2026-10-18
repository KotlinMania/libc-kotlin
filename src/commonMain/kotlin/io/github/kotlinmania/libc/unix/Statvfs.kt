package io.github.kotlinmania.libc.unix

import io.github.kotlinmania.libc.*

public expect fun statvfs(path: String?, buf: Statvfs?): Int
