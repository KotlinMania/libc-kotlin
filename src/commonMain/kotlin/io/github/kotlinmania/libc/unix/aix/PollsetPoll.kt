package io.github.kotlinmania.libc.unix.aix
import io.github.kotlinmania.libc.unix.Pollfd

import io.github.kotlinmania.libc.*

public expect fun pollsetPoll(ps: Int, polldataArray: Pollfd?, arrayLength: Int, timeout: Int): Int
