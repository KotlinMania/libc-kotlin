// port-lint: source new/apple/libpthread/pthread_/spawn.rs
package io.github.kotlinmania.libc.new.apple.libpthread.pthread

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.LibcDynamicFfi
import io.github.kotlinmania.libc.new.apple.libpthread.sys.QosClassT
import io.github.kotlinmania.libc.unix.bsd.apple.PosixSpawnattrT

// Header: `pthread / spawn.h`
//
// <https://github.com/apple-oss-distributions/libpthread/blob/main/include/pthread/spawn.h>

public fun posixSpawnattrSetQosClassNp(attr: PosixSpawnattrT?, qosClass: QosClassT): CInt {
    val __slot_0 = if (attr == null) 0L else LibcDynamicFfi.allocScalarSlot(attr.toLong())
    val __scratch_1 = LibcDynamicFfi.allocZeroed(4096)
    try {
        return LibcDynamicFfi.invoke("posix_spawnattr_set_qos_class_np", -1, longArrayOf(__slot_0, __scratch_1)).toInt()
    } finally {
        if (__slot_0 != 0L) LibcDynamicFfi.freeMem(__slot_0)
        if (__scratch_1 != 0L) LibcDynamicFfi.freeMem(__scratch_1)
    }
}

public fun posixSpawnattrGetQosClassNp(attr: PosixSpawnattrT?, qosClass: QosClassT?): CInt {
    val __slot_0 = if (attr == null) 0L else LibcDynamicFfi.allocScalarSlot(attr.toLong())
    try {
        return LibcDynamicFfi.invoke("posix_spawnattr_get_qos_class_np", -1, longArrayOf(__slot_0, qosClass?.value ?: 0L)).toInt()
    } finally {
        if (__slot_0 != 0L) LibcDynamicFfi.freeMem(__slot_0)
    }
}
