package io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd

import io.github.kotlinmania.libc.*

public expect fun pthreadSetnameNp(t: ULong, name: String?, arg: COpaquePointer?): Int
