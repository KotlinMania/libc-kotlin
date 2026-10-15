package io.github.kotlinmania.libc.unix.haiku

import io.github.kotlinmania.libc.*

public expect fun waitid(idtype: Int, id: Int, infop: SiginfoT?, options: Int): Int
