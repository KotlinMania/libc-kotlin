// port-lint: source solid/mod.rs
package io.github.kotlinmania.libc.solid

import io.github.kotlinmania.libc.*

public expect fun memalign(align: ULong, size: ULong): COpaquePointer?
