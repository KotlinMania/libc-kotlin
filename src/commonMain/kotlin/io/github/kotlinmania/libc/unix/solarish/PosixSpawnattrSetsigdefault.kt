package io.github.kotlinmania.libc.unix.solarish

import io.github.kotlinmania.libc.*

public expect fun posixSpawnattrSetsigdefault(attr: io.github.kotlinmania.libc.COpaquePointer?, sigdefault: SigsetT?): Int
