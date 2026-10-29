package io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd

import io.github.kotlinmania.libc.*

public expect fun logwtmpx(line: String?, name: String?, host: String?, status: Int, tpe: Int)
