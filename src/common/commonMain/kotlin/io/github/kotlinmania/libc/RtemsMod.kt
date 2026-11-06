package io.github.kotlinmania.libc

public fun interface PthreadCreateFCallback {
    public operator fun invoke(arg0: COpaquePointer?): COpaquePointer?
}

public val AF_UNIX: CInt = 1

public val RTLD_DEFAULT: COpaquePointer? = COpaquePointer((-2).toLong())

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

public fun futimens(fd: CInt, times: Timespec?): CInt {
    return LibcDynamicFfi.invoke("futimens", -1, longArrayOf(fd.toLong(), times?.value ?: 0L)).toInt()
}

public fun writev(fd: CInt, iov: Iovec?, iovcnt: CInt): SsizeT {
    return LibcDynamicFfi.invoke("writev", -1, longArrayOf(fd.toLong(), iov?.value ?: 0L, iovcnt.toLong()))
}

public fun readv(fd: CInt, iov: Iovec?, iovcnt: CInt): SsizeT {
    return LibcDynamicFfi.invoke("readv", -1, longArrayOf(fd.toLong(), iov?.value ?: 0L, iovcnt.toLong()))
}

public fun pthreadCreate(native: PthreadT?, attr: PthreadAttrT?, f: PthreadCreateFCallback, value: COpaquePointer?): CInt {
    val __scratch_2 = LibcDynamicFfi.allocZeroed(4096)
    try {
        return LibcDynamicFfi.invoke("pthread_create", -1, longArrayOf(native?.value ?: 0L, attr?.value ?: 0L, __scratch_2, value?.value ?: 0L)).toInt()
    } finally {
        if (__scratch_2 != 0L) LibcDynamicFfi.freeMem(__scratch_2)
    }
}

public fun pthreadCondattrSetclock(attr: PthreadCondattrT?, clockId: ClockidT): CInt {
    return LibcDynamicFfi.invoke("pthread_condattr_setclock", -1, longArrayOf(attr?.value ?: 0L, clockId.toLong())).toInt()
}

public fun getentropy(buf: COpaquePointer?, buflen: SizeT): CInt {
    return LibcDynamicFfi.invoke("getentropy", -1, longArrayOf(buf?.value ?: 0L, buflen.toLong())).toInt()
}

public fun arc4randomBuf(buf: COpaquePointer?, nbytes: SizeT) {
    LibcDynamicFfi.invoke("arc4random_buf", -1, longArrayOf(buf?.value ?: 0L, nbytes.toLong()))
}

public fun setgroups(ngroups: CInt, grouplist: GidT?): CInt {
    val __slot_1 = if (grouplist == null) 0L else LibcDynamicFfi.allocScalarSlot(grouplist.toLong())
    try {
        return LibcDynamicFfi.invoke("setgroups", -1, longArrayOf(ngroups.toLong(), __slot_1)).toInt()
    } finally {
        if (__slot_1 != 0L) LibcDynamicFfi.freeMem(__slot_1)
    }
}
