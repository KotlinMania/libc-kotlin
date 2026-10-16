package io.github.kotlinmania.libc.unix.aix

import io.github.kotlinmania.libc.*

public expect fun mqNotify(mqd: Int, notification: Sigevent?): Int
