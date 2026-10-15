// port-lint: source vxworks/mod.rs
package io.github.kotlinmania.libc.vxworks

import io.github.kotlinmania.libc.*

public expect fun fread(ptr: COpaquePointer?, size: ULong, nobj: ULong, stream: FILE?): ULong
