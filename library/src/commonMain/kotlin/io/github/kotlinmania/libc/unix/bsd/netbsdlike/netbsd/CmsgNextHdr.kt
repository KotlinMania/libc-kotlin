package io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd
import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.unix.bsd.Cmsghdr
import io.github.kotlinmania.libc.unix.bsd.Msghdr

public expect fun cmsgNextHdr(mhdr: Msghdr?, cmsg: Cmsghdr?): Cmsghdr?
