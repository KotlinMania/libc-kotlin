package io.github.kotlinmania.libc.unix.newlib.horizon

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.COpaquePointer
import io.github.kotlinmania.libc.CShort
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.CUlong
import io.github.kotlinmania.libc.unix.SizeT

public val SIGEV_NONE: CInt = 1

public val SIGEV_SIGNAL: CInt = 2

public val SIGEV_THREAD: CInt = 3

public val SA_NOCLDSTOP: CInt = 1

public val MINSIGSTKSZ: CInt = 2048

public val SIGSTKSZ: CInt = 8192

public val SS_ONSTACK: CInt = 1

public val SS_DISABLE: CInt = 2

public val SIG_SETMASK: CInt = 0

public val SIG_BLOCK: CInt = 1

public val SIG_UNBLOCK: CInt = 2

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

public val SIGURG: CInt = 16

public val SIGSTOP: CInt = 17

public val SIGTSTP: CInt = 18

public val SIGCONT: CInt = 19

public val SIGCHLD: CInt = 20

public val SIGCLD: CInt = 20

public val SIGTTIN: CInt = 21

public val SIGTTOU: CInt = 22

public val SIGIO: CInt = 23

public val SIGPOLL: CInt = 23

public val SIGXCPU: CInt = 24

public val SIGXFSZ: CInt = 25

public val SIGVTALRM: CInt = 26

public val SIGPROF: CInt = 27

public val SIGWINCH: CInt = 28

public val SIGLOST: CInt = 29

public val SIGUSR1: CInt = 30

public val SIGUSR2: CInt = 31

public val NSIG: CInt = 32

public val CLOCK_ENABLED: CUint = 1u

public val CLOCK_DISABLED: CUint = 0u

public val CLOCK_ALLOWED: CUint = 1u

public val CLOCK_DISALLOWED: CUint = 0u

public val TIMER_ABSTIME: CUint = 4u

public val SOL_SOCKET: CInt = 65535

public val MSG_OOB: CInt = 1

public val MSG_PEEK: CInt = 2

public val MSG_DONTWAIT: CInt = 4

public val MSG_DONTROUTE: CInt = 0

public val MSG_WAITALL: CInt = 0

public val MSG_MORE: CInt = 0

public val MSG_NOSIGNAL: CInt = 0

public val SOL_CONFIG: CUint = 65534u

public val PTHREAD_STACK_MIN: SizeT = 4096uL

public val WNOHANG: CInt = 1

public val POLLIN: CShort = 0x0001

public val POLLPRI: CShort = 0x0002

public val POLLOUT: CShort = 0x0004

public val POLLRDNORM: CShort = 0x0040

public val POLLWRNORM: CShort = POLLOUT

public val POLLRDBAND: CShort = 0x0080

public val POLLWRBAND: CShort = 0x0100

public val POLLERR: CShort = 0x0008

public val POLLHUP: CShort = 0x0010

public val POLLNVAL: CShort = 0x0020

public val EAI_AGAIN: CInt = 2

public val EAI_BADFLAGS: CInt = 3

public val EAI_FAIL: CInt = 4

public val EAI_SERVICE: CInt = 9

public val EAI_SYSTEM: CInt = 11

public val EAI_BADHINTS: CInt = 12

public val EAI_PROTOCOL: CInt = 13

public val EAI_OVERFLOW: CInt = 14

public val EAI_MAX: CInt = 15

public val AF_UNIX: CInt = 1

public val AF_INET6: CInt = 23

public val FIONBIO: CUlong = 1uL

public val RTLD_DEFAULT: COpaquePointer? = null

// For pthread get/setschedparam
public val SCHED_FIFO: CInt = 1

public val SCHED_RR: CInt = 2

// For getrandom()
public val GRND_NONBLOCK: CUint = 0x1u

public val GRND_RANDOM: CUint = 0x2u
