package io.github.kotlinmania.libc.fuchsia

import io.github.kotlinmania.libc.*

public expect fun pthreadSetnameNp(thread: ULong, name: String?): Int
