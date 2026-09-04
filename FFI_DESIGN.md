# libc-kotlin FFI Design: C/C++ Wrappers via cinterop + N-API

> **Read this file before working on libc-kotlin.**
> This is the authoritative design for porting the 922 stub functions
> to real C/C++ FFI implementations.

## Problem

libc-kotlin has 922 stub functions in `commonMain` that return `null` or
have empty bodies. They compile green but provide no real implementation.
AGENTS.md forbids stubs. The functions cannot be published until they
are replaced with real FFI bindings.

## Root Cause

The stubs exist because the port used Kotlin data classes (`Msghdr`,
`Cmsghdr`) instead of raw C pointers. Many libc functions — especially
the `CMSG_*` family — perform pointer arithmetic on structs inside a
memory buffer. Data classes cannot do pointer arithmetic. The correct
approach (used by Rust's libc crate) is to use `repr(C)` structs and raw
pointers, with functions that take `*const`/`*mut` pointers.

## Design

### Architecture

Follow the pattern proven in `socket2-kotlin` and `sha1-kotlin`:

1. **C/C++ wrapper source** (`src/nativeInterop/cinterop/*.c` or `.cpp`)
   — real C code that calls the real C library functions or implements
   the same pointer arithmetic as the Rust `f!` macro blocks. This code
   is identical to what the C headers define and what the Rust code
   translates.

2. **C header** (`src/nativeInterop/cinterop/*.h`) — declares the
   wrapper functions as `extern "C"` so cinterop can see them.

3. **cinterop `.def` file** (`src/nativeInterop/cinterop/libc.def`) —
   points cinterop at the wrapper header. cinterop generates Kotlin
   bindings for the C functions.

4. **`build.gradle.kts` wiring** — uses Gradle's `cpp-library` plugin
   to compile the C/C++ wrapper as a static library, then cinterop
   bundles it into the klib. Pattern from `socket2-kotlin`:
   ```kotlin
   library {
       baseName.set("libc_wrapper")
       source.from(file("src/nativeInterop/cinterop/libc_wrapper.cpp"))
       privateHeaders.from(file("src/nativeInterop/cinterop"))
       linkage.set(listOf(Linkage.STATIC))
       targetMachines.set(listOf(
           machines.macOS.architecture("aarch64"),
           machines.macOS.x86_64,
           machines.linux.x86_64,
           machines.linux.architecture("aarch64"),
           machines.windows.x86_64,
       ))
   }
   tasks.withType<CppCompile>().configureEach {
       compilerArgs.addAll("-std=c++17", "-fPIC")
   }
   tasks.withType<CInteropProcess>().configureEach {
       dependsOn(tasks.withType<CreateStaticLibrary>())
   }
   targets.withType<KotlinNativeTarget>().configureEach {
       compilations.getByName("main") {
           cinterops.create("libc") {
               defFile = project.file("src/nativeInterop/cinterop/libc.def")
               includeDirs(project.file("src/nativeInterop/cinterop"))
           }
       }
   }
   ```

### Per-target implementation

| Target | Mechanism | Source set |
|---|---|---|
| **Native** (macOS, iOS, tvOS, watchOS, Linux, Windows, Android NDK) | C/C++ wrapper via cinterop — real C code compiled as static library | `nativeMain` |
| **JS** (Node.js) | Node N-API C++ addon — real C code compiled as `.node` native module | `jsMain` |
| **WASM JS** | Node N-API (same addon, wasm-compatible wrapper) | `wasmJsMain` |
| **WASM WASI** | Honest limitation — no C library access; throw `UnsupportedOperationException` with specific reason | `wasmWasiMain` |
| **JVM** | JNA or honest `UnsupportedOperationException` — libc not directly accessible on JVM | `jvmMain` |

### commonMain API

Functions that wrap C library calls or C macros use `COpaquePointer`
(raw address) as the pointer type — matching Rust's `*const`/`*mut`:

```kotlin
// commonMain — expect declarations
public expect fun cMSGDATA(cmsg: COpaquePointer?): COpaquePointer?
public expect fun cMSGFIRSTHDR(mhdr: COpaquePointer?): COpaquePointer?
public expect fun cMSGNXTHDR(mhdr: COpaquePointer?, cmsg: COpaquePointer?): COpaquePointer?
```

### nativeMain actuals

Import the cinterop-generated functions and call them directly:

```kotlin
// nativeMain
import io.github.kotlinmania.libc.cinterop.libc_cmsg_data
import io.github.kotlinmania.libc.cinterop.libc_cmsg_firsthdr
import io.github.kotlinmania.libc.cinterop.libc_cmsg_nxthdr

@OptIn(ExperimentalForeignApi::class)
public actual fun cMSGDATA(cmsg: COpaquePointer?): COpaquePointer? {
    if (cmsg == null) return null
    val cPtr = cmsg.value.toCPointer<c_uchar>() ?: return null
    val result = libc_cmsg_data(cPtr.reinterpret())
    return result?.let { COpaquePointer(it.toLong()) }
}
```

### C wrapper code

The C wrapper implements the same logic as the Rust `f!` macro blocks,
using the real C macros from system headers:

```c
// libc_wrapper.h
#ifndef LIBC_WRAPPER_H
#define LIBC_WRAPPER_H
#include <stdint.h>
#include <sys/socket.h>
#ifdef __cplusplus
extern "C" {
#endif
void* libc_cmsg_data(struct cmsghdr* cmsg);
struct cmsghdr* libc_cmsg_firsthdr(struct msghdr* mhdr);
struct cmsghdr* libc_cmsg_nxthdr(struct msghdr* mhdr, struct cmsghdr* cmsg);
size_t libc_cmsg_space(size_t length);
size_t libc_cmsg_len(size_t length);
#ifdef __cplusplus
}
#endif
#endif
```

```c
// libc_wrapper.c
#include "libc_wrapper.h"
void* libc_cmsg_data(struct cmsghdr* cmsg) {
    return CMSG_DATA(cmsg);
}
struct cmsghdr* libc_cmsg_firsthdr(struct msghdr* mhdr) {
    return CMSG_FIRSTHDR(mhdr);
}
struct cmsghdr* libc_cmsg_nxthdr(struct msghdr* mhdr, struct cmsghdr* cmsg) {
    return CMSG_NXTHDR(mhdr, cmsg);
}
size_t libc_cmsg_space(size_t length) {
    return CMSG_SPACE(length);
}
size_t libc_cmsg_len(size_t length) {
    return CMSG_LEN(length);
}
```

### JS/WASM actuals (N-API)

Node N-API C++ addon provides the same functions. The addon is compiled
as a `.node` file and loaded by `jsMain`/`wasmJsMain` via
`require()`:

```kotlin
// jsMain
private fun jsCmsgData(cmsgAddr: Long): Long? = js(
    "(function(){ var rq = (new Function('return typeof require === \"function\" ? require : null'))(); " +
    "if (!rq) return null; return rq('./libc_addon.node').cmsg_data(cmsgAddr); })()"
)
public actual fun cMSGDATA(cmsg: COpaquePointer?): COpaquePointer? {
    if (cmsg == null) return null
    val result = jsCmsgData(cmsg.value) ?: return null
    return COpaquePointer(result)
}
```

### What this does NOT change

- **Constants** (53,825 of them) — already ported at 99.8% parity, no FFI needed
- **Data classes** that represent struct layouts for non-FFI code — kept as-is
- **Functions that are pure Kotlin logic** (no C library call) — kept as-is
- **The `COpaquePointer` class** — already has `value: Long`, works as raw address

### What this DOES change

- **922 stub functions** — converted from `= null` to `expect fun` with
  real `actual` implementations per target
- **Function signatures** for FFI functions — take `COpaquePointer`
  instead of data classes where the Rust original takes `*const`/`*mut`
- **`build.gradle.kts`** — gains `cpp-library` plugin and cinterop wiring
- **`src/nativeInterop/cinterop/`** — gains C/C++ wrapper source files

### Rollout plan

1. **Phase 1: CMSG functions** (3 functions in vxworks/Mod.kt)
   - Write C wrapper, header, def file
   - Wire cinterop in build.gradle.kts
   - Write nativeMain actuals
   - Write jsMain N-API actuals
   - Write jvmMain/wasmWasiMain honest limitations
   - Verify: `./gradlew compileKotlinMacosArm64` passes
   - Verify: `./gradlew compileKotlinJvm` passes
   - Verify: `./gradlew compileKotlinJs` passes

2. **Phase 2: Remaining FFI functions** (919 functions)
   - Categorize: C library calls vs. C macros vs. pure arithmetic
   - Write C wrappers per category
   - Convert stubs to expect/actual in batches
   - Verify per batch

3. **Phase 3: Tests**
   - Port the 6 Rust `#[test]` functions from `macros.rs`
   - Port `tests/const_fn.rs` compile-time checks
   - Verify: `./gradlew check` fully green

### Reference implementations

- **`socket2-kotlin`** — C++ wrapper + cinterop + static library pattern
  (`src/nativeInterop/cinterop/socket2_wrapper.{c,cpp,h}`, `.def`, `build.gradle.kts`)
- **`sha1-kotlin`** — C++ wrapper + cinterop + ASM integration
  (`src/nativeInterop/cinterop/sha1_asm_wrapper.{cpp,h}`, `.def`)
- **`android-system-properties-kotlin`** — C header wrapper + cinterop
  for Android NDK (`src/nativeInterop/cinterop/androidsystemproperties_wrapper.h`)
- **`windows-sys-kotlin`** — C header wrapper for Win32 FFI + JNA on JVM