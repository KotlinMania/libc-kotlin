package io.github.kotlinmania.libc.unix.solarish

import io.github.kotlinmania.libc.*

public expect fun futimesat(fd: Int, path: String?, times: Timeval?): Int
