# libc-kotlin N-API Native Bindings

Shared C++ N-API addon providing direct C library bindings for Kotlin/JS and Kotlin/WASM targets.

## Architecture

Both JS and WASM targets load the **same** compiled `.node` binary. The C++ objects are reusable — no duplication between targets.

```
native/node-libc/
├── binding.gyp              — node-gyp build config
├── package.json             — npm package definition
├── index.js                 — loader (tries Release, falls back to Debug)
└── src/
    ├── libc_bindings.cpp    — module init, errno accessor
    ├── stdio_bindings.cpp   — fopen, fclose, fread, fwrite, fseek, ftell, fflush, printf
    ├── unistd_bindings.cpp  — close, read, write, lseek, exit, access, unlink, gethostname, getpid, getppid, sleep
    ├── string_bindings.cpp  — strlen, strcmp, strncmp, memcpy, memset, memcmp, strchr
    ├── stdlib_bindings.cpp  — malloc, calloc, realloc, free, atoi, strtol, strtod, exit, getenv, system
    └── math_bindings.cpp    — ceil, floor, round, sqrt, pow, abs, fabs, sin, cos, tan, ceilf, floorf, roundf
```

## Building

```bash
cd native/node-libc
npm install
# or: node-gyp rebuild
```

This produces `build/Release/libc_native.node`.

## Usage from Kotlin

The Kotlin `jsMain` source set declares an `external object LibcNative` that imports the addon:

```kotlin
@JsModule("@kotlinmania/libc-native-bindings")
external object LibcNative {
    fun malloc(size: Int): Int
    fun free(ptr: Int)
    // ... all functions
}
```

Both `jsMain` and `wasmJsMain` (via Node.js) can use this same object. No insecure NPM dependencies — all calls go directly through N-API to the system C library.

## Why N-API instead of NPM libraries

Per the KotlinMania workspace rules: do NOT use third-party NPM libraries for FFI. Write your own N-API C++ addon that wraps C library calls directly. This gives the same level of control as Kotlin/Native's cinterop approach.