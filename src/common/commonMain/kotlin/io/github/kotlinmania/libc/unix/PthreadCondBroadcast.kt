package io.github.kotlinmania.libc.unix

import io.github.kotlinmania.libc.*

public expect fun pthreadCondBroadcast(cond: io.github.kotlinmania.libc.COpaquePointer?): Int
