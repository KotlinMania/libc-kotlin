package io.github.kotlinmania.libc.unix.nto
import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.unix.Timespec

public expect fun sigtimedwait(set: SigsetT?, info: SiginfoT?, timeout: Timespec?): Int
