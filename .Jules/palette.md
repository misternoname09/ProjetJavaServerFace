## 2026-07-13 - Functional Bugs as UX Blockers
**Learning:** In legacy JSF applications, basic functional errors like variable mismatches or case-sensitive method reference errors (e.g., 'addEtudiant' vs 'AddEtudiant') are frequent and render the UI unusable, making them the highest priority 'micro-UX' fixes before layering accessibility.
**Action:** Always verify backing bean method casing and entity property names against the Java source before applying JSF refactors.

## 2026-07-13 - Line Ending Sensitivities in Legacy PRs
**Learning:** Legacy projects with CRLF line endings can cause massive, unintended diffs if entire files are normalized to LF, easily exceeding PR line limits.
**Action:** Use surgical 'sed' or targeted search-and-replace that preserves existing line endings when working within strict PR size constraints.
