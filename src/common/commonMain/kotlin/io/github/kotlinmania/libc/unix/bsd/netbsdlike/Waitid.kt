package io.github.kotlinmania.libc.unix.bsd.netbsdlike
import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.SiginfoT

public expect fun waitid(idtype: Int, id: UInt, infop: SiginfoT?, options: Int): Int
