package io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd

import io.github.kotlinmania.libc.*

public expect fun timerDelete(timerid: io.github.kotlinmania.libc.COpaquePointer?): Int
