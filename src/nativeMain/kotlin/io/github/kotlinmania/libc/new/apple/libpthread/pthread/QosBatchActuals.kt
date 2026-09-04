// port-lint: source Qos.rs
@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class)

package io.github.kotlinmania.libc.new.apple.libpthread.pthread

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.new.apple.libpthread.sys.QosClassT
import kotlinx.cinterop.ExperimentalForeignApi





public actual fun pthreadAttrSetQosClassNp(attr: PthreadAttrT, `class`: QosClassT, priority: CInt): CInt =
    throw UnsupportedOperationException("pthreadAttrSetQosClassNp requires manual FFI bridge for ambiguous type")

public actual fun pthreadAttrGetQosClassNp(attr: PthreadAttrT, `class`: QosClassT?, priority: CInt?): CInt =
    throw UnsupportedOperationException("pthreadAttrGetQosClassNp requires manual FFI bridge for ambiguous type")

public actual fun pthreadSetQosClassSelfNp(`class`: QosClassT, priority: CInt): CInt =
    throw UnsupportedOperationException("pthreadSetQosClassSelfNp requires manual FFI bridge for ambiguous type")

public actual fun pthreadGetQosClassNp(thread: PthreadT, `class`: QosClassT?, priority: CInt?): CInt =
    throw UnsupportedOperationException("pthreadGetQosClassNp requires manual FFI bridge for ambiguous type")
