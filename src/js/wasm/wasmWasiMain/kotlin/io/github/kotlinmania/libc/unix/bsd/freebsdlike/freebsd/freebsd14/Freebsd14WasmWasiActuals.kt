@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.wasm.ExperimentalWasmInterop::class)

package io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.freebsd14

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CLong
import io.github.kotlinmania.libc.unix.LocaleT
import io.github.kotlinmania.libc.unix.SizeT
import io.github.kotlinmania.libc.unix.SsizeT
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.IdT
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.CpulevelT
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.CpuwhichT
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr

// The host must provide the C companion wrapper exports in import module libc.
@kotlin.wasm.WasmImport("libc", "libcUnixBsdFreebsdlikeFreebsdFreebsd14Setgrent")
private external fun wasiLibcUnixBsdFreebsdlikeFreebsdFreebsd14Setgrent(): Unit

public actual fun setgrent(): Unit =
    wasiLibcUnixBsdFreebsdlikeFreebsdFreebsd14Setgrent()

public actual fun mprotect(addr: MutPtr, len: SizeT, prot: CInt): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdFreebsdlikeFreebsdFreebsd14Mprotect")

public actual fun freelocale(loc: LocaleT): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdFreebsdlikeFreebsdFreebsd14Freelocale")

public actual fun msgrcv(msqid: CInt, msgp: MutPtr, msgsz: SizeT, msgtyp: CLong, msgflg: CInt): SsizeT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdFreebsdlikeFreebsdFreebsd14Msgrcv")

public actual fun cpusetGetdomain(level: CpulevelT, which: CpuwhichT, id: IdT, setsize: SizeT, mask: MutPtr, policy: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdFreebsdlikeFreebsdFreebsd14CpusetGetdomain")

public actual fun cpusetSetdomain(level: CpulevelT, which: CpuwhichT, id: IdT, setsize: SizeT, mask: ConstPtr, policy: CInt): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdFreebsdlikeFreebsdFreebsd14CpusetSetdomain")

public actual fun dirname(path: MutPtr): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdFreebsdlikeFreebsdFreebsd14Dirname")

public actual fun basename(path: MutPtr): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdFreebsdlikeFreebsdFreebsd14Basename")

public actual fun qsortR(base: MutPtr, num: SizeT, size: SizeT, compar: QsortRComparCallback?, arg: MutPtr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdFreebsdlikeFreebsdFreebsd14QsortR")

public actual fun kvmKerndisp(kd: MutPtr): KssizeT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixBsdFreebsdlikeFreebsdFreebsd14KvmKerndisp")
