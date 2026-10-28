package io.github.kotlinmania.libc.unix.bsd.apple

import io.github.kotlinmania.libc.*

public expect fun aioFsync(op: Int, aiocbp: Aiocb?): Int
