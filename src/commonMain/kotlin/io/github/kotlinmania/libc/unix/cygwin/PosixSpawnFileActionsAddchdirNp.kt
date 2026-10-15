// port-lint: source unix/cygwin/mod.rs
package io.github.kotlinmania.libc.unix.cygwin

import io.github.kotlinmania.libc.*

public expect fun posixSpawnFileActionsAddchdirNp(actions: io.github.kotlinmania.libc.COpaquePointer?, path: String?): Int
