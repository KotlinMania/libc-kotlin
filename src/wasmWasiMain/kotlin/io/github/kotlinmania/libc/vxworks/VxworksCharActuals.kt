// port-lint: source vxworks/mod.rs
package io.github.kotlinmania.libc.vxworks

import io.github.kotlinmania.libc.CInt

public actual fun isalnum(c: CInt): CInt =
    throw UnsupportedOperationException("isalnum not available on WASI — no C library access")

public actual fun isalpha(c: CInt): CInt =
    throw UnsupportedOperationException("isalpha not available on WASI — no C library access")

public actual fun iscntrl(c: CInt): CInt =
    throw UnsupportedOperationException("iscntrl not available on WASI — no C library access")

public actual fun isdigit(c: CInt): CInt =
    throw UnsupportedOperationException("isdigit not available on WASI — no C library access")

public actual fun isgraph(c: CInt): CInt =
    throw UnsupportedOperationException("isgraph not available on WASI — no C library access")

public actual fun islower(c: CInt): CInt =
    throw UnsupportedOperationException("islower not available on WASI — no C library access")

public actual fun isprint(c: CInt): CInt =
    throw UnsupportedOperationException("isprint not available on WASI — no C library access")

public actual fun ispunct(c: CInt): CInt =
    throw UnsupportedOperationException("ispunct not available on WASI — no C library access")

public actual fun isspace(c: CInt): CInt =
    throw UnsupportedOperationException("isspace not available on WASI — no C library access")

public actual fun isupper(c: CInt): CInt =
    throw UnsupportedOperationException("isupper not available on WASI — no C library access")

public actual fun isxdigit(c: CInt): CInt =
    throw UnsupportedOperationException("isxdigit not available on WASI — no C library access")

public actual fun isblank(c: CInt): CInt =
    throw UnsupportedOperationException("isblank not available on WASI — no C library access")

public actual fun isatty(c: CInt): CInt =
    throw UnsupportedOperationException("isatty not available on WASI — no C library access")

