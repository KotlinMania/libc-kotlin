package io.github.kotlinmania.libc.unix.newlib.arm

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CShort
import io.github.kotlinmania.libc.CUlong

public val AF_INET6: CInt = 23

public val FIONBIO: CUlong = 1uL

public val POLLIN: CShort = 0x1

public val POLLPRI: CShort = 0x2

public val POLLHUP: CShort = 0x4

public val POLLERR: CShort = 0x8

public val POLLOUT: CShort = 0x10

public val POLLNVAL: CShort = 0x20

public val SOL_SOCKET: CInt = 65535

public val MSG_OOB: CInt = 1

public val MSG_PEEK: CInt = 2

public val MSG_DONTWAIT: CInt = 4

public val MSG_DONTROUTE: CInt = 0

public val MSG_WAITALL: CInt = 0

public val MSG_MORE: CInt = 0

public val MSG_NOSIGNAL: CInt = 0
