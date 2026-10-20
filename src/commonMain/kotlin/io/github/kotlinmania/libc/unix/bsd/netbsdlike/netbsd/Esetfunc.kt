package io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd

import io.github.kotlinmania.libc.*

public fun esetfunc(cb: DiagnosticHandler?): DiagnosticHandler = cb ?: throw IllegalArgumentException("callback required")
