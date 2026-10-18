package io.github.kotlinmania.libc.unix.linuxlike.linux.gnu
import io.github.kotlinmania.libc.unix.linuxlike.Passwd

import io.github.kotlinmania.libc.*

public expect fun putpwent(p: Passwd?, stream: FILE?): Int
