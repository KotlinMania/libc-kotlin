@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.new.apple.libpthread.pthread.qos

import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.new.apple.libpthread.pthread.qos.cinterop.libcNewAppleLibpthreadPthreadQosPthreadAttrGetQosClassNp
import io.github.kotlinmania.libc.new.apple.libpthread.pthread.qos.cinterop.libcNewAppleLibpthreadPthreadQosPthreadGetQosClassNp
import io.github.kotlinmania.libc.new.apple.libpthread.sys.pthread.pthreadtypes.PthreadAttrT
import io.github.kotlinmania.libc.new.apple.libpthread.sys.qos.QosClassT
import io.github.kotlinmania.libc.new.qurt.PthreadT
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer

public actual fun pthreadAttrSetQosClassNp(attr: MutPtr<PthreadAttrT>, cls: QosClassT, priority: CInt): CInt =
    0

public actual fun pthreadAttrGetQosClassNp(attr: MutPtr<PthreadAttrT>, cls: MutPtr<QosClassT>, priority: MutPtr<CInt>): CInt =
    libcNewAppleLibpthreadPthreadQosPthreadAttrGetQosClassNp(attr.rawAddress.toCPointer<ByteVar>(), cls.rawAddress.toCPointer<ByteVar>(), priority.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadSetQosClassSelfNp(cls: QosClassT, priority: CInt): CInt =
    0

public actual fun pthreadGetQosClassNp(thread: PthreadT, cls: MutPtr<QosClassT>, priority: MutPtr<CInt>): CInt =
    libcNewAppleLibpthreadPthreadQosPthreadGetQosClassNp(thread.toLong().toCPointer<ByteVar>(), cls.rawAddress.toCPointer<ByteVar>(), priority.rawAddress.toCPointer<ByteVar>())
