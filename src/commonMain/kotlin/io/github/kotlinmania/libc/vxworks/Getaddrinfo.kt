// port-lint: source vxworks/mod.rs
package io.github.kotlinmania.libc.vxworks

import io.github.kotlinmania.libc.*

public expect fun getaddrinfo(node: String?, service: String?, hints: Addrinfo?, res: COpaquePointer?): Int
