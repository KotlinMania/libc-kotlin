package io.github.kotlinmania.libc.unix.solarish

import io.github.kotlinmania.libc.*

public expect fun posixSpawnattrSetschedpolicy(attr: io.github.kotlinmania.libc.COpaquePointer?, policy: Int): Int
