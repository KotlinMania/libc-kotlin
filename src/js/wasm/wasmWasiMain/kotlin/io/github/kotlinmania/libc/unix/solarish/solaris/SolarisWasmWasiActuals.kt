@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.wasm.ExperimentalWasmInterop::class)

package io.github.kotlinmania.libc.unix.solarish.solaris

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.unix.PidT
import io.github.kotlinmania.libc.unix.SizeT
import io.github.kotlinmania.libc.unix.solarish.PthreadT
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr

// The host must provide the C companion wrapper exports in import module libc.
public actual fun fexecve(fd: CInt, argv: ConstPtr, envp: ConstPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixSolarishSolarisFexecve")

public actual fun mincore(addr: MutPtr, len: SizeT, vec: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixSolarishSolarisMincore")

public actual fun doorCall(d: CInt, params: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixSolarishSolarisDoorCall")

public actual fun doorReturn(dataPtr: MutPtr, dataSize: SizeT, descPtr: MutPtr, numDesc: CUint): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixSolarishSolarisDoorReturn")

public actual fun doorCreate(serverProcedure: DoorCreateServerProcedureCallback, cookie: MutPtr, attributes: DoorAttrT): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixSolarishSolarisDoorCreate")

public actual fun fattach(fildes: CInt, path: ConstPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixSolarishSolarisFattach")

public actual fun pthreadGetattrNp(thread: PthreadT, attr: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixSolarishSolarisPthreadGetattrNp")

public actual fun euidaccess(path: ConstPtr, amode: CInt): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixSolarishSolarisEuidaccess")

public actual fun openpty(amain: MutPtr, asubord: MutPtr, name: MutPtr, termp: MutPtr, winp: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixSolarishSolarisOpenpty")

public actual fun forkpty(amain: MutPtr, name: MutPtr, termp: MutPtr, winp: MutPtr): PidT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixSolarishSolarisForkpty")
