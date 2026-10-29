package io.github.kotlinmania.libc.unix.newlib.espidf

import io.github.kotlinmania.libc.*

public const val AF_UNIX: Int = 1

public const val AF_INET6: Int = 10

public const val FIONBIO: ULong = 2147772030uL

public val POLLIN: Short = (1 shl 0).toShort()

public val POLLRDNORM: Short = (1 shl 1).toShort()

public val POLLRDBAND: Short = (1 shl 2).toShort()

public val POLLPRI: Short = POLLRDBAND

public val POLLOUT: Short = (1 shl 3).toShort()

public val POLLWRNORM: Short = POLLOUT

public val POLLWRBAND: Short = (1 shl 4).toShort()

public val POLLERR: Short = (1 shl 5).toShort()

public val POLLHUP: Short = (1 shl 6).toShort()

public const val SOL_SOCKET: Int = 0xfff

public const val MSG_OOB: Int = 0x04

public const val MSG_PEEK: Int = 0x01

public const val MSG_DONTWAIT: Int = 0x08

public const val MSG_DONTROUTE: Int = 0x4

public const val MSG_WAITALL: Int = 0x02

public const val MSG_MORE: Int = 0x10

public const val MSG_NOSIGNAL: Int = 0x20

public const val MSG_TRUNC: Int = 0x04

public const val MSG_CTRUNC: Int = 0x08

public const val MSG_EOR: Int = 0x08

public const val PTHREAD_STACK_MIN: ULong = 768uL

public const val SIGABRT: Int = 6

public const val SIGFPE: Int = 8

public const val SIGILL: Int = 4

public const val SIGINT: Int = 2

public const val SIGSEGV: Int = 11

public const val SIGTERM: Int = 15

public const val SIGHUP: Int = 1

public const val SIGQUIT: Int = 3

public const val NSIG: ULong = 32uL
