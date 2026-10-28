package io.github.kotlinmania.libc.vxworks

import io.github.kotlinmania.libc.*

public expect fun fsetpos(stream: FILE?, ptr: Long?): Int
