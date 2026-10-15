package io.github.kotlinmania.libc.unix.linuxlike.linux.uclibc

import io.github.kotlinmania.libc.*

public expect fun ptrace(request: UInt, vararg args: Any?): Long
