## 2026-06-28 - [Legacy JSF Form Modernization]
**Learning:** In legacy JSF projects, UI code often contains non-standard tags (like `<h.form>`), broken EL references, and unescaped JavaScript in event handlers. These functional bugs are often the biggest blockers to a good UX.
**Action:** Prioritize fixing functional regressions (variable mismatches, case-sensitive method names) alongside accessibility improvements (ARIA, labels) to ensure the "micro-UX" improvement actually works.
