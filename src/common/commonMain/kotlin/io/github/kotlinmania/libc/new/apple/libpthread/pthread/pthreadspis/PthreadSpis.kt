// port-lint: source new/apple/libpthread/pthread_/pthread_spis.rs
package io.github.kotlinmania.libc.new.apple.libpthread.pthread.pthreadspis

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr

// Header: `pthread / pthreadSpis.h`
//
// <https://github.com/apple-oss-distributions/libpthread/blob/main/include/pthread/pthreadSpis.h>

public fun interface PthreadCreateFromMachThreadFCallback {
    public operator fun invoke(arg0: MutPtr): MutPtr
}

public expect fun pthreadCreateFromMachThread(thread: MutPtr, attr: ConstPtr, f: PthreadCreateFromMachThreadFCallback, value: MutPtr): CInt
