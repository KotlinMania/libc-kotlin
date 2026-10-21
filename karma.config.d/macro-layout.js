// Load the compiled C fixture before Kotlin tests in both browser targets.
const macroFixtureScript = process.env.LIBC_MACRO_LAYOUT_SCRIPT;
if (!macroFixtureScript) throw new Error('LIBC_MACRO_LAYOUT_SCRIPT must identify the compiled C fixture');
config.files.unshift({ pattern: macroFixtureScript, included: true, watched: false });
