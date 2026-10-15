// port-lint: source unix/hurd/mod.rs
package io.github.kotlinmania.libc.unix.hurd

import io.github.kotlinmania.libc.*

public expect fun freopen64(filename: String?, mode: String?, file: FILE?): FILE?
