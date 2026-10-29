package io.github.kotlinmania.libc.unix

import io.github.kotlinmania.libc.*

public expect fun symlink(path1: String?, path2: String?): Int
