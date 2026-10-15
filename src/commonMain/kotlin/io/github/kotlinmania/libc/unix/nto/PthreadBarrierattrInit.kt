// port-lint: source unix/nto/mod.rs
package io.github.kotlinmania.libc.unix.nto

import io.github.kotlinmania.libc.*

public expect fun pthreadBarrierattrInit(attr: io.github.kotlinmania.libc.unix.nto.SyncAttr?): Int
