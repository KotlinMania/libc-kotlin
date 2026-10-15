// port-lint: source unix/bsd/netbsdlike/netbsd/mod.rs
package io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd

import io.github.kotlinmania.libc.*

public fun esetfunc(cb: ((Int, String?) -> Unit)?): ((Int, String?) -> Unit) = cb ?: throw IllegalArgumentException("callback required")
