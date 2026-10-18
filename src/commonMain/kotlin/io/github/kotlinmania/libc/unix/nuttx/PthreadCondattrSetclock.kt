package io.github.kotlinmania.libc.unix.nuttx

import io.github.kotlinmania.libc.*

public expect fun pthreadCondattrSetclock(attr: PthreadCondattrT?, clockId: Int): Int
