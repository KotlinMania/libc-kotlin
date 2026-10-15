// port-lint: source unix/nto/mod.rs
package io.github.kotlinmania.libc.unix.nto

import io.github.kotlinmania.libc.*

public expect fun posixSpawnFileActionsInit(actions: io.github.kotlinmania.libc.COpaquePointer?): Int
