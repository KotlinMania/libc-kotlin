// port-lint: source unix/newlib/rtems/mod.rs
package io.github.kotlinmania.libc.unix.newlib.rtems

import io.github.kotlinmania.libc.*

public const val AF_UNIX: Int = 1

public const val UTIME_OMIT: Long = -1

public const val AT_FDCWD: Int = -2

public const val O_DIRECTORY: Int = 0x200000

public const val O_NOFOLLOW: Int = 0x100000

public const val AT_EACCESS: Int = 1

public const val AT_SYMLINK_NOFOLLOW: Int = 2

public const val AT_SYMLINK_FOLLOW: Int = 4

public const val AT_REMOVEDIR: Int = 8

public const val SIG_BLOCK: Int = 1

public const val SIG_UNBLOCK: Int = 2

public const val SIG_SETMASK: Int = 0

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

public const val SIGWINCH: Int = 24

public const val SIGUSR1: Int = 25

public const val SIGUSR2: Int = 26

public const val SIGRTMIN: Int = 27

public const val SIGRTMAX: Int = 31

public const val SIGXCPU: Int = 24

public const val SIGXFSZ: Int = 25

public const val SIGVTALRM: Int = 26

public const val SIGPROF: Int = 27

public const val SA_NOCLDSTOP: ULong = 0x00000001uL

public const val SA_SIGINFO: ULong = 0x00000002uL

public const val SA_ONSTACK: ULong = 0x00000004uL

public const val EAI_AGAIN: Int = 2

public const val EAI_BADFLAGS: Int = 3

public const val EAI_FAIL: Int = 4

public const val EAI_SERVICE: Int = 9

public const val EAI_SYSTEM: Int = 11

public const val EAI_OVERFLOW: Int = 14

public const val PTHREAD_STACK_MIN: ULong = 0uL

public const val WNOHANG: Int = 1

public const val WUNTRACED: Int = 2

public const val SOMAXCONN: Int = 128
