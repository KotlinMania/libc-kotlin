package io.github.kotlinmania.libc.unix.linuxlike
import io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.b64.Stat64

import io.github.kotlinmania.libc.*

public expect fun stat64(path: String?, buf: Stat64?): Int
