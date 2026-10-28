package io.github.kotlinmania.libc.unix.linuxlike
import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.b64.Stat64

public expect fun fstatat64(dirfd: Int, pathname: String?, buf: Stat64?, flags: Int): Int
