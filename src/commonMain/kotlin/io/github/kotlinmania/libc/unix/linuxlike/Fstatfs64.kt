package io.github.kotlinmania.libc.unix.linuxlike
import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.b64.Statfs64

public expect fun fstatfs64(fd: Int, buf: Statfs64?): Int
