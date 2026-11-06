package io.github.kotlinmania.libc.new.apple.libpthread.pthread

import io.github.kotlinmania.libc.COpaquePointer

public actual fun posixSpawnattrSetQosClassNp(attr: PosixSpawnattrT?, qosClass: QosClassT): CInt =
    js("require('@kotlinmania/libc-native-bindings').posixSpawnattrSetQosClassNp(attr?.toLong() ?: 0L, qosClass)") as CInt

public actual fun posixSpawnattrGetQosClassNp(attr: PosixSpawnattrT?, qosClass: QosClassT?): CInt =
    js("require('@kotlinmania/libc-native-bindings').posixSpawnattrGetQosClassNp(attr?.toLong() ?: 0L, qosClass?.toLong() ?: 0L)") as CInt
