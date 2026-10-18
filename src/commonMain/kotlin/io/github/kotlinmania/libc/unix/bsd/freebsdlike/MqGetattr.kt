package io.github.kotlinmania.libc.unix.bsd.freebsdlike
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.MqAttr

import io.github.kotlinmania.libc.*

public expect fun mqGetattr(mqd: Int, attr: MqAttr?): Int
