package io.github.kotlinmania.libc.unix.aix
import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.unix.Pollfd

public expect fun pollsetPoll(ps: Int, polldataArray: Pollfd?, arrayLength: Int, timeout: Int): Int
