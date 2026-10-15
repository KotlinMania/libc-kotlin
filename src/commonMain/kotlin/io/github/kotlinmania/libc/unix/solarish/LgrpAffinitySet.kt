// port-lint: source unix/solarish/mod.rs
package io.github.kotlinmania.libc.unix.solarish

import io.github.kotlinmania.libc.*

public expect fun lgrpAffinitySet(idtype: UInt, id: Int, lgrp: Int, aff: Int): Int
