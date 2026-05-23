# port-lint Proposed Changes

**Generated:** 2026-05-22
**Source:** tmp/libc
**Target:** src

These are review proposals only. They are emitted when a Rust -> Kotlin pair matches only after fallback normalization, so the existing `port-lint` header is not an exact provenance match.

| Target file | Current header | Proposed header | Source path | Reason |
|-------------|----------------|-----------------|-------------|--------|
| `commonMain/kotlin/io/github/kotlinmania/libc/Primitives.kt` | `// port-lint: source primitives.rs` | `// port-lint: source primitives.rs` | `primitives.rs` | `port-lint provenance header matched only after fallback normalization: 'primitives.rs' vs expected 'primitives.rs'` |
| `commonMain/kotlin/io/github/kotlinmania/libc/solid/Aarch64.kt` | `// port-lint: source solid/aarch64.rs` | `// port-lint: source solid/aarch64.rs` | `solid/aarch64.rs` | `port-lint provenance header matched only after fallback normalization: 'solid/aarch64.rs' vs expected 'solid/aarch64.rs'` |
| `commonMain/kotlin/io/github/kotlinmania/libc/new/sgx/Mod.kt` | `// port-lint: source new/sgx/mod.rs` | `// port-lint: source new/sgx/mod.rs` | `new/sgx/mod.rs` | `port-lint provenance header matched only after fallback normalization: 'new/sgx/mod.rs' vs expected 'new/sgx/mod.rs'` |
| `commonMain/kotlin/io/github/kotlinmania/libc/new/common/Bsd.kt` | `// port-lint: source new/common/bsd.rs` | `// port-lint: source new/common/bsd.rs` | `new/common/bsd.rs` | `port-lint provenance header matched only after fallback normalization: 'new/common/bsd.rs' vs expected 'new/common/bsd.rs'` |
