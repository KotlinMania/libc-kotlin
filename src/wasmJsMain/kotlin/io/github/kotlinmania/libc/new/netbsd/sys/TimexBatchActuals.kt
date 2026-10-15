// port-lint: source Timex.rs
package io.github.kotlinmania.libc.new.netbsd.sys

import io.github.kotlinmania.libc.*

public actual fun ntpGettime(buf: Ntptimeval?): Int =
    throw UnsupportedOperationException("ntpGettime requires N-API addon")

public actual fun ntpAdjtime(buf: Timex?): Int =
    throw UnsupportedOperationException("ntpAdjtime requires N-API addon")
