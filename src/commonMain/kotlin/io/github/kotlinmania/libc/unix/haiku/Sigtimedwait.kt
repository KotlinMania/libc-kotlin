package io.github.kotlinmania.libc.unix.haiku

import io.github.kotlinmania.libc.*

public expect fun sigtimedwait(set: ULong?, info: SiginfoT?, timeout: Timespec?): Int
