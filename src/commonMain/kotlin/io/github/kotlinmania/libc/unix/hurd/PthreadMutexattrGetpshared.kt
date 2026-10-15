// port-lint: source unix/hurd/mod.rs
package io.github.kotlinmania.libc.unix.hurd

import io.github.kotlinmania.libc.*

public expect fun pthreadMutexattrGetpshared(attr: io.github.kotlinmania.libc.unix.hurd.PthreadMutexattr?, pshared: Int?): Int
