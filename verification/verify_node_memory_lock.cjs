'use strict';
const assert = require('node:assert/strict');
const fs = require('node:fs');
const path = require('node:path');
const crypto = require('node:crypto');
const os = require('node:os');
const directory = path.resolve(process.argv[2]);
const candidates = ['c_native.node', 'libc_native.node'].map(name => path.join(directory, name)).filter(file => fs.existsSync(file));
assert.equal(candidates.length, 1);
const selected = candidates[0];
const bindings = require(selected);
assert.equal(bindings.rawAbiVersion(), 2);
const tests = [];
const address = bindings.rawAllocate('64');
const comparison = bindings.rawAllocate('64');
assert.notEqual(address, '0');
assert.notEqual(comparison, '0');
let locked = false;
try {
  bindings.rawFill(address, 65, '64');
  bindings.rawFill(comparison, 65, '64');
  assert.equal(bindings.rawMlock(address, '64'), 0);
  locked = true;
  assert.equal(bindings.rawCompare(address, comparison, '64'), 0);
  assert.equal(bindings.rawFill(address, 90, '64'), address);
  bindings.rawFill(comparison, 90, '64');
  assert.equal(bindings.rawCompare(address, comparison, '64'), 0);
  assert.equal(bindings.rawMunlock(address, '64'), 0);
  locked = false;
  assert.equal(bindings.rawCompare(address, comparison, '64'), 0);
  tests.push('memoryLockPreservesOwnedAllocationAndMutation');
} finally {
  try {
    if (locked) assert.equal(bindings.rawMunlock(address, '64'), 0);
  } finally {
    bindings.rawRelease(comparison);
    bindings.rawRelease(address);
  }
}
let coercions = 0;
const untyped = {valueOf() { coercions++; throw new Error('must not coerce'); }};
for (const operation of [bindings.rawMlock, bindings.rawMunlock]) {
  for (const args of [[1, '64'], ['1', 64], [untyped, '64'], ['1', untyped],
    ['1junk', '64'], ['1', '64.5'], ['-1', '64'], ['1', '18446744073709551616']]) {
    assert.throws(() => operation(...args), TypeError);
  }
}
for (const operation of [bindings.mlock, bindings.munlock]) {
  for (const args of [[untyped, 64], [1, '64'], [1.5, 64], [1, NaN],
    [Number.MAX_SAFE_INTEGER + 1, 64], [1, -1]]) {
    assert.throws(() => operation(...args), TypeError);
  }
}
assert.equal(coercions, 0);
tests.push('memoryLockRejectsLossyIntegersBeforeNativeCall');
assert.equal(bindings.rawMlock('18446744073709551615', '2'), -1);
if (process.platform === 'win32') {
  assert.ok([os.constants.errno.ENOMEM, os.constants.errno.EINVAL].includes(bindings.rawErrno()));
} else {
  assert.equal(bindings.rawErrno(), os.constants.errno.EINVAL);
}
tests.push('memoryLockOverflowingRangeRetainsNativeError');
for (const name of tests) console.log(`PASS ${name}`);
console.log(JSON.stringify({platform: process.platform, selected,
  binarySha256: crypto.createHash('sha256').update(fs.readFileSync(selected)).digest('hex'),
  tests, failures: 0, errors: 0, skips: 0}));
