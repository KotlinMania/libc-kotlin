package io.github.kotlinmania.libc.new.qurt

import io.github.kotlinmania.libc.COpaquePointer

public actual fun access(pathname: String?, mode: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').access(pathname, mode)") as CInt

public actual fun close(fd: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').close(fd)") as CInt

public actual fun lseek(fd: CInt, offset: OffT, whence: CInt): OffT =
    js("require('@kotlinmania/libc-native-bindings').lseek(fd, offset, whence)") as OffT

public actual fun read(fd: CInt, buf: COpaquePointer?, count: SizeT): SsizeT =
    js("require('@kotlinmania/libc-native-bindings').read(fd, buf?.value ?: 0L, count)") as SsizeT

public actual fun write(fd: CInt, buf: COpaquePointer?, count: SizeT): SsizeT =
    js("require('@kotlinmania/libc-native-bindings').write(fd, buf?.value ?: 0L, count)") as SsizeT

public actual fun ftruncate(fd: CInt, length: OffT): CInt =
    js("require('@kotlinmania/libc-native-bindings').ftruncate(fd, length)") as CInt

public actual fun unlink(pathname: String?): CInt =
    js("require('@kotlinmania/libc-native-bindings').unlink(pathname)") as CInt

public actual fun getcwd(buf: COpaquePointer?, size: SizeT): COpaquePointer? =
    js("require('@kotlinmania/libc-native-bindings').getcwd(buf?.value ?: 0L, size)") as Long?
    .let { if (it == 0L) null else COpaquePointer(it) }

public actual fun rmdir(pathname: String?): CInt =
    js("require('@kotlinmania/libc-native-bindings').rmdir(pathname)") as CInt

public actual fun getpid(): PidT =
    js("require('@kotlinmania/libc-native-bindings').getpid()") as PidT

public actual fun sleep(seconds: CUint): CUint =
    js("require('@kotlinmania/libc-native-bindings').sleep(seconds)") as CUint

public actual fun sysconf(name: CInt): CLong =
    js("require('@kotlinmania/libc-native-bindings').sysconf(name)") as CLong
