// port-lint: source new/apple/libpthread/pthread_/qos.rs
package io.github.kotlinmania.libc.new.apple.libpthread.pthread

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.new.apple.libpthread.sys.QosClassT

/**
 * Header: `pthread/qos.h`.
 */

public expect fun pthreadAttrSetQosClassNp(
    attr: PthreadAttrT?,
    qosClass: QosClassT,
    priority: CInt,
): CInt

public expect fun pthreadAttrGetQosClassNp(
    attr: PthreadAttrT?,
    qosClass: QosClassT?,
    priority: CInt?,
): CInt

public expect fun pthreadSetQosClassSelfNp(qosClass: QosClassT, priority: CInt): CInt

public expect fun pthreadGetQosClassNp(
    thread: PthreadT,
    qosClass: QosClassT?,
    priority: CInt?,
): CInt
