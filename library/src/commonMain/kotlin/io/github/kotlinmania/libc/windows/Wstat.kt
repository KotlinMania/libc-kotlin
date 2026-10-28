package io.github.kotlinmania.libc.windows

import io.github.kotlinmania.libc.*

public expect fun wstat(path: UShort?, buf: Stat?): Int
