// port-lint: source unix/haiku/mod.rs
package io.github.kotlinmania.libc.unix.haiku

import io.github.kotlinmania.libc.*

public expect fun posixSpawnFileActionsAdddup2(fileActions: io.github.kotlinmania.libc.COpaquePointer?, fildes: Int, newfildes: Int): Int
