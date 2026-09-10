// port-lint: source Netlink.rs
package io.github.kotlinmania.libc.new.linuxuapi.linux

import io.github.kotlinmania.libc.*

public actual fun nLAALIGN(len: CInt): CInt =
    throw UnsupportedOperationException("nLAALIGN not available on Android host — use androidNative target for FFI")

