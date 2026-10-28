// port-lint: source Qos.rs
package io.github.kotlinmania.libc.new.apple.libpthread.pthread

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.new.apple.libpthread.sys.QosClassT

public actual fun pthreadAttrSetQosClassNp(attr: io.github.kotlinmania.libc.COpaquePointer?, `class`: QosClassT, priority: Int): Int =
    throw UnsupportedOperationException("pthreadAttrSetQosClassNp requires N-API addon")

public actual fun pthreadAttrGetQosClassNp(attr: io.github.kotlinmania.libc.COpaquePointer?, `class`: QosClassT?, priority: Int?): Int =
    throw UnsupportedOperationException("pthreadAttrGetQosClassNp requires N-API addon")

public actual fun pthreadSetQosClassSelfNp(`class`: QosClassT, priority: Int): Int =
    throw UnsupportedOperationException("pthreadSetQosClassSelfNp requires N-API addon")

public actual fun pthreadGetQosClassNp(thread: ULong, `class`: QosClassT?, priority: Int?): Int =
    throw UnsupportedOperationException("pthreadGetQosClassNp requires N-API addon")
