package io.github.kotlinmania.libc.fuchsia

import io.github.kotlinmania.libc.*

public expect fun pthreadGetnameNp(thread: ULong, name: String?, len: ULong): Int
