package io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd

import io.github.kotlinmania.libc.*

public expect fun setproctitleFast(fmt: String?, vararg args: Any?)
