package io.github.kotlinmania.libc.unix.aix

import io.github.kotlinmania.libc.*

public expect fun nrand48(xseed: UShort?): Long
