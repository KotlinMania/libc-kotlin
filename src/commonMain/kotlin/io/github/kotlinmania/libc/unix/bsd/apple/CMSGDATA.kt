package io.github.kotlinmania.libc.unix.bsd.apple
import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.unix.bsd.Cmsghdr

public expect fun cmsgData(cmsg: Cmsghdr?): COpaquePointer?
