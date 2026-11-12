@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.wasm.ExperimentalWasmInterop::class)

package io.github.kotlinmania.libc.unix.linuxlike.linux.uclibc.mips.mips32

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CChar
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.unix.SizeT
import io.github.kotlinmania.libc.unix.linuxlike.CpuSetT
import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr

// The host must provide the C companion wrapper exports in import module libc.
public actual fun sysctl(name: MutPtr<CInt>, namelen: CInt, oldp: MutPtr<CVoid>, oldlenp: MutPtr<SizeT>, newp: MutPtr<CVoid>, newlen: SizeT): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeLinuxUclibcMipsMips32Sysctl")

public actual fun glob64(pattern: ConstPtr<CChar>, flags: CInt, errfunc: Glob64ErrfuncCallback?, pglob: MutPtr<Glob64T>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeLinuxUclibcMipsMips32Glob64")

public actual fun globfree64(pglob: MutPtr<Glob64T>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeLinuxUclibcMipsMips32Globfree64")

public actual fun pthreadAttrGetaffinityNp(attr: ConstPtr<PthreadAttrT>, cpusetsize: SizeT, cpuset: MutPtr<CpuSetT>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeLinuxUclibcMipsMips32PthreadAttrGetaffinityNp")

public actual fun pthreadAttrSetaffinityNp(attr: MutPtr<PthreadAttrT>, cpusetsize: SizeT, cpuset: ConstPtr<CpuSetT>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeLinuxUclibcMipsMips32PthreadAttrSetaffinityNp")
