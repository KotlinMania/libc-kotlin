package io.github.kotlinmania.libc.unix.aix
import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.unix.Pollfd

public expect fun pollsetQuery(ps: Int, pollfdQuery: Pollfd?): Int
