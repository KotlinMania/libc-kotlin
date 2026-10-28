package io.github.kotlinmania.libc.unix.hurd

import io.github.kotlinmania.libc.*

public expect fun sigwaitinfo(set: ULong?, info: SiginfoT?): Int
