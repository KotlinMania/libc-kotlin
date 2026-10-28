package io.github.kotlinmania.libc.unix.cygwin

import io.github.kotlinmania.libc.*

public expect fun eaccess(pathname: String?, mode: Int): Int
