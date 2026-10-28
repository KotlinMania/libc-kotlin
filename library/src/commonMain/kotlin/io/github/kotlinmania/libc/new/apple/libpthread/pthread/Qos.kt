// port-lint: source new/apple/libpthread/pthread_/qos.rs
package io.github.kotlinmania.libc.new.apple.libpthread.pthread

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.new.apple.libpthread.sys.QosClassT

public expect fun pthreadAttrSetQosClassNp(attr: io.github.kotlinmania.libc.COpaquePointer?, `class`: QosClassT, priority: Int): Int

public expect fun pthreadAttrGetQosClassNp(attr: io.github.kotlinmania.libc.COpaquePointer?, `class`: QosClassT?, priority: Int?): Int

public expect fun pthreadSetQosClassSelfNp(`class`: QosClassT, priority: Int): Int

public expect fun pthreadGetQosClassNp(thread: ULong, `class`: QosClassT?, priority: Int?): Int
