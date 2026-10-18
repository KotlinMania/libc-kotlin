package io.github.kotlinmania.libc.unix.linuxlike.linux.gnu
import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.b64.Timex

public expect fun clockAdjtime(clkId: Int, buf: Timex?): Int
