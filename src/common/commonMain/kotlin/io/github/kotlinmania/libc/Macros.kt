// port-lint: source macros.rs
package io.github.kotlinmania.libc

private const val CFG_IF_TEMPLATE: String = "cfgIf {@ items(); \$(((\$(\$meta),*)(\$(\$it)*)), )*(()(\$(\$it2)*)), }"

private const val CFG_IF_TEMPLATE_1: String = "cfgIf {@ items(); ((\$(\$iMet),*)(\$(\$iIt)*)), \$(((\$(\$eMet),*)(\$(\$eIt)*)), )*(()()), }"

private const val CFG_IF_TEMPLATE_3: String = "cfgIf {@ apply cfg(all(\$(\$m, )* not(any(\$(\$not),*)))), \$(\$it)*} cfgIf {@ items(\$(\$not, )*\$(\$m, )*); \$(\$rest)*}"

private const val CFG_IF_TEMPLATE_4: String = "\$(\$it)*"

private const val PRELUDE_TEMPLATE: String = "mod types; mod prelude {public(crate) import core.clone.Clone; public(crate) import core.default.Default; public(crate) import core.marker. {Copy, Send, Sync, }; public(crate) import core.option.Option; public(crate) import core.prelude.v1.derive; public(crate) import core. {cfg, fmt, hash, iter, mem, ptr, }; public(crate) import fmt.Debug; public(crate) import mem. {alignOf, alignOfVal, sizeOf, sizeOfVal, }; public(crate) import crate.types. {CEnumRepr, Padding, }; public(crate) import crate. {cChar, cDouble, cFloat, cInt, cLong, cLonglong, cShort, cUchar, cUint, cUlong, cUlonglong, cUshort, cVoid, intptrT, sizeT, ssizeT, uintptrT, }; }"

private const val S_TEMPLATE: String = "\$(s(it:\$()* \$pub \$t \$i {\$(\$field)*}); )*"

private const val S_TEMPLATE_1: String = "compileError(\"unions cannot derive extra traits, use s_no_extra_traits instead\");"

private const val S_TEMPLATE_2: String = "\$()* \$pub class \$i {\$(\$field)*}"

private const val S_PAREN_TEMPLATE: String = "\$(\$()* \$pub class \$i(\$(\$field)*); )*"

private const val S_NO_EXTRA_TRAITS_TEMPLATE: String = "\$(sNoExtraTraits(it:\$()* \$pub \$t \$i {\$(\$field)*}); )*"

private const val S_NO_EXTRA_TRAITS_TEMPLATE_1: String = "\$()* \$pub union \$i {\$(\$field)*} class.core.fmt.Debug forLoop \$i {fun fmt(& this, f:& var.core.fmt.Formatter<>)->.core.fmt.Result {f.debugStruct(.core.stringify(\$i)).finishNonExhaustive()}}"

private const val S_NO_EXTRA_TRAITS_TEMPLATE_2: String = "\$()* \$pub class \$i {\$(\$field)*}"

private const val EXTERN_TY_TEMPLATE: String = "\$(\$()* public sealed class \$i {})*"

private const val E_TEMPLATE: String = "\$(\$()* public sealed class \$i {\$(\$field)*})*"

private const val C_ENUM_TEMPLATE: String = "\$(cEnum(@ single; \$()? public sealed class\$(\$tyName)?\$(# \$anon)? {\$(\$vis \$variant\$(= \$value)?, )+}); )+"

private const val C_ENUM_TEMPLATE_1: String = "public type \$tyName= cEnum(@ ty\$(\$repr)?); cEnum {@ variant; ty: \$tyName; default: 0; variants:[\$(\$vis \$variant\$(= \$value)?, )+]}"

private const val C_ENUM_TEMPLATE_2: String = "cEnum {@ variant; ty: cEnum(@ ty\$(\$repr)?); default: 0; variants:[\$(\$vis \$variant\$(= \$value)?, )+]}"

private const val C_ENUM_TEMPLATE_4: String = "\$vis const \$variant: \$tyName= {val r= \$defaultVal; \$(val r= \$value; )? r}; cEnum {@ variant; ty: \$tyName; default: \$variant+ 1; variants:[\$(\$tail)*]}"

private const val C_ENUM_TEMPLATE_5: String = "\$repr"

