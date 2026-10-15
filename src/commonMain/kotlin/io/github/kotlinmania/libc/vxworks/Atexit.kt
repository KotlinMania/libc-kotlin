package io.github.kotlinmania.libc.vxworks

import io.github.kotlinmania.libc.*

public expect fun atexit(cb: (() -> Unit)?): Int
