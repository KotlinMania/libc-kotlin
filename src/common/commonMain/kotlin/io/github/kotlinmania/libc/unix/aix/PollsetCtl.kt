package io.github.kotlinmania.libc.unix.aix

import io.github.kotlinmania.libc.*

public expect fun pollsetCtl(ps: Int, pollctlArray: PollCtl?, arrayLength: Int): Int
