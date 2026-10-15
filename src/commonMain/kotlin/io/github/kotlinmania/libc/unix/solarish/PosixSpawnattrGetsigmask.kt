// port-lint: source unix/solarish/mod.rs
package io.github.kotlinmania.libc.unix.solarish

import io.github.kotlinmania.libc.*

public expect fun posixSpawnattrGetsigmask(attr: io.github.kotlinmania.libc.COpaquePointer?, sigmask: SigsetT?): Int
