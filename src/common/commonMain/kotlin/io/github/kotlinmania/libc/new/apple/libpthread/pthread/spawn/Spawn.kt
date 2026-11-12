// port-lint: source new/apple/libpthread/pthread_/spawn.rs
package io.github.kotlinmania.libc.new.apple.libpthread.pthread.spawn

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.new.apple.libpthread.sys.qos.QosClassT
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr

// Header: `pthread / spawn.h`
//
// <https://github.com/apple-oss-distributions/libpthread/blob/main/include/pthread/spawn.h>

public expect fun posixSpawnattrSetQosClassNp(attr: MutPtr, qosClass: QosClassT): CInt

public expect fun posixSpawnattrGetQosClassNp(attr: ConstPtr, qosClass: MutPtr): CInt
