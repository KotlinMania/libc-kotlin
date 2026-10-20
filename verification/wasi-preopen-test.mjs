import assert from 'node:assert/strict';
import fs from 'node:fs';
import path from 'node:path';
import { WASI } from 'node:wasi';

const [wasmFile, output, fixtureFile] = process.argv.slice(2);
assert(wasmFile && output && fixtureFile, 'Expected Kotlin wasm, report directory and compiled C fixture');
const sandbox = path.resolve(output, 'sandbox');
fs.mkdirSync(sandbox, { recursive: true });
for (const name of ['created.txt', 'renamed.txt', 'delete.txt']) {
  fs.rmSync(path.join(sandbox, name), { force: true });
}
fs.writeFileSync(path.join(sandbox, 'fixture.txt'), 'host-created\n');
let failure;
try {
  const wasi = new WASI({ version: 'preview1', args: [], env: {}, preopens: { '/sandbox': sandbox } });
  const module = new WebAssembly.Module(fs.readFileSync(wasmFile));
  const fixture = new WebAssembly.Instance(new WebAssembly.Module(fs.readFileSync(fixtureFile)), {});
  const imports = wasi.getImportObject();
  imports.kotlinmania_macro_fixture = { value: fixture.exports.kotlinmania_macro_layout_value };
  const instance = new WebAssembly.Instance(module, imports);
  wasi.finalizeBindings(instance);
  assert.equal(typeof instance.exports.verifyLibcPreopenedFiles, 'function');
  assert.equal(instance.exports.verifyLibcPreopenedFiles(), 1);
  assert.equal(fs.readFileSync(path.join(sandbox, 'renamed.txt'), 'utf8'), 'Kotlin capability IO\n');
  assert.equal(fs.existsSync(path.join(sandbox, 'created.txt')), false);
  assert.equal(fs.existsSync(path.join(sandbox, 'delete.txt')), false);
} catch (error) {
  failure = error;
}
fs.mkdirSync(output, { recursive: true });
fs.writeFileSync(path.join(output, 'result.json'), JSON.stringify({
  scenario: 'real-preopened-directory-io', tests: 1, failures: failure ? 1 : 0, skipped: 0,
  wasm: path.resolve(wasmFile), error: failure?.stack,
}, null, 2) + '\n');
const xmlEscape = text => text.replaceAll('&', '&amp;').replaceAll('<', '&lt;').replaceAll('"', '&quot;');
fs.writeFileSync(path.join(output, 'TEST-WasiPreopen.xml'),
  `<testsuite name="WasiPreopen" tests="1" failures="${failure ? 1 : 0}" skipped="0"><testcase name="realPreopenedDirectoryIo">${failure ? `<failure message="${xmlEscape(String(failure))}"/>` : ''}</testcase></testsuite>\n`);
if (failure) throw failure;
console.log('WasiPreopen.realPreopenedDirectoryIo: 1 executed, 1 passed, 0 skipped');
