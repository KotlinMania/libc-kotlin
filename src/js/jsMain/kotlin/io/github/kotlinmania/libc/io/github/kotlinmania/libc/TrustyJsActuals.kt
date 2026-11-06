package io.github.kotlinmania.libc

import io.github.kotlinmania.libc.COpaquePointer

public actual fun calloc(nobj: SizeT, size: SizeT): COpaquePointer? =
    js("require('@kotlinmania/libc-native-bindings').calloc(nobj, size)") as Long?
    .let { if (it == 0L) null else COpaquePointer(it) }

public actual fun malloc(size: SizeT): COpaquePointer? =
    js("require('@kotlinmania/libc-native-bindings').malloc(size)") as Long?
    .let { if (it == 0L) null else COpaquePointer(it) }

public actual fun realloc(p: COpaquePointer?, size: SizeT): COpaquePointer? =
    js("require('@kotlinmania/libc-native-bindings').realloc(p?.value ?: 0L, size)") as Long?
    .let { if (it == 0L) null else COpaquePointer(it) }

public actual fun free(p: COpaquePointer?) {
    js("require('@kotlinmania/libc-native-bindings').free(p?.value ?: 0L)")
}

public actual fun memalign(align: SizeT, size: SizeT): COpaquePointer? =
    js("require('@kotlinmania/libc-native-bindings').memalign(align, size)") as Long?
    .let { if (it == 0L) null else COpaquePointer(it) }

public actual fun posixMemalign(memptr: COpaquePointer?, align: SizeT, size: SizeT): CInt =
    js("require('@kotlinmania/libc-native-bindings').posixMemalign(memptr?.value ?: 0L, align, size)") as CInt

public actual fun write(fd: CInt, buf: COpaquePointer?, count: SizeT): SsizeT =
    js("require('@kotlinmania/libc-native-bindings').write(fd, buf?.value ?: 0L, count)") as SsizeT

public actual fun writev(fd: CInt, iov: Iovec?, iovcnt: CInt): SsizeT =
    js("require('@kotlinmania/libc-native-bindings').writev(fd, iov?.toLong() ?: 0L, iovcnt)") as SsizeT

public actual fun close(fd: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').close(fd)") as CInt

public actual fun strlen(cs: String?): SizeT =
    js("require('@kotlinmania/libc-native-bindings').strlen(cs)") as SizeT

public actual fun getauxval(type: CUlong): CUlong =
    js("require('@kotlinmania/libc-native-bindings').getauxval(type)") as CUlong

public actual fun mmap(addr: COpaquePointer?, len: SizeT, prot: CInt, flags: CInt, fd: CInt, offset: OffT): COpaquePointer? =
    js("require('@kotlinmania/libc-native-bindings').mmap(addr?.value ?: 0L, len, prot, flags, fd, offset)") as Long?
    .let { if (it == 0L) null else COpaquePointer(it) }

public actual fun munmap(addr: COpaquePointer?, len: SizeT): CInt =
    js("require('@kotlinmania/libc-native-bindings').munmap(addr?.value ?: 0L, len)") as CInt

public actual fun clockGettime(clkId: ClockidT, tp: Timespec?): CInt =
    js("require('@kotlinmania/libc-native-bindings').clockGettime(clkId, tp?.toLong() ?: 0L)") as CInt

public actual fun nanosleep(rqtp: Timespec?, rmtp: Timespec?): CInt =
    js("require('@kotlinmania/libc-native-bindings').nanosleep(rqtp?.toLong() ?: 0L, rmtp?.toLong() ?: 0L)") as CInt
