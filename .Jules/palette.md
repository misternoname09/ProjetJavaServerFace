## 2026-09-25 - Escaping Quotes in JS Confirmation Prompts in JSF
**Learning:** In JSF XHTML attribute values (such as `onclick`), unescaped single quotes within JavaScript single-quoted string literals cause syntax errors and break confirmation prompts. Using phrasing without apostrophes (e.g., "cet étudiant" instead of "l'étudiant") avoids nested string escaping complexities.
**Action:** When adding inline JS confirmation dialogs in XHTML, use string phrasing that avoids internal apostrophes.
