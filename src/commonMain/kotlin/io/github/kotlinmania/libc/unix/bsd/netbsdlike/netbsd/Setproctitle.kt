package io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd

import io.github.kotlinmania.libc.*

public expect fun setproctitle(fmt: String?, vararg args: Any?)
