// port-lint: source unix/nto/mod.rs
package io.github.kotlinmania.libc.unix.nto

import io.github.kotlinmania.libc.*

public expect fun pthreadRwlockattrGetpshared(attr: io.github.kotlinmania.libc.unix.nto.SyncAttr?, `val`: Int?): Int
