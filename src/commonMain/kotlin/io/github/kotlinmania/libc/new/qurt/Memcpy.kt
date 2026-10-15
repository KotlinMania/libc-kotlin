// port-lint: source new/qurt/mod.rs
package io.github.kotlinmania.libc.new.qurt

import io.github.kotlinmania.libc.*

public expect fun memcpy(dest: COpaquePointer?, src: COpaquePointer?, n: ULong): COpaquePointer?
