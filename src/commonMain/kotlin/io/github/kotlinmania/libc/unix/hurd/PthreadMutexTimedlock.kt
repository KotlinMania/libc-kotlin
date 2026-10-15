// port-lint: source unix/hurd/mod.rs
package io.github.kotlinmania.libc.unix.hurd

import io.github.kotlinmania.libc.*

public expect fun pthreadMutexTimedlock(lock: io.github.kotlinmania.libc.unix.hurd.PthreadMutex?, abstime: Timespec?): Int
