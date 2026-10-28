package io.github.kotlinmania.libc.fuchsia

import io.github.kotlinmania.libc.*

public expect fun execlp(file: String?, arg0: String?, vararg args: Any?): Int
