package io.github.kotlinmania.libc.unix.nto

import io.github.kotlinmania.libc.*

public expect fun waitid(idtype: UInt, id: Int, infop: SiginfoT?, options: Int): Int
