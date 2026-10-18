package io.github.kotlinmania.libc.vxworks

import io.github.kotlinmania.libc.*

public expect fun stat(path: String?, buf: Stat?): Int
