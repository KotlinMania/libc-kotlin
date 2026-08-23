// port-lint: source N/A (Kotlin-side N-API bridge for JS/WASM targets)
package io.github.kotlinmania.libc

/**
 * N-API native bindings for libc functions on JS/WASM targets.
 *
 * This object loads the shared C++ N-API addon (`native/node-libc/`) which wraps
 * direct C library calls. Both Kotlin/JS (nodeMain) and Kotlin/WASM (wasmJsMain
 * via Node.js) load the same compiled `.node` binary.
 *
 * The C++ addon is a reusable library — both sides import and use the same object.
 * No insecure NPM dependencies are used. All calls go through Node N-API directly
 * to the system C library.
 */
@JsModule("@kotlinmania/libc-native-bindings")
@JsNonModule
public external object LibcNative {
    // stdio
    public fun fopen(path: String, mode: String): Int

    public fun fclose(fp: Int): Int

    public fun fread(buffer: dynamic, size: Int, count: Int, fp: Int): Int

    public fun fwrite(buffer: dynamic, size: Int, count: Int, fp: Int): Int

    public fun fseek(fp: Int, offset: Int, whence: Int): Int

    public fun ftell(fp: Int): Int

    public fun fflush(fp: Int): Int

    public fun printf(str: String): Int

    // unistd
    public fun close(fd: Int): Int

    public fun read(fd: Int, buffer: dynamic, count: Int): Int

    public fun write(fd: Int, buffer: dynamic, count: Int): Int

    public fun lseek(fd: Int, offset: Int, whence: Int): Int

    public fun exit(status: Int)

    public fun access(path: String, mode: Int): Int

    public fun unlink(path: String): Int

    public fun gethostname(): String

    public fun getpid(): Int

    public fun getppid(): Int

    public fun sleep(seconds: Int): Int

    // string
    public fun strlen(s: String): Int

    public fun strcmp(a: String, b: String): Int

    public fun strncmp(a: String, b: String, n: Int): Int

    public fun memcpy(dst: dynamic, src: dynamic, n: Int): dynamic

    public fun memset(buf: dynamic, value: Int, n: Int): dynamic

    public fun memcmp(a: dynamic, b: dynamic, n: Int): Int

    public fun strchr(s: String, ch: Int): Int

    // stdlib
    public fun malloc(size: Int): Int

    public fun calloc(nobj: Int, size: Int): Int

    public fun realloc(ptr: Int, size: Int): Int

    public fun free(ptr: Int)

    public fun atoi(s: String): Int

    public fun strtol(s: String, base: Int): Double

    public fun strtod(s: String): Double

    public fun getenv(name: String): String?

    public fun system(cmd: String): Int

    // math
    public fun ceil(x: Double): Double

    public fun floor(x: Double): Double

    public fun round(x: Double): Double

    public fun sqrt(x: Double): Double

    public fun pow(base: Double, exp: Double): Double

    public fun abs(x: Int): Int

    public fun fabs(x: Double): Double

    public fun sin(x: Double): Double

    public fun cos(x: Double): Double

    public fun tan(x: Double): Double

    public fun ceilf(x: Float): Float

    public fun floorf(x: Float): Float

    public fun roundf(x: Float): Float

    // errno
    public val errno: Int
}
