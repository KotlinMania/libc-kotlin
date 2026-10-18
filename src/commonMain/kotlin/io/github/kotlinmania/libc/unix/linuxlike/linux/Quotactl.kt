package io.github.kotlinmania.libc.unix.linuxlike.linux

import io.github.kotlinmania.libc.*

public expect fun quotactl(cmd: Int, special: String?, id: Int, data: String?): Int
