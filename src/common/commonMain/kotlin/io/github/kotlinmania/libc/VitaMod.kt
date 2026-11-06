package io.github.kotlinmania.libc

public fun interface PthreadCreateFCallback {
    public operator fun invoke(arg0: COpaquePointer?): COpaquePointer?
}

public typealias ClockT = CLong

public typealias WcharT = UInt

public typealias SigsetT = CUlong

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

public val RTLD_DEFAULT: COpaquePointer? = null

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

public fun futimens(fd: CInt, times: Timespec?): CInt {
    return LibcDynamicFfi.invoke("futimens", -1, longArrayOf(fd.toLong(), times?.value ?: 0L)).toInt()
}

public fun writev(fd: CInt, iov: Iovec?, iovcnt: CInt): SsizeT {
    return LibcDynamicFfi.invoke("writev", -1, longArrayOf(fd.toLong(), iov?.value ?: 0L, iovcnt.toLong()))
}

public fun readv(fd: CInt, iov: Iovec?, iovcnt: CInt): SsizeT {
    return LibcDynamicFfi.invoke("readv", -1, longArrayOf(fd.toLong(), iov?.value ?: 0L, iovcnt.toLong()))
}

public fun sendmsg(s: CInt, msg: Msghdr?, flags: CInt): SsizeT {
    return LibcDynamicFfi.invoke("sendmsg", -1, longArrayOf(s.toLong(), msg?.value ?: 0L, flags.toLong()))
}

public fun recvmsg(s: CInt, msg: Msghdr?, flags: CInt): SsizeT {
    return LibcDynamicFfi.invoke("recvmsg", -1, longArrayOf(s.toLong(), msg?.value ?: 0L, flags.toLong()))
}

public fun pthreadCreate(native: PthreadT?, attr: PthreadAttrT?, f: PthreadCreateFCallback, value: COpaquePointer?): CInt {
    val __scratch_2 = LibcDynamicFfi.allocZeroed(4096)
    try {
        return LibcDynamicFfi.invoke("pthread_create", -1, longArrayOf(native?.value ?: 0L, attr?.value ?: 0L, __scratch_2, value?.value ?: 0L)).toInt()
    } finally {
        if (__scratch_2 != 0L) LibcDynamicFfi.freeMem(__scratch_2)
    }
}

public fun pthreadAttrGetschedparam(attr: PthreadAttrT?, param: SchedParam?): CInt {
    return LibcDynamicFfi.invoke("pthread_attr_getschedparam", -1, longArrayOf(attr?.value ?: 0L, param?.value ?: 0L)).toInt()
}

public fun pthreadAttrSetschedparam(attr: PthreadAttrT?, param: SchedParam?): CInt {
    return LibcDynamicFfi.invoke("pthread_attr_setschedparam", -1, longArrayOf(attr?.value ?: 0L, param?.value ?: 0L)).toInt()
}

public fun pthreadAttrGetprocessoridNp(attr: PthreadAttrT?, processorId: CInt?): CInt {
    val __slot_1 = if (processorId == null) 0L else LibcDynamicFfi.allocScalarSlot(processorId.toLong())
    try {
        return LibcDynamicFfi.invoke("pthread_attr_getprocessorid_np", -1, longArrayOf(attr?.value ?: 0L, __slot_1)).toInt()
    } finally {
        if (__slot_1 != 0L) LibcDynamicFfi.freeMem(__slot_1)
    }
}

public fun pthreadAttrSetprocessoridNp(attr: PthreadAttrT?, processorId: CInt): CInt {
    return LibcDynamicFfi.invoke("pthread_attr_setprocessorid_np", -1, longArrayOf(attr?.value ?: 0L, processorId.toLong())).toInt()
}

public fun pthreadGetschedparam(native: PthreadT, policy: CInt?, param: SchedParam?): CInt {
    val __scratch_0 = LibcDynamicFfi.allocZeroed(4096)
    val __slot_1 = if (policy == null) 0L else LibcDynamicFfi.allocScalarSlot(policy.toLong())
    try {
        return LibcDynamicFfi.invoke("pthread_getschedparam", -1, longArrayOf(__scratch_0, __slot_1, param?.value ?: 0L)).toInt()
    } finally {
        if (__scratch_0 != 0L) LibcDynamicFfi.freeMem(__scratch_0)
        if (__slot_1 != 0L) LibcDynamicFfi.freeMem(__slot_1)
    }
}

public fun pthreadSetschedparam(native: PthreadT, policy: CInt, param: SchedParam?): CInt {
    val __scratch_0 = LibcDynamicFfi.allocZeroed(4096)
    try {
        return LibcDynamicFfi.invoke("pthread_setschedparam", -1, longArrayOf(__scratch_0, policy.toLong(), param?.value ?: 0L)).toInt()
    } finally {
        if (__scratch_0 != 0L) LibcDynamicFfi.freeMem(__scratch_0)
    }
}

public fun pthreadCondattrGetclock(attr: PthreadCondattrT?, clockId: ClockidT?): CInt {
    val __slot_1 = if (clockId == null) 0L else LibcDynamicFfi.allocScalarSlot(clockId.toLong())
    try {
        return LibcDynamicFfi.invoke("pthread_condattr_getclock", -1, longArrayOf(attr?.value ?: 0L, __slot_1)).toInt()
    } finally {
        if (__slot_1 != 0L) LibcDynamicFfi.freeMem(__slot_1)
    }
}

public fun pthreadCondattrSetclock(attr: PthreadCondattrT?, clockId: ClockidT): CInt {
    return LibcDynamicFfi.invoke("pthread_condattr_setclock", -1, longArrayOf(attr?.value ?: 0L, clockId.toLong())).toInt()
}

public fun pthreadGetprocessoridNp(): CInt {
    return LibcDynamicFfi.invoke("pthread_getprocessorid_np", -1, longArrayOf()).toInt()
}

public fun getentropy(buf: COpaquePointer?, buflen: SizeT): CInt {
    return LibcDynamicFfi.invoke("getentropy", -1, longArrayOf(buf?.value ?: 0L, buflen.toLong())).toInt()
}

public fun pipe2(fds: CInt?, flags: CInt): CInt {
    val __slot_0 = if (fds == null) 0L else LibcDynamicFfi.allocScalarSlot(fds.toLong())
    try {
        return LibcDynamicFfi.invoke("pipe2", -1, longArrayOf(__slot_0, flags.toLong())).toInt()
    } finally {
        if (__slot_0 != 0L) LibcDynamicFfi.freeMem(__slot_0)
    }
}
