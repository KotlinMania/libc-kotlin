package io.github.kotlinmania.libc.unix.solarish

import io.github.kotlinmania.libc.*

public expect fun ucredGet(pid: Int): io.github.kotlinmania.libc.COpaquePointer?
