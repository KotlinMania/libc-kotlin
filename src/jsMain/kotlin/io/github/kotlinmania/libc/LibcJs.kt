// port-lint: source libc/src/N/A
package io.github.kotlinmania.libc

/**
 * JS/WASM implementations of core libc functions via N-API.
 *
 * These functions call through the [LibcNative] N-API addon to reach the
 * real system C library. They are declared in the root package
 * `io.github.kotlinmania.libc` so consumers can import them directly.
 *
 * Functions that don't make sense on JS/WASM (mmap, fork, etc.) are not
 * overridden here and retain their commonMain stub implementations.
 */

// ─── stdlib ───────────────────────────────────────────────────────

public fun mallocNapi(size: ULong): COpaquePointer? {
    val ptr = LibcNative.malloc(size.toInt())
    return if (ptr != 0) COpaquePointer(ptr.toLong()) else null
}

public fun callocNapi(nobj: ULong, size: ULong): COpaquePointer? {
    val ptr = LibcNative.calloc(nobj.toInt(), size.toInt())
    return if (ptr != 0) COpaquePointer(ptr.toLong()) else null
}

public fun reallocNapi(p: COpaquePointer?, size: ULong): COpaquePointer? {
    val oldPtr = p?.value?.toInt() ?: 0
    val newPtr = LibcNative.realloc(oldPtr, size.toInt())
    return if (newPtr != 0) COpaquePointer(newPtr.toLong()) else null
}

public fun freeNapi(p: COpaquePointer?) {
    p?.let { LibcNative.free(it.value.toInt()) }
}

public fun atoiNapi(s: String?): Int = if (s != null) LibcNative.atoi(s) else 0

public fun strtolNapi(s: String?, base: Int): Long =
    if (s != null) LibcNative.strtol(s, base).toLong() else 0L

public fun strtodNapi(s: String?): Double =
    if (s != null) LibcNative.strtod(s) else 0.0

public fun getenvNapi(name: String?): String? =
    if (name != null) LibcNative.getenv(name) else null

public fun systemNapi(cmd: String?): Int =
    if (cmd != null) LibcNative.system(cmd) else -1

// ─── string ───────────────────────────────────────────────────────

public fun strlenNapi(cs: String?): ULong =
    if (cs != null) LibcNative.strlen(cs).toULong() else 0uL

public fun strcmpNapi(a: String?, b: String?): Int {
    if (a == null || b == null) return -1
    return LibcNative.strcmp(a, b)
}

public fun strncmpNapi(a: String?, b: String?, n: ULong): Int {
    if (a == null || b == null) return -1
    return LibcNative.strncmp(a, b, n.toInt())
}

// ─── unistd ───────────────────────────────────────────────────────

public fun closeNapi(fd: Int): Int = LibcNative.close(fd)

public fun getpidNapi(): Int = LibcNative.getpid()

public fun getppidNapi(): Int = LibcNative.getppid()

public fun gethostnameNapi(): String = LibcNative.gethostname()

public fun accessNapi(path: String?, mode: Int): Int =
    if (path != null) LibcNative.access(path, mode) else -1

public fun unlinkNapi(path: String?): Int =
    if (path != null) LibcNative.unlink(path) else -1

public fun sleepNapi(secs: UInt): UInt = LibcNative.sleep(secs.toInt()).toUInt()

// ─── math ─────────────────────────────────────────────────────────

public fun ceilNapi(x: Double): Double = LibcNative.ceil(x)

public fun floorNapi(x: Double): Double = LibcNative.floor(x)

public fun roundNapi(x: Double): Double = LibcNative.round(x)

public fun sqrtNapi(x: Double): Double = LibcNative.sqrt(x)

public fun powNapi(base: Double, exp: Double): Double = LibcNative.pow(base, exp)

public fun fabsNapi(x: Double): Double = LibcNative.fabs(x)

public fun sinNapi(x: Double): Double = LibcNative.sin(x)

public fun cosNapi(x: Double): Double = LibcNative.cos(x)

public fun tanNapi(x: Double): Double = LibcNative.tan(x)

public fun ceilfNapi(x: Float): Float = LibcNative.ceilf(x)

public fun floorfNapi(x: Float): Float = LibcNative.floorf(x)

public fun roundfNapi(x: Float): Float = LibcNative.roundf(x)

// ─── errno ────────────────────────────────────────────────────────

public val errnoNapi: Int get() = LibcNative.errno
