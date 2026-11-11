@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.unix.newlib.horizon

import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CLong
import io.github.kotlinmania.libc.COpaquePointer
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.unix.SizeT
import io.github.kotlinmania.libc.unix.SsizeT
import io.github.kotlinmania.libc.unix.newlib.ClockidT
import io.github.kotlinmania.libc.unix.newlib.PthreadT
import io.github.kotlinmania.libc.unix.newlib.horizon.cinterop.libc_unix_newlib_horizon_gethostid
import io.github.kotlinmania.libc.unix.newlib.horizon.cinterop.libc_unix_newlib_horizon_getrandom
import io.github.kotlinmania.libc.unix.newlib.horizon.cinterop.libc_unix_newlib_horizon_pthreadAttrGetprocessoridNp
import io.github.kotlinmania.libc.unix.newlib.horizon.cinterop.libc_unix_newlib_horizon_pthreadAttrGetschedparam
import io.github.kotlinmania.libc.unix.newlib.horizon.cinterop.libc_unix_newlib_horizon_pthreadAttrSetprocessoridNp
import io.github.kotlinmania.libc.unix.newlib.horizon.cinterop.libc_unix_newlib_horizon_pthreadAttrSetschedparam
import io.github.kotlinmania.libc.unix.newlib.horizon.cinterop.libc_unix_newlib_horizon_pthreadCondattrGetclock
import io.github.kotlinmania.libc.unix.newlib.horizon.cinterop.libc_unix_newlib_horizon_pthreadCondattrSetclock
import io.github.kotlinmania.libc.unix.newlib.horizon.cinterop.libc_unix_newlib_horizon_pthreadCreate
import io.github.kotlinmania.libc.unix.newlib.horizon.cinterop.libc_unix_newlib_horizon_pthreadGetprocessoridNp
import io.github.kotlinmania.libc.unix.newlib.horizon.cinterop.libc_unix_newlib_horizon_pthreadGetschedparam
import io.github.kotlinmania.libc.unix.newlib.horizon.cinterop.libc_unix_newlib_horizon_pthreadSetschedparam
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer

public actual fun pthreadCreate(native: COpaquePointer?, attr: COpaquePointer?, f: PthreadCreateFCallback, value: COpaquePointer?): CInt =
    libc_unix_newlib_horizon_pthreadCreate(native?.value?.toCPointer<ByteVar>(), attr?.value?.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), value?.value?.toCPointer<ByteVar>())

public actual fun pthreadAttrGetschedparam(attr: COpaquePointer?, param: COpaquePointer?): CInt =
    libc_unix_newlib_horizon_pthreadAttrGetschedparam(attr?.value?.toCPointer<ByteVar>(), param?.value?.toCPointer<ByteVar>())

public actual fun pthreadAttrSetschedparam(attr: COpaquePointer?, param: COpaquePointer?): CInt =
    libc_unix_newlib_horizon_pthreadAttrSetschedparam(attr?.value?.toCPointer<ByteVar>(), param?.value?.toCPointer<ByteVar>())

public actual fun pthreadAttrGetprocessoridNp(attr: COpaquePointer?, processorId: COpaquePointer?): CInt =
    libc_unix_newlib_horizon_pthreadAttrGetprocessoridNp(attr?.value?.toCPointer<ByteVar>(), processorId?.value?.toCPointer<ByteVar>())

public actual fun pthreadAttrSetprocessoridNp(attr: COpaquePointer?, processorId: CInt): CInt =
    libc_unix_newlib_horizon_pthreadAttrSetprocessoridNp(attr?.value?.toCPointer<ByteVar>(), processorId)

public actual fun pthreadGetschedparam(native: PthreadT, policy: COpaquePointer?, param: COpaquePointer?): CInt =
    libc_unix_newlib_horizon_pthreadGetschedparam(native.toLong().toCPointer<ByteVar>(), policy?.value?.toCPointer<ByteVar>(), param?.value?.toCPointer<ByteVar>())

public actual fun pthreadSetschedparam(native: PthreadT, policy: CInt, param: COpaquePointer?): CInt =
    libc_unix_newlib_horizon_pthreadSetschedparam(native.toLong().toCPointer<ByteVar>(), policy, param?.value?.toCPointer<ByteVar>())

public actual fun pthreadCondattrGetclock(attr: COpaquePointer?, clockId: COpaquePointer?): CInt =
    libc_unix_newlib_horizon_pthreadCondattrGetclock(attr?.value?.toCPointer<ByteVar>(), clockId?.value?.toCPointer<ByteVar>())

public actual fun pthreadCondattrSetclock(attr: COpaquePointer?, clockId: ClockidT): CInt =
    libc_unix_newlib_horizon_pthreadCondattrSetclock(attr?.value?.toCPointer<ByteVar>(), clockId)

public actual fun pthreadGetprocessoridNp(): CInt =
    libc_unix_newlib_horizon_pthreadGetprocessoridNp()

public actual fun getrandom(buf: COpaquePointer?, buflen: SizeT, flags: CUint): SsizeT =
    libc_unix_newlib_horizon_getrandom(buf?.value?.toCPointer<ByteVar>(), buflen, flags)

public actual fun gethostid(): CLong =
    libc_unix_newlib_horizon_gethostid()
