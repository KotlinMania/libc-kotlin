// port-lint: source new/apple/libpthread/pthread_/stack_np.rs
package io.github.kotlinmania.libc.new.apple.libpthread.pthread

import io.github.kotlinmania.libc.*

/**
 * Header: `pthread/stack_np.h`.
 */

public expect fun pthreadStackFrameDecodeNp(
    frameAddr: ULong,
    returnAddr: ULong?,
): ULong
