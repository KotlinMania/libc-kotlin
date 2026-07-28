// port-lint: source unix/newlib/rtems/mod.rs
package io.github.kotlinmania.libc.unix.newlib.rtems

import io.github.kotlinmania.libc.*

public data class SockaddrUn(
    val sunFamily: SaFamilyT,
    val sunPath: ByteArray,
)

public const val AF_UNIX: CInt = 1
public const val UTIME_OMIT: CLong = -1
public const val AT_FDCWD: CInt = -2
public const val O_DIRECTORY: CInt = 0x200000
public const val O_NOFOLLOW: CInt = 0x100000
public const val AT_EACCESS: CInt = 1
public const val AT_SYMLINK_NOFOLLOW: CInt = 2
public const val AT_SYMLINK_FOLLOW: CInt = 4
public const val AT_REMOVEDIR: CInt = 8
public const val SIG_BLOCK: CInt = 1
public const val SIG_UNBLOCK: CInt = 2
public const val SIG_SETMASK: CInt = 0
public const val SIGHUP: CInt = 1
public const val SIGINT: CInt = 2
public const val SIGQUIT: CInt = 3
public const val SIGILL: CInt = 4
public const val SIGTRAP: CInt = 5
public const val SIGABRT: CInt = 6
public const val SIGEMT: CInt = 7
public const val SIGFPE: CInt = 8
public const val SIGKILL: CInt = 9
public const val SIGBUS: CInt = 10
public const val SIGSEGV: CInt = 11
public const val SIGSYS: CInt = 12
public const val SIGPIPE: CInt = 13
public const val SIGALRM: CInt = 14
public const val SIGTERM: CInt = 15
public const val SIGURG: CInt = 16
public const val SIGSTOP: CInt = 17
public const val SIGTSTP: CInt = 18
public const val SIGCONT: CInt = 19
public const val SIGCHLD: CInt = 20
public const val SIGCLD: CInt = 20
public const val SIGTTIN: CInt = 21
public const val SIGTTOU: CInt = 22
public const val SIGIO: CInt = 23
public const val SIGWINCH: CInt = 24
public const val SIGUSR1: CInt = 25
public const val SIGUSR2: CInt = 26
public const val SIGRTMIN: CInt = 27
public const val SIGRTMAX: CInt = 31
public const val SIGXCPU: CInt = 24
public const val SIGXFSZ: CInt = 25
public const val SIGVTALRM: CInt = 26
public const val SIGPROF: CInt = 27
public const val SA_NOCLDSTOP: CULong = 0x00000001uL
public const val SA_SIGINFO: CULong = 0x00000002uL
public const val SA_ONSTACK: CULong = 0x00000004uL
public const val EAI_AGAIN: CInt = 2
public const val EAI_BADFLAGS: CInt = 3
public const val EAI_FAIL: CInt = 4
public const val EAI_SERVICE: CInt = 9
public const val EAI_SYSTEM: CInt = 11
public const val EAI_OVERFLOW: CInt = 14
public const val PTHREAD_STACK_MIN: ULong = 0uL
public const val WNOHANG: CInt = 1
public const val WUNTRACED: CInt = 2
public const val SOMAXCONN: CInt = 128

public expect fun futimens(fd: CInt, times: Timespec?): CInt

public expect fun writev(fd: CInt, iov: Iovec?, iovcnt: CInt): SsizeT

public expect fun readv(fd: CInt, iov: Iovec?, iovcnt: CInt): SsizeT

public expect fun pthreadCreate(native: PthreadT?, attr: PthreadAttrT?, f: ((COpaquePointer?) -> COpaquePointer?)?, value: COpaquePointer?): CInt

public expect fun pthreadCondattrSetclock(attr: PthreadCondattrT?, clockId: ClockidT): CInt

public expect fun getentropy(buf: COpaquePointer?, buflen: ULong): CInt

public expect fun arc4randomBuf(buf: COpaquePointer?, nbytes: ULong)

public expect fun setgroups(ngroups: CInt, grouplist: GidT?): CInt
