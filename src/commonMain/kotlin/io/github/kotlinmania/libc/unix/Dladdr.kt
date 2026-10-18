package io.github.kotlinmania.libc.unix
import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.unix.linuxlike.DlInfo

public expect fun dladdr(addr: COpaquePointer?, info: DlInfo?): Int
