// port-lint: source Fcntl.rs
package io.github.kotlinmania.libc.new.qurt

import io.github.kotlinmania.libc.*

public actual fun open(pathname: String?, flags: CInt, vararg args: Any?): CInt =
    throw UnsupportedOperationException("open requires N-API addon")

public actual fun creat(pathname: String?, mode: ModeT): CInt =
    throw UnsupportedOperationException("creat requires N-API addon")

public actual fun fcntl(fd: CInt, cmd: CInt, vararg args: Any?): CInt =
    throw UnsupportedOperationException("fcntl requires N-API addon")

