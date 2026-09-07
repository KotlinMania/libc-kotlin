// port-lint: source Spawn.rs
package io.github.kotlinmania.libc.new.apple.libpthread.pthread

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.new.apple.libpthread.sys.QosClassT




public actual fun posixSpawnattrSetQosClassNp(attr: PosixSpawnattrT, qosClass: QosClassT): CInt =
    throw UnsupportedOperationException("posixSpawnattrSetQosClassNp not available on Android host — use androidNative target for FFI")

public actual fun posixSpawnattrGetQosClassNp(attr: PosixSpawnattrT, qosClass: QosClassT?): CInt =
    throw UnsupportedOperationException("posixSpawnattrGetQosClassNp not available on Android host — use androidNative target for FFI")
