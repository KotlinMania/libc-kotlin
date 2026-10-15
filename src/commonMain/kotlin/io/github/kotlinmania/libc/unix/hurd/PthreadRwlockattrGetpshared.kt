// port-lint: source unix/hurd/mod.rs
package io.github.kotlinmania.libc.unix.hurd

import io.github.kotlinmania.libc.*

public expect fun pthreadRwlockattrGetpshared(attr: io.github.kotlinmania.libc.unix.hurd.PthreadRwlockattr?, `val`: Int?): Int
