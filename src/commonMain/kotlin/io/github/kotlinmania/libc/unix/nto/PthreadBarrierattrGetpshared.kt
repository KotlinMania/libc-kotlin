// port-lint: source unix/nto/mod.rs
package io.github.kotlinmania.libc.unix.nto

import io.github.kotlinmania.libc.*

public expect fun pthreadBarrierattrGetpshared(attr: io.github.kotlinmania.libc.unix.nto.SyncAttr?, pshared: Int?): Int
