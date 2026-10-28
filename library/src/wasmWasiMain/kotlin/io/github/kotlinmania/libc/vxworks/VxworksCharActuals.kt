package io.github.kotlinmania.libc.vxworks

public actual fun isalnum(c: Int): Int =
    throw UnsupportedOperationException("isalnum not available on WASI — no C library access")

public actual fun isalpha(c: Int): Int =
    throw UnsupportedOperationException("isalpha not available on WASI — no C library access")

public actual fun iscntrl(c: Int): Int =
    throw UnsupportedOperationException("iscntrl not available on WASI — no C library access")

public actual fun isdigit(c: Int): Int =
    throw UnsupportedOperationException("isdigit not available on WASI — no C library access")

public actual fun isgraph(c: Int): Int =
    throw UnsupportedOperationException("isgraph not available on WASI — no C library access")

public actual fun islower(c: Int): Int =
    throw UnsupportedOperationException("islower not available on WASI — no C library access")

public actual fun isprint(c: Int): Int =
    throw UnsupportedOperationException("isprint not available on WASI — no C library access")

public actual fun ispunct(c: Int): Int =
    throw UnsupportedOperationException("ispunct not available on WASI — no C library access")

public actual fun isspace(c: Int): Int =
    throw UnsupportedOperationException("isspace not available on WASI — no C library access")

public actual fun isupper(c: Int): Int =
    throw UnsupportedOperationException("isupper not available on WASI — no C library access")

public actual fun isxdigit(c: Int): Int =
    throw UnsupportedOperationException("isxdigit not available on WASI — no C library access")

public actual fun isblank(c: Int): Int =
    throw UnsupportedOperationException("isblank not available on WASI — no C library access")

public actual fun isatty(fd: Int): Int =
    throw UnsupportedOperationException("isatty not available on WASI — no C library access")
