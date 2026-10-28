package io.github.kotlinmania.libc.unix.bsd
import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.unix.Group

public expect fun getgrgid(gid: UInt): Group?
