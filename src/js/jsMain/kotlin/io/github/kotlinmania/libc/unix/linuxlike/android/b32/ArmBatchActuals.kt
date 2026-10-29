// port-lint: source Arm.rs
package io.github.kotlinmania.libc.unix.linuxlike.android.b32
import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.unix.linuxlike.Sockaddr

public actual fun accept4(fd: Int, addr: Sockaddr?, len: Int?, flg: Int): Int =
    throw UnsupportedOperationException("accept4 requires N-API addon")
