package io.github.kotlinmania.libc.fuchsia

import io.github.kotlinmania.libc.*

public expect fun symlinkat(target: String?, newdirfd: Int, linkpath: String?): Int
