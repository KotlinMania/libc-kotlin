// port-lint: source vxworks/mod.rs
package io.github.kotlinmania.libc.vxworks

import io.github.kotlinmania.libc.*

public expect fun gaiStrerror(errcode: Int): String?
