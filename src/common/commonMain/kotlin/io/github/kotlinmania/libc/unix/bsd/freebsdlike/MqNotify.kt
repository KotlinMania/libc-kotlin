package io.github.kotlinmania.libc.unix.bsd.freebsdlike
import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.Sigevent

public expect fun mqNotify(mqd: Int, notification: Sigevent?): Int
