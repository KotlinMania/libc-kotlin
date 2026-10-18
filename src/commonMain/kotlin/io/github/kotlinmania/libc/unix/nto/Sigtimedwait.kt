package io.github.kotlinmania.libc.unix.nto
import io.github.kotlinmania.libc.unix.Timespec

import io.github.kotlinmania.libc.*

public expect fun sigtimedwait(set: SigsetT?, info: SiginfoT?, timeout: Timespec?): Int
