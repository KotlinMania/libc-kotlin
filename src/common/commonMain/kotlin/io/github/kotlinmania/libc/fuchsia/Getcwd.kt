package io.github.kotlinmania.libc.fuchsia

import io.github.kotlinmania.libc.*

public expect fun getcwd(buf: String?, size: ULong): String?
