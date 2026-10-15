package io.github.kotlinmania.libc.unix.nto

import io.github.kotlinmania.libc.*

public expect fun daemon(nochdir: Int, noclose: Int): Int
