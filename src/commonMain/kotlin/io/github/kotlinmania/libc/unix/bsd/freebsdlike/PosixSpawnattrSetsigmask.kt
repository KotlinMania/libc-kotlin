package io.github.kotlinmania.libc.unix.bsd.freebsdlike

import io.github.kotlinmania.libc.*

public expect fun posixSpawnattrSetsigmask(attr: io.github.kotlinmania.libc.COpaquePointer?, default: SigsetT?): Int
