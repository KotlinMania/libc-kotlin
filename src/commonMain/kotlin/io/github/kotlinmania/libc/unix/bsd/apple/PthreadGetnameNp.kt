package io.github.kotlinmania.libc.unix.bsd.apple

import io.github.kotlinmania.libc.*

public expect fun pthreadGetnameNp(thread: ULong, name: String?, len: ULong): Int
