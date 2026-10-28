package io.github.kotlinmania.libc.unix.linuxlike.linux.gnu
import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.unix.linuxlike.Passwd

public expect fun putpwent(p: Passwd?, stream: FILE?): Int
