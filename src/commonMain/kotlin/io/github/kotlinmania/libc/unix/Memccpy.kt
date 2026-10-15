// port-lint: source unix/mod.rs
package io.github.kotlinmania.libc.unix

import io.github.kotlinmania.libc.*

public expect fun memccpy(dest: COpaquePointer?, src: COpaquePointer?, c: Int, n: ULong): COpaquePointer?
