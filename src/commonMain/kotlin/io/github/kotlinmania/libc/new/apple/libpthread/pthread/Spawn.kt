// port-lint: source new/apple/libpthread/pthread_/spawn.rs
package io.github.kotlinmania.libc.new.apple.libpthread.pthread

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.new.apple.libpthread.sys.QosClassT

public fun posixSpawnattrSetQosClassNp(attr: PosixSpawnattrT, qosClass: QosClassT): CInt = -1
public fun posixSpawnattrGetQosClassNp(attr: PosixSpawnattrT, qosClass: QosClassT?): CInt = -1