// port-lint: source vxworks/mod.rs
package io.github.kotlinmania.libc.vxworks

import io.github.kotlinmania.libc.*

public expect fun memccpy(dest: COpaquePointer?, src: COpaquePointer?, c: Int, n: ULong): COpaquePointer?
