package io.github.kotlinmania.libc.windows

import io.github.kotlinmania.libc.*

public expect fun wchmod(path: UShort?, mode: Int): Int
