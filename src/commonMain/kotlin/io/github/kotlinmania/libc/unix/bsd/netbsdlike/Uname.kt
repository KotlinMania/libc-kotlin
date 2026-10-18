package io.github.kotlinmania.libc.unix.bsd.netbsdlike
import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.unix.bsd.Utsname

public expect fun uname(buf: Utsname?): Int
