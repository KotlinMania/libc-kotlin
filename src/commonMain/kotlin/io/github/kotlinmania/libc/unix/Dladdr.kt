package io.github.kotlinmania.libc.unix
import io.github.kotlinmania.libc.unix.linuxlike.DlInfo

import io.github.kotlinmania.libc.*

public expect fun dladdr(addr: COpaquePointer?, info: DlInfo?): Int
