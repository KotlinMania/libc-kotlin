package io.github.kotlinmania.libc.unix.linuxlike.emscripten
import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.unix.Timespec
import io.github.kotlinmania.libc.unix.linuxlike.Mmsghdr

public expect fun recvmmsg(sockfd: Int, msgvec: Mmsghdr?, vlen: UInt, flags: UInt, timeout: Timespec?): Int
