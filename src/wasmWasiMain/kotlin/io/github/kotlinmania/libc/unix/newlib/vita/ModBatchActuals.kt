// port-lint: source Mod.rs
package io.github.kotlinmania.libc.unix.newlib.vita

import io.github.kotlinmania.libc.*

public actual fun futimens(fd: CInt, times: Timespec?): CInt =
    throw UnsupportedOperationException("futimens not available on WASI — no C library access")

public actual fun writev(fd: CInt, iov: Iovec?, iovcnt: CInt): SsizeT =
    throw UnsupportedOperationException("writev not available on WASI — no C library access")

public actual fun readv(fd: CInt, iov: Iovec?, iovcnt: CInt): SsizeT =
    throw UnsupportedOperationException("readv not available on WASI — no C library access")

public actual fun sendmsg(s: CInt, msg: Msghdr?, flags: CInt): SsizeT =
    throw UnsupportedOperationException("sendmsg not available on WASI — no C library access")

public actual fun recvmsg(s: CInt, msg: Msghdr?, flags: CInt): SsizeT =
    throw UnsupportedOperationException("recvmsg not available on WASI — no C library access")

public actual fun pthreadAttrGetschedparam(attr: PthreadAttrT, param: SchedParam?): CInt =
    throw UnsupportedOperationException("pthreadAttrGetschedparam not available on WASI — no C library access")

public actual fun pthreadAttrSetschedparam(attr: PthreadAttrT, param: SchedParam?): CInt =
    throw UnsupportedOperationException("pthreadAttrSetschedparam not available on WASI — no C library access")

public actual fun pthreadAttrGetprocessoridNp(attr: PthreadAttrT, processorId: CInt?): CInt =
    throw UnsupportedOperationException("pthreadAttrGetprocessoridNp not available on WASI — no C library access")

public actual fun pthreadAttrSetprocessoridNp(attr: PthreadAttrT, processorId: CInt): CInt =
    throw UnsupportedOperationException("pthreadAttrSetprocessoridNp not available on WASI — no C library access")

public actual fun pthreadGetschedparam(native: PthreadT, policy: CInt?, param: SchedParam?): CInt =
    throw UnsupportedOperationException("pthreadGetschedparam not available on WASI — no C library access")

public actual fun pthreadSetschedparam(native: PthreadT, policy: CInt, param: SchedParam?): CInt =
    throw UnsupportedOperationException("pthreadSetschedparam not available on WASI — no C library access")

public actual fun pthreadCondattrGetclock(attr: PthreadCondattrT, clockId: ClockidT?): CInt =
    throw UnsupportedOperationException("pthreadCondattrGetclock not available on WASI — no C library access")

public actual fun pthreadCondattrSetclock(attr: PthreadCondattrT, clockId: ClockidT): CInt =
    throw UnsupportedOperationException("pthreadCondattrSetclock not available on WASI — no C library access")

public actual fun pthreadGetprocessoridNp(): CInt =
    throw UnsupportedOperationException("pthreadGetprocessoridNp not available on WASI — no C library access")

public actual fun getentropy(buf: COpaquePointer?, buflen: ULong): CInt =
    throw UnsupportedOperationException("getentropy not available on WASI — no C library access")

public actual fun pipe2(fds: CInt?, flags: CInt): CInt =
    throw UnsupportedOperationException("pipe2 not available on WASI — no C library access")

