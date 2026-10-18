package io.github.kotlinmania.libc.unix.linuxlike
import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.b64.Statvfs64

public expect fun fstatvfs64(fd: Int, buf: Statvfs64?): Int
