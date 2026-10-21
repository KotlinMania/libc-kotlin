# JavaScript and Wasm contract evidence

The Kotlin API, emitted JavaScript exports, WebAssembly exports and native Node
addon are separate boundaries. Passing Kotlin tests on a target does not prove
an external JavaScript caller can use the Kotlin API.

| Target | Current production boundary | External contract status |
|---|---|---|
| Kotlin/JS | Kotlin library consumed by Kotlin applications; Node actuals call the native addon | No production `@JsExport` declarations or TypeScript generation configured |
| Kotlin/WasmJS | Kotlin library consumed by Kotlin applications; typed JS imports call the native addon under Node | No production Kotlin-to-JS exports or emitted TypeScript contract established |
| Kotlin/WasmWasi | Kotlin library using WASI imports and capability-based FILE operations | No JavaScript/TypeScript API is claimed; the exported preopen scenario is test code |
| Native Node addon | C/C++ N-API implementation used beneath Node-backed Kotlin targets | Independently exercised by `verify_node_file_operations.cjs`; this is backend evidence only |

The target declarations in `build.gradle.kts` configure browser/Node environments,
not a public JavaScript export facade. Historical development test modules expose
compiler-private JS symbols or `startUnitTests`; these are not stable public APIs
and must not be renamed or presented as the product contract. No production
export facade, public alias or erased compatibility wrapper is introduced here.

## Native transfer boundary

`read(fd, bytes, count)` and `write(fd, bytes, count)` require an int32 descriptor,
a genuine Uint8Array (including a view with a nonzero offset), and a finite safe
integer count. Validation precedes N-API casts and native I/O. Strings, objects,
other typed arrays, fractional numbers and overflow are rejected with TypeError
without invoking JavaScript coercion hooks. A correctly typed but out-of-bounds
count still follows the existing C-style failure result. Buffer contents, offset,
capacity and identity are retained; no copied surrogate buffer is substituted.

The independent native consumer checks actual file bytes and EOF, mutation of
the original subarray only, wrong-type rejection without I/O or coercion, Unicode
paths, process/system information and account buffer capacity. It loads the exact
freshly compiled addon and reports its hash. This does not establish Kotlin/JS or
Kotlin/WasmJS export behavior, Kotlin exception identity, generic relations, or
browser behavior. The raw-memory ABI used by the Unix JS/WasmJS actuals separately checks complete
unsigned/signed decimal strings at their declared 64-bit widths, and int32 numeric
arguments before calls. Its independent consumer checks allocation, real memory
mutation/copy/resize, native file reads/writes/EOF, signed failures and errno,
malformed integers and absence of coercion. Decimal addresses remain raw C
pointers: numeric validation does not establish allocation ownership, bounds or
freedom from use-after-free for arbitrary foreign callers. Other legacy addon
operations still require a separate audit.

## Required product export acceptance

Before claiming an external Kotlin/JS or Kotlin/WasmJS contract, retain all of:

1. Actual production export declarations mapped to canonical Kotlin symbols and
   pinned upstream operations. Preserve concrete callback/payload types and any
   meaningful generic relationship; identify language restrictions explicitly.
2. Fresh linked production module and, where generated, TypeScript declarations,
   with source revision, tool versions, effective compiler options and hashes.
   Compiler-private symbols and Kotlin test entrypoints do not satisfy this.
3. Independent JavaScript imports of that module, not Kotlin-generated tests or
   a hand-written replacement implementation. Exercise values, mutation,
   callback/error identity where supported, nullable contracts and untyped inputs.
4. Actual TypeScript consumer compilation, including wrong-type negative cases,
   where a TypeScript surface exists. Declarations alone are not runtime guards.
5. Separate WasmJS and WASI import/export and runtime evidence. A WASI host may
   exercise actual WebAssembly exports/imports without inventing a JavaScript API.

These acceptance items remain incomplete. Existing per-target CI counts retain
their own revision and runtime scope; they are not retroactive export proof.

Official references: [Kotlin/JS exports](https://kotlinlang.org/docs/js-to-kotlin-interop.html#jsexport-annotation)
and [Kotlin/Wasm JavaScript interop](https://kotlinlang.org/docs/wasm-js-interop.html).

## Memory locking

The existing public Unix memory-lock operations now use decimal strings for the
full-width address and unsigned size across the JS/WasmJS import boundary.
They delegate to actual `mlock`/`munlock` on POSIX and `VirtualLock`/`VirtualUnlock`
on Windows. Legacy numeric addon callbacks preserve their signatures and reject
non-integral, negative, non-finite or unsafe integer values before a native call.
The independent native consumer checks a real owned allocation through lock,
mutation and unlock; malformed integer/coercion rejection; and an overflowing
native range with error reporting. Address zero is not used as a portable
failure assumption: macOS accepted that range during validation.

Windows captures `GetLastError` and maps header-defined failures into the existing
C-style errno channel. Its unlock semantics differ from POSIX: unlocking pages
that were not locked can fail. The Windows backend requires its real runner;
local macOS results do not establish that branch. See Microsoft's
[VirtualLock](https://learn.microsoft.com/en-us/windows/win32/api/memoryapi/nf-memoryapi-virtuallock)
and [VirtualUnlock](https://learn.microsoft.com/en-us/windows/win32/api/memoryapi/nf-memoryapi-virtualunlock)
contracts and the [Linux memory-lock contract](https://man7.org/linux/man-pages/man2/mlock.2.html).
The independent Kotlin application fixtures are in `verification/node-consumer`.
