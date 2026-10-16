package io.github.kotlinmania.libc.windows

import io.github.kotlinmania.libc.*

public expect fun getcwd(buf: String?, size: Int): String?
