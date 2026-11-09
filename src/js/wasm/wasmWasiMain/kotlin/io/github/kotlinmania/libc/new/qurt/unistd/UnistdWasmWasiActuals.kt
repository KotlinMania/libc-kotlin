@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.new.qurt.unistd

import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CLong
import io.github.kotlinmania.libc.COpaquePointer
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.new.qurt.OffT
import io.github.kotlinmania.libc.new.qurt.PidT
import io.github.kotlinmania.libc.new.qurt.SizeT
import io.github.kotlinmania.libc.new.qurt.SsizeT

public actual fun access(pathname: String?, mode: CInt): CInt =
    0

public actual fun close(fd: CInt): CInt =
    0

public actual fun lseek(fd: CInt, offset: OffT, whence: CInt): OffT =
    0L

public actual fun read(fd: CInt, buf: COpaquePointer?, count: SizeT): SsizeT =
    0

public actual fun write(fd: CInt, buf: COpaquePointer?, count: SizeT): SsizeT =
    0

public actual fun ftruncate(fd: CInt, length: OffT): CInt =
    0

public actual fun unlink(pathname: String?): CInt =
    0

public actual fun getcwd(buf: COpaquePointer?, size: SizeT): COpaquePointer? =
    null

public actual fun rmdir(pathname: String?): CInt =
    0

public actual fun getpid(): PidT =
    0

public actual fun sleep(seconds: CUint): CUint =
    0u

public actual fun sysconf(name: CInt): CLong =
    0L
