// port-lint: source unix/bsd/freebsdlike/freebsd/mod.rs
package io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd

import io.github.kotlinmania.libc.*

public expect fun pthreadMutexConsistent(mutex: io.github.kotlinmania.libc.COpaquePointer?): Int
