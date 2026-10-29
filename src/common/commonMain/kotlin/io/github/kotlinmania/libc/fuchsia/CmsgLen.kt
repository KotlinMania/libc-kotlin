package io.github.kotlinmania.libc.fuchsia

import io.github.kotlinmania.libc.*

internal fun cmsgLen(cmsg: Cmsghdr): Long = alignedMessageLength(cmsg)
