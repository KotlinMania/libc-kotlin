package io.github.kotlinmania.libc.unix.solarish

import io.github.kotlinmania.libc.*

public expect fun lioListio(mode: Int, aiocbList: COpaquePointer?, nitems: Int, sevp: Sigevent?): Int
