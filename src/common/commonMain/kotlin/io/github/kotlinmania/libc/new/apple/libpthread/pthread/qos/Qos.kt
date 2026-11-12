// port-lint: source new/apple/libpthread/pthread_/qos.rs
package io.github.kotlinmania.libc.new.apple.libpthread.pthread.qos

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.new.apple.libpthread.sys.pthread.pthreadtypes.PthreadAttrT
import io.github.kotlinmania.libc.new.apple.libpthread.sys.qos.QosClassT
import io.github.kotlinmania.libc.new.qurt.PthreadT
import io.github.kotlinmania.rustlang.core.ptr.MutPtr

// Header: `pthread / qos.h`
//
// <https://github.com/apple-oss-distributions/libpthread/blob/main/include/pthread/qos.h>

public expect fun pthreadAttrSetQosClassNp(attr: MutPtr<PthreadAttrT>, cls: QosClassT, priority: CInt): CInt

public expect fun pthreadAttrGetQosClassNp(attr: MutPtr<PthreadAttrT>, cls: MutPtr<QosClassT>, priority: MutPtr<CInt>): CInt

public expect fun pthreadSetQosClassSelfNp(cls: QosClassT, priority: CInt): CInt

public expect fun pthreadGetQosClassNp(thread: PthreadT, cls: MutPtr<QosClassT>, priority: MutPtr<CInt>): CInt
