# Independent Kotlin Node consumers

`ProcessConsumer.kt` is a separate application of the built Libc KLIB. It invokes
public `unix.getpid`, `kill`, `lastErrorNumber`, `malloc`, `memset`, `memcmp`,
`mlock`, `munlock` and `free`. The runner checks the actual spawned PID, host errno
and three named behaviors. `WrongTypes.kt` must fail with exactly four source
argument errors: String PID, null signal, String address and String size.

Compile the application to a KLIB first, then link with `-Xinclude`. Use the actual
Libc target KLIB and matching Kotlin standard-library KLIB in `-libraries` for
both stages. Retain `-Werror -language-version 2.4 -api-version 2.4`.

| Target | Compiler main class | Target arguments |
|---|---|---|
| JS | `org.jetbrains.kotlin.cli.js.K2JSCompiler` | `-module-kind commonjs -target es2015` |
| WasmJS | `org.jetbrains.kotlin.cli.js.KotlinWasmCompiler` | `-Xwasm-target=wasm-js` |

Compile with `-ir-output-dir <app-klib> -ir-output-name consumer ProcessConsumer.kt`.
Link with `-Xir-produce-js -Xinclude=<app-klib>/consumer.klib -ir-output-dir <linked>
-ir-output-name consumer -main call`. Kotlin 2.4.20 rejects combining the source
compile and executable link. The dedicated Wasm compiler avoids the compatibility
warning emitted by the older JS compiler entrypoint.

Run `node run-consumer.cjs js <linked>/consumer.js`, or
`node run-consumer.cjs wasmJs <linked>/consumer.mjs`. Provide the exact built native
addon through `@kotlinmania/libc-native-bindings` in this runner's Node search
path. Its package main must point at the actual `.node` payload. Use private
output directories; do not substitute a JS implementation or compiler-private
test symbols. Compile `WrongTypes.kt` separately with the same target/library
arguments and require its four type errors with no emitted executable/KLIB.

Actual local validation is retained in
`automation-artifacts/2026-10-20-template-aar-sync/libc-directory-repair/`:
`memory-lock-kotlin-klibs-v2` contains unfiltered lint and actual producer KLIBs;
`memory-lock-independent-apps` contains exact commands, inputs, per-stage logs,
three passed cases per target, four compiler type errors per target and terminal
process receipts. All accepted compile stages had zero warnings. The selected
native payload SHA256 is
`5bc63e9c63ff201c64a5281838de1677fb61fc2cde3aba574212f84e8c111b93`.

This is macOS Node application-consumer evidence for JS and WasmJS. It does not
claim a public Kotlin-to-JavaScript export facade, TypeScript surface, browser
host-pointer access, WASI memory locking, Windows runtime behavior or Swift.
The native-addon consumers remain separate real backend tests.
