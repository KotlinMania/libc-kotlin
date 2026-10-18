package io.github.kotlinmania.libc.unix.cygwin
import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.unix.Timespec

public expect fun sigtimedwait(set: ULong?, info: SiginfoT?, timeout: Timespec?): Int
