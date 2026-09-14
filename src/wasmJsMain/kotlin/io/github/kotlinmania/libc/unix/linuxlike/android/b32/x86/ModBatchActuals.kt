// port-lint: source Mod.rs
package io.github.kotlinmania.libc.unix.linuxlike.android.b32.x86

import io.github.kotlinmania.libc.*

public actual fun accept4(fd: CInt, addr: Sockaddr?, len: SocklenT?, flg: CInt): CInt =
    throw UnsupportedOperationException("accept4 requires N-API addon")

