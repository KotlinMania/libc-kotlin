// port-lint: source unix/solarish/mod.rs
package io.github.kotlinmania.libc.unix.solarish

import io.github.kotlinmania.libc.*

public expect fun ucredGetgroups(ucred: io.github.kotlinmania.libc.COpaquePointer?, groups: COpaquePointer?): Int
