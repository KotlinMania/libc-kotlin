// port-lint: source new/apple/libpthread/pthread_/qos.rs
package io.github.kotlinmania.libc.new.apple.libpthread.pthread

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.new.apple.libpthread.sys.QosClassT

public fun pthreadAttrSetQosClassNp(attr: PthreadAttrT, `class`: QosClassT, priority: CInt): CInt = -1
public fun pthreadAttrGetQosClassNp(attr: PthreadAttrT, `class`: QosClassT?, priority: CInt?): CInt = -1
public fun pthreadSetQosClassSelfNp(`class`: QosClassT, priority: CInt): CInt = -1
public fun pthreadGetQosClassNp(thread: PthreadT, `class`: QosClassT?, priority: CInt?): CInt = -1