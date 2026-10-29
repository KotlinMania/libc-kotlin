package io.github.kotlinmania.libc.fuchsia

import io.github.kotlinmania.libc.*

public expect fun strnlen(cs: String?, maxlen: ULong): ULong
