#!/usr/bin/env python3
"""
Fix bulk Kotlin compilation errors in libc-kotlin — pass 2.

Handles:
1. Initializer type mismatch — literal suffix fixes (hex overflow, shl, .inv())
2. Argument type mismatch — same literal fixes for function arguments
3. Array literals outside of annotations — [1,2,3] -> appropriate typeArrayOf(...)
4. 0.inv() -> needs .toULong()/.toUInt() conversion for the target type
5. shl with unsigned literal -> 1.toULong() shl 0
6. const val referencing non-const -> val
7. Conflicting declarations: duplicate val declarations -> keep first, comment rest
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

def fix_hex_overflow(line, expected_type):
    """Fix hex literals that overflow the expected type.
    
    0x80000000 is Long in Kotlin. For CInt (Int), it should be written as
    a negative decimal or use .toInt().
    """
    if expected_type == 'Int':
        # 0x80000000 -> needs to be Int. In Kotlin, 0x80000000 is Long.
        # Fix: add .toInt() or use negative decimal
        # Pattern: = 0x[0-9A-Fa-f]{8,}
        def replace_hex(m):
            hex_val = m.group(1)
            try:
                val = int(hex_val, 16)
                if val > 0x7FFFFFFF and val <= 0xFFFFFFFF:
                    # This is a 32-bit value that overflows Int
                    # Convert to signed: val - 2^32 if needed
                    signed = val - 0x100000000 if val > 0x7FFFFFFF else val
                    return str(signed)
                return m.group(0)
            except:
                return m.group(0)
        
        new_line = re.sub(r'0x([0-9A-Fa-f]{8,})\b', replace_hex, line)
        return new_line if new_line != line else None
    return None

def fix_line_for_type(line, expected, actual):
    """Apply various type mismatch fixes to a line."""
    new_line = line

    # Case: 0.inv() -> 0.toLong().inv() or 0.toULong().inv()
    if actual == 'Int' and expected in ('ULong', 'UInt', 'Long'):
        # 0.inv() returns Int, need to convert
        if expected == 'ULong':
            new_line = new_line.replace('0.inv()', '0.toULong().inv()')
        elif expected == 'UInt':
            new_line = new_line.replace('0.inv()', '0.toUInt().inv()')
        elif expected == 'Long':
            new_line = new_line.replace('0.inv()', '0.toLong().inv()')
        if new_line != line:
            return new_line

    # Case: hex literal overflow for Int (0x80000000 -> -2147483648)
    if expected == 'Int' and actual in ('Long', 'BigInteger'):
        fixed = fix_hex_overflow(new_line, 'Int')
        if fixed and fixed != new_line:
            return fixed

    # Case: shl returning wrong type
    # 14 shl 26u -> 14 shl 26 (both Int, OK for UInt target needs .toUInt())
    # 1 shl 0uL -> 1.toULong() shl 0 (for CULong target)
    if 'shl' in new_line:
        if expected == 'ULong' and actual == 'Int':
            # 1 shl 0uL -> 1.toULong() shl 0
            new_line = re.sub(r'(\d+)\s+shl\s+(\d+)uL', r'\1.toULong() shl \2', new_line)
            if new_line != line:
                return new_line
        if expected == 'UInt' and actual == 'Int':
            # 14 shl 26u -> 14.toUInt() shl 26
            new_line = re.sub(r'(\d+)\s+shl\s+(\d+)u\b', r'\1.toUInt() shl \2', new_line)
            if new_line != line:
                return new_line

    # Case: or with wrong types
    # O_DIRECTORY or O_TMPFILE -> both need to be same type
    if ' or ' in new_line:
        if expected == 'CInt' or expected == 'Int':
            # If the result is Int but one operand is ULong, fix the ULong operand
            if 'ULong' in actual or actual == 'Long':
                new_line = re.sub(r'(\d+)uL\b', r'(\1).toInt()', new_line)
                if new_line != line:
                    return new_line

    # Standard literal suffix fixes
    suffix_map = {
        ('Int', 'ULong'): (r'(\d)uL(?=\s|$|,|\))', r'\1'),
        ('Int', 'Long'): (r'(\d)L(?=\s|$|,|\))', r'\1'),
        ('Int', 'UInt'): (r'(\d)u(?=\s|$|,|\))', r'\1'),
        ('ULong', 'Int'): (r'(\d)(?=\s*$)(?!\d*[uUlL])', r'\1uL'),
        ('ULong', 'UInt'): (r'(\d)u(?=\s|$|,|\))', r'\1uL'),
        ('ULong', 'Long'): (r'(\d)L(?=\s|$|,|\))', r'\1uL'),
        ('UInt', 'Int'): (r'(\d)(?=\s*$)(?!\d*[uUlL])', r'\1u'),
        ('UInt', 'ULong'): (r'(\d)uL(?=\s|$|,|\))', r'\1u'),
        ('UInt', 'Long'): (r'(\d)L(?=\s|$|,|\))', r'\1u'),
        ('Long', 'Int'): (r'(\d)(?=\s*$)(?!\d*[uUlL])', r'\1L'),
        ('Long', 'ULong'): (r'(\d)uL(?=\s|$|,|\))', r'\1L'),
        ('Long', 'UInt'): (r'(\d)u(?=\s|$|,|\))', r'\1L'),
        ('UShort', 'Int'): (r'(\d)(?=\s*$)(?!\d*[uUlL])', r'\1u'),
        ('UByte', 'Int'): (r'(\d)(?=\s*$)(?!\d*[uUlL])', r'\1u'),
        ('Byte', 'Int'): None,
        ('Short', 'Int'): None,
    }

    fix = suffix_map.get((expected, actual))
    if fix:
        pattern, replacement = fix
        new_line = re.sub(pattern, replacement, new_line)
        if new_line != line:
            return new_line

    return None

def fix_array_literal(line):
    """Fix [1, 2, 3] array literals to typeArrayOf."""
    # Pattern: VarName = [0, 0, 0, ...] or field = [1, 2, 3]
    m = re.search(r'=\s*\[([0-9,\s]+)\]', line)
    if not m:
        return None
    
    values = m.group(1).strip()
    if not values:
        return None

    # Determine the type — check the variable type or field name
    # For now, use ubyteArrayOf for s6Addr, intArrayOf for others
    # Check if it's s6Addr (UByteArray)
    if 's6Addr' in line:
        return line.replace(m.group(0), '= ubyteArrayOf(' + values + ')')
    
    # Check for PTHREAD_*_INITIALIZER patterns — typically Int or Long arrays
    if 'PTHREAD' in line or 'mtWord' in line or 'cvWord' in line or 'rwWord' in line:
        return line.replace(m.group(0), '= intArrayOf(' + values + ')')
    
    # Default: intArrayOf
    return line.replace(m.group(0), '= intArrayOf(' + values + ')')

def fix_duplicate_declarations(lines, file_errors):
    """Comment out duplicate val/const val declarations in the same file."""
    seen_names = set()
    fixes = 0
    
    # Collect all error line numbers for duplicate declarations
    dup_lines = set()
    for err in file_errors:
        if 'Redeclaration' in err['msg'] or 'Conflicting declarations' in err['msg']:
            dup_lines.add(err['line'])
    
    for idx in range(len(lines)):
        lineno = idx + 1
        if lineno not in dup_lines:
            continue
        
        line = lines[idx]
        # Extract the val/const val name
        m = re.match(r'\s*public\s+(?:const\s+)?val\s+(\w+)', line)
        if not m:
            m = re.match(r'\s*(?:const\s+)?val\s+(\w+)', line)
        if not m:
            continue
        
        name = m.group(1)
        if name in seen_names:
            # Comment out the duplicate
            lines[idx] = '// DUPLICATE: ' + line
            fixes += 1
        else:
            seen_names.add(name)
    
    return fixes

def main():
    error_file = sys.argv[1] if len(sys.argv) > 1 else "/tmp/libc_errors2.txt"
    errors = parse_errors(error_file)
    print(f"Total errors parsed: {len(errors)}")

    by_file = defaultdict(list)
    for err in errors:
        by_file[err['file']].append(err)

    fixed_type = 0
    fixed_array = 0
    fixed_const = 0
    fixed_dup = 0

    for filepath, file_errors in sorted(by_file.items()):
        if not filepath.startswith(BASE):
            continue
        if not os.path.exists(filepath):
            continue

        with open(filepath) as f:
            lines = f.readlines()

        modified_lines = set()
        file_changed = False

        # First pass: fix type mismatches and array literals
        file_errors.sort(key=lambda e: e['line'])
        for err in file_errors:
            lineno = err['line']
            msg = err['msg']

            if lineno in modified_lines:
                continue

            if 'Initializer type mismatch' in msg or 'Argument type mismatch' in msg:
                m = re.search(r"expected '(\w+)'[,.]\s*(?:actual|but).*?'(\w+)'", msg)
                if not m:
                    m = re.search(r"actual type is '(\w+)', but '(\w+)' was expected", msg)
                    if m:
                        actual, expected = m.group(1), m.group(2)
                    else:
                        continue
                else:
                    expected, actual = m.group(1), m.group(2)

                idx = lineno - 1
                if idx >= len(lines):
                    continue
                old_line = lines[idx]
                new_line = fix_line_for_type(old_line, expected, actual)
                if new_line and new_line != old_line:
                    lines[idx] = new_line
                    modified_lines.add(lineno)
                    fixed_type += 1
                    file_changed = True

            elif "Array literals outside of annotations" in msg or "collection literals" in msg:
                idx = lineno - 1
                if idx >= len(lines):
                    continue
                old_line = lines[idx]
                new_line = fix_array_literal(old_line)
                if new_line and new_line != old_line:
                    lines[idx] = new_line
                    modified_lines.add(lineno)
                    fixed_array += 1
                    file_changed = True

            elif "Const 'val' initializer must be a constant" in msg or "must be initialized" in msg:
                idx = lineno - 1
                if idx >= len(lines):
                    continue
                old_line = lines[idx]
                new_line = old_line.replace('public const val', 'public val', 1)
                new_line = new_line.replace('const val', 'val', 1)
                if new_line != old_line:
                    lines[idx] = new_line
                    modified_lines.add(lineno)
                    fixed_const += 1
                    file_changed = True

        # Second pass: fix duplicate declarations
        dup_fixes = fix_duplicate_declarations(lines, file_errors)
        if dup_fixes > 0:
            fixed_dup += dup_fixes
            file_changed = True

        if file_changed:
            with open(filepath, 'w') as f:
                f.writelines(lines)

    print(f"Fixed type mismatches: {fixed_type}")
    print(f"Fixed array literals: {fixed_array}")
    print(f"Fixed const val non-constant: {fixed_const}")
    print(f"Fixed duplicate declarations: {fixed_dup}")
    print(f"Total fixes applied: {fixed_type + fixed_array + fixed_const + fixed_dup}")

if __name__ == '__main__':
    main()