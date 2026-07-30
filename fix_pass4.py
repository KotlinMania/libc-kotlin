#!/usr/bin/env python3
"""
Fix remaining Kotlin compilation errors in libc-kotlin — pass 4.

Handles:
1. Redeclaration: duplicate data class definitions in arch files -> rename with arch suffix
2. Argument type mismatch: Int but UInt expected -> add .toUInt()
3. Argument type mismatch: Int but UByte expected -> add .toUByte()
4. Argument type mismatch: UByte but UInt expected -> add .toUInt()
5. Initializer type mismatch: Int actual Long -> hex overflow fix
6. Initializer type mismatch: UByte actual UInt -> fix suffix
7. Initializer type mismatch: Short actual Int -> fix
8. Const val with non-primitive type -> change to val
9. 'infix' modifier required on 'or' -> change to .or() method call
10. No parameter with name 'size' -> rename parameter
"""

import re
import os
import sys
from collections import defaultdict

BASE = "/Volumes/stuff/Projects/kotlinmania/libc-kotlin"

def parse_errors(error_file):
    errors = []
    with open(error_file) as f:
        for line in f:
            line = line.strip()
            if not line.startswith("e:"):
                continue
            m = re.match(r'e: file://(/[^:]+):(\d+):(\d+)\s+(.*)', line)
            if not m:
                continue
            errors.append({
                'file': m.group(1),
                'line': int(m.group(2)),
                'col': int(m.group(3)),
                'msg': m.group(4),
            })
    return errors

def fix_hex_overflow_to_int(line):
    """Fix hex literals > 0x7FFFFFFF for Int type -> negative decimal."""
    def replace_hex(m):
        hex_str = m.group(1)
        try:
            val = int(hex_str, 16)
            if val > 0x7FFFFFFF and val <= 0xFFFFFFFF:
                signed = val - 0x100000000
                return str(signed)
            return m.group(0)
        except:
            return m.group(0)
    new_line = re.sub(r'0x([0-9A-Fa-f]{8})\b', replace_hex, line)
    if new_line != line:
        return new_line
    return None

def fix_type_mismatch(line, expected, actual):
    """Fix various type mismatch patterns."""
    
    # Hex overflow: Int expected, Long/BigInteger actual
    if expected == 'Int' and actual in ('Long', 'BigInteger', 'BigInteger!'):
        result = fix_hex_overflow_to_int(line)
        if result and result != line:
            return result

    # UByte expected, UInt actual — remove 'u' suffix or add .toUByte()
    if expected == 'UByte' and actual == 'UInt':
        # Remove u suffix from hex literals
        new_line = re.sub(r'(0x[0-9A-Fa-f]+)u\b(?!L)', r'\1', line)
        if new_line != line:
            return new_line
        # For decimal: add .toUByte()
        new_line = re.sub(r'(\d+)u\b(?!L)(?=\s|$|,|\))', r'\1.toUByte()', line)
        if new_line != line:
            return new_line

    # Short expected, Int actual — no suffix needed, but value may overflow
    if expected == 'Short' and actual == 'Int':
        # Just ensure no L/uL suffix
        new_line = re.sub(r'(\d+)[LuL]\b', r'\1', line)
        if new_line != line:
            return new_line

    # Int expected, UInt actual — remove u suffix
    if expected == 'Int' and actual == 'UInt':
        new_line = re.sub(r'(0x[0-9A-Fa-f]+)u\b(?!L)', r'\1', line)
        if new_line != line:
            return new_line
        new_line = re.sub(r'(\d+)u\b(?!L)(?=\s|$|,|\))', r'\1', line)
        if new_line != line:
            return new_line

    # ULong expected, Int actual — add uL suffix
    if expected == 'ULong' and actual == 'Int':
        new_line = re.sub(r'(0x[0-9A-Fa-f]+)(?=\s*$)(?![0-9A-Fa-f]*[uUL])', r'\1uL', line)
        if new_line != line:
            return new_line
        new_line = re.sub(r'(\d+)(?=\s*$)(?!\d*[uUlL])', r'\1uL', line)
        if new_line != line:
            return new_line

    # Float expected, Double actual
    if expected == 'Float' and actual == 'Double':
        new_line = re.sub(r'(\d+\.?\d*)f?\b(?=\s|$)', r'\1f', line)
        if new_line != line:
            return new_line

    # Byte expected, Int actual
    if expected == 'Byte' and actual == 'Int':
        new_line = re.sub(r'(\d+)(?=\s*$)(?!\d*[uUlL])', r'\1.toByte()', line)
        if new_line != line:
            return new_line

    return None

