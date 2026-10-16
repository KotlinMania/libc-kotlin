package io.github.kotlinmania.libc.vxworks

import io.github.kotlinmania.libc.*

public expect fun fscanf(stream: FILE?, format: String?, vararg args: Any?): Int
