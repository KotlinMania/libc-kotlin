package io.github.kotlinmania.libc.unix.linuxlike.linux.musl

import io.github.kotlinmania.libc.*

public expect fun eaccess(pathname: String?, mode: Int): Int
