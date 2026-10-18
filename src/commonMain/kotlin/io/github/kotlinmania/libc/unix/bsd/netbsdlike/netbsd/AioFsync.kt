package io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd

import io.github.kotlinmania.libc.*

public expect fun aioFsync(op: Int, aiocbp: Aiocb?): Int
