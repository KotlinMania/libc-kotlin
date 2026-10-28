package io.github.kotlinmania.libc.vxworks

import io.github.kotlinmania.libc.*

public expect fun fdopen(fd: Int, mode: String?): FILE?
