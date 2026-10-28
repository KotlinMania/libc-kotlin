package io.github.kotlinmania.libc.unix.linuxlike
import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.b64.Statfs64

public expect fun statfs64(path: String?, buf: Statfs64?): Int