private const val C_ENUM_TEMPLATE_6: String = "prelude.CEnumRepr"

private const val F_TEMPLATE: String = "\$(\$()* public\$(unsafe extern \"C\" fun \$i)?\$(const unsafe extern \"C\" fun \$constI)?(\$(\$arg: \$argty),*)-> \$ret \$body)+"

private const val SAFE_F_TEMPLATE: String = "\$(\$()* public\$(extern \"C\" fun \$i)?\$(const extern \"C\" fun \$constI)?(\$(\$arg: \$argty),*)-> \$ret \$body)+"

private const val DEPRECATED_MACH_TEMPLATE: String = "public const \$id: \$ty= \$expr;"

private const val DEPRECATED_MACH_TEMPLATE_1: String = "\$(deprecatedMach(public const \$id: \$ty= \$expr; ); )*"

private const val DEPRECATED_MACH_TEMPLATE_2: String = "public type \$id= \$ty;"

private const val DEPRECATED_MACH_TEMPLATE_3: String = "\$(deprecatedMach(public type \$id= \$ty; ); )*"

private const val OFFSET_OF_TEMPLATE: String = "{val \$ty {\$field: unused, ..}; val data= core.mem.MaybeUninit.< \$ty>.uninit(); val ptr= data.asPtr(); val fptr= unsafe {core.ptr.addrOf((* ptr). \$field)}; val off=(fptr asTarget usize).checkedSub(ptr asTarget usize).unwrap(); core.assert(off<= core.mem.sizeOf.< \$ty>()); off}"

/**
 * A macro for defining @cfg if-else statements.
 *
 * This is similar to the `if / elif` C preprocessor macro by allowing definition
 * of a cascade of `@cfg` cases, emitting the implementation which matches
 * first.
 *
 * This allows you to conveniently provide a long list @cfg'd blocks of code
 * without having to rewrite each clause multiple times.
 */

internal fun cfgIf(meta: String = "", it: String = "", it2: String = "", iMet: String = "", iIt: String = "", eMet: String = "", eIt: String = "", not: String = "", m: String = "", rest: String = "", clause: String = ""): String =
    when {
        clause == "elseBranch" && meta.isNotEmpty() && it.isNotEmpty() && it2.isNotEmpty() -> CFG_IF_TEMPLATE.replace("\$meta", meta).replace("\$it", it).replace("\$it2", it2)
        clause == "ifBranch #" && iMet.isNotEmpty() && iIt.isNotEmpty() && eMet.isNotEmpty() && eIt.isNotEmpty() -> CFG_IF_TEMPLATE_1.replace("\$iMet", iMet).replace("\$iIt", iIt).replace("\$eMet", eMet).replace("\$eIt", eIt)
        clause == "@ items" && not.isNotEmpty() -> ""
        clause == "@ items" && not.isNotEmpty() && m.isNotEmpty() && it.isNotEmpty() && rest.isNotEmpty() -> CFG_IF_TEMPLATE_3.replace("\$not", not).replace("\$m", m).replace("\$it", it).replace("\$rest", rest)
        clause == "@ apply" && m.isNotEmpty() && it.isNotEmpty() -> CFG_IF_TEMPLATE_4.replace("\$it", it)
        else -> ""
    }

/**
 * Create an internal crate prelude with `core` reexports and common types.
 */

internal fun prelude(): String =
    PRELUDE_TEMPLATE

/**
 * Implement `Clone`, `Copy`, and `Debug` for one or more structs, as well as `PartialEq`, `Eq`,
 * and `Hash` if the `extraTraits` feature is enabled.
 *
 * Also mark the type with `repr(C)`.
 *
 * Use [sNoExtraTraits] for structs where the `extraTraits` feature does not
 * make sense, and for unions.
 */

internal fun s(attr: String = "", pub: String = "", t: String = "", i: String = "", field: String = "", clause: String = ""): String =
    when {
        attr.isNotEmpty() && pub.isNotEmpty() && t.isNotEmpty() && i.isNotEmpty() && field.isNotEmpty() -> S_TEMPLATE.replace("\$pub", pub).replace("\$t", t).replace("\$i", i).replace("\$field", field)
        clause == "it union" && attr.isNotEmpty() && pub.isNotEmpty() && i.isNotEmpty() && field.isNotEmpty() -> S_TEMPLATE_1
        clause == "it class" && attr.isNotEmpty() && pub.isNotEmpty() && i.isNotEmpty() && field.isNotEmpty() -> S_TEMPLATE_2.replace("\$pub", pub).replace("\$i", i).replace("\$field", field)
        else -> ""
    }

