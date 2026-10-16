package io.github.kotlinmania.libc.vxworks

import io.github.kotlinmania.libc.*

public expect fun fnmatch(pattern: String?, name: String?, flags: Int): Int
