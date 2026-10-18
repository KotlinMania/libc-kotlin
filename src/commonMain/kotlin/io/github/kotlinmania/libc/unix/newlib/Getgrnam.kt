package io.github.kotlinmania.libc.unix.newlib
import io.github.kotlinmania.libc.unix.Group

import io.github.kotlinmania.libc.*

public expect fun getgrnam(name: String?): Group?
