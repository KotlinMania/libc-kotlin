package io.github.kotlinmania.libc.unix.nuttx

import io.github.kotlinmania.libc.*

public expect fun bind(sockfd: Int, addr: Sockaddr?, addrlen: UInt): Int
