package io.github.kotlinmania.libc.unix.bsd.netbsdlike
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.SiginfoT

import io.github.kotlinmania.libc.*

public expect fun waitid(idtype: Int, id: UInt, infop: SiginfoT?, options: Int): Int
