package io.github.kotlinmania.libc.vxworks

import io.github.kotlinmania.libc.*

public expect fun symlinkat(target: String?, newdirfd: Int, linkpath: String?): Int
