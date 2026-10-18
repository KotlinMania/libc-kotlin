package io.github.kotlinmania.libc.unix
import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.unix.bsd.apple.Statvfs

public expect fun statvfs(path: String?, buf: Statvfs?): Int
