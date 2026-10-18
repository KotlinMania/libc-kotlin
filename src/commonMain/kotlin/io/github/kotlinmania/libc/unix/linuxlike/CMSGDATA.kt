package io.github.kotlinmania.libc.unix.linuxlike
import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.Cmsghdr

public expect fun cmsgData(cmsg: Cmsghdr?): COpaquePointer?
