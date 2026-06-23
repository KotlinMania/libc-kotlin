// port-lint: source new/apple/libpthread/pthread_/qos.rs
package io.github.kotlinmania.libc.new.apple.libpthread.pthread

import io.github.kotlinmania.libc.*
import kotlinx.cinterop.COpaquePointer

public expect fun pthreadAttrSetQosClassNp(attr: PthreadAttrT?, `class`: QosClassT, priority: CInt): CInt
public expect fun pthreadAttrGetQosClassNp(attr: PthreadAttrT?, `class`: QosClassT?, priority: CInt?): CInt
public expect fun pthreadSetQosClassSelfNp(`class`: QosClassT, priority: CInt): CInt
public expect fun pthreadGetQosClassNp(thread: PthreadT, `class`: QosClassT?, priority: CInt?): CInt
