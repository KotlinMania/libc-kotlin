package io.github.kotlinmania.libc.unix.newlib.vita

import io.github.kotlinmania.libc.*

public expect fun pthreadCondattrGetclock(attr: io.github.kotlinmania.libc.COpaquePointer?, clockId: Int?): Int
