package io.github.kotlinmania.libc.unix.haiku

import io.github.kotlinmania.libc.*

public expect fun pthreadGetnameNp(thread: ULong, buffer: String?, length: ULong): Int
