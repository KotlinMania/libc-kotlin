package io.github.kotlinmania.libc.unix.nto

import io.github.kotlinmania.libc.*

public expect fun mqNotify(mqdes: Int, notification: Sigevent?): Int
