@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.wasm.ExperimentalWasmInterop::class)

package io.github.kotlinmania.libc.unix.newlib.espidf

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.unix.SizeT
import io.github.kotlinmania.libc.unix.SsizeT
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr

// The host must provide the C companion wrapper exports in import module libc.
public actual fun pthreadCreate(native: MutPtr, attr: ConstPtr, f: PthreadCreateFCallback, value: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixNewlibEspidfPthreadCreate")

public actual fun getrandom(buf: MutPtr, buflen: SizeT, flags: CUint): SsizeT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixNewlibEspidfGetrandom")

public actual fun gethostname(name: MutPtr, namelen: SsizeT): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixNewlibEspidfGethostname")

public actual fun sendmsg(s: CInt, msg: ConstPtr, flags: CInt): SsizeT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixNewlibEspidfSendmsg")

public actual fun recvmsg(s: CInt, msg: MutPtr, flags: CInt): SsizeT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixNewlibEspidfRecvmsg")

@kotlin.wasm.WasmImport("libc", "libcUnixNewlibEspidfEventfd")
private external fun wasiLibcUnixNewlibEspidfEventfd(initval: Int, flags: Int): Int

public actual fun eventfd(initval: CUint, flags: CInt): CInt =
    wasiLibcUnixNewlibEspidfEventfd(initval.toInt(), flags)
