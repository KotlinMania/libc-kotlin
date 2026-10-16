package io.github.kotlinmania.libc.wasi

import io.github.kotlinmania.libc.*

public expect fun strnlen(cs: String?, maxlen: ULong): ULong
