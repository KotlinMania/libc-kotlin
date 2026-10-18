package io.github.kotlinmania.libc.unix.bsd.freebsdlike.dragonfly

import io.github.kotlinmania.libc.*

public expect fun lwpRtprio(function: Int, pid: Int, lwpid: Int, rtp: Rtprio?): Int
