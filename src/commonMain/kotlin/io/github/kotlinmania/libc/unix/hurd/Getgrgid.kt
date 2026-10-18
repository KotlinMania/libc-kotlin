package io.github.kotlinmania.libc.unix.hurd
import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.unix.Group

public expect fun getgrgid(gid: UInt): Group?
