package io.github.kotlinmania.libc.unix.newlib.espidf

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.COpaquePointer
import io.github.kotlinmania.libc.CShort
import io.github.kotlinmania.libc.CUlong
import io.github.kotlinmania.libc.unix.SizeT

public val AF_UNIX: CInt = 1

public val AF_INET6: CInt = 10

public val FIONBIO: CUlong = 2147772030uL

public val POLLIN: CShort = (1 shl 0).toShort()

public val POLLRDNORM: CShort = (1 shl 1).toShort()

public val POLLRDBAND: CShort = (1 shl 2).toShort()

public val POLLPRI: CShort = POLLRDBAND

public val POLLOUT: CShort = (1 shl 3).toShort()

public val POLLWRNORM: CShort = POLLOUT

public val POLLWRBAND: CShort = (1 shl 4).toShort()

public val POLLERR: CShort = (1 shl 5).toShort()

public val POLLHUP: CShort = (1 shl 6).toShort()

public val SOL_SOCKET: CInt = 0xfff

public val MSG_OOB: CInt = 0x04

public val MSG_PEEK: CInt = 0x01

public val MSG_DONTWAIT: CInt = 0x08

public val MSG_DONTROUTE: CInt = 0x4

public val MSG_WAITALL: CInt = 0x02

public val MSG_MORE: CInt = 0x10

public val MSG_NOSIGNAL: CInt = 0x20

public val MSG_TRUNC: CInt = 0x04

public val MSG_CTRUNC: CInt = 0x08

public val MSG_EOR: CInt = 0x08

public val PTHREAD_STACK_MIN: SizeT = 768uL

public val SIGABRT: CInt = 6

public val SIGFPE: CInt = 8

public val SIGILL: CInt = 4

public val SIGINT: CInt = 2

public val SIGSEGV: CInt = 11

public val SIGTERM: CInt = 15

public val SIGHUP: CInt = 1

public val SIGQUIT: CInt = 3

public val NSIG: SizeT = 32uL
