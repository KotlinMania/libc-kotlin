// port-lint: source unix/bsd/apple/mod.rs
package io.github.kotlinmania.libc.unix.bsd.apple

import io.github.kotlinmania.libc.*

public expect fun posixSpawnattrSetarchprefNp(attr: io.github.kotlinmania.libc.COpaquePointer?, count: ULong, pref: Int?, subpref: Int?, ocount: ULong?): Int
