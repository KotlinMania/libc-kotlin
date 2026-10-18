package io.github.kotlinmania.libc.unix.solarish

import io.github.kotlinmania.libc.*

public expect fun posixSpawnattrSetsigignoreNp(attr: io.github.kotlinmania.libc.COpaquePointer?, sigignore: SigsetT?): Int