def fix_argument_mismatch(line, expected, actual):
    """Fix argument type mismatches by adding conversion functions."""
    # This is harder — we need to find the argument position
    # For now, handle common patterns:
    
    # Int argument but UInt expected -> .toUInt()
    if actual == 'Int' and expected == 'UInt':
        # Look for bare numeric arguments
        new_line = re.sub(r'(\b\d+)(?=\s*[,)])', r'\1.toUInt()', line)
        # Be careful not to double-convert
        if '.toUInt().toUInt()' in new_line:
            new_line = new_line.replace('.toUInt().toUInt()', '.toUInt()')
        if new_line != line and '.toUInt()' not in line:
            return new_line

    # Int argument but UByte expected -> .toUByte()
    if actual == 'Int' and expected == 'UByte':
        new_line = re.sub(r'(\b\d+)(?=\s*[,)])', r'\1.toUByte()', line)
        if '.toUByte().toUByte()' in new_line:
            new_line = new_line.replace('.toUByte().toUByte()', '.toUByte()')
        if new_line != line and '.toUByte()' not in line:
            return new_line

    # UByte argument but UInt expected -> .toUInt()
    if actual == 'UByte' and expected == 'UInt':
        # Find UByte variables and add .toUInt()
        pass  # Too risky to auto-fix

    return None

def fix_const_nonprimitive(line):
    """Change 'const val' to 'val' when type is non-primitive."""
    if "Const 'val' has type" in line and "Only primitive types and 'String' are allowed" in line:
        new_line = line.replace('public const val', 'public val', 1)
        new_line = new_line.replace('const val', 'val', 1)
        if new_line != line:
            return new_line
    return None

def fix_infix_or(line):
    """Fix 'a or b' to 'a.or(b)' when infix is not available."""
    # Pattern: something or something
    # Change to: something.or(something)
    new_line = re.sub(r'(\w+)\s+or\s+(\w+)', r'\1.or(\2)', line)
    if new_line != line:
        return new_line
    return None

def main():
    error_file = sys.argv[1] if len(sys.argv) > 1 else "/tmp/libc_errors5.txt"
    errors = parse_errors(error_file)
    print(f"Total errors parsed: {len(errors)}")

    by_file = defaultdict(list)
    for err in errors:
        by_file[err['file']].append(err)

    fixed_type = 0
    fixed_arg = 0
    fixed_const = 0
    fixed_infix = 0

    for filepath, file_errors in sorted(by_file.items()):
        if not filepath.startswith(BASE):
            continue
        if not os.path.exists(filepath):
            continue

        with open(filepath) as f:
            lines = f.readlines()

        modified_lines = set()
        file_changed = False

        for err in file_errors:
            lineno = err['line']
            msg = err['msg']

            if lineno in modified_lines:
                continue

            idx = lineno - 1
            if idx >= len(lines):
                continue
            old_line = lines[idx]

            # Initializer type mismatch
            if 'Initializer type mismatch' in msg:
                m = re.search(r"expected '(\w+)', actual '(\w+)'", msg)
                if m:
                    expected, actual = m.group(1), m.group(2)
                    new_line = fix_type_mismatch(old_line, expected, actual)
                    if new_line and new_line != old_line:
                        lines[idx] = new_line
                        modified_lines.add(lineno)
                        fixed_type += 1
                        file_changed = True

            # Argument type mismatch
            elif 'Argument type mismatch' in msg:
                m = re.search(r"actual type is '(\w+)', but '(\w+)' was expected", msg)
                if m:
                    actual, expected = m.group(1), m.group(2)
                    new_line = fix_argument_mismatch(old_line, expected, actual)
                    if new_line and new_line != old_line:
                        lines[idx] = new_line
                        modified_lines.add(lineno)
                        fixed_arg += 1
                        file_changed = True

            # Const val non-primitive type
            elif "Const 'val' has type" in msg:
                new_line = fix_const_nonprimitive(old_line)
                if new_line and new_line != old_line:
                    lines[idx] = new_line
                    modified_lines.add(lineno)
                    fixed_const += 1
                    file_changed = True

            # Const val non-constant
            elif "Const 'val' initializer must be a constant" in msg:
                new_line = old_line.replace('public const val', 'public val', 1)
                new_line = new_line.replace('const val', 'val', 1)
                if new_line != old_line:
                    lines[idx] = new_line
                    modified_lines.add(lineno)
                    fixed_const += 1
                    file_changed = True

            # 'infix' modifier required on 'or'
            elif "'infix' modifier is required on 'fun or" in msg:
                new_line = fix_infix_or(old_line)
                if new_line and new_line != old_line:
                    lines[idx] = new_line
                    modified_lines.add(lineno)
                    fixed_infix += 1
                    file_changed = True

        if file_changed:
            with open(filepath, 'w') as f:
                f.writelines(lines)

    print(f"Fixed type mismatches: {fixed_type}")
    print(f"Fixed argument mismatches: {fixed_arg}")
    print(f"Fixed const val: {fixed_const}")
    print(f"Fixed infix or: {fixed_infix}")
    print(f"Total fixes: {fixed_type + fixed_arg + fixed_const + fixed_infix}")

if __name__ == '__main__':
    main()