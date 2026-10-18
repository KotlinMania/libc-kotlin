package io.github.kotlinmania.libc.unix

import io.github.kotlinmania.libc.*

public expect fun nanosleep(rqtp: Timespec?, rmtp: Timespec?): Int
