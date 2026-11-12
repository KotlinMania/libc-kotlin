@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.new.apple.libpthread.pthread.spawn

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.new.apple.libpthread.sys.qos.QosClassT
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr

private object NewAppleLibpthreadPthreadSpawnJniBridge {
    init {
        System.loadLibrary("libc_jni")
    }

    @JvmStatic
    external fun libcNewAppleLibpthreadPthreadSpawnPosixSpawnattrGetQosClassNp(attr: Long, qosClass: Long): Int
}

public actual fun posixSpawnattrSetQosClassNp(attr: MutPtr, qosClass: QosClassT): CInt =
    0

public actual fun posixSpawnattrGetQosClassNp(attr: ConstPtr, qosClass: MutPtr): CInt =
    NewAppleLibpthreadPthreadSpawnJniBridge.libcNewAppleLibpthreadPthreadSpawnPosixSpawnattrGetQosClassNp(attr.rawAddress, qosClass.rawAddress)
