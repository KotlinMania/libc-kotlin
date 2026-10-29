package io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd

public fun interface DiagnosticHandler {
    public operator fun invoke(status: Int, message: String?): Unit
}