/**
 * Implement `Clone`, `Copy`, and `Debug` for a tuple struct, as well as `PartialEq`, `Eq`,
 * and `Hash` if the `extraTraits` feature is enabled.
 *
 * Unlike `s !`, this does *not* mark the type with `repr(C)`. Users should provide their own
 * `repr` attribute via `$ attr` as necessary.
 */

internal fun sParen(attr: String = "", pub: String = "", i: String = "", field: String = ""): String =
    if (attr.isEmpty()) {
        S_PAREN_TEMPLATE.replace("\$pub", pub).replace("\$i", i).replace("\$field", field)
    } else {
        S_PAREN_TEMPLATE.replace("\$pub", pub).replace("\$i", i).replace("\$field", field)
    }

/**
 * Implement `Clone`, `Copy`, and `Debug` for one or more structs/unions, but exclude `PartialEq`,
 * `Eq`, and `Hash`.
 *
 * Also mark the type with `repr(C)`.
 *
 * Most structs will prefer to use [s].
 */

internal fun sNoExtraTraits(attr: String = "", pub: String = "", t: String = "", i: String = "", field: String = "", clause: String = ""): String =
    when {
        attr.isNotEmpty() && pub.isNotEmpty() && t.isNotEmpty() && i.isNotEmpty() && field.isNotEmpty() -> S_NO_EXTRA_TRAITS_TEMPLATE.replace("\$pub", pub).replace("\$t", t).replace("\$i", i).replace("\$field", field)
        clause == "it union" && attr.isNotEmpty() && pub.isNotEmpty() && i.isNotEmpty() && field.isNotEmpty() -> S_NO_EXTRA_TRAITS_TEMPLATE_1.replace("\$pub", pub).replace("\$i", i).replace("\$field", field)
        clause == "it class" && attr.isNotEmpty() && pub.isNotEmpty() && i.isNotEmpty() && field.isNotEmpty() -> S_NO_EXTRA_TRAITS_TEMPLATE_2.replace("\$pub", pub).replace("\$i", i).replace("\$field", field)
        else -> ""
    }

/**
 * Create an uninhabited type that can't be constructed. It implements `Debug`, `Clone`,
 * and `Copy`, but these aren't meaningful for extern types so they should eventually
 * be removed.
 *
 * Really what we want here is something that also can't be named without indirection (in
 * ADTs or function signatures), but this doesn't exist.
 */

internal fun externTy(attr: String = "", i: String = ""): String =
    if (attr.isEmpty()) {
        EXTERN_TY_TEMPLATE.replace("\$i", i)
    } else {
        EXTERN_TY_TEMPLATE.replace("\$i", i)
    }

/**
 * Implement `Clone` and `Copy` for an enum, as well as `Debug`, `Eq`, `Hash`, and
 * `PartialEq` if the `extraTraits` feature is enabled.
 */

internal fun e(attr: String = "", i: String = "", field: String = ""): String =
    if (attr.isEmpty()) {
        E_TEMPLATE.replace("\$i", i).replace("\$field", field)
    } else {
        E_TEMPLATE.replace("\$i", i).replace("\$field", field)
    }

/**
 * Represent a C enum as Rust constants and a type.
 *
 * C enums can't soundly be mapped to Rust enums since C enums are allowed to have duplicates or
 * unlisted values, but this is UB in Rust. This enum doesn't implement any traits, its main
 * purpose is to calculate the correct enum values.
 *
 * Use the magic name `# anon` if the C enum doesn't create a type.
 *
 * See <https://github.com/rust-lang/libc/issues/4419> for more.
 */

