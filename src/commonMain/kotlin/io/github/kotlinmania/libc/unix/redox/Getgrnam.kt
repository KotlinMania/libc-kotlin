package io.github.kotlinmania.libc.unix.redox
import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.unix.Group

public expect fun getgrnam(name: String?): Group?
