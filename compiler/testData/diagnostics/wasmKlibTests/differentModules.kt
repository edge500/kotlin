// FIR_IDENTICAL

// MODULE: m1
// FILE: f1.kt
@file:Suppress("OPT_IN_USAGE")
package foo
<!EXPORTING_JS_NAME_CLASH!>@JsExport fun bar() = "O"<!>

// MODULE: m2
// FILE: f2.kt
@file:Suppress("OPT_IN_USAGE")
package baz
<!EXPORTING_JS_NAME_CLASH!>@JsExport fun bar() = "K"<!>

