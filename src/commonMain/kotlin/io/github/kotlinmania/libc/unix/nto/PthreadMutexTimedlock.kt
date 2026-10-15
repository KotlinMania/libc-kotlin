// port-lint: source unix/nto/mod.rs
package io.github.kotlinmania.libc.unix.nto

import io.github.kotlinmania.libc.*

public expect fun pthreadMutexTimedlock(lock: io.github.kotlinmania.libc.unix.nto.SyncT?, abstime: Timespec?): Int
