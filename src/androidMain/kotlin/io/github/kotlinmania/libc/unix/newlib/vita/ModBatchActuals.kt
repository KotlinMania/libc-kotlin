// port-lint: source Mod.rs
package io.github.kotlinmania.libc.unix.newlib.vita

import io.github.kotlinmania.libc.*

public actual fun futimens(fd: Int, times: Timespec?): Int =
    throw UnsupportedOperationException("futimens not available on Android host — use androidNative target for FFI")

public actual fun writev(fd: Int, iov: Iovec?, iovcnt: Int): Long =
    throw UnsupportedOperationException("writev not available on Android host — use androidNative target for FFI")

public actual fun readv(fd: Int, iov: Iovec?, iovcnt: Int): Long =
    throw UnsupportedOperationException("readv not available on Android host — use androidNative target for FFI")

public actual fun sendmsg(s: Int, msg: Msghdr?, flags: Int): Long =
    throw UnsupportedOperationException("sendmsg not available on Android host — use androidNative target for FFI")

public actual fun recvmsg(s: Int, msg: Msghdr?, flags: Int): Long =
    throw UnsupportedOperationException("recvmsg not available on Android host — use androidNative target for FFI")

public actual fun pthreadAttrGetschedparam(attr: io.github.kotlinmania.libc.COpaquePointer?, param: SchedParam?): Int =
    throw UnsupportedOperationException("pthreadAttrGetschedparam not available on Android host — use androidNative target for FFI")

public actual fun pthreadAttrSetschedparam(attr: io.github.kotlinmania.libc.COpaquePointer?, param: SchedParam?): Int =
    throw UnsupportedOperationException("pthreadAttrSetschedparam not available on Android host — use androidNative target for FFI")

public actual fun pthreadAttrGetprocessoridNp(attr: io.github.kotlinmania.libc.COpaquePointer?, processorId: Int?): Int =
    throw UnsupportedOperationException("pthreadAttrGetprocessoridNp not available on Android host — use androidNative target for FFI")

public actual fun pthreadAttrSetprocessoridNp(attr: io.github.kotlinmania.libc.COpaquePointer?, processorId: Int): Int =
    throw UnsupportedOperationException("pthreadAttrSetprocessoridNp not available on Android host — use androidNative target for FFI")

public actual fun pthreadGetschedparam(native: ULong, policy: Int?, param: SchedParam?): Int =
    throw UnsupportedOperationException("pthreadGetschedparam not available on Android host — use androidNative target for FFI")

public actual fun pthreadSetschedparam(native: ULong, policy: Int, param: SchedParam?): Int =
    throw UnsupportedOperationException("pthreadSetschedparam not available on Android host — use androidNative target for FFI")

public actual fun pthreadCondattrGetclock(attr: io.github.kotlinmania.libc.COpaquePointer?, clockId: Int?): Int =
    throw UnsupportedOperationException("pthreadCondattrGetclock not available on Android host — use androidNative target for FFI")

public actual fun pthreadCondattrSetclock(attr: io.github.kotlinmania.libc.COpaquePointer?, clockId: Int): Int =
    throw UnsupportedOperationException("pthreadCondattrSetclock not available on Android host — use androidNative target for FFI")

public actual fun pthreadGetprocessoridNp(): Int =
    throw UnsupportedOperationException("pthreadGetprocessoridNp not available on Android host — use androidNative target for FFI")

public actual fun getentropy(buf: COpaquePointer?, buflen: ULong): Int =
    throw UnsupportedOperationException("getentropy not available on Android host — use androidNative target for FFI")

public actual fun pipe2(fds: Int?, flags: Int): Int =
    throw UnsupportedOperationException("pipe2 not available on Android host — use androidNative target for FFI")

public actual fun pthreadCreate(native: ULong?, attr: io.github.kotlinmania.libc.COpaquePointer?, f: ((COpaquePointer?) -> COpaquePointer?)?, value: COpaquePointer?): Int =
    throw UnsupportedOperationException("pthreadCreate not available on Android host — use androidNative target for FFI")
