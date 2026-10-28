package io.github.kotlinmania.libc.windows

import io.github.kotlinmania.libc.*

public expect fun pclose(stream: FILE?): Int
