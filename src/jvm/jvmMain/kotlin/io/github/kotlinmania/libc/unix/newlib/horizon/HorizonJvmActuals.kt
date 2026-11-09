@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.unix.newlib.horizon

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CLong
import io.github.kotlinmania.libc.COpaquePointer
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.unix.SizeT
import io.github.kotlinmania.libc.unix.SsizeT
import io.github.kotlinmania.libc.unix.newlib.ClockidT
import io.github.kotlinmania.libc.unix.newlib.PthreadT

private object UnixNewlibHorizonJniBridge {
    init {
        System.loadLibrary("libc_jni")
    }

    @JvmStatic
    external fun libc_unix_newlib_horizon_pthreadCreate(native: Long, attr: Long, f: Long, value: Long): Int

    @JvmStatic
    external fun libc_unix_newlib_horizon_pthreadAttrGetschedparam(attr: Long, param: Long): Int

    @JvmStatic
    external fun libc_unix_newlib_horizon_pthreadAttrSetschedparam(attr: Long, param: Long): Int

    @JvmStatic
    external fun libc_unix_newlib_horizon_pthreadAttrGetprocessoridNp(attr: Long, processorId: Long): Int

    @JvmStatic
    external fun libc_unix_newlib_horizon_pthreadAttrSetprocessoridNp(attr: Long, processorId: Int): Int

    @JvmStatic
    external fun libc_unix_newlib_horizon_pthreadGetschedparam(native: Long, policy: Long, param: Long): Int

    @JvmStatic
    external fun libc_unix_newlib_horizon_pthreadSetschedparam(native: Long, policy: Int, param: Long): Int

    @JvmStatic
    external fun libc_unix_newlib_horizon_pthreadCondattrGetclock(attr: Long, clockId: Long): Int

    @JvmStatic
    external fun libc_unix_newlib_horizon_pthreadCondattrSetclock(attr: Long, clockId: Long): Int

    @JvmStatic
    external fun libc_unix_newlib_horizon_pthreadGetprocessoridNp(): Int

    @JvmStatic
    external fun libc_unix_newlib_horizon_getrandom(buf: Long, buflen: Long, flags: Int): Long

    @JvmStatic
    external fun libc_unix_newlib_horizon_gethostid(): Long
}

public actual fun pthreadCreate(native: COpaquePointer?, attr: COpaquePointer?, f: PthreadCreateFCallback, value: COpaquePointer?): CInt =
    UnixNewlibHorizonJniBridge.libc_unix_newlib_horizon_pthreadCreate((native?.value ?: 0L), (attr?.value ?: 0L), 0L, (value?.value ?: 0L))

public actual fun pthreadAttrGetschedparam(attr: COpaquePointer?, param: COpaquePointer?): CInt =
    UnixNewlibHorizonJniBridge.libc_unix_newlib_horizon_pthreadAttrGetschedparam((attr?.value ?: 0L), (param?.value ?: 0L))

public actual fun pthreadAttrSetschedparam(attr: COpaquePointer?, param: COpaquePointer?): CInt =
    UnixNewlibHorizonJniBridge.libc_unix_newlib_horizon_pthreadAttrSetschedparam((attr?.value ?: 0L), (param?.value ?: 0L))

public actual fun pthreadAttrGetprocessoridNp(attr: COpaquePointer?, processorId: COpaquePointer?): CInt =
    UnixNewlibHorizonJniBridge.libc_unix_newlib_horizon_pthreadAttrGetprocessoridNp((attr?.value ?: 0L), (processorId?.value ?: 0L))

public actual fun pthreadAttrSetprocessoridNp(attr: COpaquePointer?, processorId: CInt): CInt =
    UnixNewlibHorizonJniBridge.libc_unix_newlib_horizon_pthreadAttrSetprocessoridNp((attr?.value ?: 0L), processorId)

public actual fun pthreadGetschedparam(native: PthreadT, policy: COpaquePointer?, param: COpaquePointer?): CInt =
    UnixNewlibHorizonJniBridge.libc_unix_newlib_horizon_pthreadGetschedparam(native.toLong(), (policy?.value ?: 0L), (param?.value ?: 0L))

public actual fun pthreadSetschedparam(native: PthreadT, policy: CInt, param: COpaquePointer?): CInt =
    UnixNewlibHorizonJniBridge.libc_unix_newlib_horizon_pthreadSetschedparam(native.toLong(), policy, (param?.value ?: 0L))

public actual fun pthreadCondattrGetclock(attr: COpaquePointer?, clockId: COpaquePointer?): CInt =
    UnixNewlibHorizonJniBridge.libc_unix_newlib_horizon_pthreadCondattrGetclock((attr?.value ?: 0L), (clockId?.value ?: 0L))

public actual fun pthreadCondattrSetclock(attr: COpaquePointer?, clockId: ClockidT): CInt =
    UnixNewlibHorizonJniBridge.libc_unix_newlib_horizon_pthreadCondattrSetclock((attr?.value ?: 0L), clockId.toLong())

public actual fun pthreadGetprocessoridNp(): CInt =
    UnixNewlibHorizonJniBridge.libc_unix_newlib_horizon_pthreadGetprocessoridNp()

public actual fun getrandom(buf: COpaquePointer?, buflen: SizeT, flags: CUint): SsizeT =
    UnixNewlibHorizonJniBridge.libc_unix_newlib_horizon_getrandom((buf?.value ?: 0L), buflen.toLong(), flags.toInt())

public actual fun gethostid(): CLong =
    UnixNewlibHorizonJniBridge.libc_unix_newlib_horizon_gethostid()
