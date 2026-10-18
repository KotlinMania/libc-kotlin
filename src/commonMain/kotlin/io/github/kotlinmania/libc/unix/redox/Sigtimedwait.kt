package io.github.kotlinmania.libc.unix.redox
import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.unix.Timespec

public expect fun sigtimedwait(set: ULong?, sig: SiginfoT?, timeout: Timespec?): Int
