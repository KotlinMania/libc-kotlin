package io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd
import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.Rtprio

public expect fun rtprioThread(function: Int, lwpid: Int, rtp: Rtprio?): Int
