package io.github.kotlinmania.libc.unix.cygwin

import io.github.kotlinmania.libc.*

public expect fun pthreadGetnameNp(thread: io.github.kotlinmania.libc.COpaquePointer?, name: String?, len: ULong): Int
