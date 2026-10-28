package io.github.kotlinmania.libc.unix.hurd

import io.github.kotlinmania.libc.*

public expect fun lutimes(file: String?, times: Timeval?): Int
