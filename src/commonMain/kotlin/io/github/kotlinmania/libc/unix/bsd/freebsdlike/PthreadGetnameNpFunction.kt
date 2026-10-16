package io.github.kotlinmania.libc.unix.bsd.freebsdlike

import io.github.kotlinmania.libc.*

public expect fun pthreadGetnameNp(thread: ULong, buffer: String?, length: ULong): Int
