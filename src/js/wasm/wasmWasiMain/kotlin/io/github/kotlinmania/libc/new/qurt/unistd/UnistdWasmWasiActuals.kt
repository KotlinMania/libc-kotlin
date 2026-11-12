@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.wasm.ExperimentalWasmInterop::class)

package io.github.kotlinmania.libc.new.qurt.unistd

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CChar
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CLong
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.new.qurt.OffT
import io.github.kotlinmania.libc.new.qurt.PidT
import io.github.kotlinmania.libc.new.qurt.SizeT
import io.github.kotlinmania.libc.new.qurt.SsizeT
import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr

// The host must provide the C companion wrapper exports in import module libc.
public actual fun access(pathname: ConstPtr<CChar>, mode: CInt): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcNewQurtUnistdAccess")

@kotlin.wasm.WasmImport("libc", "libcNewQurtUnistdClose")
private external fun wasiLibcNewQurtUnistdClose(fd: Int): Int

public actual fun close(fd: CInt): CInt =
    wasiLibcNewQurtUnistdClose(fd)

@kotlin.wasm.WasmImport("libc", "libcNewQurtUnistdLseek")
private external fun wasiLibcNewQurtUnistdLseek(fd: Int, offset: Long, whence: Int): Long

public actual fun lseek(fd: CInt, offset: OffT, whence: CInt): OffT =
    wasiLibcNewQurtUnistdLseek(fd, offset, whence)

public actual fun read(fd: CInt, buf: MutPtr<CVoid>, count: SizeT): SsizeT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcNewQurtUnistdRead")

public actual fun write(fd: CInt, buf: ConstPtr<CVoid>, count: SizeT): SsizeT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcNewQurtUnistdWrite")

@kotlin.wasm.WasmImport("libc", "libcNewQurtUnistdFtruncate")
private external fun wasiLibcNewQurtUnistdFtruncate(fd: Int, length: Long): Int

public actual fun ftruncate(fd: CInt, length: OffT): CInt =
    wasiLibcNewQurtUnistdFtruncate(fd, length)

public actual fun unlink(pathname: ConstPtr<CChar>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcNewQurtUnistdUnlink")

public actual fun getcwd(buf: MutPtr<CChar>, size: SizeT): MutPtr<CChar> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcNewQurtUnistdGetcwd")

public actual fun rmdir(pathname: ConstPtr<CChar>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcNewQurtUnistdRmdir")

@kotlin.wasm.WasmImport("libc", "libcNewQurtUnistdGetpid")
private external fun wasiLibcNewQurtUnistdGetpid(): Int

public actual fun getpid(): PidT =
    wasiLibcNewQurtUnistdGetpid()

@kotlin.wasm.WasmImport("libc", "libcNewQurtUnistdSleep")
private external fun wasiLibcNewQurtUnistdSleep(seconds: Int): Int

public actual fun sleep(seconds: CUint): CUint =
    wasiLibcNewQurtUnistdSleep(seconds.toInt()).toUInt()

@kotlin.wasm.WasmImport("libc", "libcNewQurtUnistdSysconf")
private external fun wasiLibcNewQurtUnistdSysconf(name: Int): Long

public actual fun sysconf(name: CInt): CLong =
    wasiLibcNewQurtUnistdSysconf(name)
