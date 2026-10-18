package io.github.kotlinmania.libc.unix.cygwin
import io.github.kotlinmania.libc.unix.Group

import io.github.kotlinmania.libc.*

public expect fun getgrnam(name: String?): Group?
