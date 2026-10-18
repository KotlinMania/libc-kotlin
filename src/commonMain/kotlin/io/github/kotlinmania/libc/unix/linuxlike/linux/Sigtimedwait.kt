package io.github.kotlinmania.libc.unix.linuxlike.linux
import io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.b64.SiginfoT
import io.github.kotlinmania.libc.unix.Timespec

import io.github.kotlinmania.libc.*

public expect fun sigtimedwait(set: ULong?, info: SiginfoT?, timeout: Timespec?): Int
