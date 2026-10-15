// port-lint: source unix/cygwin/mod.rs
package io.github.kotlinmania.libc.unix.cygwin

import io.github.kotlinmania.libc.*

public expect fun posixSpawnp(pid: Int?, file: String?, fileActions: io.github.kotlinmania.libc.COpaquePointer?, attrp: io.github.kotlinmania.libc.COpaquePointer?, argv: COpaquePointer?, envp: COpaquePointer?): Int
