package io.github.kotlinmania.libc.unix.haiku

import io.github.kotlinmania.libc.*

public expect fun cmsgData(cmsg: Cmsghdr?): COpaquePointer?
