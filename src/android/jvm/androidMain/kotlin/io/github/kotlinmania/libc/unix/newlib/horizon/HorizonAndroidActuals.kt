@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.unix.newlib.horizon

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CLong
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.unix.SizeT
import io.github.kotlinmania.libc.unix.SsizeT
import io.github.kotlinmania.libc.unix.newlib.ClockidT
import io.github.kotlinmania.libc.unix.newlib.PthreadT
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr

private object UnixNewlibHorizonJniBridge {
    init {
        System.loadLibrary("libc_jni")
    }

    @JvmStatic
    external fun libcUnixNewlibHorizonPthreadCreate(native: Long, attr: Long, f: Long, value: Long): Int

    @JvmStatic
    external fun libcUnixNewlibHorizonPthreadAttrGetschedparam(attr: Long, param: Long): Int

    @JvmStatic
    external fun libcUnixNewlibHorizonPthreadAttrSetschedparam(attr: Long, param: Long): Int

    @JvmStatic
    external fun libcUnixNewlibHorizonPthreadAttrGetprocessoridNp(attr: Long, processorId: Long): Int

    @JvmStatic
    external fun libcUnixNewlibHorizonPthreadAttrSetprocessoridNp(attr: Long, processorId: Int): Int

    @JvmStatic
    external fun libcUnixNewlibHorizonPthreadGetschedparam(native: Long, policy: Long, param: Long): Int

    @JvmStatic
    external fun libcUnixNewlibHorizonPthreadSetschedparam(native: Long, policy: Int, param: Long): Int

    @JvmStatic
    external fun libcUnixNewlibHorizonPthreadCondattrGetclock(attr: Long, clockId: Long): Int

    @JvmStatic
    external fun libcUnixNewlibHorizonPthreadCondattrSetclock(attr: Long, clockId: Long): Int

    @JvmStatic
    external fun libcUnixNewlibHorizonPthreadGetprocessoridNp(): Int

    @JvmStatic
    external fun libcUnixNewlibHorizonGetrandom(buf: Long, buflen: Long, flags: Int): Long

    @JvmStatic
    external fun libcUnixNewlibHorizonGethostid(): Long
}

public actual fun pthreadCreate(native: MutPtr, attr: ConstPtr, f: PthreadCreateFCallback, value: MutPtr): CInt =
    UnixNewlibHorizonJniBridge.libcUnixNewlibHorizonPthreadCreate(native.rawAddress, attr.rawAddress, 0L, value.rawAddress)

public actual fun pthreadAttrGetschedparam(attr: ConstPtr, param: MutPtr): CInt =
    UnixNewlibHorizonJniBridge.libcUnixNewlibHorizonPthreadAttrGetschedparam(attr.rawAddress, param.rawAddress)

public actual fun pthreadAttrSetschedparam(attr: MutPtr, param: ConstPtr): CInt =
    UnixNewlibHorizonJniBridge.libcUnixNewlibHorizonPthreadAttrSetschedparam(attr.rawAddress, param.rawAddress)

public actual fun pthreadAttrGetprocessoridNp(attr: ConstPtr, processorId: MutPtr): CInt =
    UnixNewlibHorizonJniBridge.libcUnixNewlibHorizonPthreadAttrGetprocessoridNp(attr.rawAddress, processorId.rawAddress)

public actual fun pthreadAttrSetprocessoridNp(attr: MutPtr, processorId: CInt): CInt =
    UnixNewlibHorizonJniBridge.libcUnixNewlibHorizonPthreadAttrSetprocessoridNp(attr.rawAddress, processorId)

public actual fun pthreadGetschedparam(native: PthreadT, policy: MutPtr, param: MutPtr): CInt =
    UnixNewlibHorizonJniBridge.libcUnixNewlibHorizonPthreadGetschedparam(native.toLong(), policy.rawAddress, param.rawAddress)

public actual fun pthreadSetschedparam(native: PthreadT, policy: CInt, param: ConstPtr): CInt =
    UnixNewlibHorizonJniBridge.libcUnixNewlibHorizonPthreadSetschedparam(native.toLong(), policy, param.rawAddress)

public actual fun pthreadCondattrGetclock(attr: ConstPtr, clockId: MutPtr): CInt =
    UnixNewlibHorizonJniBridge.libcUnixNewlibHorizonPthreadCondattrGetclock(attr.rawAddress, clockId.rawAddress)

public actual fun pthreadCondattrSetclock(attr: MutPtr, clockId: ClockidT): CInt =
    UnixNewlibHorizonJniBridge.libcUnixNewlibHorizonPthreadCondattrSetclock(attr.rawAddress, clockId.toLong())

public actual fun pthreadGetprocessoridNp(): CInt =
    UnixNewlibHorizonJniBridge.libcUnixNewlibHorizonPthreadGetprocessoridNp()

public actual fun getrandom(buf: MutPtr, buflen: SizeT, flags: CUint): SsizeT =
    UnixNewlibHorizonJniBridge.libcUnixNewlibHorizonGetrandom(buf.rawAddress, buflen.toLong(), flags.toInt())

public actual fun gethostid(): CLong =
    UnixNewlibHorizonJniBridge.libcUnixNewlibHorizonGethostid()
