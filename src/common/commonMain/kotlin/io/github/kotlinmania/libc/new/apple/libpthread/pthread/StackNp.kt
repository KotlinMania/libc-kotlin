// port-lint: source new/apple/libpthread/pthread_/stack_np.rs
package io.github.kotlinmania.libc.new.apple.libpthread.pthread

import io.github.kotlinmania.libc.*

// Header: `pthread / stackNp.h`
//
// <https://github.com/apple-oss-distributions/libpthread/blob/main/include/pthread/stackNp.h>

public expect fun pthreadStackFrameDecodeNp(frameAddr: UintptrT, returnAddr: UintptrT?): UintptrT
