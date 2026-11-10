@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.unix.haiku

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CLonglong
import io.github.kotlinmania.libc.COpaquePointer
import io.github.kotlinmania.libc.unix.PidT
import io.github.kotlinmania.libc.unix.SizeT
import io.github.kotlinmania.libc.unix.SsizeT

public actual fun daemon(nochdir: CInt, noclose: CInt): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getprogname(): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setprogname(progname: String?): Unit =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun arc4random(): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun arc4randomUniform(upperBound: UInt): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun arc4randomBuf(buf: COpaquePointer?, n: SizeT): Unit =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun mkstemps(template: COpaquePointer?, suffixlen: CInt): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun strtonum(nptr: String?, minval: CLonglong, maxval: CLonglong, errstr: COpaquePointer?): CLonglong =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun openpty(amaster: COpaquePointer?, aslave: COpaquePointer?, name: COpaquePointer?, termp: COpaquePointer?, winp: COpaquePointer?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun loginTty(fd: CInt): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun forkpty(amaster: COpaquePointer?, name: COpaquePointer?, termp: COpaquePointer?, winp: COpaquePointer?): PidT =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun strsep(string: COpaquePointer?, delimiters: String?): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun explicitBzero(buf: COpaquePointer?, len: SizeT): Unit =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun slInit(): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun slAdd(sl: COpaquePointer?, n: COpaquePointer?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun slFree(sl: COpaquePointer?, i: CInt): Unit =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun slFind(sl: COpaquePointer?, n: COpaquePointer?): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun kqueue(): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun kevent(kq: CInt, changelist: COpaquePointer?, nchanges: CInt, eventlist: COpaquePointer?, nevents: CInt, timeout: COpaquePointer?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun dlIteratePhdr(callback: DlIteratePhdrCallbackCallback?, data: COpaquePointer?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun lutimes(file: String?, times: COpaquePointer?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun preadv(fd: CInt, iov: COpaquePointer?, iovcnt: CInt, offset: OffT): SsizeT =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun pwritev(fd: CInt, iov: COpaquePointer?, iovcnt: CInt, offset: OffT): SsizeT =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun wait4(pid: PidT, status: COpaquePointer?, options: CInt, rusage: COpaquePointer?): PidT =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
