package io.github.kotlinmania.libc.unix.linuxlike

import io.github.kotlinmania.libc.*

public expect fun waitid(idtype: Int, id: UInt, infop: SiginfoT?, options: Int): Int
