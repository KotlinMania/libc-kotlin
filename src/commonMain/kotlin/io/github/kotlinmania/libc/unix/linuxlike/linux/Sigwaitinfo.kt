package io.github.kotlinmania.libc.unix.linuxlike.linux
import io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.b64.SiginfoT

import io.github.kotlinmania.libc.*

public expect fun sigwaitinfo(set: ULong?, info: SiginfoT?): Int
