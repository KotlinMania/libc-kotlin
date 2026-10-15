// port-lint: source unix/haiku/mod.rs
package io.github.kotlinmania.libc.unix.haiku

import io.github.kotlinmania.libc.*

public expect fun posixSpawnattrGetsigmask(attr: io.github.kotlinmania.libc.COpaquePointer?, sigmask: ULong?): Int
