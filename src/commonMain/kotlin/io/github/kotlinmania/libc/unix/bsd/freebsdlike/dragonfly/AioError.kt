package io.github.kotlinmania.libc.unix.bsd.freebsdlike.dragonfly

import io.github.kotlinmania.libc.*

public expect fun aioError(aiocbp: Aiocb?): Int
