package io.github.kotlinmania.libc.unix.hurd

import io.github.kotlinmania.libc.*

public expect fun pthreadCondattrGetclock(attr: io.github.kotlinmania.libc.unix.hurd.PthreadCondattr?, clockId: Int?): Int
