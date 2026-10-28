package io.github.kotlinmania.libc.unix.bsd.freebsdlike

import io.github.kotlinmania.libc.*

public expect fun rtprio(function: Int, pid: Int, rtp: Rtprio?): Int
