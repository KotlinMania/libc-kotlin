package io.github.kotlinmania.libc.unix.newlib.rtems

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CLong
import io.github.kotlinmania.libc.CUlong
import io.github.kotlinmania.libc.unix.SizeT
import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.MutPtr

public val AF_UNIX: CInt = 1

public val RTLD_DEFAULT: MutPtr<CVoid> = MutPtr<CVoid>((-2).toLong())

public val UTIME_OMIT: CLong = -1L

public val AT_FDCWD: CInt = -2

public val O_DIRECTORY: CInt = 0x200000

public val O_NOFOLLOW: CInt = 0x100000

public val AT_EACCESS: CInt = 1

public val AT_SYMLINK_NOFOLLOW: CInt = 2

public val AT_SYMLINK_FOLLOW: CInt = 4

public val AT_REMOVEDIR: CInt = 8

// signal.h
public val SIG_BLOCK: CInt = 1

public val SIG_UNBLOCK: CInt = 2

public val SIG_SETMASK: CInt = 0

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

public val SIGWINCH: CInt = 24

public val SIGUSR1: CInt = 25

public val SIGUSR2: CInt = 26

public val SIGRTMIN: CInt = 27

public val SIGRTMAX: CInt = 31

public val SIGXCPU: CInt = 24

public val SIGXFSZ: CInt = 25

public val SIGVTALRM: CInt = 26

public val SIGPROF: CInt = 27

public val SA_NOCLDSTOP: CUlong = 0x00000001uL

public val SA_SIGINFO: CUlong = 0x00000002uL

public val SA_ONSTACK: CUlong = 0x00000004uL

public val EAI_AGAIN: CInt = 2

public val EAI_BADFLAGS: CInt = 3

public val EAI_FAIL: CInt = 4

public val EAI_SERVICE: CInt = 9

public val EAI_SYSTEM: CInt = 11

public val EAI_OVERFLOW: CInt = 14

public val PTHREAD_STACK_MIN: SizeT = 0uL

// sys/wait.h
public val WNOHANG: CInt = 1

public val WUNTRACED: CInt = 2

// sys/socket.h
public val SOMAXCONN: CInt = 128
