// port-lint: source unix/mod.rs
package io.github.kotlinmania.libc.unix

import io.github.kotlinmania.libc.*

public expect fun gethostname(name: COpaquePointer?, len: ULong): Int
