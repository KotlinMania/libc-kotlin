package io.github.kotlinmania.libc.unix.aix

import io.github.kotlinmania.libc.*

public expect fun pollsetQuery(ps: Int, pollfdQuery: Pollfd?): Int
