package io.github.kotlinmania.libc.unix.solarish
import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.unix.Timespec

public expect fun portGet(port: Int, pe: PortEvent?, timeout: Timespec?): Int
