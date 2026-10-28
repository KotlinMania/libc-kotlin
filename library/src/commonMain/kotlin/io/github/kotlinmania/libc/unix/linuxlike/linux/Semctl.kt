package io.github.kotlinmania.libc.unix.linuxlike.linux

import io.github.kotlinmania.libc.*

public expect fun semctl(semid: Int, semnum: Int, cmd: Int, vararg args: Any?): Int
