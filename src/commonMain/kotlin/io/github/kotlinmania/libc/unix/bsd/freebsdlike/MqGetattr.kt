package io.github.kotlinmania.libc.unix.bsd.freebsdlike
import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.MqAttr

public expect fun mqGetattr(mqd: Int, attr: MqAttr?): Int
