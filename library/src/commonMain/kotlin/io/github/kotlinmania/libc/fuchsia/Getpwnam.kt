package io.github.kotlinmania.libc.fuchsia

import io.github.kotlinmania.libc.*

public expect fun getpwnam(name: String?): Passwd?
