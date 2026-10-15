// port-lint: source Spawn.rs
package io.github.kotlinmania.libc.new.apple.libpthread.pthread

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.new.apple.libpthread.sys.QosClassT

public actual fun posixSpawnattrSetQosClassNp(attr: io.github.kotlinmania.libc.COpaquePointer?, qosClass: QosClassT): Int =
    throw UnsupportedOperationException("posixSpawnattrSetQosClassNp requires N-API addon")

public actual fun posixSpawnattrGetQosClassNp(attr: io.github.kotlinmania.libc.COpaquePointer?, qosClass: QosClassT?): Int =
    throw UnsupportedOperationException("posixSpawnattrGetQosClassNp requires N-API addon")
