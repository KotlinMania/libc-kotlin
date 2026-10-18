package io.github.kotlinmania.libc.windows

import io.github.kotlinmania.libc.*

public expect fun fileno(stream: FILE?): Int
