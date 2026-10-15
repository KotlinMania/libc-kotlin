package io.github.kotlinmania.libc.unix.bsd

import io.github.kotlinmania.libc.*

public expect fun nrand48(xseed: UShort?): Long
