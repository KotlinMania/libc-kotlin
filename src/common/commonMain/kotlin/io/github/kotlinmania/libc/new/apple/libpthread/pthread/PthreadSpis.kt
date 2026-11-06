// port-lint: source new/apple/libpthread/pthread_/pthread_spis.rs
package io.github.kotlinmania.libc.new.apple.libpthread.pthread

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.COpaquePointer
import io.github.kotlinmania.libc.LibcDynamicFfi
import io.github.kotlinmania.libc.new.apple.libpthread.sys.pthread.PthreadAttrT
import io.github.kotlinmania.libc.new.qurt.PthreadT

// Header: `pthread / pthreadSpis.h`
//
// <https://github.com/apple-oss-distributions/libpthread/blob/main/include/pthread/pthreadSpis.h>

public fun interface PthreadCreateFromMachThreadFCallback {
    public operator fun invoke(arg0: COpaquePointer?): COpaquePointer?
}

public fun pthreadCreateFromMachThread(thread: PthreadT?, attr: PthreadAttrT?, f: PthreadCreateFromMachThreadFCallback, value: COpaquePointer?): CInt {
    val __slot_0 = if (thread == null) 0L else LibcDynamicFfi.allocScalarSlot(thread.toLong())
    val __slot_1 = if (attr == null) 0L else LibcDynamicFfi.allocScalarSlot(attr.toLong())
    val __scratch_2 = LibcDynamicFfi.allocZeroed(4096)
    try {
        return LibcDynamicFfi.invoke("pthread_create_from_mach_thread", -1, longArrayOf(__slot_0, __slot_1, __scratch_2, value?.value ?: 0L)).toInt()
    } finally {
        if (__slot_0 != 0L) LibcDynamicFfi.freeMem(__slot_0)
        if (__slot_1 != 0L) LibcDynamicFfi.freeMem(__slot_1)
        if (__scratch_2 != 0L) LibcDynamicFfi.freeMem(__scratch_2)
    }
}
