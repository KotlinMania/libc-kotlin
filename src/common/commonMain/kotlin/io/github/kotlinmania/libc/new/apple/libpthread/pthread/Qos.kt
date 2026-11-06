// port-lint: source new/apple/libpthread/pthread_/qos.rs
package io.github.kotlinmania.libc.new.apple.libpthread.pthread

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.LibcDynamicFfi
import io.github.kotlinmania.libc.new.apple.libpthread.sys.QosClassT
import io.github.kotlinmania.libc.new.apple.libpthread.sys.pthread.PthreadAttrT
import io.github.kotlinmania.libc.new.qurt.PthreadT

// Header: `pthread / qos.h`
//
// <https://github.com/apple-oss-distributions/libpthread/blob/main/include/pthread/qos.h>

public fun pthreadAttrSetQosClassNp(attr: PthreadAttrT?, cls: QosClassT, priority: CInt): CInt {
    val __slot_0 = if (attr == null) 0L else LibcDynamicFfi.allocScalarSlot(attr.toLong())
    val __scratch_1 = LibcDynamicFfi.allocZeroed(4096)
    try {
        return LibcDynamicFfi.invoke("pthread_attr_set_qos_class_np", -1, longArrayOf(__slot_0, __scratch_1, priority.toLong())).toInt()
    } finally {
        if (__slot_0 != 0L) LibcDynamicFfi.freeMem(__slot_0)
        if (__scratch_1 != 0L) LibcDynamicFfi.freeMem(__scratch_1)
    }
}

public fun pthreadAttrGetQosClassNp(attr: PthreadAttrT?, cls: QosClassT?, priority: CInt?): CInt {
    val __slot_0 = if (attr == null) 0L else LibcDynamicFfi.allocScalarSlot(attr.toLong())
    val __slot_2 = if (priority == null) 0L else LibcDynamicFfi.allocScalarSlot(priority.toLong())
    try {
        return LibcDynamicFfi.invoke("pthread_attr_get_qos_class_np", -1, longArrayOf(__slot_0, cls?.value ?: 0L, __slot_2)).toInt()
    } finally {
        if (__slot_0 != 0L) LibcDynamicFfi.freeMem(__slot_0)
        if (__slot_2 != 0L) LibcDynamicFfi.freeMem(__slot_2)
    }
}

public fun pthreadSetQosClassSelfNp(cls: QosClassT, priority: CInt): CInt {
    val __scratch_0 = LibcDynamicFfi.allocZeroed(4096)
    try {
        return LibcDynamicFfi.invoke("pthread_set_qos_class_self_np", -1, longArrayOf(__scratch_0, priority.toLong())).toInt()
    } finally {
        if (__scratch_0 != 0L) LibcDynamicFfi.freeMem(__scratch_0)
    }
}

public fun pthreadGetQosClassNp(thread: PthreadT, cls: QosClassT?, priority: CInt?): CInt {
    val __slot_2 = if (priority == null) 0L else LibcDynamicFfi.allocScalarSlot(priority.toLong())
    try {
        return LibcDynamicFfi.invoke("pthread_get_qos_class_np", -1, longArrayOf(thread.toLong(), cls?.value ?: 0L, __slot_2)).toInt()
    } finally {
        if (__slot_2 != 0L) LibcDynamicFfi.freeMem(__slot_2)
    }
}