internal fun cEnum(repr: String = "", tyName: String = "", anon: String = "", vis: String = "", variant: String = "", value: String = "", tyNameArg: String = "", idx: String = "", defaultVal: String = "", tail: String = "", clause: String = ""): String =
    when {
        repr.isNotEmpty() && tyName.isNotEmpty() && anon.isNotEmpty() && vis.isNotEmpty() && variant.isNotEmpty() && value.isNotEmpty() -> C_ENUM_TEMPLATE.replace("\$tyName", tyName).replace("\$anon", anon).replace("\$vis", vis).replace("\$variant", variant).replace("\$value", value)
        clause == "@ single public sealed class" && repr.isNotEmpty() && tyName.isNotEmpty() && vis.isNotEmpty() && variant.isNotEmpty() && value.isNotEmpty() -> C_ENUM_TEMPLATE_1.replace("\$repr", repr).replace("\$tyName", tyName).replace("\$vis", vis).replace("\$variant", variant).replace("\$value", value)
        clause == "@ single public sealed class @anon" && repr.isNotEmpty() && vis.isNotEmpty() && variant.isNotEmpty() && value.isNotEmpty() -> C_ENUM_TEMPLATE_2.replace("\$repr", repr).replace("\$vis", vis).replace("\$variant", variant).replace("\$value", value)
        clause == "@ variant ty default variants" && tyNameArg.isNotEmpty() && idx.isNotEmpty() -> ""
        clause == "@ variant ty default variants" && tyName.isNotEmpty() && defaultVal.isNotEmpty() && vis.isNotEmpty() && variant.isNotEmpty() && value.isNotEmpty() && tail.isNotEmpty() -> C_ENUM_TEMPLATE_4.replace("\$tyName", tyName).replace("\$defaultVal", defaultVal).replace("\$vis", vis).replace("\$variant", variant).replace("\$value", value).replace("\$tail", tail)
        clause == "@ ty" && repr.isNotEmpty() -> C_ENUM_TEMPLATE_5.replace("\$repr", repr)
        clause == "@ ty" -> C_ENUM_TEMPLATE_6
        else -> ""
    }

/**
 * Define a `unchecked` function.
 */

internal fun f(attr: String = "", i: String = "", constI: String = "", arg: String = "", argty: String = "", ret: String = "", body: String = ""): String =
    if (attr.isEmpty()) {
        F_TEMPLATE.replace("\$i", i).replace("\$constI", constI).replace("\$arg", arg).replace("\$argty", argty).replace("\$ret", ret).replace("\$body", body)
    } else {
        F_TEMPLATE.replace("\$i", i).replace("\$constI", constI).replace("\$arg", arg).replace("\$argty", argty).replace("\$ret", ret).replace("\$body", body)
    }

/**
 * Define a safe function.
 */

internal fun safeF(attr: String = "", i: String = "", constI: String = "", arg: String = "", argty: String = "", ret: String = "", body: String = ""): String =
    if (attr.isEmpty()) {
        SAFE_F_TEMPLATE.replace("\$i", i).replace("\$constI", constI).replace("\$arg", arg).replace("\$argty", argty).replace("\$ret", ret).replace("\$body", body)
    } else {
        SAFE_F_TEMPLATE.replace("\$i", i).replace("\$constI", constI).replace("\$arg", arg).replace("\$argty", argty).replace("\$ret", ret).replace("\$body", body)
    }

internal fun deprecatedMach(id: String = "", ty: String = "", expr: String = "", clause: String = ""): String =
    when {
        clause == "public const =" && id.isNotEmpty() && ty.isNotEmpty() && expr.isNotEmpty() -> DEPRECATED_MACH_TEMPLATE.replace("\$id", id).replace("\$ty", ty).replace("\$expr", expr)
        id.isNotEmpty() && ty.isNotEmpty() && expr.isNotEmpty() -> DEPRECATED_MACH_TEMPLATE_1.replace("\$id", id).replace("\$ty", ty).replace("\$expr", expr)
        clause == "public type =" && id.isNotEmpty() && ty.isNotEmpty() -> DEPRECATED_MACH_TEMPLATE_2.replace("\$id", id).replace("\$ty", ty)
        id.isNotEmpty() && ty.isNotEmpty() -> DEPRECATED_MACH_TEMPLATE_3.replace("\$id", id).replace("\$ty", ty)
        else -> ""
    }

/**
 * Polyfill for std's `offsetOf`.
 */

internal fun offsetOf(ty: String = "", field: String = ""): String =
    OFFSET_OF_TEMPLATE.replace("\$ty", ty).replace("\$field", field)
