package io.github.kotlinmania.libc.unix.bsd.netbsdlike

import io.github.kotlinmania.libc.*

public expect fun shmdt(shmaddr: COpaquePointer?): Int
