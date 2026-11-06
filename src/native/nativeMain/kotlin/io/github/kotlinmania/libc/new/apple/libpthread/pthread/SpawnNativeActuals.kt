@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class)

package io.github.kotlinmania.libc.new.apple.libpthread.pthread

import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer
import io.github.kotlinmania.libc.*
import kotlinx.cinterop.*

public actual fun posixSpawnattrSetQosClassNp(attr: PosixSpawnattrT?, qosClass: QosClassT): CInt =
    io.github.kotlinmania.libc.cinterop.libc_spawn_posix_spawnattr_set_qos_class_np(attr?.value?.toCPointer<ByteVar>(), qosClass.toInt())

public actual fun posixSpawnattrGetQosClassNp(attr: PosixSpawnattrT?, qosClass: QosClassT?): CInt =
    io.github.kotlinmania.libc.cinterop.libc_spawn_posix_spawnattr_get_qos_class_np(attr?.value?.toCPointer<ByteVar>(), qosClass?.value?.toCPointer<ByteVar>())
