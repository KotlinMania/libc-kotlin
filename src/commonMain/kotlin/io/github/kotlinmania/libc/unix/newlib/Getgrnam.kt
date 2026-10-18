package io.github.kotlinmania.libc.unix.newlib
import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.unix.Group

public expect fun getgrnam(name: String?): Group?
