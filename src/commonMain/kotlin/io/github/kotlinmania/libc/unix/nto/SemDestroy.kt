// port-lint: source unix/nto/mod.rs
package io.github.kotlinmania.libc.unix.nto

import io.github.kotlinmania.libc.*

public expect fun semDestroy(sem: io.github.kotlinmania.libc.unix.nto.SyncT?): Int
