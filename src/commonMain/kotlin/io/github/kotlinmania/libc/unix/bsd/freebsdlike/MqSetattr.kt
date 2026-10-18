package io.github.kotlinmania.libc.unix.bsd.freebsdlike
import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.MqAttr

public expect fun mqSetattr(mqd: Int, newattr: MqAttr?, oldattr: MqAttr?): Int
