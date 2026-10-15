// port-lint: source unix/bsd/freebsdlike/freebsd/mod.rs
package io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd

import io.github.kotlinmania.libc.*

public expect fun fhlink(fhp: io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.Fhandle?, to: String?): Int
