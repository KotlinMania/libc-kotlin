// port-lint: source Qos.rs
@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class)

package io.github.kotlinmania.libc.new.apple.libpthread.pthread

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.new.apple.libpthread.sys.QosClassT
import kotlinx.cinterop.ExperimentalForeignApi

public actual fun pthreadAttrSetQosClassNp(attr: io.github.kotlinmania.libc.COpaquePointer?, `class`: QosClassT, priority: Int): Int =
    throw UnsupportedOperationException("pthreadAttrSetQosClassNp requires manual FFI bridge for ambiguous type")

public actual fun pthreadAttrGetQosClassNp(attr: io.github.kotlinmania.libc.COpaquePointer?, `class`: QosClassT?, priority: Int?): Int =
    throw UnsupportedOperationException("pthreadAttrGetQosClassNp requires manual FFI bridge for ambiguous type")

public actual fun pthreadSetQosClassSelfNp(`class`: QosClassT, priority: Int): Int =
    throw UnsupportedOperationException("pthreadSetQosClassSelfNp requires manual FFI bridge for ambiguous type")

public actual fun pthreadGetQosClassNp(thread: ULong, `class`: QosClassT?, priority: Int?): Int =
    throw UnsupportedOperationException("pthreadGetQosClassNp requires manual FFI bridge for ambiguous type")
