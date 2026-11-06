// port-lint: source new/apple/libpthread/pthread_/stack_np.rs
package io.github.kotlinmania.libc.new.apple.libpthread.pthread

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.LibcDynamicFfi
import io.github.kotlinmania.libc.UintptrT

// Header: `pthread / stackNp.h`
//
// <https://github.com/apple-oss-distributions/libpthread/blob/main/include/pthread/stackNp.h>

public fun pthreadStackFrameDecodeNp(frameAddr: UintptrT, returnAddr: UintptrT?): UintptrT {
    val __slot_1 = if (returnAddr == null) 0L else LibcDynamicFfi.allocScalarSlot(returnAddr.toLong())
    try {
        return LibcDynamicFfi.invoke("pthread_stack_frame_decode_np", -1, longArrayOf(frameAddr.toLong(), __slot_1)).toULong()
    } finally {
        if (__slot_1 != 0L) LibcDynamicFfi.freeMem(__slot_1)
    }
}
