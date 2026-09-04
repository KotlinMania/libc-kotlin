// port-lint: source Qos.rs
package io.github.kotlinmania.libc.new.apple.libpthread.pthread

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.new.apple.libpthread.sys.QosClassT






public actual fun pthreadAttrSetQosClassNp(attr: PthreadAttrT, `class`: QosClassT, priority: CInt): CInt =
    throw UnsupportedOperationException("pthreadAttrSetQosClassNp not available on JVM — no C library access")

public actual fun pthreadAttrGetQosClassNp(attr: PthreadAttrT, `class`: QosClassT?, priority: CInt?): CInt =
    throw UnsupportedOperationException("pthreadAttrGetQosClassNp not available on JVM — no C library access")

public actual fun pthreadSetQosClassSelfNp(`class`: QosClassT, priority: CInt): CInt =
    throw UnsupportedOperationException("pthreadSetQosClassSelfNp not available on JVM — no C library access")

public actual fun pthreadGetQosClassNp(thread: PthreadT, `class`: QosClassT?, priority: CInt?): CInt =
    throw UnsupportedOperationException("pthreadGetQosClassNp not available on JVM — no C library access")
