package io.github.kotlinmania.libc.unix.linuxlike.android

import io.github.kotlinmania.libc.*

public expect fun tgkill(tgid: Int, tid: Int, sig: Int): Int
