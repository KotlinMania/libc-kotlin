package io.github.kotlinmania.libc.new.apple.libpthread.pthread

import io.github.kotlinmania.libc.COpaquePointer

internal object SpawnRawLibc {
    external fun posixSpawnattrSetQosClassNp(attr: Long, qosClass: Long): Int
    external fun posixSpawnattrGetQosClassNp(attr: Long, qosClass: Long): Int
}

public actual fun posixSpawnattrSetQosClassNp(attr: PosixSpawnattrT?, qosClass: QosClassT): CInt =
    SpawnRawLibc.posixSpawnattrSetQosClassNp(attr?.toLong() ?: 0L, qosClass)

public actual fun posixSpawnattrGetQosClassNp(attr: PosixSpawnattrT?, qosClass: QosClassT?): CInt =
    SpawnRawLibc.posixSpawnattrGetQosClassNp(attr?.toLong() ?: 0L, qosClass?.toLong() ?: 0L)
