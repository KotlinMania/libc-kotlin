package io.github.kotlinmania.libc.vxworks

import io.github.kotlinmania.libc.*

public expect fun getcwd(buf: String?, size: ULong): String?
