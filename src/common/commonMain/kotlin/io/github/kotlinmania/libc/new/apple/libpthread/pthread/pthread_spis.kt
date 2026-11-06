// port-lint: source new/apple/libpthread/pthread_/pthread_spis.rs
package io.github.kotlinmania.libc.new.apple.libpthread.pthread

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.COpaquePointer
import io.github.kotlinmania.libc.PthreadAttrT
import io.github.kotlinmania.libc.PthreadT

// Header: `pthread / pthreadSpis.h`
//
// <https://github.com/apple-oss-distributions/libpthread/blob/main/include/pthread/pthreadSpis.h>

public fun interface PthreadCreateFromMachThreadFCallback {
    public operator fun invoke(arg0: COpaquePointer?): COpaquePointer?
}

public expect fun pthreadCreateFromMachThread(thread: PthreadT?, attr: PthreadAttrT?, f: PthreadCreateFromMachThreadFCallback, value: COpaquePointer?): CInt
