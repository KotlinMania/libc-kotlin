'use strict';
const assert = require('node:assert/strict');
const fs = require('node:fs');
const path = require('node:path');
const os = require('node:os');
const crypto = require('node:crypto');
const {spawn} = require('node:child_process');
const {once} = require('node:events');

async function within(promise, label) {
  let timer;
  try {
    return await Promise.race([promise, new Promise((_, reject) => {
      timer = setTimeout(() => reject(new Error(`Timed out: ${label}`)), 10000);
    })]);
  } finally {
    clearTimeout(timer);
  }
}

async function main() {
  const output = path.resolve(process.argv[2]);
  const candidates = ['c_native.node', 'libc_native.node'].map(name => path.join(output, name)).filter(file => fs.existsSync(file));
  assert.equal(candidates.length, 1, 'Expected one actual native payload');
  const selected = candidates[0];
  const binarySha256 = crypto.createHash('sha256').update(fs.readFileSync(selected)).digest('hex');
  const bindings = require(selected);
  assert.equal(bindings.rawAbiVersion(), 2);
  assert.equal(typeof bindings.rawKill, 'function');
  const tests = [];
  let coercions = 0;
  const untyped = {valueOf() { coercions++; throw new Error('must not coerce'); }};
  for (const operation of [bindings.rawKill, bindings.kill]) {
    assert.equal(operation(process.pid, 0), 0);
    for (const args of [[process.pid + 0.5, 0], [process.pid, '0'], [NaN, 0],
      [untyped, 0], [process.pid, untyped], [2 ** 32, 0]]) {
      assert.throws(() => operation(...args), TypeError);
    }
  }
  assert.equal(coercions, 0);
  tests.push('processProbePreservesPidAndRejectsUntypedValues');
  console.log(`PASS ${tests.at(-1)}`);
  assert.equal(bindings.rawKill(process.pid, 0x7fffffff), -1);
  assert.equal(bindings.rawErrno(), os.constants.errno.EINVAL);
  tests.push('invalidSignalReturnsNativeErrorAndErrno');
  console.log(`PASS ${tests.at(-1)}`);

  const windows = process.platform === 'win32';
  const receiver = windows
    ? "process.send({ready:true}); setInterval(() => {}, 1000);"
    : "process.once('SIGUSR1', () => process.send({observed:'SIGUSR1'}, () => process.exit(0))); process.send({ready:true}); setInterval(() => {}, 1000);";
  const child = spawn(process.execPath, ['-e', receiver], {stdio: ['ignore', 'pipe', 'pipe', 'ipc']});
  let stderr = '';
  child.stderr.setEncoding('utf8').on('data', chunk => { stderr += chunk; });
  const exited = once(child, 'exit');
  exited.catch(() => {});
  let observedExit;
  try {
    const [ready] = await within(once(child, 'message'), 'owned child ready');
    assert.deepEqual(ready, {ready: true});
    assert.ok(child.pid > 0 && child.pid !== process.pid);
    assert.equal(bindings.rawKill(child.pid, 0), 0);
    if (windows) {
      assert.equal(bindings.rawKill(child.pid, os.constants.signals.SIGTERM), 0);
      observedExit = await within(exited, 'owned Windows child termination');
      assert.equal(observedExit[1], null);
      assert.equal(typeof observedExit[0], 'number');
      assert.notEqual(observedExit[0], 0);
      tests.push('windowsSignalTerminatesOwnedChild');
    } else {
      const observed = once(child, 'message');
      assert.equal(bindings.rawKill(child.pid, os.constants.signals.SIGUSR1), 0);
      const [message] = await within(observed, 'actual POSIX signal reception');
      assert.deepEqual(message, {observed: 'SIGUSR1'});
      observedExit = await within(exited, 'owned POSIX child exit');
      assert.deepEqual(observedExit, [0, null]);
      tests.push('posixSignalReachesOwnedChild');
    }
    assert.equal(stderr, '');
    console.log(`PASS ${tests.at(-1)}`);
  } finally {
    if (child.exitCode === null && child.signalCode === null) {
      child.kill('SIGKILL');
      await within(exited, 'owned child cleanup');
    }
  }
  console.log(JSON.stringify({platform: process.platform, selected, binarySha256,
    tests, failures: 0, errors: 0, skips: 0, childPid: child.pid, childExit: observedExit}));
}
main().catch(error => { console.error(error); process.exitCode = 1; });
