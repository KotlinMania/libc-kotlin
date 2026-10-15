// port-lint: source unix/hurd/mod.rs
package io.github.kotlinmania.libc.unix.hurd

import io.github.kotlinmania.libc.*

public expect fun duplocale(base: io.github.kotlinmania.libc.unix.hurd.LocaleStruct?): io.github.kotlinmania.libc.unix.hurd.LocaleStruct?
