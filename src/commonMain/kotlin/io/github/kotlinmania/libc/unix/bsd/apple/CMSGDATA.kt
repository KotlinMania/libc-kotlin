package io.github.kotlinmania.libc.unix.bsd.apple
import io.github.kotlinmania.libc.unix.bsd.Cmsghdr

import io.github.kotlinmania.libc.*

public expect fun cmsgData(cmsg: Cmsghdr?): COpaquePointer?
