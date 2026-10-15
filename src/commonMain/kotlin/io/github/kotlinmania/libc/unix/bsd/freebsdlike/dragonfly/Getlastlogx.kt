// port-lint: source unix/bsd/freebsdlike/dragonfly/mod.rs
package io.github.kotlinmania.libc.unix.bsd.freebsdlike.dragonfly

import io.github.kotlinmania.libc.*

public expect fun getlastlogx(fname: String?, uid: UInt, ll: Lastlogx?): Lastlogx?
