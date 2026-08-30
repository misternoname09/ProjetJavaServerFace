## 2026-08-30 - Fix JavaScript Syntax Error in Inline `onclick` Confirm Dialogs
**Learning:** Single quotes inside JavaScript `confirm()` dialogs within XHTML `onclick` attributes cause syntax errors when unescaped. Using phrasing like "cet étudiant" avoids escaping issues while providing clearer confirmation dialogs.
**Action:** Always check inline JS in XHTML attributes for single-quote escaping issues and choose phrasing that avoids single quotes or properly escape them.
