// port-lint: source vxworks/mod.rs
package io.github.kotlinmania.libc.vxworks

public actual fun isalnum(c: Int): Int =
    throw UnsupportedOperationException("isalnum not available on Android host — use androidNative target for FFI")

public actual fun isalpha(c: Int): Int =
    throw UnsupportedOperationException("isalpha not available on Android host — use androidNative target for FFI")

public actual fun iscntrl(c: Int): Int =
    throw UnsupportedOperationException("iscntrl not available on Android host — use androidNative target for FFI")

public actual fun isdigit(c: Int): Int =
    throw UnsupportedOperationException("isdigit not available on Android host — use androidNative target for FFI")

public actual fun isgraph(c: Int): Int =
    throw UnsupportedOperationException("isgraph not available on Android host — use androidNative target for FFI")

public actual fun islower(c: Int): Int =
    throw UnsupportedOperationException("islower not available on Android host — use androidNative target for FFI")

public actual fun isprint(c: Int): Int =
    throw UnsupportedOperationException("isprint not available on Android host — use androidNative target for FFI")

public actual fun ispunct(c: Int): Int =
    throw UnsupportedOperationException("ispunct not available on Android host — use androidNative target for FFI")

public actual fun isspace(c: Int): Int =
    throw UnsupportedOperationException("isspace not available on Android host — use androidNative target for FFI")

public actual fun isupper(c: Int): Int =
    throw UnsupportedOperationException("isupper not available on Android host — use androidNative target for FFI")

public actual fun isxdigit(c: Int): Int =
    throw UnsupportedOperationException("isxdigit not available on Android host — use androidNative target for FFI")

public actual fun isblank(c: Int): Int =
    throw UnsupportedOperationException("isblank not available on Android host — use androidNative target for FFI")

public actual fun isatty(fd: Int): Int =
    throw UnsupportedOperationException("isatty not available on Android host — use androidNative target for FFI")
