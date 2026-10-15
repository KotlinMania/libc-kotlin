// port-lint: source unix/aix/mod.rs
package io.github.kotlinmania.libc.unix.aix

import io.github.kotlinmania.libc.*

public expect fun sendFile(socket: Int?, iobuf: SfParms?, flags: UInt): Long
