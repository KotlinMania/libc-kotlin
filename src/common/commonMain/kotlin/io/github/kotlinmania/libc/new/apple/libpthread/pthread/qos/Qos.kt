// port-lint: source new/apple/libpthread/pthread_/qos.rs
package io.github.kotlinmania.libc.new.apple.libpthread.pthread.qos

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.COpaquePointer
import io.github.kotlinmania.libc.new.apple.libpthread.sys.qos.QosClassT
import io.github.kotlinmania.libc.new.qurt.PthreadT

// Header: `pthread / qos.h`
//
// <https://github.com/apple-oss-distributions/libpthread/blob/main/include/pthread/qos.h>

public expect fun pthreadAttrSetQosClassNp(attr: COpaquePointer?, cls: QosClassT, priority: CInt): CInt

public expect fun pthreadAttrGetQosClassNp(attr: COpaquePointer?, cls: COpaquePointer?, priority: COpaquePointer?): CInt

public expect fun pthreadSetQosClassSelfNp(cls: QosClassT, priority: CInt): CInt

public expect fun pthreadGetQosClassNp(thread: PthreadT, cls: COpaquePointer?, priority: COpaquePointer?): CInt
