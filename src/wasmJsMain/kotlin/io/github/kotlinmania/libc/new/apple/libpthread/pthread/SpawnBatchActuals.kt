// port-lint: source Spawn.rs
package io.github.kotlinmania.libc.new.apple.libpthread.pthread

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.new.apple.libpthread.sys.QosClassT




public actual fun posixSpawnattrSetQosClassNp(attr: PosixSpawnattrT, qosClass: QosClassT): CInt =
    throw UnsupportedOperationException("posixSpawnattrSetQosClassNp requires N-API addon")

public actual fun posixSpawnattrGetQosClassNp(attr: PosixSpawnattrT, qosClass: QosClassT?): CInt =
    throw UnsupportedOperationException("posixSpawnattrGetQosClassNp requires N-API addon")
