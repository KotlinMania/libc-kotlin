package io.github.kotlinmania.libc.windows

import io.github.kotlinmania.libc.*

public expect fun setbuf(stream: FILE?, buf: String?)
