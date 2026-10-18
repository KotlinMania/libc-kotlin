package io.github.kotlinmania.libc.unix.linuxlike.linux
import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.b64.StackT

public expect fun sigaltstack(ss: StackT?, oss: StackT?): Int
