package io.github.kotlinmania.libc.unix.haiku

import io.github.kotlinmania.libc.*

public expect fun pthreadGetattrNp(thread: ULong, attr: io.github.kotlinmania.libc.COpaquePointer?): Int
