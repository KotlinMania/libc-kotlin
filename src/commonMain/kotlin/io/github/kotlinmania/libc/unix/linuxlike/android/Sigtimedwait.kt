package io.github.kotlinmania.libc.unix.linuxlike.android

import io.github.kotlinmania.libc.*

public expect fun sigtimedwait(set: ULong?, info: SiginfoT?, timeout: Timespec?): Int
