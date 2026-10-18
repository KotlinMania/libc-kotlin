@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class)

package io.github.kotlinmania.libc.unix.newlib.horizon

import io.github.kotlinmania.libc.*
import kotlinx.cinterop.ExperimentalForeignApi

public actual fun pthreadAttrGetschedparam(attr: io.github.kotlinmania.libc.COpaquePointer?, param: SchedParam?): Int =
    throw UnsupportedOperationException("pthreadAttrGetschedparam requires manual FFI bridge — not yet implemented")

public actual fun pthreadAttrSetschedparam(attr: io.github.kotlinmania.libc.COpaquePointer?, param: SchedParam?): Int =
    throw UnsupportedOperationException("pthreadAttrSetschedparam requires manual FFI bridge — not yet implemented")

public actual fun pthreadAttrGetprocessoridNp(attr: io.github.kotlinmania.libc.COpaquePointer?, processorId: Int?): Int =
    throw UnsupportedOperationException("pthreadAttrGetprocessoridNp requires manual FFI bridge — not yet implemented")

public actual fun pthreadAttrSetprocessoridNp(attr: io.github.kotlinmania.libc.COpaquePointer?, processorId: Int): Int =
    throw UnsupportedOperationException("pthreadAttrSetprocessoridNp requires manual FFI bridge — not yet implemented")

public actual fun pthreadGetschedparam(native: ULong, policy: Int?, param: SchedParam?): Int =
    throw UnsupportedOperationException("pthreadGetschedparam requires manual FFI bridge — not yet implemented")

public actual fun pthreadSetschedparam(native: ULong, policy: Int, param: SchedParam?): Int =
    throw UnsupportedOperationException("pthreadSetschedparam requires manual FFI bridge — not yet implemented")

public actual fun pthreadCondattrGetclock(attr: io.github.kotlinmania.libc.COpaquePointer?, clockId: Int?): Int =
    throw UnsupportedOperationException("pthreadCondattrGetclock requires manual FFI bridge — not yet implemented")

public actual fun pthreadCondattrSetclock(attr: io.github.kotlinmania.libc.COpaquePointer?, clockId: Int): Int =
    throw UnsupportedOperationException("pthreadCondattrSetclock requires manual FFI bridge — not yet implemented")

public actual fun pthreadGetprocessoridNp(): Int =
    throw UnsupportedOperationException("pthreadGetprocessoridNp requires manual FFI bridge — not yet implemented")

public actual fun getrandom(buf: COpaquePointer?, buflen: ULong, flags: UInt): Long =
    throw UnsupportedOperationException("getrandom requires manual FFI bridge — not yet implemented")

public actual fun gethostid(): Long =
    throw UnsupportedOperationException("gethostid requires FFI bridge")

public actual fun pthreadCreate(native: ULong?, attr: io.github.kotlinmania.libc.COpaquePointer?, f: ((COpaquePointer?) -> COpaquePointer?)?, value: COpaquePointer?): Int =
    throw UnsupportedOperationException("pthreadCreate requires FFI bridge")
