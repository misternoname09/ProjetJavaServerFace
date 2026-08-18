## 2026-08-18 - Single-quote escaping in JS inline handlers inside JSF/XHTML attributes
**Learning:** Single quotes inside inline JavaScript strings within JSF/XHTML XML attribute values (such as `onclick="confirm('...')"` ) break JavaScript parsing if unescaped, and XML attribute escaping (`\'` or `&apos;`) can be problematic. Using French phrasing without single apostrophes (e.g. `cet étudiant` instead of `l'étudiant`) avoids syntax errors entirely.
**Action:** Always avoid unescaped single quotes inside inline JS string literals within XHTML attribute values.
