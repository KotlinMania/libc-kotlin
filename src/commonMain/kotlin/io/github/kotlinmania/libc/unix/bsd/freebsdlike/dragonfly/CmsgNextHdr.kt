package io.github.kotlinmania.libc.unix.bsd.freebsdlike.dragonfly
import io.github.kotlinmania.libc.unix.bsd.Cmsghdr
import io.github.kotlinmania.libc.unix.bsd.Msghdr

import io.github.kotlinmania.libc.*

public expect fun cmsgNextHdr(mhdr: Msghdr?, cmsg: Cmsghdr?): Cmsghdr?
