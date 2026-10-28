package io.github.kotlinmania.libc.fuchsia

import io.github.kotlinmania.libc.*

public expect fun timerfdCreate(clockid: Int, flags: Int): Int
