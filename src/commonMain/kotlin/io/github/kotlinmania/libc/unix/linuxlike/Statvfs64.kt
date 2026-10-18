package io.github.kotlinmania.libc.unix.linuxlike
import io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.b64.Statvfs64

import io.github.kotlinmania.libc.*

public expect fun statvfs64(path: String?, buf: Statvfs64?): Int
