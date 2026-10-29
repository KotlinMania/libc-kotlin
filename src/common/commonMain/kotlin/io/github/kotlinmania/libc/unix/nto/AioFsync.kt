package io.github.kotlinmania.libc.unix.nto

import io.github.kotlinmania.libc.*

public expect fun aioFsync(operation: Int, aiocbp: Aiocb?): Int
