package io.github.kotlinmania.libc.unix.bsd.apple
import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.unix.Timespec

public expect fun pthreadCondTimedwaitRelativeNp(cond: io.github.kotlinmania.libc.COpaquePointer?, lock: io.github.kotlinmania.libc.COpaquePointer?, timeout: Timespec?): Int
