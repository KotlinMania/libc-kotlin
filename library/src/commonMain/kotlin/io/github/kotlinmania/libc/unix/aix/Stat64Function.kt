package io.github.kotlinmania.libc.unix.aix

import io.github.kotlinmania.libc.*

public expect fun stat64(path: String?, buf: Stat64?): Int
