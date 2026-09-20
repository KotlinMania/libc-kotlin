// port-lint: source Qos.rs
package io.github.kotlinmania.libc.new.apple.libpthread.pthread

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.new.apple.libpthread.sys.QosClassT






public actual fun pthreadAttrSetQosClassNp(attr: PthreadAttrT, `class`: QosClassT, priority: CInt): CInt =
    throw UnsupportedOperationException("pthreadAttrSetQosClassNp not available on Android host — use androidNative target for FFI")

public actual fun pthreadAttrGetQosClassNp(attr: PthreadAttrT, `class`: QosClassT?, priority: CInt?): CInt =
    throw UnsupportedOperationException("pthreadAttrGetQosClassNp not available on Android host — use androidNative target for FFI")

public actual fun pthreadSetQosClassSelfNp(`class`: QosClassT, priority: CInt): CInt =
    throw UnsupportedOperationException("pthreadSetQosClassSelfNp not available on Android host — use androidNative target for FFI")

public actual fun pthreadGetQosClassNp(thread: PthreadT, `class`: QosClassT?, priority: CInt?): CInt =
    throw UnsupportedOperationException("pthreadGetQosClassNp not available on Android host — use androidNative target for FFI")
