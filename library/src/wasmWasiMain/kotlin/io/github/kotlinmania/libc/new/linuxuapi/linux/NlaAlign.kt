// port-lint: source Netlink.rs
package io.github.kotlinmania.libc.new.linuxuapi.linux

import io.github.kotlinmania.libc.*

public actual fun nlaAlign(len: Int): Int =
    throw UnsupportedOperationException("nLAALIGN not available on WASI — no C library access")
