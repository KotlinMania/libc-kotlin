package io.github.kotlinmania.libc.fuchsia

import io.github.kotlinmania.libc.*

public expect fun signalfd(fd: Int, mask: SigsetT?, flags: Int): Int
