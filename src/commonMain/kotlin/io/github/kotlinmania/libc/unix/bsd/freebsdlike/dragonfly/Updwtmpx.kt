package io.github.kotlinmania.libc.unix.bsd.freebsdlike.dragonfly

import io.github.kotlinmania.libc.*

public expect fun updwtmpx(file: String?, ut: Utmpx?): Int
