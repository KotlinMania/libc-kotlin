package io.github.kotlinmania.libc.unix.nuttx

import io.github.kotlinmania.libc.*

public expect fun pthreadSetnameNp(thread: Int, name: String?): Int
