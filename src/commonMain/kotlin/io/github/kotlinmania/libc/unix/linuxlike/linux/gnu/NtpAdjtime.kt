package io.github.kotlinmania.libc.unix.linuxlike.linux.gnu
import io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.b64.Timex

import io.github.kotlinmania.libc.*

public expect fun ntpAdjtime(buf: Timex?): Int
