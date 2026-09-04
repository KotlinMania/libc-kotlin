// port-lint: source Timex.rs
package io.github.kotlinmania.libc.new.netbsd.sys

import io.github.kotlinmania.libc.*

public actual fun ntpGettime(buf: Ntptimeval?): CInt =
    throw UnsupportedOperationException("ntpGettime not available on WASI — no C library access")

public actual fun ntpAdjtime(buf: Timex?): CInt =
    throw UnsupportedOperationException("ntpAdjtime not available on WASI — no C library access")

