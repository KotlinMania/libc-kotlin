package io.github.kotlinmania.libc.unix.hurd

import io.github.kotlinmania.libc.*

public expect fun euidaccess(pathname: String?, mode: Int): Int
