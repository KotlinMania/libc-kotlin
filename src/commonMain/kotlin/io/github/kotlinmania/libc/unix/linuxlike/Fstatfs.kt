package io.github.kotlinmania.libc.unix.linuxlike
import io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.b64.Statfs

import io.github.kotlinmania.libc.*

public expect fun fstatfs(fd: Int, buf: Statfs?): Int
