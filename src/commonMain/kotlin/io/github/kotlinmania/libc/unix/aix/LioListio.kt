package io.github.kotlinmania.libc.unix.aix

import io.github.kotlinmania.libc.*

public expect fun lioListio(mode: Int, aiocbList: COpaquePointer?, nent: Int, sevp: Sigevent?): Int
