package io.github.kotlinmania.libc.wasi

import io.github.kotlinmania.libc.*

public expect fun setbuf(stream: FILE?, buf: String?)
