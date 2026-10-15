// port-lint: source Qos.rs
package io.github.kotlinmania.libc.new.apple.libpthread.pthread

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.new.apple.libpthread.sys.QosClassT

public actual fun pthreadAttrSetQosClassNp(attr: io.github.kotlinmania.libc.COpaquePointer?, `class`: QosClassT, priority: Int): Int =
    throw UnsupportedOperationException("pthreadAttrSetQosClassNp not available on Android host — use androidNative target for FFI")

public actual fun pthreadAttrGetQosClassNp(attr: io.github.kotlinmania.libc.COpaquePointer?, `class`: QosClassT?, priority: Int?): Int =
    throw UnsupportedOperationException("pthreadAttrGetQosClassNp not available on Android host — use androidNative target for FFI")

public actual fun pthreadSetQosClassSelfNp(`class`: QosClassT, priority: Int): Int =
    throw UnsupportedOperationException("pthreadSetQosClassSelfNp not available on Android host — use androidNative target for FFI")

public actual fun pthreadGetQosClassNp(thread: ULong, `class`: QosClassT?, priority: Int?): Int =
    throw UnsupportedOperationException("pthreadGetQosClassNp not available on Android host — use androidNative target for FFI")
