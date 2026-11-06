package io.github.kotlinmania.libc.new.qurt.sys

import io.github.kotlinmania.libc.COpaquePointer

public actual fun mmap(addr: COpaquePointer?, len: SizeT, prot: CInt, flags: CInt, fd: CInt, offset: OffT): COpaquePointer? =
    js("require('@kotlinmania/libc-native-bindings').mmap(addr?.value ?: 0L, len, prot, flags, fd, offset)") as Long?
    .let { if (it == 0L) null else COpaquePointer(it) }

public actual fun munmap(addr: COpaquePointer?, len: SizeT): CInt =
    js("require('@kotlinmania/libc-native-bindings').munmap(addr?.value ?: 0L, len)") as CInt

public actual fun mprotect(addr: COpaquePointer?, len: SizeT, prot: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').mprotect(addr?.value ?: 0L, len, prot)") as CInt

public actual fun mlock(addr: COpaquePointer?, len: SizeT): CInt =
    js("require('@kotlinmania/libc-native-bindings').mlock(addr?.value ?: 0L, len)") as CInt

public actual fun munlock(addr: COpaquePointer?, len: SizeT): CInt =
    js("require('@kotlinmania/libc-native-bindings').munlock(addr?.value ?: 0L, len)") as CInt

public actual fun mlockall(flags: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').mlockall(flags)") as CInt

public actual fun munlockall(): CInt =
    js("require('@kotlinmania/libc-native-bindings').munlockall()") as CInt

public actual fun msync(addr: COpaquePointer?, len: SizeT, flags: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').msync(addr?.value ?: 0L, len, flags)") as CInt
