package io.github.kotlinmania.libc.unix.cygwin
import io.github.kotlinmania.libc.unix.Timespec

import io.github.kotlinmania.libc.*

public expect fun sigtimedwait(set: ULong?, info: SiginfoT?, timeout: Timespec?): Int
