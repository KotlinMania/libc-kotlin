package io.github.kotlinmania.libc.unix.bsd.apple
import io.github.kotlinmania.libc.unix.Timeval

import io.github.kotlinmania.libc.*

public expect fun lutimes(file: String?, times: Timeval?): Int
