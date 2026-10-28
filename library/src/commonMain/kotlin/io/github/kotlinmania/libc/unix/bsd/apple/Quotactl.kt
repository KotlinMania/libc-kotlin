package io.github.kotlinmania.libc.unix.bsd.apple

import io.github.kotlinmania.libc.*

public expect fun quotactl(special: String?, cmd: Int, id: Int, data: String?): Int
