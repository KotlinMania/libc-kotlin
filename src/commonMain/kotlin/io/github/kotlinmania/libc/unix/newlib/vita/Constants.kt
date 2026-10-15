// port-lint: source unix/newlib/vita/mod.rs
package io.github.kotlinmania.libc.unix.newlib.vita

import io.github.kotlinmania.libc.*

public const val AF_UNIX: Int = 1

public const val AF_INET6: Int = 24

public const val SOCK_RAW: Int = 3

public const val SOCK_RDM: Int = 4

public const val SOCK_SEQPACKET: Int = 5

public const val SOMAXCONN: Int = 128

public const val FIONBIO: ULong = 1uL

public const val POLLIN: Short = 0x0001

public const val POLLPRI: Short = POLLIN

public const val POLLOUT: Short = 0x0004

public const val POLLRDNORM: Short = POLLIN

public const val POLLRDBAND: Short = POLLIN

public const val POLLWRNORM: Short = POLLOUT

public const val POLLWRBAND: Short = POLLOUT

public const val POLLERR: Short = 0x0008

public const val POLLHUP: Short = 0x0010

public const val POLLNVAL: Short = 0x0020

public const val SOL_SOCKET: Int = 0xffff

public const val SO_NONBLOCK: Int = 0x1100

public const val MSG_OOB: Int = 0x1

public const val MSG_PEEK: Int = 0x2

public const val MSG_DONTROUTE: Int = 0x4

public const val MSG_EOR: Int = 0x8

public const val MSG_TRUNC: Int = 0x10

public const val MSG_CTRUNC: Int = 0x20

public const val MSG_WAITALL: Int = 0x40

public const val MSG_DONTWAIT: Int = 0x80

public const val MSG_BCAST: Int = 0x100

public const val MSG_MCAST: Int = 0x200

public const val UTIME_OMIT: Long = -1

public const val AT_FDCWD: Int = -2

public const val O_DIRECTORY: Int = 0x200000

public const val O_NOFOLLOW: Int = 0x100000

public const val AT_EACCESS: Int = 1

public const val AT_SYMLINK_NOFOLLOW: Int = 2

public const val AT_SYMLINK_FOLLOW: Int = 4

public const val AT_REMOVEDIR: Int = 8

public const val SIGHUP: Int = 1

public const val SIGINT: Int = 2

public const val SIGQUIT: Int = 3

public const val SIGILL: Int = 4

public const val SIGTRAP: Int = 5

public const val SIGABRT: Int = 6

public const val SIGEMT: Int = 7

public const val SIGFPE: Int = 8

public const val SIGKILL: Int = 9

public const val SIGBUS: Int = 10

public const val SIGSEGV: Int = 11

public const val SIGSYS: Int = 12

public const val SIGPIPE: Int = 13

public const val SIGALRM: Int = 14

public const val SIGTERM: Int = 15

public const val EAI_BADFLAGS: Int = -1

public const val EAI_NONAME: Int = -2

public const val EAI_AGAIN: Int = -3

public const val EAI_FAIL: Int = -4

public const val EAI_NODATA: Int = -5

public const val EAI_FAMILY: Int = -6

public const val EAI_SOCKTYPE: Int = -7

public const val EAI_SERVICE: Int = -8

public const val EAI_ADDRFAMILY: Int = -9

public const val EAI_MEMORY: Int = -10

public const val EAI_SYSTEM: Int = -11

public const val EAI_OVERFLOW: Int = -12

public val PTHREAD_STACK_MIN: ULong = 32uL * 1024uL

public const val IP_HDRINCL: Int = 2
