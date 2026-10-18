package io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd
import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.unix.Timespec

public expect fun sigtimedwait(set: SigsetT?, info: SiginfoT?, timeout: Timespec?): Int
