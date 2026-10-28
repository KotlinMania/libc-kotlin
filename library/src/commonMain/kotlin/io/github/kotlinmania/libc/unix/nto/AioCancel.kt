package io.github.kotlinmania.libc.unix.nto

import io.github.kotlinmania.libc.*

public expect fun aioCancel(fd: Int, aiocbp: Aiocb?): Int
