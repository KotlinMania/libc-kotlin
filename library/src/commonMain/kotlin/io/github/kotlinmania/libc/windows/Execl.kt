package io.github.kotlinmania.libc.windows

import io.github.kotlinmania.libc.*

public expect fun execl(path: String?, arg0: String?, vararg args: Any?): Long
