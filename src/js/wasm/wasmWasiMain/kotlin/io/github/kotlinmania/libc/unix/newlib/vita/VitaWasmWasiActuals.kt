@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.wasm.ExperimentalWasmInterop::class)

package io.github.kotlinmania.libc.unix.newlib.vita

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.unix.SizeT
import io.github.kotlinmania.libc.unix.SsizeT
import io.github.kotlinmania.libc.unix.newlib.ClockidT
import io.github.kotlinmania.libc.unix.newlib.PthreadT
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr

// The host must provide the C companion wrapper exports in import module libc.
public actual fun futimens(fd: CInt, times: ConstPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixNewlibVitaFutimens")

public actual fun writev(fd: CInt, iov: ConstPtr, iovcnt: CInt): SsizeT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixNewlibVitaWritev")

public actual fun readv(fd: CInt, iov: ConstPtr, iovcnt: CInt): SsizeT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixNewlibVitaReadv")

public actual fun sendmsg(s: CInt, msg: ConstPtr, flags: CInt): SsizeT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixNewlibVitaSendmsg")

public actual fun recvmsg(s: CInt, msg: MutPtr, flags: CInt): SsizeT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixNewlibVitaRecvmsg")

public actual fun pthreadCreate(native: MutPtr, attr: ConstPtr, f: PthreadCreateFCallback, value: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixNewlibVitaPthreadCreate")

public actual fun pthreadAttrGetschedparam(attr: ConstPtr, param: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixNewlibVitaPthreadAttrGetschedparam")

public actual fun pthreadAttrSetschedparam(attr: MutPtr, param: ConstPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixNewlibVitaPthreadAttrSetschedparam")

public actual fun pthreadAttrGetprocessoridNp(attr: ConstPtr, processorId: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixNewlibVitaPthreadAttrGetprocessoridNp")

public actual fun pthreadAttrSetprocessoridNp(attr: MutPtr, processorId: CInt): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixNewlibVitaPthreadAttrSetprocessoridNp")

public actual fun pthreadGetschedparam(native: PthreadT, policy: MutPtr, param: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixNewlibVitaPthreadGetschedparam")

public actual fun pthreadSetschedparam(native: PthreadT, policy: CInt, param: ConstPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixNewlibVitaPthreadSetschedparam")

public actual fun pthreadCondattrGetclock(attr: ConstPtr, clockId: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixNewlibVitaPthreadCondattrGetclock")

public actual fun pthreadCondattrSetclock(attr: MutPtr, clockId: ClockidT): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixNewlibVitaPthreadCondattrSetclock")

@kotlin.wasm.WasmImport("libc", "libcUnixNewlibVitaPthreadGetprocessoridNp")
private external fun wasiLibcUnixNewlibVitaPthreadGetprocessoridNp(): Int

public actual fun pthreadGetprocessoridNp(): CInt =
    wasiLibcUnixNewlibVitaPthreadGetprocessoridNp()

public actual fun getentropy(buf: MutPtr, buflen: SizeT): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixNewlibVitaGetentropy")

public actual fun pipe2(fds: MutPtr, flags: CInt): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixNewlibVitaPipe2")
