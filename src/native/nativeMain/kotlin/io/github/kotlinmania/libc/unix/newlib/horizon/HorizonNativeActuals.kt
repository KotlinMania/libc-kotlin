@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.unix.newlib.horizon

import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CLong
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.unix.SizeT
import io.github.kotlinmania.libc.unix.SsizeT
import io.github.kotlinmania.libc.unix.newlib.ClockidT
import io.github.kotlinmania.libc.unix.newlib.PthreadT
import io.github.kotlinmania.libc.unix.newlib.horizon.cinterop.libcUnixNewlibHorizonGethostid
import io.github.kotlinmania.libc.unix.newlib.horizon.cinterop.libcUnixNewlibHorizonGetrandom
import io.github.kotlinmania.libc.unix.newlib.horizon.cinterop.libcUnixNewlibHorizonPthreadAttrGetprocessoridNp
import io.github.kotlinmania.libc.unix.newlib.horizon.cinterop.libcUnixNewlibHorizonPthreadAttrGetschedparam
import io.github.kotlinmania.libc.unix.newlib.horizon.cinterop.libcUnixNewlibHorizonPthreadAttrSetprocessoridNp
import io.github.kotlinmania.libc.unix.newlib.horizon.cinterop.libcUnixNewlibHorizonPthreadAttrSetschedparam
import io.github.kotlinmania.libc.unix.newlib.horizon.cinterop.libcUnixNewlibHorizonPthreadCondattrGetclock
import io.github.kotlinmania.libc.unix.newlib.horizon.cinterop.libcUnixNewlibHorizonPthreadCondattrSetclock
import io.github.kotlinmania.libc.unix.newlib.horizon.cinterop.libcUnixNewlibHorizonPthreadCreate
import io.github.kotlinmania.libc.unix.newlib.horizon.cinterop.libcUnixNewlibHorizonPthreadGetprocessoridNp
import io.github.kotlinmania.libc.unix.newlib.horizon.cinterop.libcUnixNewlibHorizonPthreadGetschedparam
import io.github.kotlinmania.libc.unix.newlib.horizon.cinterop.libcUnixNewlibHorizonPthreadSetschedparam
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer

public actual fun pthreadCreate(native: MutPtr, attr: ConstPtr, f: PthreadCreateFCallback, value: MutPtr): CInt =
    libcUnixNewlibHorizonPthreadCreate(native.rawAddress.toCPointer<ByteVar>(), attr.rawAddress.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), value.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadAttrGetschedparam(attr: ConstPtr, param: MutPtr): CInt =
    libcUnixNewlibHorizonPthreadAttrGetschedparam(attr.rawAddress.toCPointer<ByteVar>(), param.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadAttrSetschedparam(attr: MutPtr, param: ConstPtr): CInt =
    libcUnixNewlibHorizonPthreadAttrSetschedparam(attr.rawAddress.toCPointer<ByteVar>(), param.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadAttrGetprocessoridNp(attr: ConstPtr, processorId: MutPtr): CInt =
    libcUnixNewlibHorizonPthreadAttrGetprocessoridNp(attr.rawAddress.toCPointer<ByteVar>(), processorId.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadAttrSetprocessoridNp(attr: MutPtr, processorId: CInt): CInt =
    libcUnixNewlibHorizonPthreadAttrSetprocessoridNp(attr.rawAddress.toCPointer<ByteVar>(), processorId)

public actual fun pthreadGetschedparam(native: PthreadT, policy: MutPtr, param: MutPtr): CInt =
    libcUnixNewlibHorizonPthreadGetschedparam(native.toLong().toCPointer<ByteVar>(), policy.rawAddress.toCPointer<ByteVar>(), param.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadSetschedparam(native: PthreadT, policy: CInt, param: ConstPtr): CInt =
    libcUnixNewlibHorizonPthreadSetschedparam(native.toLong().toCPointer<ByteVar>(), policy, param.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadCondattrGetclock(attr: ConstPtr, clockId: MutPtr): CInt =
    libcUnixNewlibHorizonPthreadCondattrGetclock(attr.rawAddress.toCPointer<ByteVar>(), clockId.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadCondattrSetclock(attr: MutPtr, clockId: ClockidT): CInt =
    libcUnixNewlibHorizonPthreadCondattrSetclock(attr.rawAddress.toCPointer<ByteVar>(), clockId)

public actual fun pthreadGetprocessoridNp(): CInt =
    libcUnixNewlibHorizonPthreadGetprocessoridNp()

public actual fun getrandom(buf: MutPtr, buflen: SizeT, flags: CUint): SsizeT =
    libcUnixNewlibHorizonGetrandom(buf.rawAddress.toCPointer<ByteVar>(), buflen, flags)

public actual fun gethostid(): CLong =
    libcUnixNewlibHorizonGethostid()
