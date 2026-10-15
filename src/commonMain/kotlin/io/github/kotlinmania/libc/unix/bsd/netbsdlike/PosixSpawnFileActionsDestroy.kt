// port-lint: source unix/bsd/netbsdlike/mod.rs
package io.github.kotlinmania.libc.unix.bsd.netbsdlike

import io.github.kotlinmania.libc.*

public expect fun posixSpawnFileActionsDestroy(actions: io.github.kotlinmania.libc.COpaquePointer?): Int
