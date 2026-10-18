package io.github.kotlinmania.libc.unix.linuxlike
import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.b64.SiginfoT

public expect fun waitid(idtype: Int, id: UInt, infop: SiginfoT?, options: Int): Int
