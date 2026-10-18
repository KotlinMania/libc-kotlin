package io.github.kotlinmania.libc.unix.newlib.horizon

import io.github.kotlinmania.libc.*

public const val SIGEV_NONE: Int = 1

public const val SIGEV_SIGNAL: Int = 2

public const val SIGEV_THREAD: Int = 3

public const val SA_NOCLDSTOP: Int = 1

public const val MINSIGSTKSZ: Int = 2048

public const val SIGSTKSZ: Int = 8192

public const val SS_ONSTACK: Int = 1

public const val SS_DISABLE: Int = 2

public const val SIG_SETMASK: Int = 0

public const val SIG_BLOCK: Int = 1

public const val SIG_UNBLOCK: Int = 2

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

public const val SIGURG: Int = 16

public const val SIGSTOP: Int = 17

public const val SIGTSTP: Int = 18

public const val SIGCONT: Int = 19

public const val SIGCHLD: Int = 20

public const val SIGCLD: Int = 20

public const val SIGTTIN: Int = 21

public const val SIGTTOU: Int = 22

public const val SIGIO: Int = 23

public const val SIGPOLL: Int = 23

public const val SIGXCPU: Int = 24

public const val SIGXFSZ: Int = 25

public const val SIGVTALRM: Int = 26

public const val SIGPROF: Int = 27

public const val SIGWINCH: Int = 28

public const val SIGLOST: Int = 29

public const val SIGUSR1: Int = 30

public const val SIGUSR2: Int = 31

public const val NSIG: Int = 32

public const val CLOCK_ENABLED: UInt = 1u

public const val CLOCK_DISABLED: UInt = 0u

public const val CLOCK_ALLOWED: UInt = 1u

public const val CLOCK_DISALLOWED: UInt = 0u

public const val TIMER_ABSTIME: UInt = 4u

public const val SOL_SOCKET: Int = 65535

public const val MSG_OOB: Int = 1

public const val MSG_PEEK: Int = 2

public const val MSG_DONTWAIT: Int = 4

public const val MSG_DONTROUTE: Int = 0

public const val MSG_WAITALL: Int = 0

public const val MSG_MORE: Int = 0

public const val MSG_NOSIGNAL: Int = 0

public const val SOL_CONFIG: UInt = 65534u

public const val PTHREAD_STACK_MIN: ULong = 4096uL

public const val WNOHANG: Int = 1

public const val POLLIN: Short = 0x0001

public const val POLLPRI: Short = 0x0002

public const val POLLOUT: Short = 0x0004

public const val POLLRDNORM: Short = 0x0040

public const val POLLWRNORM: Short = POLLOUT

public const val POLLRDBAND: Short = 0x0080

public const val POLLWRBAND: Short = 0x0100

public const val POLLERR: Short = 0x0008

public const val POLLHUP: Short = 0x0010

public const val POLLNVAL: Short = 0x0020

public const val EAI_AGAIN: Int = 2

public const val EAI_BADFLAGS: Int = 3

public const val EAI_FAIL: Int = 4

public const val EAI_SERVICE: Int = 9

public const val EAI_SYSTEM: Int = 11

public const val EAI_BADHINTS: Int = 12

public const val EAI_PROTOCOL: Int = 13

public const val EAI_OVERFLOW: Int = 14

public const val EAI_MAX: Int = 15

public const val AF_UNIX: Int = 1

public const val AF_INET6: Int = 23

public const val FIONBIO: ULong = 1uL

public const val SCHED_FIFO: Int = 1

public const val SCHED_RR: Int = 2

public const val GRND_NONBLOCK: UInt = 0x1u

public const val GRND_RANDOM: UInt = 0x2u
