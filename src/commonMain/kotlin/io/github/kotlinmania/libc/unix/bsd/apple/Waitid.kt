package io.github.kotlinmania.libc.unix.bsd.apple

import io.github.kotlinmania.libc.*

public expect fun waitid(idtype: UInt, id: UInt, infop: SiginfoT?, options: Int): Int
