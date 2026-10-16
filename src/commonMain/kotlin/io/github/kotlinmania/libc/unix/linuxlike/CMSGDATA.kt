package io.github.kotlinmania.libc.unix.linuxlike

import io.github.kotlinmania.libc.*

public expect fun cmsgData(cmsg: Cmsghdr?): COpaquePointer?
