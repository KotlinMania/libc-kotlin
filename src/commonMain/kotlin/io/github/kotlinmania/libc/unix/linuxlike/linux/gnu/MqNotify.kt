package io.github.kotlinmania.libc.unix.linuxlike.linux.gnu
import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.unix.linuxlike.Sigevent

public expect fun mqNotify(mqdes: Int, sevp: Sigevent?): Int
