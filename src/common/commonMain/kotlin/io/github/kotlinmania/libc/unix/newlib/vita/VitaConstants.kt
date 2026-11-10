package io.github.kotlinmania.libc.unix.newlib.vita

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CLong
import io.github.kotlinmania.libc.COpaquePointer
import io.github.kotlinmania.libc.CShort
import io.github.kotlinmania.libc.CUlong
import io.github.kotlinmania.libc.unix.SizeT

public val AF_UNIX: CInt = 1

public val AF_INET6: CInt = 24

public val SOCK_RAW: CInt = 3

public val SOCK_RDM: CInt = 4

public val SOCK_SEQPACKET: CInt = 5

public val SOMAXCONN: CInt = 128

public val FIONBIO: CUlong = 1uL

public val POLLIN: CShort = 0x0001

public val POLLPRI: CShort = POLLIN

public val POLLOUT: CShort = 0x0004

public val POLLRDNORM: CShort = POLLIN

public val POLLRDBAND: CShort = POLLIN

public val POLLWRNORM: CShort = POLLOUT

public val POLLWRBAND: CShort = POLLOUT

public val POLLERR: CShort = 0x0008

public val POLLHUP: CShort = 0x0010

public val POLLNVAL: CShort = 0x0020

public val SOL_SOCKET: CInt = 0xffff

public val SO_NONBLOCK: CInt = 0x1100

public val MSG_OOB: CInt = 0x1

public val MSG_PEEK: CInt = 0x2

public val MSG_DONTROUTE: CInt = 0x4

public val MSG_EOR: CInt = 0x8

public val MSG_TRUNC: CInt = 0x10

public val MSG_CTRUNC: CInt = 0x20

public val MSG_WAITALL: CInt = 0x40

public val MSG_DONTWAIT: CInt = 0x80

public val MSG_BCAST: CInt = 0x100

public val MSG_MCAST: CInt = 0x200

public val UTIME_OMIT: CLong = -1L

public val AT_FDCWD: CInt = -2

public val O_DIRECTORY: CInt = 0x200000

public val O_NOFOLLOW: CInt = 0x100000

public val AT_EACCESS: CInt = 1

public val AT_SYMLINK_NOFOLLOW: CInt = 2

public val AT_SYMLINK_FOLLOW: CInt = 4

public val AT_REMOVEDIR: CInt = 8

public val SIGHUP: CInt = 1

public val SIGINT: CInt = 2

public val SIGQUIT: CInt = 3

public val SIGILL: CInt = 4

public val SIGTRAP: CInt = 5

public val SIGABRT: CInt = 6

public val SIGEMT: CInt = 7

public val SIGFPE: CInt = 8

public val SIGKILL: CInt = 9

public val SIGBUS: CInt = 10

public val SIGSEGV: CInt = 11

public val SIGSYS: CInt = 12

public val SIGPIPE: CInt = 13

public val SIGALRM: CInt = 14

public val SIGTERM: CInt = 15

public val EAI_BADFLAGS: CInt = -1

public val EAI_NONAME: CInt = -2

public val EAI_AGAIN: CInt = -3

public val EAI_FAIL: CInt = -4

public val EAI_NODATA: CInt = -5

public val EAI_FAMILY: CInt = -6

public val EAI_SOCKTYPE: CInt = -7

public val EAI_SERVICE: CInt = -8

public val EAI_ADDRFAMILY: CInt = -9

public val EAI_MEMORY: CInt = -10

public val EAI_SYSTEM: CInt = -11

public val EAI_OVERFLOW: CInt = -12

public val PTHREAD_STACK_MIN: SizeT = 32uL * 1024uL

public val IP_HDRINCL: CInt = 2

public val RTLD_DEFAULT: COpaquePointer? = null
