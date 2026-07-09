## 2026-07-09 - [Micro-UX & Backend Alignment]
**Learning:** In legacy JSF projects, UI-level "bugs" (like incorrect EL variables or malformed tags) are often the biggest blockers to a good UX. However, correcting these requires absolute certainty of the backend API (e.g., method casing like `AddEtudiant` vs `addEtudiant`) to avoid regressions.
**Action:** Always verify backend method declarations and property names before fixing EL expressions. Keep diffs surgical by using concise component attributes (like `headerText`) to stay within size constraints.
