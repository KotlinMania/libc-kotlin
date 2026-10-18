package io.github.kotlinmania.libc.unix.bsd.freebsdlike.dragonfly
import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.Rtprio

public expect fun lwpRtprio(function: Int, pid: Int, lwpid: Int, rtp: Rtprio?): Int
