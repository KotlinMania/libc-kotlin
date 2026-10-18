package io.github.kotlinmania.libc.unix.bsd.freebsdlike
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.Sigevent

import io.github.kotlinmania.libc.*

public expect fun mqNotify(mqd: Int, notification: Sigevent?): Int
