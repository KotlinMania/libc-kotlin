package io.github.kotlinmania.libc.windows

import io.github.kotlinmania.libc.*

public expect fun wexecl(path: UShort?, arg0: UShort?, vararg args: Any?): Long
