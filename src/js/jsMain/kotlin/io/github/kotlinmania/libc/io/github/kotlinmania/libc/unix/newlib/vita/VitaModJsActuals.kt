package io.github.kotlinmania.libc.unix.newlib.vita

import io.github.kotlinmania.libc.COpaquePointer

public actual fun futimens(fd: CInt, times: Timespec?): CInt =
    js("require('@kotlinmania/libc-native-bindings').futimens(fd, times?.toLong() ?: 0L)") as CInt

public actual fun writev(fd: CInt, iov: Iovec?, iovcnt: CInt): SsizeT =
    js("require('@kotlinmania/libc-native-bindings').writev(fd, iov?.toLong() ?: 0L, iovcnt)") as SsizeT

public actual fun readv(fd: CInt, iov: Iovec?, iovcnt: CInt): SsizeT =
    js("require('@kotlinmania/libc-native-bindings').readv(fd, iov?.toLong() ?: 0L, iovcnt)") as SsizeT

public actual fun sendmsg(s: CInt, msg: io.github.kotlinmania.libc.Msghdr?, flags: CInt): SsizeT =
    js("require('@kotlinmania/libc-native-bindings').sendmsg(s, msg?.toLong() ?: 0L, flags)") as SsizeT

public actual fun recvmsg(s: CInt, msg: io.github.kotlinmania.libc.Msghdr?, flags: CInt): SsizeT =
    js("require('@kotlinmania/libc-native-bindings').recvmsg(s, msg?.toLong() ?: 0L, flags)") as SsizeT

public actual fun pthreadCreate(native: PthreadT?, attr: PthreadAttrT?, f: PthreadCreateFCallback, value: COpaquePointer?): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadCreate(native?.toLong() ?: 0L, attr?.toLong() ?: 0L, f, value?.value ?: 0L)") as CInt

public actual fun pthreadAttrGetschedparam(attr: PthreadAttrT?, param: SchedParam?): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadAttrGetschedparam(attr?.toLong() ?: 0L, param?.toLong() ?: 0L)") as CInt

public actual fun pthreadAttrSetschedparam(attr: PthreadAttrT?, param: SchedParam?): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadAttrSetschedparam(attr?.toLong() ?: 0L, param?.toLong() ?: 0L)") as CInt

public actual fun pthreadAttrGetprocessoridNp(attr: PthreadAttrT?, processorId: CInt?): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadAttrGetprocessoridNp(attr?.toLong() ?: 0L, processorId?.toLong() ?: 0L)") as CInt

public actual fun pthreadAttrSetprocessoridNp(attr: PthreadAttrT?, processorId: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadAttrSetprocessoridNp(attr?.toLong() ?: 0L, processorId)") as CInt

public actual fun pthreadGetschedparam(native: PthreadT, policy: CInt?, param: io.github.kotlinmania.libc.SchedParam?): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadGetschedparam(native, policy?.toLong() ?: 0L, param?.toLong() ?: 0L)") as CInt

public actual fun pthreadSetschedparam(native: PthreadT, policy: CInt, param: io.github.kotlinmania.libc.SchedParam?): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadSetschedparam(native, policy, param?.toLong() ?: 0L)") as CInt

public actual fun pthreadCondattrGetclock(attr: PthreadCondattrT?, clockId: ClockidT?): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadCondattrGetclock(attr?.toLong() ?: 0L, clockId?.toLong() ?: 0L)") as CInt

public actual fun pthreadCondattrSetclock(attr: PthreadCondattrT?, clockId: ClockidT): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadCondattrSetclock(attr?.toLong() ?: 0L, clockId)") as CInt

public actual fun pthreadGetprocessoridNp(): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadGetprocessoridNp()") as CInt

public actual fun getentropy(buf: COpaquePointer?, buflen: SizeT): CInt =
    js("require('@kotlinmania/libc-native-bindings').getentropy(buf?.value ?: 0L, buflen)") as CInt

public actual fun pipe2(fds: CInt?, flags: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').pipe2(fds?.toLong() ?: 0L, flags)") as CInt
