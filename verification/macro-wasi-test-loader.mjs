import fs from 'node:fs';
import { WASI } from 'node:wasi';
import { argv, env } from 'node:process';

const moduleFile = env.LIBC_WASI_TEST_MODULE;
const fixtureFile = env.LIBC_MACRO_WASM;
if (!moduleFile || !fixtureFile) throw new Error('Missing actual Kotlin/C Wasm test module paths');
const fixture = new WebAssembly.Instance(new WebAssembly.Module(fs.readFileSync(fixtureFile)), {});
const wasi = new WASI({ version: 'preview1', args: argv, env });
const imports = wasi.getImportObject();
imports.kotlinmania_macro_fixture = { value: fixture.exports.kotlinmania_macro_layout_value };
const instance = new WebAssembly.Instance(new WebAssembly.Module(fs.readFileSync(moduleFile)), imports);
wasi.finalizeBindings(instance);
export const startUnitTests = instance.exports.startUnitTests;
