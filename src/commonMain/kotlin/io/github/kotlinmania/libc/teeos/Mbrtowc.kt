// port-lint: source teeos/mod.rs
package io.github.kotlinmania.libc.teeos

import io.github.kotlinmania.libc.*

public expect fun mbrtowc(wc: UInt?, src: String?, n: ULong, st: MbstateT?): ULong
