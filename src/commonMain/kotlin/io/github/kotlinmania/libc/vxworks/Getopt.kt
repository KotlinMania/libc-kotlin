// port-lint: source vxworks/mod.rs
package io.github.kotlinmania.libc.vxworks

import io.github.kotlinmania.libc.*

public expect fun getopt(argc: Int, argv: COpaquePointer?, optstr: String?): Int
